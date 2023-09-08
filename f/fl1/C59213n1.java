package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62868l6;
import vk1.C65760a;

/* renamed from: fl1.n1 */
public final class C59213n1 extends C87413o implements C32224a<C62868l6> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169358d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59213n1(C65760a aVar) {
        super(0);
        this.f169358d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169358d.findViewById(C0966R.C0970id.ddm);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_anchor_ui_root)");
        return new C62868l6((ViewGroup) findViewById, this.f169358d);
    }
}
