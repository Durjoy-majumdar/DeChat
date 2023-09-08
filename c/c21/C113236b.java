package c21;

import b21.C113081b;
import com.tencent.p014mm.autogen.events.CollectRcvVoiceEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import e21.C116642q;
import e21.C116644q0;
import eb0.C31543z5;
import eb0.C86497v5;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: c21.b */
public class C113236b implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        if (C113081b.yx0().zx0() != null) {
            String g = C48374j0.m53718g(aVar.f94242a.f227631h);
            C116642q zx02 = C113081b.yx0().zx0();
            long j = (long) aVar.f94242a.f227635o;
            zx02.getClass();
            Log.m105926v("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] content:" + g);
            if (Util.isNullOrNil(g)) {
                Log.m105918d("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] Msg content empty");
                return;
            }
            Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
            int i = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), 0);
            if (i == 9 || i == 26 || i == 50) {
                C116644q0 q0Var = new C116644q0();
                q0Var.f349753d = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.username"));
                q0Var.f349755f = Util.getDouble(parseXml.get(".sysmsg.paymsg.fee"), 0.0d) / 100.0d;
                q0Var.f349756g = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.feetype"));
                q0Var.f349757h = Util.getInt(parseXml.get(".sysmsg.paymsgtimestamp"), (int) Util.nowSecond());
                q0Var.f349754e = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.transid"));
                q0Var.f349760n = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.displayname"));
                q0Var.f349758i = Util.getInt(parseXml.get(".sysmsg.paymsg.scene"), 1);
                q0Var.f349759j = Util.getInt(parseXml.get(".sysmsg.paymsg.status"), 0);
                q0Var.f349762p = i;
                q0Var.f349761o = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.outtradeno"));
                q0Var.f349763q = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.type"));
                q0Var.f349764r = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.headimgurl"));
                String nullAsNil = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.voice_content"));
                String nullAsNil2 = Util.nullAsNil(parseXml.get(".sysmsg.paymsg.expire_voice_timestamp"));
                int i2 = Util.getInt(parseXml.get(".sysmsg.paymsg.need_failover"), 1);
                Log.m105925i("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] final content:%s", g);
                for (C116642q.C116643a next : zx02.f349752d) {
                    if (next != null) {
                        next.mo175115o7(q0Var);
                    }
                }
                if (q0Var.f349759j == 1) {
                    CollectRcvVoiceEvent collectRcvVoiceEvent = new CollectRcvVoiceEvent();
                    collectRcvVoiceEvent.f193526d.f193527a = (int) Math.round(q0Var.f349755f * 100.0d);
                    CollectRcvVoiceEvent.C67672a aVar2 = collectRcvVoiceEvent.f193526d;
                    aVar2.f193528b = q0Var.f349756g;
                    aVar2.f193530d = q0Var.f349763q;
                    aVar2.f193529c = q0Var.f349761o;
                    aVar2.f193531e = C31543z5.m39453c() - (j * 1000);
                    CollectRcvVoiceEvent.C67672a aVar3 = collectRcvVoiceEvent.f193526d;
                    aVar3.f193532f = 1;
                    aVar3.f193533g = nullAsNil;
                    aVar3.f193534h = nullAsNil2;
                    if (i2 == 0) {
                        aVar3.f193535i = false;
                    } else {
                        aVar3.f193535i = true;
                    }
                    collectRcvVoiceEvent.publish();
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.CollectPayerMsgMgr", "Not ftf collect msg type, ignore; type=" + i);
            return;
        }
        Log.m105928w("PayMsgListener", "func[onRecieveMsg] payerMsgMgr null");
    }
}
