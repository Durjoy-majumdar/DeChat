package com.tencent.p014mm.plugin.luckymoney.scaledLayout;

import android.content.Context;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.scaledLayout.ScaleLayoutManager */
public class ScaleLayoutManager extends ViewPagerLayoutManager {

    /* renamed from: P */
    public int f199402P;

    /* renamed from: Q */
    public float f199403Q;

    /* renamed from: R */
    public float f199404R;

    /* renamed from: S */
    public float f199405S;

    /* renamed from: T */
    public float f199406T;

    public ScaleLayoutManager(Context context, int i) {
        super(context, 0, false);
        assertNotInLayoutOrScroll((String) null);
        if (this.f53135M != Integer.MAX_VALUE) {
            this.f53135M = Integer.MAX_VALUE;
            removeAllViews();
        }
        assertNotInLayoutOrScroll((String) null);
        if (this.f53134L != -1) {
            this.f53134L = -1;
            removeAllViews();
        }
        this.f199402P = i;
        this.f199403Q = 0.8f;
        this.f199404R = 1.0f;
        this.f199405S = 1.0f;
        this.f199406T = 1.0f;
    }

    /* renamed from: f0 */
    public float mo23962f0() {
        float f = this.f199404R;
        if (f == 0.0f) {
            return Float.MAX_VALUE;
        }
        return 1.0f / f;
    }

    /* renamed from: j0 */
    public float mo23966j0() {
        return (float) (this.f199402P + this.f53138w);
    }

    /* renamed from: k0 */
    public void mo23967k0(View view, float f) {
        int i = this.f53141z;
        float abs = Math.abs((((float) i) + f) - ((float) i));
        float f2 = (float) this.f53138w;
        if (abs - f2 > 0.0f) {
            abs = f2;
        }
        float f3 = 1.0f - ((abs / f2) * (1.0f - this.f199403Q));
        view.setScaleX(f3);
        view.setScaleY(f3);
        float abs2 = Math.abs(f);
        float f4 = this.f199406T;
        float f5 = this.f199405S;
        float f6 = this.f53131I;
        float f7 = (((f4 - f5) / f6) * abs2) + f5;
        if (abs2 < f6) {
            f4 = f7;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f4));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/scaledLayout/ScaleLayoutManager", "setItemViewProperty", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/scaledLayout/ScaleLayoutManager", "setItemViewProperty", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
