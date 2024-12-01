
package eva3_4_examen2;
import java.util.Scanner;
public class EVA3_4_EXAMEN2 {
static final int PIEDRA =1;
static final int PAPEL =2;
static final int TIJERAS =3;
    public static void main(String[] args) {
        // TODO code application logic here
     int jugada=generarJugadaComp();  
     int ju;
     int resu;
     do{   
      ju = pedirJugada("introduce tu jugada(piedra-1,papel-2,tijeras-3,salir-0)");
         System.out.println(jugada);
         resu= evaluarPartida(ju,jugada);
         System.out.println(resu);
     }while(ju!= 0); 
    }
    //PIEDRA PAPEL O TIJERAS
    public static int pedirJugada(String mensaje){
       Scanner captu = new Scanner(System.in);
       System.out.println(mensaje);
       int seleccion = captu.nextInt();
       return seleccion;
      }
    public static int generarJugadaComp(){
    int jugada;
    double valor= Math.random();
    if((valor >= 0)&& (valor < 0.3))
        jugada = PIEDRA;//piedra
    else if((valor >= 0.3)&& (valor < 0.6))
        jugada = PAPEL;//papel
    else 
        jugada= TIJERAS;//tijera
      return jugada;
   }
    public static int evaluarPartida(int jugadaUsu,int jugadaComp){
        int resu=0;//0-empate-1-gano-pierdes
      if((jugadaUsu == PIEDRA)&& (jugadaComp == PIEDRA))
          resu=0;
     else if((jugadaUsu == PIEDRA)&& (jugadaComp == PAPEL))
          resu=2;
     else if((jugadaUsu == PIEDRA)&& (jugadaComp == TIJERAS))
          resu=2;
     else if((jugadaUsu == PAPEL)&& (jugadaComp == PIEDRA))
          resu=1;
     else if((jugadaUsu == PAPEL)&& (jugadaComp == PAPEL))
          resu=0;
     else if((jugadaUsu == PAPEL)&& (jugadaComp == TIJERAS))
          resu=2;
     else if((jugadaUsu == TIJERAS)&& (jugadaComp == PIEDRA))
          resu=2;
     else if((jugadaUsu == TIJERAS)&& (jugadaComp == PAPEL))
          resu=1;
     else if((jugadaUsu == TIJERAS)&& (jugadaComp == TIJERAS))
          resu=2;
      return resu;
    
    }
}

