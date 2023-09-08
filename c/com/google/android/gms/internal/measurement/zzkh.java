package com.google.android.gms.internal.measurement;

public final class zzkh extends zzaby<zzkh> {
    private static volatile zzkh[] zzase;
    public Integer zzarp = null;
    public String zzasf = null;
    public zzkf zzasg = null;

    public zzkh() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static zzkh[] zzlh() {
        if (zzase == null) {
            synchronized (zzacc.zzbxg) {
                if (zzase == null) {
                    zzase = new zzkh[0];
                }
            }
        }
        return zzase;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkh)) {
            return false;
        }
        zzkh zzkh = (zzkh) obj;
        Integer num = this.zzarp;
        if (num == null) {
            if (zzkh.zzarp != null) {
                return false;
            }
        } else if (!num.equals(zzkh.zzarp)) {
            return false;
        }
        String str = this.zzasf;
        if (str == null) {
            if (zzkh.zzasf != null) {
                return false;
            }
        } else if (!str.equals(zzkh.zzasf)) {
            return false;
        }
        zzkf zzkf = this.zzasg;
        if (zzkf == null) {
            if (zzkh.zzasg != null) {
                return false;
            }
        } else if (!zzkf.equals(zzkh.zzasg)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzkh.zzbww);
        }
        zzaca zzaca2 = zzkh.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        Integer num = this.zzarp;
        int i = 0;
        int hashCode = (-1033080199 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.zzasf;
        int hashCode2 = hashCode + (str == null ? 0 : str.hashCode());
        zzkf zzkf = this.zzasg;
        int hashCode3 = ((hashCode2 * 31) + (zzkf == null ? 0 : zzkf.hashCode())) * 31;
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            i = this.zzbww.hashCode();
        }
        return hashCode3 + i;
    }

    public final int zza() {
        int zza = super.zza();
        Integer num = this.zzarp;
        if (num != null) {
            zza += zzabw.zzf(1, num.intValue());
        }
        String str = this.zzasf;
        if (str != null) {
            zza += zzabw.zzc(2, str);
        }
        zzkf zzkf = this.zzasg;
        return zzkf != null ? zza + zzabw.zzb(3, (zzace) zzkf) : zza;
    }

    public final void zza(zzabw zzabw) {
        Integer num = this.zzarp;
        if (num != null) {
            zzabw.zze(1, num.intValue());
        }
        String str = this.zzasf;
        if (str != null) {
            zzabw.zzb(2, str);
        }
        zzkf zzkf = this.zzasg;
        if (zzkf != null) {
            zzabw.zza(3, (zzace) zzkf);
        }
        super.zza(zzabw);
    }

    public final /* synthetic */ zzace zzb(zzabv zzabv) {
        while (true) {
            int zzuw = zzabv.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw == 8) {
                this.zzarp = Integer.valueOf(zzabv.zzuy());
            } else if (zzuw == 18) {
                this.zzasf = zzabv.readString();
            } else if (zzuw == 26) {
                if (this.zzasg == null) {
                    this.zzasg = new zzkf();
                }
                zzabv.zza(this.zzasg);
            } else if (!super.zza(zzabv, zzuw)) {
                return this;
            }
        }
    }
}
