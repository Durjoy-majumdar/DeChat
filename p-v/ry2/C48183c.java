package ry2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p739wi.C53170a;
import rx3.C13598b0;
import uy2.C52657a;

/* renamed from: ry2.c */
public final class C48183c implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53170a f129140d;

    /* renamed from: e */
    public final /* synthetic */ C48177a f129141e;

    public C48183c(C53170a aVar, C48177a aVar2) {
        this.f129140d = aVar;
        this.f129141e = aVar2;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C52657a aVar = (C52657a) this.f129140d.f173503E;
        C32228q<? super View, ? super Integer, ? super C52657a, C13598b0> qVar = this.f129141e.f129129h;
        if (qVar != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            Integer valueOf = Integer.valueOf(this.f129140d.mo17363j());
            C87412m.m108593f(aVar, "item");
            qVar.invoke(view, valueOf, aVar);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
