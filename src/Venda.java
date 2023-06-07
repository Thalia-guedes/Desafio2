import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda {
    private Vendedor vendedor;
    private String cpf;
    private String email;
    private String nome;
    private Cliente cliente;
    private double valor;
    private String data;
    private double preco;
    private String nomeProduto;
    private int quantidade;
    private int codigo;


    public Venda(Vendedor vendedor, String nome, Cliente cliente, double valor, String data) {
        this.vendedor = vendedor;
        this.nome = nome;
        this.cliente = cliente;
        this.valor = valor;
        this.data = data;
    }
    public Venda() {

    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public String getNome() {
        return nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public double getPreco() {
        return preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Vendedor setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return vendedor;
    }

    public String setCpf(String cpf) {
        this.cpf = cpf;
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente setCliente(Cliente cliente) {
        this.cliente = cliente;
        return cliente;
    }

    public double setValor(double valor) {
        this.valor = valor;
        return valor;
    }

    public String setData(String data) {
        this.data = data;
        return data;
    }

    public double setPreco(double preco) {
        this.preco = preco;
        return preco;
    }

    public String setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        return nomeProduto;
    }

    public int setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return quantidade;
    }

    public int setCodigo(int codigo) {
        this.codigo = codigo;
        return codigo;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public Venda(Cliente cliente1, Vendedor vendedor1, int codigo, String nomeProduto, double preco, int quantidade) {

    }

}
