package eb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import junit.framework.Assert;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: eb0.r4 */
public class C31506r4 implements C35141t {
    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        C77949j3 j3Var = aVar.f94242a;
        boolean z = true;
        Assert.assertTrue(j3Var != null);
        if (j3Var.f227631h == null) {
            z = false;
        }
        Assert.assertTrue(z);
        String str = XmlParser.parseXml(C48374j0.m53718g(j3Var.f227631h), "tips", (String) null).get(".tips.tip.url");
        Log.m105926v("MicroMsg.SoftwareMsgExtension", "url:" + str);
        C97625j3.m125812b().mo105906u().mo119676J(12308, str);
        return null;
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
