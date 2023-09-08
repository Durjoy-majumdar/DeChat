package c24;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

/* renamed from: c24.a */
public class C16847a {

    /* renamed from: a */
    public byte[] f45516a;

    /* renamed from: b */
    public byte[] f45517b;

    /* renamed from: c */
    public byte[] f45518c;

    /* renamed from: d */
    public int f45519d;

    /* renamed from: e */
    public int f45520e;

    /* renamed from: f */
    public int f45521f;

    /* renamed from: g */
    public int f45522g;

    /* renamed from: h */
    public byte[] f45523h;

    /* renamed from: i */
    public boolean f45524i = true;

    /* renamed from: j */
    public int f45525j;

    /* renamed from: k */
    public Random f45526k = new Random();

    /* renamed from: d */
    public static long m16496d(byte[] bArr, int i, int i2) {
        int i3 = i2 > 8 ? i + 8 : i2 + i;
        long j = 0;
        while (i < i3) {
            j = (j << 8) | ((long) (bArr[i] & ExifInterface.MARKER));
            i++;
        }
        return (Util.MAX_32BIT_VALUE & j) | (j >>> 32);
    }

    /* renamed from: a */
    public final byte[] mo17899a(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        int i3 = 16;
        try {
            long d = m16496d(bArr2, i2, 4);
            long d2 = m16496d(bArr2, i2 + 4, 4);
            long d3 = m16496d(this.f45523h, 0, 4);
            long d4 = m16496d(this.f45523h, 4, 4);
            long d5 = m16496d(this.f45523h, 8, 4);
            long d6 = m16496d(this.f45523h, 12, 4);
            long j = 3816266640L;
            while (true) {
                int i4 = i3 - 1;
                if (i3 <= 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) d);
                    dataOutputStream.writeInt((int) d2);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                d2 = (d2 - ((((d << 4) + d5) ^ (d + j)) ^ ((d >>> 5) + d6))) & Util.MAX_32BIT_VALUE;
                d = (d - ((((d2 << 4) + d3) ^ (d2 + j)) ^ ((d2 >>> 5) + d4))) & Util.MAX_32BIT_VALUE;
                j = (j - 2654435769L) & Util.MAX_32BIT_VALUE;
                i3 = i4;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo17900b(byte[] bArr, int i, int i2) {
        this.f45521f = 0;
        while (true) {
            int i3 = this.f45521f;
            if (i3 >= 8) {
                byte[] a = mo17899a(this.f45517b, 0);
                this.f45517b = a;
                if (a == null) {
                    return false;
                }
                this.f45525j += 8;
                this.f45519d += 8;
                this.f45521f = 0;
                return true;
            } else if (this.f45525j + i3 >= i2) {
                return true;
            } else {
                byte[] bArr2 = this.f45517b;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[(this.f45519d + i) + i3]);
                this.f45521f = i3 + 1;
            }
        }
    }

    /* renamed from: c */
    public final void mo17901c() {
        byte[] bArr;
        this.f45521f = 0;
        while (true) {
            int i = this.f45521f;
            if (i >= 8) {
                break;
            }
            if (this.f45524i) {
                byte[] bArr2 = this.f45516a;
                bArr2[i] = (byte) (bArr2[i] ^ this.f45517b[i]);
            } else {
                byte[] bArr3 = this.f45516a;
                bArr3[i] = (byte) (bArr3[i] ^ this.f45518c[this.f45520e + i]);
            }
            this.f45521f = i + 1;
        }
        byte[] bArr4 = this.f45516a;
        try {
            long d = m16496d(bArr4, 0, 4);
            long d2 = m16496d(bArr4, 4, 4);
            long d3 = m16496d(this.f45523h, 0, 4);
            long d4 = m16496d(this.f45523h, 4, 4);
            long d5 = m16496d(this.f45523h, 8, 4);
            long d6 = m16496d(this.f45523h, 12, 4);
            long j = 0;
            int i2 = 16;
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                j = (j + 2654435769L) & Util.MAX_32BIT_VALUE;
                d = (d + ((((d2 << 4) + d3) ^ (d2 + j)) ^ ((d2 >>> 5) + d4))) & Util.MAX_32BIT_VALUE;
                d2 = (d2 + ((((d << 4) + d5) ^ (d + j)) ^ ((d >>> 5) + d6))) & Util.MAX_32BIT_VALUE;
                i2 = i3;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt((int) d);
            dataOutputStream.writeInt((int) d2);
            dataOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            bArr = null;
        }
        System.arraycopy(bArr, 0, this.f45518c, this.f45519d, 8);
        this.f45521f = 0;
        while (true) {
            int i4 = this.f45521f;
            if (i4 >= 8) {
                System.arraycopy(this.f45516a, 0, this.f45517b, 0, 8);
                int i5 = this.f45519d;
                this.f45520e = i5;
                this.f45519d = i5 + 8;
                this.f45521f = 0;
                this.f45524i = false;
                return;
            }
            byte[] bArr5 = this.f45518c;
            int i6 = this.f45519d + i4;
            bArr5[i6] = (byte) (bArr5[i6] ^ this.f45517b[i4]);
            this.f45521f = i4 + 1;
        }
    }
}
