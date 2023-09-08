package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;

/* renamed from: cj1.b4 */
public final class C54739b4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C54847z3 f153438d;

    /* renamed from: e */
    public final /* synthetic */ C45795b f153439e;

    public C54739b4(C54847z3 z3Var, C45795b bVar) {
        this.f153438d = z3Var;
        this.f153439e = bVar;
    }

    public final void run() {
        Log.m105924i("MicroMsg.FinderLivePollingService", "init " + this.f153438d.mo75797c());
        this.f153438d.f153757f = this.f153439e;
    }
}
