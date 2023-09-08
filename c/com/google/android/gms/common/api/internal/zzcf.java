package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcf extends TaskApiCall {
    private final /* synthetic */ TaskApiCall.Builder zzmc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcf(TaskApiCall.Builder builder, Feature[] featureArr, boolean z) {
        super(featureArr, z);
        this.zzmc = builder;
    }

    public final void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        this.zzmc.zzmb.accept(anyClient, taskCompletionSource);
    }
}
