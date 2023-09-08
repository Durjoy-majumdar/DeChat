package com.google.android.gms.common.api.internal;

import android.app.Activity;

public abstract class ActivityLifecycleObserver {
    /* renamed from: of */
    public static final ActivityLifecycleObserver m155172of(Activity activity) {
        return new zza(activity);
    }

    public abstract ActivityLifecycleObserver onStopCallOnce(Runnable runnable);
}
