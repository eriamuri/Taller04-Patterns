package com.mycompany.taller4_patterns;

public class ColorDecorator extends InformeDecorator {
    public ColorDecorator(Informe informe){
        super(informe);
    }

    @Override
    public void generate(){
        System.out.println("Color aplicado!");
    }
}
