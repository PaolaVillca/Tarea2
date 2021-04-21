
public class Matematico
{
   
   public String mayorMenorMedio( int a, int b, int c){
    String res;
    int mayor;
    int menor;
    int medio;
     if(a>b && a>c){
        mayor = a;
        }else{
            if(b>a && b>c){
             mayor = b;
            }else{
            mayor = c;
        }
        }
     if(a<b && a<c){
        menor = a;
        }else{
            if(b<a && b<c){
             menor = b;
            }else{
            menor = c;
        }
        }
        if (a<b && a>c || a<c &&  a>b){
         medio = a;
        }else{
            if(a>b && c<b || c>b && a<b){
             medio = b;
            }else{
             medio = c;
            }
        }
        res = mayor + " es mayor,  " + menor + " es menor,  " + medio + " es el numero de en medio";
    return res; 
   }
   public String areaCuadrado(int base, int altura){
     String rest;
     int area;
     area = base * altura;
     rest = "El area del cuadrado es: " + area + " ";
     return rest;
    }
   public String distancia(int x1, int y1, int x2, int y2){
    String resp;
    double dist;
    dist = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    resp = "La distancia entre dos puntos es: " + dist;
    return resp;
    }
   public String cuadrante(int x, int y){
    String ress;
    String n;
    if(x>0 && y>0){
     n = "primer cuadrante";
    }else{
      if(x<0 && y>0){
        n = "segundo cuadrante";
        }else{
         if(x<0 && y<0){
            n = "tercer cuadrante";
            }else{
             n = "Cuarto cuadrante";
        }
    }
    }
    return n;
  }
}