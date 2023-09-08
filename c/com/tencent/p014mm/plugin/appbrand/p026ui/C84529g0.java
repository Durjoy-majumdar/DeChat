package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.game.preload.C1528a;
import com.tencent.p014mm.plugin.appbrand.game.preload.C81891f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88024r;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.g0 */
public class C84529g0 implements C1528a.C1529a {

    /* renamed from: a */
    public final /* synthetic */ long f246679a;

    /* renamed from: b */
    public final /* synthetic */ C84552k0 f246680b;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.g0$a */
    public class C84530a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f246681d;

        /* renamed from: e */
        public final /* synthetic */ long f246682e;

        public C84530a(Bitmap bitmap, long j) {
            this.f246681d = bitmap;
            this.f246682e = j;
        }

        public void run() {
            Bitmap bitmap = this.f246681d;
            if (bitmap != null) {
                C84529g0.this.f246680b.f246739U.setImageBitmap(bitmap);
                C84552k0 k0Var = C84529g0.this.f246680b;
                if (k0Var.f246734P) {
                    C84552k0.m104137U(k0Var);
                }
                C81891f.m100578a().mo114291b(1002, (int) Util.ticksToNow(C84529g0.this.f246679a));
                C81891f.m100578a().mo114291b(1001, (int) this.f246682e);
            }
        }
    }

    public C84529g0(C84552k0 k0Var, long j) {
        this.f246680b = k0Var;
        this.f246679a = j;
    }

    /* renamed from: a */
    public void mo117225a(Bitmap bitmap, long j) {
        Log.m105924i("MicroMsg.AppBrandGameUILoadingSplash", "onLoadingImageLoaded");
        C84552k0 k0Var = this.f246680b;
        k0Var.f246733N = true;
        if (k0Var.f246739U != null) {
            C88024r.m109572b(new C84530a(bitmap, j));
        }
    }
}
