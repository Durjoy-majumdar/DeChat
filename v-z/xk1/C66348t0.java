package xk1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import er1.C58777u0;
import gy3.C87412m;
import java.util.HashSet;
import java.util.List;
import qk1.C63193a;
import sk1.C63948b;
import te3.C50030js1;
import zp3.C23555k;

/* renamed from: xk1.t0 */
public final class C66348t0 extends C23555k.C23558c {

    /* renamed from: a */
    public final HashSet<String> f190981a = new HashSet<>();

    /* renamed from: d */
    public boolean mo777d() {
        return true;
    }

    /* renamed from: e */
    public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
        C63948b bVar;
        String str;
        C87412m.m108594g(view, "parent");
        C87412m.m108594g(list, "exposedHolders");
        for (RecyclerView.C16631z zVar : list) {
            C63193a.C63194a aVar = zVar instanceof C63193a.C63194a ? (C63193a.C63194a) zVar : null;
            if (!(aVar == null || (bVar = aVar.f179297C) == null)) {
                C50030js1 js12 = bVar.f181275d.f137024e;
                boolean z = true;
                if (js12 == null || js12.f136294q != 1) {
                    z = false;
                }
                if (z && js12 != null && (str = js12.f136284d) != null && !this.f190981a.contains(str)) {
                    this.f190981a.add(str);
                    C58777u0.f168283a.mo83838g(4, str);
                }
            }
        }
    }
}
