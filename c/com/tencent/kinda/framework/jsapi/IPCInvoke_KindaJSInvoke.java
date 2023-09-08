package com.tencent.kinda.framework.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.KindaJSInvokeEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;

public class IPCInvoke_KindaJSInvoke implements C80883e<Bundle, Bundle> {
    public void invoke(Bundle bundle, final C1256g<Bundle> gVar) {
        final KindaJSInvokeEvent kindaJSInvokeEvent = new KindaJSInvokeEvent();
        kindaJSInvokeEvent.f69426d.f69430c = bundle.getString("jsapiName", "");
        kindaJSInvokeEvent.f69426d.f69428a = bundle.getInt("jsapi_type", 0);
        KindaJSInvokeEvent.C24257a aVar = kindaJSInvokeEvent.f69426d;
        aVar.f69429b = bundle;
        aVar.f69431d = new Runnable() {
            public void run() {
                gVar.mo894a(kindaJSInvokeEvent.f69427e.f69432a);
            }
        };
        kindaJSInvokeEvent.publish();
    }
}
