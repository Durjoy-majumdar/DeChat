package com.tencent.p014mm.plugin.finder.publish;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsPostInfoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/publish/FinderPublishFeatureService$snsPostListener$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsPostInfoEvent;", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.publish.FinderPublishFeatureService$snsPostListener$2$1 */
public final class FinderPublishFeatureService$snsPostListener$2$1 extends IListener<SnsPostInfoEvent> {

    /* renamed from: d */
    public final /* synthetic */ C56237b f160686d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPublishFeatureService$snsPostListener$2$1(C56237b bVar, C40008f fVar) {
        super(fVar);
        this.f160686d = bVar;
    }

    public boolean callback(IEvent iEvent) {
        SnsPostInfoEvent snsPostInfoEvent = (SnsPostInfoEvent) iEvent;
        C87412m.m108594g(snsPostInfoEvent, "event");
        C61926c.m72668M(new C56236a(this.f160686d, snsPostInfoEvent));
        return true;
    }
}
