package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

abstract class zzbm extends BaseImplementation.ApiMethodImpl<ProxyApi.ProxyResult, zzbh> {
    public zzbm(GoogleApiClient googleApiClient) {
        super((Api<?>) zzf.API, googleApiClient);
    }

    public /* synthetic */ Result createFailedResult(Status status) {
        return new zzbq(status);
    }

    public /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzbh zzbh = (zzbh) anyClient;
        zzd(zzbh.getContext(), (zzbk) zzbh.getService());
    }

    public abstract void zzd(Context context, zzbk zzbk);
}
