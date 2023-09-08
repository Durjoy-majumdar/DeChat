package nn3;

import ak3.C67056a;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import l31.C61212e;
import ln3.C76709a;
import ln3.C76719m;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;

/* renamed from: nn3.a */
public final class C76946a {

    /* renamed from: a */
    public static final C76946a f224861a = new C76946a();

    /* renamed from: a */
    public final void mo107274a(int i, long j) {
        T t;
        boolean z;
        WeakReference<C67056a> weakReference = C67056a.f192606o;
        C67056a aVar = weakReference != null ? weakReference.get() : null;
        if (aVar != null) {
            Iterator<T> it = aVar.f192612j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                C76709a aVar2 = (C76709a) t;
                if (!(aVar2 instanceof C76719m) || ((C76719m) aVar2).f224452u.mo108716n2().f183488f != j) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C76719m mVar = t instanceof C76719m ? (C76719m) t : null;
            if (mVar != null && i != -1) {
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("group_msg_set_top_detach", (Object) null, C90364q0.m113149h(C90363p0.m113143b(new C13604l("group_bar_close_scene", Integer.valueOf(i))), mVar.mo106997b()), 26356);
            }
        }
    }
}
