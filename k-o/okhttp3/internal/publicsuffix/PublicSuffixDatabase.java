package okhttp3.internal.publicsuffix;

import androidx.exifinterface.media.ExifInterface;
import e24.C20509c;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o24.C21768j;
import o24.C21774o;
import o24.C21777r;
import o24.C21783x;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f61768e = {ExifInterface.START_CODE};

    /* renamed from: f */
    public static final String[] f61769f = new String[0];

    /* renamed from: g */
    public static final String[] f61770g = {"*"};

    /* renamed from: h */
    public static final PublicSuffixDatabase f61771h = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f61772a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f61773b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f61774c;

    /* renamed from: d */
    public byte[] f61775d;

    /* renamed from: a */
    public static String m24985a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        byte b;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 > -1 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z2 = false;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (z2) {
                    b = 46;
                    z = false;
                } else {
                    z = z2;
                    b = bArr4[i9][i15] & ExifInterface.MARKER;
                }
                i3 = b - (bArr3[i6 + i16] & ExifInterface.MARKER);
                if (i3 == 0) {
                    i16++;
                    i15++;
                    if (i16 == i8) {
                        break;
                    } else if (bArr4[i9].length != i15) {
                        z2 = z;
                    } else if (i9 == bArr4.length - 1) {
                        break;
                    } else {
                        i9++;
                        z2 = true;
                        i15 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i17 = i8 - i16;
                    int length2 = bArr4[i9].length - i15;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i17) {
                        if (length2 <= i17) {
                            return new String(bArr3, i6, i8, C20509c.f57732d);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo34203b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            C21768j b = C21777r.m24935b(new C21774o(C21777r.m24939f(resourceAsStream)));
            try {
                C21783x xVar = (C21783x) b;
                byte[] bArr = new byte[xVar.readInt()];
                xVar.mo34181b(bArr);
                byte[] bArr2 = new byte[xVar.readInt()];
                xVar.mo34181b(bArr2);
                synchronized (this) {
                    this.f61774c = bArr;
                    this.f61775d = bArr2;
                }
                this.f61773b.countDown();
            } finally {
                C20509c.m22197c(b);
            }
        }
    }
}
