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
        if (tipoError >= 10) {
            System.out.print("Error " + tipoError + ": ");
        }
        switch (tipoError) {
            case 0 -> System.out.println("Fin del programa");
            case 10 -> System.out.println("La variable '" + args1 + "' no se encuentra en la tabla de simbolos");
            case 11 -> System.out.println("La variable '" + args1 + "' no esta inicializada");
            case 12 -> System.out.println("No se puede convertir el tipo '" + args1 + "' a '" + args2 + "'");
            case 20 -> System.out.println("No se puede hacer la '" + args3 + "' con los tipos: '" + args1 + "' y '" + args2 + "'");
            case 21 -> System.out.println("El operador '" + args1 + "' introducido no existe");
            case 22 -> System.out.println("No se puede hacer la '" + args2 + "' con el tipo: '" + args1 + "'");
            case 30 -> System.out.println("La condicion debe ser de tipo booleano");
            case 40 -> System.out.println("La función '" + args1 + "' no existe");
            case 41 -> System.out.println("El número de argumentos es '" + args1 + "' y deberia de ser '" + args2 + "'");
            case 50 -> System.out.println("La funcion val necesita el valor del parametro '" + args1 + "'");
            case 51 -> System.out.println("El valor de la variable '" + args1 + "' debe ser numerico");
            case 52 -> System.out.println("La funcion val no tiene el numero parametros correcto");
            case 53 -> System.out.println("La funcion val necesita un polinomio a evaluar");
        }
    }

    public int getTipoError() {
        return tipoError;
    }
}

