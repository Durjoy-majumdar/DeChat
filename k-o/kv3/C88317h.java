package kv3;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.zip.ZipException;

/* renamed from: kv3.h */
public class C88317h extends FilterOutputStream {

    /* renamed from: o */
    public static final byte[] f255302o = new byte[0];

    /* renamed from: d */
    public final HashSet<String> f255303d = new HashSet<>();

    /* renamed from: e */
    public byte[] f255304e = f255302o;

    /* renamed from: f */
    public int f255305f = 8;

    /* renamed from: g */
    public ByteArrayOutputStream f255306g = new ByteArrayOutputStream();

    /* renamed from: h */
    public C88314f f255307h;

    /* renamed from: i */
    public long f255308i = 0;

    /* renamed from: j */
    public byte[] f255309j;

    /* renamed from: n */
    public byte[] f255310n;

    public C88317h(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: d */
    public static int m110089d(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        return i;
    }

    /* renamed from: e */
    public static long m110090e(OutputStream outputStream, long j) {
        outputStream.write((int) (255 & j));
        outputStream.write(((int) (j >> 8)) & 255);
        outputStream.write(((int) (j >> 16)) & 255);
        outputStream.write(((int) (j >> 24)) & 255);
        return j;
    }

    /* renamed from: a */
    public final void mo122703a(String str, byte[] bArr) {
        if (bArr.length > 65535) {
            throw new IllegalArgumentException(str + " too long in UTF-8:" + bArr.length + " bytes");
        }
    }

    /* renamed from: b */
    public void mo122704b() {
        if (this.f255306g != null) {
            C88314f fVar = this.f255307h;
            if (fVar != null) {
                long j = 30;
                if (fVar.f255288i != 0) {
                    j = 46;
                    m110090e(this.out, 134695760);
                    m110090e(this.out, this.f255307h.f255285f);
                    m110090e(this.out, this.f255307h.f255286g);
                    m110090e(this.out, this.f255307h.f255287h);
                }
                int i = this.f255307h.f255288i == 0 ? 0 : 8;
                m110090e(this.f255306g, 33639248);
                m110089d(this.f255306g, 20);
                m110089d(this.f255306g, 20);
                m110089d(this.f255306g, i | 2048);
                m110089d(this.f255306g, this.f255307h.f255288i);
                m110089d(this.f255306g, this.f255307h.f255289j);
                m110089d(this.f255306g, this.f255307h.f255290n);
                m110090e(this.f255306g, this.f255307h.f255285f);
                C88314f fVar2 = this.f255307h;
                long j2 = j + (fVar2.f255288i == 8 ? fVar2.f255286g : fVar2.f255287h);
                m110090e(this.f255306g, fVar2.f255286g);
                m110090e(this.f255306g, this.f255307h.f255287h);
                ByteArrayOutputStream byteArrayOutputStream = this.f255306g;
                int length = this.f255309j.length;
                m110089d(byteArrayOutputStream, length);
                long j3 = j2 + ((long) length);
                byte[] bArr = this.f255307h.f255291o;
                if (bArr != null) {
                    ByteArrayOutputStream byteArrayOutputStream2 = this.f255306g;
                    int length2 = bArr.length;
                    m110089d(byteArrayOutputStream2, length2);
                    j3 += (long) length2;
                } else {
                    m110089d(this.f255306g, 0);
                }
                m110089d(this.f255306g, this.f255310n.length);
                m110089d(this.f255306g, 0);
                m110089d(this.f255306g, 0);
                m110090e(this.f255306g, 0);
                m110090e(this.f255306g, this.f255307h.f255292p);
                this.f255306g.write(this.f255309j);
                this.f255309j = null;
                byte[] bArr2 = this.f255307h.f255291o;
                if (bArr2 != null) {
                    this.f255306g.write(bArr2);
                }
                this.f255308i += j3;
                byte[] bArr3 = this.f255310n;
                if (bArr3.length > 0) {
                    this.f255306g.write(bArr3);
                    this.f255310n = f255302o;
                }
                this.f255307h = null;
                return;
            }
            return;
        }
        throw new IOException("Stream is closed");
    }

    /* renamed from: c */
    public void mo122705c(C88314f fVar) {
        if (this.f255307h != null) {
            mo122704b();
        }
        int i = fVar.f255288i;
        if (i == -1) {
            i = this.f255305f;
        }
        if (i == 0) {
            long j = fVar.f255286g;
            if (j == -1) {
                fVar.f255286g = fVar.f255287h;
            } else if (fVar.f255287h == -1) {
                fVar.mo122690b(j);
            }
            if (fVar.f255285f != -1) {
                long j2 = fVar.f255287h;
                if (j2 == -1) {
                    throw new ZipException("STORED entry missing size");
                } else if (j2 != fVar.f255286g) {
                    throw new ZipException("STORED entry size/compressed size mismatch");
                }
            } else {
                throw new ZipException("STORED entry missing CRC");
            }
        }
        if (this.f255306g != null) {
            fVar.f255284e = null;
            fVar.f255291o = null;
            fVar.f255289j = 40691;
            fVar.f255290n = 18698;
            String str = fVar.f255283d;
            Charset charset = C88312d.f255281a;
            byte[] bytes = str.getBytes(charset);
            this.f255309j = bytes;
            mo122703a("Name", bytes);
            this.f255310n = f255302o;
            String str2 = fVar.f255284e;
            if (str2 != null) {
                byte[] bytes2 = str2.getBytes(charset);
                this.f255310n = bytes2;
                mo122703a("Comment", bytes2);
            }
            fVar.mo122689a(i);
            this.f255307h = fVar;
            fVar.f255292p = this.f255308i;
            this.f255303d.add(fVar.f255283d);
            int i2 = i == 0 ? 0 : 8;
            m110090e(this.out, 67324752);
            m110089d(this.out, 20);
            m110089d(this.out, i2 | 2048);
            m110089d(this.out, i);
            m110089d(this.out, this.f255307h.f255289j);
            m110089d(this.out, this.f255307h.f255290n);
            if (i == 0) {
                m110090e(this.out, this.f255307h.f255285f);
                m110090e(this.out, this.f255307h.f255287h);
                m110090e(this.out, this.f255307h.f255287h);
            } else {
                m110090e(this.out, 0);
                m110090e(this.out, 0);
                m110090e(this.out, 0);
            }
            m110089d(this.out, this.f255309j.length);
            byte[] bArr = this.f255307h.f255291o;
            if (bArr != null) {
                m110089d(this.out, bArr.length);
            } else {
                m110089d(this.out, 0);
            }
            this.out.write(this.f255309j);
            byte[] bArr2 = this.f255307h.f255291o;
            if (bArr2 != null) {
                this.out.write(bArr2);
                return;
            }
            return;
        }
        throw new IOException("Stream is closed");
    }

    public void close() {
        OutputStream outputStream = this.out;
        if (outputStream == null) {
            return;
        }
        if (outputStream != null) {
            if (this.f255306g != null) {
                if (!this.f255303d.isEmpty()) {
                    if (this.f255307h != null) {
                        mo122704b();
                    }
                    int size = this.f255306g.size();
                    m110090e(this.f255306g, 101010256);
                    m110089d(this.f255306g, 0);
                    m110089d(this.f255306g, 0);
                    m110089d(this.f255306g, this.f255303d.size());
                    m110089d(this.f255306g, this.f255303d.size());
                    m110090e(this.f255306g, (long) size);
                    m110090e(this.f255306g, this.f255308i);
                    m110089d(this.f255306g, this.f255304e.length);
                    byte[] bArr = this.f255304e;
                    if (bArr.length > 0) {
                        this.f255306g.write(bArr);
                    }
                    this.f255306g.writeTo(this.out);
                    this.f255306g = null;
                } else {
                    throw new ZipException("No entries");
                }
            }
            this.out.close();
            this.out = null;
            return;
        }
        throw new IOException("Stream is closed");
    }

    public void write(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if ((i | i2) < 0 || i > length || length - i < i2) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        C88314f fVar = this.f255307h;
        if (fVar == null) {
            throw new ZipException("No active entry");
        } else if (fVar.f255288i == 0) {
            this.out.write(bArr, i, i2);
        } else {
            this.out.write(bArr, i, i2);
        }
    }
}
