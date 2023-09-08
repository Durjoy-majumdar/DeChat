package n12;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C86497v5;
import eb0.C97625j3;
import java.util.Map;
import ob0.C35136m;
import p12.C11800g;
import sf0.C48374j0;

/* renamed from: n12.g */
public class C11109g implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Log.m105924i("WCONotifyListener", "WCONotify onRecieveMsg");
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (g == null || g.length() == 0) {
            Log.m105920e("WCONotifyListener", "WCONotify onReceiveMsg, msgContent is null");
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        if (parseXml == null) {
            Log.m105920e("WCONotifyListener", "WCONotify onReceiveMsg, values is null");
        } else if (parseXml.containsKey(".sysmsg.WCONotify.NotifyGetBalance")) {
            int i = Util.getInt(parseXml.get(".sysmsg.WCONotify.NotifyGetBalance"), 0);
            Log.m105925i("WCONotifyListener", "WCONotify NotifyGetBalance: %d", Integer.valueOf(i));
            if (i > 0) {
                C97625j3.m125815e().mo123460f(new C11800g(2));
            }
        }
    }
}
