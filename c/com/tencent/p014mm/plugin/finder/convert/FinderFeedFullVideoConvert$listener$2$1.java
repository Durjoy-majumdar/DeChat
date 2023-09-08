package com.tencent.p014mm.plugin.finder.convert;

import com.tencent.p014mm.autogen.events.FinderEnhanceActionEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import ve1.C14592p2;
import ve1.C14608q2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$listener$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderEnhanceActionEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$listener$2$1 */
public final class FinderFeedFullVideoConvert$listener$2$1 extends IListener<FinderEnhanceActionEvent> {

    /* renamed from: d */
    public final /* synthetic */ C14592p2 f12799d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedFullVideoConvert$listener$2$1(C14592p2 p2Var, MMActivity mMActivity) {
        super(mMActivity);
        this.f12799d = p2Var;
    }

    public boolean callback(IEvent iEvent) {
        FinderEnhanceActionEvent finderEnhanceActionEvent = (FinderEnhanceActionEvent) iEvent;
        C87412m.m108594g(finderEnhanceActionEvent, "event");
        C61926c.m72668M(new C14608q2(this.f12799d, finderEnhanceActionEvent));
        return false;
    }
}
