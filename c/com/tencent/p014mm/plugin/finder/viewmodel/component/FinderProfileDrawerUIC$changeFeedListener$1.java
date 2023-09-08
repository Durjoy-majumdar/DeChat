package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.appcompat.app.AppCompatActivity;
import as1.C0201a;
import bl3.C54492n;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FinderProfileChangeFeedEvent;
import com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderProfileDrawerUIC$changeFeedListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderProfileChangeFeedEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$changeFeedListener$1 */
public final class FinderProfileDrawerUIC$changeFeedListener$1 extends IListener<FinderProfileChangeFeedEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileDrawerUIC f18782d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileDrawerUIC$changeFeedListener$1(AppCompatActivity appCompatActivity, FinderProfileDrawerUIC finderProfileDrawerUIC) {
        super(appCompatActivity);
        this.f18782d = finderProfileDrawerUIC;
    }

    public boolean callback(IEvent iEvent) {
        FinderProfileChangeFeedEvent finderProfileChangeFeedEvent = (FinderProfileChangeFeedEvent) iEvent;
        C87412m.m108594g(finderProfileChangeFeedEvent, "event");
        FinderProfileChangeFeedEvent.C1059a aVar = finderProfileChangeFeedEvent.f9239d;
        if (aVar != null) {
            FinderProfileDrawerUIC finderProfileDrawerUIC = this.f18782d;
            Log.m105924i(C54492n.TAG, "[changeFeedListener], " + aVar.f9240a + ", " + aVar.f9241b + ", " + finderProfileDrawerUIC.f18770j + ", " + finderProfileDrawerUIC.f18769i + ", " + finderProfileDrawerUIC);
            if (finderProfileDrawerUIC.f18770j) {
                C0201a aVar2 = finderProfileDrawerUIC.f18766f;
                if (aVar2 != null) {
                    FinderDraggableLayout.m4279a(aVar2, false, 1, (Object) null);
                }
                finderProfileDrawerUIC.mo5170f3(aVar.f9240a, 30, (C0740i2) null);
            }
        }
        return true;
    }
}
