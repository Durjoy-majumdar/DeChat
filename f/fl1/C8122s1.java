package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import vk1.C65760a;
import xs1.C15883o;

/* renamed from: fl1.s1 */
public final class C8122s1 extends C87413o implements C32224a<C15883o> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26982d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8122s1(C65760a aVar) {
        super(0);
        this.f26982d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26982d.findViewById(C0966R.C0970id.f358244nf2);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_vote_card_root)");
        return new C15883o((ViewGroup) findViewById, this.f26982d);
    }
}
