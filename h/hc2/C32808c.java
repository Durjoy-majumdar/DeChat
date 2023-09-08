package hc2;

import f40.C31887k0;
import java.util.HashMap;
import jc2.C117341a;
import jc2.C117342b;
import zh3.C91753f;

/* renamed from: hc2.c */
public class C32808c implements C31887k0.C31890c {

    /* renamed from: d */
    public HashMap<Integer, C91753f.C66827b> f89253d;

    /* renamed from: hc2.c$a */
    public class C32809a implements C91753f.C66827b {
        public C32809a(C32808c cVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C117341a.f351286e;
        }
    }

    /* renamed from: hc2.c$b */
    public class C32810b implements C91753f.C66827b {
        public C32810b(C32808c cVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C117342b.f351289f;
        }
    }

    public C32808c() {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        this.f89253d = hashMap;
        hashMap.put(-1001649815, new C32809a(this));
        this.f89253d.put(201389415, new C32810b(this));
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        return this.f89253d;
    }
}
