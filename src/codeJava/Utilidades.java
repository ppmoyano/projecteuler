package codeJava;

import java.util.*;

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

    /*
    Este metodo ve cuantos pares de numeros enteros repetidos hay en una lista
     */
    public static int sockMerchant(int n, int[] ar) {
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;
        for (int i=0;i<n-1;i++) // 1 1 3 1 2 1 3 3 3 3  // 1 1 1 1 2 3 3 3 3 3
        {
            if (colors.remove(ar[i])) { pairs++; } else { colors.add(ar[i]); } //con esta linea hago el resto
        }


 /*       Arrays.sort(ar);
                int count = 1;
                int total = 0;
                for (int i=0;i<n-1;i++) // 1 1 3 1 2 1 3 3 3 3  // 1 1 1 1 2 3 3 3 3 3
                {
                    if (colors.remove(c[i])) { pairs++; } else { colors.add(c[i]); }
                    if (ar[i]==ar[i+1])
                    {
                        count++;
                    }
                    else
                    {
                        if (count>1)
              {
                  total = total + (count/2);
              }
                count = 1;
            }
            if (i>=n-2)
            {
               total = total + (count/2);
           }
    }*/
        return pairs;
    }

    /*
    Este metodo recive un List<Integer> y devuelve un int []
     */
    public static int[] convertListToArray(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }
}
