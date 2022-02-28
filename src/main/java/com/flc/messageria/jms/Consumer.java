package com.flc.messageria.jms;


import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;


//import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flc.messageria.model.Person;
import com.flc.messageria.repositories.PersonRepository;
import com.google.gson.Gson;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RequiredArgsConstructor
@Component
public class Consumer {

    private List<Person> persons = new ArrayList<>();
   
    @Autowired
    PersonRepository personRepository;

    @JmsListener( destination = "${activemq.name}" )
    public void listen(String mensagem) {
        System.out.println(mensagem);
        Person person = new Person();
        try {
         Gson gson = new Gson();
         person = gson.fromJson(mensagem, Person.class);
         personRepository.save(person);
      }catch(Exception e){

      }
        
    }      
	
}
