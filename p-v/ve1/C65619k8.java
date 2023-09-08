package ve1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kf1.C9833k9;
import ye1.C66634t;

/* renamed from: ve1.k8 */
public final class C65619k8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65626m8 f188817d;

    /* renamed from: e */
    public final /* synthetic */ C66634t f188818e;

    /* renamed from: f */
    public final /* synthetic */ C9833k9 f188819f;

    /* renamed from: g */
    public final /* synthetic */ int f188820g;

    public C65619k8(C65626m8 m8Var, C66634t tVar, C9833k9 k9Var, int i) {
        this.f188817d = m8Var;
        this.f188818e = tVar;
        this.f188819f = k9Var;
        this.f188820g = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C65626m8 m8Var = this.f188817d;
        Context context = view.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) context;
        Object tag = this.f188818e.f191605c.f191596a.getTag();
        C65626m8.m77313j(m8Var, mMActivity, tag instanceof FinderObject ? (FinderObject) tag : null, this.f188819f, 1, this.f188820g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
