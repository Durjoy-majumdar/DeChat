package h41;

import android.view.View;
import java.util.WeakHashMap;
import m41.C117536f;
import u31.C118568a;

public final /* synthetic */ class b$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117067b f350795d;

    /* renamed from: e */
    public final /* synthetic */ View f350796e;

    /* renamed from: f */
    public final /* synthetic */ boolean f350797f;

    public /* synthetic */ b$$n(C117067b bVar, View view, boolean z) {
        this.f350795d = bVar;
        this.f350796e = view;
        this.f350797f = z;
    }

    public final void run() {
        C117067b bVar = this.f350795d;
        View view = this.f350796e;
        boolean z = this.f350797f;
        bVar.getClass();
        if (C118568a.m167241h(view) <= 0) {
            boolean contains = bVar.f350756f.contains(view);
            if (contains && !z) {
                bVar.Dx0(view, 0);
                bVar.f350756f.mo182402h(view);
            } else if (!contains && z) {
                C117536f.m165801c(new b$$d(bVar, view));
                bVar.f350756f.add(view);
            }
        } else {
            boolean contains2 = bVar.f350762o.contains(view);
            if (contains2 && !z) {
                bVar.Dx0(view, 0);
                bVar.f350762o.mo182402h(view);
            } else if (!contains2 && z) {
                C117536f.m165801c(new b$$e(bVar, view));
                bVar.f350762o.add(view);
            }
            if (view != null) {
                ((WeakHashMap) bVar.f350763p).remove(view);
            }
        }
    }
}
