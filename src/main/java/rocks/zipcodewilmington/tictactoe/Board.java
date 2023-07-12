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
        if ((isRowWin('X') == true) || (isColumnWin('X') == true) || (isDiagonalWin('X') == true)) {
            return true;
        }
        return result;
    }

    public Boolean isInFavorOfO() {
        boolean result = false;
        if ((isRowWin('O') == true) || (isColumnWin('O') == true) || (isDiagonalWin('O') == true)) {
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
        String result = "";
        if (isInFavorOfX() == true){
            result = "X";
        } else if (isInFavorOfO() == true){
            result = "O";
        }
        return result;
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

    public boolean isDiagonalWin(char input) {
        boolean result = false;
        int l2rCounter = 0;
        int r2lCounter = 0;
        for (int i = 0; i < 3; i++){
                if (matrix[i][i] == input){
                    l2rCounter++;
                }
                if (matrix[i][2-i] == input) {
                    r2lCounter++;
                }
        }
        return (l2rCounter == 3 || r2lCounter == 3);
    }

}
