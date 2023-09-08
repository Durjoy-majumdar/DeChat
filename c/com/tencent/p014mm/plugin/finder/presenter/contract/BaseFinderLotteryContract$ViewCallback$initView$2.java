package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.BaseFinderLotteryContract;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback$initView$2 */
final class BaseFinderLotteryContract$ViewCallback$initView$2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderLotteryContract.ViewCallback f15892d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFinderLotteryContract$ViewCallback$initView$2(BaseFinderLotteryContract.ViewCallback viewCallback) {
        super(0);
        this.f15892d = viewCallback;
    }

    public Object invoke() {
        this.f15892d.f15886e.f15880d.requestRefresh();
        return C13598b0.f38549a;
    }
}
