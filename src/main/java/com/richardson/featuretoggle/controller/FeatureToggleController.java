package com.richardson.featuretoggle.controller;

import java.text.MessageFormat;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.richardson.featuretoggle.application.FeatureToggleApplication;
import com.richardson.featuretoggle.config.FeatureToggles;
import com.richardson.featuretoggle.config.SwaggerConfig;
import com.richardson.featuretoggle.model.entity.PostTeste;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/featureToggle")
@Validated
@Api(tags = { SwaggerConfig.CONTROLLER_TAG })
public class FeatureToggleController {

	private static final Logger log = LoggerFactory.getLogger(FeatureToggleController.class);

	@Autowired
	private FeatureToggleApplication featureToggleApplication;

	@Autowired
	private FeatureToggles featureToggles;

	@ApiOperation(value = "Teste")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = Iterable.class),
			@ApiResponse(code = 400, message = "Bad request"), @ApiResponse(code = 409, message = "Conflict"),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 500, message = "Failure", response = Exception.class) })
	@GetMapping(value = "/getTeste", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getTeste() {
		log.info("getTeste()");
		try {
			String retorno = new Gson().toJson(MessageFormat.format("Feature get está ativa? {0}",
					this.featureToggles.isEnabled("delete-user")));
			return new ResponseEntity<>(retorno, HttpStatus.OK);
		} catch (Exception ex) {
			log.error("Não foi possível atender essa requisição", ex);
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@ApiOperation(value = "Post Teste")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "Bad request"), @ApiResponse(code = 409, message = "Conflict"),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 500, message = "Failure", response = Exception.class) })
	@PostMapping
	public ResponseEntity<Object> postTeste(@RequestBody @Valid PostTeste postTeste) {
		log.info("postTeste() {}", postTeste.toString());

		try {
			String retorno = new Gson().toJson(MessageFormat.format("Feature create está ativa? {0}",
					this.featureToggles.isEnabled("create")));
			return new ResponseEntity<>(retorno, HttpStatus.CREATED);
		} catch (Exception ex) {
			log.error("Não foi possível atender essa requisição", ex);
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
