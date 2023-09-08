package ve1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0730f2;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import er1.C7878t0;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;

/* renamed from: ve1.p8 */
public final class C14606p8 extends C60896i<C0730f2> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.abx;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C0730f2 f2Var = (C0730f2) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(f2Var, "item");
        ((TextView) oVar2.mo85812D(C0966R.C0970id.ecs)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar2.f173499A, f2Var.f1743d.f141617d));
        ((TextView) oVar2.mo85812D(C0966R.C0970id.ecr)).setText(oVar2.f173499A.getString(C0966R.string.eej, new Object[]{C7878t0.m8034c(2, f2Var.f1743d.f141619f)}));
        if (i == 0) {
            View D = oVar2.mo85812D(C0966R.C0970id.ecq);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderTopicFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderTopicFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderTopicFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderTopicFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
