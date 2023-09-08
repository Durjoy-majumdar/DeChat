package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p516f9.C116839r;
import p516f9.C116842u;

public abstract class zzb extends Service {

    /* renamed from: d */
    public final ExecutorService f339234d;

    /* renamed from: e */
    public Binder f339235e;

    /* renamed from: f */
    public final Object f339236f;

    /* renamed from: g */
    public int f339237g;

    /* renamed from: h */
    public int f339238h;

    public zzb() {
        String simpleName = getClass().getSimpleName();
        this.f339234d = Executors.newSingleThreadExecutor(new NamedThreadFactory(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-")));
        this.f339236f = new Object();
        this.f339238h = 0;
    }

    /* renamed from: a */
    public final void mo169427a(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.f339236f) {
            int i = this.f339238h - 1;
            this.f339238h = i;
            if (i == 0) {
                stopSelfResult(this.f339237g);
            }
        }
    }

    /* renamed from: b */
    public Intent mo169422b(Intent intent) {
        return intent;
    }

    /* renamed from: c */
    public boolean mo169428c(Intent intent) {
        return false;
    }

    /* renamed from: d */
    public abstract void mo169423d(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        boolean isLoggable = Log.isLoggable("EnhancedIntentService", 3);
        if (this.f339235e == null) {
            this.f339235e = new C116842u(this);
        }
        return this.f339235e;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f339236f) {
            this.f339237g = i2;
            this.f339238h++;
        }
        Intent b = mo169422b(intent);
        if (b == null) {
            mo169427a(intent);
            return 2;
        } else if (mo169428c(b)) {
            mo169427a(intent);
            return 2;
        } else {
            this.f339234d.execute(new C116839r(this, b, intent));
            return 3;
        }
    }
}
