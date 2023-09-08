package com.tencent.p014mm.plugin.sns.p106ui;

import android.widget.AbsoluteLayout;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gv2.C98244q;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$l0 */
public class SnsTimeLineUI$$l0 extends C98244q.C98247c {

    /* renamed from: a */
    public boolean f278764a = false;

    /* renamed from: b */
    public final /* synthetic */ SnsTimeLineUI f278765b;

    public SnsTimeLineUI$$l0(SnsTimeLineUI snsTimeLineUI) {
        this.f278765b = snsTimeLineUI;
    }

    /* renamed from: a */
    public void mo132974a(boolean z, int i, int i2) {
        int i3 = i;
        SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$56");
        if (!z || !this.f278764a) {
            SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$56");
            return;
        }
        SnsTimeLineUI.m122303e8(this.f278765b);
        Boolean bool = SnsTimeLineUI.f278615X1;
        if (bool.booleanValue()) {
            Log.m105925i("MicroMsg.SnsTimeLineUI", "mUIAction.header.getTop %s originalHeaderTop %s distanceY %s", Integer.valueOf(SnsTimeLineUI.m122302d8(this.f278765b).f278860p.getTop()), Integer.valueOf(SnsTimeLineUI.m122285M7(this.f278765b).f278803r), Integer.valueOf(i));
        }
        if ((i3 > 0 || SnsTimeLineUI.m122304f8(this.f278765b)) && ((SnsTimeLineUI.m122302d8(this.f278765b).f278860p.getTop() >= SnsTimeLineUI.m122285M7(this.f278765b).f278803r || i3 > 0) && !SnsTimeLineUI.m122302d8(this.f278765b).mo133036n())) {
            SnsTimeLineUI$$y0 M7 = SnsTimeLineUI.m122285M7(this.f278765b);
            float f = (float) i3;
            M7.getClass();
            SnsMethodCalculate.markStartTimeMs("setDistanceY", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            ListView listView = M7.f278804s;
            if (listView != null) {
                if (listView.getFirstVisiblePosition() != 0) {
                    SnsTimeLineUI snsTimeLineUI = M7.f278791A;
                    SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    snsTimeLineUI.mo132948F8(8);
                    SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                } else if (SnsTimeLineUI.m122302d8(M7.f278791A).f278860p.getTop() >= SnsTimeLineUI.m122285M7(M7.f278791A).f278803r) {
                    SnsTimeLineUI snsTimeLineUI2 = M7.f278791A;
                    SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    snsTimeLineUI2.mo132948F8(0);
                    SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                }
            }
            if (bool.booleanValue()) {
                Log.m105919d("MicroMsg.RefreshAnim", "animtest setDistanceY %s %s %s", Float.valueOf(f), Float.valueOf(M7.f278795g), Float.valueOf(M7.f278794f));
            }
            if (SnsTimeLineUI.m122291S7(M7.f278791A).getVisibility() != 0) {
                SnsMethodCalculate.markEndTimeMs("setDistanceY", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            } else {
                SnsTimeLineUI.m122291S7(M7.f278791A).clearAnimation();
                M7.mo133006a();
                float f2 = M7.f278796h;
                float f3 = -f2;
                if (f <= f3) {
                    f = f3;
                }
                if (f < f2) {
                    f2 = f;
                }
                if (f2 < 0.0f) {
                    M7.f278798j -= f2 * 2.0f;
                } else {
                    M7.f278798j -= f2 / 2.0f;
                }
                float f4 = M7.f278798j;
                float f5 = M7.f278795g;
                if (f4 < f5) {
                    M7.f278798j = f5;
                    f4 = f5;
                }
                float f6 = M7.f278794f;
                if (f4 > f6) {
                    M7.f278798j = f6;
                    f4 = f6;
                }
                if (bool.booleanValue()) {
                    Log.m105919d("MicroMsg.RefreshAnim", "animtest setDistanceY %s %s %s sumY %s translateY %s distanceY %s", Float.valueOf(f2), Float.valueOf(M7.f278795g), Float.valueOf(M7.f278794f), Float.valueOf(M7.f278798j), Float.valueOf(f4), Float.valueOf(M7.f278796h));
                }
                float f7 = f4 == M7.f278794f ? f2 * 2.0f : f2 * 5.0f;
                SnsTimeLineUI.m122291S7(M7.f278791A).setScaleType(QImageView.C97274a.MATRIX);
                SnsTimeLineUI.m122291S7(M7.f278791A).getImageMatrix().postRotate(f7, M7.f278792d, M7.f278793e);
                SnsTimeLineUI.m122291S7(M7.f278791A).setImageResource(C0966R.raw.friendactivity_refresh);
                AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) SnsTimeLineUI.m122291S7(M7.f278791A).getLayoutParams();
                layoutParams.y = (int) f4;
                SnsTimeLineUI.m122291S7(M7.f278791A).setLayoutParams(layoutParams);
                SnsTimeLineUI.m122291S7(M7.f278791A).invalidate();
                SnsMethodCalculate.markEndTimeMs("setDistanceY", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            }
        }
        SnsTimeLineUI.m122284L7(this.f278765b).mo132087i();
        this.f278765b.mo132950a1();
        SnsTimeLineUI.m122284L7(this.f278765b).f276710t.mo133679d();
        SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$56");
    }

    /* renamed from: c */
    public void mo132975c(boolean z) {
        SnsMethodCalculate.markStartTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$56");
        boolean z2 = false;
        this.f278764a = false;
        if (!z) {
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$56");
            return;
        }
        if (SnsTimeLineUI.m122302d8(this.f278765b).mo133035m()) {
            if (!SnsTimeLineUI.m122302d8(this.f278765b).mo133036n()) {
                SnsTimeLineUI.m122285M7(this.f278765b).mo133010d();
            }
            SnsTimeLineUI snsTimeLineUI = this.f278765b;
            SnsMethodCalculate.markStartTimeMs("access$3502", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            snsTimeLineUI.f278663W0 = !SnsTimeLineUI.m122304f8(snsTimeLineUI);
            SnsMethodCalculate.markEndTimeMs("access$3502", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            SnsTimeLineUI$$y0 M7 = SnsTimeLineUI.m122285M7(this.f278765b);
            M7.getClass();
            SnsMethodCalculate.markStartTimeMs("isPullToMax", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) SnsTimeLineUI.m122291S7(M7.f278791A).getLayoutParams();
            if (layoutParams != null && ((float) layoutParams.y) == M7.f278794f) {
                z2 = true;
            }
            SnsMethodCalculate.markEndTimeMs("isPullToMax", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            if (z2) {
                SnsUIAction d8 = SnsTimeLineUI.m122302d8(this.f278765b);
                d8.getClass();
                SnsMethodCalculate.markStartTimeMs("topLoadData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                d8.f278868x.mo132993i();
                SnsMethodCalculate.markEndTimeMs("topLoadData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            }
        }
        if (SnsTimeLineUI.m122302d8(this.f278765b).mo133034l()) {
            SnsTimeLineUI.m122302d8(this.f278765b).mo133030h();
        }
        SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$56");
    }

    /* renamed from: d */
    public void mo132976d() {
        SnsMethodCalculate.markStartTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$56");
        this.f278764a = true;
        SnsMethodCalculate.markEndTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$56");
    }
}
