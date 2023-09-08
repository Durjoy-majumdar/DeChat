package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderSysNotificationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/FinderConversationFragment$notificationListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderSysNotificationEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$notificationListener$1 */
public final class FinderConversationFragment$notificationListener$1 extends IListener<FinderSysNotificationEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderConversationFragment f111786d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderConversationFragment$notificationListener$1(FinderConversationFragment finderConversationFragment, C40008f fVar) {
        super(fVar);
        this.f111786d = finderConversationFragment;
    }

    public boolean callback(IEvent iEvent) {
        FinderSysNotificationEvent finderSysNotificationEvent = (FinderSysNotificationEvent) iEvent;
        C87412m.m108594g(finderSysNotificationEvent, "event");
        FinderSysNotificationEvent.C40103a aVar = finderSysNotificationEvent.f107540d;
        if (aVar == null) {
            return true;
        }
        FinderConversationFragment finderConversationFragment = this.f111786d;
        Log.m105924i("Finder.FinderBaseConversationFragment", "[notificationListener] brief:" + aVar.f107541a + ", time:" + aVar.f107542b);
        int i = FinderConversationFragment.f111770H;
        finderConversationFragment.mo64597l0();
        View view = finderConversationFragment.f165437h;
        if (view == null) {
            return true;
        }
        view.post(new C41533c0(finderConversationFragment));
        return true;
    }
}
