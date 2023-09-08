package p300c8;

import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import p333e8.C20528a;

/* renamed from: c8.i */
public final class C79949i extends InputStream {

    /* renamed from: d */
    public final C79946g f234175d;

    /* renamed from: e */
    public final C79950j f234176e;

    /* renamed from: f */
    public final byte[] f234177f;

    /* renamed from: g */
    public boolean f234178g = false;

    /* renamed from: h */
    public boolean f234179h = false;

    /* renamed from: i */
    public long f234180i;

    public C79949i(C79946g gVar, C79950j jVar) {
        this.f234175d = gVar;
        this.f234176e = jVar;
        this.f234177f = new byte[1];
    }

    public void close() {
        if (!this.f234179h) {
            this.f234175d.close();
            this.f234179h = true;
        }
    }

    public int read() {
        if (read(this.f234177f) == -1) {
            return -1;
        }
        return this.f234177f[0] & ExifInterface.MARKER;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        C20528a.m22240d(!this.f234179h);
        if (!this.f234178g) {
            this.f234175d.mo110126b(this.f234176e);
            this.f234178g = true;
        }
        int c = this.f234175d.mo110127c(bArr, i, i2);
        if (c == -1) {
            return -1;
        }
        this.f234180i += (long) c;
        return c;
    }
}
