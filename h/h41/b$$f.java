package h41;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import op3.C117877b;
import u31.C118568a;

public final /* synthetic */ class b$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117067b f350782d;

    public /* synthetic */ b$$f(C117067b bVar) {
        this.f350782d = bVar;
    }

    public final void run() {
        C117877b bVar;
        C117067b bVar2 = this.f350782d;
        if (((WeakHashMap) bVar2.f350763p).size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (View view : ((WeakHashMap) bVar2.f350763p).keySet()) {
                if (!bVar2.f350762o.contains(view) && (bVar = (C117877b) ((WeakHashMap) bVar2.f350763p).get(view)) != null) {
                    int i = 0;
                    long longValue = bVar.mo182596a(0) != null ? ((Long) bVar.mo182596a(0)).longValue() : 0;
                    if (bVar.mo182596a(1) != null) {
                        i = ((Integer) bVar.mo182596a(1)).intValue();
                    }
                    if (currentTimeMillis - longValue >= C118568a.m167241h(view)) {
                        bVar2.Cx0(view, i);
                        arrayList.add(view);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                bVar2.f350762o.add(view2);
                ((WeakHashMap) bVar2.f350763p).remove(view2);
            }
        }
    }
}
