package org.example;

public class FabricaModerna implements FabricaAbstract {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaModerna();
    }
}
