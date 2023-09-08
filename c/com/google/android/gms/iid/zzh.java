package com.google.android.gms.iid;

import android.content.Intent;

final class zzh implements Runnable {
    private final /* synthetic */ Intent zzbb;
    private final /* synthetic */ zzg zzbh;

    public zzh(zzg zzg, Intent intent) {
        this.zzbh = zzg;
        this.zzbb = intent;
    }

    public final void run() {
        new StringBuilder(String.valueOf(this.zzbb.getAction()).length() + 61);
        this.zzbh.finish();
    }
}
