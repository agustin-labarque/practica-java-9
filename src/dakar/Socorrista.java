package dakar;

public class Socorrista extends Vehiculo{

    TipoVehiculo tipoVehiculoSocorro;



    public Socorrista(int velocidad, int aceleracion, int anguloDeGiro, String patente, int peso, int ruedas, TipoVehiculo tipoVehiculo) {
        super(velocidad, aceleracion, anguloDeGiro, patente, peso, ruedas, TipoVehiculo.AUTO);
        tipoVehiculoSocorro = tipoVehiculo;
    }

    public void socorrer(Vehiculo v){
        if(v.getTipoVehiculo().equals(tipoVehiculoSocorro)){
            System.out.println("socorriendo " + v.getTipoVehiculo() + " con numero de patente: " + v.getPatente());
        }else{
            System.out.println("este vehiculo de socorro solo socorre "+ tipoVehiculoSocorro);
        }
    }
}
