package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import gr1.C59664m2;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.o2 */
public final class C56407o2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161253d;

    public C56407o2(FinderSelectCoverUI finderSelectCoverUI) {
        this.f161253d = finderSelectCoverUI;
    }

    public final void run() {
        C59664m2 m2Var = this.f161253d.f161089B;
        if (m2Var != null) {
            Bitmap bitmap = m2Var.getBitmap();
            if (bitmap != null) {
                FinderSelectCoverUI finderSelectCoverUI = this.f161253d;
                finderSelectCoverUI.f161100M = true;
                FinderSelectCoverUI.m64623P7(finderSelectCoverUI, bitmap);
                return;
            }
            return;
        }
        C87412m.m108603p("seeker");
        throw null;
    }
}
