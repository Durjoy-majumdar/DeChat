package com.tencent.p014mm.plugin.finder.nearby.person;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LbsSayHiEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$sayHiListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/LbsSayHiEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$sayHiListener$1 */
public final class NearbyPersonV1UIC$sayHiListener$1 extends IListener<LbsSayHiEvent> {

    /* renamed from: d */
    public final /* synthetic */ NearbyPersonV1UIC f198144d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyPersonV1UIC$sayHiListener$1(NearbyPersonV1UIC nearbyPersonV1UIC, C40008f fVar) {
        super(fVar);
        this.f198144d = nearbyPersonV1UIC;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((LbsSayHiEvent) iEvent, "event");
        MMHandlerThread.postToMainThread(new C68952a(this.f198144d));
        return false;
    }
}
