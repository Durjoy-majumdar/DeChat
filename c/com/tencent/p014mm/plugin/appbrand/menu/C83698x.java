package com.tencent.p014mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import com.huawei.easygo.sdk.EasyGo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import lp0.C88619a;
import nj3.C76874e0;
import oa1.C117731d;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.x */
public class C83698x extends C88619a<C83928t1> {

    /* renamed from: c */
    public static Boolean f244315c;

    /* renamed from: b */
    public EasyGo f244316b = null;

    public C83698x() {
        super(2);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        if (f244315c == null) {
            try {
                if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_fold_appbrand_split_screen", "1", false, true), 1) > 0) {
                    Log.m105924i("MicroMsg.MenuDelegate_splitScreen", "isOpenSplitScreen!!");
                    f244315c = new Boolean(true);
                } else {
                    f244315c = new Boolean(false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MenuDelegate_splitScreen", e, "isOpenSplitScreen", new Object[0]);
                f244315c = new Boolean(false);
            }
        }
        if (f244315c.booleanValue()) {
            if (this.f244316b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f244316b = new EasyGo(applicationContext);
            }
            this.f244316b.init(new String[]{"magicwindow"});
            if (t1Var.getRuntime().mo113210l1().mo111300k()) {
                return;
            }
            if (C85875k4.m106154K(t1Var.mo116146A0().getTaskId()) || C85875k4.m106199o0()) {
                if (C85875k4.m106197n0() && C85875k4.m106154K(t1Var.mo116146A0().getTaskId())) {
                    if (C85875k4.m106209x(t1Var.mo116146A0().getTaskId())) {
                        e0Var.mo107144g(this.f255896a, context.getString(C0966R.string.bfn), C0966R.raw.icons_outlined_merge);
                    } else {
                        e0Var.mo107144g(this.f255896a, context.getString(C0966R.string.f361404jm3), C0966R.raw.icons_outlined_sperated);
                    }
                }
                if (C85875k4.m106199o0() && C85875k4.m106208w()) {
                    if (C85861e4.m106115b(t1Var.mo116146A0())) {
                        e0Var.mo107144g(this.f255896a, context.getString(C0966R.string.bfn), C0966R.raw.icons_outlined_merge);
                    } else {
                        e0Var.mo107144g(this.f255896a, context.getString(C0966R.string.f361404jm3), C0966R.raw.icons_outlined_sperated);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        Activity A0 = ((C83928t1) d1Var).mo116146A0();
        C85878m2.m106216e(A0.getTaskId(), (C85878m2.C85879a) null);
        C85861e4.m106119f(A0, false, true, (C85861e4.C85862a) null);
    }
}
