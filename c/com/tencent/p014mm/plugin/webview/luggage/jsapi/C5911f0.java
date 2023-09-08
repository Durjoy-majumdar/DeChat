package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import java.util.HashMap;
import org.json.JSONObject;
import p828wa.C53096b;
import p828wa.C53138x;
import q62.C101048b;
import tm0.C90538k;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.f0 */
public class C5911f0 extends C43620m2<C53138x> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.f0$a */
    public static class C5912a implements C80916r<IPCVoid, IPCInteger> {
        private C5912a() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Class cls = C101048b.class;
            int i = 0;
            int Os = C86312j.m106911c(cls) != null ? ((C101048b) C86312j.m106911c(cls)).mo60590Os(16) : 0;
            if (Os != 0) {
                i = Os == 1 ? 1 : 2;
            }
            IPCInteger iPCInteger = new IPCInteger();
            iPCInteger.f10313d = i;
            return iPCInteger;
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return C90538k.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53138x>.a aVar) {
        Log.m105924i("MicroMsg.JsApiGetNetworkType", "invoke");
        if (!NetStatusUtil.isConnected(((C53138x) aVar.f148189a).f148196d)) {
            Log.m105924i("MicroMsg.JsApiGetNetworkType", "getNetworkType, not connected");
            aVar.mo73778c("network_type:fail", (JSONObject) null);
            return;
        }
        int netType = NetStatusUtil.getNetType(((C53138x) aVar.f148189a).f148196d);
        Log.m105924i("MicroMsg.JsApiGetNetworkType", "getNetworkType, type = " + netType);
        HashMap hashMap = new HashMap();
        hashMap.put("simtype", (IPCInteger) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, null, C5912a.class));
        if (NetStatusUtil.isWifi(((C53138x) aVar.f148189a).f148196d)) {
            Log.m105924i("MicroMsg.JsApiGetNetworkType", "getNetworkType, wifi");
            aVar.mo73777b("network_type:wifi", hashMap);
            return;
        }
        if (NetStatusUtil.is2G(((C53138x) aVar.f148189a).f148196d)) {
            Log.m105924i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 2g");
            hashMap.put("subtype", "2g");
        } else if (NetStatusUtil.is3G(((C53138x) aVar.f148189a).f148196d)) {
            Log.m105924i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 3g");
            hashMap.put("subtype", "3g");
        } else if (NetStatusUtil.is4G(((C53138x) aVar.f148189a).f148196d)) {
            Log.m105924i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 4g");
            hashMap.put("subtype", "4g");
        } else if (NetStatusUtil.is5G(((C53138x) aVar.f148189a).f148196d)) {
            Log.m105924i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 5g");
            hashMap.put("subtype", "5g");
        }
        aVar.mo73777b("network_type:wwan", hashMap);
    }
}
