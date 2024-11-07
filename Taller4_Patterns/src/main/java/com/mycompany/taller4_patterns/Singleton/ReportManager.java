package com.mycompany.taller4_patterns.Singleton;

public class ReportManager {
    private ReportManager instancia;

    
    public ReportManager(ReportManager instancia) {
        this.instancia = instancia;
    }


    public ReportManager getInstancia() {
        return instancia;
    }

    public void sendNotification(){
        System.out.println("se envia una notificacion");
    }
}
