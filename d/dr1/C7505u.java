package dr1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.FinderChooseOriginalView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fe1.C58965i;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: dr1.u */
public final class C7505u implements C58965i {

    /* renamed from: a */
    public final MMActivity f25757a;

    /* renamed from: b */
    public final FinderChooseOriginalView f25758b;

    public C7505u(MMActivity mMActivity, FinderChooseOriginalView finderChooseOriginalView) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderChooseOriginalView, "originalView");
        this.f25757a = mMActivity;
        this.f25758b = finderChooseOriginalView;
    }

    /* renamed from: b */
    public void mo8612b(Intent intent, Bundle bundle) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(bundle, "postData");
        View findViewById = this.f25757a.findViewById(C0966R.C0970id.bax);
        this.f25758b.setVisibility(8);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/upload/postui/FinderOriginalWidget", "onCreate", "(Landroid/content/Intent;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/upload/postui/FinderOriginalWidget", "onCreate", "(Landroid/content/Intent;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
