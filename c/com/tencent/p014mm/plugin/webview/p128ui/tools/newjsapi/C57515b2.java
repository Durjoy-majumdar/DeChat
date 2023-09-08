package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.v2helper;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p773yy.C66708h;
import qy2.C77459z;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import uz2.C65492p;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b2 */
public final class C57515b2 extends C15053a {

    /* renamed from: d */
    public static final C57515b2 f164755d = new C57515b2();

    /* renamed from: e */
    public static final int f164756e = v2helper.EMethodSetSpkEnhance;

    /* renamed from: f */
    public static final String f164757f = "publishTextState";

    /* renamed from: g */
    public static final HashMap<String, String> f164758g;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/b2$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b2$a */
    public static final class C57516a implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            byte[] byteArray = bundle.getByteArray("KEY_REQUEST_DATA");
            C77459z zVar = new C77459z();
            zVar.parseFrom(byteArray);
            ((C66708h) C86312j.m106911c(C66708h.class)).Ph0(MMApplicationContext.getContext(), zVar, new JsApiPublishTextState$JsSetStatusTask$invoke$setStatusCallback$1(gVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b2$b */
    public static final class C57517b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f164759d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f164760e;

        public C57517b(C13855j jVar, C13851h1 h1Var) {
            this.f164759d = jVar;
            this.f164760e = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            int i = bundle.getInt("KEY_RESULT_CODE");
            Bundle bundle2 = (Bundle) bundle.getParcelable("KEY_RESULT_DATA");
            byte[] bArr = null;
            if (i == -1) {
                C65492p pVar = new C65492p();
                if (bundle2 != null) {
                    bArr = bundle2.getByteArray("select_status_info");
                }
                if (bArr != null) {
                    pVar.parseFrom(bArr);
                }
                String str = pVar.f188455d;
                if (str == null) {
                    str = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("icon_id", str);
                C13849g gVar = this.f164759d.f39001d;
                String str2 = this.f164760e.f38990c;
                gVar.mo10774a(str2, this.f164760e.f38996i + ":ok", linkedHashMap);
                return;
            }
            C13849g gVar2 = this.f164759d.f39001d;
            String str3 = this.f164760e.f38990c;
            gVar2.mo10774a(str3, this.f164760e.f38996i + ":fail_cancel", (Map<String, Object>) null);
        }
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("websearch", "9");
        hashMap.put("h5", PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
        f164758g = hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01fc A[Catch:{ all -> 0x0217 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x020a A[Catch:{ all -> 0x0217 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0227 A[LOOP:0: B:64:0x0144->B:117:0x0227, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0262 A[EDGE_INSN: B:155:0x0262->B:127:0x0262 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0174 A[Catch:{ all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017a A[Catch:{ all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f0 A[Catch:{ all -> 0x0217 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r24, t83.C13851h1 r25) {
        /*
            r23 = this;
            r1 = r24
            r2 = r25
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r2, r0)
            boolean r0 = qy2.C77448f0.m93394f()
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0031
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.f38996i
            r5.append(r2)
            java.lang.String r2 = ":fail_not_support"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.mo10774a(r1, r2, r3)
            return r4
        L_0x0031:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "sourceId"
            java.lang.Object r0 = r0.get(r5)
            boolean r5 = r0 instanceof java.lang.String
            if (r5 == 0) goto L_0x0044
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            goto L_0x0045
        L_0x0044:
            r5 = r3
        L_0x0045:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "sourceActivityId"
            java.lang.Object r0 = r0.get(r6)
            boolean r6 = r0 instanceof java.lang.String
            if (r6 == 0) goto L_0x0058
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            goto L_0x0059
        L_0x0058:
            r6 = r3
        L_0x0059:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r7 = "sourceVerifyInfo"
            java.lang.Object r0 = r0.get(r7)
            boolean r7 = r0 instanceof java.lang.String
            if (r7 == 0) goto L_0x006c
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            goto L_0x006d
        L_0x006c:
            r7 = r3
        L_0x006d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r8 = "sourceName"
            java.lang.Object r0 = r0.get(r8)
            boolean r8 = r0 instanceof java.lang.String
            if (r8 == 0) goto L_0x0080
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            goto L_0x0081
        L_0x0080:
            r8 = r3
        L_0x0081:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r9 = "sourceIconURL"
            java.lang.Object r0 = r0.get(r9)
            boolean r9 = r0 instanceof java.lang.String
            if (r9 == 0) goto L_0x0094
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            goto L_0x0095
        L_0x0094:
            r9 = r3
        L_0x0095:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r10 = "iconId"
            java.lang.Object r0 = r0.get(r10)
            boolean r10 = r0 instanceof java.lang.String
            if (r10 == 0) goto L_0x00a7
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            goto L_0x00a8
        L_0x00a7:
            r10 = r3
        L_0x00a8:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r11 = "image"
            java.lang.Object r0 = r0.get(r11)
            boolean r11 = r0 instanceof java.lang.String
            if (r11 == 0) goto L_0x00ba
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            goto L_0x00bb
        L_0x00ba:
            r11 = r3
        L_0x00bb:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r12 = "desc"
            java.lang.Object r0 = r0.get(r12)
            boolean r12 = r0 instanceof java.lang.String
            if (r12 == 0) goto L_0x00cd
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            goto L_0x00ce
        L_0x00cd:
            r12 = r3
        L_0x00ce:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r13 = "jumpJSON"
            java.lang.Object r0 = r0.get(r13)
            boolean r13 = r0 instanceof java.lang.String
            if (r13 == 0) goto L_0x00df
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00e0
        L_0x00df:
            r0 = r3
        L_0x00e0:
            java.util.Map<java.lang.String, java.lang.Object> r13 = r2.f38983a
            java.util.HashMap r13 = (java.util.HashMap) r13
            java.lang.String r14 = "hideToast"
            java.lang.Object r13 = r13.get(r14)
            boolean r14 = r13 instanceof java.lang.String
            if (r14 == 0) goto L_0x00f1
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x00f2
        L_0x00f1:
            r13 = r3
        L_0x00f2:
            if (r13 == 0) goto L_0x00fc
            int r13 = java.lang.Integer.parseInt(r13)
            if (r13 != r4) goto L_0x00fc
            r13 = 1
            goto L_0x00fd
        L_0x00fc:
            r13 = 0
        L_0x00fd:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r4 = "publishTextState params:"
            r15.append(r4)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f38983a
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.lang.String r15 = "MicroMsg.JsApiPublishTextState"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)
            java.lang.String r4 = "buf"
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r0 == 0) goto L_0x0128
            boolean r16 = z04.C112551y.m153811k(r0)
            if (r16 == 0) goto L_0x0125
            goto L_0x0128
        L_0x0125:
            r16 = 0
            goto L_0x012a
        L_0x0128:
            r16 = 1
        L_0x012a:
            if (r16 != 0) goto L_0x025a
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x0248 }
            r14.<init>(r0)     // Catch:{ all -> 0x0248 }
            java.lang.String r0 = "infos"
            org.json.JSONArray r14 = r14.optJSONArray(r0)     // Catch:{ all -> 0x0248 }
            if (r14 == 0) goto L_0x025a
            r17 = r13
            int r13 = r14.length()     // Catch:{ all -> 0x0240 }
            if (r13 < 0) goto L_0x0239
            r18 = r12
            r12 = 0
        L_0x0144:
            org.json.JSONObject r0 = r14.optJSONObject(r12)     // Catch:{ all -> 0x0233 }
            if (r0 == 0) goto L_0x021d
            r19 = r14
            java.lang.String r14 = "type"
            java.lang.String r14 = r0.optString(r14)     // Catch:{ all -> 0x0233 }
            java.lang.String r0 = r0.optString(r4)     // Catch:{ all -> 0x0233 }
            r20 = r11
            java.util.HashMap<java.lang.String, java.lang.String> r11 = f164758g     // Catch:{ all -> 0x0219 }
            java.lang.Object r11 = r11.get(r14)     // Catch:{ all -> 0x0219 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0171
            boolean r14 = z04.C112551y.m153811k(r0)     // Catch:{ all -> 0x016c }
            if (r14 == 0) goto L_0x016a
            goto L_0x0171
        L_0x016a:
            r14 = 0
            goto L_0x0172
        L_0x016c:
            r0 = move-exception
            r21 = r7
            goto L_0x01e3
        L_0x0171:
            r14 = 1
        L_0x0172:
            if (r14 == 0) goto L_0x017a
            r22 = r4
            r21 = r7
            goto L_0x01ed
        L_0x017a:
            java.lang.String r14 = "9"
            boolean r14 = gy3.C87412m.m108589b(r11, r14)     // Catch:{ all -> 0x016c }
            r21 = r7
            java.lang.String r7 = "UTF-8"
            if (r14 == 0) goto L_0x01ad
            gy3.C87412m.m108593f(r0, r4)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6415c2.m6700a(r0)     // Catch:{ all -> 0x01e2 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r14 = "keyword"
            java.lang.String r0 = r0.getQueryParameter(r14)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r7)     // Catch:{ all -> 0x01e2 }
            uz2.n1 r7 = new uz2.n1     // Catch:{ all -> 0x01e2 }
            r7.<init>()     // Catch:{ all -> 0x01e2 }
            r7.f147169d = r0     // Catch:{ all -> 0x01e2 }
            byte[] r0 = r7.toByteArray()     // Catch:{ all -> 0x01e2 }
            int r7 = r0.length     // Catch:{ all -> 0x01e2 }
            r14 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r14, r7, r14)     // Catch:{ all -> 0x01e2 }
            goto L_0x01dc
        L_0x01ad:
            java.lang.String r14 = "10"
            boolean r14 = gy3.C87412m.m108589b(r11, r14)     // Catch:{ all -> 0x01e2 }
            if (r14 == 0) goto L_0x01df
            gy3.C87412m.m108593f(r0, r4)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6415c2.m6700a(r0)     // Catch:{ all -> 0x01e2 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r14 = "url"
            java.lang.String r0 = r0.getQueryParameter(r14)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r7)     // Catch:{ all -> 0x01e2 }
            uz2.l1 r7 = new uz2.l1     // Catch:{ all -> 0x01e2 }
            r7.<init>()     // Catch:{ all -> 0x01e2 }
            r7.f147160d = r0     // Catch:{ all -> 0x01e2 }
            byte[] r0 = r7.toByteArray()     // Catch:{ all -> 0x01e2 }
            int r7 = r0.length     // Catch:{ all -> 0x01e2 }
            r14 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r14, r7, r14)     // Catch:{ all -> 0x01e2 }
        L_0x01dc:
            r22 = r4
            goto L_0x01ee
        L_0x01df:
            r22 = r4
            goto L_0x01ed
        L_0x01e2:
            r0 = move-exception
        L_0x01e3:
            java.lang.String r7 = "parse keyBusiBuf err"
            r22 = r4
            r14 = 0
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x0217 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r7, r4)     // Catch:{ all -> 0x0217 }
        L_0x01ed:
            r0 = 0
        L_0x01ee:
            if (r11 == 0) goto L_0x01f9
            boolean r4 = z04.C112551y.m153811k(r11)     // Catch:{ all -> 0x0217 }
            if (r4 == 0) goto L_0x01f7
            goto L_0x01f9
        L_0x01f7:
            r14 = 0
            goto L_0x01fa
        L_0x01f9:
            r14 = 1
        L_0x01fa:
            if (r14 != 0) goto L_0x0225
            if (r0 == 0) goto L_0x0207
            boolean r4 = z04.C112551y.m153811k(r0)     // Catch:{ all -> 0x0217 }
            if (r4 == 0) goto L_0x0205
            goto L_0x0207
        L_0x0205:
            r14 = 0
            goto L_0x0208
        L_0x0207:
            r14 = 1
        L_0x0208:
            if (r14 != 0) goto L_0x0225
            uz2.a0 r4 = new uz2.a0     // Catch:{ all -> 0x0217 }
            r4.<init>()     // Catch:{ all -> 0x0217 }
            r4.f188439d = r11     // Catch:{ all -> 0x0217 }
            r4.f188442g = r0     // Catch:{ all -> 0x0217 }
            r3.add(r4)     // Catch:{ all -> 0x0217 }
            goto L_0x0225
        L_0x0217:
            r0 = move-exception
            goto L_0x0251
        L_0x0219:
            r0 = move-exception
            r21 = r7
            goto L_0x0251
        L_0x021d:
            r22 = r4
            r21 = r7
            r20 = r11
            r19 = r14
        L_0x0225:
            if (r12 == r13) goto L_0x0262
            int r12 = r12 + 1
            r14 = r19
            r11 = r20
            r7 = r21
            r4 = r22
            goto L_0x0144
        L_0x0233:
            r0 = move-exception
            r21 = r7
            r20 = r11
            goto L_0x0251
        L_0x0239:
            r21 = r7
            r20 = r11
            r18 = r12
            goto L_0x0262
        L_0x0240:
            r0 = move-exception
            r21 = r7
            r20 = r11
            r18 = r12
            goto L_0x0251
        L_0x0248:
            r0 = move-exception
            r21 = r7
            r20 = r11
            r18 = r12
            r17 = r13
        L_0x0251:
            r14 = 0
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.String r7 = "parse jumpJSON"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r7, r4)
            goto L_0x0263
        L_0x025a:
            r21 = r7
            r20 = r11
            r18 = r12
            r17 = r13
        L_0x0262:
            r14 = 0
        L_0x0263:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0279
            uz2.a0 r0 = new uz2.a0
            r0.<init>()
            java.lang.String r4 = "3"
            r0.f188439d = r4
            java.lang.String r4 = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect"
            r0.f188441f = r4
            r3.add(r0)
        L_0x0279:
            if (r5 == 0) goto L_0x0284
            boolean r0 = z04.C112551y.m153811k(r5)
            if (r0 == 0) goto L_0x0282
            goto L_0x0284
        L_0x0282:
            r0 = 0
            goto L_0x0285
        L_0x0284:
            r0 = 1
        L_0x0285:
            if (r0 == 0) goto L_0x0288
            goto L_0x02ae
        L_0x0288:
            if (r8 == 0) goto L_0x0293
            boolean r0 = z04.C112551y.m153811k(r8)
            if (r0 == 0) goto L_0x0291
            goto L_0x0293
        L_0x0291:
            r0 = 0
            goto L_0x0294
        L_0x0293:
            r0 = 1
        L_0x0294:
            if (r0 == 0) goto L_0x0297
            goto L_0x02ae
        L_0x0297:
            if (r9 == 0) goto L_0x02a2
            boolean r0 = z04.C112551y.m153811k(r9)
            if (r0 == 0) goto L_0x02a0
            goto L_0x02a2
        L_0x02a0:
            r0 = 0
            goto L_0x02a3
        L_0x02a2:
            r0 = 1
        L_0x02a3:
            if (r0 == 0) goto L_0x02a6
            goto L_0x02ae
        L_0x02a6:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x02ad
            goto L_0x02ae
        L_0x02ad:
            r14 = 1
        L_0x02ae:
            if (r14 != 0) goto L_0x02cc
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.f38996i
            r3.append(r2)
            java.lang.String r2 = ":fail_invalid_arguments"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r0.mo10774a(r1, r2, r3)
            goto L_0x0314
        L_0x02cc:
            qy2.z$a r0 = new qy2.z$a
            r0.<init>()
            r0.mo88254a(r10)
            r0.mo88259f(r8)
            r0.mo88258e(r5)
            r0.mo88256c(r6)
            r4 = r21
            r0.mo88260g(r4)
            r0.mo88257d(r9)
            qy2.z r4 = r0.f179715a
            r5 = r20
            r4.f229400e = r5
            uz2.u r4 = r4.f229399d
            r5 = r18
            r4.f147231J = r5
            r0.mo88255b(r3)
            qy2.z r0 = r0.f179715a
            r14 = r17
            r0.f229414v = r14
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            byte[] r0 = r0.toByteArray()
            java.lang.String r4 = "KEY_REQUEST_DATA"
            r3.putByteArray(r4, r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.b2$a> r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C57515b2.C57516a.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.b2$b r5 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.b2$b
            r5.<init>(r1, r2)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r3, r4, r5)
        L_0x0314:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C57515b2.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f164756e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f164757f;
    }
}
