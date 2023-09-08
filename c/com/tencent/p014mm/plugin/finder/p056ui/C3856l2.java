package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.l2 */
public final class C3856l2 extends CaptureDataManager.C94404c {

    /* renamed from: d */
    public final /* synthetic */ C3866n2 f17395d;

    public C3856l2(C3866n2 n2Var) {
        this.f17395d = n2Var;
    }

    /* renamed from: i2 */
    public void mo4197i2(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(captureVideoNormalModel, "model");
        C87412m.m108594g(bundle, "extData");
        C3866n2 n2Var = this.f17395d;
        String str = captureVideoNormalModel.f272895f;
        if (str == null) {
            str = "";
        }
        n2Var.mo4204c(str);
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
        }
    }

    /* renamed from: l1 */
    public boolean mo4198l1(Context context, Bundle bundle, CaptureDataManager.C94402a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bundle, "extData");
        C87412m.m108594g(aVar, "finishController");
        return false;
    }
}
