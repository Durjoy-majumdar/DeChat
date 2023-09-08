package com.tencent.liteav.videoproducer.encoder;

import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ad */
final /* synthetic */ class C17470ad implements Runnable {

    /* renamed from: a */
    private final C17529w f47416a;

    /* renamed from: b */
    private final int f47417b;

    private C17470ad(C17529w wVar, int i) {
        this.f47416a = wVar;
        this.f47417b = i;
    }

    /* renamed from: a */
    public static Runnable m17560a(C17529w wVar, int i) {
        return new C17470ad(wVar, i);
    }

    public final void run() {
        C17529w wVar = this.f47416a;
        int i = this.f47417b;
        int i2 = wVar.f47608f.bitrate;
        if (i2 != i) {
            boolean z = false;
            if (i < i2 && wVar.f47612j) {
                if (wVar.f47604b.getBoolean("need_restart_when_down_bitrate", false)) {
                    z = true;
                } else {
                    int i3 = 0;
                    while (i3 < 3) {
                        i3++;
                        wVar.f47613k.addLast(Long.valueOf(SystemClock.elapsedRealtime() + (((long) i3) * TimeUnit.SECONDS.toMillis(2))));
                    }
                    wVar.f47614l = i;
                }
            }
            wVar.f47608f.bitrate = i;
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 19 && wVar.f47606d != null) {
                if (z) {
                    wVar.f47605c.removeCallbacks(wVar.f47615m);
                    long elapsedRealtime = SystemClock.elapsedRealtime() - wVar.f47609g;
                    if (elapsedRealtime >= TimeUnit.SECONDS.toMillis(2)) {
                        wVar.f47615m.run();
                    } else {
                        wVar.f47605c.postDelayed(wVar.f47615m, 2000 - elapsedRealtime);
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("video-bitrate", i * 1024);
                    wVar.f47606d.setParameters(bundle);
                }
            }
        }
    }
}
