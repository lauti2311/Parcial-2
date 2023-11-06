public class Verificador {
    public boolean esMutante(String[][] adn){
        int n = adn.length;
        if (n == 0) {
            System.out.println("Matriz vacia");
        }
        for (int i = 0; i < n; i++) {
            if (adn[i].length != n) {
                System.out.println("La madriz no es cuadrada");
            }
            for (int j = 0; j < n; j++) {
                if (!adn[i][j].matches("[ATCG]")) {
                    System.out.println("No hay adn valido");
                }
            }
        }
        int contador = 0;
        contador += verficacionHorizontal(adn);
        contador += verficacionVertical(adn);
        contador += verficacionDiagonalIzquierdaDerecha(adn);
        contador += verficacionDiagonalDerechaIzquierda(adn);
        return contador >= 2;
    }

    public int verficacionHorizontal(String[][] adn) {
        int contador = 0;
        for (int i = 0; i < adn.length; i++) {
            for (int j = 0; j < adn[i].length - 3; j++) {
                if (adn[i][j].equals(adn[i][j+1]) && adn[i][j].equals(adn[i][j+2]) && adn[i][j].equals(adn[i][j+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public int verficacionVertical(String[][] adn) {
        int contador = 0;
        for (int i = 0; i < adn.length - 3; i++) {
            for (int j = 0; j < adn[i].length; j++) {
                if (adn[i][j].equals(adn[i+1][j]) && adn[i][j].equals(adn[i+2][j]) && adn[i][j].equals(adn[i+3][j])) {
                    contador++;
                }
            }
        }
        return contador;
    }


    public int verficacionDiagonalIzquierdaDerecha(String[][] adn) {
        int contador = 0;
        for (int i = 0; i < adn.length - 3; i++) {
            for (int j = 0; j < adn[i].length - 3; j++) {
                if (adn[i][j].equals(adn[i+1][j+1]) && adn[i][j].equals(adn[i+2][j+2]) && adn[i][j].equals(adn[i+3][j+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public int verficacionDiagonalDerechaIzquierda(String[][] adn) {
        int contador = 0;
        for (int i = 3; i < adn.length; i++) {
            for (int j = 0; j < adn[i].length - 3; j++) {
                if (adn[i][j].equals(adn[i-1][j+1]) && adn[i][j].equals(adn[i-2][j+2]) && adn[i][j].equals(adn[i-3][j+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }
}