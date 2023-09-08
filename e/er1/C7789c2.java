package er1;

import android.view.View;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: er1.c2 */
public final class C7789c2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ View f26290d;

    public C7789c2(View view) {
        this.f26290d = view;
    }

    public void onChanged(Object obj) {
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        View view = this.f26290d;
        boolean z = true;
        if (aVar == null || !aVar.f12908a) {
            z = false;
        }
        int i = z ? 0 : 4;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderPosterCenterUtil$initEntrance$2", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/utils/FinderPosterCenterUtil$initEntrance$2", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
