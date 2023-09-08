package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C20557b;
import ea2.C31443g;
import hp0.C87574a;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import nb0.C88913c;
import org.json.JSONObject;
import p1055vh.C90804a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.h */
public class C82082h extends C82016a0 {
    public static final int CTRL_INDEX = 291;
    public static final String NAME = "createAudioInstance";

    /* renamed from: g */
    public static Vector<String> f240692g = new Vector<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.h$a */
    public class C82083a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ String f240693d;

        public C82083a(String str) {
            this.f240693d = str;
        }

        /* renamed from: b */
        public void mo109496b() {
            String str = this.f240693d;
            ((ConcurrentHashMap) C87574a.f253661d).put(str, Boolean.TRUE);
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105925i("MicroMsg.Audio.JsApiCreateAudioInstance", "onDestroy, appId:%s", this.f240693d);
            C82084b bVar = new C82084b();
            bVar.f240696f = 2;
            bVar.f240694d = this.f240693d;
            System.currentTimeMillis();
            bVar.mo114501a();
            C83231l.m102144e(this.f240693d, this);
            C82082h.f240692g.remove(this.f240693d);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            Log.m105925i("MicroMsg.Audio.JsApiCreateAudioInstance", "onPause, appId:%s", this.f240693d);
            String str = this.f240693d;
            ((ConcurrentHashMap) C87574a.f253661d).put(str, Boolean.FALSE);
            C82084b bVar = new C82084b();
            bVar.f240696f = 1;
            bVar.f240694d = this.f240693d;
            bVar.mo114528c();
        }

        /* renamed from: f */
        public void mo109498f() {
            String str = this.f240693d;
            ((ConcurrentHashMap) C87574a.f253661d).put(str, Boolean.TRUE);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.h$b */
    public static class C82084b extends C82073a {

        /* renamed from: d */
        public String f240694d = "";

        /* renamed from: e */
        public String f240695e = "";

        /* renamed from: f */
        public int f240696f = 0;

        /* renamed from: a */
        public void mo114501a() {
            Log.m105925i("MicroMsg.Audio.JsApiCreateAudioInstance", "runTask flag:%d", Integer.valueOf(this.f240696f));
            int i = this.f240696f;
            if (i == 0) {
                String a = C88913c.m111003a(this.f240694d, this.f240695e);
                this.f240695e = a;
                Log.m105925i("MicroMsg.Audio.JsApiCreateAudioInstance", "player audioId:%s", a);
                TextUtils.isEmpty(this.f240695e);
            } else if (i == 1) {
                Log.m105924i("MicroMsg.Audio.JsApiCreateAudioInstance", "pauseAllAudioPlayer");
                String str = this.f240694d;
                Log.m105925i("MicroMsg.AudioPlayerHelper", "pauseAllAudioPlayer appId:%s", str);
                C90804a aVar = new C90804a();
                C90804a.C90805a aVar2 = aVar.f260748a;
                aVar2.f260750a = 12;
                aVar2.f260752c = str;
                C20557b.m22327a(aVar);
            } else if (i == 2) {
                Log.m105924i("MicroMsg.Audio.JsApiCreateAudioInstance", "stopAllAudioPlayer");
                String str2 = this.f240694d;
                Log.m105925i("MicroMsg.AudioPlayerHelper", "destroyAllAudioPlayer appId:%s", str2);
                C90804a aVar3 = new C90804a();
                C90804a.C90805a aVar4 = aVar3.f260748a;
                aVar4.f260750a = 9;
                aVar4.f260752c = str2;
                C20557b.m22327a(aVar3);
                C87574a.m108909b(this.f240694d);
            }
            super.mo114502b();
            int i2 = this.f240696f;
            if (i2 == 0) {
                if (!TextUtils.isEmpty(this.f240695e)) {
                    Log.m105924i("MicroMsg.Audio.JsApiCreateAudioInstance", "create player ok");
                } else {
                    Log.m105920e("MicroMsg.Audio.JsApiCreateAudioInstance", "create player failed");
                }
            } else if (i2 != 1) {
                Log.m105920e("MicroMsg.Audio.JsApiCreateAudioInstance", "destroy audio instance end");
            }
        }
    }

    /* renamed from: v */
    public static String m100792v(C82381f fVar) {
        String appId = fVar.getAppId();
        String a = C31443g.m39405a();
        Log.m105925i("MicroMsg.Audio.JsApiCreateAudioInstance", "createAudioInstance appId:%s, audioId:%s", appId, a);
        C82084b bVar = new C82084b();
        bVar.f240695e = a;
        bVar.f240696f = 0;
        bVar.f240694d = appId;
        bVar.mo114528c();
        C82083a aVar = new C82083a(appId);
        if (!f240692g.contains(appId)) {
            C83231l.m102140a(appId, aVar);
            f240692g.add(appId);
        }
        return a;
    }

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("audioId", m100792v(fVar));
        return mo115112m("ok", hashMap);
    }
}
