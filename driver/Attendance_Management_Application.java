
package driver;

import design_panel.LoadingScreen;
import design_panel.Welcome;

public class Attendance_Management_Application {

    public static void main(String[] args) {
        // TODO code application logic here
        LoadingScreen loading = new LoadingScreen();
        loading.setVisible(true);
         for (int i = 0; i <= 100; i++) {
            loading.Loadingnum.setText(String.valueOf(i));
            loading.ProgressBar.setValue(i);
            //delay
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }//end loop        
        loading.setVisible(false);
        loading.dispose();
         new Welcome().setVisible(true);
    }
    
}
