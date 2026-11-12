package ec.edu.uce.pa.grupo.util;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named ("VIP")
public class ClienteVIP implements TipoCliente{

    @Override
    public Double generar(Pedido pedido) {
        return pedido.getValorOriginal()-(pedido.getValorOriginal()*0.1);
    }

}
