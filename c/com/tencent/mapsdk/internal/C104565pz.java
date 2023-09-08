package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: com.tencent.mapsdk.internal.pz */
public final class C104565pz extends View {

    /* renamed from: a */
    public C104564py f309962a;

    public C104565pz(Context context) {
        super(context);
        C104564py pyVar = new C104564py();
        this.f309962a = pyVar;
        setBackground(pyVar);
        this.f309962a.mo147888a(getResources().getDisplayMetrics().density * 1.0f);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f309962a.setBounds(0, 0, i3 - i, i4 - i2);
    }

    public final void setActivate(boolean z) {
        C104564py pyVar = this.f309962a;
        if (pyVar != null) {
            pyVar.f309959a = z;
            postInvalidate();
        }
    }

    public final void setArrowStrokeWidth(float f) {
        C104564py pyVar = this.f309962a;
        if (pyVar != null) {
            pyVar.mo147888a(f);
            postInvalidate();
        }
    }

    public final void setDarkStyle(boolean z) {
        this.f309962a.f309960b = z;
        invalidate();
    }
}
