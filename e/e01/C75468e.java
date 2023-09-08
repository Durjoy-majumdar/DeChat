package e01;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import h01.C76095a;
import i01.C76253c;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: e01.e */
public final class C75468e implements C76095a {

    /* renamed from: a */
    public final /* synthetic */ C107075a f221781a;

    /* renamed from: e01.e$a */
    public static final class C75469a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C107075a f221782d;

        /* renamed from: e */
        public final /* synthetic */ C76253c f221783e;

        public C75469a(C107075a aVar, C76253c cVar) {
            this.f221782d = aVar;
            this.f221783e = cVar;
        }

        public final void run() {
            C32226l<? super C76253c, C13598b0> lVar = this.f221782d.f320513s;
            if (lVar != null) {
                lVar.invoke(this.f221783e);
            }
        }
    }

    public C75468e(C107075a aVar) {
        this.f221781a = aVar;
    }

    /* renamed from: a */
    public void mo105812a(C76253c cVar) {
        C87412m.m108594g(cVar, "errCode");
        Log.m105918d("MicroMsg.ScreenCastManager", "onConnected errCode:" + cVar);
        C107075a aVar = this.f221781a;
        aVar.f320512r = cVar;
        ((C119157j) C119157j.f356862d).mo183895z(new C75469a(aVar, cVar));
    }
}
