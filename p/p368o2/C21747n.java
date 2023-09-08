package p368o2;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: o2.n */
public class C21747n {

    /* renamed from: a */
    public HashSet<C21747n> f61661a = new HashSet<>(2);

    /* renamed from: b */
    public int f61662b = 0;

    /* renamed from: a */
    public void mo34078a(C21747n nVar) {
        this.f61661a.add(nVar);
    }

    /* renamed from: b */
    public void mo34079b() {
        this.f61662b = 1;
        Iterator<C21747n> it = this.f61661a.iterator();
        while (it.hasNext()) {
            it.next().mo34067e();
        }
    }

    /* renamed from: c */
    public void mo34080c() {
        this.f61662b = 0;
        Iterator<C21747n> it = this.f61661a.iterator();
        while (it.hasNext()) {
            it.next().mo34080c();
        }
    }

    /* renamed from: d */
    public boolean mo34081d() {
        return this.f61662b == 1;
    }

    /* renamed from: e */
    public void mo34067e() {
    }
}
