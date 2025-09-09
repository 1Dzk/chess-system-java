package chess.pieces;

import boardgame.Board;
import boardgame.Piece;
import chess.ChessPiece;
import chess.Color;

public class Kink extends ChessPiece {

    public Kink(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        return new boolean[0][];
    }
}
