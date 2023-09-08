package com.tencent.kinda.framework.jsapi;

import com.tencent.p014mm.autogen.events.KindaJSInvokeEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1680f5;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1700h5;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1759n3;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1810l;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

public class KindaJSInvokeListener extends IStaticListener<KindaJSInvokeEvent> {
    private static final String TAG = "MicroMsg.KindaJSInvokeListener";

    public interface JSHandler {
        void handle(KindaJSInvokeEvent kindaJSInvokeEvent);

        String handleJsApi();

        int handleType();
    }

    private JSHandler createHandler(KindaJSInvokeEvent kindaJSInvokeEvent) {
        if (kindaJSInvokeEvent.f69426d.f69430c.equals(C1700h5.NAME)) {
            return new PhoneBindCardVerifySmsJSHandler();
        }
        if (kindaJSInvokeEvent.f69426d.f69430c.equals(C1759n3.NAME)) {
            return new requestQueryCashierJsHandler();
        }
        if (kindaJSInvokeEvent.f69426d.f69430c.equals("fastBindCardGetResult")) {
            return new FastBindCardGetResultHandler();
        }
        if (kindaJSInvokeEvent.f69426d.f69430c.equals(C1680f5.NAME)) {
            return new PhoneBindCardEntryHandler();
        }
        if (kindaJSInvokeEvent.f69426d.f69430c.equals("requestKidsPayRechargePayment")) {
            return new RequestKidsPayRechargePaymentHandler();
        }
        if (kindaJSInvokeEvent.f69426d.f69430c.equals("requestSnsPayment")) {
            return new RequestSnsPaymentHandler();
        }
        if (kindaJSInvokeEvent.f69426d.f69430c.equals(C1810l.NAME)) {
            return new NotifyDcpPaymentCallbackHandler();
        }
        if (kindaJSInvokeEvent.f69426d.f69430c.equals("notifyWCPayResult")) {
            return new NotifyWCPayResultHandler();
        }
        return null;
    }

    public boolean callback(KindaJSInvokeEvent kindaJSInvokeEvent) {
        KindaJSInvokeEvent.C24257a aVar = kindaJSInvokeEvent.f69426d;
        Log.m105925i(TAG, "handle jsapi callback: %s, %s", aVar.f69430c, Integer.valueOf(aVar.f69428a));
        JSHandler createHandler = createHandler(kindaJSInvokeEvent);
        if (createHandler != null) {
            createHandler.handle(kindaJSInvokeEvent);
        }
        return false;
    }
}
