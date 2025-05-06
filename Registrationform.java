import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame extends JFrame implements ActionListener {
    private Container container;
    private JLabel title, name, fname, mno, gender, dob, address;
    private JTextField tname, tfname, tmno;
    private JRadioButton male, female;
    private ButtonGroup genderGroup;
    private JComboBox date, month, year;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton submit, reset;

    private String[] dates = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                               "11", "12", "13", "14", "15", "16", "17", "18", "19",
                               "20", "21", "22", "23", "24", "25", "26", "27", "28",
                               "29", "30", "31" };
    private String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    private String[] years = { "2000", "2001", "2002", "2003", "2004", "2005" };

    public Frame() {
        setTitle("Registration Form");
        setBounds(90, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        // Title
        title = new JLabel("Student Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(500, 35);
        title.setLocation(250, 30);
        container.add(title);

        // Name
        name = new JLabel("Student Name:");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(150, 25);
        name.setLocation(100, 100);
        container.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(200, 25);
        tname.setLocation(300, 100);
        container.add(tname);

        // Father's Name
        fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Arial", Font.PLAIN, 20));
        fname.setSize(150, 25);
        fname.setLocation(100, 140);
        container.add(fname);

        tfname = new JTextField();
        tfname.setFont(new Font("Arial", Font.PLAIN, 15));
        tfname.setSize(200, 25);
        tfname.setLocation(300, 140);
        container.add(tfname);

        // Mobile
        mno = new JLabel("Mobile Number:");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(150, 25);
        mno.setLocation(100, 180);
        container.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(200, 25);
        tmno.setLocation(300, 180);
        container.add(tmno);

        // Gender
        gender = new JLabel("Gender:");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 25);
        gender.setLocation(100, 220);
        container.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 25);
        male.setLocation(300, 220);
        container.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 25);
        female.setLocation(375, 220);
        container.add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Date of Birth
        dob = new JLabel("DOB:");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 25);
        dob.setLocation(100, 260);
        container.add(dob);

        date = new JComboBox<>(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(60, 25);
        date.setLocation(300, 260);
        container.add(date);

        month = new JComboBox<>(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(80, 25);
        month.setLocation(370, 260);
        container.add(month);

        year = new JComboBox<>(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(80, 25);
        year.setLocation(460, 260);
        container.add(year);

        // Address
        address = new JLabel("Address:");
        address.setFont(new Font("Arial", Font.PLAIN, 20));
        address.setSize(100, 25);
        address.setLocation(100, 300);
        container.add(address);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(300, 300);
        tadd.setLineWrap(true);
        container.add(tadd);

        // Terms
        term = new JCheckBox("Accept Terms and Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 25);
        term.setLocation(150, 400);
        container.add(term);

        // Submit Button
        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100, 30);
        submit.setLocation(150, 450);
        submit.addActionListener(this);
        container.add(submit);

        // Reset Button
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 30);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        container.add(reset);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            if (!term.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please accept the terms and conditions.");
                return;
            }

            String genderSelected = male.isSelected() ? "Male" : "Female";

            String info = "Name: " + tname.getText() +
                          "\nFather's Name: " + tfname.getText() +
                          "\nMobile: " + tmno.getText() +
                          "\nGender: " + genderSelected +
                          "\nDOB: " + date.getSelectedItem() + "-" +
                                      month.getSelectedItem() + "-" +
                                      year.getSelectedItem() +
                          "\nAddress: " + tadd.getText();

            JOptionPane.showMessageDialog(this, info, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == reset) {
            tname.setText("");
            tfname.setText("");
            tmno.setText("");
            tadd.setText("");
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            male.setSelected(true);
            term.setSelected(false);
        }
    }
}

public class Registrationform {
    public static void main(String[] args) {
        new Frame();
    }
}
