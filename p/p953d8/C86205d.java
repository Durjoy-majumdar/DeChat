package p953d8;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import p300c8.C79944f;
import p300c8.C79946g;
import p300c8.C79948h;
import p300c8.C79950j;
import p300c8.C79966w;
import p953d8.C86199a;

/* renamed from: d8.d */
public final class C86205d implements C79946g {

    /* renamed from: a */
    public final C86199a f250728a;

    /* renamed from: b */
    public final C79946g f250729b;

    /* renamed from: c */
    public final C79946g f250730c;

    /* renamed from: d */
    public final C79946g f250731d;

    /* renamed from: e */
    public final C86206a f250732e;

    /* renamed from: f */
    public final boolean f250733f;

    /* renamed from: g */
    public final boolean f250734g;

    /* renamed from: h */
    public final boolean f250735h;

    /* renamed from: i */
    public C79946g f250736i;

    /* renamed from: j */
    public boolean f250737j;

    /* renamed from: k */
    public Uri f250738k;

    /* renamed from: l */
    public int f250739l;

    /* renamed from: m */
    public String f250740m;

    /* renamed from: n */
    public long f250741n;

    /* renamed from: o */
    public long f250742o;

    /* renamed from: p */
    public C86209g f250743p;

    /* renamed from: q */
    public boolean f250744q;

    /* renamed from: r */
    public boolean f250745r;

    /* renamed from: s */
    public long f250746s;

    /* renamed from: d8.d$a */
    public interface C86206a {
    }

    public C86205d(C86199a aVar, C79946g gVar, C79946g gVar2, C79944f fVar, int i, C86206a aVar2) {
        this.f250728a = aVar;
        this.f250729b = gVar2;
        boolean z = false;
        this.f250733f = (i & 1) != 0;
        this.f250734g = (i & 2) != 0;
        this.f250735h = (i & 4) != 0 ? true : z;
        this.f250731d = gVar;
        if (fVar != null) {
            this.f250730c = new C79966w(gVar, fVar);
        } else {
            this.f250730c = null;
        }
        this.f250732e = aVar2;
    }

    /* renamed from: a */
    public final void mo120628a() {
        C79946g gVar = this.f250736i;
        if (gVar != null) {
            try {
                gVar.close();
                this.f250736i = null;
                this.f250737j = false;
            } finally {
                C86209g gVar2 = this.f250743p;
                if (gVar2 != null) {
                    this.f250728a.mo120617J(gVar2);
                    this.f250743p = null;
                }
            }
        }
    }

