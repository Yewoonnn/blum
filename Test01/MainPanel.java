package Test01;

/*import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

    public MainPanel() {
        JButton btnNewButton1 = new JButton("상품 1: 컴퓨터");
        JButton btnNewButton2 = new JButton("상품 2: 마우스");
        JButton btnNewButton3= new JButton("상품 3: 키보드");

        btnNewButton1.setBounds(100, 100, 100, 100);
        btnNewButton2.setBounds(100, 100, 100, 100);
        btnNewButton3.setBounds(100, 100, 100, 100);

        add(btnNewButton1);
        // 상품 목록 예시
       // add(new JLabel("상품 1: 컴퓨터"));
        //add(new JLabel("상품 2: 마우스"));
        //add(new JLabel("상품 3: 키보드"));
        // 여기에 더 많은 UI 컴포넌트를 추가할 수 있습니다.
    }
}
*/

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {

    public MainPanel() {
        setTitle("쇼핑몰 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800); // 프레임 크기 설정
        setLocationRelativeTo(null);

        // 상단 영역 (로고와 메인 배너를 위한 공간)
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel logoLabel = new JLabel("로고", SwingConstants.CENTER); // 로고 라벨 (실제 로고 이미지로 대체)
        JLabel bannerLabel = new JLabel("메인 배너", SwingConstants.CENTER); // 배너 라벨 (실제 배너 이미지로 대체)
        topPanel.add(logoLabel, BorderLayout.NORTH);
        topPanel.add(bannerLabel, BorderLayout.CENTER);
        topPanel.setPreferredSize(new Dimension(1200, 200)); // 상단 패널 크기 설정

        // 상품 버튼을 배치할 중앙 영역
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // 컴포넌트 간격 설정

        String[] buttonTexts = {"상품 1", "상품 2", "상품 3", "상품 4", "상품 5", "상품 6", "상품 7", "상품 8"};

        // 버튼 크기를 조금 더 크게 조정
        Dimension buttonSize = new Dimension(200, 200);

        for (int i = 0; i < 8; i++) {
            ImageIcon icon = new ImageIcon("image1" + (i + 1) + ".png");
            JButton button = new JButton(icon);
            button.setPreferredSize(buttonSize); // 버튼 크기 설정

            JLabel label = new JLabel(buttonTexts[i]);

            gbc.gridx = i % 4;
            gbc.gridy = i / 4 * 2;
            centerPanel.add(button, gbc);

            gbc.gridy += 1;
            centerPanel.add(label, gbc);
        }

        // 프레임에 상단 패널과 중앙 패널 추가
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainPanel();
    }
}