package aa2;

import aa2.C112765c;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import n92.C117617a;
import p640ox.C77049b;
import te3.C110964i13;
import te3.C64272c13;
import te3.i25;
import v92.C65558a;

/* renamed from: aa2.e */
public final class C112774e implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C112765c f337685d;

    public C112774e(C112765c cVar) {
        this.f337685d = cVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        View view2;
        C64272c13 c132;
        RecyclerView.C16631z I0;
        View view3;
        RecyclerView.C16613e eVar2 = eVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        C112765c cVar = this.f337685d;
        cVar.getClass();
        boolean z = System.currentTimeMillis() - cVar.f337655f < cVar.f337654e;
        cVar.f337655f = System.currentTimeMillis();
        if (z) {
            Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "onItemClick: double click check");
            return;
        }
        int c6 = i - ((C60898l) eVar2).mo85796c6();
        if (c6 >= 0 && c6 < this.f337685d.f337657h.size()) {
            C65558a aVar = this.f337685d.f337657h.get(c6);
            C87412m.m108593f(aVar, "multiTaskInfoList[fixPos]");
            C65558a aVar2 = aVar;
            if (this.f337685d.f337657h.size() <= 2) {
                WxRecyclerView wxRecyclerView = this.f337685d.f337659j;
                view2 = (wxRecyclerView == null || (I0 = wxRecyclerView.mo17023I0(1)) == null || (view3 = I0.f44854d) == null) ? null : view3.findViewById(C0966R.C0970id.h3h);
            } else {
                view2 = this.f337685d.getRootView().findViewById(C0966R.C0970id.h3c);
            }
            View view4 = view2;
            C112765c.C112766a aVar3 = this.f337685d.f337664r;
            if (aVar3 != null) {
                aVar3.mo164526b(view4, view, c6, aVar2.f188631d, true);
            }
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).mo72346DT(context, 5);
            if (i132 != null && (c132 = i132.f332063j) != null) {
                Log.m105919d("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "Item Clicked, itemId: %s, pos: %s", aVar2.f188631d.field_id, Integer.valueOf(c6));
                String str = c132.f182354f;
                if (aVar2.f188631d.field_type == 2) {
                    i25 i25 = new i25();
                    try {
                        i25.parseFrom(aVar2.f188631d.field_data);
                    } catch (Exception unused) {
                    }
                    str = i25.f135051e;
                }
                C117617a.f351848a.mo182341c(aVar2.f188631d, i132.f332057d, (long) c6, 2, str);
            }
        }
    }
}
