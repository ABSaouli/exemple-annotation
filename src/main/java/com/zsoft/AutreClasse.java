package com.zsoft;

import com.zsoft.annotation.MonAnnotation;

@MonAnnotation
public class AutreClasse {

    @MonAnnotation(value = "maValeur1", autreParamDeAnnotation = 1)
    int monField1;

    @MonAnnotation(value = "maValeur2", autreParamDeAnnotation = 2)
    int monField2;

    @MonAnnotation(value = "batata", autreParamDeAnnotation = 456)
    public static void batata(@MonAnnotation(value = "annontation de param", autreParamDeAnnotation = 12)  String[] args) {

    }
}
