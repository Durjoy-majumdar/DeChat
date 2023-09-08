package wf0;

import ag0.C27889b;
import ag0.C27891d;
import f40.C31887k0;
import java.util.HashMap;
import zh3.C91753f;

/* renamed from: wf0.c */
public class C38090c implements C31887k0.C31890c {

    /* renamed from: d */
    public HashMap<Integer, C91753f.C66827b> f100682d;

    /* renamed from: wf0.c$a */
    public class C38091a implements C91753f.C66827b {
        public C38091a(C38090c cVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C27891d.f77051e;
        }
    }

    /* renamed from: wf0.c$b */
    public class C38092b implements C91753f.C66827b {
        public C38092b(C38090c cVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C27889b.f77047e;
        }
    }

    public C38090c() {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        this.f100682d = hashMap;
        hashMap.put(1615644817, new C38091a(this));
        this.f100682d.put(417933017, new C38092b(this));
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        return this.f100682d;
    }
}
