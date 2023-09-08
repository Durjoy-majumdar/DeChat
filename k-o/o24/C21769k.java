package o24;

import androidx.exifinterface.media.ExifInterface;
import gy3.C8480h;
import gy3.C87412m;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import p24.C35364b;
import z04.C119027c;

/* renamed from: o24.k */
public class C21769k implements Serializable, Comparable<C21769k> {

    /* renamed from: g */
    public static final C21769k f61696g = new C21769k(new byte[0]);

    /* renamed from: h */
    public static final C21770a f61697h = new C21770a((C8480h) null);

    /* renamed from: d */
    public transient int f61698d;

    /* renamed from: e */
    public transient String f61699e;

    /* renamed from: f */
    public final byte[] f61700f;

    /* renamed from: o24.k$a */
    public static final class C21770a {
        public C21770a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C21769k mo34164a(String str) {
            C87412m.m108594g(str, "$this$encodeUtf8");
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "(this as java.lang.String).getBytes(charset)");
            C21769k kVar = new C21769k(bytes);
            kVar.f61699e = str;
            return kVar;
        }
    }

    public C21769k(byte[] bArr) {
        C87412m.m108594g(bArr, "data");
        this.f61700f = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r5 = r0 - 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final o24.C21769k m24900b(java.lang.String r15) {
        /*
            java.lang.String r0 = "$this$decodeBase64"
            gy3.C87412m.m108594g(r15, r0)
            byte[] r0 = o24.C21751a.f61674a
            int r0 = r15.length()
        L_0x000b:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L_0x002a
            int r5 = r0 + -1
            char r6 = r15.charAt(r5)
            r7 = 61
            if (r6 == r7) goto L_0x0028
            if (r6 == r4) goto L_0x0028
            if (r6 == r3) goto L_0x0028
            if (r6 == r2) goto L_0x0028
            if (r6 == r1) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = r5
            goto L_0x000b
        L_0x002a:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0039:
            r11 = 0
            if (r7 >= r0) goto L_0x00a4
            char r12 = r15.charAt(r7)
            r13 = 90
            r14 = 65
            if (r14 <= r12) goto L_0x0047
            goto L_0x004c
        L_0x0047:
            if (r13 < r12) goto L_0x004c
            int r12 = r12 + -65
            goto L_0x0084
        L_0x004c:
            r13 = 122(0x7a, float:1.71E-43)
            r14 = 97
            if (r14 <= r12) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            if (r13 < r12) goto L_0x0058
            int r12 = r12 + -71
            goto L_0x0084
        L_0x0058:
            r13 = 57
            r14 = 48
            if (r14 <= r12) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            if (r13 < r12) goto L_0x0064
            int r12 = r12 + 4
            goto L_0x0084
        L_0x0064:
            r13 = 43
            if (r12 == r13) goto L_0x0082
            r13 = 45
            if (r12 != r13) goto L_0x006d
            goto L_0x0082
        L_0x006d:
            r13 = 47
            if (r12 == r13) goto L_0x007f
            r13 = 95
            if (r12 != r13) goto L_0x0076
            goto L_0x007f
        L_0x0076:
            if (r12 == r4) goto L_0x00a1
            if (r12 == r3) goto L_0x00a1
            if (r12 == r2) goto L_0x00a1
            if (r12 != r1) goto L_0x00d8
            goto L_0x00a1
        L_0x007f:
            r12 = 63
            goto L_0x0084
        L_0x0082:
            r12 = 62
        L_0x0084:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r8 = r8 + 1
            int r11 = r8 % 4
            if (r11 != 0) goto L_0x00a1
            int r11 = r10 + 1
            int r12 = r9 >> 16
            byte r12 = (byte) r12
            r5[r10] = r12
            int r10 = r11 + 1
            int r12 = r9 >> 8
            byte r12 = (byte) r12
            r5[r11] = r12
            int r11 = r10 + 1
            byte r12 = (byte) r9
            r5[r10] = r12
            r10 = r11
        L_0x00a1:
            int r7 = r7 + 1
            goto L_0x0039
        L_0x00a4:
            int r8 = r8 % 4
            r15 = 1
            if (r8 == r15) goto L_0x00d8
            r15 = 2
            if (r8 == r15) goto L_0x00c1
            r15 = 3
            if (r8 == r15) goto L_0x00b0
            goto L_0x00cb
        L_0x00b0:
            int r15 = r9 << 6
            int r0 = r10 + 1
            int r1 = r15 >> 16
            byte r1 = (byte) r1
            r5[r10] = r1
            int r10 = r0 + 1
            int r15 = r15 >> 8
            byte r15 = (byte) r15
            r5[r0] = r15
            goto L_0x00cb
        L_0x00c1:
            int r15 = r9 << 12
            int r0 = r10 + 1
            int r15 = r15 >> 16
            byte r15 = (byte) r15
            r5[r10] = r15
            r10 = r0
        L_0x00cb:
            if (r10 != r6) goto L_0x00ce
            goto L_0x00d9
        L_0x00ce:
            byte[] r5 = java.util.Arrays.copyOf(r5, r10)
            java.lang.String r15 = "java.util.Arrays.copyOf(this, newSize)"
            gy3.C87412m.m108593f(r5, r15)
            goto L_0x00d9
        L_0x00d8:
            r5 = r11
        L_0x00d9:
            if (r5 == 0) goto L_0x00e0
            o24.k r11 = new o24.k
            r11.<init>(r5)
        L_0x00e0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o24.C21769k.m24900b(java.lang.String):o24.k");
    }

    /* renamed from: c */
    public static final C21769k m24901c(String str) {
        C87412m.m108594g(str, "$this$decodeHex");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((C35364b.m40653a(str.charAt(i2)) << 4) + C35364b.m40653a(str.charAt(i2 + 1)));
            }
            return new C21769k(bArr);
        }
        throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
    }

    /* renamed from: j */
    public static final C21769k m24902j(byte... bArr) {
        C87412m.m108594g(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C87412m.m108593f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C21769k(copyOf);
    }

    /* renamed from: a */
    public String mo34082a() {
        byte[] bArr = this.f61700f;
        byte[] bArr2 = C21751a.f61674a;
        C87412m.m108594g(bArr, "$this$encodeBase64");
        C87412m.m108594g(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & ExifInterface.MARKER) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & ExifInterface.MARKER) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & ExifInterface.MARKER) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & ExifInterface.MARKER) >> 2];
            int i15 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i15] = b5;
            bArr3[i15 + 1] = b5;
        } else if (length2 == 2) {
            int i16 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i16];
            int i17 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & ExifInterface.MARKER) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr2[((b6 & 3) << 4) | ((b7 & ExifInterface.MARKER) >> 4)];
            bArr3[i18] = bArr2[(b7 & 15) << 2];
            bArr3[i18 + 1] = (byte) 61;
        }
        return new String(bArr3, C119027c.f356488a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            o24.k r8 = (o24.C21769k) r8
            java.lang.String r0 = "other"
            gy3.C87412m.m108594g(r8, r0)
            int r0 = r7.mo34085f()
            int r1 = r8.mo34085f()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0015:
            if (r4 >= r2) goto L_0x002b
            byte r5 = r7.mo34089i(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.mo34089i(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0028:
            if (r5 >= r6) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o24.C21769k.compareTo(java.lang.Object):int");
    }

    /* renamed from: e */
    public C21769k mo34083e(String str) {
        C87412m.m108594g(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.f61700f, 0, mo34085f());
        byte[] digest = instance.digest();
        C87412m.m108593f(digest, "digestBytes");
        return new C21769k(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21769k) {
            C21769k kVar = (C21769k) obj;
            int f = kVar.mo34085f();
            byte[] bArr = this.f61700f;
            return f == bArr.length && kVar.mo34091l(0, bArr, 0, bArr.length);
        }
    }

    /* renamed from: f */
    public int mo34085f() {
        return this.f61700f.length;
    }

    /* renamed from: g */
    public String mo34086g() {
        byte[] bArr = this.f61700f;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = C35364b.f94698a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: h */
    public byte[] mo34087h() {
        return this.f61700f;
    }

    public int hashCode() {
        int i = this.f61698d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f61700f);
        this.f61698d = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public byte mo34089i(int i) {
        return this.f61700f[i];
    }

    /* renamed from: k */
    public boolean mo34090k(int i, C21769k kVar, int i2, int i3) {
        C87412m.m108594g(kVar, "other");
        return kVar.mo34091l(i2, this.f61700f, i, i3);
    }

    /* renamed from: l */
    public boolean mo34091l(int i, byte[] bArr, int i2, int i3) {
        C87412m.m108594g(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f61700f;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C21753b.m24815a(bArr2, i, bArr, i2, i3);
        }
    }

    /* renamed from: m */
    public C21769k mo34092m() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.f61700f;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                C87412m.m108593f(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C21769k(copyOf);
            }
        }
    }

    /* renamed from: n */
    public String mo34163n() {
        String str = this.f61699e;
        if (str != null) {
            return str;
        }
        byte[] h = mo34087h();
        C87412m.m108594g(h, "$this$toUtf8String");
        String str2 = new String(h, C119027c.f356488a);
        this.f61699e = str2;
        return str2;
    }

    /* renamed from: o */
    public void mo34093o(C21766h hVar, int i, int i2) {
        C87412m.m108594g(hVar, "buffer");
        hVar.mo34145n(this.f61700f, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x011e, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x015d, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x016e, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x017f, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x018e, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01a4, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01ac, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x01b3, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x01e9, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x01ec, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0089, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0098, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a3, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e3, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00f4, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0103, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0115, code lost:
        if (r6 == 64) goto L_0x01ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            byte[] r1 = r0.f61700f
            int r2 = r1.length
            if (r2 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "[size=0]"
            goto L_0x02dc
        L_0x0010:
            int r2 = r1.length
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0014:
            r8 = 64
            if (r5 >= r2) goto L_0x01ed
            byte r10 = r1[r5]
            r11 = 10
            r12 = 13
            r13 = 159(0x9f, float:2.23E-43)
            r14 = 127(0x7f, float:1.78E-43)
            r15 = 31
            r4 = 65533(0xfffd, float:9.1831E-41)
            r3 = 65536(0x10000, float:9.18355E-41)
            r16 = 2
            if (r10 < 0) goto L_0x007e
            int r17 = r6 + 1
            if (r6 != r8) goto L_0x0033
            goto L_0x01ed
        L_0x0033:
            if (r10 == r11) goto L_0x0045
            if (r10 == r12) goto L_0x0045
            if (r10 < 0) goto L_0x003b
            if (r15 >= r10) goto L_0x0040
        L_0x003b:
            if (r14 <= r10) goto L_0x003e
            goto L_0x0042
        L_0x003e:
            if (r13 < r10) goto L_0x0042
        L_0x0040:
            r6 = 1
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            if (r6 != 0) goto L_0x01ec
        L_0x0045:
            if (r10 != r4) goto L_0x0049
            goto L_0x01ec
        L_0x0049:
            if (r10 >= r3) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 2
        L_0x004e:
            int r7 = r7 + r6
            int r5 = r5 + 1
        L_0x0051:
            r6 = r17
            if (r5 >= r2) goto L_0x0014
            byte r10 = r1[r5]
            if (r10 < 0) goto L_0x0014
            int r5 = r5 + 1
            int r17 = r6 + 1
            if (r6 != r8) goto L_0x0061
            goto L_0x01ed
        L_0x0061:
            if (r10 == r11) goto L_0x0073
            if (r10 == r12) goto L_0x0073
            if (r10 < 0) goto L_0x0069
            if (r15 >= r10) goto L_0x006e
        L_0x0069:
            if (r14 <= r10) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            if (r13 < r10) goto L_0x0070
        L_0x006e:
            r6 = 1
            goto L_0x0071
        L_0x0070:
            r6 = 0
        L_0x0071:
            if (r6 != 0) goto L_0x01ec
        L_0x0073:
            if (r10 != r4) goto L_0x0077
            goto L_0x01ec
        L_0x0077:
            if (r10 >= r3) goto L_0x007b
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 2
        L_0x007c:
            int r7 = r7 + r6
            goto L_0x0051
        L_0x007e:
            int r9 = r10 >> 5
            r3 = -2
            r4 = 128(0x80, float:1.794E-43)
            if (r9 != r3) goto L_0x00d5
            int r3 = r5 + 1
            if (r2 > r3) goto L_0x008d
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x008d:
            byte r3 = r1[r3]
            r9 = r3 & 192(0xc0, float:2.69E-43)
            if (r9 != r4) goto L_0x0095
            r9 = 1
            goto L_0x0096
        L_0x0095:
            r9 = 0
        L_0x0096:
            if (r9 != 0) goto L_0x009c
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x009c:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r9 = r10 << 6
            r3 = r3 ^ r9
            if (r3 >= r4) goto L_0x00a7
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x00a7:
            int r4 = r6 + 1
            if (r6 != r8) goto L_0x00ad
            goto L_0x01ed
        L_0x00ad:
            if (r3 == r11) goto L_0x00bf
            if (r3 == r12) goto L_0x00bf
            if (r3 < 0) goto L_0x00b5
            if (r15 >= r3) goto L_0x00ba
        L_0x00b5:
            if (r14 <= r3) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            if (r13 < r3) goto L_0x00bc
        L_0x00ba:
            r6 = 1
            goto L_0x00bd
        L_0x00bc:
            r6 = 0
        L_0x00bd:
            if (r6 != 0) goto L_0x01ec
        L_0x00bf:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x00c6
            goto L_0x01ec
        L_0x00c6:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00cc
            r16 = 1
        L_0x00cc:
            int r7 = r7 + r16
            rx3.b0 r3 = rx3.C13598b0.f38549a
            int r5 = r5 + 2
        L_0x00d2:
            r6 = r4
            goto L_0x0014
        L_0x00d5:
            int r9 = r10 >> 4
            r13 = 55296(0xd800, float:7.7486E-41)
            r14 = 57343(0xdfff, float:8.0355E-41)
            if (r9 != r3) goto L_0x0155
            int r3 = r5 + 2
            if (r2 > r3) goto L_0x00e7
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x00e7:
            int r9 = r5 + 1
            byte r9 = r1[r9]
            r15 = r9 & 192(0xc0, float:2.69E-43)
            if (r15 != r4) goto L_0x00f1
            r15 = 1
            goto L_0x00f2
        L_0x00f1:
            r15 = 0
        L_0x00f2:
            if (r15 != 0) goto L_0x00f8
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x00f8:
            byte r3 = r1[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r4) goto L_0x0100
            r4 = 1
            goto L_0x0101
        L_0x0100:
            r4 = 0
        L_0x0101:
            if (r4 != 0) goto L_0x0107
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x0107:
            r4 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r4
            int r4 = r9 << 6
            r3 = r3 ^ r4
            int r4 = r10 << 12
            r3 = r3 ^ r4
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L_0x0119
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x0119:
            if (r13 <= r3) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            if (r14 < r3) goto L_0x0122
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x0122:
            int r4 = r6 + 1
            if (r6 != r8) goto L_0x0128
            goto L_0x01ed
        L_0x0128:
            if (r3 == r11) goto L_0x0140
            if (r3 == r12) goto L_0x0140
            if (r3 < 0) goto L_0x0132
            r6 = 31
            if (r6 >= r3) goto L_0x013b
        L_0x0132:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x0137
            goto L_0x013d
        L_0x0137:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x013d
        L_0x013b:
            r6 = 1
            goto L_0x013e
        L_0x013d:
            r6 = 0
        L_0x013e:
            if (r6 != 0) goto L_0x01ec
        L_0x0140:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0147
            goto L_0x01ec
        L_0x0147:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x014d
            r16 = 1
        L_0x014d:
            int r7 = r7 + r16
            rx3.b0 r3 = rx3.C13598b0.f38549a
            int r5 = r5 + 3
            goto L_0x00d2
        L_0x0155:
            int r9 = r10 >> 3
            if (r9 != r3) goto L_0x01e9
            int r3 = r5 + 3
            if (r2 > r3) goto L_0x0161
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x0161:
            int r9 = r5 + 1
            byte r9 = r1[r9]
            r15 = r9 & 192(0xc0, float:2.69E-43)
            if (r15 != r4) goto L_0x016b
            r15 = 1
            goto L_0x016c
        L_0x016b:
            r15 = 0
        L_0x016c:
            if (r15 != 0) goto L_0x0172
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x0172:
            int r15 = r5 + 2
            byte r15 = r1[r15]
            r12 = r15 & 192(0xc0, float:2.69E-43)
            if (r12 != r4) goto L_0x017c
            r12 = 1
            goto L_0x017d
        L_0x017c:
            r12 = 0
        L_0x017d:
            if (r12 != 0) goto L_0x0183
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x0183:
            byte r3 = r1[r3]
            r12 = r3 & 192(0xc0, float:2.69E-43)
            if (r12 != r4) goto L_0x018b
            r4 = 1
            goto L_0x018c
        L_0x018b:
            r4 = 0
        L_0x018c:
            if (r4 != 0) goto L_0x0192
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x0192:
            r4 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r4
            int r4 = r15 << 6
            r3 = r3 ^ r4
            int r4 = r9 << 12
            r3 = r3 ^ r4
            int r4 = r10 << 18
            r3 = r3 ^ r4
            r4 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r4) goto L_0x01a7
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x01a7:
            if (r13 <= r3) goto L_0x01aa
            goto L_0x01af
        L_0x01aa:
            if (r14 < r3) goto L_0x01af
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x01af:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r4) goto L_0x01b6
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x01b6:
            int r4 = r6 + 1
            if (r6 != r8) goto L_0x01bb
            goto L_0x01ed
        L_0x01bb:
            if (r3 == r11) goto L_0x01d5
            r6 = 13
            if (r3 == r6) goto L_0x01d5
            if (r3 < 0) goto L_0x01c7
            r6 = 31
            if (r6 >= r3) goto L_0x01d0
        L_0x01c7:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x01cc
            goto L_0x01d2
        L_0x01cc:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x01d2
        L_0x01d0:
            r6 = 1
            goto L_0x01d3
        L_0x01d2:
            r6 = 0
        L_0x01d3:
            if (r6 != 0) goto L_0x01ec
        L_0x01d5:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x01db
            goto L_0x01ec
        L_0x01db:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x01e1
            r16 = 1
        L_0x01e1:
            int r7 = r7 + r16
            rx3.b0 r3 = rx3.C13598b0.f38549a
            int r5 = r5 + 4
            goto L_0x00d2
        L_0x01e9:
            if (r6 != r8) goto L_0x01ec
            goto L_0x01ed
        L_0x01ec:
            r7 = -1
        L_0x01ed:
            java.lang.String r1 = "…]"
            r2 = 93
            java.lang.String r3 = "[size="
            r4 = -1
            if (r7 != r4) goto L_0x027e
            byte[] r4 = r0.f61700f
            int r4 = r4.length
            if (r4 > r8) goto L_0x0216
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "[hex="
            r1.append(r3)
            java.lang.String r3 = r18.mo34086g()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x02dc
        L_0x0216:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            byte[] r3 = r0.f61700f
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " hex="
            r2.append(r3)
            byte[] r3 = r0.f61700f
            int r4 = r3.length
            if (r8 > r4) goto L_0x0230
            r4 = 1
            goto L_0x0231
        L_0x0230:
            r4 = 0
        L_0x0231:
            if (r4 == 0) goto L_0x025b
            int r4 = r3.length
            if (r8 != r4) goto L_0x0238
            r4 = r0
            goto L_0x024b
        L_0x0238:
            o24.k r4 = new o24.k
            int r5 = r3.length
            sx3.C64192l.m75528a(r8, r5)
            r5 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r5, r8)
            java.lang.String r5 = "copyOfRange(this, fromIndex, toIndex)"
            gy3.C87412m.m108593f(r3, r5)
            r4.<init>(r3)
        L_0x024b:
            java.lang.String r3 = r4.mo34086g()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02dc
        L_0x025b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "endIndex > length("
            r1.append(r2)
            byte[] r2 = r0.f61700f
            int r2 = r2.length
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x027e:
            java.lang.String r4 = r18.mo34163n()
            r5 = 0
            java.lang.String r6 = r4.substring(r5, r7)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r6, r8)
            java.lang.String r8 = "\\"
            java.lang.String r9 = "\\\\"
            java.lang.String r6 = z04.C112551y.m153814n(r6, r8, r9, r5)
            java.lang.String r8 = "\n"
            java.lang.String r9 = "\\n"
            java.lang.String r6 = z04.C112551y.m153814n(r6, r8, r9, r5)
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\\r"
            java.lang.String r5 = z04.C112551y.m153814n(r6, r8, r9, r5)
            int r4 = r4.length()
            if (r7 >= r4) goto L_0x02c8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            byte[] r3 = r0.f61700f
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " text="
            r2.append(r3)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02dc
        L_0x02c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "[text="
            r1.append(r3)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x02dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o24.C21769k.toString():java.lang.String");
    }
}
