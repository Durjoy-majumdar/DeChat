package pb1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C101801kd0;
import te3.C101834rc0;

/* renamed from: pb1.s */
public final class C100740s {

    /* renamed from: a */
    public static final C100741a f295145a = new C100741a((C8480h) null);

    /* renamed from: pb1.s$a */
    public static final class C100741a {
        public C100741a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C101834rc0 mo140166a(C101801kd0 kd02, String str) {
            LinkedList<C101834rc0> linkedList;
            C101834rc0 a;
            C87412m.m108594g(str, "dataId");
            if (kd02 == null || (linkedList = kd02.f298618f) == null) {
                return null;
            }
            for (C101834rc0 rc02 : linkedList) {
                if (C87412m.m108589b(rc02.f299280T, str)) {
                    return rc02;
                }
                if (rc02.f299258I == 17 && (a = C100740s.f295145a.mo140166a(rc02.f299275Q1, str)) != null) {
                    return a;
                }
            }
            return null;
        }
    }
}
