package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import hf3.C98448b;
import if3.C98670a;

/* renamed from: com.tencent.mm.plugin.sns.ui.n2 */
public final class C96080n2 implements C98448b {

    /* renamed from: a */
    public final /* synthetic */ C96168q2 f280565a;

    /* renamed from: b */
    public final /* synthetic */ String f280566b;

    public C96080n2(C96168q2 q2Var, String str) {
        this.f280565a = q2Var;
        this.f280566b = str;
    }

    /* renamed from: a */
    public void mo131296a(C98670a aVar) {
        SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$getRemuxVideoWork$1");
        StringBuilder sb = new StringBuilder();
        sb.append("getRemuxVideoWork >> workType: ");
        sb.append(aVar != null ? Integer.valueOf(aVar.f289301a) : null);
        Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", sb.toString());
        if (aVar == null) {
            Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", "workType is error");
            this.f280565a.mo132267a(3, aVar, this.f280566b);
        } else {
            int i = aVar.f289301a;
            if (i == 4007) {
                Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is done " + this.f280566b);
                this.f280565a.mo132267a(1, aVar, this.f280566b);
            } else if (i == 4008) {
                Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is done error");
                this.f280565a.mo132267a(3, aVar, this.f280566b);
            } else {
                Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is no done");
                this.f280565a.mo132267a(2, aVar, this.f280566b);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$getRemuxVideoWork$1");
    }
}
