package servicio_entrega_envios;

public class Empleado extends  Usuario {
    private int añosTrabajo = 0;
    private String tipoSangre = "";
    private String tipoEmpleado = "";
    public Empleado(String nombre, String apellido, int celular, String correoElectronico, String direccionResidencia, String ciudad, int añosTrabajo, String tipoSangre, String tipoEmpleado) {
        super(nombre, apellido, celular, correoElectronico, direccionResidencia, ciudad);
        this.añosTrabajo = añosTrabajo;
        this.tipoSangre = tipoSangre;
        this.tipoEmpleado = tipoEmpleado;
    }
    public Empleado(){

    }
    public int getAñosTrabajo() {
        return añosTrabajo;
    }

    public void setAñosTrabajo(int añosTrabajo) {
        this.añosTrabajo = añosTrabajo;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String identificacion() {
        return "Empleado : " +
                "\nnombre = " + getNombre() +
                "\napellido = " + getApellido() +
                "\ncelular = " + getCelular() +
                "\ncorreo Electronico = " + getCorreoElectronico() +
                "\ndireccion de Residencia = " + getDireccionResidencia() +
                "\nciudad =" + getCiudad() +
                "\naños en de trabajo en la empresa = " + añosTrabajo +
                "\ntipo de sangre = " + tipoSangre +
                "\ntipo de empleado = " + tipoEmpleado;
    }
}
