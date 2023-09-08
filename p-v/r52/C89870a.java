package r52;

import android.view.Surface;
import rx3.C36570n;

/* renamed from: r52.a */
public final class C89870a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89872c f258306d;

    public C89870a(C89872c cVar) {
        this.f258306d = cVar;
    }

    public final void run() {
        C89872c cVar = this.f258306d;
        if (cVar.f258309d.mo120586o(cVar.f258317o, cVar)) {
            C89872c cVar2 = this.f258306d;
            if (cVar2.f258312g) {
                ((Surface) ((C36570n) cVar2.f258311f).getValue()).release();
            }
            cVar2.f258310e.release();
            cVar2.f258313h = true;
        }
    }
}
