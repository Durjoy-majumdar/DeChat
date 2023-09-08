package com.google.android.gms.internal.wearable;

public final class zzi extends zzn<zzi> {
    private static volatile zzi[] zzgb;
    public int type = 1;
    public zzj zzgc = null;

    public zzi() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzi zza(zzk zzk) {
        int zzk2;
        while (true) {
            int zzj = zzk.zzj();
            if (zzj == 0) {
                return this;
            }
            if (zzj == 8) {
                try {
                    zzk2 = zzk.zzk();
                    if (zzk2 <= 0 || zzk2 > 15) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(zzk2);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.type = zzk2;
                    }
                } catch (IllegalArgumentException unused) {
                    zzk.zzg(zzk.getPosition());
                    zza(zzk, zzj);
                }
            } else if (zzj == 18) {
                if (this.zzgc == null) {
                    this.zzgc = new zzj();
                }
                zzk.zza(this.zzgc);
            } else if (!super.zza(zzk, zzj)) {
                return this;
            }
        }
        StringBuilder sb4 = new StringBuilder(36);
        sb4.append(zzk2);
        sb4.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb4.toString());
    }

    public static zzi[] zzi() {
        if (zzgb == null) {
            synchronized (zzr.zzhk) {
                if (zzgb == null) {
                    zzgb = new zzi[0];
                }
            }
        }
        return zzgb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zzi = (zzi) obj;
        if (this.type != zzi.type) {
            return false;
        }
        zzj zzj = this.zzgc;
        if (zzj == null) {
            if (zzi.zzgc != null) {
                return false;
            }
        } else if (!zzj.equals(zzi.zzgc)) {
            return false;
        }
        zzp zzp = this.zzhc;
        if (zzp != null && !zzp.isEmpty()) {
            return this.zzhc.equals(zzi.zzhc);
        }
        zzp zzp2 = zzi.zzhc;
        return zzp2 == null || zzp2.isEmpty();
    }

    public final int hashCode() {
        int i = 1588755220 + this.type;
        zzj zzj = this.zzgc;
        int i2 = 0;
        int hashCode = ((i * 31) + (zzj == null ? 0 : zzj.hashCode())) * 31;
        zzp zzp = this.zzhc;
        if (zzp != null && !zzp.isEmpty()) {
            i2 = this.zzhc.hashCode();
        }
        return hashCode + i2;
    }

    public final void zza(zzl zzl) {
        zzl.zzd(1, this.type);
        zzj zzj = this.zzgc;
        if (zzj != null) {
            zzl.zza(2, (zzt) zzj);
        }
        super.zza(zzl);
    }

    public final int zzg() {
        int zzg = super.zzg() + zzl.zze(1, this.type);
        zzj zzj = this.zzgc;
        return zzj != null ? zzg + zzl.zzb(2, (zzt) zzj) : zzg;
    }
}
