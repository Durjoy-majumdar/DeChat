package d60;

import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: d60.n1 */
public final class C58191n1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C58169j1 f166649d;

    /* renamed from: e */
    public final /* synthetic */ int f166650e;

    /* renamed from: f */
    public final /* synthetic */ int f166651f;

    /* renamed from: g */
    public final /* synthetic */ int f166652g;

    public C58191n1(C58169j1 j1Var, int i, int i2, int i3) {
        this.f166649d = j1Var;
        this.f166650e = i;
        this.f166651f = i2;
        this.f166652g = i3;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f166649d.f166619v;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        C77407n nVar2 = this.f166649d.f166619v;
        e0Var.clear();
        String string = this.f166649d.f166607g.getResources().getString(this.f166650e);
        C87412m.m108593f(string, "context.resources.getString(title)");
        e0Var.mo107144g(2, string, this.f166651f);
        e0Var.mo107140d(1, this.f166649d.f166607g.getResources().getColor(C0966R.color.f356948a24), this.f166649d.f166607g.getResources().getString(this.f166652g));
    }
}
