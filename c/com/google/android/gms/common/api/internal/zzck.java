package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.zzc;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzck {
    public static final Status zzmm = new Status(8, "The connection to Google Play services was lost");
    private static final BasePendingResult<?>[] zzmn = new BasePendingResult[0];
    private final Map<Api.AnyClientKey<?>, Api.Client> zzil;
    public final Set<BasePendingResult<?>> zzmo = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final zzcn zzmp = new zzcl(this);

    public zzck(Map<Api.AnyClientKey<?>, Api.Client> map) {
        this.zzil = map;
    }

    public final void release() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zzmo.toArray(zzmn)) {
            basePendingResult.zza((zzcn) null);
            if (basePendingResult.zzo() != null) {
                basePendingResult.setResultCallback((ResultCallback) null);
                IBinder serviceBrokerBinder = this.zzil.get(((BaseImplementation.ApiMethodImpl) basePendingResult).getClientKey()).getServiceBrokerBinder();
                if (basePendingResult.isReady()) {
                    basePendingResult.zza((zzcn) new zzcm(basePendingResult, (zzc) null, serviceBrokerBinder, (zzcl) null));
                } else if (serviceBrokerBinder == null || !serviceBrokerBinder.isBinderAlive()) {
                    basePendingResult.zza((zzcn) null);
                    basePendingResult.cancel();
                    basePendingResult.zzo().intValue();
                    throw null;
                } else {
                    zzcm zzcm = new zzcm(basePendingResult, (zzc) null, serviceBrokerBinder, (zzcl) null);
                    basePendingResult.zza((zzcn) zzcm);
                    try {
                        serviceBrokerBinder.linkToDeath(zzcm, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.cancel();
                        basePendingResult.zzo().intValue();
                        throw null;
                    }
                }
            } else if (!basePendingResult.zzw()) {
            }
            this.zzmo.remove(basePendingResult);
        }
    }

    public final void zzb(BasePendingResult<? extends Result> basePendingResult) {
        this.zzmo.add(basePendingResult);
        basePendingResult.zza(this.zzmp);
    }

    public final void zzce() {
        for (BasePendingResult zzb : (BasePendingResult[]) this.zzmo.toArray(zzmn)) {
            zzb.zzb(zzmm);
        }
    }
}
