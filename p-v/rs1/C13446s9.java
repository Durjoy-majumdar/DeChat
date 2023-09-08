package rs1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2473k0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.p056ui.FinderConversationUI;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58363h;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C87412m;
import ht1.C60152b4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import te3.C64586nn1;
import zc1.C66785b;

/* renamed from: rs1.s9 */
public final class C13446s9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f38116d;

    public C13446s9(C13146c9 c9Var) {
        this.f38116d = c9Var;
    }

    public final void onClick(View view) {
        Class cls = C58417y0.class;
        Class cls2 = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$sendMsgLayoutClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C66785b bVar = C66785b.f191882e;
        String O5 = bVar.mo90662O5();
        C55718s0 i = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77269i("finder_private_msg_entrance", O5);
        C64586nn1 o2 = i != null ? i.mo77308o2("finder_private_msg_entrance") : null;
        C13146c9 c9Var = this.f38116d;
        String str = C13146c9.f37394Q;
        String f3 = c9Var.mo12650f3(o2);
        if (i != null && i.field_ctrInfo.f144670e == 1007) {
            AppCompatActivity activity = this.f38116d.getActivity();
            C13146c9 c9Var2 = this.f38116d;
            ((C58417y0) C86312j.m106911c(cls)).dy0(activity, c9Var2.f37429y, c9Var2.f37427w, 2, 6, true, 0, f3, O5);
            if (o2 != null) {
                C58413v0 v0Var = C58413v0.f167346a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f38116d.getActivity());
                C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, i, o2, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
            }
        } else {
            if (!(i != null && i.field_ctrInfo.f144670e == 1006)) {
                if (!(i != null && i.field_ctrInfo.f144670e == 2)) {
                    AppCompatActivity activity2 = this.f38116d.getActivity();
                    C13146c9 c9Var3 = this.f38116d;
                    ((C58417y0) C86312j.m106911c(cls)).dy0(activity2, c9Var3.f37429y, c9Var3.f37427w, 2, 6, false, 0, f3, O5);
                }
            }
            int i2 = o2 != null ? o2.f184503e : 0;
            AppCompatActivity activity3 = this.f38116d.getActivity();
            C13146c9 c9Var4 = this.f38116d;
            C64586nn1 nn12 = o2;
            ((C58417y0) C86312j.m106911c(cls)).dy0(activity3, c9Var4.f37429y, c9Var4.f37427w, 2, 6, true, (long) i2, f3, O5);
            if (nn12 != null) {
                C58413v0 v0Var2 = C58413v0.f167346a;
                C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f38116d.getActivity());
                C58413v0.m67781i(v0Var2, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, i, nn12, 3, f2 != null ? f2.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
            }
        }
        C58363h.f167138b.mo70925c(2, 0, bVar.mo90662O5());
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0();
        C87412m.m108594g(O5, "username");
        C60152b4.C8759a.m8563c(Nx0, "finder_private_msg_entrance", C2473k0.f12938d, false, O5, 4, (Object) null);
        AppCompatActivity activity4 = this.f38116d.getActivity();
        ((FinderCommonFeatureService) C86312j.m106911c(cls2)).getClass();
        C87412m.m108594g(activity4, "context");
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        C58684b bVar2 = (C58684b) c;
        Intent intent = new Intent();
        intent.putExtra("KEY_TALKER_TYPE", 1);
        intent.putExtra("KEY_TALKER_SCENE", 2);
        C13442s8.f38060Q0.mo12871c(activity4, intent);
        intent.setClass(activity4, FinderConversationUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = activity4;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderConversationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity4.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderConversationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$sendMsgLayoutClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
