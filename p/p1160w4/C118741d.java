package p1160w4;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: w4.d */
public class C118741d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f355278d;

    /* renamed from: e */
    public final /* synthetic */ Notification f355279e;

    /* renamed from: f */
    public final /* synthetic */ SystemForegroundService f355280f;

    public C118741d(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f355280f = systemForegroundService;
        this.f355278d = i;
        this.f355279e = notification;
    }

    public void run() {
        this.f355280f.f338427h.notify(this.f355278d, this.f355279e);
    }
}
