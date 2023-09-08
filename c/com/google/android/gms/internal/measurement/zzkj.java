package com.google.android.gms.internal.measurement;

public final class zzkj extends zzaby<zzkj> {
    private static volatile zzkj[] zzasl;
    public String name = null;
    public Boolean zzasm = null;
    public Boolean zzasn = null;
    public Integer zzaso = null;

    public zzkj() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static zzkj[] zzli() {
        if (zzasl == null) {
            synchronized (zzacc.zzbxg) {
                if (zzasl == null) {
                    zzasl = new zzkj[0];
                }
            }
        }
        return zzasl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkj)) {
            return false;
        }
        zzkj zzkj = (zzkj) obj;
        String str = this.name;
        if (str == null) {
            if (zzkj.name != null) {
                return false;
            }
        } else if (!str.equals(zzkj.name)) {
            return false;
        }
        Boolean bool = this.zzasm;
        if (bool == null) {
            if (zzkj.zzasm != null) {
                return false;
            }
        } else if (!bool.equals(zzkj.zzasm)) {
            return false;
        }
        Boolean bool2 = this.zzasn;
        if (bool2 == null) {
            if (zzkj.zzasn != null) {
                return false;
            }
        } else if (!bool2.equals(zzkj.zzasn)) {
            return false;
        }
        Integer num = this.zzaso;
        if (num == null) {
            if (zzkj.zzaso != null) {
                return false;
            }
        } else if (!num.equals(zzkj.zzaso)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzkj.zzbww);
        }
        zzaca zzaca2 = zzkj.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (-1033080137 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.zzasm;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.zzasn;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.zzaso;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            i = this.zzbww.hashCode();
        }
        return hashCode4 + i;
    }

    public final int zza() {
        int zza = super.zza();
        String str = this.name;
        if (str != null) {
            zza += zzabw.zzc(1, str);
        }
        Boolean bool = this.zzasm;
        if (bool != null) {
            bool.booleanValue();
            zza += zzabw.zzaq(2) + 1;
        }
        Boolean bool2 = this.zzasn;
        if (bool2 != null) {
            bool2.booleanValue();
            zza += zzabw.zzaq(3) + 1;
        }
        Integer num = this.zzaso;
        return num != null ? zza + zzabw.zzf(4, num.intValue()) : zza;
    }

    public final void zza(zzabw zzabw) {
        String str = this.name;
        if (str != null) {
            zzabw.zzb(1, str);
        }
        Boolean bool = this.zzasm;
        if (bool != null) {
            zzabw.zza(2, bool.booleanValue());
        }
        Boolean bool2 = this.zzasn;
        if (bool2 != null) {
            zzabw.zza(3, bool2.booleanValue());
        }
        Integer num = this.zzaso;
        if (num != null) {
            zzabw.zze(4, num.intValue());
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
                this.name = zzabv.readString();
            } else if (zzuw == 16) {
                this.zzasm = Boolean.valueOf(zzabv.zzux());
            } else if (zzuw == 24) {
                this.zzasn = Boolean.valueOf(zzabv.zzux());
            } else if (zzuw == 32) {
                this.zzaso = Integer.valueOf(zzabv.zzuy());
            } else if (!super.zza(zzabv, zzuw)) {
                return this;
            }
        }
    }
}
