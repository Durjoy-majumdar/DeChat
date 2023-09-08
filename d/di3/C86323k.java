package di3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.support.feature_service.ServiceNotFoundException;
import di3.C86301e;
import java.util.concurrent.Callable;

/* renamed from: di3.k */
public class C86323k implements Callable<C7335d> {

    /* renamed from: d */
    public final /* synthetic */ Class f251017d;

    /* renamed from: e */
    public final /* synthetic */ boolean f251018e;

    public C86323k(Class cls, boolean z) {
        this.f251017d = cls;
        this.f251018e = z;
    }

    public Object call() {
        Throwable th;
        C86301e eVar;
        C86301e eVar2 = null;
        try {
            C86301e eVar3 = (C86301e) C86312j.f250985b.mo58019d(this.f251017d);
            ThreadLocal<C86301e> threadLocal = C86312j.f250996m;
            eVar = threadLocal.get();
            try {
                threadLocal.set(eVar3);
                C86312j.m106918j(eVar, eVar3, C86301e.C86306e.INITIALIZED, this.f251018e, false, false);
                threadLocal.set(eVar);
                return eVar3;
            } catch (ServiceNotFoundException e) {
                e = e;
                try {
                    Log.printErrStackTrace("MicroMsg.ServiceManager", e, "[-] Fail to get feature service instance of '%s'", this.f251017d.getName());
                    C86312j.f250996m.set(eVar);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    eVar2 = eVar;
                    C86312j.f250996m.set(eVar2);
                    throw th;
                }
            }
        } catch (ServiceNotFoundException e2) {
            e = e2;
            eVar = null;
            Log.printErrStackTrace("MicroMsg.ServiceManager", e, "[-] Fail to get feature service instance of '%s'", this.f251017d.getName());
            C86312j.f250996m.set(eVar);
            return null;
        } catch (Throwable th5) {
            th = th5;
            C86312j.f250996m.set(eVar2);
            throw th;
        }
    }
}
