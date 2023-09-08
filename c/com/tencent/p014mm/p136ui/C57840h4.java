package com.tencent.p014mm.p136ui;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import gy3.C87412m;

/* renamed from: com.tencent.mm.ui.h4 */
public final class C57840h4 extends TouchDelegate {

    /* renamed from: a */
    public View f165469a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57840h4(Rect rect, View view) {
        super(rect, view);
        C87412m.m108594g(rect, "bounds");
        C87412m.m108594g(view, "delegateView");
        this.f165469a = view;
    }
}
