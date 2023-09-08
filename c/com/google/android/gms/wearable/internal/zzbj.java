package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.InputStream;

public final class zzbj extends InputStream {
    private final InputStream zzcv;
    private volatile zzav zzcw;

    public zzbj(InputStream inputStream) {
        this.zzcv = (InputStream) Preconditions.checkNotNull(inputStream);
    }

    private final int zza(int i) {
        zzav zzav;
        if (i != -1 || (zzav = this.zzcw) == null) {
            return i;
        }
        throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzav.zzg, zzav.zzcj);
    }

    public final int available() {
        return this.zzcv.available();
    }

    public final void close() {
        this.zzcv.close();
    }

    public final void mark(int i) {
        this.zzcv.mark(i);
    }

    public final boolean markSupported() {
        return this.zzcv.markSupported();
    }

    public final int read() {
        return zza(this.zzcv.read());
    }

    public final int read(byte[] bArr) {
        return zza(this.zzcv.read(bArr));
    }

    public final int read(byte[] bArr, int i, int i2) {
        return zza(this.zzcv.read(bArr, i, i2));
    }

    public final void reset() {
        this.zzcv.reset();
    }

    public final long skip(long j) {
        return this.zzcv.skip(j);
    }

    public final void zza(zzav zzav) {
        this.zzcw = (zzav) Preconditions.checkNotNull(zzav);
    }
}
