package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;

final class zzbp extends zzbg {
    private final /* synthetic */ zzbo zzed;

    public zzbp(zzbo zzbo) {
        this.zzed = zzbo;
    }

    public final void zzd(ProxyResponse proxyResponse) {
        this.zzed.setResult(new zzbq(proxyResponse));
    }
}
