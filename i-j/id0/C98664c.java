package id0;

import f40.C31887k0;
import hd0.C98445y0;
import hd0.o0$$d;
import hd0.o0$$e;
import java.util.HashMap;
import java.util.Iterator;
import zh3.C91753f;

/* renamed from: id0.c */
public class C98664c implements C31887k0.C31890c {

    /* renamed from: d */
    public HashMap<Integer, C91753f.C66827b> f289284d = new HashMap<>();

    /* renamed from: id0.c$a */
    public class C98665a implements C91753f.C66827b {

        /* renamed from: a */
        public final /* synthetic */ o0$$d f289285a;

        public C98665a(C98664c cVar, o0$$d o0__d) {
            this.f289285a = o0__d;
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return this.f289285a.f288591c;
        }
    }

    /* renamed from: id0.c$b */
    public class C98666b implements C91753f.C66827b {
        public C98666b(C98664c cVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C98445y0.f288746b;
        }
    }

    public C98664c() {
        Iterator<o0$$d> it = o0$$e.f288592a.iterator();
        while (it.hasNext()) {
            o0$$d next = it.next();
            this.f289284d.put(Integer.valueOf(next.f288589a.hashCode()), new C98665a(this, next));
        }
        this.f289284d.put(-1315830156, new C98666b(this));
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        return this.f289284d;
    }
}
