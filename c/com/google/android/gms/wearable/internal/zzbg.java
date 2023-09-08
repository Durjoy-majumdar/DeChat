package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.InputStream;

final class zzbg implements Channel.GetInputStreamResult {
    private final InputStream zzct;
    private final Status zzp;

    public zzbg(Status status, InputStream inputStream) {
        this.zzp = (Status) Preconditions.checkNotNull(status);
        this.zzct = inputStream;
    }

    public final InputStream getInputStream() {
        return this.zzct;
    }

    public final Status getStatus() {
        return this.zzp;
    }

    public final void release() {
        InputStream inputStream = this.zzct;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
