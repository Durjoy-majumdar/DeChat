package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzbr;
import com.google.android.gms.internal.auth.zzi;
import java.io.IOException;

final class zzh implements zzm<TokenData> {
    private final /* synthetic */ Bundle val$options;
    private final /* synthetic */ Account zzr;
    private final /* synthetic */ String zzs;

    public zzh(Account account, String str, Bundle bundle) {
        this.zzr = account;
        this.zzs = str;
        this.val$options = bundle;
    }

    public final /* synthetic */ Object zze(IBinder iBinder) {
        Bundle bundle = (Bundle) zzg.zzd(zzi.zzd(iBinder).zzd(this.zzr, this.zzs, this.val$options));
        TokenData zzd = TokenData.zzd(bundle, "tokenDetails");
        if (zzd != null) {
            return zzd;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzbr zzh = zzbr.zzh(string);
        boolean z = false;
        if (!zzbr.zzd(zzh)) {
            if (zzbr.NETWORK_ERROR.equals(zzh) || zzbr.SERVICE_UNAVAILABLE.equals(zzh)) {
                z = true;
            }
            if (z) {
                throw new IOException(string);
            }
            throw new GoogleAuthException(string);
        }
        Logger zzd2 = zzg.zzq;
        String valueOf = String.valueOf(zzh);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        zzd2.mo167281w("GoogleAuthUtil", sb.toString());
        throw new UserRecoverableAuthException(string, intent);
    }
}
