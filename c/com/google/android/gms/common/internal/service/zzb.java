package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.service.CommonApiImpl;

final class zzb extends zzd {
    public zzb(CommonApiImpl commonApiImpl, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((ICommonService) ((CommonClient) anyClient).getService()).clearDefaultAccount(new CommonApiImpl.zza(this));
    }
}
