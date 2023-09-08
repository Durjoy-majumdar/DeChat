package ci2;

import gy3.C8480h;

/* renamed from: ci2.d */
public final class C104380d {

    /* renamed from: a */
    public final C104379c f309018a;

    /* renamed from: b */
    public final C104379c f309019b;

    public C104380d() {
        this(0, false, 3, (C8480h) null);
    }

    public C104380d(long j, boolean z, int i, C8480h hVar) {
        j = (i & 1) != 0 ? 0 : j;
        z = (i & 2) != 0 ? true : z;
        C104379c cVar = new C104379c(0, 1, (C8480h) null);
        this.f309018a = cVar;
        C104379c cVar2 = new C104379c(0, 1, (C8480h) null);
        this.f309019b = cVar2;
        if (z) {
            cVar2.mo146047d(cVar);
            cVar2.mo146046c(j);
            return;
        }
        cVar.mo146047d(cVar2);
        cVar.mo146046c(-j);
    }

    /* renamed from: a */
    public static void m139388a(C104380d dVar, C104380d dVar2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        C104379c cVar = null;
        if (z) {
            dVar.f309018a.mo146047d(dVar2 != null ? dVar2.f309018a : null);
            dVar.f309018a.mo146046c(0);
        }
        if (z2) {
            C104379c cVar2 = dVar.f309019b;
            if (dVar2 != null) {
                cVar = dVar2.f309019b;
            }
            cVar2.mo146047d(cVar);
            dVar.f309019b.mo146046c(0);
            return;
        }
        dVar.getClass();
    }

    /* renamed from: b */
    public final long mo146048b() {
        return this.f309019b.mo146044a();
    }

    /* renamed from: c */
    public final long mo146049c() {
        return this.f309018a.mo146044a();
    }

    /* renamed from: d */
    public final void mo146050d(long j, long j2) {
        C104379c cVar = this.f309018a;
        cVar.mo146046c(cVar.f309015c + (j - cVar.mo146044a()));
        C104379c cVar2 = this.f309019b;
        cVar2.mo146046c(cVar2.f309015c + (j2 - cVar2.mo146044a()));
    }

    public final void finalize() {
        this.f309018a.mo146047d((C104379c) null);
        this.f309019b.mo146047d((C104379c) null);
    }

    public String toString() {
        return "start:" + mo146049c() + "  end:" + mo146048b();
    }
}
