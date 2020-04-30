package com.richardson.featuretoggle.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "post_teste")
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PostTeste implements Serializable {
	private static final long serialVersionUID = 1571081156222164352L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
