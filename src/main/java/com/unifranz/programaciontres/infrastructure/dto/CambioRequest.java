package com.unifranz.programaciontres.dto;

public class CambioResponse {
    private Double montoDolares;
    private Double tipoCambio;
    private Double montoBolivianos;

    public CambioResponse(Double montoDolares, Double tipoCambio, Double montoBolivianos) {
        this.montoDolares = montoDolares;
        this.tipoCambio = tipoCambio;
        this.montoBolivianos = montoBolivianos;
    }
}