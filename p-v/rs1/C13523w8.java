package rs1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kd1.C60999e;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C50119ke1;
import te3.C64586nn1;
import up1.C37521f;

/* renamed from: rs1.w8 */
public final class C13523w8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f38353d;

    /* renamed from: e */
    public final /* synthetic */ boolean f38354e;

    public C13523w8(C13146c9 c9Var, boolean z) {
        this.f38353d = c9Var;
        this.f38354e = z;
    }

    public final void onClick(View view) {
        Class cls = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13146c9 c9Var = this.f38353d;
        String str = C13146c9.f37394Q;
        c9Var.getClass();
        C49712hj1 hj12 = null;
        int i = C60999e.f173723a.mo85970a((Long) null, 5) ? 9 : c9Var.f37404I ? 4 : c9Var.f37405J ? 15 : 3;
        C58408t0 t0Var = C58408t0.f167336a;
        t0Var.mo83261g(false, i);
        t0Var.mo83266l(i, false);
        t0Var.mo83264j(C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond());
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("TLCamera");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("TLCamera");
        C58784w3 w3Var = C58784w3.f168295a;
        C13146c9 c9Var2 = this.f38353d;
        C58739j4 j4Var = C58739j4.f168176a;
        if (!(R5 == null || G5 == null)) {
            C37521f.f99374d.getClass();
            int i2 = C37521f.f99420i1.mo60266n().intValue() == 1 ? 0 : 1;
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(c9Var2.getActivity());
            C58417y0.Nx0(y0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, 2, 2, 1, i2, 0, (String) null, (String) null, 0, f != null ? f.mo12861q3() : null, 0, 0, 3520, (Object) null);
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8 f2 = aVar.mo12873f(c9Var2.getActivity());
            if (f2 != null) {
                hj12 = f2.mo12861q3();
            }
            C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 2, hj12, 0, (String) null, 0, 0, 480, (Object) null);
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("TLCamera");
        Intent intent = new Intent();
        if (this.f38354e) {
            intent.putExtra("key_create_scene", 4);
        } else {
            intent.putExtra("key_create_scene", 2);
        }
        C50119ke1 ke12 = this.f38353d.f37412e;
        if (ke12 != null) {
            intent.putExtra("key_prepare_resp", ke12.toByteArray());
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13297zc(this.f38353d.getActivity(), intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
