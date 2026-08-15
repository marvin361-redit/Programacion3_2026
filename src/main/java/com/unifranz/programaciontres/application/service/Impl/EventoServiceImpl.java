package com.unifranz.programaciontres.application.service.Impl;

import com.unifranz.programaciontres.application.service.eventoService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EventoServiceImpl  implements eventoService {

    @Override
    public Map<String, Object>  validarAcceso (int edad, boolean pago){
       boolean puedeEntrar;
       String motivo;
       if (edad < 18){
           puedeEntrar = false;
           motivo = "menor de edad";
       } else if (!pago) {
           puedeEntrar = false;
           motivo = "no pago";
       } else {
           puedeEntrar = true;
           motivo = "permitido";
       }

       Map<String, Object> salida = new HashMap<>();
       salida.put("puedeEntrar", puedeEntrar);
       salida.put("motivo", motivo);
       return salida;
    }
}
