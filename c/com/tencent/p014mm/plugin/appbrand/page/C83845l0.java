package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.menu.C83661d;
import com.tencent.p014mm.plugin.appbrand.menu.C83691t;
import com.tencent.p014mm.plugin.appbrand.menu.C83692u;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.menu.C83700z;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.List;
import java.util.Locale;
import l31.C61212e;
import nj3.C11183n0;
import qo3.C77407n;
import qq0.C89790a;
import wi0.C90972a;
import xq0.C91324b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.l0 */
public class C83845l0 extends C83835k0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.page.l0$c */
    public class C55542c implements C11183n0 {

        /* renamed from: a */
        public final /* synthetic */ C83928t1 f158146a;

        public C55542c(C83845l0 l0Var, C83928t1 t1Var) {
            this.f158146a = t1Var;
        }

        /* renamed from: a */
        public void mo2585a(View view, int i, MenuItem menuItem) {
            Class cls = C61212e.class;
            if (menuItem.getItemId() == 2) {
                ((C61212e) C86312j.m106911c(cls)).o30(view, "split_view_sheet_icon");
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(view, 40, 26430);
                ((C61212e) C86312j.m106911c(cls)).mo86176qF(view, "split_view_scene_info", this.f158146a.getAppId());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.l0$a */
    public class C83846a implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C83928t1 f244726a;

        public C83846a(C83845l0 l0Var, C83928t1 t1Var) {
            this.f244726a = t1Var;
        }

        public void onDismiss() {
            C84240s.m103840f(this.f244726a.getAppId(), this.f244726a.mo116162Q0(), 38, "", Util.nowSecond(), 1, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.l0$b */
    public class C83847b implements C77407n.C12924o {

        /* renamed from: a */
        public final /* synthetic */ C83928t1 f244727a;

        public C83847b(C83845l0 l0Var, C83928t1 t1Var) {
            this.f244727a = t1Var;
        }

        /* renamed from: a */
        public void mo2362a() {
            C84240s.m103840f(this.f244727a.getAppId(), this.f244727a.mo116162Q0(), 37, "", Util.nowSecond(), 1, 0);
        }
    }

    public C83845l0(C83928t1 t1Var, List<C83699y> list) {
        super(t1Var, list, true);
    }

    /* renamed from: k */
    public void mo116322k(C77407n nVar) {
        super.mo116322k(nVar);
        C83780d1 d1Var = this.f244703f;
        Context context = d1Var.getContext();
        C83928t1 t1Var = null;
        if (d1Var instanceof C83928t1) {
            t1Var = (C83928t1) d1Var;
        }
        if (context == null || t1Var == null) {
            Log.m105928w("MicroMsg.AppBrandPageActionSheetWC", "trySupportRecentForward, context or pageViewWC is null");
        } else {
            new C83942u4(context, t1Var, nVar, this);
        }
    }

    /* renamed from: l */
    public void mo116323l(C77407n nVar) {
        int i;
        AppBrandSysConfigWC S1;
        C83928t1 t1Var = (C83928t1) this.f244703f;
        if (t1Var.getRuntime().mo121254q1()) {
            nVar.f225774j1 = t1Var.mo116167V0() || t1Var.mo109677x();
            nVar.f225779n1 = t1Var.mo116167V0() || t1Var.mo109677x();
        } else {
            nVar.f225774j1 = t1Var.mo116167V0();
            nVar.f225779n1 = t1Var.mo116167V0();
        }
        nVar.f225761d = new C83846a(this, t1Var);
        nVar.f225802y = new C83847b(this, t1Var);
        nVar.f225795v = new C55542c(this, t1Var);
        C83700z zVar = C83700z.SHOW_CLICKABLE;
        C83928t1 t1Var2 = (C83928t1) this.f244703f;
        C89790a a = C89790a.C89791a.m112271a(t1Var2.getRuntime());
        boolean d = C83691t.m102732d(t1Var2);
        if (t1Var2.getRuntime().mo113210l1().mo111300k()) {
            i = 2;
        } else {
            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) t1Var2.getRuntime();
            i = appBrandRuntimeWC.mo121254q1() ? false : t1Var2.mo116163R0().startsWith(appBrandRuntimeWC.mo113008F().mo113983b()) ? 1 : 0;
        }
        int ordinal = C83661d.m102700c(t1Var2, t1Var2.getContext()).ordinal();
        int i2 = ordinal != 0 ? ordinal != 2 ? 1 : 0 : 2;
        int i3 = a.mo124074c() == 1 ? 1 : a.mo124074c() == 2 ? 2 : 0;
        boolean c = C83692u.m102735c(t1Var2);
        int i4 = C91324b.m114560a(t1Var2.getRuntime()) ? 1 : 2;
        AppBrandRuntimeWC J1 = t1Var2.getRuntime();
        int b = (J1 == null || (S1 = J1.mo113213o1()) == null) ? 0 : C90972a.m114132b(C90972a.ShowTradeComplaint, S1, 0, 2, (Object) null);
        Log.m105924i("MicroMsg.AppBrand.MenuDelegate_TradeComplaint", "getState, controlByte: " + b);
        C84240s.m103840f(t1Var2.getAppId(), t1Var2.mo116162Q0(), 28, String.format(Locale.US, "%d_%d_%d_%d_%d_%d_%d_%d", new Object[]{Integer.valueOf(d ? 1 : 0), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(c ? 1 : 0), 1, Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(zVar == (b == 1 ? zVar : C83700z.HIDDEN) ? 1 : 0)}), Util.nowSecond(), 1, 0);
    }
}
