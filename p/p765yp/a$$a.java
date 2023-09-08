package p765yp;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kr0.C33983a1;
import uc0.C111153e;
import uc0.C111154h;

/* renamed from: yp.a$$a */
public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111153e f336785d;

    public /* synthetic */ a$$a(C111153e eVar) {
        this.f336785d = eVar;
    }

    public final void run() {
        C111153e eVar = this.f336785d;
        C33983a1 a1Var = (C33983a1) C86312j.m106911c(C33983a1.class);
        if (a1Var != null) {
            C111154h hVar = eVar.f332892v;
            Log.m105925i("MicroMsg.EggSpringFeatureService", "registerPkgSpecs success by last check, username:%s, appId:%s", hVar.f332895e, hVar.f332894d);
            C111154h hVar2 = eVar.f332892v;
            a1Var.mo56532sv(hVar2.f332895e, hVar2.f332894d, 1189);
        }
    }
}
