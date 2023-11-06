public class Main {
    public static void main(String[] args) {
        String[][] mutante = {
                {"C", "T", "C", "G", "A", "A"},
                {"C", "A", "G", "T", "A", "A"},
                {"T", "T", "A", "T", "A", "A"},
                {"C", "T", "A", "A", "A", "A"},
                {"C", "A", "T", "C", "T", "A"},
                {"A", "C", "A", "C", "T", "G"}
        };
        String[][] noMutante = {
                {"A", "G", "A", "A", "T", "G"},
                {"C", "A", "G", "T", "T", "C"},
                {"T", "T", "A", "G", "G", "T"},
                {"A", "G", "C", "T", "G", "G"},
                {"C", "C", "T", "A", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };

        String[][] mutante2 = {
                {"A", "Z", "G", "C", "G", "A"},
                {"C", "A", "G", "T", "T", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "C", "A", "G", "G"},
                {"C", "C", "T", "A", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };

        String[][] mutante3 = {
                {"A", "T", "G", "C", "G", "A"},
                {"C", "A", "G", "A", "T", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "A", "C", "A", "G", "G"},
                {"A", "C", "T", "A", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };

        String[][] mutante4 = {
                {"T", "T", "C", "G", "G", "C"},
                {"G", "T", "A", "C", "C", "G"},
                {"A", "G", "C", "C", "T", "A"},
                {"C", "A", "C", "T", "G", "A"},
                {"G", "C", "A", "T", "A", "C"},
                {"G", "T", "T", "A", "C", "A"}
        };

        String[][] mutante5 = {
                {"G", "G", "G", "G", "T", "C"},
                {"G", "G", "A", "G", "A", "G"},
                {"G", "T", "G", "C", "A", "T"},
                {"G", "G", "C", "G", "C", "A"},
                {"G", "T", "T", "A", "G", "C"},
                {"A", "C", "G", "T", "A", "C"}
        };
        String[][] mutante6 = {
                {"A", "T", "C", "C", "C", "T"},
                {"A", "T", "C", "C", "A", "A"},
                {"C", "T", "A", "A", "T", "G"},
                {"C", "A", "T", "A", "G", "C"},
                {"G", "G", "G", "G", "A", "G"},
                {"G", "C", "A", "T", "G", "A"}
        };
        String[][] mutante7 = {
                {"A", "A", "A", "G", "T", "T"},
                {"C", "C", "C", "G", "G", "G"},
                {"C", "A", "A", "T", "T", "C"},
                {"G", "T", "C", "A", "G", "A"},
                {"T", "C", "G", "A", "T", "C"},
                {"A", "G", "C", "A", "T", "A"}
        };
        String[][] mutante8 = {
                {"G", "C", "T", "G", "T", "A"},
                {"G", "C", "T", "C", "T", "T"},
                {"G", "A", "T", "A", "A", "G"},
                {"G", "T", "T", "A", "A", "C"},
                {"C", "T", "C", "A", "C", "A"},
                {"A", "A", "A", "A", "C", "G"}
        };


        analisisDeMutante(mutante);
        analisisDeMutante(noMutante);
        analisisDeMutante(mutante2);
        analisisDeMutante(mutante3);
        analisisDeMutante(mutante4);
        analisisDeMutante(mutante5);
        analisisDeMutante(mutante6);
        analisisDeMutante(mutante7);
        analisisDeMutante(mutante8);

    }

    public static void analisisDeMutante(String[][] matriz) {
        Verificador verificador = new Verificador();
        System.out.println("Mutante :");
        mostrarMatriz(matriz);
        if (verificador.esMutante(matriz)){
            System.out.println("Es mutante\n");
        } else{
            System.out.println("No es mutante\n");

        }
    }

    public static void mostrarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}