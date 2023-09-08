package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzk;
import com.google.android.gms.internal.auth.zzu;

public class WorkAccount {
    public static final Api<Api.ApiOptions.NoOptions> API;
    private static final Api.AbstractClientBuilder<zzu, Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final Api.ClientKey<zzu> CLIENT_KEY;
    @Deprecated
    public static final WorkAccountApi WorkAccountApi = new zzk();

    static {
        Api.ClientKey<zzu> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zzi zzi = new zzi();
        CLIENT_BUILDER = zzi;
        API = new Api<>("WorkAccount.API", zzi, clientKey);
    }

    private WorkAccount() {
    }

    public static WorkAccountClient getClient(Activity activity) {
        return new WorkAccountClient(activity);
    }

    public static WorkAccountClient getClient(Context context) {
        return new WorkAccountClient(context);
    }
}
