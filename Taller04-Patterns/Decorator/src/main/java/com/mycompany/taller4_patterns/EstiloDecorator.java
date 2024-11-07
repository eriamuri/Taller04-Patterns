package com.mycompany.taller4_patterns;

public class EstiloDecorator extends InformeDecorator {
    public EstiloDecorator(Informe informe){
        super(informe);
    }

    @Override
    public void generate(){
        System.out.println("Estilo aplicado!");
    }
}
