package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$9 */
public final class FinderMsgContract$MsgViewCallback$initView$9 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160425d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgViewCallback$initView$9(FinderMsgContract.MsgViewCallback msgViewCallback) {
        super(0);
        this.f160425d = msgViewCallback;
    }

    public Object invoke() {
        FinderMsgContract.MsgPresenter msgPresenter = this.f160425d.f160389f;
        FinderMsgContract.MsgViewCallback msgViewCallback = msgPresenter.f160380h;
        if (msgViewCallback != null) {
            C61926c.m72668M(new FinderMsgContract$MsgViewCallback$showRefreshTip$1((String) null, msgViewCallback, false, 0));
        }
        FinderMsgContract.MsgViewCallback msgViewCallback2 = msgPresenter.f160380h;
        if (msgViewCallback2 != null) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = msgViewCallback2.f160393j;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82439E(false, false);
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
