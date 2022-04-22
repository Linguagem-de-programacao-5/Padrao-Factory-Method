import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTrocarEnderecoTest {
    @Test
    void deveExecutarTrocarEndereco(){
        IServico servico = ServicoFactory.obterServico("TrocarEndereco");
        assertEquals("A troca de endereço será efetuada no proximo dia útil!", servico.executar());
    }

    @Test
    void deveCancelarTrocarEndereco(){
        IServico servico = ServicoFactory.obterServico("TrocarEndereco");
        assertEquals("A troca de endereço foi cancelada!", servico.cancelar());
    }
}