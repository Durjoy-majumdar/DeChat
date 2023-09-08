package on2;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C86497v5;
import nn2.C76942m;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: on2.f */
public class C35215f implements C86497v5.C31521b {

    /* renamed from: on2.f$a */
    public class C35216a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f94409d;

        /* renamed from: e */
        public final /* synthetic */ C35136m.C35137a f94410e;

        public C35216a(C35215f fVar, String str, C35136m.C35137a aVar) {
            this.f94409d = str;
            this.f94410e = aVar;
        }

        public void run() {
            C76942m.yx0().mo107498c(this.f94409d, this.f94410e.f94242a.f227638r, 0);
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (g == null || g.length() == 0) {
            Log.m105920e("ShakeCardEntranceMsgListener", "onReceiveMsg, ShakeCardEntranceMsg msgContent is null");
        } else {
            ((C76942m) C86312j.m106911c(C76942m.class)).f224856i.post(new C35216a(this, g, aVar));
        }
    }
}
