package com.google.android.gms.auth;

import android.os.IBinder;
import com.google.android.gms.internal.auth.zzi;
import java.util.List;

final class zzj implements zzm<List<AccountChangeEvent>> {
    private final /* synthetic */ String zzu;
    private final /* synthetic */ int zzv;

    public zzj(String str, int i) {
        this.zzu = str;
        this.zzv = i;
    }

    public final /* synthetic */ Object zze(IBinder iBinder) {
        return ((AccountChangeEventsResponse) zzg.zzd(zzi.zzd(iBinder).zzd(new AccountChangeEventsRequest().setAccountName(this.zzu).setEventIndex(this.zzv)))).getEvents();
    }
}
