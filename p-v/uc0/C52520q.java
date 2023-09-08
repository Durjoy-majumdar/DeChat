package uc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47349a0;

/* renamed from: uc0.q */
public class C52520q implements C11385n {
    public C52520q() {
        C86709a0.m107529k().f251779b.mo123455a(159, this);
        C86709a0.m107529k().f251779b.mo123455a(160, this);
        C86709a0.m107529k().f251779b.mo123460f(new C52522u(5));
    }

    /* renamed from: a */
    public final void mo73453a() {
        C86709a0.m107529k().f251779b.mo123470p(159, this);
        C86709a0.m107529k().f251779b.mo123470p(160, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C47349a0) || ((C47349a0) yVar).mo72393j() != 5) {
            Log.m105918d("MicroMsg.LangPackageUpdater", "another scene");
            return;
        }
        int type = yVar.getType();
        if (type == 159) {
            if (i == 0 && i2 == 0) {
                C86709a0.m107535s().mo121142i().mo119676J(81939, Long.valueOf(Util.nowMilliSecond()));
                C52523w[] bD = C52517f0.xx0().mo73465bD(5);
                if (bD == null || bD.length == 0) {
                    Log.m105924i("MicroMsg.LangPackageUpdater", "error no pkg found.");
                    mo73453a();
                    return;
                }
                C52523w wVar = bD[0];
                Log.m105924i("MicroMsg.LangPackageUpdater", "dkregcode Pkg id:" + wVar.f146696a + " version:" + wVar.f146697b + " status:" + wVar.f146701f + " type:" + wVar.f146702g);
                if (5 != wVar.f146701f) {
                    mo73453a();
                    return;
                }
                C86709a0.m107529k().f251779b.mo123460f(new C52521t(wVar.f146696a, 5));
                return;
            }
            mo73453a();
        } else if (type == 160) {
            if (i == 0 && i2 == 0) {
                C86709a0.m107535s().mo121142i().mo119676J(81939, Long.valueOf(Util.nowMilliSecond()));
            }
            mo73453a();
        }
    }
}
