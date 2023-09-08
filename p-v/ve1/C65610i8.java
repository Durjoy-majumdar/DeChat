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

/* renamed from: ve1.i8 */
public final class C65610i8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65626m8 f188796d;

    /* renamed from: e */
    public final /* synthetic */ C66634t f188797e;

    /* renamed from: f */
    public final /* synthetic */ C9833k9 f188798f;

    /* renamed from: g */
    public final /* synthetic */ int f188799g;

    public C65610i8(C65626m8 m8Var, C66634t tVar, C9833k9 k9Var, int i) {
        this.f188796d = m8Var;
        this.f188797e = tVar;
        this.f188798f = k9Var;
        this.f188799g = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C65626m8 m8Var = this.f188796d;
        Context context = view.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) context;
        Object tag = this.f188797e.f191603a.f191596a.getTag();
        C65626m8.m77313j(m8Var, mMActivity, tag instanceof FinderObject ? (FinderObject) tag : null, this.f188798f, 1, this.f188799g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
