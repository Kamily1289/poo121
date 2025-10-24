// Desenvolva o jogo Guerreiros da POO. 
import java.util.Random;
public class jogooGuerreiro{

//Neste jogo os personagens são guerreiros, que possuem as seguintes características: código, nome e energia (0 a 5). Os guerreiros só sabem fazer duas coisas: lutar com outro guerreiro e se alimentar.
Random gerador = new Random();
    private int codigo;
    private String nome;
    private int energia;

  //no construtor, o código e o nome são carregados por parâmetro e a energia é inicializada com o valor 5.
 //há um método de acesso para a energia.
 
    public jogooGuerreiro(int codigo, String nome ){
    this.codigo = codigo;
    this.nome = nome;
    this.energia =5; 
    }
    public int getEnergia() {
        return energia;
    }
//há um método chamado incremento, que aumenta a energia em 1 ponto, mas esta não pode passar do máximo (5).
    public void incremento(){
        if (energia < 5){
            this.energia ++;
        }
    }
//há um método chamado decremento que reduz em 1 ponto a energia do Guerreiro. Caso esta chegue a zero, uma mensagem será emitida dizendo que o mesmo está sem energia.) o método alimentar-se deve aumentar a energia em 1 ponto (use o método incremento do item d).
    public void decremento(){
        if (energia == 0) {
        System.out.println(" Sem energia!");
        }else{
            this.energia --;
        }
    }
//o método atacar consiste na geração e retorno de um número aleatório entre 0 e 1 (0 – sem sucesso, 1- com sucesso) . O método atacar só deve ser chamado dentro do método lutar do item h.
    public int atacar(){
        return gerador.nextInt(2);
    }
//o método lutar recebe por parâmetro o guerreiro oponente e deve reduzir a energia de um guerreiro a cada ataque com sucesso de seu oponente (use o método decremento do item e). O método lutar deve chamar o método atacar de cada guerreiro e exibir o vencedor quando a energia de um dos guerreiros chegar a zero.
    public void lutar1(jogooGuerreiro srAlfonso){
        
        while (true) {
            if(srAlfonso.atacar() == 1){
                decremento();
            }

            if (atacar() == 1) {
                srAlfonso.decremento();
            }

            if (srAlfonso.energia == 0) {
                System.out.printf("%s vencedor!", nome);
                break;
            }

            if (energia == 0) {
                System.out.printf("%s vencedor!", srAlfonso.nome); 
                break;
            }
        }
        
    }

    public void lutar2(jogooGuerreiro srAlfonso) {

        if (srAlfonso.getEnergia() == 0) {
            System.out.printf("%s ganhou!\n", srAlfonso.nome);
            return;
        }
        if (atacar() == 1) {
            srAlfonso.decremento();
        }

        if (energia == 0) {
            System.out.printf("%S perdeu!\n", nome);
            return;
        }
        if (srAlfonso.atacar() == 1) {
            decremento();
        }

        lutar2(srAlfonso);

    }

//o método toString deve mostrar o “estado” do guerreiro.
    public String toString() {
        return "Nome: " + nome + "\nCodigo: " + codigo + "\nEnergia: " + energia;
    }
}
