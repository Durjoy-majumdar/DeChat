package p172io;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import p227rn.C13089q;

/* renamed from: io.d */
public final class C9221d<T extends C7594e> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "setAdCardRequestInfo";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        long optLong = hVar.optLong("msgId");
        String optString = hVar.optString("adCardInfo");
        boolean oZ = ((C13089q) C86312j.m106911c(C13089q.class)).mo12591oZ(optLong, optString);
        Log.m105918d("MBJsApiSetAdCardRequestInfo", "msgId:" + optLong + " adCardInfo:" + optString);
        StringBuilder sb = new StringBuilder();
        sb.append("setAdCardRequestInfo ret:");
        sb.append(oZ);
        Log.m105924i("MBJsApiSetAdCardRequestInfo", sb.toString());
        if (oZ) {
            mo120840p().invoke(mo120844i());
        } else {
            mo120840p().invoke(mo120842g(1, "fail"));
        }
    }
}
