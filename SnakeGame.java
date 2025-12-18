package mypkg;

import javax.swing.*;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        super("Snake Game");
        add(new board()); // ✅ Only add parshu, not board

        setSize(500, 500); // Adjust size as needed
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window
        setVisible(true);
    }

    public static void main(String[] args) {
        new SnakeGame(); // ✅ No need to create parshu again here
    }
}
