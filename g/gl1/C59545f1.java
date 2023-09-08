package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62707db;
import vk1.C65761b;

/* renamed from: gl1.f1 */
public final class C59545f1 extends C87413o implements C32224a<C62707db> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170177d;

    /* renamed from: e */
    public final /* synthetic */ C65761b f170178e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59545f1(C59559k kVar, C65761b bVar) {
        super(0);
        this.f170177d = kVar;
        this.f170178e = bVar;
    }

    public Object invoke() {
        C62707db dbVar = this.f170177d.f170205G;
        if (dbVar != null) {
            return dbVar;
        }
        View findViewById = this.f170178e.findViewById(C0966R.C0970id.mrb);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…tream_tip_bubble_ui_stub)");
        return new C62707db((ViewGroup) findViewById, this.f170178e);
    }
}
