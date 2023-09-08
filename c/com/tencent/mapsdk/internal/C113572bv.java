package com.tencent.mapsdk.internal;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.tencent.mapsdk.internal.bv */
public interface C113572bv {
    /* renamed from: a */
    void mo171857a();

    /* renamed from: a */
    void mo171858a(float f);

    /* renamed from: a */
    void mo171859a(Object obj, int i, int i2);

    /* renamed from: b */
    void mo171860b();

    /* renamed from: c */
    void mo171861c();

    /* renamed from: d */
    void mo171862d();

    /* renamed from: e */
    boolean mo171863e();

    int getHeight();

    View getView();

    int getWidth();

    void onSizeChanged(int i, int i2, int i3, int i4);

    boolean onTouchEvent(MotionEvent motionEvent);

    void setMapOpaque(boolean z);

    void setZOrderMediaOverlay(boolean z);
}
