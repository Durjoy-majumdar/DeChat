package com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import hv2.C98545a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout */
public class AdRoundedCornerFrameLayout extends RoundedCornerFrameLayout {

    /* renamed from: g */
    public SnsInfo f281585g = null;

    /* renamed from: h */
    public int f281586h = 0;

    /* renamed from: i */
    public boolean f281587i = false;

    public AdRoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        ViewConfiguration.get(context).getScaledTouchSlop();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }

    /* renamed from: c */
    public void mo134108c(SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("setSnsAdInfo", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        this.f281585g = snsInfo;
        this.f281586h = i;
        SnsMethodCalculate.markEndTimeMs("setSnsAdInfo", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        if (motionEvent.getAction() == 0 && this.f281587i) {
            int width = getWidth();
            int height = getHeight();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            SnsMethodCalculate.markStartTimeMs("reportClickCoordinate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
            Log.m105924i("AdRoundedCornerFrameLayout", "onDown, w=" + width + ", h=" + height + ", x=" + x + ", y=" + y);
            SnsInfo snsInfo = this.f281585g;
            int i = this.f281586h;
            if (snsInfo == null) {
                Log.m105920e("AdRoundedCornerFrameLayout", "reportClickCoordinate, snsInfo==null, source=" + i);
                SnsMethodCalculate.markEndTimeMs("reportClickCoordinate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
            } else {
                ((C119157j) C119157j.f356862d).mo183875f(new C98545a(this, width, height, x, y, i, snsInfo));
                SnsMethodCalculate.markEndTimeMs("reportClickCoordinate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        return dispatchTouchEvent;
    }

    public void setIsReportTouchDownPositon(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsReportTouchDownPositon", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        this.f281587i = z;
        SnsMethodCalculate.markEndTimeMs("setIsReportTouchDownPositon", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }

    public AdRoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        ViewConfiguration.get(context).getScaledTouchSlop();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }
}
