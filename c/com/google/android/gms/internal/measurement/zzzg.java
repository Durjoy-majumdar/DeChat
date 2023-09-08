package com.google.android.gms.internal.measurement;

final class zzzg extends zzze {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzbrh;
    private int zzbri;
    private int zzbrj;
    private int zzbrk;

    private zzzg(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzbrk = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzbrj = i;
        this.zzbrh = z;
    }

    private final void zzta() {
        int i = this.limit + this.zzbri;
        this.limit = i;
        int i2 = i - this.zzbrj;
        int i3 = this.zzbrk;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzbri = i4;
            this.limit = i - i4;
            return;
        }
        this.zzbri = 0;
    }

    public final int zzaf(int i) {
        if (i >= 0) {
            int zzsz = i + zzsz();
            int i2 = this.zzbrk;
            if (zzsz <= i2) {
                this.zzbrk = zzsz;
                zzta();
                return i2;
            }
            throw zzzt.zztm();
        }
        throw zzzt.zztn();
    }

    public final int zzsz() {
        return this.pos - this.zzbrj;
    }
}
