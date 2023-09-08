package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.autogen.events.SnsRemuxTaskEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C101783gu2;

/* renamed from: com.tencent.mm.plugin.sns.model.v0 */
public class C94961v0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsRemuxTaskEvent f275283d;

    /* renamed from: e */
    public final /* synthetic */ C101783gu2 f275284e;

    /* renamed from: f */
    public final /* synthetic */ String f275285f;

    /* renamed from: g */
    public final /* synthetic */ C94971y0 f275286g;

    public C94961v0(C94971y0 y0Var, SnsRemuxTaskEvent snsRemuxTaskEvent, C101783gu2 gu22, String str) {
        this.f275286g = y0Var;
        this.f275283d = snsRemuxTaskEvent;
        this.f275284e = gu22;
        this.f275285f = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$1");
        Log.m105925i("MicroMsg.SightCdnUpload", "event callback errcode %d", Integer.valueOf(this.f275283d.f265182e.f265188a));
        if (this.f275283d.f265182e.f265188a >= 0) {
            C94971y0.m120636a(this.f275286g);
            C94971y0 y0Var = this.f275286g;
            C101783gu2 gu22 = this.f275284e;
            String str = this.f275285f;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            y0Var.mo131299f(gu22, str);
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        } else {
            C94971y0 y0Var2 = this.f275286g;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            y0Var2.mo131300g();
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$1");
    }
}
