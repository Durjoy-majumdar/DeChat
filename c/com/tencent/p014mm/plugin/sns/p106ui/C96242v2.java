package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1057w2.C90885a;
import zp3.C79406f;

/* renamed from: com.tencent.mm.plugin.sns.ui.v2 */
public class C96242v2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C96271w2 f281228d;

    public C96242v2(C96271w2 w2Var) {
        this.f281228d = w2Var;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
        if (C96177r2.m123262b(this.f281228d.f281337k) == null || C96177r2.m123266f(this.f281228d.f281337k) == null || C96177r2.m123268h(this.f281228d.f281337k) == null || C96177r2.m123268h(this.f281228d.f281337k).alphaAnimBtnInfo == null) {
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
            return;
        }
        C96177r2 r2Var = this.f281228d.f281337k;
        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        boolean k = r2Var.mo133799k();
        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (!k) {
            C96177r2 r2Var2 = this.f281228d.f281337k;
            int color = C96177r2.m123262b(r2Var2).getResources().getColor(C0966R.color.f3616z);
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            StateListDrawable j = r2Var2.mo133798j((float) C79406f.m96347a(C96177r2.m123262b(this.f281228d.f281337k), 4.0f), color);
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            C96177r2.m123266f(this.f281228d.f281337k).setBackground(j);
            C96177r2.m123266f(this.f281228d.f281337k).setTextColor(C96177r2.m123262b(this.f281228d.f281337k).getResources().getColor(C0966R.color.f3617a0));
            Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl", "btn is not enable!");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
            return;
        }
        float f = 0.0f;
        if (valueAnimator != null) {
            try {
                f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SnsAdCardActionBtnCtrl", e.toString());
            }
        }
        int color2 = C96177r2.m123262b(this.f281228d.f281337k).getResources().getColor(C0966R.color.f3144gt);
        C96177r2 r2Var3 = this.f281228d.f281337k;
        int c = C96177r2.m123263c(r2Var3, color2, C96177r2.m123268h(r2Var3).btnDarkColor, C96177r2.m123268h(this.f281228d.f281337k).btnColor);
        C96177r2 r2Var4 = this.f281228d.f281337k;
        C96177r2.m123266f(this.f281228d.f281337k).setTextColor(C90885a.m113999d(c, C96177r2.m123263c(r2Var4, color2, C96177r2.m123268h(r2Var4).alphaAnimBtnInfo.f275671e, C96177r2.m123268h(this.f281228d.f281337k).alphaAnimBtnInfo.f275669c), f));
        int color3 = C96177r2.m123262b(this.f281228d.f281337k).getResources().getColor(C0966R.color.f3024cj);
        int color4 = C96177r2.m123262b(this.f281228d.f281337k).getResources().getColor(C0966R.color.f3025p);
        C96177r2 r2Var5 = this.f281228d.f281337k;
        int c2 = C96177r2.m123263c(r2Var5, color3, C96177r2.m123268h(r2Var5).btnBgDarkColor, C96177r2.m123268h(this.f281228d.f281337k).btnBgColor);
        C96177r2 r2Var6 = this.f281228d.f281337k;
        int d = C90885a.m113999d(c2, C96177r2.m123263c(r2Var6, color3, C96177r2.m123268h(r2Var6).alphaAnimBtnInfo.f275672f, C96177r2.m123268h(this.f281228d.f281337k).alphaAnimBtnInfo.f275670d), f);
        C96177r2 r2Var7 = this.f281228d.f281337k;
        int c3 = C96177r2.m123263c(r2Var7, color4, C96177r2.m123268h(r2Var7).btnBgDarkColor, C96177r2.m123268h(this.f281228d.f281337k).btnBgColor);
        C96177r2 r2Var8 = this.f281228d.f281337k;
        int d2 = C90885a.m113999d(C90885a.m113999d(c3, C96177r2.m123263c(r2Var8, color4, C96177r2.m123268h(r2Var8).alphaAnimBtnInfo.f275672f, C96177r2.m123268h(this.f281228d.f281337k).alphaAnimBtnInfo.f275670d), f), -16777216, 0.125f);
        float a = (float) C79406f.m96347a(C96177r2.m123262b(this.f281228d.f281337k), 4.0f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        ShapeDrawable l = C96177r2.m123269l(C96177r2.m123262b(this.f281228d.f281337k), d2, a);
        ShapeDrawable l2 = C96177r2.m123269l(C96177r2.m123262b(this.f281228d.f281337k), d, a);
        stateListDrawable.addState(new int[]{16842919}, l);
        stateListDrawable.addState(new int[0], l2);
        C96177r2.m123266f(this.f281228d.f281337k).setBackground(stateListDrawable);
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
    }
}
