/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visual.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author ryan
 */
@RestController
public class indexController {
    
   @RequestMapping(value="/", method=RequestMethod.GET) 
   public String getTexto(){
       return "Olá Pessoal";
   }
} 