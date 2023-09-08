package gz0;

import gz0.C46000r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: gz0.q */
public class C45999q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f124038d;

    /* renamed from: e */
    public final /* synthetic */ boolean f124039e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f124040f;

    /* renamed from: g */
    public final /* synthetic */ C46000r f124041g;

    public C45999q(C46000r rVar, String str, boolean z, ArrayList arrayList) {
        this.f124041g = rVar;
        this.f124038d = str;
        this.f124039e = z;
        this.f124040f = arrayList;
    }

    public void run() {
        Set set;
        synchronized (this.f124041g.f124042d) {
            set = (Set) ((HashMap) this.f124041g.f124042d).get(this.f124038d);
        }
        if (set != null && set.size() > 0) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(set);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C46000r.C46001a aVar = (C46000r.C46001a) it.next();
                if (aVar != null) {
                    aVar.mo63802K5(this.f124039e, this.f124040f);
                }
            }
        }
    }
}
