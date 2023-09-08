package h41;

import android.view.View;

public final /* synthetic */ class b$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117067b f350785d;

    /* renamed from: e */
    public final /* synthetic */ View f350786e;

    public /* synthetic */ b$$i(C117067b bVar, View view) {
        this.f350785d = bVar;
        this.f350786e = view;
    }

    public final void run() {
        C117067b bVar = this.f350785d;
        View view = this.f350786e;
        if (!bVar.f350755e.contains(view)) {
            bVar.f350755e.add(view);
            bVar.xx0(view);
            bVar.zx0(1, 0);
        }
    }
}
