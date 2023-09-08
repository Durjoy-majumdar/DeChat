package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bu0.C79819c;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x$$j */
public final class x$$j extends RelativeLayout implements C79819c.C79828h {

    /* renamed from: d */
    public final /* synthetic */ C83966x f245146d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x$$j(C83966x xVar, Context context) {
        super(context);
        this.f245146d = xVar;
    }

    /* renamed from: M */
    public void mo110017M(C79819c cVar, boolean z) {
        this.f245146d.f245122P.bringToFront();
    }

    /* renamed from: V */
    public void mo110018V(C79819c cVar, boolean z) {
        FrameLayout frameLayout;
        C83966x xVar = this.f245146d;
        if (!xVar.f245129W && (frameLayout = xVar.f245124R) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f245146d.f245124R.getLayoutParams();
            if (Build.VERSION.SDK_INT < 23 || layoutParams.getRule(2) != this.f245146d.f245122P.getId()) {
                layoutParams.addRule(2, this.f245146d.f245122P.getId());
                layoutParams.removeRule(12);
                this.f245146d.f245124R.requestLayout();
            }
        }
    }

    /* renamed from: d0 */
    public void mo110019d0(C79819c cVar, boolean z) {
    }

    /* renamed from: u */
    public void mo110020u(C79819c cVar, boolean z) {
        FrameLayout frameLayout;
        if (z && !"top".equals(this.f245146d.getContainer().getAppConfig().mo113985d().f239638a) && (frameLayout = this.f245146d.f245124R) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f245146d.f245124R.getLayoutParams();
            layoutParams.removeRule(2);
            layoutParams.addRule(12);
            this.f245146d.f245122P.bringToFront();
            this.f245146d.f245124R.requestLayout();
        }
    }
}
