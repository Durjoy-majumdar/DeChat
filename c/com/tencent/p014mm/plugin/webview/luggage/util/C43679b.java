package com.tencent.p014mm.plugin.webview.luggage.util;

import android.view.View;
import android.view.Window;

/* renamed from: com.tencent.mm.plugin.webview.luggage.util.b */
public class C43679b {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.util.b$a */
    public class C43680a implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Window f118049a;

        /* renamed from: b */
        public final /* synthetic */ boolean f118050b;

        public C43680a(Window window, boolean z) {
            this.f118049a = window;
            this.f118050b = z;
        }

        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4) == 0) {
                this.f118049a.getDecorView().setSystemUiVisibility(C43679b.m47502b(this.f118049a, this.f118050b));
            }
        }
    }

    /* renamed from: a */
    public static void m47501a(Window window, boolean z) {
        if (z) {
            window.getDecorView().setSystemUiVisibility(m47502b(window, z));
            window.setFlags(1024, 1024);
            window.getDecorView().setOnSystemUiVisibilityChangeListener(new C43680a(window, z));
            return;
        }
        window.getDecorView().setSystemUiVisibility(m47502b(window, z));
        window.clearFlags(1024);
        window.getDecorView().setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
    }

    /* renamed from: b */
    public static int m47502b(Window window, boolean z) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        return z ? systemUiVisibility | 1024 | 256 | 512 | 2 | 4 | 4096 : systemUiVisibility & -1025 & -257 & -513 & -3 & -5 & -4097;
    }
}
