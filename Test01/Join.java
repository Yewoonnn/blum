package Test01;

import javax.swing.*;
import java.awt.*;

import static jdk.internal.misc.OSEnvironment.initialize;

public class Join {

	private JFrame frame;
	private JTextField name;
	private JTextField age;
	private JTextField phone;
	private JTextField birthday;
	private JTextField email;

	// 생성자
	public Join() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		JPanel signuppanel = new JPanel(); // 패널 생성
		signuppanel.setLayout(null);
		frame.getContentPane().add(signuppanel);
		frame.getContentPane().setFont(new Font("굴림", Font.BOLD, 12));
		frame.setBounds(100, 100, 800, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 21));
		lblNewLabel.setBounds(104, 141, 114, 41);
		frame.getContentPane().add(lblNewLabel);


		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 21));
		lblNewLabel_1.setBounds(104, 211, 114, 41);
		frame.getContentPane().add(lblNewLabel_1);


		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 21));
		lblNewLabel_2.setBounds(104, 275, 114, 41);
		frame.getContentPane().add(lblNewLabel_2);


		JLabel lblNewLabel_3 = new JLabel("Phone");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 21));
		lblNewLabel_3.setBounds(417, 141, 114, 41);
		frame.getContentPane().add(lblNewLabel_3);


		JLabel lblBrithday = new JLabel("Brithday");
		lblBrithday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrithday.setFont(new Font("굴림", Font.BOLD, 21));
		lblBrithday.setBounds(417, 211, 114, 41);
		frame.getContentPane().add(lblBrithday);


		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("굴림", Font.BOLD, 21));
		lblEmail.setBounds(417, 275, 114, 41);
		frame.getContentPane().add(lblEmail);


		name = new JTextField();
		name.setFont(new Font("굴림", Font.PLAIN, 17));
		name.setBounds(230, 143, 164, 41);
		frame.getContentPane().add(name);
		name.setColumns(10);
		signuppanel.add(name);

		age = new JTextField();
		age.setColumns(10);
		age.setBounds(230, 211, 164, 41);
		frame.getContentPane().add(age);
		signuppanel.add(age);

		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(544, 141, 164, 41);
		frame.getContentPane().add(phone);
		signuppanel.add(phone);

		birthday = new JTextField();
		birthday.setColumns(10);
		birthday.setBounds(544, 211, 164, 41);
		frame.getContentPane().add(birthday);
		signuppanel.add(birthday);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(544, 275, 164, 41);
		frame.getContentPane().add(email);


		JComboBox gender = new JComboBox(new String[] {"남자","여자"});
		gender.setFont(new Font("굴림", Font.BOLD, 17));
		gender.setBounds(230, 277, 164, 41);
		frame.getContentPane().add(gender);


		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton.setBounds(370, 402, 106, 41);
		frame.getContentPane().add(btnNewButton);


		frame.setVisible(true); // 이 부분을 추가하세요.

		frame.setSize(800, 640); // 사이즈
		frame.setPreferredSize(new Dimension(1200, 800));
		frame.setLocationRelativeTo(null); // 스크린 가운데
		frame.setResizable(false); // 사이즈 고정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String nameTxt = name.getText();
		String ageTxt = age.getText();
		String phoneTxt = phone.getText();
		String bTxt = birthday.getText();
		String eTxt = email.getText();
		String genderTxt = gender.getSelectedItem().toString();
	}
	public static void main(String[] args) {
		new Join();
	}
}
