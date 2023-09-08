package com.google.android.gms.common;

import com.google.android.gms.common.GoogleCertificates;
import java.util.Arrays;

final class zzb extends GoogleCertificates.CertData {
    private final byte[] zzbd;

    public zzb(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.zzbd = bArr;
    }

    public final byte[] getBytes() {
        return this.zzbd;
    }
}
