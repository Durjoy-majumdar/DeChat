package ut2;

import android.view.ViewTreeObserver;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8478d0;

/* renamed from: ut2.m */
public final class C102097m implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ int f300645d;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout.Behavior f300646e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f300647f;

    /* renamed from: g */
    public final /* synthetic */ ImproveMainUIC f300648g;

    public C102097m(int i, AppBarLayout.Behavior behavior, C8478d0 d0Var, ImproveMainUIC improveMainUIC) {
        this.f300645d = i;
        this.f300646e = behavior;
        this.f300647f = d0Var;
        this.f300648g = improveMainUIC;
    }

    public void onGlobalLayout() {
        SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restorePositionInfo$1");
        StringBuilder sb = new StringBuilder();
        sb.append("resume appbar offset:");
        sb.append(this.f300645d);
        sb.append(" current:");
        sb.append(this.f300646e.mo146259w());
        sb.append(" index:");
        C8478d0 d0Var = this.f300647f;
        int i = d0Var.f27483d;
        d0Var.f27483d = i + 1;
        sb.append(i);
        Log.m105924i("MicroMsg.Improve.MainUIC", sb.toString());
        int w = this.f300646e.mo146259w();
        int i2 = this.f300645d;
        if (w == i2 || this.f300647f.f27483d >= 10) {
            this.f300648g.getAppBarLayout().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            this.f300646e.mo146260y(i2);
            this.f300648g.getAppBarLayout().requestLayout();
        }
        SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restorePositionInfo$1");
    }
}