    /* renamed from: b */
    public long mo110126b(C79950j jVar) {
        try {
            Uri uri = jVar.f234181a;
            this.f250738k = uri;
            this.f250739l = jVar.f234187g;
            String str = jVar.f234186f;
            if (str == null) {
                str = uri.toString();
            }
            this.f250740m = str;
            this.f250741n = jVar.f234184d;
            boolean z = (this.f250734g && this.f250744q) || (jVar.f234185e == -1 && this.f250735h);
            this.f250745r = z;
            long j = jVar.f234185e;
            if (j == -1) {
                if (!z) {
                    long E = this.f250728a.mo120612E(str);
                    this.f250742o = E;
                    if (E != -1) {
                        long j2 = E - jVar.f234184d;
                        this.f250742o = j2;
                        if (j2 <= 0) {
                            throw new C79948h(0);
                        }
                    }
                    mo120629d(true);
                    return this.f250742o;
                }
            }
            this.f250742o = j;
            mo120629d(true);
            return this.f250742o;
        } catch (IOException e) {
            if (this.f250736i == this.f250729b || (e instanceof C86199a.C86200a)) {
                this.f250744q = true;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f250742o == 0) {
            return -1;
        }
        try {
            int c = this.f250736i.mo110127c(bArr, i, i2);
            if (c >= 0) {
                if (this.f250736i == this.f250729b) {
                    this.f250746s += (long) c;
                }
                long j = (long) c;
                this.f250741n += j;
                long j2 = this.f250742o;
                if (j2 != -1) {
                    this.f250742o = j2 - j;
                }
            } else {
                if (this.f250737j) {
                    long j3 = this.f250741n;
                    if (this.f250736i == this.f250730c) {
                        this.f250728a.mo120619L(this.f250740m, j3);
                    }
                    this.f250742o = 0;
                }
                mo120628a();
                long j4 = this.f250742o;
                if ((j4 > 0 || j4 == -1) && mo120629d(false)) {
                    return mo110127c(bArr, i, i2);
                }
            }
            return c;
        } catch (IOException e) {
            if (this.f250736i == this.f250729b || (e instanceof C86199a.C86200a)) {
                this.f250744q = true;
            }
            throw e;
        }
    }

    public void close() {
        this.f250738k = null;
        if (this.f250732e != null && this.f250746s > 0) {
            Log.m105919d("MicroMsg.SameLayer.ExoVideoCacheHandler", "onCachedBytesRead, cacheSpace:%s, totalCachedBytesRead:%s", Long.valueOf(this.f250728a.mo120615H()), Long.valueOf(this.f250746s));
            this.f250746s = 0;
        }
        try {
            mo120628a();
        } catch (IOException e) {
            if (this.f250736i == this.f250729b || (e instanceof C86199a.C86200a)) {
                this.f250744q = true;
            }
            throw e;
        }
    }

    /* renamed from: d */
    public final boolean mo120629d(boolean z) {
        C86209g gVar;
        C79950j jVar;
        IOException iOException = null;
        if (this.f250745r) {
            gVar = null;
        } else if (this.f250733f) {
            try {
                gVar = this.f250728a.mo120618K(this.f250740m, this.f250741n);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            gVar = this.f250728a.mo120620M(this.f250740m, this.f250741n);
        }
        boolean z2 = true;
        if (gVar == null) {
            this.f250736i = this.f250731d;
            jVar = new C79950j(this.f250738k, this.f250741n, this.f250742o, this.f250740m, this.f250739l);
        } else if (gVar.f250756g) {
            Uri fromFile = Uri.fromFile(gVar.f250757h);
            long j = this.f250741n - gVar.f250754e;
            long j2 = gVar.f250755f - j;
            long j3 = this.f250742o;
            if (j3 != -1) {
                j2 = Math.min(j2, j3);
            }
            C79950j jVar2 = new C79950j(fromFile, this.f250741n, j, j2, this.f250740m, this.f250739l);
            this.f250736i = this.f250729b;
            jVar = jVar2;
        } else {
            long j4 = gVar.f250755f;
            if (j4 == -1) {
                j4 = this.f250742o;
            } else {
                long j5 = this.f250742o;
                if (j5 != -1) {
                    j4 = Math.min(j4, j5);
                }
            }
            jVar = new C79950j(this.f250738k, this.f250741n, j4, this.f250740m, this.f250739l);
            C79946g gVar2 = this.f250730c;
            if (gVar2 != null) {
                this.f250736i = gVar2;
                this.f250743p = gVar;
            } else {
                this.f250736i = this.f250731d;
                this.f250728a.mo120617J(gVar);
            }
        }
        this.f250737j = jVar.f234185e == -1;
        long j6 = 0;
        try {
            j6 = this.f250736i.mo110126b(jVar);
        } catch (IOException e) {
            if (!z && this.f250737j) {
                Throwable th = e;
                while (true) {
                    if (th != null) {
                        if ((th instanceof C79948h) && ((C79948h) th).f234174d == 0) {
                            break;
                        }
                        th = th.getCause();
                    } else {
                        break;
                    }
                }
            }
            iOException = e;
            if (iOException == null) {
                z2 = false;
            } else {
                throw iOException;
            }
        }
        if (this.f250737j && j6 != -1) {
            this.f250742o = j6;
            long j7 = jVar.f234184d + j6;
            if (this.f250736i == this.f250730c) {
                this.f250728a.mo120619L(this.f250740m, j7);
            }
        }
        return z2;
    }

    public Uri getUri() {
        C79946g gVar = this.f250736i;
        return gVar == this.f250731d ? gVar.getUri() : this.f250738k;
    }
}
