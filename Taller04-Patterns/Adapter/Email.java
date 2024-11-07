/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatrónAdapter;

/**
 *
 * @author ricky
 */
public class Email implements Notificacion {

    @Override
    public void enviarReporte(String reporte) {
        System.out.println("Enviando el reporte por email:"+ reporte);
    }
    
}
