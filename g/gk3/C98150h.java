package gk3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gk3.C98140g;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gk3.h */
public final class C98150h extends C87413o implements C32227p<C98140g.C98141a, C98140g.C98141a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C98140g f287762d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98150h(C98140g gVar) {
        super(2);
        this.f287762d = gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C98140g.C98141a aVar = (C98140g.C98141a) obj;
        C98140g.C98141a aVar2 = (C98140g.C98141a) obj2;
        C87412m.m108594g(aVar, "action");
        C87412m.m108594g(aVar2, "targetAction");
        if (aVar.priority() > aVar2.priority()) {
            Log.m105919d("MicroMsg.ImageScanButtonStatusManager", "alvinluo cancelLowerPriorityAction type: %d, targetActionType: %d", Integer.valueOf(aVar.getType()), Integer.valueOf(aVar2.getType()));
            this.f287762d.mo137422b(aVar2.getType());
        }
        return C13598b0.f38549a;
    }
}
