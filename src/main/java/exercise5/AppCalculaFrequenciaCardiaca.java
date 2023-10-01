package exercise5;

public class AppCalculaFrequenciaCardiaca {
    public static void main(String[] args){
        FrequenciaCardiaca pessoa = new FrequenciaCardiaca("Luis", "Felipe", "19/03/1996");

        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Idade: " + pessoa.calculaIdade() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.frequenciaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: entre " + pessoa.frequenciaAlvo() + " bpm");
    }
}