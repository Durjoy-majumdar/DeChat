package com.tencent.kinda.framework.jsapi;

import com.tencent.kinda.framework.module.impl.KindaJSEvent;
import com.tencent.kinda.gen.KindaJSEventType;
import com.tencent.p014mm.autogen.events.KindaJSInvokeEvent;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000f"}, mo182094d2 = {"com/tencent/kinda/framework/jsapi/RequestSnsPaymentHandler$handle$1", "Lcom/tencent/kinda/framework/module/impl/KindaJSEvent$KindaJsEventDelegate;", "Lcom/tencent/kinda/gen/KindaJSEventType;", "kindaGetType", "", "result", "Ljava/util/HashMap;", "extraInfo", "Lrx3/b0;", "kindaEndWithResult", "", "animated", "Lcom/tencent/kinda/gen/VoidCallback;", "completion", "kindaCloseWebViewImpl", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class RequestSnsPaymentHandler$handle$1 implements KindaJSEvent.KindaJsEventDelegate {
    public final /* synthetic */ KindaJSInvokeEvent $event;

    public RequestSnsPaymentHandler$handle$1(KindaJSInvokeEvent kindaJSInvokeEvent) {
        this.$event = kindaJSInvokeEvent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r2.f69427e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void kindaCloseWebViewImpl(boolean r2, com.tencent.kinda.gen.VoidCallback r3) {
        /*
            r1 = this;
            java.lang.String r2 = "completion"
            gy3.C87412m.m108594g(r3, r2)
            com.tencent.mm.autogen.events.KindaJSInvokeEvent r2 = r1.$event
            r3 = 0
            if (r2 == 0) goto L_0x0011
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$b r0 = r2.f69427e
            if (r0 == 0) goto L_0x0011
            android.os.Bundle r0 = r0.f69432a
            goto L_0x0012
        L_0x0011:
            r0 = r3
        L_0x0012:
            if (r0 != 0) goto L_0x0022
            if (r2 == 0) goto L_0x0018
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$b r3 = r2.f69427e
        L_0x0018:
            if (r3 != 0) goto L_0x001b
            goto L_0x0022
        L_0x001b:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r3.f69432a = r2
        L_0x0022:
            com.tencent.mm.autogen.events.KindaJSInvokeEvent r2 = r1.$event
            if (r2 == 0) goto L_0x0034
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$b r2 = r2.f69427e
            if (r2 == 0) goto L_0x0034
            android.os.Bundle r2 = r2.f69432a
            if (r2 == 0) goto L_0x0034
            r3 = 1
            java.lang.String r0 = "closeWindow"
            r2.putInt(r0, r3)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$1.kindaCloseWebViewImpl(boolean, com.tencent.kinda.gen.VoidCallback):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r2 = r0.f69427e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void kindaEndWithResult(java.lang.String r4, java.util.HashMap<java.lang.String, java.lang.String> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "result"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "extraInfo"
            gy3.C87412m.m108594g(r5, r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r1 = "MicroMsg.RequestSnsPayment"
            java.lang.String r2 = "callback: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            com.tencent.mm.autogen.events.KindaJSInvokeEvent r0 = r3.$event
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$b r2 = r0.f69427e
            if (r2 == 0) goto L_0x0023
            android.os.Bundle r2 = r2.f69432a
            goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            if (r2 != 0) goto L_0x0034
            if (r0 == 0) goto L_0x002a
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$b r1 = r0.f69427e
        L_0x002a:
            if (r1 != 0) goto L_0x002d
            goto L_0x0034
        L_0x002d:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f69432a = r0
        L_0x0034:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x003c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            com.tencent.mm.autogen.events.KindaJSInvokeEvent r1 = r3.$event
            if (r1 == 0) goto L_0x003c
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$b r1 = r1.f69427e
            if (r1 == 0) goto L_0x003c
            android.os.Bundle r1 = r1.f69432a
            if (r1 == 0) goto L_0x003c
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.putString(r2, r0)
            goto L_0x003c
        L_0x0064:
            com.tencent.mm.autogen.events.KindaJSInvokeEvent r5 = r3.$event
            if (r5 == 0) goto L_0x0075
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$b r5 = r5.f69427e
            if (r5 == 0) goto L_0x0075
            android.os.Bundle r5 = r5.f69432a
            if (r5 == 0) goto L_0x0075
            java.lang.String r0 = "ret"
            r5.putString(r0, r4)
        L_0x0075:
            com.tencent.mm.autogen.events.KindaJSInvokeEvent r4 = r3.$event
            if (r4 == 0) goto L_0x0084
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$a r4 = r4.f69426d
            if (r4 == 0) goto L_0x0084
            java.lang.Runnable r4 = r4.f69431d
            if (r4 == 0) goto L_0x0084
            r4.run()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$1.kindaEndWithResult(java.lang.String, java.util.HashMap):void");
    }

    public KindaJSEventType kindaGetType() {
        KindaJSInvokeEvent.C24257a aVar;
        KindaJSInvokeEvent kindaJSInvokeEvent = this.$event;
        boolean z = true;
        if (kindaJSInvokeEvent == null || (aVar = kindaJSInvokeEvent.f69426d) == null || aVar.f69428a != 1) {
            z = false;
        }
        return z ? KindaJSEventType.WEB : KindaJSEventType.TINYAPP;
    }
}
