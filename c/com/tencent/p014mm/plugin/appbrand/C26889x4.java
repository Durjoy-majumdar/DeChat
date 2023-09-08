package com.tencent.p014mm.plugin.appbrand;

import al3.C0086a;
import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.appbrand.x4 */
public class C26889x4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NotifyWxaCommLibUpdatedEvent f74777d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC.C2688725 f74778e;

    public C26889x4(AppBrandRuntimeWC.C2688725 r1, NotifyWxaCommLibUpdatedEvent notifyWxaCommLibUpdatedEvent) {
        this.f74778e = r1;
        this.f74777d = notifyWxaCommLibUpdatedEvent;
    }

    public void run() {
        AppBrandRuntimeWC appBrandRuntimeWC = AppBrandRuntimeWC.this;
        NotifyWxaCommLibUpdatedEvent.UpdateResult updateResult = this.f74777d.f238553d;
        updateResult.getClass();
        boolean z = updateResult instanceof NotifyWxaCommLibUpdatedEvent.UpdateResult.Succeed;
        Activity R = appBrandRuntimeWC.mo113026R();
        if (R == null) {
            Log.m105921e("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForCommLibUpdated(rt:%s, isUpdateSucceed:%b), get NULL activity", appBrandRuntimeWC, Boolean.valueOf(z));
        } else if (z) {
            C77389a aVar = new C77389a();
            aVar.f225660q = C0086a.m38a(R).getString(C0966R.string.f360105a51);
            aVar.f225663t = C0086a.m38a(R).getString(C0966R.string.a4z);
            aVar.f225668y = false;
            aVar.f225620C = new C81834f4(appBrandRuntimeWC);
            C77398g gVar = new C77398g(R, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
        } else {
            C77389a aVar2 = new C77389a();
            aVar2.f225660q = C0086a.m38a(R).getString(C0966R.string.f360104a50);
            aVar2.f225663t = C0086a.m38a(R).getString(C0966R.string.a4z);
            aVar2.f225668y = false;
            aVar2.f225620C = new C81885g4(appBrandRuntimeWC);
            C77398g gVar2 = new C77398g(R, C0966R.style.a66);
            gVar2.mo107525e(aVar2);
            gVar2.show();
        }
    }
}
