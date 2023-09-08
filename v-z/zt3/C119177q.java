package zt3;

import cu3.C116540a;
import gu3.C107916a;
import java.util.concurrent.Callable;
import lu3.C117478d;
import lu3.C117479j;

/* renamed from: zt3.q */
public class C119177q implements C107916a<Callable<Object>, C117479j<Object>> {

    /* renamed from: a */
    public final /* synthetic */ long f356897a;

    /* renamed from: b */
    public final /* synthetic */ String f356898b;

    public C119177q(C119157j jVar, long j, String str) {
        this.f356897a = j;
        this.f356898b = str;
    }

    /* renamed from: a */
    public Object mo63988a(Object obj) {
        Callable callable = (Callable) obj;
        C117479j b = C116540a.m164348b(callable, this.f356897a, this.f356898b);
        if (callable instanceof C117478d) {
            ((C117478d) callable).mo121152g(b);
        }
        return b;
    }
}
