package com.tencent.p014mm.plugin.cast.banner;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScreenCastEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import zz0.C16420b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/cast/banner/ScreenCastBanner$initialize$2", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ScreenCastEvent;", "plugin-cast_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.cast.banner.ScreenCastBanner$initialize$2 */
public final class ScreenCastBanner$initialize$2 extends IListener<ScreenCastEvent> {

    /* renamed from: d */
    public final /* synthetic */ C16420b f12162d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenCastBanner$initialize$2(C16420b bVar, C40008f fVar) {
        super(fVar);
        this.f12162d = bVar;
    }

    public boolean callback(IEvent iEvent) {
        ScreenCastEvent screenCastEvent = (ScreenCastEvent) iEvent;
        C87412m.m108594g(screenCastEvent, "event");
        if (screenCastEvent.f9475d.f9476a) {
            this.f12162d.mo7975g(0);
        } else {
            this.f12162d.mo7975g(8);
        }
        return false;
    }
}
