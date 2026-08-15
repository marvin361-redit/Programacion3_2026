package com.unifranz.programaciontres.dto;

public class CambioRequest {
    private Double monto;
    private Double tipoCambio;

    public CambioRequest() {}

    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
    
}