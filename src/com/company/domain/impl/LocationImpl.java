package com.company.domain.impl;

import com.company.domain.Location;
import com.company.domain.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by semanticer on 3. 10. 2016.
 */
public class LocationImpl implements Location {

    public LocationImpl(String text) {
        // TODO set text and init empty List of options
    }

    @Override
    public List<Option> getOptions() {
        return null; // TODO
    }

    @Override
    public String getText() {
        return null; // TODO
    }

    @Override
    public void addOption(String text, Location targetLocation) {
        // TODO add new option to your list (first you need to implement option interface)
    }
}
