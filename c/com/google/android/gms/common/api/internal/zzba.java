package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class zzba extends Handler {
    private final /* synthetic */ zzav zzit;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzba(zzav zzav, Looper looper) {
        super(looper);
        this.zzit = zzav;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.zzit.zzay();
        } else if (i == 2) {
            this.zzit.resume();
        }
    }
}
