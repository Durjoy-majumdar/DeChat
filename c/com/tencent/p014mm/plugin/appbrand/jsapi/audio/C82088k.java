package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import nb0.C88912b;
import nb0.C88913c;
import nb0.C88914d;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.k */
public class C82088k extends C82268c {
    public static final int CTRL_INDEX = 293;
    public static final String NAME = "getAudioState";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.k$a */
    public static class C82089a extends C82073a {

        /* renamed from: d */
        public C82870p f240702d;

        /* renamed from: e */
        public C82381f f240703e;

        /* renamed from: f */
        public int f240704f;

        /* renamed from: g */
        public String f240705g = "";

        /* renamed from: h */
        public int f240706h = 0;

        /* renamed from: i */
        public int f240707i;

        /* renamed from: j */
        public int f240708j;

        /* renamed from: n */
        public int f240709n;

        /* renamed from: o */
        public String f240710o;

        /* renamed from: p */
        public int f240711p;

        /* renamed from: q */
        public double f240712q;

        /* renamed from: r */
        public String f240713r = null;

        /* renamed from: s */
        public boolean f240714s = false;

        /* renamed from: t */
        public String f240715t;

        public C82089a(C82870p pVar, C82381f fVar, int i) {
            this.f240702d = pVar;
            this.f240703e = fVar;
            this.f240704f = i;
        }

        /* renamed from: a */
        public void mo114501a() {
            int i;
            C88914d d = C88913c.m111006d(this.f240705g);
            if (d == null) {
                Log.m105921e("MicroMsg.Audio.JsApiGetAudioState", "audioState is null, audioId:%s", this.f240705g);
                this.f240714s = true;
                this.f240715t = "return parameter is invalid";
                mo114502b();
                return;
            }
            int i2 = d.f256442a;
            if (i2 < 0 || (i = d.f256443b) < 0) {
                Log.m105921e("MicroMsg.Audio.JsApiGetAudioState", "return parameter is invalid, duration:%d, currentTime:%d", Integer.valueOf(i2), Integer.valueOf(d.f256443b));
                this.f240714s = true;
                this.f240715t = "return parameter is invalid";
                mo114502b();
                return;
            }
            this.f240706h = i2;
            this.f240707i = i;
            this.f240708j = d.f256444c ? 1 : 0;
            this.f240710o = d.f256447f;
            this.f240709n = d.f256446e;
            this.f240711p = d.f256448g;
            this.f240713r = d.f256449h;
            C88912b c = C88913c.m111005c(this.f240705g);
            if (c != null) {
                this.f240712q = c.f256428m;
            }
            Log.m105919d("MicroMsg.Audio.JsApiGetAudioState", "duration: %d , currentTime: %d ,paused: %d , buffered: %d , src: %s, startTime:%d, playbackRate:%f", Integer.valueOf(this.f240706h), Integer.valueOf(this.f240707i), Integer.valueOf(this.f240708j), Integer.valueOf(this.f240709n), this.f240710o, Integer.valueOf(this.f240711p), Double.valueOf(this.f240712q));
            mo114502b();
        }

        /* renamed from: b */
        public void mo114502b() {
            if (this.f240703e == null) {
                Log.m105920e("MicroMsg.Audio.JsApiGetAudioState", "service is null");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Integer.valueOf(this.f240706h));
            hashMap.put("currentTime", Integer.valueOf(this.f240707i));
            hashMap.put("paused", Boolean.valueOf(this.f240708j == 1));
            hashMap.put("buffered", Integer.valueOf(this.f240709n));
            hashMap.put("src", this.f240710o);
            hashMap.put("startTime", Integer.valueOf(this.f240711p));
            hashMap.put("playbackRate", Double.valueOf(this.f240712q));
            hashMap.put("referrerPolicy", this.f240713r);
            String str = TextUtils.isEmpty(this.f240715t) ? "" : this.f240715t;
            if (this.f240714s) {
                Log.m105921e("MicroMsg.Audio.JsApiGetAudioState", "getAudioState fail, err:%s", str);
                C82381f fVar = this.f240703e;
                int i = this.f240704f;
                C82870p pVar = this.f240702d;
                fVar.mo109647a(i, pVar.mo115109j("fail:" + str));
                return;
            }
            this.f240703e.mo109647a(this.f240704f, this.f240702d.mo115112m("ok", hashMap));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.Audio.JsApiGetAudioState", "getAudioState data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
            return;
        }
        String optString = jSONObject.optString("audioId");
        if (TextUtils.isEmpty(optString)) {
            Log.m105920e("MicroMsg.Audio.JsApiGetAudioState", "getAudioState audioId is empty");
            fVar.mo109647a(i, mo115109j("fail:audioId is empty"));
            return;
        }
        C82089a aVar = new C82089a(this, fVar, i);
        fVar.getAppId();
        aVar.f240705g = optString;
        aVar.mo114528c();
    }
}
