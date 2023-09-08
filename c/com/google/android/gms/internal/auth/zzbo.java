package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzbo extends zzbm {
    private final /* synthetic */ ProxyRequest zzec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbo(zzbn zzbn, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        super(googleApiClient);
        this.zzec = proxyRequest;
    }

    public final void zzd(Context context, zzbk zzbk) {
        zzbk.zzd(new zzbp(this), this.zzec);
    }
}
