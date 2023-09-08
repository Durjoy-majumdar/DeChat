package kv3;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.zip.ZipException;

/* renamed from: kv3.f */
public class C88314f implements Cloneable {

    /* renamed from: d */
    public String f255283d;

    /* renamed from: e */
    public String f255284e;

    /* renamed from: f */
    public long f255285f = -1;

    /* renamed from: g */
    public long f255286g = -1;

    /* renamed from: h */
    public long f255287h = -1;

    /* renamed from: i */
    public int f255288i = -1;

    /* renamed from: j */
    public int f255289j = -1;

    /* renamed from: n */
    public int f255290n = -1;

    /* renamed from: o */
    public byte[] f255291o;

    /* renamed from: p */
    public long f255292p = -1;

    /* renamed from: q */
    public long f255293q = -1;

    public C88314f(C88314f fVar) {
        this.f255283d = fVar.f255283d;
        this.f255284e = fVar.f255284e;
        this.f255289j = fVar.f255289j;
        this.f255287h = fVar.f255287h;
        this.f255286g = fVar.f255286g;
        this.f255285f = fVar.f255285f;
        this.f255288i = fVar.f255288i;
        this.f255290n = fVar.f255290n;
        this.f255291o = fVar.f255291o;
        this.f255292p = fVar.f255292p;
        this.f255293q = fVar.f255293q;
    }

    /* renamed from: a */
    public void mo122689a(int i) {
        if (i == 0 || i == 8) {
            this.f255288i = i;
            return;
        }
        throw new IllegalArgumentException("Bad method: " + i);
    }

    /* renamed from: b */
    public void mo122690b(long j) {
        if (j >= 0) {
            this.f255287h = j;
            return;
        }
        throw new IllegalArgumentException("Bad size: " + j);
    }

    public Object clone() {
        try {
            C88314f fVar = (C88314f) super.clone();
            byte[] bArr = this.f255291o;
            fVar.f255291o = bArr != null ? (byte[]) bArr.clone() : null;
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C88314f)) {
            return false;
        }
        return this.f255283d.equals(((C88314f) obj).f255283d);
    }

    public int hashCode() {
        return this.f255283d.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("name:" + this.f255283d);
        stringBuffer.append("\ncomment:" + this.f255284e);
        stringBuffer.append("\ntime:" + this.f255289j);
        stringBuffer.append("\nsize:" + this.f255287h);
        stringBuffer.append("\ncompressedSize:" + this.f255286g);
        stringBuffer.append("\ncrc:" + this.f255285f);
        stringBuffer.append("\ncompressionMethod:" + this.f255288i);
        stringBuffer.append("\nmodDate:" + this.f255290n);
        stringBuffer.append("\nextra length:" + this.f255291o.length);
        stringBuffer.append("\nlocalHeaderRelOffset:" + this.f255292p);
        stringBuffer.append("\ndataOffset:" + this.f255293q);
        return stringBuffer.toString();
    }

    public C88314f(byte[] bArr, InputStream inputStream, Charset charset, boolean z) {
        boolean z2;
        C88313e.m110082a(inputStream, bArr, 0, bArr.length);
        C88311c cVar = new C88311c(bArr, 0, bArr.length, ByteOrder.LITTLE_ENDIAN);
        int a = cVar.mo122687a();
        if (((long) a) == 33639248) {
            cVar.f255280d = 8;
            short b = cVar.mo122688b() & 65535;
            if ((b & 1) == 0) {
                charset = (b & 2048) != 0 ? Charset.forName("UTF-8") : charset;
                this.f255288i = cVar.mo122688b() & 65535;
                this.f255289j = cVar.mo122688b() & 65535;
                this.f255290n = cVar.mo122688b() & 65535;
                this.f255285f = ((long) cVar.mo122687a()) & Util.MAX_32BIT_VALUE;
                this.f255286g = ((long) cVar.mo122687a()) & Util.MAX_32BIT_VALUE;
                this.f255287h = ((long) cVar.mo122687a()) & Util.MAX_32BIT_VALUE;
                int b2 = cVar.mo122688b() & 65535;
                int b3 = cVar.mo122688b() & 65535;
                int b4 = 65535 & cVar.mo122688b();
                cVar.f255280d = 42;
                this.f255292p = ((long) cVar.mo122687a()) & Util.MAX_32BIT_VALUE;
                byte[] bArr2 = new byte[b2];
                C88313e.m110082a(inputStream, bArr2, 0, b2);
                int i = 0;
                while (true) {
                    if (i >= b2) {
                        z2 = false;
                        break;
                    } else if (bArr2[i] == 0) {
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z2) {
                    this.f255283d = new String(bArr2, 0, b2, charset);
                    if (b3 > 0) {
                        byte[] bArr3 = new byte[b3];
                        this.f255291o = bArr3;
                        C88313e.m110082a(inputStream, bArr3, 0, b3);
                    }
                    if (b4 > 0) {
                        byte[] bArr4 = new byte[b4];
                        C88313e.m110082a(inputStream, bArr4, 0, b4);
                        this.f255284e = new String(bArr4, 0, b4, charset);
                        return;
                    }
                    return;
                }
                throw new ZipException("Filename contains NUL byte: " + Arrays.toString(bArr2));
            }
            throw new ZipException("Invalid General Purpose Bit Flag: " + b);
        }
        C88315g.m110085d("unknown", (long) inputStream.available(), "unknown", 0, "Central Directory Entry", a);
        throw null;
    }
}
