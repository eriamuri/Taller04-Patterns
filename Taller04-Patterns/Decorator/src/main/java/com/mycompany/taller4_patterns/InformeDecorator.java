package com.mycompany.taller4_patterns;

public abstract class InformeDecorator implements Informe {
    protected Informe informeWrapped;

    public InformeDecorator(Informe informe){
        this.informeWrapped = informe;
    }
    
    @Override
    public void generate(){
        informeWrapped.generate();
    }
}
