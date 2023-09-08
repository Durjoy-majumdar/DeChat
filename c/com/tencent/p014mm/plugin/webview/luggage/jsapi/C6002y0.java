package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.y0 */
public final class C6002y0 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.y0$a */
    public static final class C6003a<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f22251a;

        public C6003a(C43620m2.C5947b bVar) {
            this.f22251a = bVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            JSONObject jSONObject = new JSONObject();
            if (num != null && num.intValue() == 1) {
                jSONObject.put(StateEvent.Name.MESSAGE, "创建成功");
                jSONObject.put("code", 100);
                jSONObject.put("err_msg", "openFinderCreateAcctView:ok");
            } else if (num != null && num.intValue() == 2) {
                jSONObject.put(StateEvent.Name.MESSAGE, "用户取消");
                jSONObject.put("code", 200);
                jSONObject.put("err_msg", "openFinderCreateAcctView:cancel");
            } else if (num != null && num.intValue() == 3) {
                jSONObject.put(StateEvent.Name.MESSAGE, "参数为空");
                jSONObject.put("code", 300);
                jSONObject.put("err_msg", "openFinderCreateAcctView:fail");
            } else if (num != null && num.intValue() == 4) {
                jSONObject.put(StateEvent.Name.MESSAGE, "账号已存在");
                jSONObject.put("code", 301);
                jSONObject.put("err_msg", "openFinderCreateAcctView:fail");
            }
            C43620m2.C5947b bVar = this.f22251a;
            if (bVar != null) {
                bVar.mo6945a((String) null, jSONObject);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "openFinderCreateAcctView";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiOpenFinderCreateAcctView", "invokeInOwn");
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
                    JSONObject optJSONObject = jSONObject.optJSONObject("tipsWording");
                    C87412m.m108593f(optJSONObject, "data.optJSONObject(\"tipsWording\")");
                    jSONObject2.put("tipsWording", optJSONObject);
                    try {
                        Context context2 = MMApplicationContext.getContext();
                        C87412m.m108593f(context2, "getContext()");
                        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76761Ha(context2, (Intent) null, jSONObject2.toString(), new C6003a(bVar));
                    } catch (Exception unused) {
                        if (bVar != null) {
                            bVar.mo6945a("fail", (JSONObject) null);
                        }
                    }
                } catch (JSONException unused2) {
                    if (bVar != null) {
                        bVar.mo6945a("fail", (JSONObject) null);
                    }
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.JsApiOpenFinderCreateAcctView", "paras data error: " + e.getMessage());
                if (bVar != null) {
                    bVar.mo6945a("data is null", (JSONObject) null);
                }
            }
        } else if (bVar != null) {
            bVar.mo6945a("data is null", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
