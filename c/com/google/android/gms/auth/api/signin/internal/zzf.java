package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p860p3.C117909a;

public final class zzf extends C117909a<Void> implements SignInConnectionListener {
    private Semaphore zzet = new Semaphore(0);
    private Set<GoogleApiClient> zzeu;

    public zzf(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.zzeu = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzm */
    public final Void loadInBackground() {
        int i = 0;
        for (GoogleApiClient maybeSignIn : this.zzeu) {
            if (maybeSignIn.maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.zzet.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final void onComplete() {
        this.zzet.release();
    }

    public final void onStartLoading() {
        this.zzet.drainPermits();
        forceLoad();
    }
}
