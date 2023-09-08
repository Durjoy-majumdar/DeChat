package com.tencent.p014mm.plugin.flutter.voip.manager;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HardCoderSystemEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import l33.C109247e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/flutter/voip/manager/FlutterVoipMgr$hardCoderSystemEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/HardCoderSystemEvent;", "plugin-flutter-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$hardCoderSystemEventListener$1 */
public final class FlutterVoipMgr$hardCoderSystemEventListener$1 extends IListener<HardCoderSystemEvent> {

    /* renamed from: d */
    public final /* synthetic */ FlutterVoipMgr f313186d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlutterVoipMgr$hardCoderSystemEventListener$1(FlutterVoipMgr flutterVoipMgr, C40008f fVar) {
        super(fVar);
        this.f313186d = flutterVoipMgr;
    }

    public boolean callback(IEvent iEvent) {
        HardCoderSystemEvent hardCoderSystemEvent = (HardCoderSystemEvent) iEvent;
        C87412m.m108594g(hardCoderSystemEvent, "event");
        HardCoderSystemEvent.C92528a aVar = hardCoderSystemEvent.f264901d;
        if (aVar != null) {
            Log.m105925i("MicroMsg.FlutterVoipMgr", "summerhardcoder system event [%s]", Integer.valueOf(aVar.f264902a));
            if (hardCoderSystemEvent.f264901d.f264902a == 1) {
                FlutterVoipMgr flutterVoipMgr = this.f313186d;
                if (!flutterVoipMgr.f317101r) {
                    if (flutterVoipMgr.f317102s) {
                        flutterVoipMgr.mo152421C();
                    } else {
                        flutterVoipMgr.mo152425F();
                    }
                    if (C109247e.xx0().f317334c && flutterVoipMgr.f317102s) {
                        flutterVoipMgr.mo152436N(1);
                    }
                }
            }
        }
        return false;
    }
}
