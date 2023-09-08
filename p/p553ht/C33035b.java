package p553ht;

import com.tencent.p014mm.modelimage.C92839m;
import f40.C31887k0;
import java.util.HashMap;
import java.util.Iterator;
import zh3.C91753f;

/* renamed from: ht.b */
public class C33035b implements C31887k0.C31890c {

    /* renamed from: d */
    public HashMap<Integer, C91753f.C66827b> f89708d = new HashMap<>();

    /* renamed from: ht.b$a */
    public class C33036a implements C91753f.C66827b {

        /* renamed from: a */
        public final /* synthetic */ C92839m.C92843d f89709a;

        public C33036a(C33035b bVar, C92839m.C92843d dVar) {
            this.f89709a = dVar;
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return this.f89709a.f267432c;
        }
    }

    public C33035b() {
        Iterator<C92839m.C92843d> it = C92839m.C92844e.f267435a.iterator();
        while (it.hasNext()) {
            C92839m.C92843d next = it.next();
            this.f89708d.put(Integer.valueOf(next.f267430a.hashCode()), new C33036a(this, next));
        }
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        return this.f89708d;
    }
}
