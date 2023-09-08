package p333e8;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.nio.charset.Charset;
import p984j7.C87901b;

/* renamed from: e8.m */
public final class C20541m {

    /* renamed from: a */
    public byte[] f57809a;

    /* renamed from: b */
    public int f57810b;

    /* renamed from: c */
    public int f57811c;

    public C20541m() {
    }

    public C20541m(int i) {
        this.f57809a = new byte[i];
        this.f57811c = i;
    }

    /* renamed from: a */
    public int mo32090a() {
        byte[] bArr = this.f57809a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: b */
    public void mo32091b(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f57809a, this.f57810b, bArr, i, i2);
        this.f57810b += i2;
    }

    /* renamed from: c */
    public int mo32092c() {
        byte[] bArr = this.f57809a;
        int i = this.f57810b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & ExifInterface.MARKER) << 8);
        this.f57810b = i4 + 1;
        return (bArr[i4] & ExifInterface.MARKER) | b2;
    }

    /* renamed from: d */
    public String mo32093d() {
        int i = this.f57811c;
        int i2 = this.f57810b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f57811c) {
            byte b = this.f57809a[i2];
            int i3 = C20551y.f57835a;
            if (b == 10 || b == 13) {
                break;
            }
            i2++;
        }
        int i4 = this.f57810b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.f57809a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f57810b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f57809a;
        int i5 = this.f57810b;
        String str = new String(bArr2, i5, i2 - i5);
        this.f57810b = i2;
        int i6 = this.f57811c;
        if (i2 == i6) {
            return str;
        }
        byte[] bArr3 = this.f57809a;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.f57810b = i7;
            if (i7 == i6) {
                return str;
            }
        }
        int i8 = this.f57810b;
        if (bArr3[i8] == 10) {
            this.f57810b = i8 + 1;
        }
        return str;
    }

    /* renamed from: e */
    public int mo32094e() {
        byte[] bArr = this.f57809a;
        int i = this.f57810b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (bArr[i] & ExifInterface.MARKER) | ((bArr[i2] & ExifInterface.MARKER) << 8);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
        this.f57810b = i4 + 1;
        return ((bArr[i4] & ExifInterface.MARKER) << 24) | b2;
    }

    /* renamed from: f */
    public long mo32095f() {
        byte[] bArr = this.f57809a;
        int i = this.f57810b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f57810b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: g */
    public int mo32096g() {
        int e = mo32094e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException("Top bit not zero: " + e);
    }

    /* renamed from: h */
    public int mo32097h() {
        byte[] bArr = this.f57809a;
        int i = this.f57810b;
        int i2 = i + 1;
        byte b = bArr[i] & ExifInterface.MARKER;
        this.f57810b = i2 + 1;
        return ((bArr[i2] & ExifInterface.MARKER) << 8) | b;
    }

    /* renamed from: i */
    public long mo32098i() {
        byte[] bArr = this.f57809a;
        int i = this.f57810b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f57810b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: j */
    public String mo32099j() {
        int i = this.f57811c;
        int i2 = this.f57810b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f57811c && this.f57809a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f57809a;
        int i3 = this.f57810b;
        String str = new String(bArr, i3, i2 - i3);
        this.f57810b = i2;
        if (i2 < this.f57811c) {
            this.f57810b = i2 + 1;
        }
        return str;
    }

    /* renamed from: k */
    public String mo32100k(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f57810b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f57809a, i2, (i3 >= this.f57811c || this.f57809a[i3] != 0) ? i : i - 1);
        this.f57810b += i;
        return str;
    }

    /* renamed from: l */
    public String mo32101l(int i) {
        String str = new String(this.f57809a, this.f57810b, i, Charset.forName("UTF-8"));
        this.f57810b += i;
        return str;
    }

    /* renamed from: m */
    public int mo32102m() {
        return (mo32103n() << 21) | (mo32103n() << 14) | (mo32103n() << 7) | mo32103n();
    }

    /* renamed from: n */
    public int mo32103n() {
        byte[] bArr = this.f57809a;
        int i = this.f57810b;
        this.f57810b = i + 1;
        return bArr[i] & ExifInterface.MARKER;
    }

    /* renamed from: o */
    public long mo32104o() {
        byte[] bArr = this.f57809a;
        int i = this.f57810b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f57810b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: p */
    public int mo32105p() {
        byte[] bArr = this.f57809a;
        int i = this.f57810b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[i2] & ExifInterface.MARKER) << 8);
        this.f57810b = i3 + 1;
        return (bArr[i3] & ExifInterface.MARKER) | b;
    }

    /* renamed from: q */
    public int mo32106q() {
        int c = mo32092c();
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException("Top bit not zero: " + c);
    }

    /* renamed from: r */
    public long mo32107r() {
        long i = mo32098i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    /* renamed from: s */
    public int mo32108s() {
        byte[] bArr = this.f57809a;
        int i = this.f57810b;
        int i2 = i + 1;
        this.f57810b = i2 + 1;
        return (bArr[i2] & ExifInterface.MARKER) | ((bArr[i] & ExifInterface.MARKER) << 8);
    }

    /* renamed from: t */
    public void mo32109t() {
        this.f57810b = 0;
        this.f57811c = 0;
    }

    /* renamed from: u */
    public void mo32110u(int i) {
        mo32111v(mo32090a() < i ? new byte[i] : this.f57809a, i);
    }

    /* renamed from: v */
    public void mo32111v(byte[] bArr, int i) {
        this.f57809a = bArr;
        this.f57811c = i;
        this.f57810b = 0;
    }

    /* renamed from: w */
    public void mo32112w(int i) {
        C20528a.m22237a(i >= 0 && i <= this.f57809a.length);
        this.f57811c = i;
    }

    /* renamed from: x */
    public void mo32113x(int i) {
        boolean z = true;
        if (i < 0 || i > this.f57811c) {
            C87901b.m109401b("ExoPlayer", "position%d, limit:%d", Integer.valueOf(i), Integer.valueOf(this.f57811c));
        }
        if (i < 0 || i > this.f57811c) {
            z = false;
        }
        C20528a.m22237a(z);
        this.f57810b = i;
    }

    /* renamed from: y */
    public void mo32114y(int i) {
        mo32113x(this.f57810b + i);
    }

    public C20541m(byte[] bArr) {
        this.f57809a = bArr;
        this.f57811c = bArr.length;
    }

    public C20541m(byte[] bArr, int i) {
        this.f57809a = bArr;
        this.f57811c = i;
    }
}
