package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C76879j;
import qo3.C89779i0;
import tn3.C101905a;
import tn3.C118493b;

/* renamed from: com.tencent.mm.plugin.sns.ui.m7 */
public class C96069m7 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsUploadConfigView f280516d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.m7$a */
    public class C96070a implements DialogInterface.OnCancelListener {
        public C96070a(C96069m7 m7Var) {
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$9$1");
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$9$1");
        }
    }

    public C96069m7(SnsUploadConfigView snsUploadConfigView) {
        this.f280516d = snsUploadConfigView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$9");
        SnsUploadConfigView snsUploadConfigView = this.f280516d;
        C89779i0 Q = C76879j.m92723Q(snsUploadConfigView.getContext(), this.f280516d.getContext().getString(C0966R.string.a3h), this.f280516d.getContext().getString(C0966R.string.f361476k62), true, true, new C96070a(this));
        int i2 = SnsUploadConfigView.f278888u;
        SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView.f278902t = Q;
        SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsUploadConfigView snsUploadConfigView2 = this.f280516d;
        SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        C101905a aVar = snsUploadConfigView2.f278901s;
        SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsUploadConfigView snsUploadConfigView3 = this.f280516d;
        ((C118493b) aVar).mo183214b(snsUploadConfigView3, snsUploadConfigView3.getContext());
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$9");
    }
}
