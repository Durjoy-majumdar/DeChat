package zt3;

import cu3.C116540a;
import gu3.C107916a;
import lu3.C117478d;
import lu3.C117479j;

/* renamed from: zt3.i */
public class C119156i implements C107916a<Runnable, C117479j> {

    /* renamed from: a */
    public final /* synthetic */ long f356861a;

    public C119156i(C119157j jVar, long j) {
        this.f356861a = j;
    }

    /* renamed from: a */
    public Object mo63988a(Object obj) {
        Runnable runnable = (Runnable) obj;
        C117479j<?> a = C116540a.m164347a(runnable, this.f356861a, (String) null);
        if (runnable instanceof C117478d) {
            ((C117478d) runnable).mo121152g(a);
        }
        return a;
    }
}
