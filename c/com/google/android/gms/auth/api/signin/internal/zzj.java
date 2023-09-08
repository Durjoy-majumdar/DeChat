package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzj extends zzp<GoogleSignInResult> {
    public final /* synthetic */ Context val$context;
    public final /* synthetic */ GoogleSignInOptions zzew;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzj(GoogleApiClient googleApiClient, Context context, GoogleSignInOptions googleSignInOptions) {
        super(googleApiClient);
        this.val$context = context;
        this.zzew = googleSignInOptions;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new GoogleSignInResult((GoogleSignInAccount) null, status);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzv) ((zzh) anyClient).getService()).zzd(new zzk(this), this.zzew);
    }
}
