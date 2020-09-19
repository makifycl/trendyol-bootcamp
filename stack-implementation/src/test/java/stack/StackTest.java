package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {

    @Test
    public void push_whenAddEmptyStackToSingleItem_ShouldReturnSizeOne() {
        //Arrange
        Stack<String> sut = new Stack<>();

        //Act
        sut.push("Item1");

        //Assert
        assertThat(sut.count()).isEqualTo(1);

    }

    @Test
    public void pop_whenItemIsRemoved_ShouldReturnRemovedItem(){
        //Arrange
        Stack<String> sut = new Stack<>();
        sut.push("Item2");

        //Act
        String removedItem = sut.pop();

        //Assert
        assertThat(removedItem).isEqualTo("Item2");

    }

    @Test
    public void pop_whenStackIsEmpty_ShouldThrowException() {
        //Arrange
        Stack<String> sut = new Stack<>();

        //Assert
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, sut::pop);
    }

    @Test
    public void peek_shouldReturnLastItem() {
        //Arrange
        Stack<String> sut = new Stack<>();
        sut.push("Item2");

        //Act
        String lastItem = sut.peek();

        //Assert
        assertThat(lastItem).isEqualTo("Item2");
    }

    @Test
    public void count_shouldReturnStackSize() {
        //Arrange
        Stack<String> sut = new Stack<>();
        sut.push("Item1");
        sut.push("Item2");

        //Act
        int stackSize = sut.count();

        //Assert
        assertThat(stackSize).isEqualTo(2);
    }

}
