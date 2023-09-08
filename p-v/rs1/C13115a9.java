package rs1;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;
import pe3.C89349b;
import te3.C64586nn1;
import te3.C64788vx2;
import te3.C64858yi1;
import up1.C37521f;

/* renamed from: rs1.a9 */
public final class C13115a9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C2479n0.C2480a f37338d;

    /* renamed from: e */
    public final /* synthetic */ C13146c9 f37339e;

    public C13115a9(C2479n0.C2480a aVar, C13146c9 c9Var) {
        this.f37338d = aVar;
        this.f37339e = c9Var;
    }

    public final void onClick(View view) {
        C55718s0 s0Var;
        C64858yi1 yi12;
        C89349b bVar;
        Class cls = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C2479n0.C2480a aVar = this.f37338d;
        if (!(aVar == null || (s0Var = aVar.f12910c) == null || (yi12 = s0Var.f158585F) == null || (bVar = yi12.f186557r) == null)) {
            C13146c9 c9Var = this.f37339e;
            C64788vx2 vx22 = new C64788vx2();
            vx22.parseFrom(bVar.mo123703f());
            String str = vx22.f186009d;
            String str2 = vx22.f186010e;
            if (!(str == null || str2 == null)) {
                Activity context = c9Var.getContext();
                int i = vx22.f186011f;
                C37521f.f99374d.getClass();
                ((C58684b) C86312j.m106911c(C58684b.class)).vy0(context, str, str2, i, "", (Boolean) C37521f.f99232M4.mo60266n());
            }
            ((C58417y0) C86312j.m106911c(C58417y0.class)).vy0(5, 2, "");
        }
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("CreateFinderEntrance");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("CreateFinderEntrance");
        C13146c9 c9Var2 = this.f37339e;
        if (!(G5 == null || R5 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(c9Var2.getActivity());
            C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
