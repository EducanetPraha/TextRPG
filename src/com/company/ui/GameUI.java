package com.company.ui;

import com.company.domain.Location;
import com.company.domain.Option;

import java.util.Scanner;

/**
 * Created by semanticer on 3. 10. 2016.
 */
public class GameUI {

    public void play(Location location) {
        if (location == null) {
            throw new IllegalArgumentException("startingLocation cannot be null");
        }


        presentLocation(location);
        if (location.getOptions() != null && location.getOptions().size() > 0) {
            Option selectedOption = askForMove(location);
            // TODO move to selected location, you can wrap this in loop or use recursion
        } else {
            System.out.println("The End");
        }
    }

    private void presentLocation(Location location) {
        System.out.println(location.getText());
        int index = 1;
        for (Option option : location.getOptions()) {
            System.out.println(index + ") " + option.getText());
            index++;
        }
    }

    private Option askForMove(Location location) {
        // TODO ask player for index of selected option and return it(option) back
        return null;
    }
}
