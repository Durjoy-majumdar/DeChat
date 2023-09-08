package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.zzd;
import com.google.android.gms.auth.account.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zzo extends BaseImplementation.ApiMethodImpl<Result, zzu> {
    private final /* synthetic */ Account zzr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzo(zzk zzk, Api api, GoogleApiClient googleApiClient, Account account) {
        super((Api<?>) api, googleApiClient);
        this.zzr = account;
    }

    public final Result createFailedResult(Status status) {
        return new zzt(status);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzf) ((zzu) anyClient).getService()).zzd((zzd) new zzp(this), this.zzr);
    }
}
