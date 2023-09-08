package on2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import eb0.C86497v5;
import f40.C86709a0;
import java.util.Map;
import nn2.C34935h;
import nn2.C76942m;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: on2.n */
public class C35228n implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Class cls = C76942m.class;
        ((C76942m) C86312j.m106911c(cls)).getClass();
        C86709a0.m107523b().mo121108c();
        ((C76942m) C86312j.m106911c(cls)).getClass();
        C86709a0.m107523b().mo121108c();
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        Log.m105926v("MicroMsg.ShakeMsgMgr", "func[onResvMsg] content:" + g);
        if (Util.isNullOrNil(g)) {
            Log.m105918d("MicroMsg.ShakeMsgMgr", "func[onResvMsg] Msg content empty");
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        int i = Util.getInt(parseXml.get(".sysmsg.shake.$type"), 0);
        if (i != 1) {
            Log.m105918d("MicroMsg.ShakeMsgMgr", "Unrecognized type :" + i);
            return;
        }
        C34935h hVar = new C34935h();
        int i2 = Util.getInt(parseXml.get(".sysmsg.shake.shaketv.msgtype"), 0);
        if (i2 == 0) {
            hVar.field_type = 1;
            hVar.field_subtype = i2;
            hVar.field_svrid = aVar.f94242a.f227638r;
            hVar.field_createtime = Util.nowSecond();
            hVar.field_tag = parseXml.get(".sysmsg.shake.shaketv.jumpurl");
            hVar.field_status = 0;
            hVar.field_title = parseXml.get(".sysmsg.shake.shaketv.title");
            hVar.field_thumburl = parseXml.get(".sysmsg.shake.shaketv.iconurl");
            hVar.field_desc = parseXml.get(".sysmsg.shake.shaketv.desc");
            hVar.field_reserved1 = Util.nullAsNil(parseXml.get(".sysmsg.shake.shaketv.pid"));
            C76942m.Ax0().insert(hVar);
            return;
        }
        Log.m105928w("MicroMsg.ShakeMsgMgr", "Unknown subType:" + i2);
    }
}
