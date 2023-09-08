package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import vk1.C65760a;
import xs1.C66420d;

/* renamed from: fl1.h1 */
public final class C59191h1 extends C87413o implements C32224a<C66420d> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169304d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59191h1(C65760a aVar) {
        super(0);
        this.f169304d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169304d.findViewById(C0966R.C0970id.nez);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_vote_bubble_root)");
        return new C66420d((ViewGroup) findViewById, this.f169304d);
    }
}
