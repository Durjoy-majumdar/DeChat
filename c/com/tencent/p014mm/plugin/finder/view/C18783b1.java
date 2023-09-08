package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.b1 */
public final class C18783b1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f52567d;

    /* renamed from: e */
    public final /* synthetic */ FinderCollapsibleTextView f52568e;

    /* renamed from: f */
    public final /* synthetic */ CharSequence f52569f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f52570g;

    public C18783b1(View view, FinderCollapsibleTextView finderCollapsibleTextView, CharSequence charSequence, C32226l<? super Boolean, C13598b0> lVar) {
        this.f52567d = view;
        this.f52568e = finderCollapsibleTextView;
        this.f52569f = charSequence;
        this.f52570g = lVar;
    }

    public final void run() {
        int width = this.f52567d.getWidth();
        if (width > 0) {
            this.f52568e.getContentTextView().setLineEndExtraWidths(new float[]{(float) width});
        }
        this.f52568e.setText(this.f52569f);
        this.f52570g.invoke(Boolean.valueOf(this.f52568e.getContentTextView().f320006e));
        Context context = this.f52568e.getContext();
        C87412m.m108593f(context, "context");
        FinderCollapsibleTextView finderCollapsibleTextView = this.f52568e;
        ((C58417y0) C86312j.m106911c(C58417y0.class)).sy0(context, true, 0, finderCollapsibleTextView.f52544n, finderCollapsibleTextView.f52543j);
    }
}
