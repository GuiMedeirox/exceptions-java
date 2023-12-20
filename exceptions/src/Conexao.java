public class Conexao{

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException("Erro na leitura dos dados");
    }

    public void fecharConexao(){
        System.out.println("Fechando conexao");
    }
}

