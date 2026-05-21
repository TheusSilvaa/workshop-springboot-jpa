package com.theussr.backend.workshop_springboot_jpa.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
