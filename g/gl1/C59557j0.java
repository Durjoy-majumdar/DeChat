package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62843kb;
import vk1.C65761b;

/* renamed from: gl1.j0 */
public final class C59557j0 extends C87413o implements C32224a<C62843kb> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170196d;

    /* renamed from: e */
    public final /* synthetic */ C65761b f170197e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59557j0(C59559k kVar, C65761b bVar) {
        super(0);
        this.f170196d = kVar;
        this.f170197e = bVar;
    }

    public Object invoke() {
        C62843kb kbVar = this.f170196d.f170207I;
        if (kbVar != null) {
            return kbVar;
        }
        View findViewById = this.f170197e.findViewById(C0966R.C0970id.mt9);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.liv…ive_multi_player_ui_root)");
        return new C62843kb((ViewGroup) findViewById, this.f170197e);
    }
}
