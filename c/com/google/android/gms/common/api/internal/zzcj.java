package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

final class zzcj extends Handler {
    private final /* synthetic */ zzch zzml;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcj(zzch zzch, Looper looper) {
        super(looper);
        this.zzml = zzch;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            PendingResult pendingResult = (PendingResult) message.obj;
            synchronized (this.zzml.zzfa) {
                if (pendingResult == null) {
                    this.zzml.zzme.zzd(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zzbx) {
                    this.zzml.zzme.zzd(((zzbx) pendingResult).getStatus());
                } else {
                    this.zzml.zzme.zza(pendingResult);
                }
            }
        } else if (i == 1) {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            if (valueOf.length() != 0) {
                "Runtime exception on the transformation worker thread: ".concat(valueOf);
            }
            throw runtimeException;
        }
    }
}
