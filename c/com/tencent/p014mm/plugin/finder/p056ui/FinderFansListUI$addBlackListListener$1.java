package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderAddUserToBlackListEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/FinderFansListUI$addBlackListListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderAddUserToBlackListEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI$addBlackListListener$1 */
public final class FinderFansListUI$addBlackListListener$1 extends IListener<FinderAddUserToBlackListEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderFansListUI f111812d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFansListUI$addBlackListListener$1(FinderFansListUI finderFansListUI, C40008f fVar) {
        super(fVar);
        this.f111812d = finderFansListUI;
    }

    public boolean callback(IEvent iEvent) {
        FinderAddUserToBlackListEvent finderAddUserToBlackListEvent = (FinderAddUserToBlackListEvent) iEvent;
        C87412m.m108594g(finderAddUserToBlackListEvent, "event");
        FinderAddUserToBlackListEvent.C40098a aVar = finderAddUserToBlackListEvent.f107526d;
        if (aVar == null) {
            return true;
        }
        FinderFansListUI finderFansListUI = this.f111812d;
        String str = aVar.f107527a;
        C87412m.m108593f(str, "fansId");
        int i = aVar.f107528b;
        int i2 = FinderFansListUI.f111789z;
        finderFansListUI.getClass();
        C61926c.m72668M(new C41535q0(i, finderFansListUI, str));
        return true;
    }
}
