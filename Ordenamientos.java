/*
Metodos de odenamiento directo
-intercambio
-seleccion
-inserccion
*/
class Ordenamientos 
{
   private void auxcambiaDatos(int []v, int i, int j)
   {
      int aux=v[i];
      v[i]=v[j];
      v[j]=aux;
   }
   public void sortIntercambio(int []v, int indice)
   {
      for(int i=0; i<indice;i++)
      {
         for(int j=i+1;j<=indice;j++)
         {
            if(v[i]>v[j])
               auxcambiaDatos(v,i,j);
         }
      }
   }
   public void sortSeleccion(int []v, int indice)
   {
      int i, j, im;
      for(i=0;i<indice;i++)
      {
         im=i;
         for(j=i+1;j<=indice;j++)
         {
            if(v[im]>v[j])
               im=j;
         }
         if (i!=im)
            auxcambiaDatos(v,i,im);
      }
   }
   public void sortInsercion(int []v, int indice)
   {
      int aux,i,j;
      j=0;
      aux=0;
      for(i=1;i<=indice;i++){
        aux =v[i];
        for(j=i;j>0;j--)
            v[j]=v[j-1];
      }
      v[j]=aux;
   }
}