package com.tencent.kinda.framework.jsapi;

import com.tencent.kinda.framework.jsapi.KindaJSInvokeListener;
import gy3.C8480h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/kinda/framework/jsapi/RequestSnsPaymentHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Lrx3/b0;", "handle", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class RequestSnsPaymentHandler implements KindaJSInvokeListener.JSHandler {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "MicroMsg.RequestSnsPayment";

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/kinda/framework/jsapi/RequestSnsPaymentHandler$Companion;", "", "()V", "TAG", "", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0099, code lost:
        r5 = r5.f69426d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handle(com.tencent.p014mm.autogen.events.KindaJSInvokeEvent r5) {
        /*
            r4 = this;
            com.tencent.kinda.framework.module.impl.KindaJSEvent r0 = new com.tencent.kinda.framework.module.impl.KindaJSEvent
            r0.<init>()
            com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$1 r1 = new com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$1
            r1.<init>(r5)
            r0.setDelegate(r1)
            com.tencent.kinda.gen.ITransmitKvData r1 = com.tencent.kinda.gen.ITransmitKvData.create()
            java.lang.String r2 = "JSEvent"
            r1.putJSEvent(r2, r0)
            if (r5 == 0) goto L_0x008d
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$a r0 = r5.f69426d
            if (r0 == 0) goto L_0x008d
            android.os.Bundle r0 = r0.f69429b
            if (r0 == 0) goto L_0x008d
            r2 = 2
            java.lang.String r3 = "payScene"
            int r2 = r0.getInt(r3, r2)
            r1.putInt(r3, r2)
            java.lang.String r2 = "appId"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "timeStamp"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "nonceStr"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "package"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "signType"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "paySign"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "prepayId"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "partnerId"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "bindSerial"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "bankType"
            java.lang.String r3 = r0.getString(r2)
            r1.putString(r2, r3)
            java.lang.String r2 = "paymentDeskModalTitle"
            java.lang.String r0 = r0.getString(r2)
            r1.putString(r2, r0)
        L_0x008d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "data: "
            r0.append(r2)
            if (r5 == 0) goto L_0x00a0
            com.tencent.mm.autogen.events.KindaJSInvokeEvent$a r5 = r5.f69426d
            if (r5 == 0) goto L_0x00a0
            android.os.Bundle r5 = r5.f69429b
            goto L_0x00a1
        L_0x00a0:
            r5 = 0
        L_0x00a1:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "MicroMsg.RequestSnsPayment"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r5)
            com.tencent.kinda.gen.IAppKinda r5 = com.tencent.kinda.framework.boot.KindaApp.appKinda()
            com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$2 r0 = com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$2.INSTANCE
            java.lang.String r2 = "snsJsapiPay"
            r5.startUseCase(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler.handle(com.tencent.mm.autogen.events.KindaJSInvokeEvent):void");
    }

    public String handleJsApi() {
        return "requestSnsPayment";
    }

    public int handleType() {
        return 0;
    }
}
