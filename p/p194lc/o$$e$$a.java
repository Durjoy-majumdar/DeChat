package p194lc;

/* renamed from: lc.o$$e$$a */
public final /* synthetic */ class o$$e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ o$$e f255483d;

    /* renamed from: e */
    public final /* synthetic */ int f255484e;

    /* renamed from: f */
    public final /* synthetic */ int f255485f;

    public /* synthetic */ o$$e$$a(o$$e o__e, int i, int i2) {
        this.f255483d = o__e;
        this.f255484e = i;
        this.f255485f = i2;
    }

    public final void run() {
        this.f255483d.onBackDone(this.f255484e, this.f255485f);
    }
}
