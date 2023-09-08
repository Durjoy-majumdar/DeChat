package com.google.android.gms.internal.p1178authapiphone;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzm */
abstract class zzm extends TaskApiCall<zzi, Void> {
    private TaskCompletionSource<Void> zzf;

    private zzm() {
    }

    public /* synthetic */ zzm(zzk zzk) {
        this();
    }

    public /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        this.zzf = taskCompletionSource;
        zza((zze) ((zzi) anyClient).getService());
    }

    public abstract void zza(zze zze);

    public final void zzb(Status status) {
        TaskUtil.setResultOrApiException(status, this.zzf);
    }
}
