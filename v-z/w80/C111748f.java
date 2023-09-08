package w80;

import android.os.HandlerThread;
import gy3.C87412m;
import w80.C111742d;

/* renamed from: w80.f */
public final class C111748f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111744e f334660d;

    public C111748f(C111744e eVar) {
        this.f334660d = eVar;
    }

    public final void run() {
        C111742d.C65942b bVar = this.f334660d.f334656b;
        if (bVar != null) {
            C111742d.C111743a aVar = C111742d.f334647a;
            C87412m.m108591d(bVar);
            aVar.mo163471q(bVar);
        }
        HandlerThread handlerThread = this.f334660d.f334655a;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }
}
