package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzbr;
import com.google.android.gms.internal.auth.zzi;

final class zzl implements zzm<Boolean> {
    private final /* synthetic */ String zzw;

    public zzl(String str) {
        this.zzw = str;
    }

    public final /* synthetic */ Object zze(IBinder iBinder) {
        Bundle bundle = (Bundle) zzg.zzd(zzi.zzd(iBinder).zzd(this.zzw));
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzbr zzh = zzbr.zzh(string);
        if (zzbr.SUCCESS.equals(zzh)) {
            return Boolean.TRUE;
        }
        if (zzbr.zzd(zzh)) {
            Logger zzd = zzg.zzq;
            String valueOf = String.valueOf(zzh);
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            zzd.mo167281w("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new GoogleAuthException(string);
    }
}
