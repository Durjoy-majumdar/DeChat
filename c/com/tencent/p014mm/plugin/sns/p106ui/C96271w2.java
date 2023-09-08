package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.sns.ui.w2 */
public class C96271w2 extends AdViewComponent<SnsInfo> {

    /* renamed from: j */
    public ValueAnimator f281336j;

    /* renamed from: k */
    public final /* synthetic */ C96177r2 f281337k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96271w2(C96177r2 r2Var, String str, C0125s sVar, View view) {
        super(str, sVar, view);
        this.f281337k = r2Var;
    }

    /* renamed from: b */
    public void mo133412b(Object obj) {
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl." + mo133972e(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + snsInfo + "]");
        if (snsInfo != null) {
            ValueAnimator valueAnimator = this.f281336j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f281336j = ofFloat;
            ofFloat.setStartDelay((long) C96177r2.m123268h(this.f281337k).alphaAnimBtnInfo.f275668b);
            this.f281336j.setDuration((long) C96177r2.m123268h(this.f281337k).alphaAnimBtnInfo.f275667a);
            this.f281336j.addUpdateListener(new C96242v2(this));
            this.f281336j.start();
        }
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
    }

    /* renamed from: f */
    public boolean mo133413f(Object obj) {
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        boolean z = false;
        if (snsInfo == null || snsInfo.getAdXml().adCardActionBtnInfo == null) {
            SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        } else {
            ADXml.AdCardActionBtnInfo.C95014a aVar = snsInfo.getAdXml().adCardActionBtnInfo.alphaAnimBtnInfo;
            if (aVar != null && aVar.f275667a > 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        }
        SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        return z;
    }

    /* renamed from: g */
    public boolean mo133414g(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        boolean equals = Util.equals(((SnsInfo) obj).getSnsId(), ((SnsInfo) obj2).getSnsId());
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        return equals;
    }

    /* renamed from: j */
    public void mo133415j() {
        SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl." + mo133972e(), "resetComponentState() called");
        try {
            this.f281336j.cancel();
            C96177r2.m123266f(this.f281337k).setTextColor(C96177r2.m123262b(this.f281337k).getResources().getColor(C0966R.color.f3144gt));
            C96177r2.m123266f(this.f281337k).setBackground(C96177r2.m123262b(this.f281337k).getResources().getDrawable(C0966R.C0969drawable.f357355at1));
            C96177r2 r2Var = this.f281337k;
            SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            r2Var.mo133806t();
            SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsAdCardActionBtnCtrl", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
    }
}
