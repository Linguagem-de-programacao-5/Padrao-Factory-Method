public class ServicoSuspenderContrato implements IServico{
    public String executar(){
        return  "O contrato foi suspenso!";
    }

    public String cancelar(){
        return "A suspensão do contrato foi cancelada!";
    }
}
