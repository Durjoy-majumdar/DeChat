package com.tencent.p014mm.plugin.walletlock.model;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.walletlock.model.j */
public enum C106561j {
    INSTANCE;
    

    /* renamed from: d */
    public boolean f318387d;

    /* renamed from: e */
    public boolean f318388e;

    /* renamed from: f */
    public Object f318389f;

    /* renamed from: g */
    public HashSet<WeakReference<Activity>> f318390g;

    /* renamed from: a */
    public void mo153259a(WeakReference<Activity> weakReference) {
        if (this.f318390g != null) {
            if (weakReference.get() != null) {
                Log.m105927v("MicroMsg.WalletLockStatusManager", "alvinluo addProtectActivity %s", weakReference.get().getClass().getName());
            }
            this.f318390g.add(weakReference);
        }
    }

    /* renamed from: b */
    public void mo153260b() {
        Iterator<WeakReference<Activity>> it = this.f318390g.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next().get();
            if (activity != null && !activity.isFinishing()) {
                Log.m105927v("MicroMsg.WalletLockStatusManager", "alvinluo finish %s", activity.getClass().getName());
                activity.finish();
            }
            it.remove();
        }
    }

    /* renamed from: c */
    public boolean mo153261c() {
        boolean z;
        synchronized (this.f318389f) {
            z = this.f318387d;
        }
        return z;
    }

    /* renamed from: e */
    public void mo153262e() {
        synchronized (this.f318389f) {
            this.f318388e = true;
        }
    }

    /* renamed from: f */
    public void mo153263f(boolean z) {
        synchronized (this.f318389f) {
            this.f318387d = z;
        }
    }

    /* renamed from: g */
    public void mo153264g(boolean z) {
        synchronized (this.f318389f) {
            this.f318388e = z;
        }
    }
}
