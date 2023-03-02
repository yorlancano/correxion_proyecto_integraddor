package servicio_entrega_envios;

public class Envio {
    public static  Cliente cliente;

    private String ciudadOrigen = "";
    private String ciudadDestino = "";
    private String direccionDestino = "";
    private String recibeEnvio = "";
    private String horaEntrega = "";
    private String estadoEnvio = "";
    private float valorEnvio = 0;


    public Envio( String ciudadOrigen,Cliente cliente ,String ciudadDestino, String direccionDestino, String recibeEnvio, String horaEntrega, String estadoEnvio, float valorEnvio) {
        this.cliente = cliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.direccionDestino = direccionDestino;
        this.recibeEnvio = recibeEnvio;
        this.horaEntrega = horaEntrega;
        this.estadoEnvio = estadoEnvio;
        this.valorEnvio = valorEnvio;
    }
    public Envio(){

    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getRecibeEnvio() {
        return recibeEnvio;
    }

    public void setRecibeEnvio(String recibeEnvio) {
        this.recibeEnvio = recibeEnvio;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public float getValorEnvio() {
        return valorEnvio;
    }

    public void setValorEnvio(float valorEnvio) {
        this.valorEnvio = valorEnvio;
    }

    @Override
    public String toString() {
        return "Envio" +
                "\n" + cliente.identificacion() +
                "\n-----------------------------" +
                "\nciudadOrigen = " + ciudadOrigen +
                "\nciudad de Destino = " + ciudadDestino +
                "\ndireccion de Destino = " + direccionDestino +
                "\nrecibe el Envio = " + recibeEnvio +
                "\nhora de Entrega = " + horaEntrega +
                "\nestado de el Envio = " + estadoEnvio +
                "\nvalor de el Envio = " + valorEnvio ;
    }
}
