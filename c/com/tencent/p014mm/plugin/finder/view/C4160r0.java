package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.view.r0 */
public class C4160r0 extends BottomSheetBehavior.C0912c {

    /* renamed from: a */
    public final /* synthetic */ float f18390a;

    /* renamed from: b */
    public final /* synthetic */ float f18391b;

    /* renamed from: c */
    public final /* synthetic */ float f18392c;

    /* renamed from: d */
    public final /* synthetic */ C4191v0 f18393d;

    public C4160r0(C4191v0 v0Var, float f, float f2, float f3) {
        this.f18393d = v0Var;
        this.f18390a = f;
        this.f18391b = f2;
        this.f18392c = f3;
    }

    /* renamed from: a */
    public void mo837a(View view, float f) {
        float f2;
        float f3 = 0.0f;
        if (!Float.isNaN(f)) {
            boolean c = this.f18393d.mo5068c();
            float height = (float) view.getHeight();
            float max = Math.max(Math.min(Math.abs(c ? height * (1.0f - Math.abs(f)) : height * f) / this.f18390a, 1.0f), 0.0f);
            f3 = max;
            f2 = Math.max(Math.min((max - 0.5f) * 2.0f, 1.0f), 0.0f);
        } else {
            f2 = 0.0f;
        }
        Log.m105924i("MicroMsg.FinderBottomSheet", "onSlide " + f + ", percent:" + f3 + ", arrowPercent:" + f2);
        ViewGroup.LayoutParams layoutParams = this.f18393d.f18458C.getLayoutParams();
        float f4 = this.f18391b;
        layoutParams.height = (int) (f4 + (f3 * (this.f18392c - f4)));
        this.f18393d.f18458C.setLayoutParams(layoutParams);
        View view2 = this.f18393d.f18459D;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f2));
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderBottomSheet$3", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderBottomSheet$3", "onSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: b */
    public void mo838b(View view, int i) {
        Log.m105924i("MicroMsg.FinderBottomSheet", "onStateChanged " + i + ", isShowing:" + this.f18393d.f18461d.isShowing());
        if (i == 5 && this.f18393d.f18461d.isShowing()) {
            this.f18393d.mo5072g();
        }
        if (i == 4 && this.f18393d.mo5068c() && this.f18393d.f18461d.isShowing()) {
            this.f18393d.mo5072g();
        }
    }
}
