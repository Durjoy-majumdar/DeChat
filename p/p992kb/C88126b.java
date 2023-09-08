package p992kb;

import android.os.SystemClock;
import p1017od.C89157e;

/* renamed from: kb.b */
public class C88126b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88127c f254883d;

    public C88126b(C88127c cVar) {
        this.f254883d = cVar;
    }

    public void run() {
        C88127c cVar = this.f254883d;
        C89157e eVar = cVar.f254890f;
        if (eVar != null) {
            int i = cVar.f254891g;
            cVar.f254892h = (((float) (eVar.mo123499b() - i)) * 1000.0f) / ((float) (SystemClock.elapsedRealtime() - eVar.f256899b.get(i)));
        }
    }
}
