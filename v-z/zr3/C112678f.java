package zr3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: zr3.f */
public class C112678f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112672d f337385d;

    /* renamed from: e */
    public final /* synthetic */ int f337386e;

    /* renamed from: f */
    public final /* synthetic */ int f337387f;

    /* renamed from: g */
    public final /* synthetic */ String f337388g;

    /* renamed from: h */
    public final /* synthetic */ C112675e f337389h;

    public C112678f(C112675e eVar, C112672d dVar, int i, int i2, String str) {
        this.f337389h = eVar;
        this.f337385d = dVar;
        this.f337386e = i;
        this.f337387f = i2;
        this.f337388g = str;
    }

    public void run() {
        Set set = this.f337389h.f337380f.get(this.f337385d.mo161498d());
        if (set != null && set.size() > 0) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(set);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C112670b bVar = (C112670b) it.next();
                if (bVar != null && set.contains(bVar)) {
                    bVar.mo150596b(this.f337386e, this.f337387f, this.f337388g, this.f337385d);
                }
            }
        }
    }
}
