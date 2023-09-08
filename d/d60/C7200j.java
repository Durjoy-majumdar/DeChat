package d60;

import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: d60.j */
public final class C7200j implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C7197i f25210d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<String> f25211e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<Integer> f25212f;

    public C7200j(C7197i iVar, ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        this.f25210d = iVar;
        this.f25211e = arrayList;
        this.f25212f = arrayList2;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f25210d.f25205o;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        int size = this.f25211e.size();
        for (int i = 0; i < size; i++) {
            Integer num = this.f25212f.get(i);
            C87412m.m108593f(num, "ids[i]");
            e0Var.mo107140d(num.intValue(), this.f25210d.f25200g.getResources().getColor(C0966R.color.f356948a24), this.f25211e.get(i));
        }
    }
}
