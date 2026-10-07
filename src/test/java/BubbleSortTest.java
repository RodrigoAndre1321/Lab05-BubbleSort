import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    // CASOS DE PRUEBA ORIGINALES DEL ANÁLISIS DE CAMINOS

    @Test
    void testC1() {
        // Arrange
        int[] vet = {5};
        int[] esperado = {5};

        // Act
        bubbleSort.bubbleSort(vet);

        // Assert
        assertArrayEquals(esperado, vet);
    }

    @Test
    void testC2() {
        // Arrange
        int[] vet = {1, 2};
        int[] esperado = {1, 2};

        // Act
        bubbleSort.bubbleSort(vet);

        // Assert
        assertArrayEquals(esperado, vet);
    }

    @Test
    void testC3() {
        // Arrange
        int[] vet = {2, 1};
        int[] esperado = {1, 2};

        // Act
        bubbleSort.bubbleSort(vet);

        // Assert
        assertArrayEquals(esperado, vet);
    }

    // CASOS DE PRUEBA ADICIONALES

    @Test
    void testArrayGrandeOrdenado() {
        // Arrange
        int[] vet = {1, 2, 3, 4, 5};
        int[] esperado = {1, 2, 3, 4, 5};

        // Act
        bubbleSort.bubbleSort(vet);

        // Assert
        assertArrayEquals(esperado, vet);
    }

    @Test
    void testArrayGrandeDesordenado() {
        // Arrange
        int[] vet = {5, 4, 3, 2, 1};
        int[] esperado = {1, 2, 3, 4, 5};

        // Act
        bubbleSort.bubbleSort(vet);

        // Assert
        assertArrayEquals(esperado, vet);
    }
}