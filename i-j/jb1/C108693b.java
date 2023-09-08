package jb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import jb1.C108680a;

/* renamed from: jb1.b */
public class C108693b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f325514d;

    /* renamed from: e */
    public final /* synthetic */ int f325515e;

    /* renamed from: f */
    public final /* synthetic */ int f325516f;

    /* renamed from: g */
    public final /* synthetic */ boolean f325517g;

    /* renamed from: h */
    public final /* synthetic */ int f325518h;

    /* renamed from: i */
    public final /* synthetic */ int f325519i;

    /* renamed from: j */
    public final /* synthetic */ int f325520j;

    /* renamed from: n */
    public final /* synthetic */ Runnable f325521n;

    /* renamed from: o */
    public final /* synthetic */ C108680a f325522o;

    /* renamed from: jb1.b$a */
    public class C108694a implements Runnable {

        /* renamed from: jb1.b$a$a */
        public class C108695a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f325524d;

            public C108695a(long j) {
                this.f325524d = j;
            }

            public void run() {
                synchronized (C108693b.this.f325522o.f325470b) {
                    Log.m105925i("MicroMsg.FaceVideoRecorder", "hy: connect cost %s ms", Long.valueOf(Util.ticksToNow(this.f325524d)));
                    long currentTicks = Util.currentTicks();
                    C108680a aVar = C108693b.this.f325522o;
                    aVar.f325469a = aVar.f325483o.mo158188a();
                    C108680a aVar2 = C108693b.this.f325522o;
                    aVar2.f325469a.mo159615m(aVar2.f325480l);
                    C108680a aVar3 = C108693b.this.f325522o;
                    aVar3.f325469a.mo159630x(aVar3.f325481m);
                    C108693b.this.f325522o.f325469a.mo159629w(true);
                    C108693b bVar = C108693b.this;
                    C108680a aVar4 = bVar.f325522o;
                    aVar4.f325469a.mo159612i(aVar4.f325478j, aVar4.f325479k, bVar.f325519i, bVar.f325520j);
                    C108680a aVar5 = C108693b.this.f325522o;
                    aVar5.f325469a.mo159618p(aVar5.f325473e);
                    C108680a aVar6 = C108693b.this.f325522o;
                    aVar6.f325469a.mo159606e(aVar6.f325485q);
                    C108693b.this.f325522o.f325469a.setMute(true);
                    C108693b.this.f325522o.f325472d = C108680a.C108691g.INITIALIZED;
                    Log.m105925i("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", Long.valueOf(Util.ticksToNow(currentTicks)));
                    Runnable runnable = C108693b.this.f325521n;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        }

        public C108694a() {
        }

        public void run() {
            C108693b.this.f325522o.f325482n.mo135257a(new C108695a(Util.currentTicks()));
        }
    }

    public C108693b(C108680a aVar, int i, int i2, int i3, boolean z, int i4, int i5, int i6, Runnable runnable) {
        this.f325522o = aVar;
        this.f325514d = i;
        this.f325515e = i2;
        this.f325516f = i3;
        this.f325517g = z;
        this.f325518h = i4;
        this.f325519i = i5;
        this.f325520j = i6;
        this.f325521n = runnable;
    }

    public void run() {
        C108680a aVar;
        int i = this.f325514d;
        if (i == 90 || i == 270) {
            Log.m105924i("MicroMsg.FaceVideoRecorder", "hy: need make width and height upside down");
            C108680a aVar2 = this.f325522o;
            aVar2.f325478j = this.f325515e;
            aVar2.f325479k = this.f325516f;
        } else {
            C108680a aVar3 = this.f325522o;
            aVar3.f325478j = this.f325516f;
            aVar3.f325479k = this.f325515e;
        }
        synchronized (this.f325522o.f325470b) {
            aVar = this.f325522o;
            aVar.f325473e = this.f325514d;
            aVar.f325474f = this.f325517g;
            aVar.f325475g = this.f325518h;
        }
        C108680a.m147398a(aVar);
        C108680a.m147399b(this.f325522o);
        C108680a.m147400c(this.f325522o);
        MMHandlerThread.postToMainThread(new C108694a());
    }
}
