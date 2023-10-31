package week5;
import week5.NationalService;

import javax.swing.plaf.IconUIResource;

public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService(){
        this.daysLeft = daysLeft;
        daysLeft = 362;
    }
    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
    if (daysLeft > 0){
        daysLeft = daysLeft -1;
    }
        System.out.println("YOU HAVE TO STOP, YOU HAVE NO DAYS LEFT! ");
    }

}
