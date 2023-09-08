package com.tencent.p014mm.plugin.finder.feed.component;

import com.tencent.p014mm.autogen.events.FinderCnyEggCardEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import mf1.C10821h;
import mf1.C10824i;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/component/CNYFeedBariableButtonJumperObserver$createListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderCnyEggCardEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.component.CNYFeedBariableButtonJumperObserver$createListener$1 */
public final class CNYFeedBariableButtonJumperObserver$createListener$1 extends IListener<FinderCnyEggCardEvent> {

    /* renamed from: d */
    public final /* synthetic */ C10824i f13482d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CNYFeedBariableButtonJumperObserver$createListener$1(MMActivity mMActivity, C10824i iVar) {
        super(mMActivity);
        this.f13482d = iVar;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((FinderCnyEggCardEvent) iEvent, "event");
        ((C119157j) C119157j.f356862d).mo183895z(new C10821h(this.f13482d));
        return true;
    }
}
