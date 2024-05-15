package ejercicio2;

class Tarea implements ItemTrabajo {
    private int horas;

    public Tarea(int horas) {
        this.horas = horas;
    }

    @Override
    public int calcularTiempo() {
        return horas;
    }
}

class Spike implements ItemTrabajo {
    private int horas;

    public Spike(int horas) {
        this.horas = horas;
    }

    @Override
    public int calcularTiempo() {
        return horas;
    }
}

