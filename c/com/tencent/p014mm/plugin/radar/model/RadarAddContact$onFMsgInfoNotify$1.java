package com.tencent.p014mm.plugin.radar.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RadarSayHiMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eg2.C75613d;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/radar/model/RadarAddContact$onFMsgInfoNotify$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/RadarSayHiMsgEvent;", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.model.RadarAddContact$onFMsgInfoNotify$1 */
public final class RadarAddContact$onFMsgInfoNotify$1 extends IListener<RadarSayHiMsgEvent> {

    /* renamed from: d */
    public final /* synthetic */ RadarAddContact f203295d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarAddContact$onFMsgInfoNotify$1(RadarAddContact radarAddContact, C40008f fVar) {
        super(fVar);
        this.f203295d = radarAddContact;
    }

    public boolean callback(IEvent iEvent) {
        RadarSayHiMsgEvent radarSayHiMsgEvent = (RadarSayHiMsgEvent) iEvent;
        C87412m.m108594g(radarSayHiMsgEvent, "event");
        String str = radarSayHiMsgEvent.f193859d.f193861a;
        C72996z1 a = RadarAddContact.m82903a(this.f203295d, C72963f4.C72971h.m85668v(str));
        this.f203295d.mo96915g(a);
        RadarAddContact radarAddContact = this.f203295d;
        C87412m.m108593f(str, "msgContent");
        radarAddContact.f203280g.put(a.getUsername(), str);
        radarAddContact.f203280g.put(a.mo73978v2(), str);
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        if (!Ni.mo69709k3(a.mo73978v2())) {
            Ni.mo69668Q3(a);
        }
        Log.m105919d("MicroMsg.RadarAddContact", "receive verify mssage %s, encypt %s", a.getUsername(), a.mo73978v2());
        RadarAddContact radarAddContact2 = this.f203295d;
        radarAddContact2.f203283j.post(new C75613d(radarAddContact2, a));
        return false;
    }
}
