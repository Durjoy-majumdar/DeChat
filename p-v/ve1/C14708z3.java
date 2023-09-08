package ve1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4167r7;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.z3 */
public final class C14708z3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f40657d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40658e;

    /* renamed from: f */
    public final /* synthetic */ C58969q f40659f;

    public C14708z3(View view, C60905o oVar, C58969q qVar) {
        this.f40657d = view;
        this.f40658e = oVar;
        this.f40659f = qVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFollowConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f40657d.getVisibility() == 0) {
            Context context = this.f40658e.f173499A;
            C87412m.m108593f(context, "holder.context");
            new C4167r7(context, this.f40659f.getUsername(), this.f40658e.mo17363j(), false, 0, 16, (C8480h) null).mo5050a(false, true, (FinderObject) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFollowConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
