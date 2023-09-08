package g82;

import f40.C31887k0;
import java.util.HashMap;
import s82.C36639c;
import s82.C77624a;
import zh3.C91753f;

/* renamed from: g82.f */
public class C32349f implements C31887k0.C31890c {

    /* renamed from: d */
    public HashMap<Integer, C91753f.C66827b> f85853d;

    /* renamed from: g82.f$a */
    public class C32350a implements C91753f.C66827b {
        public C32350a(C32349f fVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C77624a.f226286d;
        }
    }

    /* renamed from: g82.f$b */
    public class C32351b implements C91753f.C66827b {
        public C32351b(C32349f fVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C36639c.f97398d;
        }
    }

    public C32349f() {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        this.f85853d = hashMap;
        hashMap.put(-2120741918, new C32350a(this));
        this.f85853d.put(-1031250034, new C32351b(this));
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        return this.f85853d;
    }
}
