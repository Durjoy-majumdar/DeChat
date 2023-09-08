package p1206p4;

import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p1014o4.C117693m;
import p283z4.C119060c;

/* renamed from: p4.m */
public class C117981m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C119060c f352616d;

    /* renamed from: e */
    public final /* synthetic */ String f352617e;

    /* renamed from: f */
    public final /* synthetic */ C117982n f352618f;

    public C117981m(C117982n nVar, C119060c cVar, String str) {
        this.f352618f = nVar;
        this.f352616d = cVar;
        this.f352617e = str;
    }

    public void run() {
        try {
            ListenableWorker.C113032a aVar = (ListenableWorker.C113032a) this.f352616d.get();
            if (aVar == null) {
                C117693m.m165966c().mo182390b(C117982n.f352619z, String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.f352618f.f352624h.f355543c}), new Throwable[0]);
            } else {
                C117693m.m165966c().mo182389a(C117982n.f352619z, String.format("%s returned a %s result.", new Object[]{this.f352618f.f352624h.f355543c, aVar}), new Throwable[0]);
                this.f352618f.f352627n = aVar;
            }
        } catch (CancellationException e) {
            C117693m.m165966c().mo182391d(C117982n.f352619z, String.format("%s was cancelled", new Object[]{this.f352617e}), e);
        } catch (InterruptedException | ExecutionException e2) {
            C117693m.m165966c().mo182390b(C117982n.f352619z, String.format("%s failed because it threw an exception/error", new Object[]{this.f352617e}), e2);
        } catch (Throwable th) {
            this.f352618f.mo182742c();
            throw th;
        }
        this.f352618f.mo182742c();
    }
}
