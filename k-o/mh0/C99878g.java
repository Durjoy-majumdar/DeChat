package mh0;

import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C31446a3;
import eb0.C75582h2;
import gy3.C87412m;
import p158gt.C98201k;
import p434ig.C98671a;
import p434ig.C98672d;
import p434ig.C98674g;
import p434ig.C98676j;
import ph0.C100792a;
import sx3.C64197v;

/* renamed from: mh0.g */
public final class C99878g implements C75582h2, C31446a3 {
    /* renamed from: ln */
    public void mo105919ln(C72963f4 f4Var) {
        String str;
        Class cls = C98201k.class;
        C87412m.m108594g(f4Var, "msg");
        C98676j jVar = new C98676j();
        String content = f4Var.getContent();
        C87412m.m108593f(content, "msg.content");
        jVar.mo141099d(content);
        C98674g gVar = new C98674g();
        C98671a aVar = jVar.f289368f;
        if (aVar == null || (str = aVar.mo55242U()) == null) {
            str = "";
        }
        gVar.mo141099d(str);
        C92836k kVar = new C92836k();
        kVar.mo127154y(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127192mL(f4Var.mo108768t()));
        kVar.mo127124A(f4Var.getMsgId());
        kVar.mo127125B(f4Var.mo108774y2());
        kVar.mo127153x(1);
        kVar.mo127129F((int) C100792a.f295260a.mo140253y(gVar));
        kVar.mo127126C(kVar.f267377d);
        kVar.mo127150u((int) Util.nowSecond());
        if (((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).wt0(f4Var.mo108768t(), "id", kVar) != -1) {
            ((C98201k) C86312j.m106911c(cls)).mo137277xi().doNotify();
        } else {
            Log.m105924i("MicroMsg.AlbumMsgExtension", "insert imgInfo failed.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("receive album msg, msgLocalId: ");
        sb.append(f4Var.getMsgId());
        sb.append(", msgSvrId: ");
        sb.append(f4Var.mo108774y2());
        sb.append(", albumInfo: ");
        StringBuilder sb4 = new StringBuilder();
        int i = 0;
        for (T next : gVar.mo55348A()) {
            int i2 = i + 1;
            if (i >= 0) {
                C98672d dVar = (C98672d) next;
                if (i < 9) {
                    sb4.append("==== item " + i2 + ":\n");
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(dVar.mo141111s());
                    sb5.append(10);
                    sb4.append(sb5.toString());
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        String sb6 = sb4.toString();
        C87412m.m108593f(sb6, "stringBuilder.toString()");
        sb.append(sb6);
        Log.m105924i("MicroMsg.AlbumMsgExtension", sb.toString());
    }
}
