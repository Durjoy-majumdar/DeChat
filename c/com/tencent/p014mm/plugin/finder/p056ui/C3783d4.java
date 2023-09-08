package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import gy3.C87412m;
import lu3.C34379c;
import zp3.C23555k;

/* renamed from: com.tencent.mm.plugin.finder.ui.d4 */
public final class C3783d4 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ FinderShareFeedRelUI f17258a;

    public C3783d4(FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f17258a = finderShareFeedRelUI;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (!z) {
            C34379c<?> cVar = this.f17258a.f17156X0;
            if (cVar != null) {
                cVar.cancel(false);
            }
            this.f17258a.f17156X0 = null;
        }
    }
}
