package xz3;

import java.io.OutputStream;
import java.util.NoSuchElementException;
import xz3.C23156c;

/* renamed from: xz3.o */
public class C23163o extends C23156c {

    /* renamed from: e */
    public final byte[] f66540e;

    /* renamed from: f */
    public int f66541f = 0;

    /* renamed from: xz3.o$b */
    public class C23165b implements C23156c.C23157a {

        /* renamed from: d */
        public int f66542d = 0;

        /* renamed from: e */
        public final int f66543e;

        public C23165b(C23164a aVar) {
            this.f66543e = C23163o.this.size();
        }

        public boolean hasNext() {
            return this.f66542d < this.f66543e;
        }

        public Object next() {
            return Byte.valueOf(nextByte());
        }

        public byte nextByte() {
            try {
                byte[] bArr = C23163o.this.f66540e;
                int i = this.f66542d;
                this.f66542d = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C23163o(byte[] bArr) {
        this.f66540e = bArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23156c) || size() != ((C23156c) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C23163o) {
            return mo36579w((C23163o) obj, 0, size());
        }
        if (obj instanceof C23166s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int i = this.f66541f;
        if (i == 0) {
            int size = size();
            i = mo36549r(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f66541f = i;
        }
        return i;
    }

    /* renamed from: k */
    public void mo36544k(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f66540e, i, bArr, i2, i3);
    }

    /* renamed from: l */
    public int mo36545l() {
        return 0;
    }

    /* renamed from: m */
    public boolean mo36546m() {
        return true;
    }

    /* renamed from: n */
    public boolean mo36547n() {
        byte[] bArr = this.f66540e;
        return C23179x.m27555b(bArr, 0, bArr.length + 0) == 0;
    }

    /* renamed from: o */
    public C23156c.C23157a iterator() {
        return new C23165b((C23164a) null);
    }

    /* renamed from: r */
    public int mo36549r(int i, int i2, int i3) {
        byte[] bArr = this.f66540e;
        int x = mo36580x() + i2;
        for (int i4 = x; i4 < x + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r1[r11] > -65) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0098, code lost:
        if (r1[r11] > -65) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r1[r11] > -65) goto L_0x009a;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo36550s(int r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = 0
            int r11 = r11 + r0
            byte[] r1 = r9.f66540e
            int r12 = r12 + r11
            r2 = -1
            if (r10 == 0) goto L_0x009c
            if (r11 < r12) goto L_0x000c
            goto L_0x00a0
        L_0x000c:
            byte r3 = (byte) r10
            r4 = -32
            r5 = -65
            if (r3 >= r4) goto L_0x0022
            r10 = -62
            if (r3 < r10) goto L_0x009a
            int r10 = r11 + 1
            byte r11 = r1[r11]
            if (r11 <= r5) goto L_0x001f
            goto L_0x009a
        L_0x001f:
            r11 = r10
            goto L_0x009c
        L_0x0022:
            r6 = -16
            r7 = -12
            if (r3 >= r6) goto L_0x0057
            int r10 = r10 >> 8
            int r10 = ~r10
            byte r10 = (byte) r10
            if (r10 != 0) goto L_0x0042
            int r10 = r11 + 1
            byte r11 = r1[r11]
            if (r10 < r12) goto L_0x003f
            if (r3 > r7) goto L_0x009a
            if (r11 <= r5) goto L_0x003a
            goto L_0x009a
        L_0x003a:
            int r10 = r11 << 8
        L_0x003c:
            r10 = r10 ^ r3
            goto L_0x00a0
        L_0x003f:
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0042:
            if (r10 > r5) goto L_0x009a
            r0 = -96
            if (r3 != r4) goto L_0x004a
            if (r10 < r0) goto L_0x009a
        L_0x004a:
            r4 = -19
            if (r3 != r4) goto L_0x0050
            if (r10 >= r0) goto L_0x009a
        L_0x0050:
            int r10 = r11 + 1
            byte r11 = r1[r11]
            if (r11 <= r5) goto L_0x001f
            goto L_0x009a
        L_0x0057:
            int r4 = r10 >> 8
            int r4 = ~r4
            byte r4 = (byte) r4
            if (r4 != 0) goto L_0x006d
            int r10 = r11 + 1
            byte r4 = r1[r11]
            if (r10 < r12) goto L_0x006b
            if (r3 > r7) goto L_0x009a
            if (r4 <= r5) goto L_0x0068
            goto L_0x009a
        L_0x0068:
            int r10 = r4 << 8
            goto L_0x003c
        L_0x006b:
            r11 = r10
            goto L_0x0070
        L_0x006d:
            int r10 = r10 >> 16
            byte r0 = (byte) r10
        L_0x0070:
            if (r0 != 0) goto L_0x0087
            int r10 = r11 + 1
            byte r0 = r1[r11]
            if (r10 < r12) goto L_0x0086
            if (r3 > r7) goto L_0x009a
            if (r4 > r5) goto L_0x009a
            if (r0 <= r5) goto L_0x007f
            goto L_0x009a
        L_0x007f:
            int r10 = r4 << 8
            r10 = r10 ^ r3
            int r11 = r0 << 16
            r10 = r10 ^ r11
            goto L_0x00a0
        L_0x0086:
            r11 = r10
        L_0x0087:
            if (r4 > r5) goto L_0x009a
            int r10 = r3 << 28
            int r4 = r4 + 112
            int r10 = r10 + r4
            int r10 = r10 >> 30
            if (r10 != 0) goto L_0x009a
            if (r0 > r5) goto L_0x009a
            int r10 = r11 + 1
            byte r11 = r1[r11]
            if (r11 <= r5) goto L_0x001f
        L_0x009a:
            r10 = -1
            goto L_0x00a0
        L_0x009c:
            int r10 = xz3.C23179x.m27555b(r1, r11, r12)
        L_0x00a0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xz3.C23163o.mo36550s(int, int, int):int");
    }

    public int size() {
        return this.f66540e.length;
    }

    /* renamed from: t */
    public int mo36552t() {
        return this.f66541f;
    }

    /* renamed from: u */
    public String mo36554u(String str) {
        return new String(this.f66540e, mo36580x(), size(), str);
    }

    /* renamed from: v */
    public void mo36555v(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f66540e, mo36580x() + i, i2);
    }

    /* renamed from: w */
    public boolean mo36579w(C23163o oVar, int i, int i2) {
        if (i2 > oVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= oVar.size()) {
            byte[] bArr = this.f66540e;
            byte[] bArr2 = oVar.f66540e;
            int x = mo36580x() + i2;
            int x2 = mo36580x();
            int x3 = oVar.mo36580x() + i;
            while (x2 < x) {
                if (bArr[x2] != bArr2[x3]) {
                    return false;
                }
                x2++;
                x3++;
            }
            return true;
        } else {
            int size2 = oVar.size();
            StringBuilder sb4 = new StringBuilder(59);
            sb4.append("Ran off end of other: ");
            sb4.append(i);
            sb4.append(", ");
            sb4.append(i2);
            sb4.append(", ");
            sb4.append(size2);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: x */
    public int mo36580x() {
        return 0;
    }
}
