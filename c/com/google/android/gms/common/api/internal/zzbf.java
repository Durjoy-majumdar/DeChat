package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class zzbf extends Handler {
    private final /* synthetic */ zzbd zzjh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbf(zzbd zzbd, Looper looper) {
        super(looper);
        this.zzjh = zzbd;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zzbe) message.obj).zzc(this.zzjh);
        } else if (i == 2) {
            throw ((RuntimeException) message.obj);
        }
    }
}
