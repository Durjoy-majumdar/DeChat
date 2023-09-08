package mf1;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import mf1.C10846o0;
import pf1.C11920q;
import rf1.C12982a;

/* renamed from: mf1.h0 */
public final class C10822h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12982a f32325d;

    /* renamed from: e */
    public final /* synthetic */ C10846o0.C10847a f32326e;

    /* renamed from: f */
    public final /* synthetic */ View f32327f;

    /* renamed from: g */
    public final /* synthetic */ C11920q f32328g;

    public C10822h0(C12982a aVar, C10846o0.C10847a aVar2, View view, C11920q qVar) {
        this.f32325d = aVar;
        this.f32326e = aVar2;
        this.f32327f = view;
        this.f32328g = qVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$JumperInfoExListObserver$onChanged$1$2$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C12982a aVar = this.f32325d;
        C60905o oVar = this.f32326e.f32402d;
        View view2 = this.f32327f;
        C87412m.m108593f(view2, "view");
        aVar.mo11090l(oVar, view2, this.f32328g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$JumperInfoExListObserver$onChanged$1$2$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
