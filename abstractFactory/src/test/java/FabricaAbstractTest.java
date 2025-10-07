package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FabricaAbstractTest {

    @Test
    void deveCriarMoveisModernos() {
        FabricaAbstract fabrica = new FabricaModerna();
        Cadeira cadeira = fabrica.criarCadeira();
        Mesa mesa = fabrica.criarMesa();

        assertEquals("Cadeira moderna de design minimalista", cadeira.exibirDescricao());
        assertEquals("Mesa moderna com tampo de vidro e estrutura metálica", mesa.exibirDescricao());
    }

    @Test
    void deveCriarMoveisClassicos() {
        FabricaAbstract fabrica = new FabricaClassica();
        Cadeira cadeira = fabrica.criarCadeira();
        Mesa mesa = fabrica.criarMesa();

        assertEquals("Cadeira clássica de madeira entalhada", cadeira.exibirDescricao());
        assertEquals("Mesa clássica de madeira nobre com detalhes ornamentados", mesa.exibirDescricao());
    }
}
