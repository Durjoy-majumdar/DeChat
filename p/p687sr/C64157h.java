package p687sr;

import ev1.C58838a;
import java.util.ArrayList;

/* renamed from: sr.h */
public interface C64157h {

    /* renamed from: sr.h$a */
    public static final class C64158a {
        /* renamed from: a */
        public static /* synthetic */ void m75492a(C64157h hVar, Runnable runnable, long j, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 4) != 0) {
                    obj = null;
                }
                hVar.mo84690f(runnable, j, obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTaskDelay");
        }
    }

    /* renamed from: a */
    boolean mo84685a();

    /* renamed from: b */
    void mo84686b(String str);

    /* renamed from: c */
    void mo84687c(C58838a aVar);

    /* renamed from: d */
    void mo84688d(Object obj);

    /* renamed from: e */
    void mo84689e(C58838a aVar);

    /* renamed from: f */
    void mo84690f(Runnable runnable, long j, Object obj);

    ArrayList<C58838a> getMsgList();

    void show();
}
