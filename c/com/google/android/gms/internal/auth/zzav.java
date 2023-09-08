package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

abstract class zzav<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzax> {
    public zzav(GoogleApiClient googleApiClient) {
        super((Api<?>) Auth.CREDENTIALS_API, googleApiClient);
    }

    public /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzax zzax = (zzax) anyClient;
        zzd(zzax.getContext(), (zzbc) zzax.getService());
    }

    public abstract void zzd(Context context, zzbc zzbc);
}
