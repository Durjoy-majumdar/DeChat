package com.tencent.p014mm.view;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.view.l */
public final class C57912l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f165716d;

    /* renamed from: e */
    public final /* synthetic */ RefreshLoadMoreLayout f165717e;

    /* renamed from: f */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f165718f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57912l(C32224a<C13598b0> aVar, RefreshLoadMoreLayout refreshLoadMoreLayout, RefreshLoadMoreLayout.C7080c<Object> cVar) {
        super(0);
        this.f165716d = aVar;
        this.f165717e = refreshLoadMoreLayout;
        this.f165718f = cVar;
    }

    public Object invoke() {
        this.f165716d.invoke();
        RefreshLoadMoreLayout.C57879a actionCallback = this.f165717e.getActionCallback();
        if (actionCallback != null) {
            actionCallback.mo2562c(this.f165718f);
        }
        return C13598b0.f38549a;
    }
}
