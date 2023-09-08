package com.tencent.p014mm.splash;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: com.tencent.mm.splash.SplashFallbackActivity */
public class SplashFallbackActivity extends HellActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f24111f = 0;

    /* renamed from: d */
    public Handler f24112d;

    /* renamed from: e */
    public Runnable f24113e = new C6705a();

    /* renamed from: com.tencent.mm.splash.SplashFallbackActivity$a */
    public class C6705a implements Runnable {

        /* renamed from: d */
        public long f24114d = -1;

        public C6705a() {
        }

        public void run() {
            if (this.f24114d == -1) {
                this.f24114d = System.currentTimeMillis();
            }
            SplashFallbackActivity splashFallbackActivity = SplashFallbackActivity.this;
            int i = SplashFallbackActivity.f24111f;
            splashFallbackActivity.getClass();
            boolean z = true;
            if (!new C86009m1(C6706a.f24116a).mo119967g()) {
                C85781g.m105955c("MicroMsg.FigLeaf", "dex opt dir not exists.", new Object[0]);
            } else {
                if (new C86009m1(C6706a.f24116a + "/" + "main-process-blocking").mo119967g()) {
                    z = false;
                }
            }
            if (z) {
                C85781g.m105955c("MicroMsg.FallbackSplash", "checkIfMainProcessStartupDone true", new Object[0]);
                SplashFallbackActivity.this.finish();
                SplashFallbackActivity.this.overridePendingTransition(C0966R.C0968anim.f2516f6, C0966R.C0968anim.f2514f4);
            } else if (System.currentTimeMillis() - this.f24114d >= 80000) {
                C85781g.m105955c("MicroMsg.FallbackSplash", "checkIfMainProcessStartupDone timeout", new Object[0]);
                SplashFallbackActivity.this.finish();
                SplashFallbackActivity.this.overridePendingTransition(C0966R.C0968anim.f2516f6, C0966R.C0968anim.f2514f4);
            } else {
                SplashFallbackActivity splashFallbackActivity2 = SplashFallbackActivity.this;
                splashFallbackActivity2.f24112d.postDelayed(splashFallbackActivity2.f24113e, 100);
            }
        }
    }

    public void onBackPressed() {
        C85781g.m105955c("MicroMsg.FallbackSplash", "block onBackPressed", new Object[0]);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C85781g.m105955c("MicroMsg.FallbackSplash", "onCreate", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("splash-activity");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f24112d = handler;
        handler.postDelayed(this.f24113e, 100);
    }
}
