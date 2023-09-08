package wn1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.order.p054ui.OrderTabView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60898l;
import jq3.C60905o;
import tn1.C14057l;

/* renamed from: wn1.j */
public final class C15561j implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ WxRecyclerAdapter<C14057l> f42162d;

    /* renamed from: e */
    public final /* synthetic */ OrderTabView f42163e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<C14057l> f42164f;

    /* renamed from: g */
    public final /* synthetic */ C15556f f42165g;

    public C15561j(WxRecyclerAdapter<C14057l> wxRecyclerAdapter, OrderTabView orderTabView, ArrayList<C14057l> arrayList, C15556f fVar) {
        this.f42162d = wxRecyclerAdapter;
        this.f42163e = orderTabView;
        this.f42164f = arrayList;
        this.f42165g = fVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        Object obj;
        RecyclerView.C16613e adapter;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        int c6 = i - this.f42162d.mo85796c6();
        String str = this.f42163e.f15853d;
        StringBuilder sb = new StringBuilder();
        sb.append("click item ");
        if (c6 < 0 || c6 >= this.f42164f.size()) {
            obj = "";
        } else {
            obj = this.f42164f.get(c6);
            C87412m.m108593f(obj, "dataList[clickPos]");
        }
        sb.append(obj);
        sb.append(" pos:");
        sb.append(c6);
        Log.m105924i(str, sb.toString());
        C14057l lVar = (C14057l) oVar.f173503E;
        if (lVar != null) {
            int i2 = lVar.f39432d;
            String str2 = this.f42163e.f15853d;
            Log.m105924i(str2, "select item hash:" + lVar.hashCode() + ", title:" + lVar.f39433e + ", selected:" + lVar.f39435g);
            Iterator<T> it = this.f42164f.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C14057l lVar2 = (C14057l) it.next();
                if (lVar2.f39432d != i2) {
                    z = false;
                }
                lVar2.f39435g = z;
            }
            WxRecyclerView recyclerView = this.f42163e.getRecyclerView();
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                OrderTabView orderTabView = this.f42163e;
                adapter.notifyItemRangeChanged(0, adapter.getItemCount(), 1);
                String str3 = orderTabView.f15853d;
                Log.m105924i(str3, "refresh itemCount:" + adapter.getItemCount());
            }
            this.f42165g.mo13888b(lVar);
        }
    }
}
