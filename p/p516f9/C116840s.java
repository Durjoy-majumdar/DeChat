package p516f9;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: f9.s */
public final class C116840s {

    /* renamed from: a */
    public final Intent f350216a;

    /* renamed from: b */
    public final BroadcastReceiver.PendingResult f350217b;

    /* renamed from: c */
    public boolean f350218c = false;

    /* renamed from: d */
    public final ScheduledFuture<?> f350219d;

    public C116840s(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f350216a = intent;
        this.f350217b = pendingResult;
        this.f350219d = scheduledExecutorService.schedule(new C116841t(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final synchronized void mo180836a() {
        if (!this.f350218c) {
            this.f350217b.finish();
            this.f350219d.cancel(false);
            this.f350218c = true;
        }
    }
}
