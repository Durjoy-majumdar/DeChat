package p380r7;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import p370p7.C21920c;
import p370p7.C21925d;
import p370p7.C21952p;
import p370p7.C21954q;
import p370p7.C21957r;
import p381s7.C22300a;
import p381s7.C22305e;
import p396x6.C23010j;
import p404z6.C23455e;

/* renamed from: r7.i */
public final class C22211i implements C21957r {

    /* renamed from: a */
    public final int f62913a;

    /* renamed from: b */
    public final C22212j f62914b;

    public C22211i(C22212j jVar, int i) {
        this.f62914b = jVar;
        this.f62913a = i;
    }

    /* renamed from: a */
    public int mo34995a(C23010j jVar, C23455e eVar, boolean z) {
        C22212j jVar2 = this.f62914b;
        int i = this.f62913a;
        if (jVar2.mo35342u()) {
            return -3;
        }
        if (!jVar2.f62933p.isEmpty()) {
            while (true) {
                boolean z2 = true;
                if (jVar2.f62933p.size() <= 1) {
                    break;
                }
                int i2 = jVar2.f62933p.getFirst().f62875j;
                int i3 = 0;
                while (true) {
                    C21954q[] qVarArr = jVar2.f62936s;
                    if (i3 >= qVarArr.length) {
                        break;
                    }
                    if (jVar2.f62917C[i3]) {
                        C21952p pVar = qVarArr[i3].f62149c;
                        if ((pVar.mo35025f() ? pVar.f62127b[pVar.mo35024e(pVar.f62137l)] : pVar.f62143r) == i2) {
                            z2 = false;
                            break;
                        }
                    }
                    i3++;
                }
                if (!z2) {
                    break;
                }
                jVar2.f62933p.removeFirst();
            }
            C22208f first = jVar2.f62933p.getFirst();
            Format format = first.f62456c;
            if (!format.equals(jVar2.f62941x)) {
                C21920c.C21921a aVar = jVar2.f62931n;
                int i4 = jVar2.f62924d;
                int i5 = first.f62457d;
                Object obj = first.f62458e;
                long j = first.f62459f;
                if (aVar.f61981b != null) {
                    aVar.f61980a.post(new C21925d(aVar, i4, format, i5, obj, j));
                }
            }
            jVar2.f62941x = format;
        }
        return jVar2.f62936s[i].mo35032k(jVar, eVar, z, jVar2.f62923I, jVar2.f62919E);
    }

    /* renamed from: b */
    public void mo34996b(long j) {
        long j2;
        C22212j jVar = this.f62914b;
        C21954q qVar = jVar.f62936s[this.f62913a];
        if (jVar.f62923I) {
            C21952p pVar = qVar.f62149c;
            synchronized (pVar) {
                j2 = pVar.f62139n;
            }
            if (j > j2) {
                C21952p pVar2 = qVar.f62149c;
                synchronized (pVar2) {
                    if (pVar2.mo35025f()) {
                        pVar2.f62137l = pVar2.f62134i;
                        return;
                    }
                    return;
                }
            }
        }
        qVar.mo35026e(j, true, true);
    }

    /* renamed from: c */
    public void mo34997c() {
        C22212j jVar = this.f62914b;
        jVar.f62930j.mo17935b();
        C22202c cVar = jVar.f62926f;
        IOException iOException = cVar.f62854j;
        if (iOException == null) {
            C22300a.C22301a aVar = cVar.f62855k;
            if (aVar != null) {
                C22305e.C22307b bVar = cVar.f62849e.f63245g.get(aVar);
                bVar.f63256e.mo17935b();
                IOException iOException2 = bVar.f63264p;
                if (iOException2 != null) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public boolean isReady() {
        C22212j jVar = this.f62914b;
        return jVar.f62923I || (!jVar.mo35342u() && jVar.f62936s[this.f62913a].f62149c.mo35025f());
    }
}
