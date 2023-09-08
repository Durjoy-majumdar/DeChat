package com.tencent.p014mm.plugin.fts.plc;

import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.sdk.coroutines.CheckController;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import i40.C98598e;
import kotlin.Metadata;
import nr3.C89059e;
import ob0.C47350c;
import ob0.C89132b;
import qv1.C77433a;
import te3.C49462fr2;
import te3.C49600gr2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/fts/plc/FTSQueryClickRecallFSC$onAccountInit$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/UpdateSearchIndexAtOnceEvent;", "plugin-fts_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.fts.plc.FTSQueryClickRecallFSC$onAccountInit$1 */
public final class FTSQueryClickRecallFSC$onAccountInit$1 extends IListener<UpdateSearchIndexAtOnceEvent> {

    /* renamed from: d */
    public final /* synthetic */ FTSQueryClickRecallFSC f198230d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTSQueryClickRecallFSC$onAccountInit$1(FTSQueryClickRecallFSC fTSQueryClickRecallFSC, C98598e eVar) {
        super(eVar);
        this.f198230d = fTSQueryClickRecallFSC;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((UpdateSearchIndexAtOnceEvent) iEvent, "event");
        FTSQueryClickRecallFSC fTSQueryClickRecallFSC = this.f198230d;
        fTSQueryClickRecallFSC.getClass();
        Log.m105924i("MicroMsg.FTSQueryClickRecallPLC", "checkRecallRequest timeInterval:" + fTSQueryClickRecallFSC.f198227g);
        String str = C86709a0.m107523b().mo121111i() + "_recall_last_request_time";
        long c = C31543z5.m39453c();
        long j = fTSQueryClickRecallFSC.f198227g;
        if (!new CheckController("MicroMsg.FTSQueryClickRecallPLC", c, MultiProcessMMKV.getDefault().decodeLong(str, 0), j < 600000 ? 600000 : j).checkCondition()) {
            return false;
        }
        MultiProcessMMKV.getDefault().encode(str, c);
        C89132b<C49600gr2> bVar = fTSQueryClickRecallFSC.f198228h;
        if (bVar != null) {
            bVar.mo85581g();
        }
        C49462fr2 fr22 = new C49462fr2();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 4534;
        bVar2.f127068c = "/cgi-bin/mmsearch-bin/localsearchdict";
        bVar2.f127066a = fr22;
        bVar2.f127067b = new C49600gr2();
        C47350c a = bVar2.mo72403a();
        C89132b<C49600gr2> bVar3 = new C89132b<>();
        bVar3.mo123453j(a);
        fTSQueryClickRecallFSC.f198228h = bVar3;
        C89059e<C89132b.C89134c<C49600gr2>> i = bVar3.mo9225i();
        if (i == null) {
            return false;
        }
        i.mo123064p(new C77433a(fTSQueryClickRecallFSC));
        return false;
    }
}
