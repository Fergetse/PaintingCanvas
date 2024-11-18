package paint;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Paint extends JFrame {

    Dimension dim;

    public Paint() {
        dim = new Dimension(600, 600);
        FlatLightLaf.setup();
        //this.setResizable(false);
        this.setSize(dim);
        this.setMinimumSize(dim);
        this.setMaximumSize(dim);
        this.setLocationRelativeTo(null);
        this.add(new Canvas(this));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.out.println("a");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Paint().setVisible(true);
        });
    }

}
