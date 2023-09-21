import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu extends JFrame {
    String keyvalue;
 String key1 = "1";
 String key2 = "2";
 String key3 = "3";
 String key4 = "4";
 String key5 = "5";
 String key6 = "6";
 String key7 = "7";
 String key8 = "8";
 String key9 = "9";
 String key0 = "0";
    String key_add = "+";
    String key_sub = "-";
    String key_mul = "X";
    String key_div = "/";
 String displayvalue = "";
  String mainvalue = "";
 double totalvalue = 0;

    private JPanel panel1;
    private JLabel usertext;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a2Button;
    private JButton a7Button;
    private JButton CLEARButton;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton DONEButton;
    private JButton button1;
    private JButton button2;
    private JButton xButton;
    private JButton divButton;
    private JButton a0Button;
    private JButton buttonADD;

    public calcu() {
        setContentPane(panel1);
        setTitle("Pv Calculator");
        setSize(700, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                keyvalue = "1";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue= " ";
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                keyvalue = "2";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue= " ";
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                keyvalue = "3";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue= " ";
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                keyvalue = "4";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue= " ";
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyvalue = "5";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue = " ";
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyvalue = "6";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue = " ";
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyvalue = "7";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue = " ";
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyvalue = "8";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue = " ";
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyvalue = "9";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue = " ";
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyvalue = "0";
                mainvalue = mainvalue+keyvalue;
                displayvalue = displayvalue+keyvalue;
                usertext.setText(displayvalue);
                //displayvalue = " ";
            }
        });
        final int[] lastopp = {0};
        final int[] fvalad = {1234};
        final int[] fvalmu = {1234};
        final int[] fvalsu = {1234};
        final int[] fvaldi = {1234};
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fvalad[0] == 1234){
                    double fsvalue = (Double.parseDouble(mainvalue));
                    totalvalue = fsvalue;
                    displayvalue = displayvalue + key_add;
                    usertext.setText(displayvalue);
                    keyvalue = "";
                    mainvalue = "";
                    fvalad[0] = 4321;
                    lastopp[0] = 1;
                }
                else {
                    double advalue = (Double.parseDouble(mainvalue));
                    totalvalue = totalvalue + advalue;
                    displayvalue = displayvalue + key_add;
                    usertext.setText(displayvalue);
                    keyvalue = "";
                    mainvalue = "";
                    lastopp[0] = 1;
                }
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fvalmu[0] == 1234){
                    double fsvalue = (Double.parseDouble(mainvalue));
                    totalvalue = fsvalue;
                    displayvalue = displayvalue + key_mul;
                    usertext.setText(displayvalue);
                    keyvalue = "";
                    mainvalue = "";
                    fvalmu[0] = 4321;
                    lastopp[0] = 2;
                }
                else {
                    double advalue = (Double.parseDouble(mainvalue));
                    totalvalue = totalvalue * advalue;
                    displayvalue = displayvalue + key_mul;
                    usertext.setText(displayvalue);
                    keyvalue = "";
                    mainvalue = "";
                    lastopp[0] = 2;
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fvalsu[0] == 1234){
                    double fsvalue = (Double.parseDouble(mainvalue));
                    totalvalue = fsvalue;
                    displayvalue = displayvalue + key_sub;
                    usertext.setText(displayvalue);
                    keyvalue = "";
                    mainvalue = "";
                    fvalsu[0] = 4321;
                    lastopp[0] = 3;
                }
                else {
                    double advalue = (Double.parseDouble(mainvalue));
                    totalvalue = totalvalue - advalue;
                    displayvalue = displayvalue + key_sub;
                    usertext.setText(displayvalue);
                    keyvalue = "";
                    mainvalue = "";
                    lastopp[0] = 3;
                }
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fvaldi[0] == 1234){
                    double fsvalue = (Double.parseDouble(mainvalue));
                    totalvalue = fsvalue;
                    displayvalue = displayvalue + key_div;
                    usertext.setText(displayvalue);
                    keyvalue = "";
                    mainvalue = "";
                    fvaldi[0] = 4321;
                    lastopp[0] = 4;
                }
                else {
                    double advalue = (Double.parseDouble(mainvalue));
                    totalvalue = totalvalue / advalue;
                    displayvalue = displayvalue + key_div;
                    usertext.setText(displayvalue);
                    keyvalue = "";
                    mainvalue = "";
                    lastopp[0] = 4;
                }
            }
        });
        DONEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lastopp[0] == 1){
                    double advalue = (Double.parseDouble(mainvalue));
                    totalvalue = totalvalue + advalue;
                }
                if (lastopp[0] == 2){
                    double advalue = (Double.parseDouble(mainvalue));
                    totalvalue = totalvalue * advalue;
                }
                if (lastopp[0] == 3){
                    double advalue = (Double.parseDouble(mainvalue));
                    totalvalue = totalvalue - advalue;
                }
                if (lastopp[0] == 4){
                    double advalue = (Double.parseDouble(mainvalue));
                    totalvalue = totalvalue / advalue;
                    totalvalue = totalvalue / advalue;
                }
                String showvalue = Double.toString(totalvalue);
                usertext.setText(showvalue);
            }
        });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              keyvalue = "";
              mainvalue = "";
              displayvalue = "";
              totalvalue = 0;
                fvalad[0] = 1234;
                fvalmu[0] = 1234;
                fvalsu[0] = 1234;
                fvaldi[0] = 1234;
              usertext.setText("PV");
            }
        });
    }


    public static void main(String args[]){ calcu myFrame = new calcu();}

}
