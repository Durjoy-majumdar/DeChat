package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import i72.C98608f;

/* renamed from: com.tencent.mm.plugin.sns.model.w0 */
public class C94964w0 implements C98608f {

    /* renamed from: a */
    public final /* synthetic */ C94971y0 f275296a;

    public C94964w0(C94971y0 y0Var) {
        this.f275296a = y0Var;
    }

    /* renamed from: a */
    public boolean mo96066a() {
        SnsMethodCalculate.markStartTimeMs("updateVideoFile", "com.tencent.mm.plugin.sns.model.SightCdnUpload$2");
        Log.m105924i("MicroMsg.SightCdnUpload", "iUpdateVideoFile");
        C94971y0.m120636a(this.f275296a);
        SnsMethodCalculate.markEndTimeMs("updateVideoFile", "com.tencent.mm.plugin.sns.model.SightCdnUpload$2");
        return false;
    }
}
