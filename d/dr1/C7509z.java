package dr1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bd1.C54446b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.FinderChooseNewsView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58784w3;
import fe1.C58965i;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: dr1.z */
public final class C7509z implements C58965i {

    /* renamed from: a */
    public final MMActivity f25764a;

    /* renamed from: b */
    public final FinderChooseNewsView f25765b;

    public C7509z(MMActivity mMActivity, FinderChooseNewsView finderChooseNewsView) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderChooseNewsView, "newsView");
        this.f25764a = mMActivity;
        this.f25765b = finderChooseNewsView;
    }

    /* renamed from: b */
    public void mo8612b(Intent intent, Bundle bundle) {
        Bundle bundle2 = bundle;
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(bundle2, "postData");
        View findViewById = this.f25764a.findViewById(C0966R.C0970id.bav);
        C58784w3 w3Var = C58784w3.f168295a;
        w3Var.getClass();
        C66785b bVar = C66785b.f191882e;
        boolean z = false;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        boolean z2 = ((a != null ? a.field_extFlag : 0) & 8192) != 0;
        int i = 8;
        this.f25765b.setVisibility(z2 ? 0 : 8);
        if (z2) {
            i = 0;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/upload/postui/FinderSetNewsFeedWidget", "onCreate", "(Landroid/content/Intent;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/upload/postui/FinderSetNewsFeedWidget", "onCreate", "(Landroid/content/Intent;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        w3Var.getClass();
        C54446b a2 = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        if ((((a2 != null ? a2.field_extFlag : 0) & 8192) != 0) && this.f25765b.mo4423a()) {
            z = true;
        }
        bundle2.putBoolean("isNews", z);
    }
}
