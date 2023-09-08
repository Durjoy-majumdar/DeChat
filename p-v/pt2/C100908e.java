package pt2;

import android.view.View;
import android.view.ViewStub;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: pt2.e */
public final class C100908e implements ViewStub.OnInflateListener {

    /* renamed from: a */
    public final /* synthetic */ C100909g f295512a;

    public C100908e(C100909g gVar) {
        this.f295512a = gVar;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        SnsMethodCalculate.markStartTimeMs("onInflate", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$1");
        C100909g gVar = this.f295512a;
        SnsMethodCalculate.markStartTimeMs("access$setInflatedTipsUI$p", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback");
        gVar.f295515c = true;
        SnsMethodCalculate.markEndTimeMs("access$setInflatedTipsUI$p", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback");
        C100909g gVar2 = this.f295512a;
        SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback");
        String str = gVar2.f295514b;
        SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback");
        Log.m105924i(str, "initSnsMsgUIStopRemindTips onInflate callback");
        SnsMethodCalculate.markEndTimeMs("onInflate", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$1");
    }
}
