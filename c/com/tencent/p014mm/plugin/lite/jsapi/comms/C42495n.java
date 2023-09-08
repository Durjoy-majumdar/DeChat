package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.os.Bundle;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.C115478f;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.plugin.lite.storage.C30151d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import i22.C46162a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.n */
public class C42495n extends C4770c {

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.n$a */
    public class C42496a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f115027d;

        public C42496a(boolean[] zArr) {
            this.f115027d = zArr;
        }

        public void run() {
            synchronized (this.f115027d) {
                if (!this.f115027d[0]) {
                    Log.m105928w("LiteAppJsApiLogin", "geta8key timeout");
                    this.f115027d[0] = true;
                    C42495n.this.f19815f.mo5689a("getA8Key timeout");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.n$b */
    public class C42497b implements C46162a.C46165c {

        /* renamed from: a */
        public final /* synthetic */ boolean[] f115029a;

        /* renamed from: b */
        public final /* synthetic */ String f115030b;

        /* renamed from: c */
        public final /* synthetic */ boolean f115031c;

        /* renamed from: d */
        public final /* synthetic */ String[] f115032d;

        public C42497b(boolean[] zArr, String str, boolean z, String[] strArr) {
            this.f115029a = zArr;
            this.f115030b = str;
            this.f115031c = z;
            this.f115032d = strArr;
        }

        /* renamed from: a */
        public void mo66577a() {
            synchronized (this.f115029a) {
                if (!this.f115029a[0]) {
                    Log.m105928w("LiteAppJsApiLogin", "geta8key fail");
                    this.f115029a[0] = true;
                    C42495n.this.f19815f.mo5689a("getA8Key fail");
                }
            }
        }

        /* renamed from: b */
        public void mo66578b(C46162a.C46164b bVar) {
            Bundle extraData;
            synchronized (this.f115029a) {
                if (!this.f115029a[0]) {
                    Log.m105924i("LiteAppJsApiLogin", "geta8key:" + this.f115030b);
                    this.f115029a[0] = true;
                    String str = this.f115030b;
                    if (str != null && C115478f.f346206a.contains(str)) {
                        ((HashMap) bVar.f124452c).put("referer", "https://game.weixin.qq.com/");
                    }
                    LiteAppCenter.ILiteAppUICallback iLiteAppUICallback = LiteAppCenter.mUICallback.get(Integer.valueOf(C42495n.this.f19814e.f31713a));
                    if (!(iLiteAppUICallback == null || (extraData = iLiteAppUICallback.getExtraData()) == null)) {
                        extraData.putInt("sessionId", bVar.f124451b);
                    }
                    LiteAppCenter.setAuthInfo(this.f115030b, bVar.f124450a, bVar.f124452c, bVar.f124453d, this.f115031c);
                    C30151d dVar = new C30151d();
                    dVar.field_host = this.f115032d[0];
                    JSONObject jSONObject = new JSONObject();
                    Map<String, String> map = bVar.f124453d;
                    if (map != null) {
                        for (Map.Entry entry : ((HashMap) map).entrySet()) {
                            try {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    dVar.field_param = bVar.f124450a;
                    dVar.field_paramMap = jSONObject.toString();
                    dVar.field_updateTime = System.currentTimeMillis() / 1000;
                    dVar.field_headerMap = new JSONObject(bVar.f124452c).toString();
                    C115492q.m162360g().mo175480r(dVar);
                    C42495n.this.f19815f.mo5692d(jSONObject, false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        WxaLiteAppInfo j = C115492q.m162360g().mo175472j(str);
        if (j == null) {
            Log.m105928w("LiteAppJsApiLogin", "get LiteAppInfo fail");
            C115669n.INSTANCE.mo175913w(1293, 124, 1);
            this.f19815f.mo5689a("can not find liteApp from local storage");
            return;
        }
        boolean z2 = true;
        boolean[] zArr = {false};
        String[] strArr = {null};
        try {
            if (jSONObject.has("url")) {
                strArr[0] = jSONObject.getString("url");
            }
            if (strArr[0] == null) {
                strArr[0] = LiteAppCenter.getAuthUrl(j.f339295i, j.f339290d, j.f339294h);
            }
            if (jSONObject.has("passAll")) {
                z2 = jSONObject.getBoolean("passAll");
            }
            String str2 = strArr[0];
            if (str2 != null) {
                if (!str2.isEmpty()) {
                    long j2 = 60000;
                    if (jSONObject.has("timeout")) {
                        j2 = jSONObject.getLong("timeout");
                    }
                    ((C119157j) C119157j.f356862d).mo183878i(new C42496a(zArr), j2);
                    C46162a.INSTANCE.mo71600a(strArr[0], z2, new C42497b(zArr, str, z, strArr));
                    return;
                }
            }
            Log.m105928w("LiteAppJsApiLogin", "get authurl fail");
            this.f19815f.mo5689a("get authUrl fail, please make sure config authUrl in config file");
        } catch (JSONException unused) {
            this.f19815f.mo5689a("json exception");
        }
    }
}
