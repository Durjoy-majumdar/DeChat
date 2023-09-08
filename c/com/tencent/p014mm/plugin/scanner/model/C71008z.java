package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.autogen.events.ProductOperationEvent;
import com.tencent.p014mm.plugin.scanner.C71030z;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import vl2.C102216y;

/* renamed from: com.tencent.mm.plugin.scanner.model.z */
public class C71008z extends IStaticListener<ProductOperationEvent> {
    public boolean callback(IEvent iEvent) {
        ProductOperationEvent productOperationEvent = (ProductOperationEvent) iEvent;
        ProductOperationEvent.C67755a aVar = productOperationEvent.f193823d;
        if (aVar.f193825a == 0) {
            C102216y.C102217a b = C94481y.m119505b(aVar.f193827c, 0);
            if (b == null) {
                Log.m105929w("MicroMsg.ProductOperationListener", "error, xml[%s] can not parse", productOperationEvent.f193823d.f193827c);
                productOperationEvent.f193824e.f193828a = false;
            } else {
                productOperationEvent.f193824e.f193829b = C94481y.m119506c(productOperationEvent.f193823d.f193826b, b);
                productOperationEvent.f193824e.f193830c = C71030z.vx0().xx0(b.field_thumburl, "@S");
                productOperationEvent.f193824e.f193828a = true;
            }
        }
        return false;
    }
}
