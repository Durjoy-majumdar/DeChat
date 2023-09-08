package vy3;

import gy3.C8479f0;
import gy3.C87412m;
import oz3.C21911y;
import oz3.C25403u;
import vy3.C26397j;
import w04.C22843b;
import wy3.C26447e;

/* renamed from: vy3.o */
public final class C22806o extends C22843b.C22845b<C26447e, C26397j.C22804a> {

    /* renamed from: a */
    public final /* synthetic */ String f65567a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<C26397j.C22804a> f65568b;

    public C22806o(String str, C8479f0<C26397j.C22804a> f0Var) {
        this.f65567a = str;
        this.f65568b = f0Var;
    }

    /* renamed from: a */
    public Object mo31877a() {
        C26397j.C22804a aVar = (C26397j.C22804a) this.f65568b.f27484d;
        return aVar == null ? C26397j.C22804a.NOT_CONSIDERED : aVar;
    }

    /* renamed from: b */
    public boolean mo31878b(Object obj) {
        C26447e eVar = (C26447e) obj;
        C87412m.m108594g(eVar, "javaClassDescriptor");
        String a = C25403u.m32594a(C21911y.f61967a, eVar, this.f65567a);
        if (C22807s.f65571c.contains(a)) {
            this.f65568b.f27484d = C26397j.C22804a.HIDDEN;
        } else if (C22807s.f65572d.contains(a)) {
            this.f65568b.f27484d = C26397j.C22804a.VISIBLE;
        } else if (C22807s.f65570b.contains(a)) {
            this.f65568b.f27484d = C26397j.C22804a.DROP;
        }
        return this.f65568b.f27484d == null;
    }
}
