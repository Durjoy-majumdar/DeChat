package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import java.util.Map;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.n1 */
public class C5952n1<T extends C53095a> extends C43620m2<T> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.n1$a */
    public class C5953a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22184d;

        public C5953a(C53096b.C53097a aVar) {
            this.f22184d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:68:0x0189 A[Catch:{ JSONException -> 0x019b }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x018a A[Catch:{ JSONException -> 0x019b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r16 = this;
                r1 = r16
                java.lang.String r2 = "fail"
                r3 = 0
                wa.b$a r0 = r1.f22184d     // Catch:{ JSONException -> 0x019b }
                sa.k r0 = r0.f148190b     // Catch:{ JSONException -> 0x019b }
                org.json.JSONObject r0 = r0.f129368c     // Catch:{ JSONException -> 0x019b }
                java.lang.String r4 = "url"
                java.lang.String r4 = r0.optString(r4)     // Catch:{ JSONException -> 0x019b }
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ JSONException -> 0x019b }
                if (r5 == 0) goto L_0x001e
                wa.b$a r0 = r1.f22184d     // Catch:{ JSONException -> 0x019b }
                r0.mo73778c(r2, r3)     // Catch:{ JSONException -> 0x019b }
                return
            L_0x001e:
                java.lang.String r5 = "format"
                java.lang.String r6 = "utf8"
                java.lang.String r0 = r0.optString(r5, r6)     // Catch:{ JSONException -> 0x019b }
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x019b }
                r5.<init>()     // Catch:{ JSONException -> 0x019b }
                java.lang.Class<k00.b> r6 = k00.C46630b.class
                di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ JSONException -> 0x019b }
                k00.b r6 = (k00.C46630b) r6     // Catch:{ JSONException -> 0x019b }
                k00.c r6 = r6.Pl0()     // Catch:{ JSONException -> 0x019b }
                kb3.m r6 = (kb3.C46677m) r6     // Catch:{ JSONException -> 0x019b }
                r7 = 0
                r8 = 1
                boolean r7 = r6.mo71927f(r4, r8, r7)     // Catch:{ JSONException -> 0x019b }
                java.lang.String r9 = "data"
                java.lang.String r10 = "header"
                java.lang.String r11 = "UTF-8"
                r12 = 2
                java.lang.String r13 = "base64"
                java.lang.String r14 = ""
                java.lang.String r15 = "getTargetFile: "
                java.lang.String r8 = "MicroMsg.JsApiRequire"
                if (r7 == 0) goto L_0x00c5
                java.lang.String r7 = "has wepkg"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)     // Catch:{ JSONException -> 0x019b }
                com.tencent.xweb.WebResourceResponse r7 = r6.mo71932k(r3, r4, r3)     // Catch:{ JSONException -> 0x019b }
                if (r7 == 0) goto L_0x00c5
                java.io.InputStream r4 = r7.getData()     // Catch:{ JSONException -> 0x019b }
                byte[] r4 = ea3.C45587d.m50634c(r4)     // Catch:{ JSONException -> 0x019b }
                com.tencent.mm.plugin.webview.luggage.jsapi.n1 r3 = com.tencent.p014mm.plugin.webview.luggage.jsapi.C5952n1.this     // Catch:{ JSONException -> 0x019b }
                java.util.Map r7 = r7.getResponseHeaders()     // Catch:{ JSONException -> 0x019b }
                org.json.JSONObject r3 = com.tencent.p014mm.plugin.webview.luggage.jsapi.C5952n1.m5753f(r3, r7)     // Catch:{ JSONException -> 0x019b }
                r5.put(r10, r3)     // Catch:{ JSONException -> 0x019b }
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r4)     // Catch:{ UnsupportedEncodingException -> 0x00a1, OutOfMemoryError -> 0x0089 }
                if (r3 != 0) goto L_0x00b8
                boolean r0 = r0.equals(r13)     // Catch:{ UnsupportedEncodingException -> 0x00a1, OutOfMemoryError -> 0x0089 }
                if (r0 == 0) goto L_0x0082
                java.lang.String r14 = android.util.Base64.encodeToString(r4, r12)     // Catch:{ UnsupportedEncodingException -> 0x00a1, OutOfMemoryError -> 0x0089 }
                goto L_0x00b8
            L_0x0082:
                java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00a1, OutOfMemoryError -> 0x0089 }
                r0.<init>(r4, r11)     // Catch:{ UnsupportedEncodingException -> 0x00a1, OutOfMemoryError -> 0x0089 }
                r14 = r0
                goto L_0x00b8
            L_0x0089:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x019b }
                r3.<init>()     // Catch:{ JSONException -> 0x019b }
                r3.append(r15)     // Catch:{ JSONException -> 0x019b }
                java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x019b }
                r3.append(r0)     // Catch:{ JSONException -> 0x019b }
                java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x019b }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ JSONException -> 0x019b }
                goto L_0x00b8
            L_0x00a1:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x019b }
                r3.<init>()     // Catch:{ JSONException -> 0x019b }
                r3.append(r15)     // Catch:{ JSONException -> 0x019b }
                java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x019b }
                r3.append(r0)     // Catch:{ JSONException -> 0x019b }
                java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x019b }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ JSONException -> 0x019b }
            L_0x00b8:
                r5.put(r9, r14)     // Catch:{ JSONException -> 0x019b }
                wa.b$a r0 = r1.f22184d     // Catch:{ JSONException -> 0x019b }
                r0.mo73780e(r5)     // Catch:{ JSONException -> 0x019b }
                r3 = 1
                r6.mo71929h(r3)     // Catch:{ JSONException -> 0x019b }
                return
            L_0x00c5:
                ea3.d$a r5 = ea3.C45587d.m50636e(r4, r3, r3)     // Catch:{ JSONException -> 0x019b }
                if (r5 == 0) goto L_0x0194
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x019b }
                r3.<init>()     // Catch:{ JSONException -> 0x019b }
                com.tencent.mm.plugin.webview.luggage.jsapi.n1 r6 = com.tencent.p014mm.plugin.webview.luggage.jsapi.C5952n1.this     // Catch:{ JSONException -> 0x019b }
                java.util.Map<java.lang.String, java.lang.String> r7 = r5.f25880b     // Catch:{ JSONException -> 0x019b }
                org.json.JSONObject r6 = com.tencent.p014mm.plugin.webview.luggage.jsapi.C5952n1.m5753f(r6, r7)     // Catch:{ JSONException -> 0x019b }
                r3.put(r10, r6)     // Catch:{ JSONException -> 0x019b }
                byte[] r6 = r5.f25882d     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r6)     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                if (r6 != 0) goto L_0x0111
                boolean r0 = r0.equals(r13)     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                if (r0 == 0) goto L_0x00f1
                byte[] r0 = r5.f25882d     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                java.lang.String r0 = android.util.Base64.encodeToString(r0, r12)     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                goto L_0x0187
            L_0x00f1:
                java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                byte[] r0 = r5.f25882d     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                r6.<init>(r0, r11)     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x010f, OutOfMemoryError -> 0x010d }
                r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x010f, OutOfMemoryError -> 0x010d }
                java.lang.String r5 = "binaryData as String: "
                r0.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x010f, OutOfMemoryError -> 0x010d }
                r0.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x010f, OutOfMemoryError -> 0x010d }
                java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x010f, OutOfMemoryError -> 0x010d }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ UnsupportedEncodingException -> 0x010f, OutOfMemoryError -> 0x010d }
                goto L_0x016c
            L_0x010d:
                r0 = move-exception
                goto L_0x0156
            L_0x010f:
                r0 = move-exception
                goto L_0x0170
            L_0x0111:
                java.lang.String r6 = r5.f25881c     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                if (r6 != 0) goto L_0x0152
                boolean r0 = r0.equals(r13)     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                if (r0 == 0) goto L_0x0146
                java.lang.String r0 = r5.f25881c     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                byte[] r0 = r0.getBytes()     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                java.lang.String r5 = android.util.Base64.encodeToString(r0, r12)     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0143, OutOfMemoryError -> 0x0140 }
                r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0143, OutOfMemoryError -> 0x0140 }
                java.lang.String r6 = "text data as base64: "
                r0.append(r6)     // Catch:{ UnsupportedEncodingException -> 0x0143, OutOfMemoryError -> 0x0140 }
                r0.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x0143, OutOfMemoryError -> 0x0140 }
                java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x0143, OutOfMemoryError -> 0x0140 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ UnsupportedEncodingException -> 0x0143, OutOfMemoryError -> 0x0140 }
                r0 = r5
                goto L_0x0187
            L_0x0140:
                r0 = move-exception
                r6 = r5
                goto L_0x0156
            L_0x0143:
                r0 = move-exception
                r6 = r5
                goto L_0x0170
            L_0x0146:
                java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                java.lang.String r4 = r5.f25881c     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                byte[] r4 = r4.getBytes()     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                r0.<init>(r4, r11)     // Catch:{ UnsupportedEncodingException -> 0x016e, OutOfMemoryError -> 0x0154 }
                goto L_0x0187
            L_0x0152:
                r0 = r14
                goto L_0x0187
            L_0x0154:
                r0 = move-exception
                r6 = r14
            L_0x0156:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x019b }
                r4.<init>()     // Catch:{ JSONException -> 0x019b }
                r4.append(r15)     // Catch:{ JSONException -> 0x019b }
                java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x019b }
                r4.append(r0)     // Catch:{ JSONException -> 0x019b }
                java.lang.String r0 = r4.toString()     // Catch:{ JSONException -> 0x019b }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ JSONException -> 0x019b }
            L_0x016c:
                r0 = r6
                goto L_0x0187
            L_0x016e:
                r0 = move-exception
                r6 = r14
            L_0x0170:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x019b }
                r4.<init>()     // Catch:{ JSONException -> 0x019b }
                r4.append(r15)     // Catch:{ JSONException -> 0x019b }
                java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x019b }
                r4.append(r0)     // Catch:{ JSONException -> 0x019b }
                java.lang.String r0 = r4.toString()     // Catch:{ JSONException -> 0x019b }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ JSONException -> 0x019b }
                goto L_0x016c
            L_0x0187:
                if (r0 != 0) goto L_0x018a
                goto L_0x018b
            L_0x018a:
                r14 = r0
            L_0x018b:
                r3.put(r9, r14)     // Catch:{ JSONException -> 0x019b }
                wa.b$a r0 = r1.f22184d     // Catch:{ JSONException -> 0x019b }
                r0.mo73780e(r3)     // Catch:{ JSONException -> 0x019b }
                goto L_0x01a1
            L_0x0194:
                wa.b$a r0 = r1.f22184d     // Catch:{ JSONException -> 0x019b }
                r3 = 0
                r0.mo73778c(r2, r3)     // Catch:{ JSONException -> 0x019b }
                goto L_0x01a1
            L_0x019b:
                wa.b$a r0 = r1.f22184d
                r3 = 0
                r0.mo73778c(r2, r3)
            L_0x01a1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.jsapi.C5952n1.C5953a.run():void");
        }
    }

    /* renamed from: f */
    public static JSONObject m5753f(C5952n1 n1Var, Map map) {
        n1Var.getClass();
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public String mo5382b() {
        return "require";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<T>.a aVar) {
        ((C119157j) C119157j.f356862d).mo183875f(new C5953a(aVar));
    }
}
