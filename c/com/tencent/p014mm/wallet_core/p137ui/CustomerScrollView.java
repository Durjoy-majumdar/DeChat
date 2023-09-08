package com.tencent.p014mm.wallet_core.p137ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* renamed from: com.tencent.mm.wallet_core.ui.CustomerScrollView */
public class CustomerScrollView extends ScrollView {

    /* renamed from: d */
    public float f24990d;

    /* renamed from: e */
    public float f24991e;

    /* renamed from: f */
    public float f24992f;

    /* renamed from: g */
    public float f24993g;

    public CustomerScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f24991e = 0.0f;
            this.f24990d = 0.0f;
            this.f24992f = motionEvent.getX();
            this.f24993g = motionEvent.getY();
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f24990d += Math.abs(x - this.f24992f);
            float abs = this.f24991e + Math.abs(y - this.f24993g);
            this.f24991e = abs;
            this.f24992f = x;
            this.f24993g = y;
            if (this.f24990d > abs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public CustomerScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
