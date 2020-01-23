package com.nmemo.prueba.spring.controller;

import com.nmemo.prueba.spring.service.interfaces.IOperacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para la interacción con el usuario
 */
@RestController
public class OperacionController {

    @Autowired
    private IOperacionService iOperacionService;


    @GetMapping("/saludar/{msg}")
    public String saludar(@PathVariable String msg){

        String mensaje = "Hola " + msg;

        return mensaje;
    }

    @GetMapping("/sumar/{op1}/{op2}")
    public String sumar(@PathVariable Double op1, @PathVariable Double op2){

        return "El resultado de sumar " + op1 + " + " + op2 + " = " + iOperacionService.Sumar(op1,op2);

    }

    @GetMapping("/restar/{op1}/{op2}")
    public String restar(@PathVariable Double op1, @PathVariable Double op2){

        return "El resultado de restar " + op1 + " - " + op2 + " = " + iOperacionService.Restar(op1,op2);

    }

    @GetMapping("/multiplicar/{op1}/{op2}")
    public String multiplicar(@PathVariable Double op1, @PathVariable Double op2){

        return "El resultado de multiplicar " + op1 + " * " + op2 + " = " + iOperacionService.Multiplicar(op1,op2);

    }

}
