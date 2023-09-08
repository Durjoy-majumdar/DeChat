package com.tencent.p014mm.view;

import android.view.View;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.view.j */
public final class C57911j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<View> f165713d;

    /* renamed from: e */
    public final /* synthetic */ RefreshLoadMoreLayout f165714e;

    /* renamed from: f */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f165715f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57911j(C32224a<? extends View> aVar, RefreshLoadMoreLayout refreshLoadMoreLayout, RefreshLoadMoreLayout.C7080c<Object> cVar) {
        super(0);
        this.f165713d = aVar;
        this.f165714e = refreshLoadMoreLayout;
        this.f165715f = cVar;
    }

    public Object invoke() {
        this.f165713d.invoke();
        RefreshLoadMoreLayout.C57879a actionCallback = this.f165714e.getActionCallback();
        if (actionCallback != null) {
            actionCallback.mo3681e(this.f165715f);
        }
        RefreshLoadMoreLayout.C57879a reportCallback = this.f165714e.getReportCallback();
        if (reportCallback != null) {
            reportCallback.mo3681e(this.f165715f);
        }
        return C13598b0.f38549a;
    }
}
