package ve1;

import android.view.View;
import cm1.C55033u;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.p0 */
public final class C65633p0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65592g0 f188851d;

    /* renamed from: e */
    public final /* synthetic */ C55033u f188852e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f188853f;

    public C65633p0(C65592g0 g0Var, C55033u uVar, C60905o oVar) {
        this.f188851d = g0Var;
        this.f188852e = uVar;
        this.f188853f = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f188851d.mo89669k(this.f188852e, this.f188853f, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
