package gl1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62993t9;
import vk1.C65761b;

/* renamed from: gl1.a0 */
public final class C59530a0 extends C87413o implements C32224a<C62993t9> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170152d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59530a0(C65761b bVar) {
        super(0);
        this.f170152d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170152d.findViewById(C0966R.C0970id.nem);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…_live_left_bubble_layout)");
        return new C62993t9((LinearBubbleAnimateContainer) findViewById, this.f170152d);
    }
}
