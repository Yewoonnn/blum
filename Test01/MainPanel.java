package Test01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JFrame {

    public MainPanel() {
        setTitle("쇼핑몰 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 640); // 창 크기를 800x640으로 설정
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel logoLabel = new JLabel("로고", SwingConstants.CENTER);
        JLabel bannerLabel = new JLabel("메인 배너", SwingConstants.CENTER);
        bannerLabel.setFont(new Font("HY견고딕", Font.BOLD, 20));

        JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton loginButton = new JButton("로그인 / 회원가입");
        loginPanel.add(loginButton);

        topPanel.add(logoLabel, BorderLayout.NORTH);
        topPanel.add(bannerLabel, BorderLayout.CENTER);
        topPanel.add(loginPanel, BorderLayout.EAST);

        topPanel.setPreferredSize(new Dimension(800, 160)); // 상단 패널의 선호 크기를 조정

        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        String[] buttonTexts = {"상품 1", "상품 2", "상품 3", "상품 4", "상품 5", "상품 6", "상품 7", "상품 8"};
        Dimension buttonSize = new Dimension(150, 150); // 상품 버튼의 크기를 150x150으로 조정

        for (int i = 0; i < 8; i++) {
            JButton button;
            if (i == 0) { // 첫 번째 버튼에만 특정 이미지 적용
                ImageIcon icon = new ImageIcon("C:\\blum\\Day02\\image\\bini.jpg"); // 'yourImagePath.png'를 원하는 이미지 경로로 변경하세요.
                button = new JButton(icon);

            } else {
                button = new JButton(buttonTexts[i]);
            }
            button.setPreferredSize(buttonSize); // 버튼 크기 설정
            JLabel label = new JLabel(buttonTexts[i]);
            gbc.gridx = i % 4;
            gbc.gridy = i / 4 * 2;
            centerPanel.add(button, gbc);
            gbc.gridy += 1;
            centerPanel.add(label, gbc);
        }

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        this.add(mainPanel);

        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainPanel.setVisible(false);
                LogIn loginFrame = new LogIn();
            }
        });

    }

    public static void main(String[] args) {
        new MainPanel();
    }
}