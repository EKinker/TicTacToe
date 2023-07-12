package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;  //declare character matrix

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        boolean result = false;
        if ((isRowWin('X') == true) || (isColumnWin('X') == true)) {
            return true;
        }
        return result;
    }

    public Boolean isInFavorOfO() {
        boolean result = false;
        if ((isRowWin('O') == true) || (isColumnWin('O') == true)) {
            return true;
        }
        return result;
    }

    public Boolean isTie() {
        boolean result = false;
        if (isInFavorOfO() == false && isInFavorOfX() == false){
            result = true;
        }
        return result;
    }

    public String getWinner() {
        return null;
    }

    public boolean isRowWin(char input) {
        boolean result = false;
        for (int i = 0; i<3; i++) {
            if (matrix[i][0] == input && matrix[i][0] == matrix[i][1] && matrix[i][1]== matrix[i][2]) {
                result = true;
            }
        }
        return result;
    }

    public boolean isColumnWin(char input) {
        boolean result = false;
        for (int i = 0; i < 3; i++) {
            if (matrix[0][i] == input && matrix[0][i] == matrix [1][i] && matrix[1][i] == matrix[2][i]) {
                result = true;
            }
        }
        return result;
    }

}
