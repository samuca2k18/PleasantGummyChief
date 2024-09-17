public class QuickSort {
    int vetor[] = new int[10];

    // Construtor da classe para inicializar o vetor
    public void quickSort() {
        // Inicializa o vetor com valores aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }

        System.out.println("Desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Chama o método quicksort
        quicksort(vetor, 0, vetor.length - 1);

        System.out.println("\nOrdenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    static void quicksort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int p = particao(vetor, inicio, fim);
            quicksort(vetor, inicio, p);
            quicksort(vetor, p + 1, fim);
        }
    }

    static int particao(int vetor[], int inicio, int fim) {
        // Escolha o pivô, neste caso o elemento central
        int meio = (inicio + fim) / 2;
        int pivot = vetor[meio];
        int i = inicio - 1;
        int j = fim + 1;

        while (true) {
            do {
                i++;
            } while (vetor[i] < pivot);

            do {
                j--;
            } while (vetor[j] > pivot);

            if (i >= j) {
                return j;
            }

            // Troca os elementos
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }

}
