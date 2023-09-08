package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83421k;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import p329d3.C86165a;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.f */
public class C83415f implements C86165a<WeChatBrands.Business.AvailabilityAlertSupplier> {

    /* renamed from: a */
    public final /* synthetic */ C83421k.C83422a f243772a;

    public C83415f(C83421k.C83422a aVar) {
        this.f243772a = aVar;
    }

    public void accept(Object obj) {
        WeChatBrands.Business.AvailabilityAlertSupplier availabilityAlertSupplier = (WeChatBrands.Business.AvailabilityAlertSupplier) obj;
        C81956c.m100673a(C83421k.this.f243787f.getBaseContext(), availabilityAlertSupplier.getBody(), availabilityAlertSupplier.getTilte(), availabilityAlertSupplier.getPositiveBtnText(), availabilityAlertSupplier.getNegativeBtnText(), availabilityAlertSupplier.getOnPositiveClickListener(), availabilityAlertSupplier.getOnNegativeClickListener(), availabilityAlertSupplier.getOnPositiveClickListener());
        C83421k.this.f243787f.mo115709e((AppBrandInitConfigWC) null, (AppBrandStatObject) null);
    }
}
