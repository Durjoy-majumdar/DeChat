package com.google.android.gms.internal.measurement;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

public final class zzabv {
    private final byte[] buffer;
    private int zzbrd = 64;
    private int zzbre = 67108864;
    private int zzbri;
    private int zzbrk = Integer.MAX_VALUE;
    private final int zzbwp;
    private final int zzbwq;
    private int zzbwr;
    private int zzbws;
    private int zzbwt;
    private int zzbwu;

    private zzabv(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzbwp = i;
        int i3 = i2 + i;
        this.zzbwr = i3;
        this.zzbwq = i3;
        this.zzbws = i;
    }

    public static zzabv zza(byte[] bArr, int i, int i2) {
        return new zzabv(bArr, 0, i2);
    }

    private final void zzan(int i) {
        if (i >= 0) {
            int i2 = this.zzbws;
            int i3 = i2 + i;
            int i4 = this.zzbrk;
            if (i3 > i4) {
                zzan(i4 - i2);
                throw zzacd.zzvh();
            } else if (i <= this.zzbwr - i2) {
                this.zzbws = i2 + i;
            } else {
                throw zzacd.zzvh();
            }
        } else {
            throw zzacd.zzvi();
        }
    }

    public static zzabv zzi(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    private final void zzta() {
        int i = this.zzbwr + this.zzbri;
        this.zzbwr = i;
        int i2 = this.zzbrk;
        if (i > i2) {
            int i3 = i - i2;
            this.zzbri = i3;
            this.zzbwr = i - i3;
            return;
        }
        this.zzbri = 0;
    }

    private final byte zzvd() {
        int i = this.zzbws;
        if (i != this.zzbwr) {
            byte[] bArr = this.buffer;
            this.zzbws = i + 1;
            return bArr[i];
        }
        throw zzacd.zzvh();
    }

    public final int getPosition() {
        return this.zzbws - this.zzbwp;
    }

    public final String readString() {
        int zzuy = zzuy();
        if (zzuy >= 0) {
            int i = this.zzbwr;
            int i2 = this.zzbws;
            if (zzuy <= i - i2) {
                String str = new String(this.buffer, i2, zzuy, zzacc.UTF_8);
                this.zzbws += zzuy;
                return str;
            }
            throw zzacd.zzvh();
        }
        throw zzacd.zzvi();
    }

    public final void zza(zzace zzace) {
        int zzuy = zzuy();
        if (this.zzbwu < this.zzbrd) {
            int zzaf = zzaf(zzuy);
            this.zzbwu++;
            zzace.zzb(this);
            zzaj(0);
            this.zzbwu--;
            zzal(zzaf);
            return;
        }
        throw zzacd.zzvk();
    }

    public final void zza(zzace zzace, int i) {
        int i2 = this.zzbwu;
        if (i2 < this.zzbrd) {
            this.zzbwu = i2 + 1;
            zzace.zzb(this);
            zzaj((i << 3) | 4);
            this.zzbwu--;
            return;
        }
        throw zzacd.zzvk();
    }

    public final int zzaf(int i) {
        if (i >= 0) {
            int i2 = i + this.zzbws;
            int i3 = this.zzbrk;
            if (i2 <= i3) {
                this.zzbrk = i2;
                zzta();
                return i3;
            }
            throw zzacd.zzvh();
        }
        throw zzacd.zzvi();
    }

    public final void zzaj(int i) {
        if (this.zzbwt != i) {
            throw new zzacd("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzak(int i) {
        int zzuw;
        int i2 = i & 7;
        if (i2 == 0) {
            zzuy();
            return true;
        } else if (i2 == 1) {
            zzvb();
            return true;
        } else if (i2 == 2) {
            zzan(zzuy());
            return true;
        } else if (i2 == 3) {
            do {
                zzuw = zzuw();
                if (zzuw == 0 || !zzak(zzuw)) {
                    zzaj(((i >>> 3) << 3) | 4);
                }
                zzuw = zzuw();
                break;
            } while (!zzak(zzuw));
            zzaj(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzva();
                return true;
            }
            throw new zzacd("Protocol message tag had invalid wire type.");
        }
    }

    public final void zzal(int i) {
        this.zzbrk = i;
        zzta();
    }

    public final void zzam(int i) {
        zzd(i, this.zzbwt);
    }

    public final byte[] zzc(int i, int i2) {
        if (i2 == 0) {
            return zzach.zzbxs;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzbwp + i, bArr, 0, i2);
        return bArr;
    }

    public final void zzd(int i, int i2) {
        int i3 = this.zzbws;
        int i4 = this.zzbwp;
        if (i > i3 - i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(this.zzbws - this.zzbwp);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.zzbws = i4 + i;
            this.zzbwt = i2;
        } else {
            StringBuilder sb4 = new StringBuilder(24);
            sb4.append("Bad position ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final int zzuw() {
        if (this.zzbws == this.zzbwr) {
            this.zzbwt = 0;
            return 0;
        }
        int zzuy = zzuy();
        this.zzbwt = zzuy;
        if (zzuy != 0) {
            return zzuy;
        }
        throw new zzacd("Protocol message contained an invalid tag (zero).");
    }

    public final boolean zzux() {
        return zzuy() != 0;
    }

    public final int zzuy() {
        int i;
        byte zzvd = zzvd();
        if (zzvd >= 0) {
            return zzvd;
        }
        byte b = zzvd & Byte.MAX_VALUE;
        byte zzvd2 = zzvd();
        if (zzvd2 >= 0) {
            i = zzvd2 << 7;
        } else {
            b |= (zzvd2 & Byte.MAX_VALUE) << 7;
            byte zzvd3 = zzvd();
            if (zzvd3 >= 0) {
                i = zzvd3 << 14;
            } else {
                b |= (zzvd3 & Byte.MAX_VALUE) << 14;
                byte zzvd4 = zzvd();
                if (zzvd4 >= 0) {
                    i = zzvd4 << 21;
                } else {
                    byte b2 = b | ((zzvd4 & Byte.MAX_VALUE) << 21);
                    byte zzvd5 = zzvd();
                    byte b3 = b2 | (zzvd5 << 28);
                    if (zzvd5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (zzvd() >= 0) {
                            return b3;
                        }
                    }
                    throw zzacd.zzvj();
                }
            }
        }
        return b | i;
    }

    public final long zzuz() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzvd = zzvd();
            j |= ((long) (zzvd & Byte.MAX_VALUE)) << i;
            if ((zzvd & 128) == 0) {
                return j;
            }
        }
        throw zzacd.zzvj();
    }

    public final int zzva() {
        return (zzvd() & ExifInterface.MARKER) | ((zzvd() & ExifInterface.MARKER) << 8) | ((zzvd() & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((zzvd() & ExifInterface.MARKER) << 24);
    }

    public final long zzvb() {
        byte zzvd = zzvd();
        byte zzvd2 = zzvd();
        return ((((long) zzvd2) & 255) << 8) | (((long) zzvd) & 255) | ((((long) zzvd()) & 255) << 16) | ((((long) zzvd()) & 255) << 24) | ((((long) zzvd()) & 255) << 32) | ((((long) zzvd()) & 255) << 40) | ((((long) zzvd()) & 255) << 48) | ((((long) zzvd()) & 255) << 56);
    }

    public final int zzvc() {
        int i = this.zzbrk;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.zzbws;
    }
}
