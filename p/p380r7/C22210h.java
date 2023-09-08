package p380r7;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import p300c8.C16870b;
import p300c8.C16876u;
import p300c8.C79946g;
import p300c8.C79964v;
import p333e8.C20528a;
import p370p7.C21920c;
import p370p7.C21947n;
import p370p7.C21949o;
import p370p7.C21954q;
import p381s7.C118272d;
import p381s7.C22300a;
import p381s7.C22304c;
import p381s7.C22305e;
import p396x6.C22998f;
import p396x6.C23009i;

/* renamed from: r7.h */
public final class C22210h implements C21949o, C22305e.C22311f {

    /* renamed from: d */
    public final Uri f62906d;

    /* renamed from: e */
    public final C22206d f62907e;

    /* renamed from: f */
    public final int f62908f = 3;

    /* renamed from: g */
    public final C21920c.C21921a f62909g;

    /* renamed from: h */
    public final C79964v.C79965a<C22304c> f62910h;

    /* renamed from: i */
    public C22305e f62911i;

    /* renamed from: j */
    public C21949o.C21950a f62912j;

    static {
        HashSet<String> hashSet = C23009i.f66171a;
        synchronized (C23009i.class) {
            if (C23009i.f66171a.add("goog.exo.hls")) {
                C23009i.f66172b += ", " + "goog.exo.hls";
            }
        }
    }

    public C22210h(Uri uri, C79946g.C79947a aVar, Handler handler, C21920c cVar) {
        C22201b bVar = new C22201b(aVar);
        C118272d dVar = new C118272d();
        this.f62906d = uri;
        this.f62907e = bVar;
        this.f62910h = dVar;
        this.f62909g = new C21920c.C21921a(handler, cVar);
    }

    /* renamed from: a */
    public void mo34999a(C21947n nVar) {
        C22209g gVar = (C22209g) nVar;
        ((ArrayList) gVar.f62892d.f63248j).remove(gVar);
        gVar.f62899n.removeCallbacksAndMessages((Object) null);
        for (C22212j jVar : gVar.f62903r) {
            boolean c = jVar.f62930j.mo17936c(jVar);
            if (jVar.f62939v && !c) {
                for (C21954q h : jVar.f62936s) {
                    h.mo35029h();
                }
            }
            jVar.f62935r.removeCallbacksAndMessages((Object) null);
            jVar.f62942y = true;
        }
    }

    /* renamed from: b */
    public void mo35000b() {
        C22305e eVar = this.f62911i;
        eVar.f63249n.mo17935b();
        C22300a.C22301a aVar = eVar.f63252q;
        if (aVar != null) {
            C22305e.C22307b bVar = eVar.f63245g.get(aVar);
            bVar.f63256e.mo17935b();
            IOException iOException = bVar.f63264p;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: d */
    public C21947n mo35002d(C21949o.C21951b bVar, C16870b bVar2) {
        C20528a.m22237a(bVar.f62123a == 0);
        return new C22209g(this.f62911i, this.f62907e, this.f62908f, this.f62909g, bVar2);
    }

    /* renamed from: e */
    public void mo35003e(C22998f fVar, boolean z, C21949o.C21950a aVar) {
        C20528a.m22240d(this.f62911i == null);
        Uri uri = this.f62906d;
        C22206d dVar = this.f62907e;
        C21920c.C21921a aVar2 = this.f62909g;
        int i = this.f62908f;
        C79964v.C79965a<C22304c> aVar3 = this.f62910h;
        C22305e eVar = new C22305e(uri, dVar, aVar2, i, this, aVar3);
        this.f62911i = eVar;
        this.f62912j = aVar;
        eVar.f63249n.mo17937d(new C79964v(((C22201b) dVar).f62844a.createDataSource(), uri, 4, aVar3), eVar, i);
    }

    /* renamed from: f */
    public void mo35004f() {
        C22305e eVar = this.f62911i;
        if (eVar != null) {
            eVar.f63249n.mo17936c((C16876u.C16880d) null);
            for (C22305e.C22307b bVar : eVar.f63245g.values()) {
                bVar.f63256e.mo17936c((C16876u.C16880d) null);
            }
            eVar.f63246h.removeCallbacksAndMessages((Object) null);
            eVar.f63245g.clear();
            this.f62911i = null;
        }
        this.f62912j = null;
    }
}
