package com.company;

public class IPriceAbsService implements InteABSServices{

    public Iwash getWash() {
        return new Wash();
    }

    public Idiagnostic getDiagnostic() {
        return new Diagnostic();
    }

    public Maintenance getImaintenance() {
        return new Maintenance();
    }
}
