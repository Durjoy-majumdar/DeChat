package d60;

import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: d60.f */
public final class C7193f implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C7184e f25191d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<String> f25192e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<Integer> f25193f;

    public C7193f(C7184e eVar, ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        this.f25191d = eVar;
        this.f25192e = arrayList;
        this.f25193f = arrayList2;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f25191d.f25174g;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        int size = this.f25192e.size();
        for (int i = 0; i < size; i++) {
            Integer num = this.f25193f.get(i);
            C87412m.m108593f(num, "ids[i]");
            e0Var.mo107140d(num.intValue(), this.f25191d.f166287d.getContext().getResources().getColor(C0966R.color.f356948a24), this.f25192e.get(i));
        }
    }
}
