public class ServicoTrocarTitular implements IServico {
    public String executar(){
        return  "A troca de titular foi agendada, para o proximo ciclo de faturamento!";
    }

    public String cancelar(){
        return "A troca de titularidade foi cancelada!";
    }
}
