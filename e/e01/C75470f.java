package e01;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import h01.C76095a;
import i01.C76253c;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: e01.f */
public final class C75470f implements C76095a {

    /* renamed from: a */
    public final /* synthetic */ C107075a f221784a;

    /* renamed from: e01.f$a */
    public static final class C75471a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C107075a f221785d;

        /* renamed from: e */
        public final /* synthetic */ C76253c f221786e;

        public C75471a(C107075a aVar, C76253c cVar) {
            this.f221785d = aVar;
            this.f221786e = cVar;
        }

        public final void run() {
            C32226l<? super C76253c, C13598b0> lVar = this.f221785d.f320513s;
            if (lVar != null) {
                lVar.invoke(this.f221786e);
            }
        }
    }

    public C75470f(C107075a aVar) {
        this.f221784a = aVar;
    }

    /* renamed from: a */
    public void mo105812a(C76253c cVar) {
        C87412m.m108594g(cVar, "errCode");
        Log.m105918d("MicroMsg.ScreenCastManager", "onConnected errCode:" + cVar);
        C107075a aVar = this.f221784a;
        aVar.f320512r = cVar;
        ((C119157j) C119157j.f356862d).mo183895z(new C75471a(aVar, cVar));
    }
}
