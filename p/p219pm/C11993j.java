package p219pm;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C86497v5;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: pm.j */
public class C11993j implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (Util.isNullOrNil(g)) {
            Log.m105928w("MicroMsg.SmcCallBack", "msg content is null");
            return;
        }
        Log.m105924i("MicroMsg.SmcCallBack", "receive msg: " + g);
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        if (parseXml == null || parseXml.size() == 0) {
            Log.m105920e("MicroMsg.SmcCallBack", "plugin msg parse fail:" + g);
            return;
        }
        String str = parseXml.get(".sysmsg.$type");
        if (Util.isNullOrNil(str) || !str.equalsIgnoreCase("getkvidkeystg")) {
            Log.m105920e("MicroMsg.SmcCallBack", "plugin msg parse fail:" + g);
            return;
        }
        long j = Util.getLong(parseXml.get(".sysmsg.getkvidkeystg.generalversion"), -1);
        long j2 = Util.getLong(parseXml.get(".sysmsg.getkvidkeystg.specialversion"), -1);
        long j3 = Util.getLong(parseXml.get(".sysmsg.getkvidkeystg.whiteorblackuinversion"), -1);
        long j4 = Util.getLong(parseXml.get(".sysmsg.getkvidkeystg.timeinterval"), -1);
        long j5 = Util.getLong(parseXml.get(".sysmsg.getkvidkeystg.kvgeneralversion"), -1);
        long j6 = Util.getLong(parseXml.get(".sysmsg.getkvidkeystg.kvspecialversion"), -1);
        long j7 = Util.getLong(parseXml.get(".sysmsg.getkvidkeystg.kvwhiteorblackuinversion"), -1);
        if (j == -1 || j2 == -1 || j3 == -1 || j4 == -1 || -1 == j5 || -1 == j6 || -1 == j7) {
            Log.m105920e("MicroMsg.SmcCallBack", "plugin msg parse fail:" + g);
            return;
        }
        Log.m105924i("MicroMsg.SmcCallBack", "plugin msg version:" + j + ", " + j2 + ", " + j3);
        SmcLogic.OnPluginMsg(j5, j6, j7, j, j2, j4);
    }
}
