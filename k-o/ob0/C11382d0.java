package ob0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ob0.d0 */
public class C11382d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f33508d;

    /* renamed from: e */
    public final /* synthetic */ int f33509e;

    /* renamed from: f */
    public final /* synthetic */ String f33510f;

    /* renamed from: g */
    public final /* synthetic */ C117747y f33511g;

    /* renamed from: h */
    public final /* synthetic */ C89137b0 f33512h;

    public C11382d0(C89137b0 b0Var, int i, int i2, String str, C117747y yVar) {
        this.f33512h = b0Var;
        this.f33508d = i;
        this.f33509e = i2;
        this.f33510f = str;
        this.f33511g = yVar;
    }

    public void run() {
        Set set = (Set) ((HashMap) this.f33512h.f256813h).get(-1);
        if (set != null && set.size() > 0) {
            HashSet hashSet = new HashSet();
            synchronized (set) {
                hashSet.addAll(set);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C11385n nVar = (C11385n) it.next();
                if (nVar != null && set.contains(nVar)) {
                    nVar.onSceneEnd(this.f33508d, this.f33509e, this.f33510f, this.f33511g);
                }
            }
        }
    }
}
