package p519fg;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f62.C31924c1;
import gy3.C87412m;
import h81.C32735h;
import java.util.Map;
import ob0.C35136m;

/* renamed from: fg.e */
public final class C32032e implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C87412m.m108594g(map, "values");
        C87412m.m108594g(aVar, "addMsgInfo");
        if (C87412m.m108589b(str, "admsg")) {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_push_msg_clear_day_threshold, 7);
            C32035h hVar = C32035h.f85269a;
            C32029b b = hVar.mo58462b();
            if (b != null) {
                long currentTimeMillis = (System.currentTimeMillis() / ((long) 1000)) - ((long) (((Qe * 24) * 60) * 60));
                b.delete("AdvertisePushDBInfo", "timestamp<?", new String[]{"" + currentTimeMillis});
            }
            C32028a aVar2 = new C32028a();
            aVar2.mo61719q2(String.valueOf(aVar.f94242a.f227638r));
            aVar2.mo61725w2((long) aVar.f94242a.f227635o);
            String str2 = map.get(".sysmsg.opcode");
            aVar2.mo61724v2(str2 != null ? Integer.parseInt(str2) : 0);
            String str3 = map.get(".sysmsg.message.aid");
            long j = 0;
            aVar2.mo61720r2(str3 != null ? Long.parseLong(str3) : 0);
            String str4 = map.get(".sysmsg.message.slotid");
            aVar2.mo61722t2(str4 != null ? Long.parseLong(str4) : 0);
            String str5 = map.get(".sysmsg.message.op_time");
            if (str5 != null) {
                j = Long.parseLong(str5);
            }
            aVar2.mo61721s2(j);
            aVar2.mo61723u2(map.get(".sysmsg.message.traceid"));
            C32029b b2 = hVar.mo58462b();
            if (b2 != null) {
                b2.insertNotify(aVar2, false);
            }
            Log.m105924i("MicroMsg.MagicADPushMsgLogic", "get newXmlReceived," + map);
            C115669n.INSTANCE.mo160131h(27059, Long.valueOf(aVar2.getTimestamp()), Integer.valueOf(aVar2.mo61718p2()), Long.valueOf(aVar2.mo61714l2()), Long.valueOf(aVar2.mo61716n2()), Long.valueOf(aVar2.mo61715m2()));
        }
    }
}
