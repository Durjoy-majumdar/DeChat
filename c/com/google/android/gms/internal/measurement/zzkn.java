package com.google.android.gms.internal.measurement;

public final class zzkn extends zzaby<zzkn> {
    private static volatile zzkn[] zzasz;
    public Integer count = null;
    public String name = null;
    public zzko[] zzata = zzko.zzlm();
    public Long zzatb = null;
    public Long zzatc = null;

    public zzkn() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static zzkn[] zzll() {
        if (zzasz == null) {
            synchronized (zzacc.zzbxg) {
                if (zzasz == null) {
                    zzasz = new zzkn[0];
                }
            }
        }
        return zzasz;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkn)) {
            return false;
        }
        zzkn zzkn = (zzkn) obj;
        if (!zzacc.equals((Object[]) this.zzata, (Object[]) zzkn.zzata)) {
            return false;
        }
        String str = this.name;
        if (str == null) {
            if (zzkn.name != null) {
                return false;
            }
        } else if (!str.equals(zzkn.name)) {
            return false;
        }
        Long l = this.zzatb;
        if (l == null) {
            if (zzkn.zzatb != null) {
                return false;
            }
        } else if (!l.equals(zzkn.zzatb)) {
            return false;
        }
        Long l2 = this.zzatc;
        if (l2 == null) {
            if (zzkn.zzatc != null) {
                return false;
            }
        } else if (!l2.equals(zzkn.zzatc)) {
            return false;
        }
        Integer num = this.count;
        if (num == null) {
            if (zzkn.count != null) {
                return false;
            }
        } else if (!num.equals(zzkn.count)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzkn.zzbww);
        }
        zzaca zzaca2 = zzkn.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = (-1033080013 + zzacc.hashCode((Object[]) this.zzata)) * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.zzatb;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.zzatc;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.count;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            i = this.zzbww.hashCode();
        }
        return hashCode5 + i;
    }

    public final int zza() {
        int zza = super.zza();
        zzko[] zzkoArr = this.zzata;
        if (zzkoArr != null && zzkoArr.length > 0) {
            int i = 0;
            while (true) {
                zzko[] zzkoArr2 = this.zzata;
                if (i >= zzkoArr2.length) {
                    break;
                }
                zzko zzko = zzkoArr2[i];
                if (zzko != null) {
                    zza += zzabw.zzb(1, (zzace) zzko);
                }
                i++;
            }
        }
        String str = this.name;
        if (str != null) {
            zza += zzabw.zzc(2, str);
        }
        Long l = this.zzatb;
        if (l != null) {
            zza += zzabw.zzc(3, l.longValue());
        }
        Long l2 = this.zzatc;
        if (l2 != null) {
            zza += zzabw.zzc(4, l2.longValue());
        }
        Integer num = this.count;
        return num != null ? zza + zzabw.zzf(5, num.intValue()) : zza;
    }

    public final void zza(zzabw zzabw) {
        zzko[] zzkoArr = this.zzata;
        if (zzkoArr != null && zzkoArr.length > 0) {
            int i = 0;
            while (true) {
                zzko[] zzkoArr2 = this.zzata;
                if (i >= zzkoArr2.length) {
                    break;
                }
                zzko zzko = zzkoArr2[i];
                if (zzko != null) {
                    zzabw.zza(1, (zzace) zzko);
                }
                i++;
            }
        }
        String str = this.name;
        if (str != null) {
            zzabw.zzb(2, str);
        }
        Long l = this.zzatb;
        if (l != null) {
            zzabw.zzb(3, l.longValue());
        }
        Long l2 = this.zzatc;
        if (l2 != null) {
            zzabw.zzb(4, l2.longValue());
        }
        Integer num = this.count;
        if (num != null) {
            zzabw.zze(5, num.intValue());
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
                int zzb = zzach.zzb(zzabv, 10);
                zzko[] zzkoArr = this.zzata;
                int length = zzkoArr == null ? 0 : zzkoArr.length;
                int i = zzb + length;
                zzko[] zzkoArr2 = new zzko[i];
                if (length != 0) {
                    System.arraycopy(zzkoArr, 0, zzkoArr2, 0, length);
                }
                while (length < i - 1) {
                    zzko zzko = new zzko();
                    zzkoArr2[length] = zzko;
                    zzabv.zza(zzko);
                    zzabv.zzuw();
                    length++;
                }
                zzko zzko2 = new zzko();
                zzkoArr2[length] = zzko2;
                zzabv.zza(zzko2);
                this.zzata = zzkoArr2;
            } else if (zzuw == 18) {
                this.name = zzabv.readString();
            } else if (zzuw == 24) {
                this.zzatb = Long.valueOf(zzabv.zzuz());
            } else if (zzuw == 32) {
                this.zzatc = Long.valueOf(zzabv.zzuz());
            } else if (zzuw == 40) {
                this.count = Integer.valueOf(zzabv.zzuy());
            } else if (!super.zza(zzabv, zzuw)) {
                return this;
            }
        }
    }
}
