package com.google.android.gms.internal.measurement;

public final class zzkp extends zzaby<zzkp> {
    public zzkq[] zzatf = zzkq.zzln();

    public zzkp() {
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkp)) {
            return false;
        }
        zzkp zzkp = (zzkp) obj;
        if (!zzacc.equals((Object[]) this.zzatf, (Object[]) zzkp.zzatf)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzkp.zzbww);
        }
        zzaca zzaca2 = zzkp.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = (-1033079951 + zzacc.hashCode((Object[]) this.zzatf)) * 31;
        zzaca zzaca = this.zzbww;
        return hashCode + ((zzaca == null || zzaca.isEmpty()) ? 0 : this.zzbww.hashCode());
    }

    public final int zza() {
        int zza = super.zza();
        zzkq[] zzkqArr = this.zzatf;
        if (zzkqArr != null && zzkqArr.length > 0) {
            int i = 0;
            while (true) {
                zzkq[] zzkqArr2 = this.zzatf;
                if (i >= zzkqArr2.length) {
                    break;
                }
                zzkq zzkq = zzkqArr2[i];
                if (zzkq != null) {
                    zza += zzabw.zzb(1, (zzace) zzkq);
                }
                i++;
            }
        }
        return zza;
    }

    public final void zza(zzabw zzabw) {
        zzkq[] zzkqArr = this.zzatf;
        if (zzkqArr != null && zzkqArr.length > 0) {
            int i = 0;
            while (true) {
                zzkq[] zzkqArr2 = this.zzatf;
                if (i >= zzkqArr2.length) {
                    break;
                }
                zzkq zzkq = zzkqArr2[i];
                if (zzkq != null) {
                    zzabw.zza(1, (zzace) zzkq);
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
            if (zzuw == 10) {
                int zzb = zzach.zzb(zzabv, 10);
                zzkq[] zzkqArr = this.zzatf;
                int length = zzkqArr == null ? 0 : zzkqArr.length;
                int i = zzb + length;
                zzkq[] zzkqArr2 = new zzkq[i];
                if (length != 0) {
                    System.arraycopy(zzkqArr, 0, zzkqArr2, 0, length);
                }
                while (length < i - 1) {
                    zzkq zzkq = new zzkq();
                    zzkqArr2[length] = zzkq;
                    zzabv.zza(zzkq);
                    zzabv.zzuw();
                    length++;
                }
                zzkq zzkq2 = new zzkq();
                zzkqArr2[length] = zzkq2;
                zzabv.zza(zzkq2);
                this.zzatf = zzkqArr2;
            } else if (!super.zza(zzabv, zzuw)) {
                return this;
            }
        }
    }
}
