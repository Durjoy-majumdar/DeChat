package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.finder.view.x */
public final class C4203x implements C7020t0 {

    /* renamed from: d */
    public final /* synthetic */ C4213y f18498d;

    public C4203x(C4213y yVar) {
        this.f18498d = yVar;
    }

    /* renamed from: Q1 */
    public final void mo531Q1(int i, boolean z) {
        String str = this.f18498d.f18509F;
        Log.m105924i(str, "KeyboardHeightObserver " + i + ' ' + z);
        View view = this.f18498d.f36927f;
        if (view != null) {
            view.setPadding(0, 0, 0, i);
        }
    }
}
