package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C51793w7;
import te3.r45;
import te3.s45;
import wi0.C53173v;
import zp0.C16377l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g3 */
public class C40464g3 extends C82268c {
    public static final int CTRL_INDEX = 236;
    public static final String NAME = "getSetting";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g3$a */
    public class C40465a implements C87581a<Object, s45> {

        /* renamed from: a */
        public final /* synthetic */ C82381f f108751a;

        /* renamed from: b */
        public final /* synthetic */ int f108752b;

        public C40465a(C82381f fVar, int i) {
            this.f108751a = fVar;
            this.f108752b = i;
        }

        public Object call(Object obj) {
            s45 s45 = (s45) obj;
            if (s45 == null) {
                Log.m105920e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq cgi failed, null response");
                this.f108751a.mo109647a(this.f108752b, C40464g3.this.mo115109j("fail:cgi fail"));
                return null;
            }
            int i = s45.BaseResponse.f135955d;
            if (i != 0) {
                Log.m105921e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq cgi failed, errCode = %d, errMsg = %s", Integer.valueOf(i), s45.BaseResponse.f135956e);
                this.f108751a.mo109647a(this.f108752b, C40464g3.this.mo115109j("fail:cgi fail"));
                return null;
            }
            try {
                LinkedList<C51793w7> linkedList = s45.f141327e;
                JSONArray jSONArray = new JSONArray();
                Iterator<C51793w7> it = linkedList.iterator();
                while (it.hasNext()) {
                    C51793w7 next = it.next();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("scope", next.f143896d);
                        jSONObject.put("state", next.f143898f);
                        jSONObject.put("desc", next.f143897e);
                        jSONArray.put(jSONObject);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.JsApiGetSetting", "parse json failed : %s", e.getMessage());
                    }
                }
                String jSONArray2 = jSONArray.toString();
                Log.m105919d("MicroMsg.JsApiGetSetting", "authInfo %s", jSONArray);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errMsg", "getSetting:ok");
                    jSONObject2.put("authSetting", new JSONArray(Util.nullAsNil(jSONArray2)));
                    this.f108751a.mo109647a(this.f108752b, jSONObject2.toString());
                    return null;
                } catch (JSONException e2) {
                    Log.printErrStackTrace("MicroMsg.JsApiGetSetting", e2, "set json error!", new Object[0]);
                    this.f108751a.mo109647a(this.f108752b, C40464g3.this.mo115109j("fail:resp invalid"));
                    return null;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        r45 r45 = new r45();
        String appId = fVar.getAppId();
        r45.f140693d = appId;
        r45.f140694e = C53173v.f148355a.mo73862a(appId);
        ((C16377l) fVar.mo109668l(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp_getauthinfo", r45.f140693d, r45, s45.class).mo123061d(new C40465a(fVar, i));
    }
}
