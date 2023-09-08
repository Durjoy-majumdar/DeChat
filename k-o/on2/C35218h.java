package on2;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C86497v5;
import nn2.C76942m;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: on2.h */
public class C35218h implements C86497v5.C31521b {

    /* renamed from: on2.h$a */
    public class C35219a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f94414d;

        /* renamed from: e */
        public final /* synthetic */ C35136m.C35137a f94415e;

        public C35219a(C35218h hVar, String str, C35136m.C35137a aVar) {
            this.f94414d = str;
            this.f94415e = aVar;
        }

        public void run() {
            C76942m.yx0().mo107498c(this.f94414d, this.f94415e.f94242a.f227638r, 1);
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (g == null || g.length() == 0) {
            Log.m105920e("ShakeCardRedDotMsgListener", "onReceiveMsg, ShakeCardRedDotMsg msgContent is null");
        } else {
            ((C76942m) C86312j.m106911c(C76942m.class)).f224856i.post(new C35219a(this, g, aVar));
        }
    }
}
