package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.AbsoluteLayout;
import android.widget.ListView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$y0 */
public class SnsTimeLineUI$$y0 extends Animation {

    /* renamed from: A */
    public final /* synthetic */ SnsTimeLineUI f278791A;

    /* renamed from: d */
    public float f278792d;

    /* renamed from: e */
    public float f278793e;

    /* renamed from: f */
    public float f278794f = -1.0f;

    /* renamed from: g */
    public float f278795g;

    /* renamed from: h */
    public float f278796h = 50.0f;

    /* renamed from: i */
    public float f278797i = 10.0f;

    /* renamed from: j */
    public float f278798j = 0.0f;

    /* renamed from: n */
    public float f278799n = 0.0f;

    /* renamed from: o */
    public float f278800o;

    /* renamed from: p */
    public float f278801p;

    /* renamed from: q */
    public boolean f278802q;

    /* renamed from: r */
    public int f278803r;

    /* renamed from: s */
    public ListView f278804s;

    /* renamed from: t */
    public boolean f278805t = false;

    /* renamed from: u */
    public int f278806u = 0;

    /* renamed from: v */
    public float f278807v = 0.0f;

    /* renamed from: w */
    public float f278808w = 0.0f;

    /* renamed from: x */
    public int f278809x = 600;

    /* renamed from: y */
    public float f278810y = 0.0f;

    /* renamed from: z */
    public float f278811z = 0.0f;

    public SnsTimeLineUI$$y0(SnsTimeLineUI snsTimeLineUI, ListView listView) {
        this.f278791A = snsTimeLineUI;
        this.f278804s = listView;
    }

