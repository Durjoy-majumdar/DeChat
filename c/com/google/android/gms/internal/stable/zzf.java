package com.google.android.gms.internal.stable;

import android.database.ContentObserver;
import android.os.Handler;

final class zzf extends ContentObserver {
    private final /* synthetic */ zzh zzagr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzf(Handler handler, zzh zzh) {
        super((Handler) null);
        this.zzagr = zzh;
    }

    public final void onChange(boolean z) {
        this.zzagr.zzagu.set(true);
    }
}
