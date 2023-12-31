package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import p1042u.C90590d;

public class zzad extends zzk {
    private GoogleApiManager zzcq;
    private final C90590d<zzh<?>> zzhb = new C90590d<>();

    private zzad(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public static void zza(Activity activity, GoogleApiManager googleApiManager, zzh<?> zzh) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zzad zzad = (zzad) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zzad.class);
        if (zzad == null) {
            zzad = new zzad(fragment);
        }
        zzad.zzcq = googleApiManager;
        Preconditions.checkNotNull(zzh, "ApiKey cannot be null");
        zzad.zzhb.add(zzh);
        googleApiManager.zza(zzad);
    }

    private final void zzan() {
        if (!this.zzhb.isEmpty()) {
            this.zzcq.zza(this);
        }
    }

    public final void onResume() {
        super.onResume();
        zzan();
    }

    public final void onStart() {
        super.onStart();
        zzan();
    }

    public void onStop() {
        super.onStop();
        this.zzcq.zzb(this);
    }

    public final void zza(ConnectionResult connectionResult, int i) {
        this.zzcq.zza(connectionResult, i);
    }

    public final C90590d<zzh<?>> zzam() {
        return this.zzhb;
    }

    public final void zzr() {
        this.zzcq.zzr();
    }
}
