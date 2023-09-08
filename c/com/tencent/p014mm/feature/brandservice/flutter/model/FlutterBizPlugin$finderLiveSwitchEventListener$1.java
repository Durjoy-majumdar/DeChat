package com.tencent.p014mm.feature.brandservice.flutter.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLiveSwitchEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/feature/brandservice/flutter/model/FlutterBizPlugin$finderLiveSwitchEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveSwitchEvent;", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$finderLiveSwitchEventListener$1 */
public final class FlutterBizPlugin$finderLiveSwitchEventListener$1 extends IListener<FinderLiveSwitchEvent> {

    /* renamed from: d */
    public final /* synthetic */ FlutterBizPlugin f48874d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlutterBizPlugin$finderLiveSwitchEventListener$1(FlutterBizPlugin flutterBizPlugin, C40008f fVar) {
        super(fVar);
        this.f48874d = flutterBizPlugin;
    }

    public boolean callback(IEvent iEvent) {
        FinderLiveSwitchEvent finderLiveSwitchEvent = (FinderLiveSwitchEvent) iEvent;
        C87412m.m108594g(finderLiveSwitchEvent, "event");
        if (finderLiveSwitchEvent.f154791d.f154792a == 4) {
            String unused = this.f48874d.getClass();
            Log.m105925i("MicroMsg.FlutterBizPlugin", "on FinderLiveSwitchEvent %s", finderLiveSwitchEvent.f154791d.f154793b);
            ((C119157j) C119157j.f356862d).mo183895z(new C17753e(this.f48874d, finderLiveSwitchEvent));
        }
        return false;
    }
}
