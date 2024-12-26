import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TravelManagementSystem extends JFrame implements ActionListener {

    // Labels
    private JLabel lblTitle, lblCustomerDetails, lblFirstName, lblSurname, lblAddress, lblPostCode, lblMobile1,
            lblMobile2, lblEmail, lblTravelDetails, lblChoosePackage, lblChoosePlace, lblAccommodation,
            lblHowManyPersons, lblPlacePrice, lblRalTax, lblTravellingInsurance, lblExtLuggage, lblPaidTax, lblSubTotal,
            lblTotalCost, lblReceipt;

    // Text fields
    private JTextField txtFirstName, txtSurname, txtAddress, txtPostCode, txtMobile1, txtMobile2, txtEmail,
            txtChoosePackage, txtChoosePlace, txtAccommodation, txtHowManyPersons, txtPlacePrice;

    // Check boxes
    private JCheckBox chkStandard, chkEconomy, chkFirstClass, chkSingle, chkReturn, chkSpecialNeeds, chkRalTax,
            chkTravellingInsurance, chkExtLuggage;

    // Combo boxes
    private JComboBox cmbChoosePackage, cmbChoosePlace, cmbAccommodation;

    // Text areas
    private JTextArea txtReceipt;

    // Buttons
    private JButton btnTotal, btnReceipt, btnReset, btnPrint, btnExit;

    // Constructor
    public TravelManagementSystem() {
        // Set up the frame
        setTitle("MK Travels System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create the title label
        lblTitle = new JLabel("MK Travels System");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(150, 20, 500, 50);
        add(lblTitle);

        // Create the customer details panel
        JPanel pnlCustomerDetails = new JPanel();
        pnlCustomerDetails.setLayout(null);
        pnlCustomerDetails.setBounds(20, 100, 250, 250);
        add(pnlCustomerDetails);

        // Create the customer details labels
        lblCustomerDetails = new JLabel("Customer Details");
        lblCustomerDetails.setBounds(10, 10, 230, 30);
        pnlCustomerDetails.add(lblCustomerDetails);

        lblFirstName = new JLabel("First Name:");
        lblFirstName.setBounds(10, 50, 100, 30);
        pnlCustomerDetails.add(lblFirstName);

        lblSurname = new JLabel("Surname:");
        lblSurname.setBounds(10, 90, 100, 30);
        pnlCustomerDetails.add(lblSurname);

        lblAddress = new JLabel("Address:");
        lblAddress.setBounds(10, 130, 100, 30);
        pnlCustomerDetails.add(lblAddress);

        lblPostCode = new JLabel("Post Code:");
        lblPostCode.setBounds(10, 170, 100, 30);
        pnlCustomerDetails.add(lblPostCode);

        lblMobile1 = new JLabel("Mobile 1:");
        lblMobile1.setBounds(10, 210, 100, 30);
        pnlCustomerDetails.add(lblMobile1);

        lblMobile2 = new JLabel("Mobile 2:");
        lblMobile2.setBounds(10, 250, 100, 30);
        pnlCustomerDetails.add(lblMobile2);

        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(10, 290, 100, 30);
        pnlCustomerDetails.add(lblEmail);

        // Create the text fields
        txtFirstName = new JTextField();
        txtFirstName.setBounds(120, 50, 120, 30);
        pnlCustomerDetails.add(txtFirstName);

        txtSurname = new JTextField();
        txtSurname.setBounds(120, 90, 120, 30);
        pnlCustomerDetails.add(txtSurname);

        txtAddress = new JTextField();
        txtAddress.setBounds(120, 130, 120, 30);
        pnlCustomerDetails.add(txtAddress);

        txtPostCode = new JTextField();
        txtPostCode.setBounds(120, 170, 120, 30);
        pnlCustomerDetails.add(txtPostCode);

        txtMobile1 = new JTextField();
        txtMobile1.setBounds(120, 210, 120, 30);
        pnlCustomerDetails.add(txtMobile1);

        txtMobile2 = new JTextField();
        txtMobile2.setBounds(120, 250, 120, 30);
        pnlCustomerDetails.add(txtMobile2);

        txtEmail = new JTextField();
        txtEmail.setBounds(120, 290, 120, 30);
        pnlCustomerDetails.add(txtEmail);

        // Create the travel details panel
        JPanel pnlTravelDetails = new JPanel();
        pnlTravelDetails.setLayout(null);
        pnlTravelDetails.setBounds(300, 100, 450, 400);
        add(pnlTravelDetails);

        // Create the travel details labels
        lblTravelDetails = new JLabel("Travel Details");
        lblTravelDetails.setBounds(10, 10, 200, 30);
        pnlTravelDetails.add(lblTravelDetails);

        lblChoosePackage = new JLabel("Choose Package:");
        lblChoosePackage.setBounds(10, 50, 150, 30);
        pnlTravelDetails.add(lblChoosePackage);

        lblChoosePlace = new JLabel("Choose Place:");
        lblChoosePlace.setBounds(10, 90, 150, 30);
        pnlTravelDetails.add(lblChoosePlace);

        lblAccommodation = new JLabel("Accommodation:");
        lblAccommodation.setBounds(10, 130, 150, 30);
        pnlTravelDetails.add(lblAccommodation);

        lblHowManyPersons = new JLabel("How Many Persons:");
        lblHowManyPersons.setBounds(10, 170, 150, 30);
        pnlTravelDetails.add(lblHowManyPersons);

        // Create the combo boxes
        cmbChoosePackage = new JComboBox(new String[] { "Package 1", "Package 2", "Package 3" });
        cmbChoosePackage.setBounds(180, 50, 200, 30);
        pnlTravelDetails.add(cmbChoosePackage);

        cmbChoosePlace = new JComboBox(new String[] { "Place 1", "Place 2", "Place 3" });
        cmbChoosePlace.setBounds(180, 90, 200, 30);
        pnlTravelDetails.add(cmbChoosePlace);

        cmbAccommodation = new JComboBox(new String[] { "Hotel", "Hostel", "Apartment" });
        cmbAccommodation.setBounds(180, 130, 200, 30);
        pnlTravelDetails.add(cmbAccommodation);

        txtHowManyPersons = new JTextField();
        txtHowManyPersons.setBounds(180, 170, 200, 30);
        pnlTravelDetails.add(txtHowManyPersons);

        // Create buttons
        btnTotal = new JButton("Calculate Total");
        btnTotal.setBounds(10, 220, 150, 30);
        btnTotal.addActionListener(this);
        pnlTravelDetails.add(btnTotal);

        btnReceipt = new JButton("Generate Receipt");
        btnReceipt.setBounds(180, 220, 150, 30);
        btnReceipt.addActionListener(this);
        pnlTravelDetails.add(btnReceipt);

        btnReset = new JButton("Reset");
        btnReset.setBounds(350, 220, 150, 30);
        btnReset.addActionListener(this);
        pnlTravelDetails.add(btnReset);

        btnPrint = new JButton("Print");
        btnPrint.setBounds(10, 260, 150, 30);
        btnPrint.addActionListener(this);
        pnlTravelDetails.add(btnPrint);

        btnExit = new JButton("Exit");
        btnExit.setBounds(180, 260, 150, 30);
        btnExit.addActionListener(this);
        pnlTravelDetails.add(btnExit);

        // Create the receipt area
        txtReceipt = new JTextArea();
        txtReceipt.setBounds(20, 320, 700, 200);
        txtReceipt.setEditable(false);
        add(txtReceipt);

        // Set the background color
        pnlCustomerDetails.setBackground(Color.LIGHT_GRAY);
        pnlTravelDetails.setBackground(Color.LIGHT_GRAY);
        getContentPane().setBackground(Color.DARK_GRAY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTotal) {
            // Calculate total cost logic here
        } else if (e.getSource() == btnReceipt) {
            // Generate receipt logic here
        } else if (e.getSource() == btnReset) {
            // Reset fields logic here
        } else if (e.getSource() == btnPrint) {
            // Print logic here
        } else if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        TravelManagementSystem tms = new TravelManagementSystem();
        tms.setVisible(true);
    }
}