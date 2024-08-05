import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaTriangulo extends JFrame {
    private JTextField ladoTextField;
    private JLabel resultadoLabel;

    public VentanaTriangulo() {
        setTitle("Cálculo Triángulo Equilátero");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel ladoLabel = new JLabel("Lado:");
        ladoTextField = new JTextField();
        JButton calcularButton = new JButton("Calcular");
        resultadoLabel = new JLabel();

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado = Double.parseDouble(ladoTextField.getText());
                    TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);
                    resultadoLabel.setText("Perímetro: " + triangulo.calcularPerimetro() +
                            " | Altura: " + triangulo.calcularAltura() +
                            " | Área: " + triangulo.calcularArea());
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Ingresa un valor válido.");
                }
            }
        });

        panel.add(ladoLabel);
        panel.add(ladoTextField);
        panel.add(calcularButton);
        panel.add(resultadoLabel);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaTriangulo();
    }
}
