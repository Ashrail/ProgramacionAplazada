import javax.swing.JOptionPane;
public class tarea2
{
    public static void main(String args[])
    {
        int a[]=new int [0];
        int posValor=posValor(a,-1);
        int insertarEnPos;
        a=ins_ordenado(a,10);
        a=ins_ordenado(a,20);
        a=ins_ordenado(a,5);
        a=ins_ordenado(a,4);
        a=ins_ordenado(a,1);
        
        imprimir(a);
        
        
    }
    public static int posValor(int a[], int v)
    {
        int pos =-1;
         for(int i=0; i < a.length; i++) 
         { 
          if( a[i] == v )
          { 
            pos = i; 
            imprimir(a);
                      
          }
        }
        return pos;
    }
    public static int[]insPosicion(int a[],int p, int v)
    {
        p=p-1;
        int indice=p-1;
    }
    public static int ins_ordenado(int a[], int v)
    {
        int tmp[]=new int [a.length+1];
        if (a.length==0)tmp[0]=v;
        else if (a.length==1&&v>a[0])tmp=insPosicion(a,1,v);
        else if (a.length==1&&v<=a[0])tmp=insPosicion(a,2,v);
        else
        {
            for (int i=0;i<a.length;i++)
            {
                if (v>=a[i]&&v<=a[i+1])
                {
                    tmp=insPosicion(a,i+2,v);
                }
            }
        }
        
        return tmp;

    } 
    public static void imprimir(int a[])
    {
        String salida=" ";
        int i=0;
        while (i<a.length)
        {
            salida+=a[i]+" ";
            i++;
        }
        mensaje(salida);
        
    }
    public static void mensaje (String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
}