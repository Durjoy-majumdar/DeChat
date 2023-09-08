package h41;

import android.view.View;
import o41.C117709a;

public final /* synthetic */ class b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117067b f350775d;

    public /* synthetic */ b$$b(C117067b bVar) {
        this.f350775d = bVar;
    }

    public final void run() {
        C117067b bVar = this.f350775d;
        if (!bVar.f350764q) {
            bVar.f350764q = true;
            C117709a<View> aVar = bVar.f350756f;
            aVar.iterator();
            while (aVar.hasNext()) {
                bVar.Cx0(aVar.next(), 3);
            }
            bVar.Bx0(3);
        }
    }
}
