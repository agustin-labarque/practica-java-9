package dakar;

import java.util.Comparator;

public class VehiculoComparator implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        double rv1 = rendimiento(v1);
        double rv2 = rendimiento(v2);
        if(rv1 > rv2){
            return 1;
        }else if(rv1 < rv2){
            return -1;
        }else{
            return 0;
        }
    }

    private double rendimiento(Vehiculo v){
        return v.getVelocidad() * ((1/2)*  v.getAceleracion()) / (v.getAnguloDeGiro() *(v.getPeso() - v.getRuedas() * 100));
    }
}
