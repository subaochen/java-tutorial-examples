package cn.edu.sdut.softlab;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by subaochen on 17-2-5.
 */
public class CheckBoxDemo {
    private JCheckBox runningBox;
    private JCheckBox basketBallBox;
    private JCheckBox pingpangBox;
    private JCheckBox swimmingBox;
    private JPanel mainPanel;
    private JLabel sportLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBoxDemo");
        frame.setContentPane(new CheckBoxDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CheckBoxDemo() {

        runningBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "选择了跑步:" + runningBox.isSelected());
            }
        });
        runningBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/football.png")));
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                sportLabel.setIcon(new ImageIcon(CheckBoxDemo.class.getResource("/images/duke.gif")));
            }
        });
    }
}
