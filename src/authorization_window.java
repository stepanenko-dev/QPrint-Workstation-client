import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import org.jdesktop.swingx.*;
/*
 * Created by JFormDesigner on Sat Apr 12 15:49:11 MSK 2014
 */



/**
 * @author SomeFoo
 */
public class authorization_window extends JFrame {
    public authorization_window() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("authorization_window_title");
        panel1 = new JPanel();
        hSpacer1 = new JPanel(null);
        login_pass_panel = new JPanel();
        vSpacer2 = new JPanel(null);
        label1 = new JLabel();
        loginField = new JTextField();
        label2 = new JLabel();
        passField = new JTextField();
        enterButton = new JButton();
        vSpacer3 = new JPanel(null);
        hSpacer2 = new JPanel(null);
        panel2 = new JPanel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();

        //======== this ========
        setTitle(bundle.getString("this.title"));
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
            panel1.add(hSpacer1);

            //======== login_pass_panel ========
            {
                login_pass_panel.setLayout(new GridLayout(7, 1, 10, 10));

                //---- vSpacer2 ----
                vSpacer2.setMinimumSize(new Dimension(20, 20));
                vSpacer2.setPreferredSize(new Dimension(20, 20));
                login_pass_panel.add(vSpacer2);

                //---- label1 ----
                label1.setText(bundle.getString("login_label_text"));
                login_pass_panel.add(label1);
                login_pass_panel.add(loginField);

                //---- label2 ----
                label2.setText(bundle.getString("pass_label_text"));
                login_pass_panel.add(label2);
                login_pass_panel.add(passField);

                //---- enterButton ----
                enterButton.setText(bundle.getString("enter_key_button_text"));
                enterButton.setHorizontalTextPosition(SwingConstants.CENTER);
                login_pass_panel.add(enterButton);

                //---- vSpacer3 ----
                vSpacer3.setMinimumSize(new Dimension(12, 20));
                vSpacer3.setPreferredSize(new Dimension(10, 20));
                login_pass_panel.add(vSpacer3);
            }
            panel1.add(login_pass_panel);
            panel1.add(hSpacer2);
        }
        contentPane.add(panel1, BorderLayout.CENTER);

        //======== panel2 ========
        {
            panel2.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
            panel2.setLayout(new GridLayout(1, 4));

            //---- checkBox1 ----
            checkBox1.setText(bundle.getString("internet_checker_label"));
            checkBox1.setFocusable(false);
            checkBox1.setEnabled(false);
            panel2.add(checkBox1);

            //---- checkBox2 ----
            checkBox2.setText("text");
            panel2.add(checkBox2);

            //---- checkBox3 ----
            checkBox3.setText("text");
            panel2.add(checkBox3);

            //---- checkBox4 ----
            checkBox4.setText("text");
            panel2.add(checkBox4);
        }
        contentPane.add(panel2, BorderLayout.PAGE_END);
        setSize(400, 405);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JPanel hSpacer1;
    private JPanel login_pass_panel;
    private JPanel vSpacer2;
    private JLabel label1;
    private JTextField loginField;
    private JLabel label2;
    private JTextField passField;
    private JButton enterButton;
    private JPanel vSpacer3;
    private JPanel hSpacer2;
    private JPanel panel2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
