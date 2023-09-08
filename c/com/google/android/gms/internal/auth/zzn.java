package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

final class zzn extends zzq {
    private final /* synthetic */ zzm zzah;

    public zzn(zzm zzm) {
        this.zzah = zzm;
    }

    public final void zzf(Account account) {
        this.zzah.setResult(new zzr(account != null ? Status.RESULT_SUCCESS : zzk.zzaf, account));
    }
}
