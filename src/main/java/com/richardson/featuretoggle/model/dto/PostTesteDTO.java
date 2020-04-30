package com.richardson.featuretoggle.model.dto;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PostTesteDTO {

	private String nome;

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
