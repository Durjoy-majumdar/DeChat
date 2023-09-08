package com.tencent.p014mm.plugin.appbrand.utils;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.h2 */
public class C84744h2 {

    /* renamed from: a */
    public byte[] f247144a;

    /* renamed from: b */
    public byte[] f247145b;

    /* renamed from: c */
    public byte[] f247146c;

    /* renamed from: d */
    public int f247147d;

    /* renamed from: e */
    public int f247148e;

    /* renamed from: f */
    public int f247149f;

    /* renamed from: g */
    public int f247150g;

    /* renamed from: h */
    public byte[] f247151h;

    /* renamed from: i */
    public boolean f247152i = true;

    /* renamed from: j */
    public int f247153j;

    /* renamed from: k */
    public Random f247154k = new Random();

    /* renamed from: f */
    public static long m104401f(byte[] bArr, int i, int i2) {
        int i3 = i2 > 4 ? i + 4 : i2 + i;
        long j = 0;
        while (i < i3) {
            j = (j << 8) | ((long) (bArr[i] & ExifInterface.MARKER));
            i++;
        }
        return Util.MAX_32BIT_VALUE & j;
    }

    /* renamed from: a */
    public final byte[] mo117463a(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        int i3 = 16;
        try {
            long f = m104401f(bArr2, i2, 4);
            long f2 = m104401f(bArr2, i2 + 4, 4);
            long f3 = m104401f(this.f247151h, 0, 4);
            long f4 = m104401f(this.f247151h, 4, 4);
            long f5 = m104401f(this.f247151h, 8, 4);
            long f6 = m104401f(this.f247151h, 12, 4);
            long j = 3816266640L;
            while (true) {
                int i4 = i3 - 1;
                if (i3 > 0) {
                    f2 = (f2 - ((((f << 4) + f5) ^ (f + j)) ^ ((f >>> 5) + f6))) & Util.MAX_32BIT_VALUE;
                    f = (f - ((((f2 << 4) + f3) ^ (f2 + j)) ^ ((f2 >>> 5) + f4))) & Util.MAX_32BIT_VALUE;
                    j = (j - 2654435769L) & Util.MAX_32BIT_VALUE;
                    i3 = i4;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) f);
                    dataOutputStream.writeInt((int) f2);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public byte[] mo117464b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        this.f247148e = 0;
        this.f247147d = 0;
        this.f247151h = bArr2;
        byte[] bArr3 = new byte[8];
        if (length % 8 != 0 || length < 16) {
            return null;
        }
        byte[] a = mo117463a(bArr, 0);
        this.f247145b = a;
        if (a == null) {
            return null;
        }
        byte b = a[0] & 7;
        this.f247149f = b;
        int i = (length - b) - 10;
        if (i < 0) {
            return null;
        }
        for (int i2 = 0; i2 < 8; i2++) {
            bArr3[i2] = 0;
        }
        this.f247146c = new byte[i];
        this.f247148e = 0;
        this.f247147d = 8;
        this.f247153j = 8;
        this.f247149f++;
        this.f247150g = 1;
        while (true) {
            int i3 = this.f247150g;
            if (i3 <= 2) {
                int i4 = this.f247149f;
                if (i4 < 8) {
                    this.f247149f = i4 + 1;
                    this.f247150g = i3 + 1;
                }
                if (this.f247149f == 8) {
                    if (!mo117465c(bArr, 0, length)) {
                        return null;
                    }
                    bArr3 = bArr;
                }
            } else {
                int i5 = 0;
                while (i != 0) {
                    int i6 = this.f247149f;
                    if (i6 < 8) {
                        this.f247146c[i5] = (byte) (bArr3[(this.f247148e + 0) + i6] ^ this.f247145b[i6]);
                        i5++;
                        i--;
                        this.f247149f = i6 + 1;
                    }
                    if (this.f247149f == 8) {
                        this.f247148e = this.f247147d - 8;
                        if (!mo117465c(bArr, 0, length)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                }
                this.f247150g = 1;
                while (this.f247150g < 8) {
                    int i7 = this.f247149f;
                    if (i7 < 8) {
                        if ((bArr3[(this.f247148e + 0) + i7] ^ this.f247145b[i7]) != 0) {
                            return null;
                        }
                        this.f247149f = i7 + 1;
                    }
                    if (this.f247149f == 8) {
                        this.f247148e = this.f247147d;
                        if (!mo117465c(bArr, 0, length)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                    this.f247150g++;
                }
                return this.f247146c;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo117465c(byte[] bArr, int i, int i2) {
        this.f247149f = 0;
        while (true) {
            int i3 = this.f247149f;
            if (i3 >= 8) {
                byte[] a = mo117463a(this.f247145b, 0);
                this.f247145b = a;
                if (a == null) {
                    return false;
                }
                this.f247153j += 8;
                this.f247147d += 8;
                this.f247149f = 0;
                return true;
            } else if (this.f247153j + i3 >= i2) {
                return true;
            } else {
                byte[] bArr2 = this.f247145b;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[(this.f247147d + i) + i3]);
                this.f247149f = i3 + 1;
            }
        }
    }

    /* renamed from: d */
    public byte[] mo117466d(byte[] bArr, byte[] bArr2) {
        int i;
        int length = bArr.length;
        byte[] bArr3 = new byte[8];
        this.f247144a = bArr3;
        this.f247145b = new byte[8];
        this.f247149f = 1;
        this.f247150g = 0;
        this.f247148e = 0;
        this.f247147d = 0;
        this.f247151h = bArr2;
        this.f247152i = true;
        int i2 = (length + 10) % 8;
        this.f247149f = i2;
        if (i2 != 0) {
            this.f247149f = 8 - i2;
        }
        this.f247146c = new byte[(this.f247149f + length + 10)];
        bArr3[0] = (byte) ((this.f247154k.nextInt() & WXWebReporter.KEY_TRY_FIX_DEX_FAILED) | this.f247149f);
        int i3 = 1;
        while (true) {
            i = this.f247149f;
            if (i3 > i) {
                break;
            }
            this.f247144a[i3] = (byte) (this.f247154k.nextInt() & 255);
            i3++;
        }
        this.f247149f = i + 1;
        for (int i4 = 0; i4 < 8; i4++) {
            this.f247145b[i4] = 0;
        }
        this.f247150g = 1;
        while (this.f247150g <= 2) {
            int i5 = this.f247149f;
            if (i5 < 8) {
                byte[] bArr4 = this.f247144a;
                this.f247149f = i5 + 1;
                bArr4[i5] = (byte) (this.f247154k.nextInt() & 255);
                this.f247150g++;
            }
            if (this.f247149f == 8) {
                mo117467e();
            }
        }
        int i6 = 0;
        while (length > 0) {
            int i7 = this.f247149f;
            if (i7 < 8) {
                byte[] bArr5 = this.f247144a;
                this.f247149f = i7 + 1;
                bArr5[i7] = bArr[i6];
                length--;
                i6++;
            }
            if (this.f247149f == 8) {
                mo117467e();
            }
        }
        this.f247150g = 1;
        while (true) {
            int i8 = this.f247150g;
            if (i8 > 7) {
                return this.f247146c;
            }
            int i9 = this.f247149f;
            if (i9 < 8) {
                byte[] bArr6 = this.f247144a;
                this.f247149f = i9 + 1;
                bArr6[i9] = 0;
                this.f247150g = i8 + 1;
            }
            if (this.f247149f == 8) {
                mo117467e();
            }
        }
    }

    /* renamed from: e */
    public final void mo117467e() {
        byte[] bArr;
        this.f247149f = 0;
        while (true) {
            int i = this.f247149f;
            if (i >= 8) {
                break;
            }
            if (this.f247152i) {
                byte[] bArr2 = this.f247144a;
                bArr2[i] = (byte) (bArr2[i] ^ this.f247145b[i]);
            } else {
                byte[] bArr3 = this.f247144a;
                bArr3[i] = (byte) (bArr3[i] ^ this.f247146c[this.f247148e + i]);
            }
            this.f247149f = i + 1;
        }
        byte[] bArr4 = this.f247144a;
        try {
            long f = m104401f(bArr4, 0, 4);
            long f2 = m104401f(bArr4, 4, 4);
            long f3 = m104401f(this.f247151h, 0, 4);
            long f4 = m104401f(this.f247151h, 4, 4);
            long f5 = m104401f(this.f247151h, 8, 4);
            long f6 = m104401f(this.f247151h, 12, 4);
            long j = 0;
            int i2 = 16;
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                j = (j + 2654435769L) & Util.MAX_32BIT_VALUE;
                f = (f + ((((f2 << 4) + f3) ^ (f2 + j)) ^ ((f2 >>> 5) + f4))) & Util.MAX_32BIT_VALUE;
                f2 = (f2 + ((((f << 4) + f5) ^ (f + j)) ^ ((f >>> 5) + f6))) & Util.MAX_32BIT_VALUE;
                i2 = i3;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt((int) f);
            dataOutputStream.writeInt((int) f2);
            dataOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            bArr = null;
        }
        System.arraycopy(bArr, 0, this.f247146c, this.f247147d, 8);
        this.f247149f = 0;
        while (true) {
            int i4 = this.f247149f;
            if (i4 < 8) {
                byte[] bArr5 = this.f247146c;
                int i5 = this.f247147d + i4;
                bArr5[i5] = (byte) (bArr5[i5] ^ this.f247145b[i4]);
                this.f247149f = i4 + 1;
            } else {
                System.arraycopy(this.f247144a, 0, this.f247145b, 0, 8);
                int i6 = this.f247147d;
                this.f247148e = i6;
                this.f247147d = i6 + 8;
                this.f247149f = 0;
                this.f247152i = false;
                return;
            }
        }
    }
}
