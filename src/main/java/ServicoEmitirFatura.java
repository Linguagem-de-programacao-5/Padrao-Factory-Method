public class ServicoEmitirFatura implements IServico{

    public String executar() {
        return "Emissão de fatura por e-mail ativa!";
    }

    public String cancelar() {
        return "Emissão de fatura por e-mail cancelada!";
    }
}
