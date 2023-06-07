import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public Cliente(String nome1, String cpf1, String email1) {

    }

    public void Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String setCpf(String cpf) {
        this.cpf = cpf;
        return cpf;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

}
