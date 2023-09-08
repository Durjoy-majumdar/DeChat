package p370p7;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import p294b7.C16744h;
import p300c8.C16870b;
import p300c8.C79946g;
import p333e8.C20528a;
import p370p7.C21933j;
import p370p7.C21949o;
import p396x6.C22998f;

/* renamed from: p7.l */
public final class C21941l implements C21949o, C21933j.C21938e {

    /* renamed from: d */
    public final Uri f62104d;

    /* renamed from: e */
    public final C79946g.C79947a f62105e;

    /* renamed from: f */
    public final C16744h f62106f;

    /* renamed from: g */
    public final Handler f62107g;

    /* renamed from: h */
    public final C21942a f62108h;

    /* renamed from: i */
    public final String f62109i;

    /* renamed from: j */
    public C21949o.C21950a f62110j;

    /* renamed from: n */
    public long f62111n;

    /* renamed from: o */
    public boolean f62112o;

    /* renamed from: p7.l$a */
    public interface C21942a {
        void onLoadError(IOException iOException);
    }

    public C21941l(Uri uri, C79946g.C79947a aVar, C16744h hVar, Handler handler, C21942a aVar2) {
        this(uri, aVar, hVar, handler, aVar2, (String) null);
    }

    /* renamed from: a */
    public void mo34999a(C21947n nVar) {
        C21933j jVar = (C21933j) nVar;
        boolean c = jVar.f62074p.mo17936c(jVar);
        if (jVar.f62050A && !c) {
            for (C21954q h : jVar.f62082x) {
                h.mo35029h();
            }
        }
        jVar.f62079u.removeCallbacksAndMessages((Object) null);
        jVar.f62064P = true;
    }

    /* renamed from: b */
    public void mo35000b() {
    }

    /* renamed from: c */
    public final void mo35015c(long j, boolean z) {
        this.f62111n = j;
        this.f62112o = z;
        C21949o.C21950a aVar = this.f62110j;
        long j2 = this.f62111n;
        C21960t tVar = r2;
        C21960t tVar2 = new C21960t(-9223372036854775807L, -9223372036854775807L, j2, j2, 0, 0, this.f62112o, false);
        aVar.mo35001c(tVar, (Object) null);
    }

    /* renamed from: d */
    public C21947n mo35002d(C21949o.C21951b bVar, C16870b bVar2) {
        C20528a.m22237a(bVar.f62123a == 0);
        return new C21933j(this.f62104d, this.f62105e.createDataSource(), this.f62106f.mo17740a(), -1, this.f62107g, this.f62108h, this, bVar2, this.f62109i, 1048576);
    }

    /* renamed from: e */
    public void mo35003e(C22998f fVar, boolean z, C21949o.C21950a aVar) {
        this.f62110j = aVar;
        mo35015c(-9223372036854775807L, false);
    }

    /* renamed from: f */
    public void mo35004f() {
        this.f62110j = null;
    }

    /* renamed from: g */
    public void mo35016g(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f62111n;
        }
        long j2 = this.f62111n;
        if (j2 != j || this.f62112o != z) {
            if (j2 == -9223372036854775807L || j != -9223372036854775807L) {
                mo35015c(j, z);
            }
        }
    }

    public C21941l(Uri uri, C79946g.C79947a aVar, C16744h hVar, Handler handler, C21942a aVar2, String str) {
        this.f62104d = uri;
        this.f62105e = aVar;
        this.f62106f = hVar;
        this.f62107g = handler;
        this.f62108h = aVar2;
        this.f62109i = str;
    }
}
