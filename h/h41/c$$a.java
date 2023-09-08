package h41;

import android.view.View;
import java.util.WeakHashMap;

public final /* synthetic */ class c$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117068c f350808d;

    /* renamed from: e */
    public final /* synthetic */ View f350809e;

    /* renamed from: f */
    public final /* synthetic */ View f350810f;

    public /* synthetic */ c$$a(C117068c cVar, View view, View view2) {
        this.f350808d = cVar;
        this.f350809e = view;
        this.f350810f = view2;
    }

    public final void run() {
        C117068c cVar = this.f350808d;
        View view = this.f350809e;
        View view2 = this.f350810f;
        if (cVar.f350807e.f350756f.contains(view)) {
            cVar.f350807e.Dx0(view, 1);
            cVar.f350807e.f350756f.mo182402h(view);
        } else if (cVar.f350807e.f350762o.contains(view)) {
            cVar.f350807e.Dx0(view, 1);
            cVar.f350807e.f350762o.mo182402h(view);
        }
        C117067b bVar = cVar.f350807e;
        if (view2 == null) {
            bVar.getClass();
        } else {
            ((WeakHashMap) bVar.f350763p).remove(view2);
        }
    }
}
