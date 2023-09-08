package p1160w4;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: w4.c */
public class C111733c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f334612d;

    /* renamed from: e */
    public final /* synthetic */ Notification f334613e;

    /* renamed from: f */
    public final /* synthetic */ int f334614f;

    /* renamed from: g */
    public final /* synthetic */ SystemForegroundService f334615g;

    public C111733c(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f334615g = systemForegroundService;
        this.f334612d = i;
        this.f334613e = notification;
        this.f334614f = i2;
    }

    public void run() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f334615g.startForeground(this.f334612d, this.f334613e, this.f334614f);
        } else {
            this.f334615g.startForeground(this.f334612d, this.f334613e);
        }
    }
}
