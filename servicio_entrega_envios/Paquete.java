package servicio_entrega_envios;

public class Paquete {
    private String identificadorPaquete = "";
    private String tipoPaquete = "";
    private float pesoPaquete = 0;
    private float valorPaquete =0;


    public Paquete(String identificadorPaquete, String tipoPaquete, float pesoPaquete, float valorPaquete) {
        this.identificadorPaquete = identificadorPaquete;
        this.tipoPaquete = tipoPaquete;
        this.pesoPaquete = pesoPaquete;
        this.valorPaquete = valorPaquete;
    }
    public Paquete(){

    }
    public String getIdentificadorPaquete() {
        return identificadorPaquete;
    }

    public void setIdentificadorPaquete(String identificadorPaquete) {
        this.identificadorPaquete = identificadorPaquete;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public float getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(float pesoPaquete) {
        this.pesoPaquete = pesoPaquete;
    }

    public float getValorPaquete() {
        return valorPaquete;
    }

    public void setValorPaquete(float valorPaquete) {
        this.valorPaquete = valorPaquete;
    }

    @Override
    public String toString() {
        return "Paquete:" +
                "\nidentificador del Paquete = " + identificadorPaquete +
                "\ntipo del Paquete = " + tipoPaquete +
                "\npeso del Paquete = " + pesoPaquete +
                "\nvalor del Paquete= " + valorPaquete;
    }
}
