package dakar;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    int distancia;
    int premioEnDolares;
    int cantidadVehiculosPermitidos;
    String nombre;
    Socorrista socorristaAuto;
    Socorrista socorristaMoto;
    List<Vehiculo> vehiculos;

    public Carrera(int distancia, int premioEnDolares, int cantidadVehiculosPermitidos, String nombre, Socorrista socorristaAuto, Socorrista socorristaMoto) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
        this.nombre = nombre;
        this.socorristaAuto = socorristaAuto;
        this.socorristaMoto = socorristaMoto;
        this.vehiculos = new ArrayList<>();
    }

    public int getDistancia() {
        return distancia;
    }

    public int getPremioEnDolares() {
        return premioEnDolares;
    }

    public int getCantidadVehiculosPermitidos() {
        return cantidadVehiculosPermitidos;
    }

    public String getNombre() {
        return nombre;
    }

    public Socorrista getSocorristaAuto() {
        return socorristaAuto;
    }

    public Socorrista getSocorristaMoto() {
        return socorristaMoto;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void darDeAltaAuto(int velocidad, int aceleracion, int anguloDeGiro, String patente){
        if(vehiculos.size() < cantidadVehiculosPermitidos){
            vehiculos.add(VehiculoFactory.getInstanceAuto(velocidad,aceleracion,anguloDeGiro, patente));
        }else{
            System.out.println("no se aceptan mas participantes");
        }
    }

    public void darDeAltaMoto(int velocidad,int aceleracion,int anguloDeGiro, String patente){
        if(vehiculos.size() < cantidadVehiculosPermitidos){
            vehiculos.add(VehiculoFactory.getInstanceMoto(velocidad,aceleracion,anguloDeGiro, patente));
        }else{
            System.out.println("no se aceptan mas participantes");
        }
    }

    public void eliminarVehiculo(Vehiculo v){
        boolean eliminado = vehiculos.remove(v);
        if(eliminado){
            System.out.println("el auto " + v.getPatente() + " fue eliminado");
        }else{
            System.out.println("el auto " + v.getPatente() + " no participaba de la carrera");
        }
    }

    public void eliminarVehiculoConPatente(String patente){
        boolean eliminado = vehiculos.removeIf(v -> v.getPatente().equals(patente));
        if(eliminado){
            System.out.println("el auto " + patente + " fue eliminado");
        }else{
            System.out.println("el auto " + patente + " no participaba de la carrera");
        }
    }

    public void ganadorCarrera(){
        Vehiculo v = vehiculos.stream().max(new VehiculoComparator()).get();
        System.out.println("el vehiculo ganador es: "+ v.getPatente());
    }

    public void socorrerAuto(Vehiculo v){
        socorristaAuto.socorrer(v);
    }

    public void socorrerMoto(Vehiculo v){
        socorristaMoto.socorrer(v);
    }
}
