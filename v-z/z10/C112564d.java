package z10;

import android.os.HandlerThread;
import gy3.C87412m;
import q00.C110264g;
import w80.C111742d;

/* renamed from: z10.d */
public final class C112564d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112565e f337011d;

    public C112564d(C112565e eVar) {
        this.f337011d = eVar;
    }

    public final void run() {
        C111742d.C111743a aVar = C111742d.f334647a;
        C111742d.C65942b bVar = this.f337011d.f337017f;
        if (bVar != null) {
            aVar.mo163471q(bVar);
            this.f337011d.f337013b.quit();
            HandlerThread handlerThread = this.f337011d.f337015d;
            if (handlerThread != null) {
                handlerThread.quit();
                C110264g gVar = this.f337011d.f337021j;
                if (gVar != null) {
                    gVar.destroy();
                }
                this.f337011d.f337021j = null;
                return;
            }
            C87412m.m108603p("callbackThread");
            throw null;
        }
        C87412m.m108603p("mEGLEnvironment");
        throw null;
    }
}
