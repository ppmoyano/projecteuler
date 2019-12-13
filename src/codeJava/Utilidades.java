package codeJava;

import java.util.ArrayList;

public class Utilidades {

    public static boolean is3Multiply(int num)
    {
        return (num%3) == 0 ;
    }

    public static boolean is5Multiply(int num)
    {
        return (num%5) == 0 ;
    }

    public static boolean is2Multiply(int num)
    {
        return (num%2) == 0 ;
    }

    public static ArrayList FibonaciNumbersOrders(int count)
    {
        ArrayList lista = new ArrayList();
        int suma=0;
        int aux1=0;
        int aux2=1;
        int contador=0;
        do{
            suma = aux1 + aux2;
            lista.add(suma);
            aux1 = aux2;
            aux2 = suma;
            contador++;
        }while(contador<count);

        return lista;
    }


    public static ArrayList FibonaciNumbersMaxNum(int sum)
    {
        ArrayList lista = new ArrayList();
        int suma=0;
        int aux1=0;
        int aux2=1;
        while (suma<sum){
            suma = aux1 + aux2;
            lista.add(suma);
            aux1 = aux2;
            aux2 = suma;
        }
    lista.remove(lista.size()-1);
        return lista;
    }

    public static ArrayList convertStringToArrayInteger(String aux){
        ArrayList<Long> lista = new ArrayList();
        for (int i=0;i<aux.length();i++){
            lista.add(Long.valueOf(String.valueOf(aux.charAt(i))));
        }
        return lista;
    }


}
