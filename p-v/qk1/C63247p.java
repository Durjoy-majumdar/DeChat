package qk1;

import android.content.Context;
import android.view.View;
import er1.C58739j4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rp1.C63486a;
import te3.C51059r51;

/* renamed from: qk1.p */
public final class C63247p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63238n f179468d;

    /* renamed from: e */
    public final /* synthetic */ Context f179469e;

    /* renamed from: f */
    public final /* synthetic */ C51059r51 f179470f;

    public C63247p(C63238n nVar, Context context, C51059r51 r512) {
        this.f179468d = nVar;
        this.f179469e = context;
        this.f179470f = r512;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C63486a aVar = this.f179468d.f179458n;
        if (aVar != null) {
            Context context = this.f179469e;
            C87412m.m108593f(context, "context");
            aVar.mo87857U(context, this.f179470f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
