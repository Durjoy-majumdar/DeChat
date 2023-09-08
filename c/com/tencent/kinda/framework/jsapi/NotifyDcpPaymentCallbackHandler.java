package com.tencent.kinda.framework.jsapi;

import com.tencent.kinda.framework.boot.KindaApp;
import com.tencent.kinda.framework.jsapi.KindaJSInvokeListener;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.autogen.events.KindaJSInvokeEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1810l;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/kinda/framework/jsapi/NotifyDcpPaymentCallbackHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Lrx3/b0;", "handle", "<init>", "()V", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class NotifyDcpPaymentCallbackHandler implements KindaJSInvokeListener.JSHandler {
    public void handle(KindaJSInvokeEvent kindaJSInvokeEvent) {
        if (kindaJSInvokeEvent != null) {
            ITransmitKvData create = ITransmitKvData.create();
            create.putString("notifyType", C1810l.NAME);
            create.putString("jsApiName", C1810l.NAME);
            create.putString("dcp_token", kindaJSInvokeEvent.f69426d.f69429b.getString("dcp_token", ""));
            create.putString("ret_status", kindaJSInvokeEvent.f69426d.f69429b.getString("ret_status"));
            KindaApp.appKinda().notifyAllUseCases(create);
        }
    }

    public String handleJsApi() {
        return C1810l.NAME;
    }

    public int handleType() {
        return 0;
    }
}
