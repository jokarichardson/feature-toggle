package com.richardson.featuretoggle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richardson.featuretoggle.repository.PostTesteRepository;

@Service
public class FeatureToggleService {
	@Autowired
	private PostTesteRepository postTesteRepository;
	
}
