package hg0;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75573f;
import he0.C76158j;
import ob0.C35136m;
import ob0.C35141t;
import p196ln.C76706g;
import p872ah.C67046a;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: hg0.e */
public class C46053e extends C75573f implements C35141t {
    /* renamed from: d */
    public C72963f4 mo71474d(C35136m.C35137a aVar, String str, String str2, String str3) {
        C77949j3 j3Var = aVar.f94242a;
        String g = C48374j0.m53718g(j3Var.f227631h);
        if (g == null || g.length() <= 0) {
            Log.m105920e("MicroMsg.CardMsgExtension", "possible friend msg : content is null");
            return null;
        }
        C72963f4.C72964b f = C72963f4.C72964b.m85654f(g);
        if (j3Var.f227630g == 66) {
            ((C76158j) C86312j.m106911c(C76158j.class)).Lk0(f.f212672A);
        }
        if (Util.nullAsNil(f.f212675a).length() > 0) {
            C68097n nVar = new C68097n();
            String str4 = f.f212675a;
            nVar.f195728a = str4;
            nVar.f195729b = 3;
            nVar.f195733f = 1;
            nVar.f195732e = f.f212695u;
            nVar.f195731d = f.f212696v;
            nVar.f195736i = -1;
            Log.m105919d("MicroMsg.CardMsgExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", str4, nVar.mo93594c(), nVar.mo93597f());
            ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
        }
        return super.mo71474d(aVar, str, str2, str3);
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
