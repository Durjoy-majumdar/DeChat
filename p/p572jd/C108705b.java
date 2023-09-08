package p572jd;

/* renamed from: jd.b */
public final class C108705b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108701a f325548d;

    /* renamed from: e */
    public final /* synthetic */ int f325549e;

    /* renamed from: f */
    public final /* synthetic */ int f325550f;

    public C108705b(C108701a aVar, int i, int i2) {
        this.f325548d = aVar;
        this.f325549e = i;
        this.f325550f = i2;
    }

    public final void run() {
        C108701a aVar = this.f325548d;
        int i = this.f325549e;
        int i2 = this.f325550f;
        aVar.getClass();
        if (i >= 0 && i2 >= 0 && i <= i2) {
            try {
                aVar.f325543w.setSelection(i, i2);
            } catch (Exception unused) {
            }
        }
    }
}
