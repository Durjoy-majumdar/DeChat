package hl1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62993t9;

/* renamed from: hl1.j0 */
public final class C59984j0 extends C87413o implements C32224a<C62993t9> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<View> f171139d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f171140e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59984j0(C8479f0<View> f0Var, C56032b bVar) {
        super(0);
        this.f171139d = f0Var;
        this.f171140e = bVar;
    }

    public Object invoke() {
        View findViewById = ((View) this.f171139d.f27484d).findViewById(C0966R.C0970id.nem);
        C87412m.m108593f(findViewById, "rootView.findViewById<Li…_live_left_bubble_layout)");
        return new C62993t9((LinearBubbleAnimateContainer) findViewById, this.f171140e);
    }
}
