package com.google.android.gms.internal.wearable;

import com.tencent.tinker.loader.shareutil.ShareElfFile;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzl {
    private final ByteBuffer zzhb;

    private zzl(ByteBuffer byteBuffer) {
        this.zzhb = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzl(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb4 = new StringBuilder(54);
        sb4.append("UTF-8 length does not fit in int: ");
        sb4.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb4.toString());
    }

    private final void zza(long j) {
        while ((-128 & j) != 0) {
            zzj((((int) j) & 127) | 128);
            j >>>= 7;
        }
        zzj((int) j);
    }

    private static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i4 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i5 = remaining + arrayOffset;
                    while (i4 < length) {
                        int i6 = i4 + arrayOffset;
                        if (i6 >= i5 || (charAt = charSequence.charAt(i4)) >= 128) {
                            break;
                        }
                        array[i6] = (byte) charAt;
                        i4++;
                    }
                    if (i4 == length) {
                        i2 = arrayOffset + length;
                    } else {
                        i2 = arrayOffset + i4;
                        while (i4 < length) {
                            char charAt2 = charSequence.charAt(i4);
                            if (charAt2 < 128 && i2 < i5) {
                                i3 = i2 + 1;
                                array[i2] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i2 <= i5 - 2) {
                                int i7 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 6) | 960);
                                i2 = i7 + 1;
                                array[i7] = (byte) ((charAt2 & '?') | 128);
                                i4++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i2 <= i5 - 3) {
                                int i8 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 12) | 480);
                                int i9 = i8 + 1;
                                array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 = i9 + 1;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i2 <= i5 - 4) {
                                int i15 = i4 + 1;
                                if (i15 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i15);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i16 = i2 + 1;
                                        array[i2] = (byte) ((codePoint >>> 18) | 240);
                                        int i17 = i16 + 1;
                                        array[i16] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i18 = i17 + 1;
                                        array[i17] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i18 + 1;
                                        array[i18] = (byte) ((codePoint & 63) | 128);
                                        i4 = i15;
                                        i4++;
                                    } else {
                                        i4 = i15;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i4 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb4 = new StringBuilder(37);
                                sb4.append("Failed writing ");
                                sb4.append(charAt2);
                                sb4.append(" at index ");
                                sb4.append(i2);
                                throw new ArrayIndexOutOfBoundsException(sb4.toString());
                            }
                            i2 = i3;
                            i4++;
                        }
                    }
                    byteBuffer.position(i2 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                            i = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i19 = i4 + 1;
                            if (i19 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i19);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i4 = i19;
                                    i4++;
                                } else {
                                    i4 = i19;
                                }
                            }
                            StringBuilder sb5 = new StringBuilder(39);
                            sb5.append("Unpaired surrogate at index ");
                            sb5.append(i4 - 1);
                            throw new IllegalArgumentException(sb5.toString());
                        }
                        byteBuffer.put((byte) i);
                        charAt4 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put((byte) charAt4);
                    i4++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static int zzb(int i, long j) {
        return zzk(i) + ((-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10);
    }

    public static int zzb(int i, zzt zzt) {
        int zzk = zzk(i);
        int zzx = zzt.zzx();
        return zzk + zzm(zzx) + zzx;
    }

    public static int zzb(int i, String str) {
        return zzk(i) + zzg(str);
    }

    public static zzl zzb(byte[] bArr) {
        return zzb(bArr, 0, bArr.length);
    }

    public static zzl zzb(byte[] bArr, int i, int i2) {
        return new zzl(bArr, 0, i2);
    }

    public static int zze(int i, int i2) {
        return zzk(i) + zzi(i2);
    }

    public static int zzg(String str) {
        int zza = zza((CharSequence) str);
        return zzm(zza) + zza;
    }

    public static int zzi(int i) {
        if (i >= 0) {
            return zzm(i);
        }
        return 10;
    }

    private final void zzj(int i) {
        byte b = (byte) i;
        if (this.zzhb.hasRemaining()) {
            this.zzhb.put(b);
            return;
        }
        throw new zzm(this.zzhb.position(), this.zzhb.limit());
    }

    public static int zzk(int i) {
        return zzm(i << 3);
    }

    public static int zzm(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & ShareElfFile.SectionHeader.SHF_MASKPROC) == 0 ? 4 : 5;
    }

    public static int zzn(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public final void zza(byte b) {
        if (this.zzhb.hasRemaining()) {
            this.zzhb.put(b);
            return;
        }
        throw new zzm(this.zzhb.position(), this.zzhb.limit());
    }

    public final void zza(int i, float f) {
        zzf(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.zzhb.remaining() >= 4) {
            this.zzhb.putInt(floatToIntBits);
            return;
        }
        throw new zzm(this.zzhb.position(), this.zzhb.limit());
    }

    public final void zza(int i, long j) {
        zzf(i, 0);
        zza(j);
    }

    public final void zza(int i, zzt zzt) {
        zzf(i, 2);
        if (zzt.zzhl < 0) {
            zzt.zzx();
        }
        zzl(zzt.zzhl);
        zzt.zza(this);
    }

    public final void zza(int i, String str) {
        zzf(i, 2);
        try {
            int zzm = zzm(str.length());
            if (zzm == zzm(str.length() * 3)) {
                int position = this.zzhb.position();
                if (this.zzhb.remaining() >= zzm) {
                    this.zzhb.position(position + zzm);
                    zza((CharSequence) str, this.zzhb);
                    int position2 = this.zzhb.position();
                    this.zzhb.position(position);
                    zzl((position2 - position) - zzm);
                    this.zzhb.position(position2);
                    return;
                }
                throw new zzm(position + zzm, this.zzhb.limit());
            }
            zzl(zza((CharSequence) str));
            zza((CharSequence) str, this.zzhb);
        } catch (BufferOverflowException e) {
            zzm zzm2 = new zzm(this.zzhb.position(), this.zzhb.limit());
            zzm2.initCause(e);
            throw zzm2;
        }
    }

    public final void zzb(long j) {
        if (this.zzhb.remaining() >= 8) {
            this.zzhb.putLong(j);
            return;
        }
        throw new zzm(this.zzhb.position(), this.zzhb.limit());
    }

    public final void zzc(byte[] bArr) {
        int length = bArr.length;
        if (this.zzhb.remaining() >= length) {
            this.zzhb.put(bArr, 0, length);
            return;
        }
        throw new zzm(this.zzhb.position(), this.zzhb.limit());
    }

    public final void zzd(int i, int i2) {
        zzf(i, 0);
        if (i2 >= 0) {
            zzl(i2);
        } else {
            zza((long) i2);
        }
    }

    public final void zzf(int i, int i2) {
        zzl((i << 3) | i2);
    }

    public final void zzl(int i) {
        while ((i & -128) != 0) {
            zzj((i & 127) | 128);
            i >>>= 7;
        }
        zzj(i);
    }

    public final void zzr() {
        if (this.zzhb.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.zzhb.remaining())}));
        }
    }
}
