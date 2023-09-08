package com.tencent.p014mm.view;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.view.m */
public final class C57913m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f165721d;

    /* renamed from: e */
    public final /* synthetic */ RefreshLoadMoreLayout f165722e;

    /* renamed from: f */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f165723f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57913m(C32224a<C13598b0> aVar, RefreshLoadMoreLayout refreshLoadMoreLayout, RefreshLoadMoreLayout.C7080c<Object> cVar) {
        super(0);
        this.f165721d = aVar;
        this.f165722e = refreshLoadMoreLayout;
        this.f165723f = cVar;
    }

    public Object invoke() {
        this.f165721d.invoke();
        RefreshLoadMoreLayout.C57879a actionCallback = this.f165722e.getActionCallback();
        if (actionCallback != null) {
            actionCallback.mo2562c(this.f165723f);
        }
        return C13598b0.f38549a;
    }
}
