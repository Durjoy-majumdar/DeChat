package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;

public final class Common {
    public static final Api<Api.ApiOptions.NoOptions> API;
    private static final Api.AbstractClientBuilder<CommonClient, Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    public static final Api.ClientKey<CommonClient> CLIENT_KEY;
    public static final CommonApi CommonApi = new CommonApiImpl();

    static {
        Api.ClientKey<CommonClient> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zza zza = new zza();
        CLIENT_BUILDER = zza;
        API = new Api<>("Common.API", zza, clientKey);
    }
}
