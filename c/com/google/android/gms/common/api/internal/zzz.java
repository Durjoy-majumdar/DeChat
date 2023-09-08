package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;
import p1042u.C111055b;

final class zzz implements OnCompleteListener<Map<zzh<?>, String>> {
    private final /* synthetic */ zzw zzgu;
    private SignInConnectionListener zzgv;

    public zzz(zzw zzw, SignInConnectionListener signInConnectionListener) {
        this.zzgu = zzw;
        this.zzgv = signInConnectionListener;
    }

    public final void cancel() {
        this.zzgv.onComplete();
    }

    public final void onComplete(Task<Map<zzh<?>, String>> task) {
        SignInConnectionListener signInConnectionListener;
        Map zzg;
        this.zzgu.zzga.lock();
        try {
            if (!this.zzgu.zzgp) {
                signInConnectionListener = this.zzgv;
            } else {
                if (task.isSuccessful()) {
                    zzw zzw = this.zzgu;
                    Map unused = zzw.zzgr = new C111055b(zzw.zzgh.size());
                    for (zzv zzm : this.zzgu.zzgh.values()) {
                        this.zzgu.zzgr.put(zzm.zzm(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.getException() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.getException();
                    if (this.zzgu.zzgn) {
                        zzw zzw2 = this.zzgu;
                        Map unused2 = zzw2.zzgr = new C111055b(zzw2.zzgh.size());
                        for (zzv zzv : this.zzgu.zzgh.values()) {
                            zzh zzm2 = zzv.zzm();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(zzv);
                            if (this.zzgu.zza((zzv<?>) zzv, connectionResult)) {
                                zzg = this.zzgu.zzgr;
                                connectionResult = new ConnectionResult(16);
                            } else {
                                zzg = this.zzgu.zzgr;
                            }
                            zzg.put(zzm2, connectionResult);
                        }
                    } else {
                        Map unused3 = this.zzgu.zzgr = availabilityException.zzl();
                    }
                } else {
                    task.getException();
                    Map unused4 = this.zzgu.zzgr = Collections.emptyMap();
                }
                if (this.zzgu.isConnected()) {
                    this.zzgu.zzgq.putAll(this.zzgu.zzgr);
                    if (this.zzgu.zzai() == null) {
                        this.zzgu.zzag();
                        this.zzgu.zzah();
                        this.zzgu.zzgl.signalAll();
                    }
                }
                signInConnectionListener = this.zzgv;
            }
            signInConnectionListener.onComplete();
        } finally {
            this.zzgu.zzga.unlock();
        }
    }
}
