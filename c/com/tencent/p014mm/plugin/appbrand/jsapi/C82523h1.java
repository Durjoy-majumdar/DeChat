package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiAddToFavorites;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h1 */
public class C82523h1 implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ C83928t1 f241618a;

    /* renamed from: b */
    public final /* synthetic */ String f241619b;

    /* renamed from: c */
    public final /* synthetic */ String f241620c;

    /* renamed from: d */
    public final /* synthetic */ boolean f241621d;

    /* renamed from: e */
    public final /* synthetic */ int f241622e;

    /* renamed from: f */
    public final /* synthetic */ boolean f241623f;

    /* renamed from: g */
    public final /* synthetic */ int f241624g;

    /* renamed from: h */
    public final /* synthetic */ JsApiAddToFavorites f241625h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h1$a */
    public class C82524a implements AppBrandProxyUIProcessTask.C81943b<AppBrandProxyUIProcessTask.ProcessResult> {
        public C82524a() {
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            if (processResult instanceof JsApiAddToFavorites.IPCFavResult) {
                int i = ((JsApiAddToFavorites.IPCFavResult) processResult).f240396d;
                if (i == 0) {
                    C82523h1 h1Var = C82523h1.this;
                    h1Var.f241618a.mo109647a(h1Var.f241624g, h1Var.f241625h.mo115109j("ok"));
                    return;
                }
                C82523h1 h1Var2 = C82523h1.this;
                h1Var2.f241618a.mo109647a(h1Var2.f241624g, h1Var2.f241625h.mo115109j(String.format("fail internal error:%d", new Object[]{Integer.valueOf(i)})));
            }
        }
    }

    public C82523h1(JsApiAddToFavorites jsApiAddToFavorites, C83928t1 t1Var, String str, String str2, boolean z, int i, boolean z2, int i2) {
        this.f241625h = jsApiAddToFavorites;
        this.f241618a = t1Var;
        this.f241619b = str;
        this.f241620c = str2;
        this.f241621d = z;
        this.f241622e = i;
        this.f241623f = z2;
        this.f241624g = i2;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        int i = 1;
        Log.m105925i("MicroMsg.JsApiAddToFavorites", "onLoad %s", str);
        AppBrandInitConfigWC M1 = this.f241618a.getRuntime().mo113210l1();
        int i2 = this.f241618a.getRuntime().mo113213o1().f239413b1;
        JsApiAddToFavorites.IPCFavRequest iPCFavRequest = new JsApiAddToFavorites.IPCFavRequest();
        iPCFavRequest.f240382d = M1.f234839s;
        iPCFavRequest.f240383e = M1.f239362d;
        iPCFavRequest.f240384f = this.f241619b;
        iPCFavRequest.f240385g = M1.f239364f;
        iPCFavRequest.f240389n = str;
        iPCFavRequest.f240388j = this.f241620c;
        iPCFavRequest.f240386h = M1.f234802F;
        iPCFavRequest.f240387i = M1.f239365g;
        if (!this.f241618a.mo116155J0(3).f244319c && !this.f241621d) {
            i = 0;
        }
        iPCFavRequest.f240390o = i;
        iPCFavRequest.f240391p = i2;
        iPCFavRequest.f240392q = M1.f234834c1.f245533f;
        iPCFavRequest.f240393r = M1.f234846y.f239400h;
        iPCFavRequest.f240394s = this.f241622e;
        iPCFavRequest.f240395t = this.f241623f;
        C81956c.m100675c(this.f241618a.getContext(), iPCFavRequest, new C82524a(), (Intent) null);
    }
}
