package ar.edu.unahur.obj2;

public class teBlanco extends te {
    public te t1;

    public teBlanco(te t1) {
        this.t1 = t1;
        t1.tiempoDeInfusion();
    }
    @Override
   public void tiempoDeInfusion() {}
}
