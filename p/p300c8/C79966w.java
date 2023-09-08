package p300c8;

import android.net.Uri;

/* renamed from: c8.w */
public final class C79966w implements C79946g {

    /* renamed from: a */
    public final C79946g f234237a;

    /* renamed from: b */
    public final C79944f f234238b;

    public C79966w(C79946g gVar, C79944f fVar) {
        gVar.getClass();
        this.f234237a = gVar;
        fVar.getClass();
        this.f234238b = fVar;
    }

    /* renamed from: b */
    public long mo110126b(C79950j jVar) {
        long b = this.f234237a.mo110126b(jVar);
        if (jVar.f234185e == -1 && b != -1) {
            jVar = new C79950j(jVar.f234181a, jVar.f234183c, jVar.f234184d, b, jVar.f234186f, jVar.f234187g);
        }
        this.f234238b.mo110131b(jVar);
        return b;
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        int c = this.f234237a.mo110127c(bArr, i, i2);
        if (c > 0) {
            this.f234238b.mo110130a(bArr, i, c);
        }
        return c;
    }

    public void close() {
        try {
            this.f234237a.close();
        } finally {
            this.f234238b.close();
        }
    }

    public Uri getUri() {
        return this.f234237a.getUri();
    }
}
