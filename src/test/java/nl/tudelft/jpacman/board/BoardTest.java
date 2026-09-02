package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class BoardTest {
    @Test
    public void testBoard() {
        Square square = new BasicSquare();

        Square[][] grid = {
            {square}
        };

        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }

    @Test
    public void testBoardNull() {
        Square[][] grid = {
            {null}
        };

        assertThatThrownBy(() -> new Board(grid))
            .isInstanceOf(AssertionError.class);
    }
}
