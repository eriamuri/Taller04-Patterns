/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatrónAdapter;

import PatrónAdapter.Telegram;
import PatrónAdapter.Notificacion;

/**
 *
 * @author ricky
 */
public class TelegramAdapter implements Notificacion {
    private Telegram telegram;
    
    public TelegramAdapter(Telegram telegram){
        this.telegram = telegram;
    }

    @Override
    public void enviarReporte(String reporte) {
       telegram.notificar(reporte);
    }
    
}
