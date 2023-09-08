package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0730f2;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import je1.C9358o4;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Lcm1/f2;", "data", "", "invoke", "(Lcm1/f2;)Ljava/lang/Boolean;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowTopicListContract$FollowTopicPresenter$onSceneEnd$4$1 */
public final class C3385xe7e52669 extends C87413o implements C32226l<C0730f2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C9358o4 f15974d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3385xe7e52669(C9358o4 o4Var) {
        super(1);
        this.f15974d = o4Var;
    }

    public Object invoke(Object obj) {
        C0730f2 f2Var = (C0730f2) obj;
        C87412m.m108594g(f2Var, "data");
        long j = f2Var.f1743d.f141618e;
        this.f15974d.getClass();
        return Boolean.valueOf(j == 0);
    }
}
