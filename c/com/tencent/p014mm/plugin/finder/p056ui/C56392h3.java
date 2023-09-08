package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import gr1.C59664m2;
import gy3.C87412m;
import te3.C64689rq2;

/* renamed from: com.tencent.mm.plugin.finder.ui.h3 */
public final class C56392h3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161223d;

    /* renamed from: e */
    public final /* synthetic */ C64689rq2 f161224e;

    public C56392h3(FinderSelectCoverUI finderSelectCoverUI, C64689rq2 rq22) {
        this.f161223d = finderSelectCoverUI;
        this.f161224e = rq22;
    }

    public final void run() {
        C59664m2 m2Var = this.f161223d.f161089B;
        if (m2Var != null) {
            Bitmap bitmap = m2Var.getBitmap();
            if (bitmap != null) {
                FinderSelectCoverUI.m64622O7(this.f161223d, this.f161224e, bitmap);
                return;
            }
            return;
        }
        C87412m.m108603p("seeker");
        throw null;
    }
}
