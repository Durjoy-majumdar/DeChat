package ie0;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75573f;
import gy3.C87412m;
import he0.C76158j;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: ie0.h */
public final class C46219h extends C75573f implements C35141t {
    /* renamed from: d */
    public C72963f4 mo71474d(C35136m.C35137a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "addMsgInfo");
        C77949j3 j3Var = aVar.f94242a;
        C46223m a = C46225p.m51523a(C48374j0.m53718g(j3Var.f227631h));
        if (a == null) {
            Log.m105920e("MicroMsg.OpenIMKefuCardExtension", "alvinluo kefuCard content parse failed");
            return super.mo71474d(aVar, str, str2, str3);
        }
        if (j3Var.f227630g == 67) {
            ((C76158j) C86312j.m106911c(C76158j.class)).Lk0(a.f124600e);
        }
        if (a.f124596a.length() > 0) {
            C68097n nVar = new C68097n();
            nVar.f195728a = a.f124596a;
            nVar.f195729b = 3;
            nVar.f195733f = 1;
            nVar.f195732e = a.f124598c;
            nVar.f195731d = a.f124599d;
            nVar.f195736i = -1;
            Log.m105918d("MicroMsg.OpenIMKefuCardExtension", "alvinluo kefuCard prepareMsgInfo user: " + a.f124596a + ", headImage: " + a.f124598c + ", " + a.f124599d);
            C68102u.zx0().mo93608Yt(nVar);
        }
        return super.mo71474d(aVar, str, str2, str3);
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
