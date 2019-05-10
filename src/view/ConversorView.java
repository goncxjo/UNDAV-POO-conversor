package view;

import controller.ConversorController;
import model.Conversor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorView extends JFrame { // Importante heredar de JFrame

    private final JPanel contentPane;
    private final JPanel panel;
    private final JLabel ingresarMillasLabel;
    private final JTextField millasTextField;
    private final JButton convertirButton;
    private final JLabel kilometrosLabel;
    private final ConversorController controller;

    public ConversorView() {
        controller = new ConversorController(new Conversor());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Convertir de millas a kilómetros");
        this.setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
        contentPane.setLayout(new BorderLayout(0,0)); // espaciado entre Paneles
        this.setContentPane(contentPane); // ultra necesario para que se vea el contenido del frame

        panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(0,1,0,0));

        ingresarMillasLabel = new JLabel("Ingrese millas: ");
        panel.add(ingresarMillasLabel);

        millasTextField = new JTextField();
        panel.add(millasTextField);

        convertirButton = new JButton("Convertir");
        convertirButton.setBackground(new Color(51,153,102));
        convertirButton.setSize(1,1);
        convertirButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.seClickeoElBotonConvertir(millasTextField.getText());
            }
        });
        panel.add(convertirButton);

        kilometrosLabel = new JLabel("1,609344 kilometros");
        panel.add(kilometrosLabel);
    }

    /**
     * Este método me permite ejecutar sólo este Frame sin necesidad de ejecutar el proyecto entero.
     * */
    public static void main (String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ConversorView frame = new ConversorView();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
