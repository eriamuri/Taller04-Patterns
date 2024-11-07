/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatrónAdapter;

import PatrónAdapter.WhatsApp;
import PatrónAdapter.Notificacion;

/**
 *
 * @author ricky
 */
public class WhatsAppAdapter implements Notificacion{
    private WhatsApp whatsApp;
    
    public WhatsAppAdapter(WhatsApp whatsApp){
        this.whatsApp = whatsApp;
    
    }

    @Override
    public void enviarReporte(String reporte) {
        whatsApp.enviar(reporte);
    }
        
}
