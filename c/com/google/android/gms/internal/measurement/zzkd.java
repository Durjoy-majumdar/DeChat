package com.google.android.gms.internal.measurement;

public final class zzkd extends zzaby<zzkd> {
    private static volatile zzkd[] zzark;
    public Integer zzarl = null;
    public zzkh[] zzarm = zzkh.zzlh();
    public zzke[] zzarn = zzke.zzlf();

    public zzkd() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static zzkd[] zzle() {
        if (zzark == null) {
            synchronized (zzacc.zzbxg) {
                if (zzark == null) {
                    zzark = new zzkd[0];
                }
            }
        }
        return zzark;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkd)) {
            return false;
        }
        zzkd zzkd = (zzkd) obj;
        Integer num = this.zzarl;
        if (num == null) {
            if (zzkd.zzarl != null) {
                return false;
            }
        } else if (!num.equals(zzkd.zzarl)) {
            return false;
        }
        if (!zzacc.equals((Object[]) this.zzarm, (Object[]) zzkd.zzarm) || !zzacc.equals((Object[]) this.zzarn, (Object[]) zzkd.zzarn)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzkd.zzbww);
        }
        zzaca zzaca2 = zzkd.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        Integer num = this.zzarl;
        int i = 0;
        int hashCode = (((((-1033080323 + (num == null ? 0 : num.hashCode())) * 31) + zzacc.hashCode((Object[]) this.zzarm)) * 31) + zzacc.hashCode((Object[]) this.zzarn)) * 31;
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            i = this.zzbww.hashCode();
        }
        return hashCode + i;
    }

    public final int zza() {
        int zza = super.zza();
        Integer num = this.zzarl;
        if (num != null) {
            zza += zzabw.zzf(1, num.intValue());
        }
        zzkh[] zzkhArr = this.zzarm;
        int i = 0;
        if (zzkhArr != null && zzkhArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzkh[] zzkhArr2 = this.zzarm;
                if (i2 >= zzkhArr2.length) {
                    break;
                }
                zzkh zzkh = zzkhArr2[i2];
                if (zzkh != null) {
                    zza += zzabw.zzb(2, (zzace) zzkh);
                }
                i2++;
            }
        }
        zzke[] zzkeArr = this.zzarn;
        if (zzkeArr != null && zzkeArr.length > 0) {
            while (true) {
                zzke[] zzkeArr2 = this.zzarn;
                if (i >= zzkeArr2.length) {
                    break;
                }
                zzke zzke = zzkeArr2[i];
                if (zzke != null) {
                    zza += zzabw.zzb(3, (zzace) zzke);
                }
                i++;
            }
        }
        return zza;
    }

    public final void zza(zzabw zzabw) {
        Integer num = this.zzarl;
        if (num != null) {
            zzabw.zze(1, num.intValue());
        }
        zzkh[] zzkhArr = this.zzarm;
        int i = 0;
        if (zzkhArr != null && zzkhArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzkh[] zzkhArr2 = this.zzarm;
                if (i2 >= zzkhArr2.length) {
                    break;
                }
                zzkh zzkh = zzkhArr2[i2];
                if (zzkh != null) {
                    zzabw.zza(2, (zzace) zzkh);
                }
                i2++;
            }
        }
        zzke[] zzkeArr = this.zzarn;
        if (zzkeArr != null && zzkeArr.length > 0) {
            while (true) {
                zzke[] zzkeArr2 = this.zzarn;
                if (i >= zzkeArr2.length) {
                    break;
                }
                zzke zzke = zzkeArr2[i];
                if (zzke != null) {
                    zzabw.zza(3, (zzace) zzke);
                }
                i++;
            }
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
                this.zzarl = Integer.valueOf(zzabv.zzuy());
            } else if (zzuw == 18) {
                int zzb = zzach.zzb(zzabv, 18);
                zzkh[] zzkhArr = this.zzarm;
                int length = zzkhArr == null ? 0 : zzkhArr.length;
                int i = zzb + length;
                zzkh[] zzkhArr2 = new zzkh[i];
                if (length != 0) {
                    System.arraycopy(zzkhArr, 0, zzkhArr2, 0, length);
                }
                while (length < i - 1) {
                    zzkh zzkh = new zzkh();
                    zzkhArr2[length] = zzkh;
                    zzabv.zza(zzkh);
                    zzabv.zzuw();
                    length++;
                }
                zzkh zzkh2 = new zzkh();
                zzkhArr2[length] = zzkh2;
                zzabv.zza(zzkh2);
                this.zzarm = zzkhArr2;
            } else if (zzuw == 26) {
                int zzb2 = zzach.zzb(zzabv, 26);
                zzke[] zzkeArr = this.zzarn;
                int length2 = zzkeArr == null ? 0 : zzkeArr.length;
                int i2 = zzb2 + length2;
                zzke[] zzkeArr2 = new zzke[i2];
                if (length2 != 0) {
                    System.arraycopy(zzkeArr, 0, zzkeArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    zzke zzke = new zzke();
                    zzkeArr2[length2] = zzke;
                    zzabv.zza(zzke);
                    zzabv.zzuw();
                    length2++;
                }
                zzke zzke2 = new zzke();
                zzkeArr2[length2] = zzke2;
                zzabv.zza(zzke2);
                this.zzarn = zzkeArr2;
            } else if (!super.zza(zzabv, zzuw)) {
                return this;
            }
        }
    }
}
