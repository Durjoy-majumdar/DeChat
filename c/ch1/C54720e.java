package ch1;

import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import o40.C61937h;
import te3.C48742ao0;
import te3.C64760uw0;
import yg1.C39014a;
import yg1.C66639f;

/* renamed from: ch1.e */
public final class C54720e extends C66639f {

    /* renamed from: a */
    public final C45795b f153361a;

    /* renamed from: b */
    public final String f153362b = "LiveMsgRealTimeCheerInfoInterceptor";

    public C54720e(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f153361a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C87412m.m108594g(aVar, "respWrapper");
        C48742ao0 ao02 = aVar.f105072a;
        if (ao02 != null) {
            String str = this.f153362b;
            StringBuilder sb = new StringBuilder();
            sb.append("receive: ");
            C64760uw0 uw02 = ao02.f130674L;
            sb.append(uw02 != null ? C61937h.m72709h(uw02) : "null");
            Log.m105924i(str, sb.toString());
            C54991o oVar = (C54991o) this.f153361a.mo71262a(C54991o.class);
            C64760uw0 uw03 = ao02.f130674L;
            boolean z = false;
            if (uw03 == null) {
                Log.m105924i(oVar.f154311f, "[canUpdateCheerInfo] newCheerInfo = null , not need update");
            } else if (uw03.f185801j) {
                C54991o.C54992b bVar = new C54991o.C54992b(uw03.f185799h, uw03.f185800i);
                String str2 = oVar.f154311f;
                Log.m105924i(str2, "[canUpdateCheerInfo]  is_modified = " + uw03.f185801j + ",localCheerInfoVersion = " + oVar.f154283Y1 + ", newVersionInfo = " + bVar);
                C54991o.C54992b bVar2 = oVar.f154283Y1;
                if (bVar2 != null) {
                    String str3 = bVar.f154396a;
                    if ((str3 == null || str3.length() == 0) || !C87412m.m108589b(bVar.f154396a, bVar2.f154396a) || bVar2.f154397b < bVar.f154397b) {
                        oVar.f154283Y1 = bVar;
                    }
                    String str4 = oVar.f154311f;
                    Log.m105924i(str4, "[canUpdateCheerInfo] result = " + z);
                } else {
                    oVar.f154283Y1 = bVar;
                }
                z = true;
                String str42 = oVar.f154311f;
                Log.m105924i(str42, "[canUpdateCheerInfo] result = " + z);
            } else {
                Log.m105924i(oVar.f154311f, "[canUpdateCheerInfo] is_modified = false,  not need update");
            }
            if (z) {
                oVar.mo75970L4(uw03);
            }
        }
        return true;
    }
}
