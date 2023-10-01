package exercise2;

public class PessoaFisica {
    private String cpf;

    public PessoaFisica(String cpf) {
        setCpf(cpf);
    }

    private boolean validarCpf(String cpf){
        return cpf.length() == 11;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (validarCpf(cpf)) {
            this.cpf = cpf;
            System.out.print("CPF cadastrado. ");
        } else {
            System.out.print("CPF inválido.");
        }
    }
}