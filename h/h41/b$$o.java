package h41;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l31.C61213g;
import o41.C117710b;

public final /* synthetic */ class b$$o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117067b f350798d;

    /* renamed from: e */
    public final /* synthetic */ View f350799e;

    /* renamed from: f */
    public final /* synthetic */ C61213g.C61215b f350800f;

    public /* synthetic */ b$$o(C117067b bVar, View view, C61213g.C61215b bVar2) {
        this.f350798d = bVar;
        this.f350799e = view;
        this.f350800f = bVar2;
    }

    public final void run() {
        C117067b bVar = this.f350798d;
        View view = this.f350799e;
        C61213g.C61215b bVar2 = this.f350800f;
        if (!bVar.f350755e.contains(view)) {
            bVar.f350755e.add(view);
            C117710b<C61213g.C61215b> bVar3 = bVar.f350757g;
            if (view == null) {
                bVar3.getClass();
            } else {
                bVar3.mo182407a();
                bVar3.mo182407a();
                if (bVar3.mo182408b(view)) {
                    Iterator it = ((ArrayList) bVar3.f352037a).iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        if (weakReference != null && weakReference.get() == view) {
                            it.remove();
                        }
                    }
                    if (view.getTag(bVar3.f352038b) != null) {
                        view.setTag(bVar3.f352038b, (Object) null);
                    }
                }
                view.setTag(bVar3.f352038b, bVar2);
                ((ArrayList) bVar3.f352037a).add(new WeakReference(view));
            }
            bVar.xx0(view);
            bVar.zx0(1, 0);
        }
    }
}
