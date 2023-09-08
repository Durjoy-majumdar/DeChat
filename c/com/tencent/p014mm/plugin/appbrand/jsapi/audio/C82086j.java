package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import nb0.C88913c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.j */
public class C82086j extends C82268c {
    public static final int CTRL_INDEX = 290;
    public static final String NAME = "destroyAudioInstance";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.j$a */
    public static class C82087a extends C82073a {

        /* renamed from: d */
        public C82870p f240697d;

        /* renamed from: e */
        public C82381f f240698e;

        /* renamed from: f */
        public int f240699f;

        /* renamed from: g */
        public String f240700g = "";

        /* renamed from: h */
        public boolean f240701h = false;

        public C82087a(C82870p pVar, C82381f fVar, int i) {
            this.f240697d = pVar;
            this.f240698e = fVar;
            this.f240699f = i;
        }

        /* renamed from: a */
        public void mo114501a() {
            Log.m105924i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "runTask");
            this.f240701h = C88913c.m111004b(this.f240700g);
            super.mo114502b();
            Log.m105924i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "callback");
            C82381f fVar = this.f240698e;
            if (fVar == null) {
                Log.m105920e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "server is null");
            } else if (this.f240701h) {
                fVar.mo109647a(this.f240699f, this.f240697d.mo115109j("fail"));
            } else {
                fVar.mo109647a(this.f240699f, this.f240697d.mo115109j("ok"));
            }
        }
    }

    /* renamed from: h */
    public boolean mo114532h() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }

    /* renamed from: v */
    public void mo114531v(C82381f fVar, JSONObject jSONObject, int i, C40482o oVar) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "destroyAudioInstance fail, data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
            return;
        }
        Log.m105925i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "destroyAudioInstance data:%s", jSONObject.toString());
        String optString = jSONObject.optString("audioId");
        if (TextUtils.isEmpty(optString)) {
            Log.m105920e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "audioId is empty");
            fVar.mo109647a(i, mo115109j("fail:audioId is empty"));
            return;
        }
        C82087a aVar = new C82087a(this, fVar, i);
        fVar.getAppId();
        aVar.f240700g = optString;
        aVar.mo114528c();
        C82077c.INSTANCE.mo114530a(fVar.getAppId()).mo122427b(optString);
    }
}
