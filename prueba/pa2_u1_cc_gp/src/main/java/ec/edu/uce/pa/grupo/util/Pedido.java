package ec.edu.uce.pa.grupo.util;


public class Pedido {
    private String codigo;
    private String Producto;
    private Double valorOriginal;

    public Pedido(){
        
    }
    public Pedido(String codigo, String producto, Double valorOriginal) {
        this.codigo = codigo;
        this.Producto = producto;
        this.valorOriginal = valorOriginal;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getProducto() {
        return Producto;
    }
    public void setProducto(String producto) {
        Producto = producto;
    }
    public Double getValorOriginal() {
        return valorOriginal;
    }
    public void setValorOriginal(Double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }


    




}
