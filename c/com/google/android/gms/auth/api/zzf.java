package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzbh;

public final class zzf {
    public static final Api<zzh> API;
    private static final Api.ClientKey<zzbh> zzas;
    private static final Api.AbstractClientBuilder<zzbh, zzh> zzat;

    static {
        Api.ClientKey<zzbh> clientKey = new Api.ClientKey<>();
        zzas = clientKey;
        zzg zzg = new zzg();
        zzat = zzg;
        API = new Api<>("Auth.PROXY_API", zzg, clientKey);
    }
}
