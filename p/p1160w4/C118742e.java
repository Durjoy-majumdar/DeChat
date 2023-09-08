package p1160w4;

import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: w4.e */
public class C118742e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f355281d;

    /* renamed from: e */
    public final /* synthetic */ SystemForegroundService f355282e;

    public C118742e(SystemForegroundService systemForegroundService, int i) {
        this.f355282e = systemForegroundService;
        this.f355281d = i;
    }

    public void run() {
        this.f355282e.f338427h.cancel(this.f355281d);
    }
}
