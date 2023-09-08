package com.tencent.p014mm.plugin.appbrand.p026ui;

import androidx.constraintlayout.widget.C16569a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.u1 */
public class C84680u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f247039d;

    public C84680u1(AppBrandProfileUI appBrandProfileUI) {
        this.f247039d = appBrandProfileUI;
    }

    public void run() {
        int height = this.f247039d.f246460s.getHeight();
        int height2 = this.f247039d.f246461t.getHeight();
        Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "relayout4ShowAppName, appIconHeight: %d, appNameHeight: %d", Integer.valueOf(height), Integer.valueOf(height2));
        if (height > height2) {
            C16569a aVar = new C16569a();
            aVar.mo16716c(this.f247039d.f246459r);
            aVar.mo16717d(C0966R.C0970id.i58, 3, 0, 3);
            aVar.mo16715b(C0966R.C0970id.i58, 4);
            aVar.mo16717d(C0966R.C0970id.f358975i63, 3, C0966R.C0970id.i58, 3);
            aVar.mo16717d(C0966R.C0970id.f358975i63, 4, C0966R.C0970id.i58, 4);
            ConstraintLayout constraintLayout = this.f247039d.f246459r;
            aVar.mo16714a(constraintLayout);
            constraintLayout.setConstraintSet((C16569a) null);
        }
    }
}
