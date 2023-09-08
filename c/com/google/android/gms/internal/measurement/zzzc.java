package com.google.android.gms.internal.measurement;

class zzzc extends zzzb {
    public final byte[] zzbrc;

    public zzzc(byte[] bArr) {
        this.zzbrc = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzyw) || size() != ((zzyw) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzzc)) {
            return obj.equals(this);
        }
        zzzc zzzc = (zzzc) obj;
        int zzsx = zzsx();
        int zzsx2 = zzzc.zzsx();
        if (zzsx == 0 || zzsx2 == 0 || zzsx == zzsx2) {
            return zza((zzyw) zzzc, 0, size());
        }
        return false;
    }

    public int size() {
        return this.zzbrc.length;
    }

    public final int zza(int i, int i2, int i3) {
        return zzzr.zza(i, this.zzbrc, zzsy(), i3);
    }

    public final boolean zza(zzyw zzyw, int i, int i2) {
        if (i2 > zzyw.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzyw.size()) {
            int size2 = zzyw.size();
            StringBuilder sb4 = new StringBuilder(59);
            sb4.append("Ran off end of other: 0, ");
            sb4.append(i2);
            sb4.append(", ");
            sb4.append(size2);
            throw new IllegalArgumentException(sb4.toString());
        } else if (!(zzyw instanceof zzzc)) {
            return zzyw.zzb(0, i2).equals(zzb(0, i2));
        } else {
            zzzc zzzc = (zzzc) zzyw;
            byte[] bArr = this.zzbrc;
            byte[] bArr2 = zzzc.zzbrc;
            int zzsy = zzsy() + i2;
            int zzsy2 = zzsy();
            int zzsy3 = zzzc.zzsy();
            while (zzsy2 < zzsy) {
                if (bArr[zzsy2] != bArr2[zzsy3]) {
                    return false;
                }
                zzsy2++;
                zzsy3++;
            }
            return true;
        }
    }

    public byte zzae(int i) {
        return this.zzbrc[i];
    }

    public final zzyw zzb(int i, int i2) {
        int zzb = zzyw.zzb(0, i2, size());
        return zzb == 0 ? zzyw.zzbqx : new zzyz(this.zzbrc, zzsy(), zzb);
    }

    public int zzsy() {
        return 0;
    }
}
