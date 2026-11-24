import assessments.AssessmentFeed;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentInfo{

    private final StudentInfo results = new StudentInfo();
    private final String[] studentNames = {AssessmentFeed.getStudentName()};
    private final String[] studentCID  = {AssessmentFeed.getStudentType()};
    private final JPanel[] panels = new JPanel[16];
    private final JLabel[] labels = new JLabel[5];
    private final JFrame frame = new JFrame("student results");

    public String StudentInfo(String cid, String name, String type) {
        JPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JPanel.add(JLabel);
        frame.add(JPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(new studentInfo() ;
        frame.setSize(420, 230);
        frame.setLocationByPlatform(true);
        updateReading();
        frame.setVisible(true);
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        updateReading();
    }
    return (StudentInfo);
    }
}
