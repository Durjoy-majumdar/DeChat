package com.google.android.gms.internal.wearable;

public final class zzg extends zzn<zzg> {
    public zzh[] zzfy = zzh.zzh();

    public zzg() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    public static zzg zza(byte[] bArr) {
        return (zzg) zzt.zza(new zzg(), bArr, 0, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzg)) {
            return false;
        }
        zzg zzg = (zzg) obj;
        if (!zzr.equals((Object[]) this.zzfy, (Object[]) zzg.zzfy)) {
            return false;
        }
        zzp zzp = this.zzhc;
        if (zzp != null && !zzp.isEmpty()) {
            return this.zzhc.equals(zzg.zzhc);
        }
        zzp zzp2 = zzg.zzhc;
        return zzp2 == null || zzp2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = (1588755158 + zzr.hashCode((Object[]) this.zzfy)) * 31;
        zzp zzp = this.zzhc;
        return hashCode + ((zzp == null || zzp.isEmpty()) ? 0 : this.zzhc.hashCode());
    }

    public final /* synthetic */ zzt zza(zzk zzk) {
        while (true) {
            int zzj = zzk.zzj();
            if (zzj == 0) {
                return this;
            }
            if (zzj == 10) {
                int zzb = zzw.zzb(zzk, 10);
                zzh[] zzhArr = this.zzfy;
                int length = zzhArr == null ? 0 : zzhArr.length;
                int i = zzb + length;
                zzh[] zzhArr2 = new zzh[i];
                if (length != 0) {
                    System.arraycopy(zzhArr, 0, zzhArr2, 0, length);
                }
                while (length < i - 1) {
                    zzh zzh = new zzh();
                    zzhArr2[length] = zzh;
                    zzk.zza(zzh);
                    zzk.zzj();
                    length++;
                }
                zzh zzh2 = new zzh();
                zzhArr2[length] = zzh2;
                zzk.zza(zzh2);
                this.zzfy = zzhArr2;
            } else if (!super.zza(zzk, zzj)) {
                return this;
            }
        }
    }

    public final void zza(zzl zzl) {
        zzh[] zzhArr = this.zzfy;
        if (zzhArr != null && zzhArr.length > 0) {
            int i = 0;
            while (true) {
                zzh[] zzhArr2 = this.zzfy;
                if (i >= zzhArr2.length) {
                    break;
                }
                zzh zzh = zzhArr2[i];
                if (zzh != null) {
                    zzl.zza(1, (zzt) zzh);
                }
                i++;
            }
        }
        super.zza(zzl);
    }

    public final int zzg() {
        int zzg = super.zzg();
        zzh[] zzhArr = this.zzfy;
        if (zzhArr != null && zzhArr.length > 0) {
            int i = 0;
            while (true) {
                zzh[] zzhArr2 = this.zzfy;
                if (i >= zzhArr2.length) {
                    break;
                }
                zzh zzh = zzhArr2[i];
                if (zzh != null) {
                    zzg += zzl.zzb(1, (zzt) zzh);
                }
                i++;
            }
        }
        return zzg;
    }
}
