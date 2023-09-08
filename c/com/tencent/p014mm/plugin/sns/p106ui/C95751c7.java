package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FaceBookBindOperationEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.sns.ui.c7 */
public class C95751c7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceBookBindOperationEvent f279284d;

    /* renamed from: e */
    public final /* synthetic */ SnsUploadConfigView f279285e;

    public C95751c7(SnsUploadConfigView snsUploadConfigView, FaceBookBindOperationEvent faceBookBindOperationEvent) {
        this.f279285e = snsUploadConfigView;
        this.f279284d = faceBookBindOperationEvent;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$11");
        this.f279284d.f264806e.getClass();
        SnsUploadConfigView snsUploadConfigView = this.f279285e;
        int i = SnsUploadConfigView.f278888u;
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView.getClass();
        SnsMethodCalculate.markStartTimeMs("dealWithRefreshFacebookTokenFail", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        Log.m105920e("MicroMsg.SnsUploadConfigView", "dealWithRefreshTokenFail");
        if (snsUploadConfigView.f278894i) {
            String string = snsUploadConfigView.getContext().getString(C0966R.string.a3h);
            String string2 = snsUploadConfigView.getContext().getString(C0966R.string.cle);
            SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            C76879j.m92750u(snsUploadConfigView.getContext(), string2, string, new C71238d7(snsUploadConfigView), (DialogInterface.OnClickListener) null);
            SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        snsUploadConfigView.f278894i = false;
        snsUploadConfigView.mo133063c();
        SnsMethodCalculate.markEndTimeMs("dealWithRefreshFacebookTokenFail", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$11");
    }
}
