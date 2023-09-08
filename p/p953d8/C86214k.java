package p953d8;

import java.util.Comparator;
import java.util.TreeSet;
import p953d8.C86199a;

/* renamed from: d8.k */
public final class C86214k implements C86208f, Comparator<C86209g> {

    /* renamed from: d */
    public final long f250772d;

    /* renamed from: e */
    public final TreeSet<C86209g> f250773e = new TreeSet<>(this);

    /* renamed from: f */
    public long f250774f;

    public C86214k(long j) {
        this.f250772d = j;
    }

    /* renamed from: a */
    public void mo120623a(C86199a aVar, C86209g gVar) {
        this.f250773e.add(gVar);
        this.f250774f += gVar.f250755f;
        mo120643f(aVar, 0);
    }

    /* renamed from: b */
    public void mo120631b() {
    }

    /* renamed from: c */
    public void mo120624c(C86199a aVar, C86209g gVar) {
        this.f250773e.remove(gVar);
        this.f250774f -= gVar.f250755f;
    }

    public int compare(Object obj, Object obj2) {
        C86209g gVar = (C86209g) obj;
        C86209g gVar2 = (C86209g) obj2;
        long j = gVar.f250758i;
        long j2 = gVar2.f250758i;
        return j - j2 == 0 ? gVar.compareTo(gVar2) : j < j2 ? -1 : 1;
    }

    /* renamed from: d */
    public void mo120625d(C86199a aVar, C86209g gVar, C86209g gVar2) {
        mo120624c(aVar, gVar);
        mo120623a(aVar, gVar2);
    }

    /* renamed from: e */
    public void mo120632e(C86199a aVar, String str, long j, long j2) {
        mo120643f(aVar, j2);
    }

    /* renamed from: f */
    public final void mo120643f(C86199a aVar, long j) {
        while (this.f250774f + j > this.f250772d && !this.f250773e.isEmpty()) {
            try {
                aVar.mo120616I(this.f250773e.first());
            } catch (C86199a.C86200a unused) {
            }
        }
    }
}
