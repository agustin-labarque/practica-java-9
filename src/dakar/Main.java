package dakar;

public class Main {

    public static void main(String[] args){

        Carrera dakar = new Carrera(3000,
                50000,
                2,
                "dakar",
                VehiculoFactory.getInstanceSocorrista(10, 10, 90, "as929sb", TipoVehiculo.AUTO),
                VehiculoFactory.getInstanceSocorrista(10, 10, 90, "ba123cd", TipoVehiculo.MOTO));

        dakar.darDeAltaAuto(120, 30, 110, "aa432ls");
        dakar.darDeAltaMoto(150, 20, 80, "ah910uu");
        dakar.darDeAltaMoto(200, 50, 180, "bb999az");

        dakar.ganadorCarrera();

        dakar.socorrerAuto(dakar.getVehiculos().get(0));
        dakar.socorrerMoto(dakar.getVehiculos().get(1));
        dakar.eliminarVehiculoConPatente("aa432ls");
        dakar.ganadorCarrera();
    }
}
