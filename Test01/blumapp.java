package Test01;
//필요한 Swing 컴포넌트를 임포트합니다.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//blumapp 클래스 정의
public class blumapp {

    public static void createAndShowGUI() {
        // 프레임 생성
        JFrame frame = new JFrame("Blum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // 메인 패널 추가
        MainPanel mainPanel = new MainPanel();
        frame.add(mainPanel);


        // 프레임 사이즈 설정 및 화면 가운데에 위치
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}