package com.flc.messageria.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Id
	   private int id;
	   
	   @Column(name = "name")
	   private String name;
	   
	   @Column(name = "age")
	   private int age;

	   @Override
	   public String toString() {
	      return "Person{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", age=" + age +
	            '}';
	   }
	
}
