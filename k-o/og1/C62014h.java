package og1;

import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: og1.h */
public final class C62014h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinearBubbleAnimateContainer f176287d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62014h(LinearBubbleAnimateContainer linearBubbleAnimateContainer) {
        super(0);
        this.f176287d = linearBubbleAnimateContainer;
    }

    public Object invoke() {
        FrameBubbleContentLayout pop = this.f176287d.f159282d.pop();
        if (pop != null) {
            LinearBubbleAnimateContainer linearBubbleAnimateContainer = this.f176287d;
            linearBubbleAnimateContainer.f159283e.add(pop);
            linearBubbleAnimateContainer.f159285g = C53895h.m60466d(linearBubbleAnimateContainer.getScope(), (C66212f) null, (C53934p0) null, new C62013g(linearBubbleAnimateContainer, pop, (C15601d<? super C62013g>) null), 3, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
