package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$refresh$1 */
public final class FinderNotifyContract$NotifyViewCallback$refresh$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160515d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderNotifyContract$NotifyViewCallback$refresh$1(FinderNotifyContract.NotifyViewCallback notifyViewCallback) {
        super(0);
        this.f160515d = notifyViewCallback;
    }

    public Object invoke() {
        FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f160515d;
        notifyViewCallback.f160455g.mo78487t(notifyViewCallback.f160452d, true);
        FinderNotifyContract.NotifyViewCallback notifyViewCallback2 = this.f160515d;
        notifyViewCallback2.f160455g.mo78484e(notifyViewCallback2.f160452d);
        return C13598b0.f38549a;
    }
}
