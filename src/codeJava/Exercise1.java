package codeJava;

public class Exercise1 {

    public static void main(String [] args){
        int sumatoria=0;
        for (int i=0; i< 1000; i ++)
        {
            if (Utilidades.is3Multiply(i) || Utilidades.is5Multiply(i))
            {
                sumatoria = sumatoria + i;
            }


        }

        System.out.println("El resultado es "+sumatoria);

    }

}
