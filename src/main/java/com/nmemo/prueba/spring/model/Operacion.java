package com.nmemo.prueba.spring.model;

/**
 * Entidad operación que define la estructura de la operacion a realizar
 */
public class Operacion {

    /**
     * Tipo de operacion a realizado:
     * Suma, Resta, Multiplicacion
     */
    private String tipoOperacion;
    /**
     * Primer operador de la operación
     */
    private Double operando1;
    /**
     * Segundo operador de la operación
     */
    private Double operando2;
    /**
     * Resultado de la operación
     */
    private double resultado;

    /**
     * Constructor con parámetros
     * @param tipoOperacion
     * @param operando1
     * @param operando2
     */
    public Operacion(String tipoOperacion, Double operando1, Double operando2) {
        this.tipoOperacion = tipoOperacion;
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public Double getOperando1() {
        return operando1;
    }

    public void setOperando1(Double operando1) {
        this.operando1 = operando1;
    }

    public Double getOperando2() {
        return operando2;
    }

    public void setOperando2(Double operando2) {
        this.operando2 = operando2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
