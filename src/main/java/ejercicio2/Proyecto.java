package ejercicio2;

import java.util.ArrayList;
import java.util.List;


class HistoriaUsuario implements ItemTrabajo {
    private List<ItemTrabajo> items = new ArrayList<>();

    public void agregarItem(ItemTrabajo item) {
        items.add(item);
    }

    @Override
    public int calcularTiempo() {
        int totalHoras = 0;
        for (ItemTrabajo item : items) {
            totalHoras += item.calcularTiempo();
        }
        return totalHoras;
    }
}

class Proyecto implements ItemTrabajo {
    private List<ItemTrabajo> historias = new ArrayList<>();

    public void agregarHistoria(ItemTrabajo historia) {
        historias.add(historia);
    }

    @Override
    public int calcularTiempo() {
        int totalHoras = 0;
        for (ItemTrabajo historia : historias) {
            totalHoras += historia.calcularTiempo();
        }
        return totalHoras;
    }
}

