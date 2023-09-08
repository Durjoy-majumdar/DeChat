package wj2;

import gy3.C8480h;
import java.util.NoSuchElementException;

/* renamed from: wj2.e */
public enum C53183e {
    UNKNOWN,
    DEFAULT,
    GLOBAL,
    EXCLUSIVE;
    

    /* renamed from: d */
    public static final C53184a f148370d = null;

    /* renamed from: e */
    public static final C53183e[] f148371e = null;

    /* renamed from: wj2.e$a */
    public static final class C53184a {
        public C53184a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C53183e mo73863a(int i) {
            for (C53183e eVar : C53183e.f148371e) {
                if (eVar.ordinal() == i) {
                    return eVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    /* access modifiers changed from: public */
    static {
        f148370d = new C53184a((C8480h) null);
        f148371e = values();
    }
}
