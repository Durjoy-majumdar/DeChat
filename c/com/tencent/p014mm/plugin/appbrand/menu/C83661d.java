package com.tencent.p014mm.plugin.appbrand.menu;

import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ai0.C79553f;
import ak0.C79584a;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82367d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82372d7;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82555k0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83039u;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import lp0.C88619a;
import nj3.C76874e0;
import or0.C11730n;
import or0.C11733o;
import wi0.C90972a;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.d */
public class C83661d extends C88619a<C83928t1> {

    /* renamed from: b */
    public final C83663b f244286b = new C83663b((C83662a) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.d$b */
    public static class C83663b implements C82555k0 {

        /* renamed from: a */
        public String f244287a = "";

        /* renamed from: b */
        public String f244288b = "";

        /* renamed from: c */
        public C83928t1 f244289c;

        public C83663b(C83662a aVar) {
        }

        /* renamed from: a */
        public void mo114878a(String str) {
            Log.m105925i("MicroMsg.MenuDelegate_CopyShortLink", "onReturnUrl %s", str);
            C84240s.m103840f(this.f244287a, this.f244288b, 47, "", Util.nowSecond(), str.isEmpty() ? 2 : 1, 0);
            C82372d7.f241423a.mo114778c(C82367d0.MP_SHORT_LINK, this);
            if (!str.isEmpty()) {
                C83928t1 t1Var = this.f244289c;
                C87412m.m108594g(t1Var, "pageView");
                C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C11733o(t1Var, str, (C15601d<? super C11733o>) null), 2, (Object) null);
            }
        }
    }

    public C83661d() {
        super(30);
    }

    /* renamed from: c */
    public static C83700z m102700c(C83928t1 t1Var, Context context) {
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        int a = S1 != null ? C90972a.CopyShortLink.mo125052a(S1) : 0;
        if (!((Boolean) ((C11730n.C11732b) C11730n.f34330b).invoke()).booleanValue() || a == 1) {
            return C83700z.HIDDEN;
        }
        if ((C83691t.m102732d(t1Var) && a == 0) || S1 == null || S1.f261072r.f238585d != 0) {
            if (!C79584a.f233382a.mo109700c(t1Var.getRuntime())) {
                Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
                if (!(context instanceof AppBrandAdUI)) {
                    return C83700z.SHOW_CLICKABLE;
                }
            }
        }
        return C83700z.SHOW_UNCLICKABLE;
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        int ordinal = m102700c((C83928t1) d1Var, context).ordinal();
        if (ordinal == 1) {
            e0Var.mo107144g(this.f255896a, context.getString(C0966R.string.f7644mh), C0966R.raw.app_brand_menu_copy_shortlink);
        } else if (ordinal == 2) {
            e0Var.mo107151k(this.f255896a, context.getString(C0966R.string.f7644mh), C0966R.raw.app_brand_menu_copy_shortlink, true);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C83663b bVar = this.f244286b;
        bVar.f244287a = str;
        bVar.f244288b = t1Var.mo116162Q0();
        C83663b bVar2 = this.f244286b;
        bVar2.f244289c = t1Var;
        C82372d7.f241423a.mo114777b(C82367d0.MP_SHORT_LINK, 10000, bVar2);
        new C83039u(true).mo115295s(t1Var.getComponentId(), t1Var.mo116160O0());
    }
}
