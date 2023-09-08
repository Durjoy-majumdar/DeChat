package com.google.android.gms.internal.measurement;

public final class zzkr extends zzaby<zzkr> {
    public long[] zzauk;
    public long[] zzaul;

    public zzkr() {
        long[] jArr = zzach.zzbxm;
        this.zzauk = jArr;
        this.zzaul = jArr;
        this.zzbww = null;
        this.zzbxh = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkr)) {
            return false;
        }
        zzkr zzkr = (zzkr) obj;
        if (!zzacc.equals(this.zzauk, zzkr.zzauk) || !zzacc.equals(this.zzaul, zzkr.zzaul)) {
            return false;
        }
        zzaca zzaca = this.zzbww;
        if (zzaca != null && !zzaca.isEmpty()) {
            return this.zzbww.equals(zzkr.zzbww);
        }
        zzaca zzaca2 = zzkr.zzbww;
        return zzaca2 == null || zzaca2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = (((-1033079889 + zzacc.hashCode(this.zzauk)) * 31) + zzacc.hashCode(this.zzaul)) * 31;
        zzaca zzaca = this.zzbww;
        return hashCode + ((zzaca == null || zzaca.isEmpty()) ? 0 : this.zzbww.hashCode());
    }

    public final int zza() {
        long[] jArr;
        int zza = super.zza();
        long[] jArr2 = this.zzauk;
        int i = 0;
        if (jArr2 != null && jArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                jArr = this.zzauk;
                if (i2 >= jArr.length) {
                    break;
                }
                i3 += zzabw.zzao(jArr[i2]);
                i2++;
            }
            zza = zza + i3 + (jArr.length * 1);
        }
        long[] jArr3 = this.zzaul;
        if (jArr3 == null || jArr3.length <= 0) {
            return zza;
        }
        int i4 = 0;
        while (true) {
            long[] jArr4 = this.zzaul;
            if (i >= jArr4.length) {
                return zza + i4 + (jArr4.length * 1);
            }
            i4 += zzabw.zzao(jArr4[i]);
            i++;
        }
    }

    public final void zza(zzabw zzabw) {
        long[] jArr = this.zzauk;
        int i = 0;
        if (jArr != null && jArr.length > 0) {
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.zzauk;
                if (i2 >= jArr2.length) {
                    break;
                }
                zzabw.zza(1, jArr2[i2]);
                i2++;
            }
        }
        long[] jArr3 = this.zzaul;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.zzaul;
                if (i >= jArr4.length) {
                    break;
                }
                zzabw.zza(2, jArr4[i]);
                i++;
            }
        }
        super.zza(zzabw);
    }

    public final /* synthetic */ zzace zzb(zzabv zzabv) {
        int i;
        while (true) {
            int zzuw = zzabv.zzuw();
            if (zzuw == 0) {
                return this;
            }
            if (zzuw != 8) {
                if (zzuw == 10) {
                    i = zzabv.zzaf(zzabv.zzuy());
                    int position = zzabv.getPosition();
                    int i2 = 0;
                    while (zzabv.zzvc() > 0) {
                        zzabv.zzuz();
                        i2++;
                    }
                    zzabv.zzam(position);
                    long[] jArr = this.zzauk;
                    int length = jArr == null ? 0 : jArr.length;
                    int i3 = i2 + length;
                    long[] jArr2 = new long[i3];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i3) {
                        jArr2[length] = zzabv.zzuz();
                        length++;
                    }
                    this.zzauk = jArr2;
                } else if (zzuw == 16) {
                    int zzb = zzach.zzb(zzabv, 16);
                    long[] jArr3 = this.zzaul;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i4 = zzb + length2;
                    long[] jArr4 = new long[i4];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i4 - 1) {
                        jArr4[length2] = zzabv.zzuz();
                        zzabv.zzuw();
                        length2++;
                    }
                    jArr4[length2] = zzabv.zzuz();
                    this.zzaul = jArr4;
                } else if (zzuw == 18) {
                    i = zzabv.zzaf(zzabv.zzuy());
                    int position2 = zzabv.getPosition();
                    int i5 = 0;
                    while (zzabv.zzvc() > 0) {
                        zzabv.zzuz();
                        i5++;
                    }
                    zzabv.zzam(position2);
                    long[] jArr5 = this.zzaul;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    int i6 = i5 + length3;
                    long[] jArr6 = new long[i6];
                    if (length3 != 0) {
                        System.arraycopy(jArr5, 0, jArr6, 0, length3);
                    }
                    while (length3 < i6) {
                        jArr6[length3] = zzabv.zzuz();
                        length3++;
                    }
                    this.zzaul = jArr6;
                } else if (!super.zza(zzabv, zzuw)) {
                    return this;
                }
                zzabv.zzal(i);
            } else {
                int zzb2 = zzach.zzb(zzabv, 8);
                long[] jArr7 = this.zzauk;
                int length4 = jArr7 == null ? 0 : jArr7.length;
                int i7 = zzb2 + length4;
                long[] jArr8 = new long[i7];
                if (length4 != 0) {
                    System.arraycopy(jArr7, 0, jArr8, 0, length4);
                }
                while (length4 < i7 - 1) {
                    jArr8[length4] = zzabv.zzuz();
                    zzabv.zzuw();
                    length4++;
                }
                jArr8[length4] = zzabv.zzuz();
                this.zzauk = jArr8;
            }
        }
    }
}
