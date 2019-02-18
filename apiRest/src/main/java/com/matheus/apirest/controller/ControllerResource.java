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
    Model c16 = new Model(13, "Spring", "24hs");
    Model c17 = new Model(null, null, null);
    Model c18 = new Model(3, "Desenvolvimento", "60hs");
    Model c19 = new Model(1, "Rest", "24hs");
    Model c20 = new Model(21, "Spring", "24hs");
    Model c21 = new Model(null, null, null);
    Model c22 = new Model(1, "Rest", "24hs");
    Model c23 = new Model(2, "Spring", "24hs");
    Model c24 = new Model(3, "Desenvolvimento", "60hs");
    Model c25 = new Model(1, "Rest", "24hs");
    Model c26 = new Model(2, "Spring", "24hs");
    Model c27 = new Model(3, "Desenvolvimento", "60hs");
    Model c28 = new Model(1, "Rest", "24hs");
    Model c29 = new Model(2, "Spring", "24hs");
    Model c30 = new Model(null, null, null);
    Model c31 = new Model(3, "Desenvolvimento", "60hs");
    Model c32 = new Model(1, "Rest", "24hs");
    Model c33 = new Model(2, "Spring", "24hs");
    Model c34 = new Model(null, null, null);
    Model c35 = new Model(3, "Desenvolvimento", "60hs");
    Model c36 = new Model(1, "Rest", "24hs");
    Model c37 = new Model(2, "Spring", "24hs");
    Model c38 = new Model(null, null, null);
    Model c39 = new Model(3, "Desenvolvimento", "60hs");
    Model c40 = new Model(1, "Rest", "24hs");
    Model c41 = new Model(21, "Spring", "24hs");
    Model c42 = new Model(null, null, null);
    Model c43 = new Model(1, "Rest", "24hs");
    Model c44 = new Model(2, "Spring", "24hs");
    Model c45 = new Model(3, "Desenvolvimento", "60hs");
    Model c46 = new Model(1, "Rest", "24hs");
    Model c47 = new Model(2, "Spring", "24hs");
    Model c48 = new Model(3, "Desenvolvimento", "60hs");
    Model c49 = new Model(1, "Rest", "24hs");
    Model c50 = new Model(2, "Spring", "24hs");
    Model c51 = new Model(null, null, null);
    Model c52 = new Model(3, "Desenvolvimento", "60hs");
    Model c53 = new Model(1, "Rest", "24hs");
    Model c54 = new Model(2, "Spring", "24hs");
    Model c55 = new Model(null, null, null);
    Model c56 = new Model(3, "Desenvolvimento", "60hs");
    Model c57 = new Model(1, "Rest", "24hs");
    Model c58 = new Model(2, "Spring", "24hs");
    Model c59 = new Model(null, null, null);
    Model c60 = new Model(3, "Desenvolvimento", "60hs");
    Model c61 = new Model(1, "Rest", "24hs");
    Model c62 = new Model(21, "Spring", "24hs");
    Model c63 = new Model(null, null, null);

    
    
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
    Models.put(24, c25);
    Models.put(25, c26);
    Models.put(26, c27);
    Models.put(27, c28);
    Models.put(28, c29);
    Models.put(29, c30);
    Models.put(31, c31);
    Models.put(32, c32);
    Models.put(33, c33);
    Models.put(34, c34);
    Models.put(35, c35);
    Models.put(36, c36);
    Models.put(37, c37);
    Models.put(38, c38);
    Models.put(39, c39);
    Models.put(47, c40);
    Models.put(48, c41);
    Models.put(49, c42);
    Models.put(51, c43);
    Models.put(52, c44);
    Models.put(53, c45);
    Models.put(54, c46);
    Models.put(55, c47);
    Models.put(56, c48);
    Models.put(57, c49);
    Models.put(58, c50);
    Models.put(69, c51);
    Models.put(61, c52);
    Models.put(62, c53);
    Models.put(63, c54);
    Models.put(64, c55);
    Models.put(58, c56);
    Models.put(96, c57);
    Models.put(99, c58);
    Models.put(76, c59);
    Models.put(79, c60);
    Models.put(77, c61);
    Models.put(78, c62);
    Models.put(79, c63);
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