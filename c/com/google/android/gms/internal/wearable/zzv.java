package com.google.android.gms.internal.wearable;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;

final class zzv {
    public final int tag;
    public final byte[] zzhm;

    public zzv(int i, byte[] bArr) {
        this.tag = i;
        this.zzhm = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzv)) {
            return false;
        }
        zzv zzv = (zzv) obj;
        return this.tag == zzv.tag && Arrays.equals(this.zzhm, zzv.zzhm);
    }

    public final int hashCode() {
        return ((this.tag + C1883v2.CTRL_INDEX) * 31) + Arrays.hashCode(this.zzhm);
    }
}
