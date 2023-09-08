package p927ab;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p1006mb.C88720a;
import p416qd.C89590b;
import p416qd.C89597g;
import p416qd.C89598h;
import p673r6.C89876b;

/* renamed from: ab.g */
public class C79485g {

    /* renamed from: a */
    public static final C88720a.C88721a f233045a = new C88720a.C88721a();

    /* renamed from: ab.g$a */
    public class C79486a implements Runnable {
        public C79486a() {
        }

        public void run() {
            C79485g gVar = C79485g.this;
            gVar.mo109478a();
            C79487h hVar = new C79487h(gVar);
            C89598h.f257791a = hVar;
            C89876b.f258326a = new C89597g(hVar);
        }
    }

    /* renamed from: a */
    public void mo109478a() {
        long currentTicks = Util.currentTicks();
        C89590b.m112027a();
        Log.m105925i("MicroMsg.MBLogDelegateRegistry", "dl: load magicbrush [%d]ms", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: b */
    public void mo109479b() {
        C88720a.C88721a aVar = f233045a;
        C79486a aVar2 = new C79486a();
        if (!aVar.f256077a) {
            boolean z = false;
            synchronized (C88720a.class) {
                if (!aVar.f256077a) {
                    z = true;
                    aVar.f256077a = true;
                }
            }
            if (z) {
                aVar2.run();
            }
        }
    }
}
