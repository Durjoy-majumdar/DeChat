package wq3;

import gy3.C87412m;
import java.util.HashMap;
import java.util.Set;

/* renamed from: wq3.b */
public abstract class C111839b implements C111850k {

    /* renamed from: a */
    public HashMap<Integer, C111849j> f334876a;

    /* renamed from: b */
    public final HashMap<String, Set<Integer>> f334877b = new HashMap<>();

    /* renamed from: c */
    public long f334878c;

    /* renamed from: d */
    public final C111840a f334879d = new C111840a(this);

    /* renamed from: wq3.b$a */
    public static final class C111840a implements C111844f {

        /* renamed from: b */
        public final /* synthetic */ C111839b f334880b;

        public C111840a(C111839b bVar) {
            this.f334880b = bVar;
        }

        /* renamed from: a */
        public boolean mo163580a(String str) {
            C87412m.m108594g(str, "actName");
            return this.f334880b.f334877b.containsKey(str);
        }

        /* renamed from: b */
        public boolean mo163581b(String str, int i) {
            C87412m.m108594g(str, "actName");
            Set set = this.f334880b.f334877b.get(str);
            if (set != null) {
                return set.contains(Integer.valueOf(i));
            }
            return false;
        }
    }

    /* renamed from: a */
    public C91096l mo163573a() {
        return C66178w.f190194a;
    }

    /* renamed from: b */
    public C111844f mo163574b() {
        return this.f334879d;
    }

    /* renamed from: c */
    public C111849j mo163575c(int i) {
        C111849j f = mo163578f(i);
        if (f != null) {
            return (C111849j) f.getClass().newInstance();
        }
        return null;
    }

    /* renamed from: d */
    public C111848i mo163576d() {
        return C38274x.f101047a;
    }

    /* renamed from: e */
    public C91095g mo163577e() {
        return C111859t.f334895a;
    }

    /* renamed from: f */
    public C111849j mo163578f(int i) {
        HashMap<Integer, C111849j> hashMap = this.f334876a;
        if (hashMap != null) {
            return hashMap.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: g */
    public final void mo163579g(int i, C111849j jVar) {
        C87412m.m108594g(jVar, "viewCreator");
        HashMap<Integer, C111849j> hashMap = this.f334876a;
        if (hashMap != null) {
            C111849j put = hashMap.put(Integer.valueOf(i), jVar);
        }
    }
}
