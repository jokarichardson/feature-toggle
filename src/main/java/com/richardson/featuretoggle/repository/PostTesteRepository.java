package com.richardson.featuretoggle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.richardson.featuretoggle.model.entity.PostTeste;

@Repository
public interface PostTesteRepository extends CrudRepository<PostTeste, Integer> {
	
}
