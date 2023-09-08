package com.tencent.p014mm.plugin.finder.viewmodel.teenmode;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AgreeAuthorizationChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import di3.C86312j;
import er1.C58784w3;
import gy3.C87412m;
import kotlin.Metadata;
import ky2.C10432i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeLimitVM$authorAgreeChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/AgreeAuthorizationChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM$authorAgreeChangeListener$1 */
public final class FinderTeenModeLimitVM$authorAgreeChangeListener$1 extends IListener<AgreeAuthorizationChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderTeenModeLimitVM f18829d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTeenModeLimitVM$authorAgreeChangeListener$1(FinderTeenModeLimitVM finderTeenModeLimitVM, C40008f fVar) {
        super(fVar);
        this.f18829d = finderTeenModeLimitVM;
    }

    public boolean callback(IEvent iEvent) {
        AgreeAuthorizationChangeEvent agreeAuthorizationChangeEvent = (AgreeAuthorizationChangeEvent) iEvent;
        C87412m.m108594g(agreeAuthorizationChangeEvent, "event");
        if (this.f18829d.mo5191c3() && C58784w3.f168295a.mo83869G0() && ((C10432i) C86312j.m106911c(C10432i.class)).mo10736BD() != null) {
            int i = agreeAuthorizationChangeEvent.f9031d.f9032a;
            if (i == 6) {
                this.f18829d.mo5193e3(true);
            } else if (i == 5) {
                this.f18829d.mo5193e3(false);
            }
        }
        return true;
    }
}
