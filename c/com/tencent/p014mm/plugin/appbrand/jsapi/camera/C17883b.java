package com.tencent.p014mm.plugin.appbrand.jsapi.camera;

import com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88024r;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.b */
public class C17883b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f49328d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandCameraView.C17876h f49329e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.b$a */
    public class C17884a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f49330d;

        public C17884a(String str) {
            this.f49330d = str;
        }

        public void run() {
            AppBrandCameraView.C17876h.m18308b(C17883b.this.f49329e, this.f49330d);
        }
    }

    public C17883b(AppBrandCameraView.C17876h hVar, String str) {
        this.f49329e = hVar;
        this.f49328d = str;
    }

    public void run() {
        String str;
        try {
            str = C82713f2.m101487e(this.f49328d);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandCameraView", "stopRecord, remux failed, callback with origin videoexp = %s", Util.stackTraceToString(e));
            str = null;
        }
        C88024r.m109572b(new C17884a(str));
    }
}
