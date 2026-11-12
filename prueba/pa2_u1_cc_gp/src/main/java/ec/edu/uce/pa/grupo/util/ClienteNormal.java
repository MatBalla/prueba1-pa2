package ec.edu.uce.pa.grupo.util;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named ("NORMAL")
public class ClienteNormal implements TipoCliente{

    @Override
    public Double generar(Pedido pedido) {
        return pedido.getValorOriginal();
    }

    

}
