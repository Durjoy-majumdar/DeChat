package com.tencent.p014mm.plugin.appbrand.page;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.appbrand.page.C83887q3;

/* renamed from: com.tencent.mm.plugin.appbrand.page.r3 */
public class C83906r3 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public int f244970d;

    /* renamed from: e */
    public final /* synthetic */ C83887q3.C83894f f244971e;

    public C83906r3(C83887q3.C83894f fVar) {
        this.f244971e = fVar;
    }

    public void onGlobalLayout() {
        C83887q3.C83894f fVar = this.f244971e;
        if (fVar.f244950a == null) {
            fVar.mo116476a();
            return;
        }
        int i = this.f244970d + 1;
        this.f244970d = i;
        if (i == 2) {
            fVar.mo116476a();
            ((C83887q3.C83894f.C83895a) this.f244971e.f244950a).run();
        }
    }
}
