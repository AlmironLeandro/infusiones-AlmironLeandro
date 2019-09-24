package ar.edu.unahur.obj2;

    public   class teVerde extends te{
        public te t1;

        public teVerde(te t1) {
            this.t1 = t1;
            t1.tiempoDeInfusion();
        }
        @Override
        public void tiempoDeInfusion() {

        }
    }
