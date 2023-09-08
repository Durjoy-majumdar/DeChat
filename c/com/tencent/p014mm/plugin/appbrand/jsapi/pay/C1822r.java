package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kr0.C88267e;
import org.json.JSONObject;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.r */
public final class C1822r implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C1824s f11620a;

    /* renamed from: b */
    public final /* synthetic */ WeakReference<C88267e> f11621b;

    /* renamed from: c */
    public final /* synthetic */ C88267e f11622c;

    /* renamed from: d */
    public final /* synthetic */ int f11623d;

    public C1822r(C1824s sVar, WeakReference<C88267e> weakReference, C88267e eVar, int i) {
        this.f11620a = sVar;
        this.f11621b = weakReference;
        this.f11622c = eVar;
        this.f11623d = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        Log.m105925i("JsApiQuickSendRedPacket", "on result, requestCode: %d, resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f11620a.f11627g != i) {
            return false;
        }
        C88267e eVar = this.f11621b.get();
        if (!(eVar == null || intent == null)) {
            C88267e eVar2 = this.f11622c;
            int i3 = this.f11623d;
            C1824s sVar = this.f11620a;
            String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
            if (C87412m.m108589b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED")) {
                if (eVar2 != null) {
                    sVar.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 701117, "fail:quick send redpacket cancel select conversation");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errno", 701117);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    eVar.mo109647a(i3, sVar.mo115115p("fail:quick send redpacket cancel select conversation", jSONObject));
                }
            } else if (!C87412m.m108589b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS")) {
                Log.m105924i("JsApiQuickSendRedPacket", "unknow luckymoney finish reason");
                if (eVar2 != null) {
                    sVar.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("errno", 101);
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                    }
                    eVar.mo109647a(i3, sVar.mo115115p("fail:jsapi invalid request data", jSONObject2));
                }
            } else if (eVar2 != null) {
                sVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                eVar.mo109647a(i3, sVar.mo115115p("ok", jSONObject3));
            }
        }
        return true;
    }
}
