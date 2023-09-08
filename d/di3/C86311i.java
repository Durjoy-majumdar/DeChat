package di3;

import di3.C86301e;
import java.util.concurrent.Callable;

/* renamed from: di3.i */
public class C86311i implements Callable<Void> {

    /* renamed from: d */
    public final /* synthetic */ C86301e f250982d;

    /* renamed from: e */
    public final /* synthetic */ Throwable f250983e;

    public C86311i(C86301e eVar, Throwable th) {
        this.f250982d = eVar;
        this.f250983e = th;
    }

    public Object call() {
        this.f250982d.setLastCallerStack(this.f250983e);
        C86312j.m106918j((C86301e) null, this.f250982d, C86301e.C86306e.ACTIVATED, true, true, false);
        return null;
    }
}
