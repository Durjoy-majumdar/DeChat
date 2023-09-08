package com.tencent.kinda.framework.jsapi;

import android.os.Bundle;
import com.tencent.kinda.framework.boot.KindaApp;
import com.tencent.kinda.framework.jsapi.KindaJSInvokeListener;
import com.tencent.kinda.framework.module.impl.KindaJSEvent;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KindaJSEventType;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.autogen.events.KindaJSInvokeEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

public class FastBindCardGetResultHandler implements KindaJSInvokeListener.JSHandler {
    public int type;

    public void handle(final KindaJSInvokeEvent kindaJSInvokeEvent) {
        KindaJSEvent kindaJSEvent = new KindaJSEvent();
        kindaJSEvent.setDelegate(new KindaJSEvent.KindaJsEventDelegate() {
            public void kindaCloseWebViewImpl(boolean z, VoidCallback voidCallback) {
                KindaJSInvokeEvent.C24258b bVar = kindaJSInvokeEvent.f69427e;
                if (bVar.f69432a == null) {
                    bVar.f69432a = new Bundle();
                }
                kindaJSInvokeEvent.f69427e.f69432a.putInt("closeWindow", 1);
            }

            public void kindaEndWithResult(String str, HashMap<String, String> hashMap) {
                Log.m105925i("MicroMsg.FastBindCardGetResultHandler", "callback: %s", str);
                KindaJSInvokeEvent.C24258b bVar = kindaJSInvokeEvent.f69427e;
                if (bVar.f69432a == null) {
                    bVar.f69432a = new Bundle();
                }
                kindaJSInvokeEvent.f69427e.f69432a.putString("ret", str);
                kindaJSInvokeEvent.f69426d.f69431d.run();
            }

            public KindaJSEventType kindaGetType() {
                return kindaJSInvokeEvent.f69426d.f69428a == 1 ? KindaJSEventType.WEB : KindaJSEventType.TINYAPP;
            }
        });
        ITransmitKvData create = ITransmitKvData.create();
        create.putJSEvent("jsEvent", kindaJSEvent);
        create.putString("notifyType", "fastBindCard");
        create.putString("app_id", kindaJSInvokeEvent.f69426d.f69429b.getString("app_id"));
        create.putString("nonce_str", kindaJSInvokeEvent.f69426d.f69429b.getString("nonce_str"));
        create.putString("timeStamp", kindaJSInvokeEvent.f69426d.f69429b.getString("timeStamp"));
        create.putString("package", kindaJSInvokeEvent.f69426d.f69429b.getString("package"));
        create.putString("paySign", kindaJSInvokeEvent.f69426d.f69429b.getString("paySign"));
        create.putString("signType", kindaJSInvokeEvent.f69426d.f69429b.getString("signType"));
        create.putString("sessionid", kindaJSInvokeEvent.f69426d.f69429b.getString("sessionid"));
        create.putString("jsApiName", kindaJSInvokeEvent.f69426d.f69430c);
        int i = kindaJSInvokeEvent.f69426d.f69428a;
        if (i == 1) {
            create.putInt("jsApiScene", 1);
        } else if (i == 0) {
            create.putInt("jsApiScene", 2);
        }
        Log.m105919d("MicroMsg.FastBindCardGetResultHandler", "data: %s", kindaJSInvokeEvent.f69426d.f69429b.toString());
        KindaApp.appKinda().notifyAllUseCases(create);
    }

    public String handleJsApi() {
        return "fastBindCardGetResult";
    }

    public int handleType() {
        return this.type;
    }
}
