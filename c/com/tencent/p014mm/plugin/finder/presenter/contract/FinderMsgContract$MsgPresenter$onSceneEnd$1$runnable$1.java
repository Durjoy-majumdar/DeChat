package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fo1.C8178c;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$onSceneEnd$1$runnable$1 */
public final class FinderMsgContract$MsgPresenter$onSceneEnd$1$runnable$1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f160404d;

    /* renamed from: e */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160405e;

    public FinderMsgContract$MsgPresenter$onSceneEnd$1$runnable$1(boolean z, FinderMsgContract.MsgViewCallback msgViewCallback) {
        this.f160404d = z;
        this.f160405e = msgViewCallback;
    }

    public final void run() {
        if (this.f160404d) {
            FinderMsgContract.MsgViewCallback msgViewCallback = this.f160405e;
            msgViewCallback.getClass();
            String string = C8178c.C8179a.m8259a(msgViewCallback).getString(C0966R.string.eau);
            FinderMsgContract.MsgViewCallback msgViewCallback2 = this.f160405e;
            msgViewCallback2.getClass();
            C61926c.m72668M(new FinderMsgContract$MsgViewCallback$showRefreshTip$1(string, msgViewCallback, true, C8178c.C8179a.m8259a(msgViewCallback2).getColor(C0966R.color.BW_0_Alpha_0_9)));
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f160405e.f160393j;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.mo82442H(0);
        } else {
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }
}
