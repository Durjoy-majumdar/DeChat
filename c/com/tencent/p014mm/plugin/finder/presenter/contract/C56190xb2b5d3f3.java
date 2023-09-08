package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
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
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$msgUpdateListener$1$callback$1 */
final class C56190xb2b5d3f3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContract.NotifyPresenter f160476d;

    /* renamed from: e */
    public final /* synthetic */ long f160477e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56190xb2b5d3f3(FinderNotifyContract.NotifyPresenter notifyPresenter, long j) {
        super(0);
        this.f160476d = notifyPresenter;
        this.f160477e = j;
    }

    public Object invoke() {
        FinderNotifyContract.NotifyPresenter notifyPresenter = this.f160476d;
        ArrayList<ArrayList<C55011a>> arrayList = notifyPresenter.f160448o;
        long j = this.f160477e;
        Iterator<ArrayList<C55011a>> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            ArrayList<C55011a> next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                int i3 = 0;
                for (Object next2 : next) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        if (((C55011a) next2).f154465d.field_id == j) {
                            String str = notifyPresenter.f160443g;
                            Log.m105924i(str, "msgUpdateListener event index " + i3 + " tabIndex" + i);
                            WxRecyclerAdapter<C55011a> wxRecyclerAdapter = notifyPresenter.f160447n.get(i).f160458j;
                            if (wxRecyclerAdapter != null) {
                                wxRecyclerAdapter.notifyItemChanged(i3);
                            }
                        }
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
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
