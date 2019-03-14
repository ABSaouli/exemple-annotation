package com.zsoft;

import com.zsoft.annotation.MonAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MainZsoft {

    public static void main(String[] args) {
        Annotation[] annotations = AutreClasse.class.getAnnotations();

        printAnnotations(annotations);

        Field[] fields = AutreClasse.class.getDeclaredFields();
        for (Field field : fields) {
            printAnnotations(field.getAnnotations());
        }

        Method[] declaredMethods = AutreClasse.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            printAnnotations(declaredMethod.getAnnotations());
            Parameter[] parameters = declaredMethod.getParameters();
            for (Parameter parameter : parameters) {
                printAnnotations(parameter.getAnnotations());
            }
        }

    }

    private static void printAnnotations(Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            System.out.println(" annontation " +  annotation);
        }
    }
}
