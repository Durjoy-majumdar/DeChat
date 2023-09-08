package com.tencent.p014mm.feature.brandservice.flutter.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppMsgRelatedInfoUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import p007bo.C16804h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/feature/brandservice/flutter/model/FlutterBizPlugin$appMsgRelatedInfoUpdateEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/AppMsgRelatedInfoUpdateEvent;", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$appMsgRelatedInfoUpdateEventListener$1 */
public final class FlutterBizPlugin$appMsgRelatedInfoUpdateEventListener$1 extends IListener<AppMsgRelatedInfoUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ FlutterBizPlugin f48872d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlutterBizPlugin$appMsgRelatedInfoUpdateEventListener$1(FlutterBizPlugin flutterBizPlugin, C40008f fVar) {
        super(fVar);
        this.f48872d = flutterBizPlugin;
    }

    public boolean callback(IEvent iEvent) {
        AppMsgRelatedInfoUpdateEvent appMsgRelatedInfoUpdateEvent = (AppMsgRelatedInfoUpdateEvent) iEvent;
        C87412m.m108594g(appMsgRelatedInfoUpdateEvent, "event");
        if (!C16804h.f45407a.mo17846a("notifyRelatedInfo") && !C16804h.f45409c) {
            String unused = this.f48872d.getClass();
            Log.m105925i("MicroMsg.FlutterBizPlugin", "AppMsgRelatedInfoUpdateEvent scene %d", Integer.valueOf(appMsgRelatedInfoUpdateEvent.f107364d.f107365a));
            C61926c.m72668M(new C17750b(this.f48872d));
        }
        return false;
    }
}
