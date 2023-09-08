package qj1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;
import qo3.C77407n;

/* renamed from: qj1.d1 */
public final class C12279d1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C63151z0 f35375d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<String> f35376e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<Integer> f35377f;

    public C12279d1(C63151z0 z0Var, ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        this.f35375d = z0Var;
        this.f35376e = arrayList;
        this.f35377f = arrayList2;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f35375d.f179194r;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        int size = this.f35376e.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                Integer num = this.f35377f.get(i);
                C87412m.m108593f(num, "ids[i]");
                ((C76875f0) e0Var.mo107142f(num.intValue(), this.f35376e.get(i))).f224721p = this.f35375d.f166287d.getContext().getString(C0966R.string.e5t);
            } else {
                Integer num2 = this.f35377f.get(i);
                C87412m.m108593f(num2, "ids[i]");
                e0Var.mo107142f(num2.intValue(), this.f35376e.get(i));
            }
        }
    }
}
