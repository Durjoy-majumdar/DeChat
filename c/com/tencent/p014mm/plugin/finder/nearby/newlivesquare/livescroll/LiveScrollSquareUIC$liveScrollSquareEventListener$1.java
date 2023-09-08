package com.tencent.p014mm.plugin.finder.nearby.newlivesquare.livescroll;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLiveScrollSquareStatusEvent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import te3.C64836xp2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/newlivesquare/livescroll/LiveScrollSquareUIC$liveScrollSquareEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveScrollSquareStatusEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.livescroll.LiveScrollSquareUIC$liveScrollSquareEventListener$1 */
public final class LiveScrollSquareUIC$liveScrollSquareEventListener$1 extends IListener<FinderLiveScrollSquareStatusEvent> {

    /* renamed from: d */
    public final /* synthetic */ LiveScrollSquareUIC f15756d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveScrollSquareUIC$liveScrollSquareEventListener$1(LiveScrollSquareUIC liveScrollSquareUIC, C40008f fVar) {
        super(fVar);
        this.f15756d = liveScrollSquareUIC;
    }

    public boolean callback(IEvent iEvent) {
        FinderLiveScrollSquareStatusEvent finderLiveScrollSquareStatusEvent = (FinderLiveScrollSquareStatusEvent) iEvent;
        C87412m.m108594g(finderLiveScrollSquareStatusEvent, "event");
        if (finderLiveScrollSquareStatusEvent.f9216d == null) {
            Log.m105924i("Square.LiveScrollSquareUIC", "notify FinderLiveScrollSquareStatusEvent videoView = null");
        } else {
            AppCompatActivity activity = this.f15756d.getActivity();
            MMFinderUI mMFinderUI = activity instanceof MMFinderUI ? (MMFinderUI) activity : null;
            int I7 = mMFinderUI != null ? mMFinderUI.mo2194I7() : 0;
            Log.m105924i("Square.LiveScrollSquareUIC", "receive FinderLiveScrollSquareStatusEvent commentScene: " + I7 + " status: " + finderLiveScrollSquareStatusEvent.f9216d.f9217a);
            if (I7 == 182) {
                FinderLiveScrollSquareStatusEvent.C1050a aVar = finderLiveScrollSquareStatusEvent.f9216d;
                long j = aVar.f9217a;
                if (j == 1) {
                    View decorView = this.f15756d.getActivity().getWindow().getDecorView();
                    C64836xp2 xp22 = finderLiveScrollSquareStatusEvent.f9216d.f9218b;
                    float f = xp22 != null ? (float) xp22.f186375j : 1.0f;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(f));
                    View view = decorView;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/livescroll/LiveScrollSquareUIC$liveScrollSquareEventListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveScrollSquareStatusEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    decorView.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/livescroll/LiveScrollSquareUIC$liveScrollSquareEventListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveScrollSquareStatusEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else if (j == 2) {
                    this.f15756d.getActivity().finish();
                    this.f15756d.getActivity().overridePendingTransition(0, 0);
                } else if (j == 4) {
                    View findViewById = this.f15756d.getRootView().getRootView().findViewById(16908290);
                    C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                    aVar.f9219c = (ViewGroup) findViewById;
                }
            }
        }
        return false;
    }
}
