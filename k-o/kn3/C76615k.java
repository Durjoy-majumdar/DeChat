package kn3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import ln3.C76716j;
import mn3.C76796j;

/* renamed from: kn3.k */
public final class C76615k extends C61118a<C76716j> {

    /* renamed from: e */
    public final ChatTipsBarGroup.C74825d f224235e;

    public C76615k(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C76796j jVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        C87412m.m108594g(jVar, "processor");
        this.f224235e = dVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cwd;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: l */
    public void mo44e(C60905o oVar, C76716j jVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(jVar, "item");
        super.mo86076k(oVar, jVar, i, i2, z, list);
        FrameLayout frameLayout = (FrameLayout) oVar.mo85812D(C0966R.C0970id.fkf);
        frameLayout.removeAllViews();
        frameLayout.addView(jVar.f224444u.getView(), new ViewGroup.LayoutParams(-1, -2));
        View findViewById = jVar.f224444u.getView().findViewById(C0966R.C0970id.b8h);
        int i3 = 8;
        if (findViewById != null) {
            int i4 = this.f224235e.mo104003a() ? 8 : 0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i4));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById2 = jVar.f224444u.getView().findViewById(C0966R.C0970id.b8i);
        if (findViewById2 != null) {
            if (!this.f224235e.mo104003a()) {
                i3 = 0;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i3));
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/tipsbar/convert/SecurityTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/SecurityTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
