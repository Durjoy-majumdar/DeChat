package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

public final class zzbl extends OutputStream {
    private volatile zzav zzcw;
    private final OutputStream zzcy;

    public zzbl(OutputStream outputStream) {
        this.zzcy = (OutputStream) Preconditions.checkNotNull(outputStream);
    }

    private final IOException zza(IOException iOException) {
        zzav zzav = this.zzcw;
        if (zzav == null) {
            return iOException;
        }
        Log.isLoggable("ChannelOutputStream", 2);
        return new ChannelIOException("Channel closed unexpectedly before stream was finished", zzav.zzg, zzav.zzcj);
    }

    public final void close() {
        try {
            this.zzcy.close();
        } catch (IOException e) {
            throw zza(e);
        }
    }

    public final void flush() {
        try {
            this.zzcy.flush();
        } catch (IOException e) {
            throw zza(e);
        }
    }

    public final void write(int i) {
        try {
            this.zzcy.write(i);
        } catch (IOException e) {
            throw zza(e);
        }
    }

    public final void write(byte[] bArr) {
        try {
            this.zzcy.write(bArr);
        } catch (IOException e) {
            throw zza(e);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.zzcy.write(bArr, i, i2);
        } catch (IOException e) {
            throw zza(e);
        }
    }

    public final void zzc(zzav zzav) {
        this.zzcw = zzav;
    }
}
