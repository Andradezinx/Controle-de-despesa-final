package model;

public class Usuario {
    private String login;
    private String senhaCriptografada;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senhaCriptografada = Criptografia.criptografar(senha);
    }
}