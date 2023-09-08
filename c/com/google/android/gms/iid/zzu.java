package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Message;

final /* synthetic */ class zzu implements Handler.Callback {
    private final zzt zzch;

    public zzu(zzt zzt) {
        this.zzch = zzt;
    }

    public final boolean handleMessage(Message message) {
        return this.zzch.zzd(message);
    }
}
