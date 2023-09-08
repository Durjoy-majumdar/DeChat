package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.i3 */
public class C84545i3 extends C85864g1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.i3$a */
    public class C84546a implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a */
        public final /* synthetic */ boolean f246711a;

        /* renamed from: b */
        public final /* synthetic */ boolean f246712b;

        /* renamed from: c */
        public final /* synthetic */ Window f246713c;

        public C84546a(boolean z, boolean z2, Window window) {
            this.f246711a = z;
            this.f246712b = z2;
            this.f246713c = window;
        }

        public void onSystemUiVisibilityChange(int i) {
            Log.m105919d("MicroMsg.AppBrandUIUtil", "configFullScreen(fullscreen:%b, consumeCutout:%b), onSystemUiVisibilityChange(%d)", Boolean.valueOf(this.f246711a), Boolean.valueOf(this.f246712b), Integer.valueOf(i));
            if ((i & 4) == 0) {
                this.f246713c.getDecorView().setSystemUiVisibility(C84545i3.m104131h(this.f246713c, true));
            }
        }
    }

    /* renamed from: f */
    public static void m104129f(Context context, boolean z) {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
        if (castActivityOrNull == null || castActivityOrNull.getWindow() == null) {
            Log.m105929w("MicroMsg.AppBrandUIUtil", "configFullScreen with context(%s), get NULL activity", context);
            return;
        }
        m104130g(castActivityOrNull.getWindow(), z, false);
    }

    /* renamed from: g */
    public static void m104130g(Window window, boolean z, boolean z2) {
        if (z) {
            window.getDecorView().setSystemUiVisibility(m104131h(window, true));
            window.getDecorView().setOnSystemUiVisibilityChangeListener(new C84546a(z, z2, window));
            window.addFlags(1024);
            if (z2 && Build.VERSION.SDK_INT >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
                window.setAttributes(window.getAttributes());
                return;
            }
            return;
        }
        window.getDecorView().setSystemUiVisibility(m104131h(window, false));
        window.getDecorView().setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
        try {
            window.clearFlags(1024);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandUIUtil", e, "[CAUGHT CRASH]", new Object[0]);
        }
    }

    /* renamed from: h */
    public static int m104131h(Window window, boolean z) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i = z ? systemUiVisibility | 1024 | 256 | 512 | 2 | 4 | 4096 : systemUiVisibility & -1025 & -257 & -513 & -3 & -5 & -4097;
        Log.m105925i("MicroMsg.AppBrandUIUtil", "hy: setting ui visibility: %d", Integer.valueOf(i));
        return i;
    }

    /* renamed from: i */
    public static boolean m104132i(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        try {
            return (((Activity) context).getWindow().getAttributes().flags & 1024) == 1024;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m104133j(Activity activity) {
        return Build.VERSION.SDK_INT >= 24 && activity != null && activity.isInMultiWindowMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r3 = com.tencent.p014mm.sdk.system.AndroidContextUtil.castActivityOrNull(r3.getContext());
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m104134k(android.view.View r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 24
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            if (r3 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.content.Context r3 = r3.getContext()
            android.app.Activity r3 = com.tencent.p014mm.sdk.system.AndroidContextUtil.castActivityOrNull(r3)
            if (r3 == 0) goto L_0x001c
            boolean r3 = r3.isInMultiWindowMode()
            if (r3 == 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3.m104134k(android.view.View):boolean");
    }

    /* renamed from: l */
    public static boolean m104135l(Window window) {
        return (window == null || window.getDecorView() == null || Build.VERSION.SDK_INT < 23 || (window.getDecorView().getSystemUiVisibility() & 8192) == 0) ? false : true;
    }
}
