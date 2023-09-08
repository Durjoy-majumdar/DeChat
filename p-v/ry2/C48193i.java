package ry2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p739wi.C53170a;
import rx3.C13598b0;
import uy2.C52660e;

/* renamed from: ry2.i */
public final class C48193i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53170a f129162d;

    /* renamed from: e */
    public final /* synthetic */ C48189h f129163e;

    public C48193i(C53170a aVar, C48189h hVar) {
        this.f129162d = aVar;
        this.f129163e = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C52660e eVar = (C52660e) this.f129162d.f173503E;
        C32228q<? super View, ? super Integer, ? super C52660e, C13598b0> qVar = this.f129163e.f129154f;
        if (qVar != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            Integer valueOf = Integer.valueOf(this.f129162d.mo17363j());
            C87412m.m108593f(eVar, "item");
            qVar.invoke(view, valueOf, eVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusGreetingAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
