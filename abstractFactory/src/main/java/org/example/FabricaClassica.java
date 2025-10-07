package org.example;

public class FabricaClassica implements FabricaAbstract {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraClassica();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaClassica();
    }
}

