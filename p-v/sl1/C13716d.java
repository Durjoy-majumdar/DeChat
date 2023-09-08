package sl1;

import al1.C0082q;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import rl1.C13022d0;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C52204z21;

/* renamed from: sl1.d */
public final class C13716d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64039c f38799d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13716d(C64039c cVar) {
        super(0);
        this.f38799d = cVar;
    }

    public Object invoke() {
        C52204z21 z212;
        Class cls = C13022d0.class;
        if (((C54991o) this.f38799d.mo87696x0(C54991o.class)).mo75999e4()) {
            C0082q qVar = (C0082q) C110818d0.m150916N(((C13022d0) this.f38799d.mo87696x0(cls)).f37097j);
            String str = null;
            C52204z21 z213 = qVar != null ? qVar.f509d : null;
            if (z213 != null && !Util.isNullOrNil(z213.f145640d)) {
                C13712a aVar = this.f38799d.f181571v;
                if (aVar != null) {
                    aVar.mo13087B(qVar);
                }
            } else if (!((C13022d0) this.f38799d.mo87696x0(cls)).f37097j.isEmpty()) {
                ((C13022d0) this.f38799d.mo87696x0(cls)).f37097j.removeFirst();
            }
            this.f38799d.mo88787a1();
            StringBuilder sb = new StringBuilder();
            sb.append("resumeLottery firstLotteryInfo id:");
            sb.append(z213 != null ? z213.f145640d : null);
            sb.append(",lottery id:");
            C0082q qVar2 = ((C13022d0) this.f38799d.mo87696x0(cls)).f37098n;
            if (!(qVar2 == null || (z212 = qVar2.f509d) == null)) {
                str = z212.f145640d;
            }
            sb.append(str);
            Log.m105924i("FinderLiveLotteryBubblePlugin", sb.toString());
        }
        return C13598b0.f38549a;
    }
}
