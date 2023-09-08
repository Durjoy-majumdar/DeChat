package ry2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p739wi.C53170a;
import uy2.C52660e;

/* renamed from: ry2.j */
public final class C48194j implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53170a f129164d;

    /* renamed from: e */
    public final /* synthetic */ C48189h f129165e;

    public C48194j(C53170a aVar, C48189h hVar) {
        this.f129164d = aVar;
        this.f129165e = hVar;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C52660e eVar = (C52660e) this.f129164d.f173503E;
        C32228q<? super View, ? super Integer, ? super C52660e, Boolean> qVar = this.f129165e.f129155g;
        if (qVar != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            Integer valueOf = Integer.valueOf(this.f129164d.mo17363j());
            C87412m.m108593f(eVar, "item");
            Boolean invoke = qVar.invoke(view, valueOf, eVar);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
