package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class zzg implements GoogleSignInApi {
    private static GoogleSignInOptions zzd(GoogleApiClient googleApiClient) {
        return ((zzh) googleApiClient.getClient(Auth.zzak)).zzn();
    }

    public final Intent getSignInIntent(GoogleApiClient googleApiClient) {
        return zzi.zzd(googleApiClient.getContext(), zzd(googleApiClient));
    }

    public final GoogleSignInResult getSignInResultFromIntent(Intent intent) {
        return zzi.getSignInResultFromIntent(intent);
    }

    public final PendingResult<Status> revokeAccess(GoogleApiClient googleApiClient) {
        return zzi.zze(googleApiClient, googleApiClient.getContext(), false);
    }

    public final PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return zzi.zzd(googleApiClient, googleApiClient.getContext(), false);
    }

    public final OptionalPendingResult<GoogleSignInResult> silentSignIn(GoogleApiClient googleApiClient) {
        return zzi.zzd(googleApiClient, googleApiClient.getContext(), zzd(googleApiClient), false);
    }
}
