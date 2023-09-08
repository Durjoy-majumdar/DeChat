package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$msgUpdateListener$1$callback$1 */
final class FinderMsgContract$MsgPresenter$msgUpdateListener$1$callback$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgContract.MsgPresenter f160402d;

    /* renamed from: e */
    public final /* synthetic */ long f160403e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgPresenter$msgUpdateListener$1$callback$1(FinderMsgContract.MsgPresenter msgPresenter, long j) {
        super(0);
        this.f160402d = msgPresenter;
        this.f160403e = j;
    }

    public Object invoke() {
        WxRecyclerAdapter<C55011a> wxRecyclerAdapter;
        String str = this.f160402d.f160379g;
        Log.m105924i(str, "msgUpdateListener event id " + this.f160403e);
        FinderMsgContract.MsgPresenter msgPresenter = this.f160402d;
        ArrayList<C55011a> arrayList = msgPresenter.f160381i;
        long j = this.f160403e;
        int i = 0;
        Iterator<C55011a> it = arrayList.iterator();
        while (it.hasNext()) {
            C55011a next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (next.f154465d.field_id == j) {
                    String str2 = msgPresenter.f160379g;
                    Log.m105924i(str2, "msgUpdateListener event index " + i);
                    FinderMsgContract.MsgViewCallback msgViewCallback = msgPresenter.f160380h;
                    if (!(msgViewCallback == null || (wxRecyclerAdapter = msgViewCallback.f160397q) == null)) {
                        wxRecyclerAdapter.notifyItemChanged(i);
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
