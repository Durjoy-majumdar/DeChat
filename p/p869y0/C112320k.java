package p869y0;

import p410k0.C108793e;
import rx3.C13603j;

/* renamed from: y0.k */
public final class C112320k {
    /* renamed from: a */
    public static final C112321l m153224a(C112321l lVar) {
        C112321l a;
        int ordinal = lVar.f336333g.ordinal();
        if (ordinal == 0) {
            return lVar;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return lVar;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new C13603j();
                    }
                }
            }
            return null;
        }
        C112321l lVar2 = lVar.f336334h;
        if (lVar2 != null && (a = m153224a(lVar2)) != null) {
            return a;
        }
        throw new IllegalStateException("no child".toString());
    }

    /* renamed from: b */
    public static final void m153225b(C112321l lVar) {
        C112335u.m153257a(lVar);
        C108793e<C112321l> eVar = lVar.f336332f;
        int i = eVar.f325786f;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = eVar.f325784d;
            do {
                m153225b((C112321l) tArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }
}
