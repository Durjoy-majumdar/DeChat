package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class zzq {
    private static zzq zzfa;
    private Storage zzfb;
    private GoogleSignInAccount zzfc;
    private GoogleSignInOptions zzfd = this.zzfb.getSavedDefaultGoogleSignInOptions();

    private zzq(Context context) {
        Storage instance = Storage.getInstance(context);
        this.zzfb = instance;
        this.zzfc = instance.getSavedDefaultGoogleSignInAccount();
    }

    public static synchronized zzq zze(Context context) {
        zzq zzf;
        synchronized (zzq.class) {
            zzf = zzf(context.getApplicationContext());
        }
        return zzf;
    }

    private static synchronized zzq zzf(Context context) {
        zzq zzq;
        synchronized (zzq.class) {
            if (zzfa == null) {
                zzfa = new zzq(context);
            }
            zzq = zzfa;
        }
        return zzq;
    }

    public final synchronized void clear() {
        this.zzfb.clear();
        this.zzfc = null;
        this.zzfd = null;
    }

    public final synchronized void zzd(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.zzfb.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.zzfc = googleSignInAccount;
        this.zzfd = googleSignInOptions;
    }

    public final synchronized GoogleSignInAccount zzo() {
        return this.zzfc;
    }

    public final synchronized GoogleSignInOptions zzp() {
        return this.zzfd;
    }
}
