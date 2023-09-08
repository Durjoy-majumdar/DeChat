package p178ju;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C31924c1;
import f62.C75700k0;
import java.util.Map;
import o62.C11373b;
import o62.C11374c;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: ju.a0 */
public class C33663a0 implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C77949j3 j3Var;
        C35136m.C35137a aVar2 = aVar;
        boolean z = true;
        Log.m105925i("MessengerNewXmlReceived", "hy: on new xml received: %s", map.toString());
        C11373b bVar = (C11373b) C86312j.m106911c(C11373b.class);
        bVar.getClass();
        Class cls = C75700k0.class;
        if (aVar2 == null || (j3Var = aVar2.f94242a) == null) {
            Log.m105920e("MicroMsg.SysMsgTemplateImp", "hy: addMsgInfo or addMsgInfo.addMsg is null! should not happen");
            return;
        }
        String g = C48374j0.m53718g(j3Var.f227631h);
        String g2 = C48374j0.m53718g(j3Var.f227628e);
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(g2, j3Var.f227638r);
        if (h302.getMsgId() <= 0) {
            z = false;
        }
        h302.mo108745Y2(j3Var.f227638r);
        if (!aVar2.f94243b || !aVar2.f94245d) {
            h302.mo108733M2(C75604z3.m90841m(g2, (long) j3Var.f227635o));
        }
        h302.setType(570425393);
        h302.mo108732L2(g);
        h302.mo108740T2(0);
        h302.mo108749c3(g2);
        h302.mo101012p4(j3Var.f227636p);
        C75604z3.m90842n(h302, aVar2);
        if (!z) {
            C75604z3.m90852x(h302);
        } else {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(j3Var.f227638r, h302);
        }
        String str2 = str;
        MMHandlerThread.postToMainThread(new C11374c(bVar, str, map, aVar2));
    }
}
