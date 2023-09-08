package x02;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C86497v5;
import f40.C86709a0;
import f40.C86718e;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;
import zw3.C91941a;

/* renamed from: x02.v */
public class C38438v implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        if (C86709a0.m107522a()) {
            C77949j3 j3Var = aVar.f94242a;
            if (j3Var.f227630g == 10002) {
                String g = C48374j0.m53718g(j3Var.f227631h);
                if (Util.isNullOrNil(g)) {
                    Log.m105928w("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "msg content is null");
                    return;
                }
                Log.m105925i("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "onReciveMsg :%s", g);
                Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
                if (parseXml != null && parseXml.size() > 0) {
                    String str = parseXml.get(".sysmsg.$type");
                    if (!Util.isNullOrNil(str) && str.equalsIgnoreCase("prconfignotify")) {
                        int safeParseInt = Util.safeParseInt(parseXml.get(".sysmsg.boots.ignorenetwork"));
                        String nullAs = Util.nullAs(parseXml.get(".sysmsg.boots.xmlkey"), "");
                        int i = 2;
                        Log.m105925i("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "ignore:%s md5 %s start checkout tinker update. try to do update.", Integer.valueOf(safeParseInt), nullAs);
                        C91941a c = C91941a.m115469d().mo125793c("uin", String.valueOf(((long) C86718e.m107549h()) & Util.MAX_32BIT_VALUE));
                        if (NetStatusUtil.isWifi(MMApplicationContext.getContext()) || safeParseInt == 1) {
                            i = 3;
                        }
                        c.mo125793c("network", String.valueOf(i));
                        if (!Util.isNullOrNil(nullAs)) {
                            C91941a.m115469d().mo125793c("xmlkey", nullAs);
                        }
                        C91941a.m115469d().mo125791a(true);
                    }
                }
            }
        }
    }
}
