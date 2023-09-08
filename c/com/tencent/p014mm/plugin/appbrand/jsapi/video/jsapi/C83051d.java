package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import hn0.C20960b;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p224ra.C89909e;
import ym0.C91508e;
import ym0.C91510h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d */
public class C83051d extends C82268c {
    public static final int CTRL_INDEX = 482;
    public static final String NAME = "loadVideoResource";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d$a */
    public class C83052a implements C91508e {

        /* renamed from: a */
        public final /* synthetic */ C82381f f242788a;

        /* renamed from: b */
        public final /* synthetic */ C91510h f242789b;

        public C83052a(C82381f fVar, C91510h hVar) {
            this.f242788a = fVar;
            this.f242789b = hVar;
            C0125s lifecycleOwner = fVar.getLifecycleOwner();
            if (lifecycleOwner != null) {
                MMHandlerThread.postToMainThread(new d$a$$a(this, lifecycleOwner, hVar, this));
            }
        }

        /* renamed from: a */
        public void mo115306a(String str, String str2) {
            Log.m105925i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo onPreLoadSucc save_path = %s, url = %s", str2, str);
            C83051d dVar = C83051d.this;
            C82381f fVar = this.f242788a;
            dVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("resource", str);
            String jSONObject = new JSONObject(hashMap).toString();
            C20960b.C20973k kVar = new C20960b.C20973k();
            kVar.mo115161k(fVar);
            kVar.mo115163m(jSONObject);
            kVar.mo115158h();
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int zr;
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data nil"));
            Log.m105928w("MicroMsg.JsApiLoadVideoResource", "data is null");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            Log.m105928w("MicroMsg.JsApiLoadVideoResource", "dataArr nil");
            fVar.mo109647a(i, mo115109j("fail:dataArr nil"));
            return;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
            String optString = optJSONArray.optString(i3, "");
            Log.m105919d("MicroMsg.JsApiLoadVideoResource", "preLoadVideo videoUrl:%s", optString);
            if (Util.isNullOrNil(optString)) {
                Log.m105928w("MicroMsg.JsApiLoadVideoResource", "videoUrl i nil");
            } else {
                C91510h hVar = (C91510h) C89909e.m112436a(C91510h.class);
                if (!(hVar == null || (zr = hVar.mo125423zr(optString, new C83052a(fVar, hVar))) == 0)) {
                    Log.m105925i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo genPreLoad fail ret = %s, videoUrl = %s", Integer.valueOf(zr), optString);
                    mo115305w(fVar, optString, zr, 0);
                }
            }
            i2++;
        }
        if (i2 != 0 && i2 == optJSONArray.length()) {
            fVar.mo109647a(i, mo115109j("fail"));
        }
    }

    /* renamed from: w */
    public final void mo115305w(C82381f fVar, String str, int i, int i2) {
        String str2;
        if (i != -5) {
            str2 = i != -4 ? i != -3 ? i != -2 ? i != -1 ? "" : "args illegal" : "downloading" : "start download fail" : "create file fail";
        } else {
            str2 = "cdn download fail errCode:" + i2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errMsg", str2);
        hashMap.put("resource", str);
        String jSONObject = new JSONObject(hashMap).toString();
        C20960b.C20972j jVar = new C20960b.C20972j();
        jVar.mo115161k(fVar);
        jVar.mo115163m(jSONObject);
        jVar.mo115158h();
    }
}
