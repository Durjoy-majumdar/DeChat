package j24;

import androidx.exifinterface.media.ExifInterface;
import e24.C20509c;
import j24.C21158d;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o24.C21766h;
import o24.C21767i;
import o24.C21769k;

/* renamed from: j24.r */
public final class C21188r implements Closeable {

    /* renamed from: j */
    public static final Logger f59947j = Logger.getLogger(C21161e.class.getName());

    /* renamed from: d */
    public final C21767i f59948d;

    /* renamed from: e */
    public final boolean f59949e;

    /* renamed from: f */
    public final C21766h f59950f;

    /* renamed from: g */
    public int f59951g = 16384;

    /* renamed from: h */
    public boolean f59952h;

    /* renamed from: i */
    public final C21158d.C21160b f59953i;

    public C21188r(C21767i iVar, boolean z) {
        this.f59948d = iVar;
        this.f59949e = z;
        C21766h hVar = new C21766h();
        this.f59950f = hVar;
        this.f59953i = new C21158d.C21160b(hVar);
    }

    /* renamed from: a */
    public synchronized void mo33153a(C21193u uVar) {
        if (!this.f59952h) {
            int i = this.f59951g;
            int i2 = uVar.f59962a;
            if ((i2 & 32) != 0) {
                i = uVar.f59963b[5];
            }
            this.f59951g = i;
            if (((i2 & 2) != 0 ? uVar.f59963b[1] : -1) != -1) {
                C21158d.C21160b bVar = this.f59953i;
                int i3 = (i2 & 2) != 0 ? uVar.f59963b[1] : -1;
                bVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = bVar.f59832d;
                if (i4 != min) {
                    if (min < i4) {
                        bVar.f59830b = Math.min(bVar.f59830b, min);
                    }
                    bVar.f59831c = true;
                    bVar.f59832d = min;
                    int i5 = bVar.f59836h;
                    if (min < i5) {
                        if (min == 0) {
                            Arrays.fill(bVar.f59833e, (Object) null);
                            bVar.f59834f = bVar.f59833e.length - 1;
                            bVar.f59835g = 0;
                            bVar.f59836h = 0;
                        } else {
                            bVar.mo33118a(i5 - min);
                        }
                    }
                }
            }
            mo33155c(0, 0, (byte) 4, (byte) 1);
            this.f59948d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public synchronized void mo33154b(boolean z, int i, C21766h hVar, int i2) {
        if (!this.f59952h) {
            mo33155c(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.f59948d.mo32354x(hVar, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public void mo33155c(int i, int i2, byte b, byte b2) {
        Logger logger = f59947j;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C21161e.m23585a(false, i, i2, b, b2));
        }
        int i3 = this.f59951g;
        if (i2 > i3) {
            Object[] objArr = {Integer.valueOf(i3), Integer.valueOf(i2)};
            C21769k kVar = C21161e.f59837a;
            throw new IllegalArgumentException(C20509c.m22204j("FRAME_SIZE_ERROR length > %d: %d", objArr));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            C21767i iVar = this.f59948d;
            iVar.mo34146o((i2 >>> 16) & 255);
            iVar.mo34146o((i2 >>> 8) & 255);
            iVar.mo34146o(i2 & 255);
            this.f59948d.mo34146o(b & ExifInterface.MARKER);
            this.f59948d.mo34146o(b2 & ExifInterface.MARKER);
            this.f59948d.mo34150r0(i & Integer.MAX_VALUE);
        } else {
            Object[] objArr2 = {Integer.valueOf(i)};
            C21769k kVar2 = C21161e.f59837a;
            throw new IllegalArgumentException(C20509c.m22204j("reserved bit set: %s", objArr2));
        }
    }

    public synchronized void close() {
        this.f59952h = true;
        this.f59948d.close();
    }

    /* renamed from: d */
    public synchronized void mo33157d(int i, C21156b bVar, byte[] bArr) {
        if (this.f59952h) {
            throw new IOException("closed");
        } else if (bVar.f59809d != -1) {
            mo33155c(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f59948d.mo34150r0(i);
            this.f59948d.mo34150r0(bVar.f59809d);
            if (bArr.length > 0) {
                this.f59948d.write(bArr);
            }
            this.f59948d.flush();
        } else {
            C21769k kVar = C21161e.f59837a;
            throw new IllegalArgumentException(C20509c.m22204j("errorCode.httpCode == -1", new Object[0]));
        }
    }

    /* renamed from: e */
    public void mo33158e(boolean z, int i, List<C21157c> list) {
        if (!this.f59952h) {
            this.f59953i.mo33121d(list);
            long j = this.f59950f.f61695e;
            int min = (int) Math.min((long) this.f59951g, j);
            long j2 = (long) min;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            byte b = i2 == 0 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            mo33155c(i, min, (byte) 1, b);
            this.f59948d.mo32354x(this.f59950f, j2);
            if (i2 > 0) {
                mo33162k(i, j - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: g */
    public synchronized void mo33159g(boolean z, int i, int i2) {
        if (!this.f59952h) {
            mo33155c(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f59948d.mo34150r0(i);
            this.f59948d.mo34150r0(i2);
            this.f59948d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: i */
    public synchronized void mo33160i(int i, C21156b bVar) {
        if (this.f59952h) {
            throw new IOException("closed");
        } else if (bVar.f59809d != -1) {
            mo33155c(i, 4, (byte) 3, (byte) 0);
            this.f59948d.mo34150r0(bVar.f59809d);
            this.f59948d.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: j */
    public synchronized void mo33161j(int i, long j) {
        if (this.f59952h) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            Object[] objArr = {Long.valueOf(j)};
            C21769k kVar = C21161e.f59837a;
            throw new IllegalArgumentException(C20509c.m22204j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
        } else {
            mo33155c(i, 4, (byte) 8, (byte) 0);
            this.f59948d.mo34150r0((int) j);
            this.f59948d.flush();
        }
    }

    /* renamed from: k */
    public final void mo33162k(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f59951g, j);
            long j2 = (long) min;
            j -= j2;
            mo33155c(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.f59948d.mo32354x(this.f59950f, j2);
        }
    }
}
