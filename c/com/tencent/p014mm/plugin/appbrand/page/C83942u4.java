package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.menu.C83691t;
import com.tencent.p014mm.plugin.appbrand.menu.C83700z;
import com.tencent.p014mm.plugin.appbrand.utils.C55552j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import nj3.C61772i0;
import nj3.C76875f0;
import qo3.C77407n;
import wc3.C15133e0;

/* renamed from: com.tencent.mm.plugin.appbrand.page.u4 */
public final class C83942u4 {

    /* renamed from: b */
    public static final /* synthetic */ int f245078b = 0;

    /* renamed from: a */
    public final String f245079a;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.u4$a */
    public static final class C55543a implements C61772i0 {

        /* renamed from: a */
        public static final C55543a f158147a = new C55543a();

        /* renamed from: a */
        public final void mo77066a(ImageView imageView, C76875f0 f0Var) {
            try {
                C55552j jVar = C55552j.f158177a;
                C87412m.m108593f(imageView, "iconIv");
                String str = f0Var.f224730y;
                C87412m.m108593f(str, "menuItem.webUrl");
                jVar.mo77082a(imageView, str);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrand.SupportRecentForwardController", "attachAvatar for username:" + f0Var.f224730y + ", get exception:" + e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.u4$b */
    public static final class C55544b {

        /* renamed from: a */
        public final C83928t1 f158148a;

        /* renamed from: b */
        public final String f158149b = ("MicroMsg.AppBrand.SupportRecentForwardController.ReportLogic#" + hashCode());

        /* renamed from: c */
        public String f158150c = "";

        /* renamed from: d */
        public int f158151d = 1;

        public C55544b(Context context, C83928t1 t1Var, C83845l0 l0Var) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(t1Var, "pageView");
            C87412m.m108594g(l0Var, "actionSheetController");
            this.f158148a = t1Var;
            l0Var.f244708n = new C55545v4(this);
            ((HashSet) l0Var.f244707j).add(new C55546w4(this, context));
        }

        /* renamed from: a */
        public final void mo77067a(boolean z) {
            int i;
            if (z) {
                i = this.f158150c.length() > 0 ? 3 : 2;
            } else {
                i = 4;
            }
            this.f158151d = i;
            String str = this.f158149b;
            Log.m105924i(str, "doSomethingOnMenuClick, toUser: " + this.f158150c + ", exitType: " + this.f158151d);
        }
    }

    public C83942u4(Context context, C83928t1 t1Var, C77407n nVar, C83845l0 l0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(t1Var, "pageView");
        C87412m.m108594g(nVar, "actionSheet");
        C87412m.m108594g(l0Var, "actionSheetController");
        String str = "MicroMsg.AppBrand.SupportRecentForwardController#" + hashCode();
        this.f245079a = str;
        AppBrandRuntimeWC J1 = t1Var.getRuntime();
        boolean z = false;
        if (J1 != null && 1158 == J1.mo113208k1()) {
            Log.m105924i(str, "trySupportIfNeed, not need 1");
            return;
        }
        if (!(C83700z.SHOW_CLICKABLE == C83691t.m102731c(context, t1Var) ? true : z)) {
            Log.m105924i(str, "trySupportIfNeed, not need 2");
        } else if (nVar.f225770h1 != 0) {
            Log.m105924i(str, "trySupportIfNeed, not need 3");
        } else {
            C15133e0 e0Var = (C15133e0) C86312j.m106911c(C15133e0.class);
            C15133e0 Ct0 = e0Var != null ? e0Var.Ct0() : null;
            if (Ct0 == null) {
                Log.m105928w(str, "trySupportIfNeed, recentForwardMenuHelper is null");
                return;
            }
            C55544b bVar = new C55544b(context, t1Var, l0Var);
            nVar.f225778n = new C68630y4(Ct0, context, nVar, l0Var);
            nVar.f225789s = new C83985z4(Ct0, this, context, t1Var, bVar);
            nVar.f225791t = new C40500a5(Ct0, nVar);
        }
    }
}
