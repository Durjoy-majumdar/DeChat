package com.tencent.p014mm.p136ui.widget.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: com.tencent.mm.ui.widget.listview.OverScrollListView */
public class OverScrollListView extends ListView {

    /* renamed from: d */
    public int f220620d;

    /* renamed from: e */
    public float f220621e;

    public OverScrollListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f220621e = motionEvent.getY(0);
        } else if (action == 2) {
            this.f220620d = (int) Math.abs(motionEvent.getY(0) - this.f220621e);
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        C85975v4.m106304a("OverScrollListView", "dancy test maxOverScrollYDis: %s", Integer.valueOf(this.f220620d));
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, this.f220620d / 2, z);
    }

    public OverScrollListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
