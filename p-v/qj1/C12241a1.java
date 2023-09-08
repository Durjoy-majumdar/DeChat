package qj1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: qj1.a1 */
public final class C12241a1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C63151z0 f35314d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<String> f35315e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<Integer> f35316f;

    public C12241a1(C63151z0 z0Var, ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        this.f35314d = z0Var;
        this.f35315e = arrayList;
        this.f35316f = arrayList2;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f35314d.f179194r;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        int size = this.f35315e.size();
        for (int i = 0; i < size; i++) {
            Integer num = this.f35316f.get(i);
            C87412m.m108593f(num, "ids[i]");
            e0Var.mo107140d(num.intValue(), this.f35314d.f166287d.getContext().getResources().getColor(C0966R.color.f356948a24), this.f35315e.get(i));
        }
    }
}
