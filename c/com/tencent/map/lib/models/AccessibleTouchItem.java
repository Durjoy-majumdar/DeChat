package com.tencent.map.lib.models;

import android.graphics.Rect;

public abstract class AccessibleTouchItem implements Comparable<AccessibleTouchItem> {
    public static final String MAP_DEFAULT_CONTENT_DESCRIPTION = "地图";
    public static final int MIN_TOUCH_RADIUS = 20;
    public static final String MY_LOCATION_PREFIX = "我的位置";

    public abstract Rect getBounds();

    public abstract String getContentDescription();

    public abstract void onClick();

    public int compareTo(AccessibleTouchItem accessibleTouchItem) {
        Rect bounds = getBounds();
        Rect bounds2 = accessibleTouchItem.getBounds();
        int i = bounds.top;
        int i2 = bounds2.top;
        if (i != i2) {
            return i - i2;
        }
        return bounds.left - bounds2.left;
    }
}
