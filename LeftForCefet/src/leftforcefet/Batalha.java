package leftforcefet;
import java.util.Scanner;
import java.util.Random;

public class Batalha {
    
    public static int escolhaUsuario(){
        Scanner opcao = new Scanner(System.in);
        int escolha = opcao.nextInt();
        return escolha;
    }
    public static int escolhaInimigo(){
        Random random = new Random();
        
        int escolha = random.nextInt(2)+1;
        
        return escolha;
    }
    
    public static void fazerTurnoUsuario(Usuario a,Inimigo b){
        System.out.println("Seu turno de Ataque");
        System.out.println("Escolha :");
        System.out.println("1- Ataque Leve ,2- Ataque Pesado");
        System.out.print("Opcao -> "); 
        int opcaoUsuario = Batalha.escolhaUsuario();
        int opcaoInimigo = Batalha.escolhaInimigo();
        
        if(opcaoUsuario == 1){
            System.out.println("Voce escolheu Atacar Leve");
        }
        else{
            System.out.println("Voce escolheu Atacar Pesado");
        }
        
        if(opcaoInimigo == 1){
            System.out.println("Inimigo escolheu Defender");
        }
        else{
            System.out.println("Inimigo escolheu Esquivar");
        }
        
        
        if(opcaoInimigo==1){
            // Ataque 1
            if(opcaoUsuario==1){
                if(a.atacar() < b.defender()){
                System.out.println("Seu ataque não e efetivo");
                // ataque 50% menos a defesa
                }
                else{
                System.out.println("Seu ataque foi efetivo");
                // ataque 50% 
                } 
            }
            
            // Ataque 2
            if(opcaoUsuario==2){
                if((a.atacar()+a.esquivar()) < (b.defender()+b.esquivar())){
                System.out.println("Seu ataque não e efetivo");
                // ataque 75% menos a defesa
                }
                else{
                System.out.println("Seu ataque foi efetivo");
                //ataque 100%
                }
            }
        }
        else if(opcaoInimigo==2){
            // Ataque 1
            if(opcaoUsuario==1){
                if(a.atacar() < b.esquivar()){
                System.out.println("Seu ataque não e efetivo");
                // ataque 0
                }
                else{
                System.out.println("Seu ataque foi efetivo");
                // ataque 75% 
                } 
            }
            
            // Ataque 2
            if(opcaoUsuario==2){
                if(a.atacar() < b.esquivar()){
                System.out.println("Seu ataque não e efetivo");
                // ataque 0  
                }
                else{
                System.out.println("Seu ataque foi efetivo");
                //ataque 125%
                }
            }
        }
        
        
    }
    
    public static void fazerTurnoInimigo(Inimigo b,Usuario a){
        System.out.println("Turno de Ataque do Inimigo");
        System.out.println("Escolha :");
        System.out.println("1- Defender ,2- Esquivar");
        System.out.print("Opcao -> "); 
        int opcaoUsuario = Batalha.escolhaUsuario();
        int opcaoInimigo = Batalha.escolhaInimigo();
        
        if(opcaoUsuario == 1){
            System.out.println("Voce escolheu Defender");
        }
        else{
            System.out.println("Voce escolheu Esquivar");
        }
        
        if(opcaoInimigo == 1){
            System.out.println("Inimigo escolheu Atacar Leve");
        }
        else{
            System.out.println("Inimigo escolheu Atacar Pesado");
        }
        
        if(opcaoUsuario==1){
            // Ataque 1
            if(opcaoInimigo==1){
                if(b.atacar() < a.defender()){
                System.out.println("Ataque Inimigo não e efetivo");
                // ataque 50% menos a defesa
                }
                else{
                System.out.println("Ataque Inimigo foi efetivo");
                // ataque 50% 
                } 
            }
            
            // Ataque 2
            if(opcaoInimigo==2){
                if((b.atacar()+b.esquivar()) < (a.defender()+a.esquivar())){
                System.out.println("Ataque Inimigo não e efetivo");
                // ataque 75% menos a defesa
                }
                else{
                System.out.println("Ataque Inimigo foi efetivo");
                //ataque 100%
                }
            }
        }
        else if(opcaoUsuario==2){
            // Ataque 1
            if(opcaoInimigo==1){
                if(b.atacar() < a.esquivar()){
                System.out.println("Ataque Inimigo não e efetivo");
                // ataque 0
                }
                else{
                System.out.println("Ataque Inimigo foi efetivo");
                // ataque 75% 
                } 
            }
            
            // Ataque 2
            if(opcaoInimigo==2){
                if(b.atacar() < a.esquivar()){
                System.out.println("Ataque Inimigo não e efetivo");
                // ataque 0
                }
                else{
                System.out.println("Ataque Inimigo foi efetivo");
                //ataque 125%
                }
            }
        }
        
        
    }
    
    public static void batalha(Usuario a,Inimigo b){
    
        while(a.getVida() != 0 || b.getVida() != 0 ){
            Batalha.fazerTurnoUsuario(a,b);
            Batalha.fazerTurnoInimigo(b,a);
        }
    }
}
