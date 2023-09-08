package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;

public abstract class zzyw implements Serializable, Iterable<Byte> {
    public static final zzyw zzbqx = new zzzc(zzzr.zzbsq);
    private static final zzza zzbqy = (zzyv.zzsv() ? new zzzd((zzyx) null) : new zzyy((zzyx) null));
    private int zzboc = 0;

    public static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb4 = new StringBuilder(66);
            sb4.append("Beginning index larger than ending index: ");
            sb4.append(i);
            sb4.append(", ");
            sb4.append(i2);
            throw new IndexOutOfBoundsException(sb4.toString());
        } else {
            StringBuilder sb5 = new StringBuilder(37);
            sb5.append("End index: ");
            sb5.append(i2);
            sb5.append(" >= ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public static zzyw zzfi(String str) {
        return new zzzc(str.getBytes(zzzr.UTF_8));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzboc;
        if (i == 0) {
            int size = size();
            i = zza(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzboc = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzyx(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract int zza(int i, int i2, int i3);

    public abstract byte zzae(int i);

    public abstract zzyw zzb(int i, int i2);

    public final int zzsx() {
        return this.zzboc;
    }
}
