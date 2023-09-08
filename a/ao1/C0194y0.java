package ao1;

import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ao1.y0 */
public final class C0194y0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f669d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0194y0(PostMainUIC postMainUIC) {
        super(1);
        this.f669d = postMainUIC;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            KeyboardHeightProvider keyboardHeightProvider = this.f669d.f160255I;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104021d();
            } else {
                C87412m.m108603p("keyboardHeightProvider");
                throw null;
            }
        } else {
            KeyboardHeightProvider keyboardHeightProvider2 = this.f669d.f160255I;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            } else {
                C87412m.m108603p("keyboardHeightProvider");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
