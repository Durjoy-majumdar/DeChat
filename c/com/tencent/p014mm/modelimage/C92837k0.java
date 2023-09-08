package com.tencent.p014mm.modelimage;

import android.content.Context;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import gc0.C20828a;
import java.util.HashMap;
import java.util.LinkedList;
import p520fi.C75766h;
import p787ai.C79547b;
import q90.C101062d;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.modelimage.k0 */
public class C92837k0 extends C86301e {

    /* renamed from: d */
    public C92839m f267400d;

    /* renamed from: e */
    public C68129u f267401e;

    /* renamed from: f */
    public C92819d f267402f;

    /* renamed from: g */
    public C92822e f267403g = null;

    /* renamed from: h */
    public AutoGetBigImgLogic f267404h = null;

    /* renamed from: i */
    public C92850p0 f267405i = null;

    /* renamed from: j */
    public C114668z.C104589a f267406j = new C68124a(this);

    /* renamed from: n */
    public C20828a f267407n = null;

    /* renamed from: com.tencent.mm.modelimage.k0$a */
    public class C68124a extends C114668z.C104589a {

        /* renamed from: com.tencent.mm.modelimage.k0$a$a */
        public class C68125a implements Runnable {
            public C68125a(C68124a aVar) {
            }

            public void run() {
                C68129u Ax0 = C92837k0.Ax0();
                Ax0.getClass();
                C86709a0.m107528h();
                C86709a0.m107525e().postToWorker(new C68135v(Ax0));
            }
        }

        public C68124a(C92837k0 k0Var) {
        }

        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    C92837k0.vx0().mo127060a(false);
                }
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    C79547b.f233255g.mo109607a(new C68125a(this));
                    C92837k0.vx0().mo127060a(true);
                }
            }
        }
    }

    public static C68129u Ax0() {
        if (xx0().f267401e == null) {
            xx0().f267401e = new C68129u();
        }
        return xx0().f267401e;
    }

    public static C92839m Bx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f267400d == null) {
            xx0().f267400d = new C92839m(C86709a0.m107535s().f251811i);
        }
        return xx0().f267400d;
    }

    public static C92850p0 Cx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f267405i == null) {
            xx0().f267405i = new C92850p0();
        }
        return xx0().f267405i;
    }

    public static AutoGetBigImgLogic vx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f267404h == null) {
            xx0().f267404h = new AutoGetBigImgLogic();
        }
        return xx0().f267404h;
    }

    public static C92819d wx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f267402f == null) {
            xx0().f267402f = new C92819d();
        }
        return xx0().f267402f;
    }

    public static C92837k0 xx0() {
        return (C92837k0) C86312j.m106911c(C92837k0.class);
    }

    public static C92822e yx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f267403g == null) {
            xx0().f267403g = new C92822e();
        }
        return xx0().f267403g;
    }

    public static C20828a zx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f267407n == null) {
            xx0().f267407n = C20828a.m22825b();
        }
        return xx0().f267407n;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        this.f267406j.alive();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        this.f267406j.dead();
        C68129u uVar = this.f267401e;
        if (uVar != null) {
            uVar.f195795j = 0;
            C86709a0.m107529k().f251779b.mo123470p(110, uVar);
        }
        AutoGetBigImgLogic autoGetBigImgLogic = this.f267404h;
        if (autoGetBigImgLogic != null) {
            synchronized (autoGetBigImgLogic.f267186d) {
                autoGetBigImgLogic.f267186d.clear();
                autoGetBigImgLogic.f267187e = 0;
                yx0().mo127102d(autoGetBigImgLogic);
            }
            autoGetBigImgLogic.f267198s.dead();
            autoGetBigImgLogic.f267199t.dead();
        }
        C92822e eVar = this.f267403g;
        if (eVar != null) {
            Log.m105924i("ModelImage.DownloadImgService", "on detach");
            Log.m105924i("ModelImage.DownloadImgService", "cancel all net scene");
            eVar.f267319h = true;
            eVar.mo127103e(eVar.f267317f);
            while (eVar.f267315d.size() > 0) {
                eVar.mo127103e(eVar.f267315d.get(0));
            }
            eVar.f267319h = false;
            eVar.mo127106h(-1);
            C86709a0.m107529k().f251779b.mo123470p(109, eVar);
        }
        C92850p0 p0Var = this.f267405i;
        if (p0Var != null) {
            Log.m105924i("MicroMsg.UrlImageCacheService", "detach");
            if (MMHandlerThread.isMainThread()) {
                ((LinkedList) p0Var.f267451a).clear();
                p0Var.f267453c = true;
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(new C92849o0(p0Var));
            }
        }
        C92839m mVar = xx0().f267400d;
        if (mVar != null) {
            Log.m105925i("MicroMsg.ImgInfoStorage", "clearCacheMap stack:%s", Util.getStack());
            ((C101062d) mVar.f267415d).clear();
        }
        C20828a aVar = xx0().f267407n;
        if (aVar != null) {
            aVar.mo32514c();
        }
        ((HashMap) C75766h.C75767a.f222368a).put("local_cdn_img_cache", (Object) null);
        C20828a aVar2 = this.f267407n;
        if (aVar2 != null) {
            aVar2.mo32514c();
            this.f267407n = null;
        }
    }
}
