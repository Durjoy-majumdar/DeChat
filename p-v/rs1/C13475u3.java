package rs1;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import os1.C11739f;

/* renamed from: rs1.u3 */
public final class C13475u3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13457t3 f38192d;

    public C13475u3(C13457t3 t3Var) {
        this.f38192d = t3Var;
    }

    public final void onClick(View view) {
        Class cls = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$refreshSlideLeftTipsLayout$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$refreshSlideLeftTipsLayout$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$refreshSlideLeftTipsLayout$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f38192d.f38156i) {
            C11739f.C11740a c3 = ((C11739f) C39818r.f106831a.mo62446e(cls).mo75002a(C11739f.class)).mo11600c3(this.f38192d.f38153f);
            c3.f34376i = C11739f.C11742c.InCacheTime;
            c3.f34374g = System.currentTimeMillis();
            this.f38192d.f38156i = false;
        }
        C13457t3 t3Var = this.f38192d;
        t3Var.getClass();
        C39622i0 a = C39818r.f106831a.mo62444c(t3Var.getActivity()).mo75002a(FinderHomeUIC.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…inderHomeUIC::class.java)");
        Bundle bundle = new Bundle();
        bundle.putInt("Source", 4);
        ((FinderHomeUIC) a).mo5135k3(t3Var.f38153f, bundle);
        this.f38192d.getClass();
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
        Nx0.mo77263e("finder_tl_hot_tab", "onLeftSlide");
        Nx0.mo77239M5("finder_tl_hot_tab");
        this.f38192d.mo12883d3();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$refreshSlideLeftTipsLayout$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
