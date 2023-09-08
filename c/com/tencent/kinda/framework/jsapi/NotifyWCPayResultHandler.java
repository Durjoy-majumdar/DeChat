package com.tencent.kinda.framework.jsapi;

import android.os.Bundle;
import com.tencent.kinda.framework.boot.KindaApp;
import com.tencent.kinda.framework.jsapi.KindaJSInvokeListener;
import com.tencent.kinda.framework.module.impl.KindaJSEvent;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.autogen.events.KindaJSInvokeEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/kinda/framework/jsapi/NotifyWCPayResultHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Lrx3/b0;", "handle", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class NotifyWCPayResultHandler implements KindaJSInvokeListener.JSHandler {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "MicroMsg.NotifyWCPayResultHandler";

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/kinda/framework/jsapi/NotifyWCPayResultHandler$Companion;", "", "()V", "TAG", "", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public void handle(KindaJSInvokeEvent kindaJSInvokeEvent) {
        Bundle bundle;
        if (kindaJSInvokeEvent != null) {
            KindaJSEvent kindaJSEvent = new KindaJSEvent();
            ITransmitKvData create = ITransmitKvData.create();
            create.putJSEvent("JSEvent", kindaJSEvent);
            KindaJSInvokeEvent.C24257a aVar = kindaJSInvokeEvent.f69426d;
            if (!(aVar == null || (bundle = aVar.f69429b) == null)) {
                create.putString("appId", bundle.getString("appId"));
                create.putString("timeStamp", bundle.getString("timeStamp"));
                create.putString("bizEventKey", bundle.getString("bizEventKey"));
                create.putString("JSAPIFunc", bundle.getString("jsapiName"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("data: ");
            KindaJSInvokeEvent.C24257a aVar2 = kindaJSInvokeEvent.f69426d;
            sb.append(aVar2 != null ? aVar2.f69429b : null);
            Log.m105918d(TAG, sb.toString());
            KindaApp.appKinda().notifyAllUseCases(create);
        }
    }

    public String handleJsApi() {
        return "notifyWCPayResult";
    }

    public int handleType() {
        return 0;
    }
}
