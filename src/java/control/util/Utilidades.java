/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 *
 * @author edisonarango
 */
public class Utilidades {
	
    
    
    public static boolean isNumeric(String str) {
        return (str.matches("[+-]?\\d*(\\.\\d+)?") && str.equals("")==false);
    }
    
    public static String numeroADinero (int numero){
        char[] partes = (numero+"").toCharArray();
        String dinero = "";
        int veces = 0;
        for (int i = partes.length-1; i >=0; i--) {
            dinero = partes[i] + dinero;
            veces++;
            if (i>0&&veces==3) {
                veces=0;
                dinero = "." + dinero;
            }  
        }
        return dinero;
    }
    
    public static String fechaActual (){
        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        return String.format("%02d",dia) + "/" + String.format("%02d",(mes+1)) + "/" + año;
    }
    
    public static ArrayList<String> diasDeRango(String fechaIn,String fechaFin){
            ArrayList<String> fechas = new ArrayList<>();
            String fechaActual = fechaIn;
            int diaActual,mesActual,añoActual;
            diaActual = Integer.valueOf(fechaActual.split("/")[0]);
            mesActual = Integer.valueOf(fechaActual.split("/")[1]);
            añoActual = Integer.valueOf(fechaActual.split("/")[2]);
            fechas.add(fechaActual);
            while (!fechaActual.equals(fechaFin)) {                
                if (diaActual==31) {
                    diaActual=1;
                    if (mesActual==12) {
                        mesActual=1;
                        añoActual+=1;
                    }
                    else{
                        mesActual+=1;
                    }
                }
                else{
                    diaActual+=1;
                }
                fechaActual = String.format("%02d",diaActual)+"/"+String.format("%02d",mesActual)+"/"+añoActual;
                fechas.add(fechaActual);    
            }
            return fechas;
        }
    
    /**
     * Ordena los objetos de mayor a menor 
     * @param objetos Objetos a ordenar
     * @param cantidades Cantidades a ordenar tal que a objetos[i] le corresponda cantidades[i]
     * @return Hashmap con los 10 objetos con mayor valores ordenados y sus respectivas cantidades asociadas
     */
    public static LinkedHashMap<Object,Integer> ordenarObjetosDeMayorAMenor (Object[] objetos, int[] cantidades){
    	ArrayList<Object> objetosOrdenados = new ArrayList<>();
    	ArrayList<Integer> cantidadesOrdenadas = new ArrayList<>();
    	for (int i = 0; i < objetos.length; i++) {
			if(objetosOrdenados.isEmpty()){
				objetosOrdenados.add(objetos[i]);
				cantidadesOrdenadas.add(cantidades[i]);
			}
			else{
				for (int j = 0; j < objetosOrdenados.size(); j++) {
					if (objetosOrdenados.size()==1||j==objetosOrdenados.size()-1){
						if (cantidades[i]>cantidadesOrdenadas.get(j)){
							objetosOrdenados.add(j,objetos[i]);
							cantidadesOrdenadas.add(j,cantidades[i]);
							break;
						}
						else{
							objetosOrdenados.add(objetos[i]);
							cantidadesOrdenadas.add(cantidades[i]);
							break;
						}
					}
					else {
						if(cantidades[i]<=cantidadesOrdenadas.get(j)&&cantidades[i]>=cantidadesOrdenadas.get(j+1)){
							objetosOrdenados.add(j+1,objetos[i]);
							cantidadesOrdenadas.add(j+1,cantidades[i]);
							break;
						}
					}
					
				}
			}
		}
    	LinkedHashMap<Object,Integer> map = new LinkedHashMap<Object,Integer>();
    	int max = 10;
    	if (objetosOrdenados.size()<10){
    		max=objetosOrdenados.size();
    	}
    	for (int i = 0; i < max; i++) {
			map.put(objetosOrdenados.get(i),cantidadesOrdenadas.get(i));
		}
    	return map;
    }
    
    public static void main(String[] args) {
//		String[] valores = {"Edison","Felipe","Pepe","Carlos"};
//		int[] cantidades = {0,4,1,2};
//		
//		LinkedHashMap<Object,Integer> map = Utilidades.ordenarObjetosDeMayorAMenor(valores, cantidades);
//		
//		Iterator<Object> keySetIterator = map.keySet().iterator();
//
//		while(keySetIterator.hasNext()){
//		  Object key = keySetIterator.next();
//		  System.out.println("key: " + (String)key + " value: " + map.get(key));
//		}
        System.out.println(Utilidades.numeroADinero(231468565));
    }
    
}
