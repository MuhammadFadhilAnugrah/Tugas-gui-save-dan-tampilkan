package form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormBerkas {
    private JTextField textKartu;
    private JComboBox comboBoxATM;
    private JComboBox comboBoxBank;
    private JTextField textPemilik;
    private JTextArea outputLine;
    private JButton brosweFileButton;
    private JButton simpanButton;
    private JLabel textGambar;
    private JPanel rootpanel;

    public String fileName;



    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("fileData.txt", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException ex) {
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }

    public FormBerkas() {
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no = textKartu.getText();
                String atm = (String) comboBoxATM.getSelectedItem();
                String bank = (String) comboBoxBank.getSelectedItem();
                String nama = textPemilik.getText();

                Data data = new Data();
                data.setNo(no);
                data.setAtm(atm);
                data.setBank(bank);
                data.setNama(nama);

                String hasil = "Saved!" + "\nNo Kartu = " + no + "\nJenis ATM = " + atm + "\nBank = " + bank +
                        "\nNama Pemilik = " + nama + "\nNama File Gambar = " + fileName;

                outputLine.append(hasil);
            }
        });


        brosweFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser browseImage = new JFileChooser();

                int showOpenDialogue = browseImage.showOpenDialog(null);

                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    fileName = browseImage.getSelectedFile().getName();

                    File selectedImage = browseImage.getSelectedFile();
                    String selectedImagePath = selectedImage.getAbsolutePath();

                    ImageIcon ii = new ImageIcon(selectedImagePath);
                    Image image = ii.getImage().getScaledInstance(textGambar.getWidth(), textGambar.getHeight(), Image.SCALE_SMOOTH);

                    textGambar.setIcon(new ImageIcon(image));
                }
            }
        });


    }

    public JPanel getRootpanel() {
        return rootpanel;
    }
}

