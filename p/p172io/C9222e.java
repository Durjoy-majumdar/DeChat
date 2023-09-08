package p172io;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C31415g;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import p227rn.C13089q;

/* renamed from: io.e */
public final class C9222e<T extends C7594e> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "setAdRequestInfo";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("adFetchControl");
        String optString2 = hVar.optString("adFetchInfo");
        boolean bh = ((C13089q) C86312j.m106911c(C13089q.class)).mo12587bh(optString, optString2);
        Log.m105918d("MBJsApiSetAdRequestInfo", "adFetchControl:" + optString + " adFetchInfo:" + optString2);
        StringBuilder sb = new StringBuilder();
        sb.append("setAdRequestInfo ret:");
        sb.append(bh);
        Log.m105924i("MBJsApiSetAdRequestInfo", sb.toString());
        if (bh) {
            mo120840p().invoke(mo120844i());
        } else {
            mo120840p().invoke(mo120843h(new C31415g(1, "fail")));
        }
    }
}
