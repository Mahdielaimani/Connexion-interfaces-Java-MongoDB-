package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientView {
    private JFrame frame;
    private JLabel welcomeLabel;
    private JButton viewStockButton;
    private JButton buyProductButton;

    public ClientView(String firstName, String lastName) {
        frame = new JFrame("Dashboard");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        welcomeLabel = new JLabel("Welcome, " + firstName + " " + lastName + "!");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        viewStockButton = new JButton("View Article");
        buyProductButton = new JButton("Buy Product");

        panel.add(welcomeLabel);
        panel.add(viewStockButton);
        panel.add(buyProductButton);

        frame.add(panel);

        frame.setVisible(true);
    }

    protected void openStockDashboard() {
        System.out.println("Stock Dashboard...");
    }

    private void buyProduct() {
        // Show loading screen for 3 seconds
        showLoadingScreen();

        // After loading, show the product in Livraison
        showProductInLivraison();
    }

    private void showLoadingScreen() {
        JOptionPane.showMessageDialog(frame, "Processing your request. Please wait...", "Loading", JOptionPane.INFORMATION_MESSAGE);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void showProductInLivraison() {
        JOptionPane.showMessageDialog(frame, "Product successfully purchased! Showing in Livraison.", "Purchase Complete", JOptionPane.INFORMATION_MESSAGE);
    }

    
}
