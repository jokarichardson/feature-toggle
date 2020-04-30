package com.richardson.featuretoggle.application.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.richardson.featuretoggle.application.FeatureToggleApplication;
import com.richardson.featuretoggle.service.FeatureToggleService;

@Component
public class FeatureToggleApplicationImpl implements FeatureToggleApplication {

	@Autowired
	private FeatureToggleService featureToggleService;	
	
}
