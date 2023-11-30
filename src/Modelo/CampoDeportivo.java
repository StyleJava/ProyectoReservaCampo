
package Modelo;



public class CampoDeportivo{

 private int idCampo;
    private String nombre;
    private String ubicacion;
    private String descripcion;
    private float precioMinuto;
    private String indicador;

    public CampoDeportivo() {
     
}

    public int getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioMinuto() {
        return precioMinuto;
    }

    public void setPrecioMinuto(float precioMinuto) {
        this.precioMinuto = precioMinuto;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }


       public Object[] RegistroCampoDeportivo(int numeracion){
        Object[] fila={numeracion,idCampo,nombre,ubicacion,descripcion,precioMinuto};
        return fila;
    }
    
}

