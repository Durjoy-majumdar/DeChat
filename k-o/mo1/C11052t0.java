package mo1;

import android.view.View;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import zp3.C23564m;

/* renamed from: mo1.t0 */
public final class C11052t0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ View f32806d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileHeaderUIC f32807e;

    public C11052t0(View view, FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32806d = view;
        this.f32807e = finderProfileHeaderUIC;
    }

    public void onChanged(Object obj) {
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        View view = this.f32806d;
        boolean z = true;
        int i = aVar != null && aVar.f12908a ? 0 : 8;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$initEditLayout$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$initEditLayout$1", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (aVar == null || !aVar.f12908a) {
            z = false;
        }
        if (z && this.f32806d.getVisibility() == 0) {
            C23564m.m28138h(this.f32806d, new C11050s0(aVar, this.f32807e));
        }
    }
}
