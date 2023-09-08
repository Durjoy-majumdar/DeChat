package com.tencent.p014mm.plugin.finder.presenter.contract;

import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$onSceneEnd$3 */
public final class FinderFollowListContract$FollowListPresent$onSceneEnd$3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<Runnable> f15955d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListPresent$onSceneEnd$3(C8479f0<Runnable> f0Var) {
        super(0);
        this.f15955d = f0Var;
    }

    public Object invoke() {
        Runnable runnable = (Runnable) this.f15955d.f27484d;
        if (runnable != null) {
            runnable.run();
        }
        return C13598b0.f38549a;
    }
}
