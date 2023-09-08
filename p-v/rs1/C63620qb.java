package rs1;

import android.view.View;
import hp1.C60055x0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.qb */
public final class C63620qb implements C60055x0.C60059d {

    /* renamed from: a */
    public final /* synthetic */ C63625rb f180384a;

    public C63620qb(C63625rb rbVar) {
        this.f180384a = rbVar;
    }

    /* renamed from: a */
    public void mo9549a(int i) {
        if (i == 0) {
            View c3 = this.f180384a.mo88465c3();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(c3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(c3, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View d3 = this.f180384a.mo88466d3();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(d3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(d3, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
