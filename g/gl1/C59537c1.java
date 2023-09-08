package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63108xd;
import vk1.C65761b;

/* renamed from: gl1.c1 */
public final class C59537c1 extends C87413o implements C32224a<C63108xd> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170166d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59537c1(C65761b bVar) {
        super(0);
        this.f170166d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170166d.findViewById(C0966R.C0970id.no7);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.live_rehearsal_bubble)");
        return new C63108xd((ViewGroup) findViewById, this.f170166d);
    }
}
