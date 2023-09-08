package qk1;

import al1.C54130j;
import android.view.View;
import cl1.C54963d0;
import com.tencent.p014mm.sdk.platformtools.Util;
import fj1.C45795b;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: qk1.q2 */
public final class C63250q2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63248p2 f179485d;

    /* renamed from: e */
    public final /* synthetic */ int f179486e;

    public C63250q2(C63248p2 p2Var, int i) {
        this.f179485d = p2Var;
        this.f179486e = i;
    }

    public final void onClick(View view) {
        List<C54130j> list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorApplyLinkAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C54130j jVar = (C54130j) C110818d0.m150917O(this.f179485d.f179473f, this.f179486e);
        if (jVar != null) {
            C63248p2 p2Var = this.f179485d;
            C45795b bVar = p2Var.f179478n;
            T t = null;
            if (!(bVar == null || (list = ((C54963d0) bVar.mo71262a(C54963d0.class)).f154074q) == null)) {
                synchronized (list) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (Util.isEqual(((C54130j) next).f151997a, jVar.f151997a)) {
                            t = next;
                            break;
                        }
                    }
                }
                t = (C54130j) t;
            }
            if (t != null) {
                C32226l<? super C54130j, C13598b0> lVar = p2Var.f179477j;
                if (lVar != null) {
                    lVar.invoke(jVar);
                }
            } else {
                C32226l<? super C54130j, C13598b0> lVar2 = p2Var.f179476i;
                if (lVar2 != null) {
                    lVar2.invoke(jVar);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorApplyLinkAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
