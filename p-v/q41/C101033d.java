package q41;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.support.CancellationSignal;
import f40.C86709a0;
import gy3.C87412m;
import java.util.concurrent.Future;
import qh3.C89661b;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: q41.d */
public final class C101033d<T> implements C89661b.C89662a {

    /* renamed from: d */
    public static final C101033d<T> f295823d = new C101033d<>();

    /* renamed from: a */
    public void mo123994a(C89661b.C89663b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        if (C86709a0.m107522a()) {
            C101028a aVar = C101028a.f295813d;
            C87412m.m108593f(bool, "v");
            boolean booleanValue = bool.booleanValue();
            synchronized (aVar) {
                if (booleanValue) {
                    try {
                        if (C101028a.f295815f == null) {
                            Log.m105924i("MicroMsg.DBLeafBackup", "Enqueue DB leaf backup.");
                            C101028a.f295814e = new CancellationSignal();
                            C119157j jVar = (C119157j) C119157j.f356862d;
                            jVar.getClass();
                            C101028a.f295815f = jVar.mo183889t(aVar, 300000, (String) null);
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!booleanValue && C101028a.f295815f != null) {
                    Log.m105924i("MicroMsg.DBLeafBackup", "Cancel DB leaf backup.");
                    CancellationSignal cancellationSignal = C101028a.f295814e;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                    if (!C101028a.f295816g) {
                        Future<?> future = C101028a.f295815f;
                        if (future != null) {
                            future.cancel(false);
                        }
                        C101028a.f295814e = null;
                        C101028a.f295815f = null;
                    } else {
                        Log.m105924i("MicroMsg.DBLeafBackup", "Test cancel, cancellation delayed.");
                    }
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }
}
