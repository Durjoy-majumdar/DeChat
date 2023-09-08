package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.widget.BouncyHScrollView */
public class BouncyHScrollView extends HorizontalScrollView implements C111847h {

    /* renamed from: d */
    public Context f198342d;

    /* renamed from: e */
    public int f198343e;

    public BouncyHScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f198342d = context;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f198343e = (int) (this.f198342d.getResources().getDisplayMetrics().density * 300.0f);
        setOverScrollMode(0);
        setSmoothScrollingEnabled(true);
        setHorizontalFadingEdgeEnabled(false);
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, this.f198343e, i8, z);
    }

    public BouncyHScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f198342d = context;
    }
}
