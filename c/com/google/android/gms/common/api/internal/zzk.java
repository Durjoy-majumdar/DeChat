package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzk extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean mStarted;
    public final GoogleApiAvailability zzdg;
    public final AtomicReference<zzl> zzer;
    private final Handler zzes;

    public zzk(LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, GoogleApiAvailability.getInstance());
    }

    private zzk(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zzer = new AtomicReference<>((Object) null);
        this.zzes = new Handler(Looper.getMainLooper());
        this.zzdg = googleApiAvailability;
    }

    private static int zza(zzl zzl) {
        if (zzl == null) {
            return -1;
        }
        return zzl.zzu();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zzl> r0 = r3.zzer
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zzl r0 = (com.google.android.gms.common.api.internal.zzl) r0
            r1 = 1
            r2 = 0
            if (r4 == r1) goto L_0x0030
            r5 = 2
            if (r4 == r5) goto L_0x0010
            goto L_0x0055
        L_0x0010:
            com.google.android.gms.common.GoogleApiAvailability r4 = r3.zzdg
            android.app.Activity r5 = r3.getActivity()
            int r4 = r4.isGooglePlayServicesAvailable(r5)
            if (r4 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.common.ConnectionResult r5 = r0.getConnectionResult()
            int r5 = r5.getErrorCode()
            r6 = 18
            if (r5 != r6) goto L_0x0056
            if (r4 != r6) goto L_0x0056
            return
        L_0x0030:
            r4 = -1
            if (r5 != r4) goto L_0x0034
            goto L_0x0056
        L_0x0034:
            if (r5 != 0) goto L_0x0055
            r4 = 13
            if (r6 == 0) goto L_0x0040
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x0040:
            com.google.android.gms.common.api.internal.zzl r5 = new com.google.android.gms.common.api.internal.zzl
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = zza(r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zzl> r4 = r3.zzer
            r4.set(r5)
            r0 = r5
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x005c
            r3.zzt()
            return
        L_0x005c:
            if (r0 == 0) goto L_0x0069
            com.google.android.gms.common.ConnectionResult r4 = r0.getConnectionResult()
            int r5 = r0.zzu()
            r3.zza(r4, r5)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzk.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        zza(new ConnectionResult(13, (PendingIntent) null), zza(this.zzer.get()));
        zzt();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zzer.set(bundle.getBoolean("resolving_error", false) ? new zzl(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zzl zzl = this.zzer.get();
        if (zzl != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zzl.zzu());
            bundle.putInt("failed_status", zzl.getConnectionResult().getErrorCode());
            bundle.putParcelable("failed_resolution", zzl.getConnectionResult().getResolution());
        }
    }

    public void onStart() {
        super.onStart();
        this.mStarted = true;
    }

    public void onStop() {
        super.onStop();
        this.mStarted = false;
    }

    public abstract void zza(ConnectionResult connectionResult, int i);

    public final void zzb(ConnectionResult connectionResult, int i) {
        boolean z;
        zzl zzl = new zzl(connectionResult, i);
        AtomicReference<zzl> atomicReference = this.zzer;
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, zzl)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            this.zzes.post(new zzm(this, zzl));
        }
    }

    public abstract void zzr();

    public final void zzt() {
        this.zzer.set((Object) null);
        zzr();
    }
}
