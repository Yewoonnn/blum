package Test01;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LogIn extends JFrame {
    public LogIn() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel label = new JLabel("ID: ");
        JLabel pswrd = new JLabel("Password: ");
        JTextField txtID = new JTextField(15); // 텍스트 필드 크기 조정
        JPasswordField txtPass = new JPasswordField(15); // 비밀번호 필드 크기 조정
        JButton logBtn = new JButton("Log In");

        gbc.insets = new Insets(4, 4, 4, 4); // 마진 조정

        // ID 레이블
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);

        // ID 입력 필드
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(txtID, gbc);

        // Password 레이블
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(pswrd, gbc);

        // Password 입력 필드
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(txtPass, gbc);

        // 로그인 버튼
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // 버튼 너비를 두 컬럼으로 확장
        gbc.fill = GridBagConstraints.HORIZONTAL; // 버튼을 가로로 채우기
        panel.add(logBtn, gbc);

        logBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String id = "blum";
                String pass = "1234";

                if (id.equals(txtID.getText()) && pass.equals(new String(txtPass.getPassword()))) {
                    JOptionPane.showMessageDialog(null, "You have logged in successfully");
                    panel.setVisible(false);
                    new MainPanel2();


                } else {
                    JOptionPane.showMessageDialog(null, "You failed to log in");
                }

            }

        });
        add(panel); // 프레임에 패널 넣기

        setVisible(true); // 프레임 보이게
        setSize(800,640); // 사이즈
        setPreferredSize(new Dimension(1200,800));
        setLocationRelativeTo(null); // 스크린 가운데
        setResizable(false); // 사이즈 고정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String args[]) {
        new LogIn();
    }
}