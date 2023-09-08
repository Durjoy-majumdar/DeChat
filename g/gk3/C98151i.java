package gk3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gk3.C98140g;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gk3.i */
public final class C98151i extends C87413o implements C32227p<C98140g.C98141a, C98140g.C98141a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C98140g f287763d;

    /* renamed from: e */
    public final /* synthetic */ int f287764e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98151i(C98140g gVar, int i) {
        super(2);
        this.f287763d = gVar;
        this.f287764e = i;
    }

    public Object invoke(Object obj, Object obj2) {
        C98140g.C98141a aVar = (C98140g.C98141a) obj;
        C98140g.C98141a aVar2 = (C98140g.C98141a) obj2;
        C87412m.m108594g(aVar, "action");
        C87412m.m108594g(aVar2, "targetAction");
        if (aVar.priority() < aVar2.priority() && this.f287763d.mo137425e(this.f287764e) == null) {
            Log.m105919d("MicroMsg.ImageScanButtonStatusManager", "alvinluo setHigherPriorityActionOverTime type: %d, targetType: %d", Integer.valueOf(this.f287764e), Integer.valueOf(aVar2.getType()));
            this.f287763d.mo137429i(aVar2.getType(), 4);
        }
        return C13598b0.f38549a;
    }
}
