package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C101783gu2;
import te3.C101821nv2;

/* renamed from: com.tencent.mm.plugin.sns.model.x0 */
public class C94968x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101783gu2 f275311d;

    /* renamed from: e */
    public final /* synthetic */ C94971y0 f275312e;

    public C94968x0(C94971y0 y0Var, C101783gu2 gu22) {
        this.f275312e = y0Var;
        this.f275311d = gu22;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$3");
        C101783gu2 gu22 = this.f275311d;
        int i = gu22.f298310f + 1;
        gu22.f298310f = i;
        try {
            Log.m105925i("MicroMsg.SightCdnUpload", "add try count %d", Integer.valueOf(i));
            C101821nv2 nv22 = (C101821nv2) new C101821nv2().parseFrom(C94971y0.m120637b(this.f275312e).mo139854h());
            nv22.f298911B = this.f275311d;
            C94971y0.m120637b(this.f275312e).mo139858l(nv22.toByteArray());
            C94866e1.ay0().r50(C94971y0.m120637b(this.f275312e).mo139849c(), C94971y0.m120637b(this.f275312e));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in checkUploadaddCount %s", e.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$3");
    }
}
