package p149ej;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: ej.b */
public final class C86523b implements Runnable {

    /* renamed from: d */
    public static final C86523b f251371d = new C86523b();

    public final void run() {
        C119179t tVar = C119157j.f356862d;
        FutureTask<Integer> futureTask = C107276c.f320948d;
        if (futureTask != null) {
            ((C119157j) tVar).mo183875f(futureTask);
            try {
                FutureTask<Integer> futureTask2 = C107276c.f320948d;
                if (futureTask2 != null) {
                    futureTask2.get(10, TimeUnit.SECONDS);
                } else {
                    C87412m.m108603p("futureTask");
                    throw null;
                }
            } catch (TimeoutException unused) {
                Log.m105920e("MicroMsg.PluginCamera", "futureTask TimeoutException cancel");
                FutureTask<Integer> futureTask3 = C107276c.f320948d;
                if (futureTask3 == null) {
                    C87412m.m108603p("futureTask");
                    throw null;
                } else if (!futureTask3.isCancelled()) {
                    FutureTask<Integer> futureTask4 = C107276c.f320948d;
                    if (futureTask4 == null) {
                        C87412m.m108603p("futureTask");
                        throw null;
                    } else if (!futureTask4.isDone()) {
                        FutureTask<Integer> futureTask5 = C107276c.f320948d;
                        if (futureTask5 != null) {
                            futureTask5.cancel(true);
                        } else {
                            C87412m.m108603p("futureTask");
                            throw null;
                        }
                    }
                }
            } catch (Exception unused2) {
                Log.m105920e("MicroMsg.PluginCamera", "futureTask Exception");
            }
        } else {
            C87412m.m108603p("futureTask");
            throw null;
        }
    }
}
