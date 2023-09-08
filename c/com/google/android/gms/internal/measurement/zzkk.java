package com.google.android.gms.internal.measurement;

public final class zzkk extends zzaby<zzkk> {
    public String zzadm = null;
    public Long zzasp = null;
    private Integer zzasq = null;
    public zzkl[] zzasr = zzkl.zzlj();
    public zzkj[] zzass = zzkj.zzli();
    public zzkd[] zzast = zzkd.zzle();

    public zzkk() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkk)) {
            return false;
        }
        zzkk zzkk = (zzkk) obj;
        Long l = this.zzasp;
        if (l == null) {
            if (zzkk.zzasp != null) {
                return false;
            }
        } else if (!l.equals(zzkk.zzasp)) {
            return false;
        }
        String str = this.zzadm;
        if (str == null) {
            if (zzkk.zzadm != null) {
                return false;
            }
        } else if (!str.equals(zzkk.zzadm)) {
            return false;
        }
        Integer num = this.zzasq;
        if (num == null) {
            if (zzkk.zzasq != null) {
                return false;
            }
        } else if (!num.equals(zzkk.zzasq)) {
            return false;
        }
        if (!zzacc.equals((Object[]) this.zzasr, (Object[]) zzkk.zzasr) || !zzacc.equals((Object[]) this.zzass, (Object[]) zzkk.zzass) || !zzacc.equals((Object[]) this.zzast, (Object[]) zzkk.zzast)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzkk.zzbww);
        }
        zzaca zzaca2 = zzkk.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        Long l = this.zzasp;
        int i = 0;
        int hashCode = (-1033080106 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.zzadm;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.zzasq;
        int hashCode3 = (((((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + zzacc.hashCode((Object[]) this.zzasr)) * 31) + zzacc.hashCode((Object[]) this.zzass)) * 31) + zzacc.hashCode((Object[]) this.zzast)) * 31;
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            i = this.zzbww.hashCode();
        }
        return hashCode3 + i;
    }

    public final int zza() {
        int zza = super.zza();
        Long l = this.zzasp;
        if (l != null) {
            zza += zzabw.zzc(1, l.longValue());
        }
        String str = this.zzadm;
        if (str != null) {
            zza += zzabw.zzc(2, str);
        }
        Integer num = this.zzasq;
        if (num != null) {
            zza += zzabw.zzf(3, num.intValue());
        }
        zzkl[] zzklArr = this.zzasr;
        int i = 0;
        if (zzklArr != null && zzklArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzkl[] zzklArr2 = this.zzasr;
                if (i2 >= zzklArr2.length) {
                    break;
                }
                zzkl zzkl = zzklArr2[i2];
                if (zzkl != null) {
                    zza += zzabw.zzb(4, (zzace) zzkl);
                }
                i2++;
            }
        }
        zzkj[] zzkjArr = this.zzass;
        if (zzkjArr != null && zzkjArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzkj[] zzkjArr2 = this.zzass;
                if (i3 >= zzkjArr2.length) {
                    break;
                }
                zzkj zzkj = zzkjArr2[i3];
                if (zzkj != null) {
                    zza += zzabw.zzb(5, (zzace) zzkj);
                }
                i3++;
            }
        }
        zzkd[] zzkdArr = this.zzast;
        if (zzkdArr != null && zzkdArr.length > 0) {
            while (true) {
                zzkd[] zzkdArr2 = this.zzast;
                if (i >= zzkdArr2.length) {
                    break;
                }
                zzkd zzkd = zzkdArr2[i];
                if (zzkd != null) {
                    zza += zzabw.zzb(6, (zzace) zzkd);
                }
                i++;
            }
        }
        return zza;
    }

    public final void zza(zzabw zzabw) {
        Long l = this.zzasp;
        if (l != null) {
            zzabw.zzb(1, l.longValue());
        }
        String str = this.zzadm;
        if (str != null) {
            zzabw.zzb(2, str);
        }
        Integer num = this.zzasq;
        if (num != null) {
            zzabw.zze(3, num.intValue());
        }
        zzkl[] zzklArr = this.zzasr;
        int i = 0;
        if (zzklArr != null && zzklArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzkl[] zzklArr2 = this.zzasr;
                if (i2 >= zzklArr2.length) {
                    break;
                }
                zzkl zzkl = zzklArr2[i2];
                if (zzkl != null) {
                    zzabw.zza(4, (zzace) zzkl);
                }
                i2++;
            }
        }
        zzkj[] zzkjArr = this.zzass;
        if (zzkjArr != null && zzkjArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzkj[] zzkjArr2 = this.zzass;
                if (i3 >= zzkjArr2.length) {
                    break;
                }
                zzkj zzkj = zzkjArr2[i3];
                if (zzkj != null) {
                    zzabw.zza(5, (zzace) zzkj);
                }
                i3++;
            }
        }
        zzkd[] zzkdArr = this.zzast;
        if (zzkdArr != null && zzkdArr.length > 0) {
            while (true) {
                zzkd[] zzkdArr2 = this.zzast;
                if (i >= zzkdArr2.length) {
                    break;
                }
                zzkd zzkd = zzkdArr2[i];
                if (zzkd != null) {
                    zzabw.zza(6, (zzace) zzkd);
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
                this.zzasp = Long.valueOf(zzabv.zzuz());
            } else if (zzuw == 18) {
                this.zzadm = zzabv.readString();
            } else if (zzuw == 24) {
                this.zzasq = Integer.valueOf(zzabv.zzuy());
            } else if (zzuw == 34) {
                int zzb = zzach.zzb(zzabv, 34);
                zzkl[] zzklArr = this.zzasr;
                int length = zzklArr == null ? 0 : zzklArr.length;
                int i = zzb + length;
                zzkl[] zzklArr2 = new zzkl[i];
                if (length != 0) {
                    System.arraycopy(zzklArr, 0, zzklArr2, 0, length);
                }
                while (length < i - 1) {
                    zzkl zzkl = new zzkl();
                    zzklArr2[length] = zzkl;
                    zzabv.zza(zzkl);
                    zzabv.zzuw();
                    length++;
                }
                zzkl zzkl2 = new zzkl();
                zzklArr2[length] = zzkl2;
                zzabv.zza(zzkl2);
                this.zzasr = zzklArr2;
            } else if (zzuw == 42) {
                int zzb2 = zzach.zzb(zzabv, 42);
                zzkj[] zzkjArr = this.zzass;
                int length2 = zzkjArr == null ? 0 : zzkjArr.length;
                int i2 = zzb2 + length2;
                zzkj[] zzkjArr2 = new zzkj[i2];
                if (length2 != 0) {
                    System.arraycopy(zzkjArr, 0, zzkjArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    zzkj zzkj = new zzkj();
                    zzkjArr2[length2] = zzkj;
                    zzabv.zza(zzkj);
                    zzabv.zzuw();
                    length2++;
                }
                zzkj zzkj2 = new zzkj();
                zzkjArr2[length2] = zzkj2;
                zzabv.zza(zzkj2);
                this.zzass = zzkjArr2;
            } else if (zzuw == 50) {
                int zzb3 = zzach.zzb(zzabv, 50);
                zzkd[] zzkdArr = this.zzast;
                int length3 = zzkdArr == null ? 0 : zzkdArr.length;
                int i3 = zzb3 + length3;
                zzkd[] zzkdArr2 = new zzkd[i3];
                if (length3 != 0) {
                    System.arraycopy(zzkdArr, 0, zzkdArr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    zzkd zzkd = new zzkd();
                    zzkdArr2[length3] = zzkd;
                    zzabv.zza(zzkd);
                    zzabv.zzuw();
                    length3++;
                }
                zzkd zzkd2 = new zzkd();
                zzkdArr2[length3] = zzkd2;
                zzabv.zza(zzkd2);
                this.zzast = zzkdArr2;
            } else if (!super.zza(zzabv, zzuw)) {
                return this;
            }
        }
    }
}
