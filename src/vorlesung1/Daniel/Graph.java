package vorlesung1.Daniel;

import java.sql.SQLOutput;

public class Graph{

    int[][] matrix;
    int anzahlKnoten;
    Knoten[] knoten;

    public Graph(int max)
    {

        matrix = new int[max][max];
        knoten = new Knoten[max];
        anzahlKnoten = 0;

    }

    public void knotenEinfuegen(String b)
    {
        knoten[anzahlKnoten] = new Knoten(b);
        matrix[anzahlKnoten][anzahlKnoten] = 0;
            for(int i = 0; i<anzahlKnoten;i++)
            {
                matrix[i][anzahlKnoten] = -1;
                matrix[anzahlKnoten][i] = -1;

            }
            anzahlKnoten ++;
   }
   public int knotenNummerGeben(String b){

        int num = -1;
        for(int i = 0; i< anzahlKnoten;i++)
        {
            if(knoten[i].getBezeichner().equals(b))
            {
                num = i;
            }

        }
        return num;
   }

   public String knotenBezeichnerGeben(int num)
   {
       return knoten[num].getBezeichner();
   }

   public void kanteEinfuegen(String a, String b, int gewicht)
   {
       int first = knotenNummerGeben(a);
       int scnd = knotenNummerGeben(b);
       if(first != scnd && first != -1 && scnd != -1){
           matrix[first][scnd] = gewicht;
           matrix[scnd][first] = gewicht;
       }

   }

   public void ausgabe()
   {
       System.out.print("    ");
       for(int i = 0; i<knoten.length;i++){

           System.out.print(knoten[i].getBezeichner().substring(0,4));
       }

       for (int i = 0; i< anzahlKnoten;i++){
           System.out.println();
           System.out.print(knoten[i].getBezeichner().substring(0,4));
           for (int k = 0; k< anzahlKnoten;k++){
               System.out.print((matrix[i][k]+"    ").substring(0,4));
           }

       }

   }

   public int kanteGewichtGeben(String a,String b)
   {
        int g = matrix[knotenNummerGeben(a)][knotenNummerGeben(b)];
        return g;
   }

}

