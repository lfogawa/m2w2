package exercise5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private String dataNascimento;

    @Override
    public String toString() {
        return "FrequenciaCardiaca{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento) {
        setNome(nome);
        setSobrenome(sobrenome);
        setDataNascimento(dataNascimento);
    }

    public int calculaIdade(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentoLocalDate = LocalDate.parse(dataNascimento, formatter);
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - dataNascimentoLocalDate.getYear();
        return idade;
    }

    public int frequenciaMaxima(){
        int frequenciaMaxima = 220 - calculaIdade();
        return frequenciaMaxima;
    }

    public String frequenciaAlvo(){
        int frequenciaMaxima50 = (int) (frequenciaMaxima() * 0.5);
        int frequenciaMaxima85 = (int) (frequenciaMaxima() * 0.85);
        return frequenciaMaxima50 + " - " + frequenciaMaxima85;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
