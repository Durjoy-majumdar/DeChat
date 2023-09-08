package com.tencent.p014mm.plugin.appbrand.menu;

import ai0.C79553f;
import ak0.C79584a;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.weishi.C84905f;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import lp0.C88619a;
import nj3.C76874e0;
import wi0.C90972a;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.t */
public class C83691t extends C88619a<C83928t1> {
    public C83691t() {
        super(3);
    }

    /* renamed from: c */
    public static C83700z m102731c(Context context, C83928t1 t1Var) {
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        if (S1 != null && C90972a.ShareToFriend.mo125052a(S1) == 1) {
            return C83700z.HIDDEN;
        }
        if (m102732d(t1Var)) {
            Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
            if (!(context instanceof AppBrandAdUI)) {
                if (!C79584a.f233382a.mo109700c(t1Var.getRuntime())) {
                    return C83700z.SHOW_CLICKABLE;
                }
            }
        }
        return C83700z.SHOW_UNCLICKABLE;
    }

    /* renamed from: d */
    public static boolean m102732d(C83928t1 t1Var) {
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        if ((S1 != null && S1.f261072r.f238585d == 0 && C90972a.ShareToFriend.mo125052a(S1) == 2) || t1Var.mo116155J0(3) == null) {
            return false;
        }
        return !t1Var.mo116155J0(3).f244319c;
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        int ordinal = m102731c(context, (C83928t1) d1Var).ordinal();
        if (ordinal == 1) {
            e0Var.mo107146h(this.f255896a, context.getString(C0966R.string.a78), C0966R.raw.icons_filled_share, context.getResources().getColor(C0966R.color.f2939n));
        } else if (ordinal == 2) {
            e0Var.mo107150j(this.f255896a, context.getString(C0966R.string.a78), C0966R.raw.icons_filled_share, context.getResources().getColor(C0966R.color.f2939n), true);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C84240s.m103840f(str, t1Var.mo116162Q0(), 39, "", Util.nowSecond(), 1, 0);
        if (C84905f.m104620a(t1Var.getRuntime())) {
            C83657c0.m102698a(t1Var, yVar);
        } else {
            C83657c0.m102699b(context, t1Var, yVar, (Runnable) null);
        }
    }
}
