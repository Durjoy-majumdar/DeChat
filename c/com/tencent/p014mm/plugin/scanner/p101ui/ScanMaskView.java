package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanMaskView */
public class ScanMaskView extends View {

    /* renamed from: d */
    public int f20590d = 300;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanMaskView$a */
    public interface C5168a {
    }

    public ScanMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Path();
    }

    public int getMaskAnimDuration() {
        return this.f20590d;
    }

    public Rect getMaskRect() {
        return null;
    }

    public void onDraw(Canvas canvas) {
    }

    public void setMaskAnimaListener(C5168a aVar) {
    }

    public void setMaskColorRsid(int i) {
    }

    public void setMastAnimaDuration(int i) {
        this.f20590d = i;
    }
}
