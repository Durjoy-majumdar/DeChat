package cn1;

import an1.C0089b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import te3.C49712hj1;
import ym1.C16052a;

/* renamed from: cn1.d */
public final class C0818d implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C0089b f1916d;

    /* renamed from: e */
    public final /* synthetic */ C0814c f1917e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<WxRecyclerView> f1918f;

    public C0818d(C0089b bVar, C0814c cVar, C8479f0<WxRecyclerView> f0Var) {
        this.f1916d = bVar;
        this.f1917e = cVar;
        this.f1918f = f0Var;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        String str;
        int i2 = i;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        int c6 = ((WxRecyclerAdapter) eVar).mo85796c6();
        if (i2 >= c6) {
            int i3 = i2 - c6;
            C0740i2 i2Var = this.f1916d.f526e.get(i3);
            C87412m.m108593f(i2Var, "item.feedDataList[pos]");
            C0740i2 i2Var2 = i2Var;
            C0814c cVar = this.f1917e;
            C49712hj1 hj12 = cVar.f1906f;
            if (hj12 == null || (str = hj12.f134672f) == null) {
                str = "";
            }
            String str2 = str;
            C16052a aVar = cVar.f1905e;
            if (aVar != null) {
                ArrayList<C0740i2> arrayList = this.f1916d.f526e;
                T t = this.f1918f.f27484d;
                C87412m.m108593f(t, "recyclerView");
                C16052a.m14952f(aVar, i2Var2, i, i3, view, arrayList, str2, (RecyclerView) t, 4, (Bundle) null, (C0740i2) null, 768, (Object) null);
            }
        }
    }
}
