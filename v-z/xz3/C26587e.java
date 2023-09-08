package xz3;

import com.tencent.tinker.loader.shareutil.ShareElfFile;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: xz3.e */
public final class C26587e {

    /* renamed from: a */
    public final byte[] f73995a;

    /* renamed from: b */
    public final int f73996b;

    /* renamed from: c */
    public int f73997c = 0;

    /* renamed from: d */
    public final OutputStream f73998d;

    /* renamed from: xz3.e$a */
    public static class C26588a extends IOException {
        public C26588a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public C26587e(OutputStream outputStream, byte[] bArr) {
        this.f73998d = outputStream;
        this.f73995a = bArr;
        this.f73996b = bArr.length;
    }

    /* renamed from: a */
    public static int m34404a(int i, int i2) {
        return m34411h(i) + m34406c(i2);
    }

    /* renamed from: b */
    public static int m34405b(int i, int i2) {
        return m34411h(i) + m34406c(i2);
    }

    /* renamed from: c */
    public static int m34406c(int i) {
        if (i >= 0) {
            return m34409f(i);
        }
        return 10;
    }

    /* renamed from: d */
    public static int m34407d(int i, C26607p pVar) {
        int h = m34411h(i);
        int serializedSize = pVar.getSerializedSize();
        return h + m34409f(serializedSize) + serializedSize;
    }

    /* renamed from: e */
    public static int m34408e(C26607p pVar) {
        int serializedSize = pVar.getSerializedSize();
        return m34409f(serializedSize) + serializedSize;
    }

    /* renamed from: f */
    public static int m34409f(int i) {
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

    /* renamed from: g */
    public static int m34410g(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: h */
    public static int m34411h(int i) {
        return m34409f((i << 3) | 0);
    }

    /* renamed from: j */
    public static C26587e m34412j(OutputStream outputStream, int i) {
        return new C26587e(outputStream, new byte[i]);
    }

    /* renamed from: i */
    public void mo53536i() {
        if (this.f73998d != null) {
            mo53537k();
        }
    }

    /* renamed from: k */
    public final void mo53537k() {
        OutputStream outputStream = this.f73998d;
        if (outputStream != null) {
            outputStream.write(this.f73995a, 0, this.f73997c);
            this.f73997c = 0;
            return;
        }
        throw new C26588a();
    }

    /* renamed from: l */
    public void mo53538l(int i, int i2) {
        mo53550x(i, 0);
        mo53540n(i2);
    }

    /* renamed from: m */
    public void mo53539m(int i, int i2) {
        mo53550x(i, 0);
        mo53540n(i2);
    }

    /* renamed from: n */
    public void mo53540n(int i) {
        if (i >= 0) {
            mo53548v(i);
        } else {
            mo53549w((long) i);
        }
    }

    /* renamed from: o */
    public void mo53541o(int i, C26607p pVar) {
        mo53550x(i, 2);
        mo53542p(pVar);
    }

    /* renamed from: p */
    public void mo53542p(C26607p pVar) {
        mo53548v(pVar.getSerializedSize());
        pVar.mo52855a(this);
    }

    /* renamed from: q */
    public void mo53543q(int i) {
        byte b = (byte) i;
        if (this.f73997c == this.f73996b) {
            mo53537k();
        }
        byte[] bArr = this.f73995a;
        int i2 = this.f73997c;
        this.f73997c = i2 + 1;
        bArr[i2] = b;
    }

    /* renamed from: r */
    public void mo53544r(C23156c cVar) {
        int size = cVar.size();
        int i = this.f73996b;
        int i2 = this.f73997c;
        int i3 = i - i2;
        if (i3 >= size) {
            cVar.mo36542i(this.f73995a, 0, i2, size);
            this.f73997c += size;
            return;
        }
        cVar.mo36542i(this.f73995a, 0, i2, i3);
        int i4 = i3 + 0;
        int i5 = size - i3;
        this.f73997c = this.f73996b;
        mo53537k();
        if (i5 <= this.f73996b) {
            cVar.mo36542i(this.f73995a, i4, 0, i5);
            this.f73997c = i5;
            return;
        }
        OutputStream outputStream = this.f73998d;
        if (i4 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i4);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i5 >= 0) {
            int i6 = i4 + i5;
            if (i6 > cVar.size()) {
                StringBuilder sb4 = new StringBuilder(39);
                sb4.append("Source end offset exceeded: ");
                sb4.append(i6);
                throw new IndexOutOfBoundsException(sb4.toString());
            } else if (i5 > 0) {
                cVar.mo36555v(outputStream, i4, i5);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* renamed from: s */
    public void mo53545s(byte[] bArr) {
        int length = bArr.length;
        int i = this.f73996b;
        int i2 = this.f73997c;
        int i3 = i - i2;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, this.f73995a, i2, length);
            this.f73997c += length;
            return;
        }
        System.arraycopy(bArr, 0, this.f73995a, i2, i3);
        int i4 = i3 + 0;
        int i5 = length - i3;
        this.f73997c = this.f73996b;
        mo53537k();
        if (i5 <= this.f73996b) {
            System.arraycopy(bArr, i4, this.f73995a, 0, i5);
            this.f73997c = i5;
            return;
        }
        this.f73998d.write(bArr, i4, i5);
    }

    /* renamed from: t */
    public void mo53546t(int i) {
        mo53543q(i & 255);
        mo53543q((i >> 8) & 255);
        mo53543q((i >> 16) & 255);
        mo53543q((i >> 24) & 255);
    }

    /* renamed from: u */
    public void mo53547u(long j) {
        mo53543q(((int) j) & 255);
        mo53543q(((int) (j >> 8)) & 255);
        mo53543q(((int) (j >> 16)) & 255);
        mo53543q(((int) (j >> 24)) & 255);
        mo53543q(((int) (j >> 32)) & 255);
        mo53543q(((int) (j >> 40)) & 255);
        mo53543q(((int) (j >> 48)) & 255);
        mo53543q(((int) (j >> 56)) & 255);
    }

    /* renamed from: v */
    public void mo53548v(int i) {
        while ((i & -128) != 0) {
            mo53543q((i & 127) | 128);
            i >>>= 7;
        }
        mo53543q(i);
    }

    /* renamed from: w */
    public void mo53549w(long j) {
        while ((-128 & j) != 0) {
            mo53543q((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo53543q((int) j);
    }

    /* renamed from: x */
    public void mo53550x(int i, int i2) {
        mo53548v((i << 3) | i2);
    }
}
