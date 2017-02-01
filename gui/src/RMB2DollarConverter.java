import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by subaochen on 17-1-31.
 */
public class RMB2DollarConverter {
    private JPanel mainPanel;
    private JTextField rmbTextField;
    private JButton convertButton;
    private JLabel dollarLabel;

    // 自动创建的显示Form的main方法
    public static void main(String[] args) {
        JFrame frame = new JFrame("RMB2DollarConverter");
        frame.setContentPane(new RMB2DollarConverter().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public RMB2DollarConverter() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double rmb = Double.valueOf(rmbTextField.getText());
                dollarLabel.setText(String.valueOf(rmb / 7.0)); // 假设当前人民币和美元汇率为7.0
            }
        });
    }
}
