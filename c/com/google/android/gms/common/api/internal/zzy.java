package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;
import p1042u.C111055b;

final class zzy implements OnCompleteListener<Map<zzh<?>, String>> {
    private final /* synthetic */ zzw zzgu;

    private zzy(zzw zzw) {
        this.zzgu = zzw;
    }

    public final void onComplete(Task<Map<zzh<?>, String>> task) {
        zzw zzw;
        ConnectionResult connectionResult;
        Map zzd;
        this.zzgu.zzga.lock();
        try {
            if (this.zzgu.zzgp) {
                if (task.isSuccessful()) {
                    zzw zzw2 = this.zzgu;
                    Map unused = zzw2.zzgq = new C111055b(zzw2.zzgg.size());
                    for (zzv zzm : this.zzgu.zzgg.values()) {
                        this.zzgu.zzgq.put(zzm.zzm(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else {
                    if (task.getException() instanceof AvailabilityException) {
                        AvailabilityException availabilityException = (AvailabilityException) task.getException();
                        if (this.zzgu.zzgn) {
                            zzw zzw3 = this.zzgu;
                            Map unused2 = zzw3.zzgq = new C111055b(zzw3.zzgg.size());
                            for (zzv zzv : this.zzgu.zzgg.values()) {
                                zzh zzm2 = zzv.zzm();
                                ConnectionResult connectionResult2 = availabilityException.getConnectionResult(zzv);
                                if (this.zzgu.zza((zzv<?>) zzv, connectionResult2)) {
                                    zzd = this.zzgu.zzgq;
                                    connectionResult2 = new ConnectionResult(16);
                                } else {
                                    zzd = this.zzgu.zzgq;
                                }
                                zzd.put(zzm2, connectionResult2);
                            }
                        } else {
                            Map unused3 = this.zzgu.zzgq = availabilityException.zzl();
                        }
                        zzw = this.zzgu;
                        connectionResult = zzw.zzai();
                    } else {
                        task.getException();
                        Map unused4 = this.zzgu.zzgq = Collections.emptyMap();
                        zzw = this.zzgu;
                        connectionResult = new ConnectionResult(8);
                    }
                    ConnectionResult unused5 = zzw.zzgt = connectionResult;
                }
                if (this.zzgu.zzgr != null) {
                    this.zzgu.zzgq.putAll(this.zzgu.zzgr);
                    zzw zzw4 = this.zzgu;
                    ConnectionResult unused6 = zzw4.zzgt = zzw4.zzai();
                }
                if (this.zzgu.zzgt == null) {
                    this.zzgu.zzag();
                    this.zzgu.zzah();
                } else {
                    boolean unused7 = this.zzgu.zzgp = false;
                    this.zzgu.zzgj.zzc(this.zzgu.zzgt);
                }
                this.zzgu.zzgl.signalAll();
            }
        } finally {
            this.zzgu.zzga.unlock();
        }
    }
}
