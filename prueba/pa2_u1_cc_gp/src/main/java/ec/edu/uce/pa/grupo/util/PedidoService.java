package ec.edu.uce.pa.grupo.util;

import ec.edu.uce.pa.grupo.intercveptores.Medir;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
public class PedidoService {
    @Inject 
    @Named ("NORMAL")
    ClienteNormal clienteNormal;

    @Inject 
    @Named ("VIP")
    ClienteVIP clienteVIP;

    @Inject 
    EnviarNotificacion enviarNotificacion;

    @Medir 
    public void pedido(Pedido pedido, Cliente cliente, String tipoCliente){
        
        String variable = tipoCliente.toLowerCase();
        if(variable=="vip"){
            System.out.println("PEDIDO: " + pedido.getCodigo() + "|TOTAL: " + clienteVIP.generar(pedido));
            System.out.println(enviarNotificacion.enviar(pedido));
            
        }else{
            System.out.println("PEDIDO: " + pedido.getCodigo() + "|TOTAL: " + clienteNormal.generar(pedido));
            System.out.println(enviarNotificacion.enviar(pedido));
        }
        
    }

}
