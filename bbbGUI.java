import javax.swing.*;
import java.util.ArrayList;
class Jogador {
    private String nome;
    private int votos;

    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 0;
    }
    public String getNome() {
        return nome;
    }
    public int getVotos() {
        return votos;
    }
    public void incrementaUmVoto() {
        this.votos++;
    }
}
    public class bbbGUI {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Matteus Amaral"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinicius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));
        String votoEm;
        do {
            votoEm = JOptionPane.showInputDialog(null, "Em quem você vota para sair da casa?", "Votação", JOptionPane.QUESTION_MESSAGE);
            if (votoEm != null && !votoEm.equalsIgnoreCase("sair")) {
                boolean encontrado = false;
                for (Jogador jogador : jogadores) {
                    if (jogador.getNome().equalsIgnoreCase(votoEm)) {
                        jogador.incrementaUmVoto();
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Jogador não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (votoEm != null && !votoEm.equalsIgnoreCase("sair"));
        Jogador eliminado = null;
        int maiorVotos = -1;
        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > maiorVotos) {
                eliminado = jogador;
                maiorVotos = jogador.getVotos();
            }
        }
        if (eliminado != null) {
            // Exibe uma mensagem informando o jogador eliminado e o número de votos recebidos
            JOptionPane.showMessageDialog(null, "Se eu conseguir mover montanhas, se eu conseguir \n " +
                    "surfar um tsunami, se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão \n" +
                    "virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que \n" +
                    "eu vou conseguir te eliminar com alegria. \n" +
                    "Com " + eliminado.getVotos() + " votos, é você quem sai " + eliminado.getNome(), "Eliminação", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}