package com.google.android.gms.internal.measurement;

final class zzyz extends zzzc {
    private final int zzbra;
    private final int zzbrb;

    public zzyz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzyw.zzb(i, i + i2, bArr.length);
        this.zzbra = i;
        this.zzbrb = i2;
    }

    public final int size() {
        return this.zzbrb;
    }

    public final byte zzae(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzbrc[this.zzbra + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb4 = new StringBuilder(40);
        sb4.append("Index > length: ");
        sb4.append(i);
        sb4.append(", ");
        sb4.append(size);
        throw new ArrayIndexOutOfBoundsException(sb4.toString());
    }

    public final int zzsy() {
        return this.zzbra;
    }
}
