package com.company;

public class Factory {
    public Services getCurrentServices(String input) {
        Services services = null;
        if (input.equals("Диагностика")) {
            services = new Diagnostic();
        } else if (input.equals("Мойка")) {
            services = new Wash();
        } else if (input.equals("Обслуживание")) {
            services = new Maintenance();
        }
        return services;
    }
}

