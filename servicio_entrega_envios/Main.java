package servicio_entrega_envios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Envio enviar = new Envio();
        Paquete paquete = new Paquete();
        Usuario empleado = new Empleado();
        cliente = new Cliente("yorlan","marroquin",234342,"yolran@gmail.com","cr1 5a13","medellin");
        System.out.println(cliente.identificacion());
        System.out.println();
        enviar = new Envio("medellin",cliente,"neiva","cr84 5a12","jimena","8pm","entregado",8000);
        System.out.println(enviar.toString());
        System.out.println();
        paquete = new Paquete("345re","grande",22,80000);
        System.out.println(paquete.toString());
        System.out.println();
        empleado = new Empleado("yonanderson","marroquin",3423445,"yonaderson@gamil.com","cr54 23a12","barranquilla",6,"O+","repartidor");
        System.out.println(empleado.identificacion());
    }
}
