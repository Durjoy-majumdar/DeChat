package uc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: uc0.c */
public class C14147c implements C11385n {

    /* renamed from: f */
    public static C14147c f39578f;

    /* renamed from: d */
    public boolean f39579d = false;

    /* renamed from: e */
    public int f39580e = 3;

    /* renamed from: a */
    public void mo13557a() {
        Log.m105924i("MicroMsg.ConfigListUpdater", "isUpdateing : " + this.f39579d);
        Log.m105924i("MicroMsg.ConfigListUpdater", "isSDCardAvailable : " + C86709a0.m107535s().mo121147n());
        if (!this.f39579d && C86709a0.m107535s().mo121147n()) {
            this.f39579d = false;
            C86709a0.m107529k().f251779b.mo123470p(159, this);
            this.f39579d = true;
            C86709a0.m107529k().f251779b.mo123455a(159, this);
            C86709a0.m107529k().f251779b.mo123460f(new C52522u(7));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 159) {
            Log.m105925i("MicroMsg.ConfigListUpdater", "getPackageList sceneEnd, %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0) {
                C86709a0.m107535s().mo121142i().mo119676J(81938, Long.valueOf(Util.nowSecond()));
            } else {
                int i3 = this.f39580e - 1;
                this.f39580e = i3;
                if (i3 < 0) {
                    C86709a0.m107535s().mo121142i().mo119676J(81938, Long.valueOf(((Util.nowMilliSecond() - 86400000) + 3600000) / 1000));
                    this.f39580e = 3;
                }
            }
            this.f39579d = false;
            C86709a0.m107529k().f251779b.mo123470p(159, this);
        }
    }
}
