package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lrx3/b0;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$1 */
public final class FinderMsgContract$MsgViewCallback$initView$1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160418d;

    public FinderMsgContract$MsgViewCallback$initView$1(FinderMsgContract.MsgViewCallback msgViewCallback) {
        this.f160418d = msgViewCallback;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderMsgContract.MsgPresenter msgPresenter = this.f160418d.f160389f;
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
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
