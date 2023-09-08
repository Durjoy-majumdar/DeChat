package ey0;

import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ey0.c */
public final class C7949c extends C60896i<C7948a> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.crx;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C7948a aVar = (C7948a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        View D = oVar.mo85812D(C0966R.C0970id.mny);
        int i3 = 8;
        ((ProgressBar) oVar.mo85812D(C0966R.C0970id.mnz)).setVisibility(aVar.f26636f ? 0 : 8);
        if (!aVar.f26636f) {
            i3 = 0;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i3));
        View view = D;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageFootConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageDataItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageFootConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/userinfo/ui/BizServiceManageDataItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
