package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.finder.view.u0 */
public class C4183u0 extends BottomSheetBehavior.C0912c {

    /* renamed from: a */
    public final /* synthetic */ C4191v0 f18440a;

    public C4183u0(C4191v0 v0Var) {
        this.f18440a = v0Var;
    }

    /* renamed from: a */
    public void mo837a(View view, float f) {
    }

    /* renamed from: b */
    public void mo838b(View view, int i) {
        Log.m105924i("MicroMsg.FinderBottomSheet", "onStateChanged " + i + ", isShowing:" + this.f18440a.f18461d.isShowing());
        if (i == 4 && this.f18440a.mo5068c() && this.f18440a.f18461d.isShowing()) {
            this.f18440a.mo5072g();
        }
    }
}
