package com.richardson.featuretoggle.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:featuretoggle.properties")
@ConfigurationProperties(prefix = "feature")
public class FeatureToggles {
	private Map<String, Boolean> toggles;

	public Map<String, Boolean> getToggles() {
		return toggles;
	}

	public void setToggles(Map<String, Boolean> toggles) {
		this.toggles = toggles;
	}
	
	public Boolean isEnabled(String feature) {
		return this.toggles.getOrDefault(feature, Boolean.FALSE);
	}
	
//	@Bean
//	public FeatureToggles featureToggles() {
//		return this;
//	}
}
