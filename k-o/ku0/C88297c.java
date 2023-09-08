package ku0;

/* renamed from: ku0.c */
public final class C88297c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88288a f255237d;

    /* renamed from: e */
    public final /* synthetic */ boolean f255238e;

    public C88297c(C88288a aVar, boolean z) {
        this.f255237d = aVar;
        this.f255238e = z;
    }

    public final void run() {
        this.f255237d.f255207e.mo33721o(this.f255238e);
        C88288a aVar = this.f255237d;
        aVar.f255207e.setSurface(this.f255238e ? null : aVar.f255213n);
    }
}
