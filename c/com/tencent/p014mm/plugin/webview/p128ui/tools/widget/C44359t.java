package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.t */
public final class C44359t extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ float f120214a;

    public C44359t(float f) {
        this.f120214a = f;
    }

    public void getOutline(View view, Outline outline) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(outline, "outline");
        int width = view.getWidth();
        float f = this.f120214a;
        outline.setRoundRect(0, 0, width, (int) (((float) view.getHeight()) + f), f);
    }
}
