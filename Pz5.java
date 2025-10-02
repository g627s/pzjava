package ru.mirea.lab1;

import javax.swing.*;

public class Pz5 {
    public static void main(String[] args) {
        String path;

        if (args.length == 0) {
            // путь по умолчанию
            path = "C:\\Users\\sanch\\PycharmProjects\\pythonProject1\\cat.jpg";
        } else {
            path = args[0];
        }

        JFrame frame = new JFrame("Картинка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(new ImageIcon(path));

        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
