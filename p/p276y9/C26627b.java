package p276y9;

import java.util.ArrayList;
import java.util.List;
import p1224z9.C119087b;

/* renamed from: y9.b */
public class C26627b extends C26632h {

    /* renamed from: h */
    public final long f74069h;

    /* renamed from: y9.b$a */
    public static class C23279a {

        /* renamed from: a */
        public C23280d f66909a;

        /* renamed from: b */
        public Object f66910b;

        public C23279a(C23280d dVar, Object obj) {
            this.f66909a = dVar;
            this.f66910b = obj;
        }
    }

    public C26627b(long j, C26636m mVar, long j2) {
        super(j, mVar);
        this.f74069h = j2;
    }

    /* renamed from: g */
    public List<C23279a> mo53610g() {
        ArrayList arrayList = new ArrayList();
        ((C119087b) mo53630a()).f356638f = this.f74069h;
        for (C26628c b = mo53605b(); b != null; b = b.mo53617i()) {
            for (C23280d dVar : b.f74073n) {
                arrayList.add(new C23279a(dVar, mo53632f(dVar.f66911a)));
            }
        }
        return arrayList;
    }

    public final String toString() {
        return String.format("%s@%d (0x%x)", new Object[]{mo53605b().f74070h, Long.valueOf(this.f74093d & this.f74095f.f74087i.f74121f), Long.valueOf(this.f74093d & this.f74095f.f74087i.f74121f)});
    }
}
