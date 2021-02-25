package dakar;

public class Vehiculo {

    int velocidad;
    int aceleracion;
    int anguloDeGiro;
    String patente;
    int peso;
    int ruedas;
    TipoVehiculo tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(int velocidad, int aceleracion, int anguloDeGiro, String patente, int peso, int ruedas, TipoVehiculo tipoVehiculo) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
        this.tipoVehiculo = tipoVehiculo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public int getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

    public int getPeso() {
        return peso;
    }

    public int getRuedas() {
        return ruedas;
    }
}
