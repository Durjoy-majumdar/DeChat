package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class zza extends ActivityLifecycleObserver {
    private final WeakReference<C119185zza> zzds;

    /* renamed from: com.google.android.gms.common.api.internal.zza$zza  reason: collision with other inner class name */
    public static class C119185zza extends LifecycleCallback {
        private List<Runnable> zzdt = new ArrayList();

        private C119185zza(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* access modifiers changed from: private */
        public static C119185zza zza(Activity activity) {
            C119185zza zza;
            synchronized (activity) {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                zza = (C119185zza) fragment.getCallbackOrNull("LifecycleObserverOnStop", C119185zza.class);
                if (zza == null) {
                    zza = new C119185zza(fragment);
                }
            }
            return zza;
        }

        /* access modifiers changed from: private */
        public final synchronized void zza(Runnable runnable) {
            this.zzdt.add(runnable);
        }

        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zzdt;
                this.zzdt = new ArrayList();
            }
            for (Runnable run : list) {
                run.run();
            }
        }
    }

    public zza(Activity activity) {
        this(C119185zza.zza(activity));
    }

    private zza(C119185zza zza) {
        this.zzds = new WeakReference<>(zza);
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C119185zza zza = this.zzds.get();
        if (zza != null) {
            zza.zza(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
