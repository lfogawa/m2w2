package exercise6;

import java.util.Scanner;

public class AppPerfilDeSaude {
    public static void main(String[] args){
        PerfilDeSaude pessoa = new PerfilDeSaude();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        pessoa.setNome(nome);

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        pessoa.setSobrenome(sobrenome);

        System.out.print("Digite o seu sexo: ");
        String sexo = scanner.nextLine();
        pessoa.setSexo(sexo);

        System.out.print("Digite a sua data de nascimento: ");
        String dataNascimento = scanner.nextLine();
        pessoa.setDataNascimento(dataNascimento);

        System.out.print("Digite a sua altura (m), utilizando ponto: ");
        String altura = scanner.nextLine();
        pessoa.setAltura(Double.valueOf(altura));

        System.out.print("Digite o seu peso (kg), utilizando ponto: ");
        String peso = scanner.nextLine();
        pessoa.setPeso(Double.valueOf(peso));

        System.out.println("- Informações da Pessoa -");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Altura: " + pessoa.getAltura() + " m");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.frequenciaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: entre " + pessoa.frequenciaAlvo() + " bpm");
        System.out.printf("IMC: %.2f", pessoa.calcularImc());
    }
}
