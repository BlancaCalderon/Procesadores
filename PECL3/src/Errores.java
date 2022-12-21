public class Errores extends Exception {
    private int tipoError;
    private String args1;
    private String args2;

    public Errores(int tipoError) {
        this.tipoError = tipoError;
        tratamiento();
    }

    public Errores(int tipoError, String args1) {
        this.tipoError = tipoError;
        this.args1 = args1;
        tratamiento();
    }

    public Errores(int tipoError, String arg1, String arg2) {
        this.tipoError = tipoError;
        this.args1 = args1;
        this.args2 = args2;
        tratamiento();
    }

    private void tratamiento() {
        switch (tipoError) {
            case 1 -> System.out.println("No se puede hacer suma o resta con los tipos: tipo1 " + args1 + " y tipo2 " + args2);
            case 2 -> System.out.println();
        }


    }
}

