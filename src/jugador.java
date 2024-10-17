//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class jugador {
    String nickname;
    int edad;
    String pais;

    public jugador(){
        nickname="Goddie";
        edad=22;
        pais="Ecuador";
    }

    public void patear(){
        System.out.println("El jugador "+nickname+ " con "+edad+" años de edad del país "+pais+" → patea.");
    }
    public void correr(){
        System.out.println("El jugador "+nickname+ " con "+edad+" años de edad del país "+pais+" → corre.");
    }

    public jugador(String nickname, int edad, String pais){
        this.nickname=nickname;
        this.edad = edad;
        this.pais=pais;
    }


    public void patearDos(){
        System.out.println("El jugador "+nickname+ " con "+edad+" años de edad del país "+pais+" → patea.");
    }
    public void correrDos(){
        System.out.println("El jugador "+nickname+ " con "+edad+" años de edad del país "+pais+" → corre.");
    }
    public void saltar(int s){
        int saltos = 2+s;
        System.out.println("El jugador "+nickname+ " con "+edad+" años de edad del país "+pais+" → salta "+saltos+" veces.");
    }
}