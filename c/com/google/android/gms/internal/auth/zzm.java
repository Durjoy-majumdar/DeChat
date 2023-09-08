package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.auth.account.zzd;
import com.google.android.gms.auth.account.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zzm extends BaseImplementation.ApiMethodImpl<WorkAccountApi.AddAccountResult, zzu> {
    private final /* synthetic */ String zzt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzm(zzk zzk, Api api, GoogleApiClient googleApiClient, String str) {
        super((Api<?>) api, googleApiClient);
        this.zzt = str;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzr(status, (Account) null);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzf) ((zzu) anyClient).getService()).zzd((zzd) new zzn(this), this.zzt);
    }
}
