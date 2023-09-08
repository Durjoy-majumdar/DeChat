package hi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.concurrent.ConcurrentSkipListSet;
import lp3.C88643g;

/* renamed from: hi0.s */
public class C87506s implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ C87502p f253510a;

    public C87506s(C87502p pVar) {
        this.f253510a = pVar;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        Log.m105924i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry queue drained, interrupt");
        C88643g.m110544b().mo72091a((Object) null);
        synchronized (this.f253510a) {
            this.f253510a.f253499d = false;
            ((ConcurrentSkipListSet) this.f253510a.f253501f).clear();
        }
        return null;
    }
}
