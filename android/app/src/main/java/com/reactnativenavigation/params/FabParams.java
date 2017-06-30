package com.reactnativenavigation.params;

import android.graphics.drawable.Drawable;

import java.util.List;

public class FabParams {
    public Drawable collapsedIcon;
    public Drawable expendedIcon;
    public StyleParams.Color backgroundColor;
    public String collapsedId;
    public String expendedId;
    public String checkKey;
    public String navigatorEventId;
    public List<FabActionParams> actions;
    public String screenInstanceId;

    public boolean hasExpendedState() {
        return actions != null && actions.size() > 0;
    }

    public boolean isValid() {
        return collapsedId != null;
    }

    public boolean equalKey(FabParams fabParams) {
        if(fabParams.checkKey == null || checkKey == null) {
            return false;
        }
        
        return checkKey.equals(fabParams.checkKey);
    }
}
