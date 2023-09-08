package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$showRefreshViewOnError$1 */
final class C56203xb529c6df implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContractNew.NotifyViewCallback f160587d;

    public C56203xb529c6df(FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        this.f160587d = notifyViewCallback;
    }

    public final void run() {
        FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f160587d;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.eau);
        int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9);
        String str = FinderNotifyContractNew.NotifyViewCallback.f160541s;
        notifyViewCallback.mo78504D(string, color, true);
    }
}
