package com.unifranz.programaciontres.application.service;

import java.util.Map;

public interface eventoService {
    Map<String, Object> validarAcceso(int edad, boolean pago) ;
}
