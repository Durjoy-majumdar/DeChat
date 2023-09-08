package fh1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54741c;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: fh1.d2 */
public final class C59010d2 implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f168836d;

    public C59010d2(C59018f2 f2Var) {
        this.f168836d = f2Var;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        if (oVar.f44859i != 1 || this.f168836d.f168889y.size() <= 0) {
            return false;
        }
        ArrayList<C9493c> arrayList = this.f168836d.f168889y;
        C9493c cVar = arrayList.get(i % arrayList.size());
        C54741c cVar2 = cVar instanceof C54741c ? (C54741c) cVar : null;
        if (cVar2 == null || cVar2.f153440d.jumpinfo_type == 3) {
            return false;
        }
        C59018f2.m68934F3(this.f168836d, cVar2, true);
        return false;
    }
}
