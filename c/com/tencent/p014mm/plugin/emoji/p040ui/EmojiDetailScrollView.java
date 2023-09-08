package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDetailScrollView */
public class EmojiDetailScrollView extends ScrollView {

    /* renamed from: d */
    public boolean f12238d;

    public EmojiDetailScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f12238d) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f12238d = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    public void requestChildFocus(View view, View view2) {
    }

    public void requestLayout() {
        this.f12238d = false;
        super.requestLayout();
    }

    public void scrollBy(int i, int i2) {
    }

    public void scrollTo(int i, int i2) {
        this.f12238d = true;
    }

    public void setScrollEnable(boolean z) {
        this.f12238d = z;
    }

    public EmojiDetailScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12238d = true;
        setFadingEdgeLength(0);
    }
}
