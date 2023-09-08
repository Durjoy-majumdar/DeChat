package mf1;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import mf1.C10846o0;
import pf1.C11920q;
import rf1.C12982a;

/* renamed from: mf1.j0 */
public final class C10829j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11920q f32340d;

    /* renamed from: e */
    public final /* synthetic */ C12982a f32341e;

    /* renamed from: f */
    public final /* synthetic */ C10846o0.C10847a f32342f;

    /* renamed from: g */
    public final /* synthetic */ View f32343g;

    public C10829j0(C11920q qVar, C12982a aVar, C10846o0.C10847a aVar2, View view) {
        this.f32340d = qVar;
        this.f32341e = aVar;
        this.f32342f = aVar2;
        this.f32343g = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$JumperInfoExListObserver$onChanged$1$2$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f32340d.f34848v) {
            C12982a aVar = this.f32341e;
            C60905o oVar = this.f32342f.f32402d;
            View view2 = this.f32343g;
            C87412m.m108593f(view2, "view");
            aVar.mo11090l(oVar, view2, this.f32340d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$JumperInfoExListObserver$onChanged$1$2$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
