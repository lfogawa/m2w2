package exercise3;

public class Retangulo {
    private Float comprimento;

    private Float largura;

    public Retangulo() {
        this.comprimento = 1.0f;
        this.largura = 1.0f;
    }
    public Retangulo(Float comprimento, Float largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public void calcularPerimetro(){
        Float perimetro = 2 * (comprimento + largura);
        System.out.printf("O perímetro é de %.2f.%n", perimetro);
    }

    public void calcularArea(){
        Float area = comprimento * largura;
        System.out.printf("A área é de %.2f.%n", area);
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        if(comprimento > 0.0 && comprimento <= 20.0){
            this.comprimento = comprimento;
        } else {
            System.out.print("O valor do comprimento deve ser entre 0,0 e 20,0.");
        }
    }

    public Float getLargura() {
        return largura;
    }

    public void setLargura(Float largura) {
        if(comprimento > 0.0 && comprimento <= 20.0){
            this.largura = largura;
        } else {
            System.out.print("O valor da largura deve ser entre 0,0 e 20,0.");
        }
    }
}
