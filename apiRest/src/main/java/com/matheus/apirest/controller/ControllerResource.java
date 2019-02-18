package com.matheus.apirest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.apirest.model.Model;
 
@RestController
public class ControllerResource {
 
  private Map<Integer, Model> Models;
 
  public ControllerResource() {
    Models = new HashMap<Integer, Model>();
 
    Model c1 = new Model(1, "Rest", "24hs");
    Model c2 = new Model(2, "Spring", "24hs");
    Model c3 = new Model(3, "Desenvolvimento", "60hs");
    Model c4 = new Model(4, null, null);
    Model c5 = new Model(5, "Spring", "24hs");
    Model c6 = new Model(6, "Desenvolvimento", "60hs");
    Model c7 = new Model(7, "Rest", "24hs");
    Model c8 = new Model(8, "Spring", "24hs");
    Model c9 = new Model(9, null, null);
    Model c10 = new Model(10, "Desenvolvimento", "60hs");
    Model c11 = new Model(11, "Rest", "24hs");
    Model c12 = new Model(12, "Spring", "24hs");
    Model c13 = new Model(13, null, null);
    Model c14 = new Model(14, "Desenvolvimento", "60hs");
    Model c15 = new Model(15, "Rest", "24hs");
    Model c16 = new Model(16, "Spring", "24hs");
    Model c17 = new Model(null, null, null);
    Model c18 = new Model(17, "Desenvolvimento", "60hs");
    Model c19 = new Model(18 "Rest", "24hs");
    Model c20 = new Model(19"Spring", "24hs");
    Model c21 = new Model(null, null, null);
    Model c22 = new Model(20"Rest", "24hs");
    Model c23 = new Model(21 "Spring", "24hs");
    
    Models.put(1, c1);
    Models.put(2, c2);
    Models.put(3, c3);
    Models.put(4, c4);
    Models.put(5, c5);
    Models.put(6, c6);
    Models.put(7, c7);
    Models.put(8, c8);
    Models.put(9, c9);
    Models.put(10, c10);
    Models.put(11, c11);
    Models.put(12, c12);
    Models.put(13, c13);
    Models.put(14, c14);
    Models.put(15, c15);
    Models.put(16, c16);
    Models.put(17, c17);
    Models.put(18, c18);
    Models.put(19, c19);
    Models.put(20, c20);
    Models.put(21, c21);
    Models.put(22, c22);
    Models.put(23, c23);
    Models.put(3, c24);

  }
 
  @RequestMapping(value = "/models", method = RequestMethod.GET)
  public ResponseEntity<List<Model>> listar() {
    return new ResponseEntity<List<Model>>(new ArrayList<Model>(Models.values()), HttpStatus.OK);
  }
  
  @RequestMapping(value = "/models/{id}", method = RequestMethod.GET)
  public ResponseEntity<Model> buscar(@PathVariable("id") Integer id) {
    Model model = Models.get(id);
   
    if (model == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
   
    return new ResponseEntity<Model>(model, HttpStatus.OK);
  }
  
  @RequestMapping(value = "/models/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deletar(@PathVariable("id") int id) {
    Model model = Models.remove(id);
   
    if (model == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
   
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
 
}
