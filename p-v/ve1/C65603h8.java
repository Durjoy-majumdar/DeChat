package ve1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kf1.C9833k9;

/* renamed from: ve1.h8 */
public final class C65603h8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65626m8 f188769d;

    /* renamed from: e */
    public final /* synthetic */ C9833k9 f188770e;

    /* renamed from: f */
    public final /* synthetic */ int f188771f;

    public C65603h8(C65626m8 m8Var, C9833k9 k9Var, int i) {
        this.f188769d = m8Var;
        this.f188770e = k9Var;
        this.f188771f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C65626m8 m8Var = this.f188769d;
        Context context = view.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C65626m8.m77313j(m8Var, (MMActivity) context, (FinderObject) null, this.f188770e, 4, this.f188771f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
