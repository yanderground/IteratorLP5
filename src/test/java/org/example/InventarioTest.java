package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void deveContarProdutosDisponiveis() {
        Estoque estoque = new Estoque(
                new Produto("Cadeira", true),
                new Produto("Mesa", false),
                new Produto("Sofá", true),
                new Produto("Estante", true)
        );
        assertEquals(3, Inventario.contarProdutosDisponiveis(estoque));
    }

    @Test
    void deveContarTotalProdutos() {
        Estoque estoque = new Estoque(
                new Produto("Cadeira", true),
                new Produto("Mesa", false),
                new Produto("Sofá", true),
                new Produto("Estante", true)
        );
        assertEquals(4, Inventario.contarTotalProdutos(estoque));
    }
}
