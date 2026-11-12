package ec.edu.uce.pa.grupo.intercveptores;

import ec.edu.uce.pa.grupo.util.Pedido;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@Medir 
@Priority (Interceptor.Priority.APPLICATION)
public class MedirInterceptor {

    @AroundInvoke 
    public Object medirTiempo(InvocationContext context)throws Exception{
        long init = System.currentTimeMillis();
        Object resultado = context.proceed();


        Object []parametros = context.getParameters();
        Pedido valorP = (Pedido) parametros[0];
        long fin = System.currentTimeMillis();


        System.err.println("DURACION: "+ valorP.getCodigo() +" |MS: "+ (fin-init));
        System.out.println("TIEMPO: " + valorP.getCodigo() + "|OK");
        return resultado;
    }

}
