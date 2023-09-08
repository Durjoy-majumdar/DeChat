package h41;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o41.C117709a;

public final /* synthetic */ class b$$q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117067b f350802d;

    public /* synthetic */ b$$q(C117067b bVar) {
        this.f350802d = bVar;
    }

    public final void run() {
        C117067b bVar = this.f350802d;
        if (bVar.f350764q) {
            C117709a<View> aVar = bVar.f350756f;
            aVar.iterator();
            while (aVar.hasNext()) {
                bVar.Dx0(aVar.next(), 3);
            }
            C117709a<View> aVar2 = bVar.f350762o;
            aVar2.iterator();
            while (aVar2.hasNext()) {
                bVar.Dx0(aVar2.next(), 3);
            }
            ((ArrayList) bVar.f350762o.f352035d).clear();
            ((WeakHashMap) bVar.f350763p).clear();
            bVar.f350764q = false;
        }
    }
}
