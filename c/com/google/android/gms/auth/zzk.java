package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.zzi;

final class zzk implements zzm<Bundle> {
    private final /* synthetic */ Account zzr;

    public zzk(Account account) {
        this.zzr = account;
    }

    public final /* synthetic */ Object zze(IBinder iBinder) {
        return (Bundle) zzg.zzd(zzi.zzd(iBinder).zzd(this.zzr));
    }
}
