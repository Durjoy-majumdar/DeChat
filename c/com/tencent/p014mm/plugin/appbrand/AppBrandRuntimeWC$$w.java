package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C115249m;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.plugin.appbrand.utils.C84718b0;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$w */
public class AppBrandRuntimeWC$$w implements C115249m.C1742c {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f238342d;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$w$a */
    public class C81095a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f238343d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f238344e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f238345f;

        /* renamed from: g */
        public final /* synthetic */ Runnable f238346g;

        public C81095a(AppBrandRuntimeWC$$w appBrandRuntimeWC$$w, Context context, C82381f fVar, Runnable runnable, Runnable runnable2) {
            this.f238343d = context;
            this.f238344e = fVar;
            this.f238345f = runnable;
            this.f238346g = runnable2;
        }

        public void run() {
            C84718b0.f247110a.mo117447a(this.f238343d, this.f238344e, "android.permission.WRITE_EXTERNAL_STORAGE", this.f238345f, this.f238346g);
        }
    }

    public AppBrandRuntimeWC$$w(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238342d = appBrandRuntimeWC;
    }

    /* renamed from: Ed */
    public void mo1729Ed(Context context, C82381f fVar, Runnable runnable, Runnable runnable2) {
        if (!C2039g2.m1987a()) {
            this.f238342d.mo113024P0(new C81095a(this, context, fVar, runnable, runnable2));
        } else {
            C84718b0.f247110a.mo117447a(context, fVar, "android.permission.WRITE_EXTERNAL_STORAGE", runnable, runnable2);
        }
    }
}
