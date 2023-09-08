package p670qx;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import p655px.C35712h;
import p655px.C35713i;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import su0.C118309f;
import tc2.C118418g;
import zt3.C119157j;

/* renamed from: qx.n */
public class C36159n implements C118309f {
    public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
        Log.m105925i("MicroMsg.PSIR", "[+] type 1 report triggered, autoauth: %s", Boolean.valueOf(z));
        if (z) {
            ((C119157j) C119157j.f356862d).mo183876g(new C35713i(), "SIRWorker");
        } else {
            ((C119157j) C119157j.f356862d).mo183876g(new C35712h(540999680), "SIRWorker");
        }
        C118418g gVar = C118418g.INSTANCE;
        String gF = gVar.mo175819gF("ce_login_id");
        if (!TextUtils.isEmpty(gF) && !z) {
            gVar.mo175799SP(gF, 2);
        }
    }

    public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
        Log.m105924i("MicroMsg.PSIR", "[+] type 2 report triggered.");
        ((C119157j) C119157j.f356862d).mo183876g(new C35712h(540999681), "SIRWorker");
        C118418g gVar = C118418g.INSTANCE;
        String gF = gVar.mo175819gF("ce_reg");
        if (!TextUtils.isEmpty(gF)) {
            gVar.mo175799SP(gF, 1);
        }
    }
}
