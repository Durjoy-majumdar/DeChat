package com.tencent.map.lib.models;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p1108f3.C107453d;
import p849e3.C107166a;
import p849e3.C107207u;
import p905j3.C108539a;

public abstract class MapExploreByTouchHelper extends C108539a {
    public static final int MAP_ACTION_CLICKED = 1;
    public static final int NO_ITEM = -1;
    public List<AccessibleTouchItem> accessibleTouchItems = new ArrayList();

    public MapExploreByTouchHelper(View view) {
        super(view);
    }

    public abstract int getTargetPoiItemIdx(float f, float f2);

    public int getVirtualViewAt(float f, float f2) {
        int targetPoiItemIdx = getTargetPoiItemIdx(f, f2);
        if (targetPoiItemIdx == -1) {
            return Integer.MIN_VALUE;
        }
        return targetPoiItemIdx;
    }

    public void getVisibleVirtualViews(List<Integer> list) {
        for (int i = 0; i < this.accessibleTouchItems.size(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    public abstract boolean onItemClicked(int i);

    public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        if (i2 == 16) {
            return onItemClicked(i);
        }
        return false;
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        if (i >= this.accessibleTouchItems.size()) {
            accessibilityEvent.getText().add("");
            return;
        }
        AccessibleTouchItem accessibleTouchItem = this.accessibleTouchItems.get(i);
        if (accessibleTouchItem != null) {
            accessibilityEvent.getText().add(accessibleTouchItem.getContentDescription());
            return;
        }
        throw new IllegalArgumentException("Invalid virtual view id");
    }

    public void onPopulateNodeForVirtualView(int i, C107453d dVar) {
        if (i >= this.accessibleTouchItems.size()) {
            dVar.mo157866y("");
            dVar.mo157849i(new Rect());
            return;
        }
        AccessibleTouchItem accessibleTouchItem = this.accessibleTouchItems.get(i);
        if (accessibleTouchItem != null) {
            dVar.mo157866y(accessibleTouchItem.getContentDescription());
            dVar.mo157849i(accessibleTouchItem.getBounds());
            dVar.mo157839a(16);
            return;
        }
        throw new IllegalArgumentException("Invalid virtual view id");
    }

    public void onTalkBackActivate(View view) {
        C107207u.m145168i(view, this);
    }

    public void onTalkBackDeActivate(View view) {
        C107207u.m145168i(view, (C107166a) null);
    }
}
