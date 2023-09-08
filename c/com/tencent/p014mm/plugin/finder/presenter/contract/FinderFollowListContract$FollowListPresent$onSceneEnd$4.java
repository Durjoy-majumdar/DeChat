package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0748l0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Lcm1/l0;", "data", "", "invoke", "(Lcm1/l0;)Ljava/lang/Boolean;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$onSceneEnd$4 */
public final class FinderFollowListContract$FollowListPresent$onSceneEnd$4 extends C87413o implements C32226l<C0748l0, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f15956d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListPresent$onSceneEnd$4(String str) {
        super(1);
        this.f15956d = str;
    }

    public Object invoke(Object obj) {
        C0748l0 l0Var = (C0748l0) obj;
        C87412m.m108594g(l0Var, "data");
        return Boolean.valueOf(l0Var.f1766d.getUsername().equals(this.f15956d));
    }
}
