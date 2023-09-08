package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import fo1.C8178c;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$refreshEmpty$runnable$1 */
final class FinderNotifyContract$NotifyPresenter$refreshEmpty$runnable$1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContract.NotifyPresenter f160478d;

    /* renamed from: e */
    public final /* synthetic */ int f160479e;

    /* renamed from: f */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160480f;

    public FinderNotifyContract$NotifyPresenter$refreshEmpty$runnable$1(FinderNotifyContract.NotifyPresenter notifyPresenter, int i, FinderNotifyContract.NotifyViewCallback notifyViewCallback) {
        this.f160478d = notifyPresenter;
        this.f160479e = i;
        this.f160480f = notifyViewCallback;
    }

    public final void run() {
        if (this.f160478d.mo78485n(this.f160479e).isEmpty()) {
            FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f160480f;
            notifyViewCallback.getClass();
            String string = C8178c.C8179a.m8259a(notifyViewCallback).getString(C0966R.string.eau);
            FinderNotifyContract.NotifyViewCallback notifyViewCallback2 = this.f160480f;
            notifyViewCallback2.getClass();
            C61926c.m72668M(new FinderNotifyContract$NotifyViewCallback$showRefreshTip$1(string, notifyViewCallback, true, C8178c.C8179a.m8259a(notifyViewCallback2).getColor(C0966R.color.BW_0_Alpha_0_9)));
        }
    }
}
