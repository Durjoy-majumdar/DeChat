package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45698f;
import ex0.C45699g;
import f40.C86709a0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import org.json.JSONObject;
import te3.C52109yf2;
import te3.C52129yk2;
import te3.C52278zk2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/h;", "Lcom/tencent/mm/plugin/lite/api/c;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.h */
public final class C42493h extends C4770c {

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.h$a */
    public static final class C42494a implements C45699g {

        /* renamed from: a */
        public final /* synthetic */ C42493h f115026a;

        public C42494a(C42493h hVar) {
            this.f115026a = hVar;
        }

        /* renamed from: a */
        public boolean mo66580a(TransferRequestInfo transferRequestInfo) {
            return false;
        }

        /* renamed from: b */
        public void mo66581b(int i, String str, C52278zk2 zk22) {
            HashMap hashMap = new HashMap();
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = zk22 != null ? Integer.valueOf(zk22.f146051d) : null;
            Log.m105925i("LiteAppJsApiExtTransfer", "extTransfer errMsg: %s, response: %s", objArr);
            if (zk22 != null) {
                hashMap.put("errCode", Integer.valueOf(zk22.f146051d));
                String str2 = zk22.f146053f;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put("result", str2);
                LinkedList<C52109yf2> linkedList = zk22.f146054g;
                C87412m.m108593f(linkedList, "response.header");
                if (!linkedList.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    LinkedList<C52109yf2> linkedList2 = zk22.f146054g;
                    C87412m.m108593f(linkedList2, "response.header");
                    for (C52109yf2 yf22 : linkedList2) {
                        String str3 = yf22.f145258d;
                        if (!(str3 == null || str3.length() == 0)) {
                            jSONObject.put(yf22.f145258d, yf22.f145259e);
                        }
                    }
                    hashMap.put("header", jSONObject);
                }
                if (zk22.f146051d == 0) {
                    this.f115026a.f19815f.mo5691c(hashMap);
                } else {
                    this.f115026a.f19815f.mo5689a("extTransfer: fail");
                }
            } else {
                this.f115026a.f19815f.mo5689a("extTransfer: fail");
            }
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiExtTransfer", "Invoke extTransfer");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        WxaLiteAppInfo j = C115492q.m162360g().mo175472j(str);
        if (j == null) {
            Log.m105928w("LiteAppJsApiExtTransfer", "get LiteAppInfo fail");
            C115669n.INSTANCE.mo175913w(1293, 124, 1);
            this.f19815f.mo5689a("can not find liteApp from local storage");
            return;
        }
        String authUrl = LiteAppCenter.getAuthUrl(j.f339295i, j.f339290d, j.f339294h);
        if (authUrl != null) {
            boolean z2 = true;
            if (!(authUrl.length() == 0)) {
                TransferRequestInfo transferRequestInfo = new TransferRequestInfo();
                transferRequestInfo.f109024d = 1;
                transferRequestInfo.f109026f = jSONObject.optString("scope");
                transferRequestInfo.f109025e = authUrl;
                C52129yk2 yk22 = new C52129yk2();
                yk22.f145341d = jSONObject.optString("reqUrl");
                yk22.f145343f = jSONObject.optInt("cgiCmdId");
                yk22.f145342e = jSONObject.optString("reqBody");
                yk22.f145345h = jSONObject.optInt(FirebaseAnalytics.C113379b.METHOD);
                transferRequestInfo.f109028h = yk22;
                transferRequestInfo.f109029i = jSONObject.optBoolean("is_security_check", false);
                try {
                    String optString = jSONObject.optString("header");
                    C87412m.m108593f(optString, "headerStr");
                    if (optString.length() <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        JSONObject jSONObject2 = new JSONObject(optString);
                        Iterator<String> keys = jSONObject2.keys();
                        C87412m.m108593f(keys, "keyList");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString2 = jSONObject2.optString(next);
                            LinkedList<C52109yf2> linkedList = transferRequestInfo.f109028h.f145344g;
                            C52109yf2 yf22 = new C52109yf2();
                            yf22.f145258d = next;
                            yf22.f145259e = optString2;
                            linkedList.push(yf22);
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("LiteAppJsApiExtTransfer", e, "parseTransferRequestInfo exception", new Object[0]);
                }
                ((C45698f) C86709a0.m107533q(C45698f.class)).mo71195RT(transferRequestInfo, new C42494a(this));
                return;
            }
        }
        this.f19815f.mo5689a("get auth url fail");
    }
}
