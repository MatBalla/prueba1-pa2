package ec.edu.uce.pa.grupo;

import ec.edu.uce.pa.grupo.util.Cliente;
import ec.edu.uce.pa.grupo.util.Pedido;
import ec.edu.uce.pa.grupo.util.PedidoService;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    PedidoService pedidoService;
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        
        System.out.println("INICIO_EVALUACION");

        
        pedidoService.pedido(new Pedido("P001", "Laptop", 1000.0), new Cliente("Juan", "juan@gmail.com"), "vip");
        
        
        pedidoService.pedido(new Pedido("P002", "Mouse", 100.0), new Cliente("Diego", "diego@gmail.com"), "normal");
        
        
        pedidoService.pedido(new Pedido("P003", "Teclado", 200.0), new Cliente("Pato", "pato@gmail.com"), "vip");
        


        System.out.println("FIN_EVALUACION");
        System.out.println("172219-MB");
        return 0;
    }

    

}
