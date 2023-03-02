package servicio_entrega_envios;

import java.util.ArrayList;

public class Cliente extends Usuario {
    public Cliente(String nombre, String apellido, int celular, String correoElectronico, String direccionResidencia, String ciudad) {
        super(nombre, apellido, celular, correoElectronico, direccionResidencia, ciudad);
    }
    public Cliente (){

    }
    @Override
    public String identificacion() {
        return "Cliente : " +
                "\nnombre = " + getNombre() +
                "\napellido = " + getApellido() +
                "\ncelular = " + getCelular() +
                "\ncorreo Electronico = " + getCorreoElectronico() +
                "\ndireccion de Residencia = " + getDireccionResidencia() +
                "\nciudad= " + getCiudad() ;
    }
}
