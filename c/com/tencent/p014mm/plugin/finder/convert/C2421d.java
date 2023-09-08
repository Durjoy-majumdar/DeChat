package com.tencent.p014mm.plugin.finder.convert;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.Iterator;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C64273c21;

/* renamed from: com.tencent.mm.plugin.finder.convert.d */
public final class C2421d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedUpdateEvent f12839d;

    /* renamed from: e */
    public final /* synthetic */ FinderFeedFullLiveConvert f12840e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2421d(FeedUpdateEvent feedUpdateEvent, FinderFeedFullLiveConvert finderFeedFullLiveConvert) {
        super(0);
        this.f12839d = feedUpdateEvent;
        this.f12840e = finderFeedFullLiveConvert;
    }

    public Object invoke() {
        FinderItem o;
        FinderItem o2;
        FinderItem o3;
        C64273c21 liveInfo;
        List data;
        this.f12839d.f9173d.getClass();
        FeedUpdateEvent.C1041a aVar = this.f12839d.f9173d;
        int i = aVar.f9175b;
        C0797z zVar = null;
        if (i == 8 || i == 19) {
            int i2 = aVar.f9177d;
            RecyclerView recyclerView = this.f12840e.f12554A;
            RecyclerView.C16631z J0 = recyclerView != null ? recyclerView.mo17024J0(i2, false) : null;
            C60905o oVar = J0 instanceof C60905o ? (C60905o) J0 : null;
            C0740i2 i2Var = oVar != null ? (C0740i2) oVar.f173503E : null;
            if (!(i2Var instanceof C0740i2)) {
                i2Var = null;
            }
            boolean z = i2Var instanceof C0797z;
            long j = 0;
            long j2 = (!z || (o3 = ((C0797z) i2Var).mo3513o()) == null || (liveInfo = o3.getLiveInfo()) == null) ? 0 : liveInfo.f182392d;
            Log.m105924i("Finder.FeedFullLiveConvert", "feedChangeListener index:" + i2 + " id:" + this.f12839d.f9173d.f9174a + " liveId:" + j2 + ", liveStatus:" + this.f12839d.f9173d.f9182i);
            FeedUpdateEvent.C1041a aVar2 = this.f12839d.f9173d;
            long j3 = aVar2.f9174a;
            if (j3 != 0 && j3 == j2 && aVar2.f9182i == 2) {
                View D = oVar != null ? oVar.mo85812D(C0966R.C0970id.fv8) : null;
                if (D != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view = D;
                    C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$liveFeedStateChangeListener$1$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$liveFeedStateChangeListener$1$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C0797z zVar2 = z ? (C0797z) i2Var : null;
                if (!(zVar2 == null || (o2 = zVar2.mo3513o()) == null)) {
                    j = o2.getId();
                }
                FinderFeedFullLiveConvert finderFeedFullLiveConvert = this.f12840e;
                C0797z zVar3 = z ? (C0797z) i2Var : null;
                finderFeedFullLiveConvert.mo2395V0(oVar, (zVar3 == null || (o = zVar3.mo3513o()) == null) ? null : o.getLiveInfo(), j);
                this.f12840e.mo2391R0(j, false);
                if (z) {
                    zVar = (C0797z) i2Var;
                }
                FinderFeedFullLiveConvert finderFeedFullLiveConvert2 = this.f12840e;
                if (!(oVar == null || zVar == null)) {
                    finderFeedFullLiveConvert2.mo2315r(oVar, zVar);
                }
            }
        } else if (i == 29) {
            RecyclerView recyclerView2 = this.f12840e.f12554A;
            RecyclerView.C16613e adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
            WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
            int i3 = -1;
            if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
                FeedUpdateEvent feedUpdateEvent = this.f12839d;
                Iterator it = data.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9493c cVar = (C9493c) it.next();
                    if ((cVar instanceof BaseFinderFeed) && ((BaseFinderFeed) cVar).mo3513o().getId() == feedUpdateEvent.f9173d.f9174a) {
                        i3 = i4;
                        break;
                    }
                    i4++;
                }
            }
            Log.m105924i("Finder.FeedFullLiveConvert", "feedChangeListener update Theme, position: " + i3 + " id: " + this.f12839d.f9173d.f9174a);
            if (i3 >= 0) {
                RecyclerView recyclerView3 = this.f12840e.f12554A;
                RecyclerView.C16631z J02 = recyclerView3 != null ? recyclerView3.mo17024J0(i3, false) : null;
                C60905o oVar2 = J02 instanceof C60905o ? (C60905o) J02 : null;
                C58784w3 w3Var = C58784w3.f168295a;
                C0797z zVar4 = oVar2 != null ? (C0797z) oVar2.f173503E : null;
                if (zVar4 instanceof C0797z) {
                    zVar = zVar4;
                }
                FinderFeedFullLiveConvert finderFeedFullLiveConvert3 = this.f12840e;
                C58739j4 j4Var = C58739j4.f168176a;
                if (!(oVar2 == null || zVar == null)) {
                    finderFeedFullLiveConvert3.mo2299i0(oVar2, zVar);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
