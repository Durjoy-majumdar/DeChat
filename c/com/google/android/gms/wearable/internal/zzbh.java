package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.OutputStream;

final class zzbh implements Channel.GetOutputStreamResult {
    private final OutputStream zzcu;
    private final Status zzp;

    public zzbh(Status status, OutputStream outputStream) {
        this.zzp = (Status) Preconditions.checkNotNull(status);
        this.zzcu = outputStream;
    }

    public final OutputStream getOutputStream() {
        return this.zzcu;
    }

    public final Status getStatus() {
        return this.zzp;
    }

    public final void release() {
        OutputStream outputStream = this.zzcu;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
