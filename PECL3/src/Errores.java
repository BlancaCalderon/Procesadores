public class Errores extends Exception {
    private int tipoError;
    private String args1;
    private String args2;
    private String args3;

    public Errores(int tipoError) {
        this.tipoError = tipoError;
        tratamiento();
    }

    public Errores(int tipoError, String args1) {
        this.tipoError = tipoError;
        this.args1 = args1;
        tratamiento();
    }

    public Errores(int tipoError, String args1, String args2) {
        this.tipoError = tipoError;
        this.args1 = args1;
        this.args2 = args2;
        tratamiento();
    }

    public Errores(int tipoError, String args1, String args2, String args3) {
        this.tipoError = tipoError;
        this.args1 = args1;
        this.args2 = args2;
        this.args3 = args3;
        tratamiento();
    }

    private void tratamiento() {
        switch (tipoError) {
            case 1 -> System.out.println("Error de sintaxis");
            case 10 -> System.out.println("La variable no se encuentra en la tabla de simbolos");
            case 11 -> System.out.println("La variable no esta inicializada");
            case 12 -> System.out.println("No se puede convertir el tipo " + args1 + " a " + args2);
            case 20 -> System.out.println("No se puede hacer la " + args3 + " con los tipos: tipo1 " + args1 + " y tipo 2 " + args2);
            case 21 -> System.out.println("El operador " + args1 + " introducido no existe");
            case 22 -> System.out.println("No se puede hacer la " + args2 + " con el tipo: tipo1 " + args1);
            case 30 -> System.out.println("La condicion debe ser de tipo booleano");
            case 40 -> System.out.println("La función " + args1 + " no existe");
            case 41 -> System.out.println("El número de argumentos es " + args1 + " y deberia de ser " + args2);
        }
    }
}

