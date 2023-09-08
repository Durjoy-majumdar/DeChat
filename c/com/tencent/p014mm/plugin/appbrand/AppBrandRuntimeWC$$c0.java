package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.app.C81207z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p172io.flutter.FlutterInjector;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.embedding.engine.loader.FlutterLoader;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$c0 */
public class AppBrandRuntimeWC$$c0 extends AppBrandRuntime$$z {

    /* renamed from: o */
    public final /* synthetic */ AppBrandRuntimeWC f74768o;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$c0$a */
    public class C26885a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$c0$a$a */
        public class C26886a implements Runnable {
            public C26886a() {
            }

            public void run() {
                int i = C81207z0.f238545a;
                Log.m105924i("MicroMsg.MMSkylineBootGuard", "<clinit>");
                AppBrandRuntimeWC$$c0.this.mo113114c();
            }
        }

        public C26885a() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            Context context = MMApplicationContext.getContext();
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            flutterLoader.startInitializationAsync(context);
            flutterLoader.ensureInitializationCompleteAsync(context, new FlutterShellArgs(new String[0]).toArray(), new Handler(Looper.getMainLooper()), new C26886a());
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "initFlutterEngine useTime %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public AppBrandRuntimeWC$$c0(AppBrandRuntimeWC appBrandRuntimeWC, C84886w1 w1Var) {
        this.f74768o = appBrandRuntimeWC;
    }

    /* renamed from: b */
    public void mo54191b() {
        if (this.f74768o.mo113210l1().mo111293d()) {
            ((C119157j) C119157j.f356862d).mo183876g(new C26885a(), "Skyline#Init");
            return;
        }
        mo113114c();
    }
}
