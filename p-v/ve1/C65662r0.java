package ve1;

import android.view.View;
import cm1.C55033u;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.r0 */
public final class C65662r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65592g0 f188939d;

    /* renamed from: e */
    public final /* synthetic */ C55033u f188940e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f188941f;

    public C65662r0(C65592g0 g0Var, C55033u uVar, C60905o oVar) {
        this.f188939d = g0Var;
        this.f188940e = uVar;
        this.f188941f = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f188939d.mo89669k(this.f188940e, this.f188941f, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
