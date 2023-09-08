package sl1;

import android.os.Bundle;
import d60.C58124b;
import dj1.C7339i0;
import gy3.C87412m;
import rl1.C13022d0;
import rx3.C13598b0;
import te3.C50617o01;

/* renamed from: sl1.f */
public final class C13725f implements C7339i0.C7340a {

    /* renamed from: a */
    public final /* synthetic */ C13717e f38824a;

    public C13725f(C13717e eVar) {
        this.f38824a = eVar;
    }

    /* renamed from: a */
    public void mo8508a(int i, int i2, String str, C50617o01 o012) {
        Class cls = C13022d0.class;
        C87412m.m108594g(o012, "resp");
        if (i == 0 && i2 == 0) {
            ((C13022d0) this.f38824a.f38801e.mo71262a(cls)).mo12537L3(o012.f138872d);
            ((C13022d0) this.f38824a.f38801e.mo71262a(cls)).mo12545l3(o012);
        }
        C58124b.C7172a.m7372a(this.f38824a.f38802f, C58124b.C58125b.FINDER_LIVE_LOTTERY_UPDATE, (Bundle) null, 2, (Object) null);
        C58124b bVar = this.f38824a.f38802f;
        C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_LOTTERY_CARD_SHOW;
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS", false);
        C13598b0 b0Var = C13598b0.f38549a;
        bVar.statusChange(bVar2, bundle);
    }
}
