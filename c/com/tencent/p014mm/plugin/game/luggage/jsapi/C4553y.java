package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.model.C6049n1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p500dy.C97560f;
import p749xh.C66261f3;
import p828wa.C53095a;
import p828wa.C53096b;
import rx3.C13598b0;
import sw1.C48478n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.y */
public final class C4553y extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.y$a */
    public static final class C4554a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f19301d;

        /* renamed from: e */
        public final /* synthetic */ C4553y f19302e;

        /* renamed from: f */
        public final /* synthetic */ C43620m2.C5947b f19303f;

        public C4554a(JSONObject jSONObject, C4553y yVar, C43620m2.C5947b bVar) {
            this.f19301d = jSONObject;
            this.f19302e = yVar;
            this.f19303f = bVar;
        }

        public final void run() {
            JSONObject jSONObject = this.f19301d;
            if (jSONObject == null) {
                C4553y.m4855f(this.f19302e, this.f19303f);
                return;
            }
            String optString = jSONObject.optString("videoId");
            if (Util.isNullOrNil(optString)) {
                C4553y.m4855f(this.f19302e, this.f19303f);
                return;
            }
            C48478n.C13792e rR = ((C48478n) C86312j.m106911c(C48478n.class)).mo65692rR(optString);
            if (rR == null) {
                this.f19303f.mo6945a((String) null, (JSONObject) null);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.f19302e.mo5414g(rR));
            jSONObject2.put("result", jSONArray);
            this.f19303f.mo6945a((String) null, jSONObject2);
        }
    }

    /* renamed from: f */
    public static final void m4855f(C4553y yVar, C43620m2.C5947b bVar) {
        ArrayList<C48478n.C13792e> arrayList;
        yVar.getClass();
        List<C48478n.C13792e> Qj0 = ((C48478n) C86312j.m106911c(C48478n.class)).Qj0();
        if (Qj0 != null) {
            arrayList = new ArrayList<>();
            for (T next : Qj0) {
                if (C86013q1.m106450k(((C48478n.C13792e) next).f38910d)) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gamelog.jsapi, JsApiGetLocalMiniGameVideo , allVideoList.size = ");
        sb.append(Qj0 != null ? Integer.valueOf(Qj0.size()) : null);
        sb.append("  fileExistVideoList.size = ");
        sb.append(arrayList != null ? Integer.valueOf(arrayList.size()) : null);
        Log.m105924i("getLocalMiniGameVideo", sb.toString());
        if (arrayList == null || arrayList.isEmpty()) {
            bVar.mo6945a((String) null, (JSONObject) null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (C48478n.C13792e eVar : arrayList) {
            C87412m.m108593f(eVar, LocaleUtil.ITALIAN);
            jSONArray.put(yVar.mo5414g(eVar));
        }
        jSONObject.put("result", jSONArray);
        bVar.mo6945a((String) null, jSONObject);
    }

    /* renamed from: b */
    public String mo5382b() {
        return "getLocalMiniGameVideo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        if (bVar != null) {
            JSONObject e = C6013c.m5893e(str);
            ((C119157j) C119157j.f356862d).mo183875f(new C4554a(e, this, bVar));
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }

    /* renamed from: g */
    public final JSONObject mo5414g(C48478n.C13792e eVar) {
        String str = eVar.f38910d;
        C87412m.m108593f(str, "it.path");
        WebViewJSSDKVideoItem a = C6049n1.m5932a(str);
        C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(str);
        if (Z40 != null) {
            a.f22269w = Z40.mo130041a();
            int i = Z40.f273456n;
            if (i == 90 || i == 270) {
                a.f283030p = Z40.f273446d;
                a.f283031q = Z40.f273445c;
            } else {
                a.f283030p = Z40.f273445c;
                a.f283031q = Z40.f273446d;
            }
            a.f283029o = (int) C86013q1.m106451l(str);
        }
        C6080m.Ax0().mo7009a(a);
        WebViewJSSDKFileItem b = C6049n1.m5933b(eVar.f38913g);
        C6080m.Ax0().mo7009a(b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", eVar.f38908b);
        jSONObject.put("appName", eVar.f38909c);
        String str2 = eVar.f38914h;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
        String str4 = eVar.f38915i;
        if (str4 != null) {
            str3 = str4;
        }
        jSONObject.put("desc", str3);
        jSONObject.put("creatTime", eVar.f38911e);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C66261f3.COL_LOCALID, a.f283022e);
        jSONObject2.put("videoId", eVar.f38907a);
        jSONObject2.put("duration", eVar.f38912f);
        jSONObject2.put("width", a.f283030p);
        jSONObject2.put("height", a.f283031q);
        jSONObject2.put("thumbLocalId", b.f283022e);
        jSONObject2.put("configJson", eVar.f38916j);
        C13598b0 b0Var = C13598b0.f38549a;
        jSONObject.put("videoInfo", jSONObject2);
        return jSONObject;
    }
}
