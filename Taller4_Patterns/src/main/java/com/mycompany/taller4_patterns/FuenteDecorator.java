package com.mycompany.taller4_patterns;

public class FuenteDecorator extends InformeDecorator {
    public FuenteDecorator(Informe informe){
        super(informe);
    }

    @Override
    public void generate(){
        System.out.println("Fuente aplicada!");
    }
}
