package jz1;

import com.tencent.p014mm.sdk.platformtools.Log;
import cz1.C7143c;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: jz1.r */
public final class C46624r extends C87413o implements C32227p<Boolean, C7143c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46615q f125564d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46624r(C46615q qVar) {
        super(2);
        this.f125564d = qVar;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C7143c cVar = (C7143c) obj2;
        C87412m.m108594g(cVar, "result");
        if (booleanValue) {
            C46595b bVar = this.f125564d.f125549b;
            bVar.getClass();
            C61926c.m72668M(new C46602f(bVar, cVar));
        } else {
            Log.m105920e("GameLife.ConversationPresenter", "bindConversation fail!");
        }
        return C13598b0.f38549a;
    }
}
