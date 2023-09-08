package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hf3.C98448b;
import if3.C98670a;

/* renamed from: com.tencent.mm.plugin.sns.ui.o2 */
public final class C96097o2 implements C98448b {

    /* renamed from: a */
    public final /* synthetic */ String f280662a;

    /* renamed from: b */
    public final /* synthetic */ SightWidgetBackgroundVideoHandler f280663b;

    public C96097o2(String str, SightWidgetBackgroundVideoHandler sightWidgetBackgroundVideoHandler) {
        this.f280662a = str;
        this.f280663b = sightWidgetBackgroundVideoHandler;
    }

    /* renamed from: a */
    public void mo131296a(C98670a aVar) {
        SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1$1");
        if (aVar == null) {
            Log.m105920e("MicroMsg.SightWidgetBackgroundVideoHandler", "result is null, workTagId: " + this.f280662a);
            SightWidgetBackgroundVideoHandler sightWidgetBackgroundVideoHandler = this.f280663b;
            SnsMethodCalculate.markStartTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
            C96168q2 q2Var = sightWidgetBackgroundVideoHandler.f277481b;
            SnsMethodCalculate.markEndTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
            if (q2Var != null) {
                String str = this.f280662a;
                C87412m.m108593f(str, "workTagId");
                q2Var.mo132267a(3, (C98670a) null, str);
            }
        } else {
            Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is find " + this.f280662a);
            SightWidgetBackgroundVideoHandler sightWidgetBackgroundVideoHandler2 = this.f280663b;
            SnsMethodCalculate.markStartTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
            C96168q2 q2Var2 = sightWidgetBackgroundVideoHandler2.f277481b;
            SnsMethodCalculate.markEndTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
            if (q2Var2 != null) {
                String str2 = this.f280662a;
                C87412m.m108593f(str2, "workTagId");
                q2Var2.mo132267a(1, aVar, str2);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1$1");
    }
}
