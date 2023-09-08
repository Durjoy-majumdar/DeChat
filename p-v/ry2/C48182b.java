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

/* renamed from: ry2.b */
public final class C48182b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53170a f129138d;

    /* renamed from: e */
    public final /* synthetic */ C48177a f129139e;

    public C48182b(C53170a aVar, C48177a aVar2) {
        this.f129138d = aVar;
        this.f129139e = aVar2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C52657a aVar = (C52657a) this.f129138d.f173503E;
        C32228q<? super View, ? super Integer, ? super C52657a, C13598b0> qVar = this.f129139e.f129128g;
        if (qVar != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            Integer valueOf = Integer.valueOf(this.f129138d.mo17363j());
            C87412m.m108593f(aVar, "item");
            qVar.invoke(view, valueOf, aVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/conversation/adapter/TextStatusConversationAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
