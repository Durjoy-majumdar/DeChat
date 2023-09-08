package zu0;

/* renamed from: zu0.g */
public final class C23580g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23586p<Object> f67594d;

    /* renamed from: e */
    public final /* synthetic */ long f67595e;

    /* renamed from: f */
    public final /* synthetic */ C23583j<Object> f67596f;

    /* renamed from: g */
    public final /* synthetic */ long f67597g;

    public C23580g(C23586p<Object> pVar, long j, C23583j<Object> jVar, long j2) {
        this.f67594d = pVar;
        this.f67595e = j;
        this.f67596f = jVar;
        this.f67597g = j2;
    }

    public final void run() {
        this.f67596f.f67600a.put(Long.valueOf(this.f67597g), new C23585o(this.f67594d, this.f67594d.run(), this.f67595e));
        this.f67596f.f67604e.open();
    }
}