    /* renamed from: a */
    public final void mo133006a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
        if (this.f278794f == -1.0f || ((double) this.f278793e) < 0.1d) {
            this.f278794f = (float) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f278791A, 70.0f);
            this.f278796h = (float) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f278791A, 16.0f);
            this.f278792d = (float) (SnsTimeLineUI.m122291S7(this.f278791A).getWidth() / 2);
            this.f278793e = (float) (SnsTimeLineUI.m122291S7(this.f278791A).getHeight() / 2);
            float f = (float) ((-SnsTimeLineUI.m122291S7(this.f278791A).getHeight()) * 2);
            this.f278799n = f;
            if (f == 0.0f) {
                this.f278799n = (float) (-BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f278791A, 40.0f));
            }
            this.f278795g = this.f278799n;
            Boolean bool = SnsTimeLineUI.f278615X1;
            if (bool.booleanValue()) {
                Log.m105919d("MicroMsg.RefreshAnim", "init MIN_Y %s MAX_Y %s targetInitY %s distanceY %s", Float.valueOf(this.f278795g), Float.valueOf(this.f278794f), Float.valueOf(this.f278799n), Float.valueOf(this.f278796h));
            }
            this.f278798j = this.f278795g;
            if (!this.f278805t) {
                if (bool.booleanValue()) {
                    Log.m105924i("MicroMsg.RefreshAnim", "initState");
                }
                this.f278806u = ((AbsoluteLayout.LayoutParams) SnsTimeLineUI.m122291S7(this.f278791A).getLayoutParams()).y;
                this.f278807v = this.f278794f;
                this.f278808w = this.f278798j;
            }
            this.f278805t = true;
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
    }

    public void applyTransformation(float f, Transformation transformation) {
        SnsMethodCalculate.markStartTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
        Boolean bool = SnsTimeLineUI.f278615X1;
        if (bool.booleanValue()) {
            Log.m105919d("MicroMsg.RefreshAnim", "animtest applyTransformation vis %s interpolatedTime %s isJustUp %s", Integer.valueOf(SnsTimeLineUI.m122291S7(this.f278791A).getVisibility()), Float.valueOf(f), Boolean.valueOf(this.f278802q));
        }
        if (SnsTimeLineUI.m122291S7(this.f278791A).getVisibility() != 0) {
            SnsMethodCalculate.markEndTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            return;
        }
        float duration = (f - this.f278800o) * ((float) getDuration());
        if (duration < 2.0f) {
            if (bool.booleanValue()) {
                Log.m105919d("MicroMsg.RefreshAnim", "applyTransformation wawawa %s", Float.valueOf(duration));
            }
            SnsMethodCalculate.markEndTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            return;
        }
        this.f278800o = f;
        SnsTimeLineUI.m122291S7(this.f278791A).setImageResource(C0966R.raw.friendactivity_refresh);
        SnsTimeLineUI.m122291S7(this.f278791A).setScaleType(QImageView.C97274a.MATRIX);
        if (((float) getDuration()) * f >= ((float) (getDuration() - ((long) this.f278809x))) || this.f278802q) {
            AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) SnsTimeLineUI.m122291S7(this.f278791A).getLayoutParams();
            int i = layoutParams.y;
            float f2 = this.f278799n;
            if (((float) i) <= f2) {
                SnsMethodCalculate.markEndTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
                return;
            }
            if (this.f278810y == 0.0f) {
                this.f278810y = (-f2) + ((float) i);
                this.f278811z = (float) i;
                this.f278801p = f;
            }
            float f3 = this.f278801p;
            float f4 = (f - f3) / (1.0f - f3);
            float f5 = this.f278810y * f4;
            float f6 = this.f278811z - f5;
            if (bool.booleanValue()) {
                Log.m105925i("MicroMsg.RefreshAnim", "animcheck interpolatedTime y %s duration %s factor %s residualTime %s pass %s ", Float.valueOf(f6), Long.valueOf(getDuration()), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(this.f278801p * ((float) getDuration())));
            }
            if (((float) layoutParams.y) > f6) {
                layoutParams.y = (int) f6;
            }
            this.f278798j = (float) layoutParams.y;
            SnsTimeLineUI.m122291S7(this.f278791A).setLayoutParams(layoutParams);
        } else {
            if (bool.booleanValue()) {
                Log.m105918d("MicroMsg.RefreshAnim", "animcheck delt Rotate " + (duration / 2.5f));
            }
            SnsTimeLineUI.m122291S7(this.f278791A).getImageMatrix().postRotate(duration / 2.5f, this.f278792d, this.f278793e);
        }
        SnsTimeLineUI.m122291S7(this.f278791A).invalidate();
        SnsMethodCalculate.markEndTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
    }

    /* renamed from: b */
    public void mo133008b() {
        SnsMethodCalculate.markStartTimeMs("playLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
        if (SnsTimeLineUI.f278615X1.booleanValue()) {
            Log.m105925i("MicroMsg.RefreshAnim", "play end vis: %d, sumY %f MAX_Y %f", Integer.valueOf(SnsTimeLineUI.m122291S7(this.f278791A).getVisibility()), Float.valueOf(this.f278798j), Float.valueOf(this.f278794f));
        }
        if (SnsTimeLineUI.m122291S7(this.f278791A).getVisibility() != 0) {
            SnsMethodCalculate.markEndTimeMs("playLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            return;
        }
        mo133006a();
        if (this.f278798j < this.f278794f - this.f278797i) {
            SnsMethodCalculate.markEndTimeMs("playLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            return;
        }
        SnsTimeLineUI.m122291S7(this.f278791A).clearAnimation();
        mo133011e((long) (this.f278809x + 100));
        SnsTimeLineUI.m122291S7(this.f278791A).startAnimation(this);
        this.f278802q = false;
        SnsMethodCalculate.markEndTimeMs("playLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
    }

    /* renamed from: c */
    public void mo133009c() {
        SnsMethodCalculate.markStartTimeMs("playLoading", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
        if (SnsTimeLineUI.f278615X1.booleanValue()) {
            Log.m105918d("MicroMsg.RefreshAnim", "animtest playLoading");
        }
        if (SnsTimeLineUI.m122291S7(this.f278791A).getVisibility() != 0) {
            SnsMethodCalculate.markEndTimeMs("playLoading", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            return;
        }
        mo133006a();
        this.f278798j = this.f278794f + 20.0f;
        AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) SnsTimeLineUI.m122291S7(this.f278791A).getLayoutParams();
        layoutParams.y = (int) this.f278794f;
        SnsTimeLineUI.m122291S7(this.f278791A).setLayoutParams(layoutParams);
        mo133010d();
        SnsMethodCalculate.markEndTimeMs("playLoading", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
    }

    /* renamed from: d */
    public void mo133010d() {
        SnsMethodCalculate.markStartTimeMs("setAcitonUp", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
        Boolean bool = SnsTimeLineUI.f278615X1;
        if (bool.booleanValue()) {
            Log.m105918d("MicroMsg.RefreshAnim", "animtest setAcitonUp");
        }
        if (SnsTimeLineUI.m122291S7(this.f278791A).getVisibility() != 0) {
            SnsMethodCalculate.markEndTimeMs("setAcitonUp", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            return;
        }
        mo133006a();
        SnsTimeLineUI.m122291S7(this.f278791A).clearAnimation();
        if (bool.booleanValue()) {
            Log.m105927v("MicroMsg.RefreshAnim", "setAcitonUp1 sumY  %s MAX_Y %s %s", Float.valueOf(this.f278798j), Float.valueOf(this.f278794f), Util.getStack().toString());
        }
        SnsTimeLineUI.m122291S7(this.f278791A).startAnimation(this);
        if (this.f278798j >= this.f278794f - this.f278797i) {
            mo133011e(20000);
            this.f278802q = false;
        } else {
            mo133011e((long) (this.f278809x + 100));
            this.f278802q = true;
        }
        SnsMethodCalculate.markEndTimeMs("setAcitonUp", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
    }

    /* renamed from: e */
    public final void mo133011e(long j) {
        SnsMethodCalculate.markStartTimeMs("setDurationTime", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
        if (SnsTimeLineUI.f278615X1.booleanValue()) {
            Log.m105919d("MicroMsg.RefreshAnim", "setDurationTime durationMillis %s %s", Long.valueOf(j), Util.getStack().toString());
        }
        setDuration(j);
        SnsMethodCalculate.markEndTimeMs("setDurationTime", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
    }

    public void initialize(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("initialize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
        super.initialize(i, i2, i3, i4);
        if (SnsTimeLineUI.f278615X1.booleanValue()) {
            Log.m105925i("MicroMsg.RefreshAnim", "anim initialize %s", Util.getStack().toString());
        }
        this.f278800o = 0.0f;
        this.f278801p = 0.0f;
        this.f278810y = 0.0f;
        this.f278811z = 0.0f;
        SnsMethodCalculate.markEndTimeMs("initialize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
    }
}
