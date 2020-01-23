package com.nmemo.prueba.spring.service.impl;

import com.nmemo.prueba.spring.service.interfaces.IOperacion;

/**
 * Implementación del servicio Operacion
 */
public class OperacionImpl implements IOperacion {

    /**
     * Realizamos la operación matemática de sumar
     * @param operador1 Primer operador de la operación
     * @param operador2 Segundo operador de la operación
     * @return Resultado de la operación
     */
    @Override
    public Double Sumar(Double operador1, Double operador2) {

        return operador1 + operador2;
    }

    /**
     * Realizamos la operación matemática de restar
     * @param operador1 Primer operador de la operación
     * @param operador2 Segundo operador de la operación
     * @return Resultado de la operación
     */
    @Override
    public Double Restar(Double operador1, Double operador2) {

        return operador1 - operador2;
    }

    /**
     * Realizamos la operación matemática de multiplicar
     * @param operador1 Primer operador de la operación
     * @param operador2 Segundo operador de la operación
     * @return Resultado de la operación
     */
    @Override
    public Double Multiplicar(Double operador1, Double operador2) {

        return operador1 * operador2;
    }
}
