package p953d8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p300c8.C79944f;
import p300c8.C79950j;
import p333e8.C20551y;
import p333e8.C86465q;
import p953d8.C86199a;

/* renamed from: d8.b */
public final class C86202b implements C79944f {

    /* renamed from: a */
    public final C86199a f250716a;

    /* renamed from: b */
    public final long f250717b;

    /* renamed from: c */
    public final int f250718c;

    /* renamed from: d */
    public C79950j f250719d;

    /* renamed from: e */
    public File f250720e;

    /* renamed from: f */
    public OutputStream f250721f;

    /* renamed from: g */
    public FileOutputStream f250722g;

    /* renamed from: h */
    public long f250723h;

    /* renamed from: i */
    public long f250724i;

    /* renamed from: j */
    public C86465q f250725j;

    /* renamed from: d8.b$a */
    public static class C86203a extends C86199a.C86200a {
        public C86203a(IOException iOException) {
            super(iOException);
        }
    }

    public C86202b(C86199a aVar, long j, int i) {
        aVar.getClass();
        this.f250716a = aVar;
        this.f250717b = j;
        this.f250718c = i;
    }

    /* renamed from: a */
    public void mo110130a(byte[] bArr, int i, int i2) {
        if (this.f250719d != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f250723h == this.f250717b) {
                        mo120626c();
                        mo120627d();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f250717b - this.f250723h);
                    this.f250721f.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f250723h += j;
                    this.f250724i += j;
                } catch (IOException e) {
                    throw new C86203a(e);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo110131b(C79950j jVar) {
        if (jVar.f234185e == -1) {
            if (!((jVar.f234187g & 2) == 2)) {
                this.f250719d = null;
                return;
            }
        }
        this.f250719d = jVar;
        this.f250724i = 0;
        try {
            mo120627d();
        } catch (IOException e) {
            throw new C86203a(e);
        }
    }

    /* renamed from: c */
    public final void mo120626c() {
        OutputStream outputStream = this.f250721f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f250722g.getFD().sync();
                C20551y.m22315e(this.f250721f);
                this.f250721f = null;
                File file = this.f250720e;
                this.f250720e = null;
                this.f250716a.mo120621N(file);
            } catch (Throwable th) {
                C20551y.m22315e(this.f250721f);
                this.f250721f = null;
                File file2 = this.f250720e;
                this.f250720e = null;
                file2.delete();
                throw th;
            }
        }
    }

    public void close() {
        if (this.f250719d != null) {
            try {
                mo120626c();
            } catch (IOException e) {
                throw new C86203a(e);
            }
        }
    }

    /* renamed from: d */
    public final void mo120627d() {
        long j = this.f250719d.f234185e;
        long min = j == -1 ? this.f250717b : Math.min(j - this.f250724i, this.f250717b);
        C86199a aVar = this.f250716a;
        C79950j jVar = this.f250719d;
        this.f250720e = aVar.mo120614G(jVar.f234186f, this.f250724i + jVar.f234183c, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f250720e);
        this.f250722g = fileOutputStream;
        if (this.f250718c > 0) {
            C86465q qVar = this.f250725j;
            if (qVar == null) {
                this.f250725j = new C86465q(this.f250722g, this.f250718c);
            } else {
                qVar.mo120888a(fileOutputStream);
            }
            this.f250721f = this.f250725j;
        } else {
            this.f250721f = fileOutputStream;
        }
        this.f250723h = 0;
    }
}
