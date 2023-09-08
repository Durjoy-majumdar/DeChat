package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.d0 */
public class C4465d0 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.d0$a */
    public class C4466a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f19235d;

        /* renamed from: e */
        public final /* synthetic */ Map f19236e;

        /* renamed from: f */
        public final /* synthetic */ C53096b.C53097a f19237f;

        public C4466a(String str, Map map, C53096b.C53097a aVar) {
            this.f19235d = str;
            this.f19236e = map;
            this.f19237f = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r15 = this;
                com.tencent.mm.plugin.game.luggage.jsapi.d0 r0 = com.tencent.p014mm.plugin.game.luggage.jsapi.C4465d0.this
                java.lang.String r1 = r15.f19235d
                java.util.Map r2 = r15.f19236e
                r0.getClass()
                com.tencent.mm.plugin.wepkg.model.WepkgVersion r0 = com.tencent.p014mm.plugin.wepkg.model.C44509m.m48884e(r1)
                r3 = 0
                r4 = 1
                java.lang.String r5 = "MicroMsg.JsApiGetWepkgFileInfo"
                java.lang.String r6 = "data"
                r7 = 0
                if (r0 != 0) goto L_0x0020
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r3] = r1
                java.lang.String r1 = "not exist wepkg[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
                goto L_0x0043
            L_0x0020:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                java.lang.String r8 = "version"
                java.lang.String r9 = r0.f120653f     // Catch:{ JSONException -> 0x00a1 }
                r1.put(r8, r9)     // Catch:{ JSONException -> 0x00a1 }
                com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r0 = r0.f120654g     // Catch:{ JSONException -> 0x00a1 }
                r8.<init>((java.lang.String) r0)     // Catch:{ JSONException -> 0x00a1 }
                boolean r0 = r8.mo119967g()     // Catch:{ JSONException -> 0x00a1 }
                if (r0 != 0) goto L_0x003a
                goto L_0x0043
            L_0x003a:
                com.tencent.mm.plugin.wepkg.model.j r0 = new com.tencent.mm.plugin.wepkg.model.j     // Catch:{ JSONException -> 0x00a1 }
                r0.<init>(r8)     // Catch:{ JSONException -> 0x00a1 }
                te3.qz4 r8 = r0.f120695e     // Catch:{ JSONException -> 0x00a1 }
                if (r8 != 0) goto L_0x0045
            L_0x0043:
                r1 = r7
                goto L_0x00af
            L_0x0045:
                java.util.LinkedList<te3.oe0> r9 = r8.f140629d     // Catch:{ JSONException -> 0x00a1 }
                if (r9 == 0) goto L_0x00af
                org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00a1 }
                r9.<init>()     // Catch:{ JSONException -> 0x00a1 }
                java.util.LinkedList<te3.oe0> r8 = r8.f140629d     // Catch:{ JSONException -> 0x00a1 }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x00a1 }
            L_0x0054:
                boolean r10 = r8.hasNext()     // Catch:{ JSONException -> 0x00a1 }
                if (r10 == 0) goto L_0x009b
                java.lang.Object r10 = r8.next()     // Catch:{ JSONException -> 0x00a1 }
                te3.oe0 r10 = (te3.C50667oe0) r10     // Catch:{ JSONException -> 0x00a1 }
                java.util.Set r11 = r2.keySet()     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r12 = r10.f139103d     // Catch:{ JSONException -> 0x00a1 }
                boolean r11 = r11.contains(r12)     // Catch:{ JSONException -> 0x00a1 }
                if (r11 == 0) goto L_0x0054
                java.lang.String r11 = r10.f139103d     // Catch:{ JSONException -> 0x00a1 }
                java.lang.Object r11 = r2.get(r11)     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ JSONException -> 0x00a1 }
                org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a1 }
                r12.<init>()     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r13 = "rid"
                java.lang.String r14 = r10.f139103d     // Catch:{ JSONException -> 0x00a1 }
                r12.put(r13, r14)     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r13 = "size"
                int r14 = r10.f139105f     // Catch:{ JSONException -> 0x00a1 }
                r12.put(r13, r14)     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r13 = "mimeType"
                java.lang.String r14 = r10.f139106g     // Catch:{ JSONException -> 0x00a1 }
                r12.put(r13, r14)     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r10 = r10.f139103d     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r10 = r0.mo69282c(r10, r11)     // Catch:{ JSONException -> 0x00a1 }
                r12.put(r6, r10)     // Catch:{ JSONException -> 0x00a1 }
                r9.put(r12)     // Catch:{ JSONException -> 0x00a1 }
                goto L_0x0054
            L_0x009b:
                java.lang.String r0 = "fileList"
                r1.put(r0, r9)     // Catch:{ JSONException -> 0x00a1 }
                goto L_0x00af
            L_0x00a1:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r0 = r0.getMessage()
                r2[r3] = r0
                java.lang.String r0 = "errMsg:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
            L_0x00af:
                if (r1 != 0) goto L_0x00b9
                wa.b$a r0 = r15.f19237f
                java.lang.String r1 = "fail"
                r0.mo73778c(r1, r7)
                return
            L_0x00b9:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r0.put(r6, r1)     // Catch:{ JSONException -> 0x00c1 }
            L_0x00c1:
                wa.b$a r1 = r15.f19237f
                r1.mo73780e(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.jsapi.C4465d0.C4466a.run():void");
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "getWepkgFileInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
        Log.m105924i("MicroMsg.JsApiGetWepkgFileInfo", "invokeInOwn");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject == null) {
            aVar.mo73778c("invalid_params", (JSONObject) null);
            return;
        }
        String optString = jSONObject.optString("wepkgId");
        JSONArray optJSONArray = jSONObject.optJSONArray("files");
        if (Util.isNullOrNil(optString) || optJSONArray == null || optJSONArray.length() == 0) {
            aVar.mo73778c("null_data", (JSONObject) null);
            return;
        }
        Log.m105925i("MicroMsg.JsApiGetWepkgFileInfo", "wepkgId:[%s] files:[%s]", optString, optJSONArray.toString());
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                hashMap.put(jSONObject2.optString("rid"), jSONObject2.optString(TPReportKeys.PlayerStep.PLAYER_FORMAT));
            } catch (JSONException unused) {
            }
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C4466a(optString, hashMap, aVar));
    }
}
