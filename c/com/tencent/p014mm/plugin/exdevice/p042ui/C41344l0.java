package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.exdevice.model.C41158q1;
import eb0.C86493v0;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.l0 */
public class C41344l0 implements C41158q1.C41162d {

    /* renamed from: a */
    public final /* synthetic */ ExdeviceProfileUI f111319a;

    public C41344l0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111319a = exdeviceProfileUI;
    }

    /* renamed from: a */
    public void mo64226a(String str) {
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_appid", "wx7fa037cc7dfabad5");
        intent.putExtra("Ksnsupload_appname", this.f111319a.getString(C0966R.string.cgc));
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("need_result", true);
        String a = C86493v0.m107223a("wx_sport");
        C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "wx_sport");
        intent.putExtra("reportSessionId", a);
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", str);
        C88144b.m109795m(this.f111319a, "sns", ".ui.SnsUploadUI", intent, 2);
    }
}
