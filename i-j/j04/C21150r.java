package j04;

import java.util.List;
import wy3.C26436b;
import wy3.C26447e;

/* renamed from: j04.r */
public interface C21150r {

    /* renamed from: a */
    public static final C21150r f59798a = new C21151a();

    /* renamed from: j04.r$a */
    public static class C21151a implements C21150r {
        /* renamed from: c */
        public static /* synthetic */ void m23567c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo17871a(C26436b bVar) {
            if (bVar == null) {
                m23567c(2);
                throw null;
            }
        }

        /* renamed from: b */
        public void mo17872b(C26447e eVar, List<String> list) {
            if (eVar == null) {
                m23567c(0);
                throw null;
            } else if (list == null) {
                m23567c(1);
                throw null;
            }
        }
    }

    /* renamed from: a */
    void mo17871a(C26436b bVar);

    /* renamed from: b */
    void mo17872b(C26447e eVar, List<String> list);
}
