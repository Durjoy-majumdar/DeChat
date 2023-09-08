package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.i1 */
public class C1736i1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f11447d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f11448e;

    /* renamed from: f */
    public final /* synthetic */ int f11449f;

    /* renamed from: g */
    public final /* synthetic */ int f11450g;

    /* renamed from: h */
    public final /* synthetic */ int f11451h;

    /* renamed from: i */
    public final /* synthetic */ WeakReference f11452i;

    /* renamed from: j */
    public final /* synthetic */ int f11453j;

    /* renamed from: n */
    public final /* synthetic */ C1734h1 f11454n;

    public C1736i1(C1734h1 h1Var, String str, C82381f fVar, int i, int i2, int i3, WeakReference weakReference, int i4) {
        this.f11454n = h1Var;
        this.f11447d = str;
        this.f11448e = fVar;
        this.f11449f = i;
        this.f11450g = i2;
        this.f11451h = i3;
        this.f11452i = weakReference;
        this.f11453j = i4;
    }

    public void run() {
        h1$$c a = ((Util.isNullOrNil(this.f11447d) || !this.f11447d.startsWith("wxfile://")) ? new h1$$f((C1736i1) null) : new h1$$d((C1736i1) null)).mo1723a(this.f11448e, this.f11447d, this.f11449f, this.f11450g, this.f11451h);
        if (this.f11452i.get() == null || !((C82381f) this.f11452i.get()).isRunning()) {
            Log.m105928w("MicroMsg.JsApiCompressImage.javayhu", "worker:component is null");
            return;
        }
        C82381f fVar = (C82381f) this.f11452i.get();
        if (a == null || (!a.f11443a && Util.isNullOrNil(a.f11444b))) {
            Log.m105928w("MicroMsg.JsApiCompressImage.javayhu", "worker:compress image fail");
            fVar.mo109647a(this.f11453j, this.f11454n.mo115111l("fail:compress image fail", a.f11445c, (JSONObject) null));
        } else if (!a.f11443a) {
            Log.m105929w("MicroMsg.JsApiCompressImage.javayhu", "worker:compress image fail, message:%s", a.f11444b);
            fVar.mo109647a(this.f11453j, this.f11454n.mo115111l(a.f11444b, a.f11445c, (JSONObject) null));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("tempFilePath", a.f11444b);
            int i = this.f11453j;
            C1734h1 h1Var = this.f11454n;
            h1Var.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap.put("errno", 0);
            fVar.mo109647a(i, h1Var.mo115114o("ok", hashMap));
        }
    }
}
