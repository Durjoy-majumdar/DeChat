package com.google.android.gms.internal.measurement;

public final class zzkl extends zzaby<zzkl> {
    private static volatile zzkl[] zzasu;
    public String value = null;
    public String zzny = null;

    public zzkl() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static zzkl[] zzlj() {
        if (zzasu == null) {
            synchronized (zzacc.zzbxg) {
                if (zzasu == null) {
                    zzasu = new zzkl[0];
                }
            }
        }
        return zzasu;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkl)) {
            return false;
        }
        zzkl zzkl = (zzkl) obj;
        String str = this.zzny;
        if (str == null) {
            if (zzkl.zzny != null) {
                return false;
            }
        } else if (!str.equals(zzkl.zzny)) {
            return false;
        }
        String str2 = this.value;
        if (str2 == null) {
            if (zzkl.value != null) {
                return false;
            }
        } else if (!str2.equals(zzkl.value)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzkl.zzbww);
        }
        zzaca zzaca2 = zzkl.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        String str = this.zzny;
        int i = 0;
        int hashCode = (-1033080075 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            i = this.zzbww.hashCode();
        }
        return hashCode2 + i;
    }

    public final int zza() {
        int zza = super.zza();
        String str = this.zzny;
        if (str != null) {
            zza += zzabw.zzc(1, str);
        }
        String str2 = this.value;
        return str2 != null ? zza + zzabw.zzc(2, str2) : zza;
    }

    public final void zza(zzabw zzabw) {
        String str = this.zzny;
        if (str != null) {
            zzabw.zzb(1, str);
        }
        String str2 = this.value;
        if (str2 != null) {
            zzabw.zzb(2, str2);
        }
        super.zza(zzabw);
    }

    public final /* synthetic */ zzace zzb(zzabv zzabv) {
        while (true) {
            int zzuw = zzabv.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 10) {
                this.zzny = zzabv.readString();
            } else if (zzuw == 18) {
                this.value = zzabv.readString();
            } else if (!super.zza(zzabv, zzuw)) {
                return this;
            }
        }
    }
}
