package com.google.android.gms.common;

import com.google.android.gms.common.GoogleCertificates;
import java.lang.ref.WeakReference;

abstract class zzc extends GoogleCertificates.CertData {
    private static final WeakReference<byte[]> zzbf = new WeakReference<>((Object) null);
    private WeakReference<byte[]> zzbe = zzbf;

    public zzc(byte[] bArr) {
        super(bArr);
    }

    public final byte[] getBytes() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.zzbe.get();
            if (bArr == null) {
                bArr = zzf();
                this.zzbe = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] zzf();
}
