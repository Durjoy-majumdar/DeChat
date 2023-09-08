package com.tencent.p014mm.plugin.voip.p475ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.tencent.mm.plugin.voip.ui.n0 */
public final class C71599n0 extends ViewOutlineProvider {

    /* renamed from: a */
    public float f207500a;

    public C71599n0(float f) {
        this.f207500a = f;
    }

    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        if (view != null) {
            view.getDrawingRect(rect);
        }
        Rect rect2 = new Rect(0, 0, (rect.right - rect.left) - 0, (rect.bottom - rect.top) - 0);
        if (outline != null) {
            outline.setRoundRect(rect2, this.f207500a);
        }
    }
}
