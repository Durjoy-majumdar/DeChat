package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;

public final class zzx extends zzs {
    private final Context mContext;

    public zzx(Context context) {
        this.mContext = context;
    }

    private final void zzs() {
        if (!GooglePlayServicesUtilLight.isGooglePlayServicesUid(this.mContext, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    public final void zzq() {
        zzs();
        Storage instance = Storage.getInstance(this.mContext);
        GoogleSignInAccount savedDefaultGoogleSignInAccount = instance.getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            googleSignInOptions = instance.getSavedDefaultGoogleSignInOptions();
        }
        GoogleApiClient build = new GoogleApiClient.Builder(this.mContext).addApi(Auth.GOOGLE_SIGN_IN_API, googleSignInOptions).build();
        try {
            if (build.blockingConnect().isSuccess()) {
                if (savedDefaultGoogleSignInAccount != null) {
                    Auth.GoogleSignInApi.revokeAccess(build);
                } else {
                    build.clearDefaultAccountAndReconnect();
                }
            }
        } finally {
            build.disconnect();
        }
    }

    public final void zzr() {
        zzs();
        zzq.zze(this.mContext).clear();
    }
}
