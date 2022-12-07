package leftforcefet;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class LeftForCefet {

    public static void main(String[] args) {
        Usuario a = new Usuario(0,"Chris",100,50,30,20);
        Inimigo b = new Inimigo(1,0,"none","Inimigo Teste",100,30,50,20);
        Batalha.batalha(a, b);
    }
}
