package model.Place;

import java.util.List;

/**
 * Created by SAWANTIP on 13/10/2560.
 */
public class Opening_hours {
    private boolean open_now;
    private List<String> weekday_text;

    public boolean isOpen_now() {
        return open_now;
    }

    public void setOpen_now(boolean open_now) {
        this.open_now = open_now;
    }

    public List<String> getWeekday_text() {
        return weekday_text;
    }

    public void setWeekday_text(List<String> weekday_text) {
        this.weekday_text = weekday_text;
    }
}
