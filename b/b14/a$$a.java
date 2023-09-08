package b14;

import a14.C53883f1;

public final /* synthetic */ class a$$a implements C53883f1 {

    /* renamed from: d */
    public final /* synthetic */ C54392a f152595d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f152596e;

    public /* synthetic */ a$$a(C54392a aVar, Runnable runnable) {
        this.f152595d = aVar;
        this.f152596e = runnable;
    }

    public final void dispose() {
        C54392a aVar = this.f152595d;
        aVar.f152591e.removeCallbacks(this.f152596e);
    }
}
