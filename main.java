public class main {
public static void main(String[] args) {

    //Cadastrar dois guerreiros; 
    jogooGuerreiro valdin = new jogooGuerreiro(2, "valdin");
    jogooGuerreiro srAlfonso = new jogooGuerreiro(1, "srAlfonso");

    //Iniciar uma luta (com laço);
    valdin.lutar1(srAlfonso);

    //Iniciar uma luta (com recursividade);
    valdin.lutar2(srAlfonso);
    //Alimentar um guerreiro;
    valdin.alimentar();
    //Exibir as informações de um guerreiro.
    System.out.println(valdin.toString());

}
}
