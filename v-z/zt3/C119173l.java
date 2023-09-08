package zt3;

import cu3.C116540a;
import gu3.C107916a;
import java.util.concurrent.Callable;
import lu3.C117478d;
import lu3.C117479j;

/* renamed from: zt3.l */
public class C119173l implements C107916a<Callable<Object>, C117479j<Object>> {

    /* renamed from: a */
    public final /* synthetic */ long f356892a;

    public C119173l(C119157j jVar, long j) {
        this.f356892a = j;
    }

    /* renamed from: a */
    public Object mo63988a(Object obj) {
        Callable callable = (Callable) obj;
        C117479j b = C116540a.m164348b(callable, this.f356892a, (String) null);
        if (callable instanceof C117478d) {
            ((C117478d) callable).mo121152g(b);
        }
        return b;
    }
}
