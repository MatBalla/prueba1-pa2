package ec.edu.uce.pa.grupo.util;

import jakarta.inject.Singleton;

@Singleton 
public class EnviarNotificacion implements Notificacion{

    @Override
    public String enviar(Pedido pedido) {
        return "NOTIFICACION:" + pedido.getCodigo();
    }

}
