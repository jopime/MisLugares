package com.example.jopime.mislugares;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jopime on 31/7/15.
 */
public class Lugares {
    final static String TAG = "MisLugares";
    protected static GeoPunto posicionActual = new GeoPunto(0,0);
    protected static List<Lugar> vectorLugares = ejemploLugares();
    public Lugares() {
        vectorLugares = ejemploLugares();
    }
    public static Lugar elemento(int id){
        return vectorLugares.get(id);
    }
    static void anyade(Lugar lugar){
        vectorLugares.add(lugar);
    }
    static int nuevo(){
        Lugar lugar = new Lugar();
        vectorLugares.add(lugar);
        return vectorLugares.size()-1;
    }
    static void borrar(int id){
        vectorLugares.remove(id);
    }
    public static int size() {
        return vectorLugares.size();
    }
    public static ArrayList ejemploLugares() {
        ArrayList lugares = new ArrayList();
        lugares.add(new Lugar("Escuela Tecnica Ingenieria Informatica y Telecomunicaciones de Granada"
                ,"Calle Periodista Daniel Saucedo",1,2,947400182,"www.etsiit.ugr.es","Mi Escuela",8,TipoLugar.EDUCACION));

        lugares.add(new Lugar("Casa de Granada"
                ,"Calle Doctor",3,4,947402193,"www.casa.ugr.es","Mi Casa Estudiante",9,TipoLugar.HOTEL));
        lugares.add(new Lugar("Casa de Cordoba"
                ,"Calle Doctor",3,4,957402193,"www.casa.uco.es","Mi Casa",10,TipoLugar.HOTEL));
        return lugares;
    }
    static List listaNombres(){
        ArrayList resultado = new ArrayList();
        for (Lugar lugar:vectorLugares){
            resultado.add(lugar.getNombre());
        }
        return resultado;
    }
}
