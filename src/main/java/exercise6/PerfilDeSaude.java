package exercise6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private String dataNascimento;
    private Double altura;
    private Double peso;

    public PerfilDeSaude() {
        setNome(nome);
        setSobrenome(sobrenome);
        setSexo(sexo);
        setDataNascimento(dataNascimento);
        setAltura(altura);
        setPeso(peso);
    }

    public int calcularIdade(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentoLocalDate = LocalDate.parse(dataNascimento, formatter);
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - dataNascimentoLocalDate.getYear();
        return idade;
    }

    public int frequenciaMaxima(){
        int frequenciaMaxima = 220 - calcularIdade();
        return frequenciaMaxima;
    }

    public String frequenciaAlvo(){
        int frequenciaMaxima50 = (int) (frequenciaMaxima() * 0.5);
        int frequenciaMaxima85 = (int) (frequenciaMaxima() * 0.85);
        return frequenciaMaxima50 + " - " + frequenciaMaxima85;
    }

    public double calcularImc(){
        double imc = peso / (altura * altura);
        return imc;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
