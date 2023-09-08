package com.tencent.p014mm.plugin.appbrand;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$g */
public class AppBrandRuntimeWC$$g extends AppBrandRuntime$$z {

    /* renamed from: b */
    public final /* synthetic */ AppBrandRuntimeWC f238321b;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$g$a */
    public class C81093a implements View.OnLayoutChangeListener {
        public C81093a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            AppBrandRuntimeWC$$g.this.f238321b.f238153r.removeOnLayoutChangeListener(this);
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "ContentView first laid out %s", view.toString());
            AppBrandRuntimeWC$$g.this.mo113114c();
        }
    }

    public AppBrandRuntimeWC$$g(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238321b = appBrandRuntimeWC;
    }

    /* renamed from: b */
    public void mo54191b() {
        if (!this.f238321b.f238153r.isLaidOut()) {
            Log.m105924i("MicroMsg.AppBrandRuntimeWC", "ContentView not laid out, wait it");
            this.f238321b.f238153r.addOnLayoutChangeListener(new C81093a());
            return;
        }
        mo113114c();
    }
}
