package background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxColor extends JFrame implements ActionListener {
    private JPanel back;
    private JComboBox colorBox;
    private String[] color = {"Yellow", "Blue", "Red", "Black", "Green", "Gray"};

    ComboBoxColor() {

        setTitle("Change background color");
        setDefaultCloseOperation(3);
        setSize(300, 400);
        setLocation(600, 300);
        buildBox();
        add(back);
        setVisible(true);
    }

    private void buildBox() {
        back = new JPanel();
        colorBox = new JComboBox(color);
        back.add(colorBox);
        back.setBackground(Color.yellow);

        colorBox.addActionListener(this);
        // this

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (colorBox.getSelectedItem() == "Red") {
            back.setBackground(Color.red);
        } else if (colorBox.getSelectedItem() == "Yellow") {
            back.setBackground(Color.yellow);
        } else if (colorBox.getSelectedItem() == "Blue") {
            back.setBackground(Color.blue);
        }else if (colorBox.getSelectedItem() == "Black") {
            back.setBackground(Color.black);
        }else if (colorBox.getSelectedItem() == "Green") {
            back.setBackground(Color.green);
        }else if (colorBox.getSelectedItem() == "Gray") {
            back.setBackground(Color.gray);
        }
    }

        public static void main (String[]args){
            new ComboBoxColor();
        }
    }
