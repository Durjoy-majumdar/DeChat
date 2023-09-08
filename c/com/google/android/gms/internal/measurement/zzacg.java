package com.google.android.gms.internal.measurement;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;

final class zzacg {
    public final int tag;
    public final byte[] zzbrc;

    public zzacg(int i, byte[] bArr) {
        this.tag = i;
        this.zzbrc = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacg)) {
            return false;
        }
        zzacg zzacg = (zzacg) obj;
        return this.tag == zzacg.tag && Arrays.equals(this.zzbrc, zzacg.zzbrc);
    }

    public final int hashCode() {
        return ((this.tag + C1883v2.CTRL_INDEX) * 31) + Arrays.hashCode(this.zzbrc);
    }
}
