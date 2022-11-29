package form;

import javax.swing.*;

public class RunFormBerkas {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Berkas");
        jFrame.setContentPane(new FormBerkas().getRootpanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,500);
        jFrame.setVisible(true);
    }
}
