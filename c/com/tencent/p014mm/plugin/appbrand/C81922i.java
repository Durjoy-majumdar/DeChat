package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85978w1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import iy3.C60641c;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.appbrand.i */
public final class C81922i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Boolean[] f240274d;

    /* renamed from: e */
    public final /* synthetic */ C83928t1 f240275e;

    /* renamed from: f */
    public final /* synthetic */ View[] f240276f;

    /* renamed from: g */
    public final /* synthetic */ Long[] f240277g;

    public C81922i(Boolean[] boolArr, C83928t1 t1Var, View[] viewArr, Long[] lArr) {
        this.f240274d = boolArr;
        this.f240275e = t1Var;
        this.f240276f = viewArr;
        this.f240277g = lArr;
    }

    public final void run() {
        if (!this.f240274d[0].booleanValue()) {
            ViewGroup viewGroup = this.f240275e.f244552D;
            if (!(viewGroup instanceof ViewGroup)) {
                viewGroup = null;
            }
            if (viewGroup != null) {
                Context context = viewGroup.getContext();
                C87412m.m108593f(context, "parent.context");
                ProgressBar progressBar = new ProgressBar(new C85978w1(context, C0966R.style.f361689a61));
                Context context2 = progressBar.getContext();
                Object obj = C111105a.f332697a;
                progressBar.setIndeterminateDrawable(C111105a.C111110c.m151511b(context2, C0966R.C0969drawable.f357315an0));
                int b = C60641c.m70921b(progressBar.getContext().getResources().getDisplayMetrics().density * ((float) 36));
                progressBar.setLayoutParams(new ViewGroup.LayoutParams(b, b));
                C83928t1 t1Var = this.f240275e;
                View[] viewArr = this.f240276f;
                Long[] lArr = this.f240277g;
                Log.m105924i("MicroMsg.AppBrandEntryPageFastLoadHelper", "tryFastLoadEntryPage, show promptView, appId[" + t1Var.getRuntime().f238147j + ']');
                viewArr[0] = progressBar;
                lArr[0] = Long.valueOf(Util.currentTicks());
                t1Var.f244570T.mo125171e(progressBar, 10000);
                t1Var.getRuntime().mo113058h0();
            }
        }
    }
}
