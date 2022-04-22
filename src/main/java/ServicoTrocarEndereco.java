public class ServicoTrocarEndereco  implements IServico{
    public String executar(){
        return  "A troca de endereço será efetuada no proximo dia útil!";
    }

    public String cancelar(){
        return "A troca de endereço foi cancelada!";
    }
}
