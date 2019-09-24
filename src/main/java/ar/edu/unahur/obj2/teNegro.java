package ar.edu.unahur.obj2;

public   class teNegro extends te{
    public te t1;

    public teNegro(te t1) {
        this.t1 = t1;
        t1.tiempoDeInfusion();
    }
    @Override
    public void tiempoDeInfusion() {

    }
}

