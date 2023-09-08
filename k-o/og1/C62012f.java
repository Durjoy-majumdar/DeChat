package og1;

import a14.C53973z1;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: og1.f */
public final class C62012f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FrameBubbleContentLayout f176282d;

    /* renamed from: e */
    public final /* synthetic */ LinearBubbleAnimateContainer f176283e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62012f(FrameBubbleContentLayout frameBubbleContentLayout, LinearBubbleAnimateContainer linearBubbleAnimateContainer) {
        super(0);
        this.f176282d = frameBubbleContentLayout;
        this.f176283e = linearBubbleAnimateContainer;
    }

    public Object invoke() {
        Log.m105924i("LinearBubbleAnimateContainer", "requestBubbleShow curContent: " + this.f176282d);
        if (this.f176283e.f159283e.contains(this.f176282d)) {
            Log.m105924i("LinearBubbleAnimateContainer", "requestBubbleShow is doing job return, curContent: " + this.f176282d);
        } else {
            FrameBubbleContentLayout frameBubbleContentLayout = this.f176282d;
            if (frameBubbleContentLayout.f159272i == 2) {
                frameBubbleContentLayout.setVisibility(0);
            } else if (!this.f176283e.f159282d.contains(frameBubbleContentLayout)) {
                this.f176283e.f159282d.offer(this.f176282d);
                C53973z1 z1Var = this.f176283e.f159285g;
                if (z1Var != null ? z1Var.mo74530c() : true) {
                    LinearBubbleAnimateContainer.m63732b(this.f176283e);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
