package com.google.android.gms.internal.wearable;

public final class zzh extends zzn<zzh> {
    private static volatile zzh[] zzfz;
    public String name = "";
    public zzi zzga = null;

    public zzh() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    public static zzh[] zzh() {
        if (zzfz == null) {
            synchronized (zzr.zzhk) {
                if (zzfz == null) {
                    zzfz = new zzh[0];
                }
            }
        }
        return zzfz;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzh = (zzh) obj;
        String str = this.name;
        if (str == null) {
            if (zzh.name != null) {
                return false;
            }
        } else if (!str.equals(zzh.name)) {
            return false;
        }
        zzi zzi = this.zzga;
        if (zzi == null) {
            if (zzh.zzga != null) {
                return false;
            }
        } else if (!zzi.equals(zzh.zzga)) {
            return false;
        }
        zzp zzp = this.zzhc;
        if (zzp != null && !zzp.isEmpty()) {
            return this.zzhc.equals(zzh.zzhc);
        }
        zzp zzp2 = zzh.zzhc;
        return zzp2 == null || zzp2.isEmpty();
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = 1588755189 + (str == null ? 0 : str.hashCode());
        zzi zzi = this.zzga;
        int hashCode2 = ((hashCode * 31) + (zzi == null ? 0 : zzi.hashCode())) * 31;
        zzp zzp = this.zzhc;
        if (zzp != null && !zzp.isEmpty()) {
            i = this.zzhc.hashCode();
        }
        return hashCode2 + i;
    }

    public final /* synthetic */ zzt zza(zzk zzk) {
        while (true) {
            int zzj = zzk.zzj();
            if (zzj == 0) {
                return this;
            }
            if (zzj == 10) {
                this.name = zzk.readString();
            } else if (zzj == 18) {
                if (this.zzga == null) {
                    this.zzga = new zzi();
                }
                zzk.zza(this.zzga);
            } else if (!super.zza(zzk, zzj)) {
                return this;
            }
        }
    }

    public final void zza(zzl zzl) {
        zzl.zza(1, this.name);
        zzi zzi = this.zzga;
        if (zzi != null) {
            zzl.zza(2, (zzt) zzi);
        }
        super.zza(zzl);
    }

    public final int zzg() {
        int zzg = super.zzg() + zzl.zzb(1, this.name);
        zzi zzi = this.zzga;
        return zzi != null ? zzg + zzl.zzb(2, (zzt) zzi) : zzg;
    }
}
