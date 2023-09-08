package p964fd;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import p1066yc.C91415l;
import p1066yc.C91422r;
import p830xc.C91167d;

/* renamed from: fd.s */
public class C86842s implements C91422r {

    /* renamed from: a */
    public final /* synthetic */ C86826e f252104a;

    /* renamed from: fd.s$a */
    public class C86843a implements Runnable {

        /* renamed from: fd.s$a$a */
        public class C86844a implements Runnable {
            public C86844a() {
            }

            public void run() {
                C87760d dVar;
                if (C86842s.this.f252104a.f252038j1.get() && (dVar = C86842s.this.f252104a.f252033h) != null) {
                    dVar.setSurface((Surface) null);
                    if (!C86842s.this.f252104a.f252033h.isPlaying()) {
                        C86842s.this.f252104a.mo121270E(false, true);
                    }
                }
            }
        }

        public C86843a() {
        }

        public void run() {
            C86826e eVar = C86842s.this.f252104a;
            C86844a aVar = new C86844a();
            C91415l.C91416a aVar2 = C86826e.f251989o1;
            eVar.mo121276K(aVar);
        }
    }

    /* renamed from: fd.s$b */
    public class C86845b implements Runnable {
        public C86845b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
            r0 = r3.f252107d.f252104a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                fd.s r0 = p964fd.C86842s.this
                fd.e r0 = r0.f252104a
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f252038j1
                boolean r0 = r0.get()
                if (r0 == 0) goto L_0x000d
                return
            L_0x000d:
                fd.s r0 = p964fd.C86842s.this
                fd.e r0 = r0.f252104a
                in0.d r1 = r0.f252033h
                if (r1 == 0) goto L_0x002f
                android.view.Surface r0 = r0.f252031g
                r1.setSurface(r0)
                fd.s r0 = p964fd.C86842s.this
                fd.e r0 = r0.f252104a
                in0.d r0 = r0.f252033h
                boolean r0 = r0.isPlaying()
                if (r0 != 0) goto L_0x002f
                fd.s r0 = p964fd.C86842s.this
                fd.e r0 = r0.f252104a
                r1 = 0
                r2 = 1
                r0.mo121270E(r1, r2)
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p964fd.C86842s.C86845b.run():void");
        }
    }

    public C86842s(C86826e eVar) {
        this.f252104a = eVar;
    }

    /* renamed from: b */
    public void mo109549b() {
        Log.m105918d(this.f252104a.mo121291y(), "playVideo");
        if (this.f252104a.f252038j1.getAndSet(false)) {
            this.f252104a.mo121276K(new C86845b());
        }
    }

    /* renamed from: d */
    public void mo109550d() {
        Log.m105918d(this.f252104a.mo121291y(), "playAudio");
        if (!this.f252104a.f252038j1.getAndSet(true)) {
            C86826e eVar = this.f252104a;
            C86843a aVar = new C86843a();
            eVar.getClass();
            C86848v vVar = new C86848v(eVar, aVar);
            Log.m105924i(eVar.mo121291y(), "getSnapshotAsync");
            eVar.f252041m1 = vVar;
            Log.m105924i(eVar.mo121291y(), "takeScreenshot");
            C91167d.m114401b(eVar.f253973f, eVar.f253972e, eVar.f253971d);
            eVar.f252006Q0.postDelayed(aVar, 1000);
        }
    }
}
