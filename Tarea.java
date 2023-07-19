import javax.swing.JOptionPane;
public class Tarea 
{
      public static String salida="";
    
    public static void main (String args[])
    {
        String menu="\t Menu \n0.Inicializar el Arreglo \n1. Recibir un Arreglo y Llenarlo de “-1”. \n2.Llenar el arreglo \n3.Sumar los numeros del arreglo \n4.Imprimir arreglo \n5.Invertir arreglo "+
        "\n6.Promedio del Arreglo \n7.Retornar el Mayor de el Arreglo \n8.Retornar el menor de el Arreglo \n9.Llenar con Aleatorios \n10.Salir";
       
        
        int a[]=new int [0];
        int opc=0,tam=0,valor=0,sum=0,pro=0,may=0,men=0;
        boolean tr=false;
        String b="";
        int desde=0,hasta=0;
        do 
        {
        try
        {
        opc=pedirentero(menu);
        
        switch (opc)
        {
          case 0 : 
        tam=pedirentero("Ingrese el Tamaño del Arreglo Antes por Favor");
        if (tam>0) 
        {
            a=new int [tam];
            tr=true;
        }
        else 
        {
            mensaje("Ingrese un Numero Mayor a 0");
        }
        break;
        case 1 :
         if (tr==true )
        {
         llenarMenosUno(a);
        
         String s=imprimir(a);
        
         mensaje(s );
        } 
        else
        {
            mensaje("Debe Inicializar el Arreglo Antes ");
        }
        break;
        
        case 2:
        if (tr==true )
        {
         valor=pedirentero("Ingrese un Numero Con El Cual llenará el Arreglo");
                           
         llenar(a,valor);
                         
        } 
        else
        {
            mensaje("Debe Inicializar el Arreglo Antes ");
        }
        break;
          case 3: 
        if (tr==true )
        {
        sum=suma(a);
        String s=imprimir(a);
                             
        mensaje("La Suma del Arreglo  " + s+ " es: " +sum);
                         
        } else 
        {
            mensaje("Debe Inicializar el Arreglo Antes ");
        }
        break;
               
               case 4:
        if (tr==true )
        {
          b=imprimir(a);
          mensaje(b);
        
        } 
        else
        {
          mensaje("debe inicializar el arreglo antes ");
        }
         break;
                    
         case 5:
        if (tr==true )
        {
         invertir(a,salida);
         String inr=imprimir(a);
                       
         mensaje("el arreglo: " +inr+ "invertido fue: " + salida);

                      
        } else 
        {
            mensaje("debe inicializar el arreglo antes ");
        }
        break;
                
        case 6 :
        if (tr==true )
        {
                         
          pro=promedio(a);
          String imprimirM=imprimir(a);
                               
          mensaje("el promedio del areglo " +imprimirM + " fue \n" + pro);
                     
        } else 
        {
            mensaje("debe inicializar el arreglo antes ");
        }
        break;
        case 7:
        if (tr==true )
        {
           may=mayor(a);
          String im=imprimir(a);
          mensaje("el numero mayor del arereglo: " + im + "fue: " + may);
        
        } else 
        {
            mensaje("debe inicializar el arreglo antes ");
        }
        break;
                
        case 8 :
                if (tr==true )
                {
                     men=menor(a);
                     String imp=imprimir(a);
                     mensaje("el numero menor del arereglo: " + imp + "fue: " + men);
                } else 
                {
                    mensaje("debe inicializar el arreglo antes ");
                }
        break;
        case 9 :
                if (tr==true )
                {
                    do 
                    {
                        desde=pedirentero("Ingrese Desde Donde Generará el Aleatorio");
                        hasta=pedirentero("Ingrese Hasta Donde Generará el Aleatorio");
   
                     
                    } while (desde>hasta) ;
                     llenarAleatorio(a,desde,hasta);
                     mensaje(imprimir(a));
                    } 
                    else 
                    {mensaje("debe inicializar el arreglo antes ");
                    }
                break;
                    
                case 10 :
                        
                mensaje("Hasta Pronto!");
                break;
                        
                    default :
                        mensaje ("Opción Inválida");
                        break;
                        
         }
        } catch (Exception exp)
        {
            mensaje("Error");
        }
      } while (opc!=10);
        
    }
    
    public static void llenarMenosUno(int a[])
    {
        for (int i=0; i<a.length ; i++)
        {
            a[i]=-1;
        }
    }
    public static void llenar (int a[],int v)
    {
        for (int i=0; i<a.length; i++)
        {
            a[i]=v;
            
        }
    }
    public static int suma (int a[])
    {
        int sal=0;
        for (int i=0; i<a.length ; i++)
        {
            sal=sal+a[i];
            
        }
        return sal;
    }
    public static void invertir (int a[],String sal)
    {
      for (int i=a.length-1; i>-1 ; i--)
       {
            
            sal+=a[i];
    
       } 
       salida=salida +"" + sal; 
    }
    public static int mayor (int a[])
    {
        int mayo=0;
        int num=0;
        for (int i=0;i<a.length;i++)
        {
            num=a[i];
            
            if (num>mayo)
            {
                mayo=num;
            }
            
        }
        return mayo;
    }
    public static int menor (int a[])
    {
         int mayo=0;
        int meno=0;
        int num=0;
        for (int i=0;i<a.length;i++)
        {
            num=a[i];
            
            if (num>mayo)
            {
                mayo=num;
            }
        
        }
        for (int i=0;i<a.length;i++)
          {
              num=a[i];
            if(i==0){
             meno=a[i];
             
            } else if (i>0)
            {
             if (num<=meno){
                
                meno=num;
                }
            }
             
          }
        return meno;
    }
    public static void llenarAleatorio(int a[], int d,int h)
    {
         for(int i=0;i<a.length;i++)
        {
            a[i]=generaAleatorio(d,h);
        }
    }
    public static int generaAleatorio(int d, int h)
    {
        return (int)(Math.random()*(h-d+1)+d);
    }
     public static String imprimir(int a[])
    {
        String salidas="Informacion del Arreglo\n";
        for(int i=0;i<a.length;i++)
        {
            salidas+=a[i]+" ";
        }
        return salidas;
    }
    public static int promedio(int a[])
    {
        int pm=0, suma=0;
        
        for (int i=0 ; i<a.length;i++)
        {
            suma=suma+a[i];
        }
        
        pm=suma/a.length;
        
        return pm;
        
    }
     public static int pedirentero(String msg)
    {
        int nm=0;
        boolean hu=true;
        
        do {
            try {
         nm=Integer.parseInt(JOptionPane.showInputDialog(msg));
         hu=false;
        } catch (Exception exp ) {mensaje("porfavor ingrese los que se le pide");}
        } while (hu==true);
       return nm;
    }
      public static void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
        
    }
     public static int pedirent(String msg )
    { 
        int num=0;
        boolean hu=true;
        
        do {
            try {
        num=Integer.parseInt(JOptionPane.showInputDialog(msg));
         hu=false;
        } catch (Exception exp ) {mensaje("porfavor ingrese los que se le pide");}
        } while (hu==true);
       
       
        
        return num;
    }

}