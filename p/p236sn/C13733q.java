package p236sn;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C86497v5;
import f40.C86709a0;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: sn.q */
public class C13733q implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        C77949j3 j3Var = aVar.f94242a;
        if (j3Var == null) {
            Log.m105920e("BizSysCmdMsgListener", "AddMsg is null.");
            return;
        }
        String g = C48374j0.m53718g(j3Var.f227631h);
        if (Util.isNullOrNil(g)) {
            Log.m105920e("BizSysCmdMsgListener", "msg content is null");
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        if (parseXml == null || parseXml.size() <= 0) {
            Log.m105920e("BizSysCmdMsgListener", "receiveMessage, no sysmsg");
        } else if (!"mmbizattrappsvr_BizAttrSync".equalsIgnoreCase(parseXml.get(".sysmsg.$type"))) {
            Log.m105920e("BizSysCmdMsgListener", "receiveMessage, type not BizAttrSync.");
        } else {
            int i = Util.getInt(parseXml.get(".sysmsg.mmbizattrappsvr_BizAttrSync.openflag"), 0);
            Log.m105925i("BizSysCmdMsgListener", "BizAttrSync openFlag : %d.", Integer.valueOf(i));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_BIZ_ATTR_SYNC_OPEN_FLAG_INT, Integer.valueOf(i));
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }
}
