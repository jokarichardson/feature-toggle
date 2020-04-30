package com.richardson.featuretoggle.utilities.converter;

import com.richardson.featuretoggle.model.dto.PostTesteDTO;
import com.richardson.featuretoggle.model.entity.PostTeste;


public class PostTesteConverter {
	
	public static PostTesteDTO toPostTesteDTO(PostTeste postTeste) {
		
		PostTesteDTO postTesteDTO = PostTesteDTO.builder()
				.nome(postTeste.getNome())
				.build();
		
		return postTesteDTO;
	}
	
	public static PostTeste fromPostTesteDTO(PostTesteDTO postTesteDTO) {
		return PostTeste.builder()
				.nome(postTesteDTO.getNome())
				.build();		
	}
}
