package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.view.HardTouchableLayout;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.n1 */
public final class C56404n1 implements HardTouchableLayout.C7077f {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f161250a;

    public C56404n1(View.OnClickListener onClickListener) {
        this.f161250a = onClickListener;
    }

    /* renamed from: a */
    public void mo2341a(View view, MotionEvent motionEvent) {
        C87412m.m108594g(view, "view");
        this.f161250a.onClick(view);
    }
}
