package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58354a2;
import gy3.C87412m;
import jq3.C60905o;
import kotlin.Metadata;
import o40.C61926c;
import rs1.C13442s8;
import rs1.C63608o2;
import te3.C49712hj1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedMegaVideoAnimPlayEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1 */
public final class FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1 extends IListener<FeedMegaVideoAnimPlayEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedMegaVideoBtnAnimUIC f162504d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1(FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC, C40008f fVar) {
        super(fVar);
        this.f162504d = finderFeedMegaVideoBtnAnimUIC;
    }

    public boolean callback(IEvent iEvent) {
        int C;
        int E;
        C60905o oVar;
        C55018j0 j0Var;
        FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = (FeedMegaVideoAnimPlayEvent) iEvent;
        C87412m.m108594g(feedMegaVideoAnimPlayEvent, "event");
        FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = this.f162504d;
        RecyclerView recyclerView = finderFeedMegaVideoBtnAnimUIC.f162495d;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && (C = linearLayoutManager.mo16957C()) <= (E = linearLayoutManager.mo16959E())) {
                while (true) {
                    RecyclerView.C16631z J0 = recyclerView.mo17024J0(C, false);
                    oVar = J0 instanceof C60905o ? (C60905o) J0 : null;
                    if (oVar != null) {
                        View D = oVar.mo85812D(C0966R.C0970id.g6w);
                        if (!(D != null && D.getVisibility() == 0)) {
                            oVar = null;
                        }
                        if (oVar != null) {
                            Object obj = oVar.f173503E;
                            j0Var = obj instanceof C55018j0 ? (C55018j0) obj : null;
                            if (j0Var != null && j0Var.mo3513o().isPostFinish()) {
                                long expectId = j0Var.mo3513o().getExpectId();
                                FeedMegaVideoAnimPlayEvent.C1038a aVar = feedMegaVideoAnimPlayEvent.f9160d;
                                if (expectId == aVar.f9161a || (aVar.f9162b && j0Var.mo3513o().getLocalId() == feedMegaVideoAnimPlayEvent.f9160d.f9161a)) {
                                    FeedMegaVideoAnimPlayEvent.C1038a aVar2 = feedMegaVideoAnimPlayEvent.f9160d;
                                }
                            }
                        }
                    }
                    if (C == E) {
                        break;
                    }
                    C++;
                }
                FeedMegaVideoAnimPlayEvent.C1038a aVar22 = feedMegaVideoAnimPlayEvent.f9160d;
                if (aVar22.f9163c) {
                    Log.m105924i("FinderFeedMegaVideoBtnAnimUIC", "reset mega video anim status, feedId = " + feedMegaVideoAnimPlayEvent.f9160d.f9161a);
                    if (finderFeedMegaVideoBtnAnimUIC.f162500i) {
                        j0Var.f154479d = false;
                    }
                } else if (aVar22.f9164d) {
                    Log.m105924i("FinderFeedMegaVideoBtnAnimUIC", "video is completed, feedId = " + feedMegaVideoAnimPlayEvent.f9160d.f9161a);
                } else {
                    Log.m105924i("FinderFeedMegaVideoBtnAnimUIC", "start finder feed mega video button anim, feedId = " + feedMegaVideoAnimPlayEvent.f9160d.f9161a);
                    C61926c.m72668M(new C63608o2(oVar, finderFeedMegaVideoBtnAnimUIC));
                    if (!j0Var.f154479d) {
                        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(finderFeedMegaVideoBtnAnimUIC.getActivity()).mo75002a(C13442s8.class)).mo12861q3();
                        C58354a2 a2Var = C58354a2.f167095a;
                        String p = C61926c.m72691p(j0Var.getItemId());
                        String str = q3.f134670d;
                        String str2 = "";
                        if (str == null) {
                            str = str2;
                        }
                        String str3 = q3.f134671e;
                        if (str3 == null) {
                            str3 = str2;
                        }
                        String str4 = q3.f134672f;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        C115669n.INSTANCE.mo160131h(21412, p, str, str3, str2);
                        j0Var.f154479d = true;
                    }
                }
            }
        }
        return true;
    }
}
