package fl1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62993t9;
import vk1.C65760a;

/* renamed from: fl1.z0 */
public final class C59245z0 extends C87413o implements C32224a<C62993t9> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169400d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59245z0(C65760a aVar) {
        super(0);
        this.f169400d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169400d.findViewById(C0966R.C0970id.nem);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…_live_left_bubble_layout)");
        return new C62993t9((LinearBubbleAnimateContainer) findViewById, this.f169400d);
    }
}
