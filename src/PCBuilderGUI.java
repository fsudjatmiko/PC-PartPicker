import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PCBuilderGUI {
    private JFrame frame;
    private JTextField budgetField;
    private JButton buildButton;
    private JTextArea resultArea;

    public PCBuilderGUI() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("PC Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Budget:"));
        budgetField = new JTextField(10);
        inputPanel.add(budgetField);
        buildButton = new JButton("Build");
        buildButton.addActionListener(new BuildButtonListener());
        inputPanel.add(buildButton);
        frame.add(inputPanel, BorderLayout.NORTH);

        resultArea = new JTextArea(20, 40);
        resultArea.setEditable(false);
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private class BuildButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int budget = Integer.parseInt(budgetField.getText());
            PCBuilder builder = new PCBuilder();
            Component cpu = builder.getBestComponent("CPU", budget / 4);
            Component gpu = builder.getBestComponent("GPU", budget / 4);
            Component ram = builder.getBestComponent("RAM", budget / 8);
            Component storage = builder.getBestComponent("Storage", budget / 8);
            Component psu = builder.getBestComponent("PSU", budget / 8);
            Component cooling = builder.getBestComponent("Cooling", budget / 8);

            StringBuilder result = new StringBuilder();
            result.append("CPU: ").append(cpu.getName()).append("\n");
            result.append("GPU: ").append(gpu.getName()).append("\n");
            result.append("RAM: ").append(ram.getName()).append("\n");
            result.append("Storage: ").append(storage.getName()).append("\n");
            result.append("PSU: ").append(psu.getName()).append("\n");
            result.append("Cooling: ").append(cooling.getName()).append("\n");

            resultArea.setText(result.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("Running Program ...");
        new PCBuilderGUI();
    }
}