package com.ibm.academia.restapi.universidad.excepciones;

public class BadRequestExeption extends RuntimeException {
    public BadRequestExeption(String mensaje) {
        super(mensaje);
    }
}
