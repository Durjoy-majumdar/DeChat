package com.google.android.gms.internal.measurement;

public final class zzke extends zzaby<zzke> {
    private static volatile zzke[] zzaro;
    public Integer zzarp = null;
    public String zzarq = null;
    public zzkf[] zzarr = zzkf.zzlg();
    private Boolean zzars = null;
    public zzkg zzart = null;

    public zzke() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public static zzke[] zzlf() {
        if (zzaro == null) {
            synchronized (zzacc.zzbxg) {
                if (zzaro == null) {
                    zzaro = new zzke[0];
                }
            }
        }
        return zzaro;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzke)) {
            return false;
        }
        zzke zzke = (zzke) obj;
        Integer num = this.zzarp;
        if (num == null) {
            if (zzke.zzarp != null) {
                return false;
            }
        } else if (!num.equals(zzke.zzarp)) {
            return false;
        }
        String str = this.zzarq;
        if (str == null) {
            if (zzke.zzarq != null) {
                return false;
            }
        } else if (!str.equals(zzke.zzarq)) {
            return false;
        }
        if (!zzacc.equals((Object[]) this.zzarr, (Object[]) zzke.zzarr)) {
            return false;
        }
        Boolean bool = this.zzars;
        if (bool == null) {
            if (zzke.zzars != null) {
                return false;
            }
        } else if (!bool.equals(zzke.zzars)) {
            return false;
        }
        zzkg zzkg = this.zzart;
        if (zzkg == null) {
            if (zzke.zzart != null) {
                return false;
            }
        } else if (!zzkg.equals(zzke.zzart)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzke.zzbww);
        }
        zzaca zzaca2 = zzke.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        Integer num = this.zzarp;
        int i = 0;
        int hashCode = (-1033080292 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.zzarq;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + zzacc.hashCode((Object[]) this.zzarr)) * 31;
        Boolean bool = this.zzars;
        int hashCode3 = hashCode2 + (bool == null ? 0 : bool.hashCode());
        zzkg zzkg = this.zzart;
        int hashCode4 = ((hashCode3 * 31) + (zzkg == null ? 0 : zzkg.hashCode())) * 31;
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            i = this.zzbww.hashCode();
        }
        return hashCode4 + i;
    }

    public final int zza() {
        int zza = super.zza();
        Integer num = this.zzarp;
        if (num != null) {
            zza += zzabw.zzf(1, num.intValue());
        }
        String str = this.zzarq;
        if (str != null) {
            zza += zzabw.zzc(2, str);
        }
        zzkf[] zzkfArr = this.zzarr;
        if (zzkfArr != null && zzkfArr.length > 0) {
            int i = 0;
            while (true) {
                zzkf[] zzkfArr2 = this.zzarr;
                if (i >= zzkfArr2.length) {
                    break;
                }
                zzkf zzkf = zzkfArr2[i];
                if (zzkf != null) {
                    zza += zzabw.zzb(3, (zzace) zzkf);
                }
                i++;
            }
        }
        Boolean bool = this.zzars;
        if (bool != null) {
            bool.booleanValue();
            zza += zzabw.zzaq(4) + 1;
        }
        zzkg zzkg = this.zzart;
        return zzkg != null ? zza + zzabw.zzb(5, (zzace) zzkg) : zza;
    }

    public final void zza(zzabw zzabw) {
        Integer num = this.zzarp;
        if (num != null) {
            zzabw.zze(1, num.intValue());
        }
        String str = this.zzarq;
        if (str != null) {
            zzabw.zzb(2, str);
        }
        zzkf[] zzkfArr = this.zzarr;
        if (zzkfArr != null && zzkfArr.length > 0) {
            int i = 0;
            while (true) {
                zzkf[] zzkfArr2 = this.zzarr;
                if (i >= zzkfArr2.length) {
                    break;
                }
                zzkf zzkf = zzkfArr2[i];
                if (zzkf != null) {
                    zzabw.zza(3, (zzace) zzkf);
                }
                i++;
            }
        }
        Boolean bool = this.zzars;
        if (bool != null) {
            zzabw.zza(4, bool.booleanValue());
        }
        zzkg zzkg = this.zzart;
        if (zzkg != null) {
            zzabw.zza(5, (zzace) zzkg);
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
                this.zzarq = zzabv.readString();
            } else if (zzuw == 26) {
                int zzb = zzach.zzb(zzabv, 26);
                zzkf[] zzkfArr = this.zzarr;
                int length = zzkfArr == null ? 0 : zzkfArr.length;
                int i = zzb + length;
                zzkf[] zzkfArr2 = new zzkf[i];
                if (length != 0) {
                    System.arraycopy(zzkfArr, 0, zzkfArr2, 0, length);
                }
                while (length < i - 1) {
                    zzkf zzkf = new zzkf();
                    zzkfArr2[length] = zzkf;
                    zzabv.zza(zzkf);
                    zzabv.zzuw();
                    length++;
                }
                zzkf zzkf2 = new zzkf();
                zzkfArr2[length] = zzkf2;
                zzabv.zza(zzkf2);
                this.zzarr = zzkfArr2;
            } else if (zzuw == 32) {
                this.zzars = Boolean.valueOf(zzabv.zzux());
            } else if (zzuw == 42) {
                if (this.zzart == null) {
                    this.zzart = new zzkg();
                }
                zzabv.zza(this.zzart);
            } else if (!super.zza(zzabv, zzuw)) {
                return this;
            }
        }
    }
}
