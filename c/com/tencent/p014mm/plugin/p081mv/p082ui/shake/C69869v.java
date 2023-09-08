package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.v */
public class C69869v extends ViewOutlineProvider {

    /* renamed from: a */
    public int f201591a;

    public C69869v(int i) {
        this.f201591a = i;
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), (float) this.f201591a);
    }
}
