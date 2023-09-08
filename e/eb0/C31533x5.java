package eb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C85801v1;
import java.util.Map;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;
import te3.C77949j3;

/* renamed from: eb0.x5 */
public class C31533x5 implements C35141t {
    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        C77949j3 j3Var = aVar.f94242a;
        if (j3Var == null) {
            Log.m105920e("MicroMsg.SysNoticeMsgExtension", "onPreAddMessage cmdAM is null");
            return null;
        }
        try {
            Map<String, String> parseXml = XmlParser.parseXml("<root>" + j3Var.f227631h + "</root>", "root", (String) null);
            int intValue = Integer.valueOf(parseXml.get(".root.newcount")).intValue();
            int intValue2 = Integer.valueOf(parseXml.get(".root.version")).intValue();
            C85801v1 u = C97625j3.m125812b().mo105906u();
            if (intValue2 == Util.nullAsNil((Integer) u.mo119684e(12305, (Object) null))) {
                Log.m105924i("MicroMsg.SysNoticeMsgExtension", "ignore new sys notice count, same version");
                return null;
            }
            u.mo119676J(12304, Integer.valueOf(intValue));
            u.mo119676J(12305, Integer.valueOf(intValue2));
            return null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SysNoticeMsgExtension", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
