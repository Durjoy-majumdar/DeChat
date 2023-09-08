package z93;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45699g;
import ex0.C45706i;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import org.json.JSONObject;
import q20.C89449a;
import t83.C13849g;
import te3.C52109yf2;
import te3.C52278zk2;
import w83.C15053a;

/* renamed from: z93.c */
public abstract class C53763c extends C15053a {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lz93/c$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: z93.c$a */
    public static final class C53764a implements C80916r<IPCString, IPCString> {
        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            String b = C45706i.m50951b(iPCString != null ? iPCString.f10315d : null);
            if (b == null) {
                b = "";
            }
            return new IPCString(b);
        }
    }

    /* renamed from: z93.c$b */
    public static final class C53765b implements C45699g {

        /* renamed from: a */
        public final String f150908a;

        /* renamed from: b */
        public final String f150909b;

        /* renamed from: c */
        public final WeakReference<C13849g> f150910c;

        public C53765b(String str, String str2, WeakReference<C13849g> weakReference) {
            C87412m.m108594g(str, "callbackId");
            C87412m.m108594g(str2, "funcName");
            C87412m.m108594g(weakReference, "jsApiHandlerReference");
            this.f150908a = str;
            this.f150909b = str2;
            this.f150910c = weakReference;
        }

        /* renamed from: a */
        public boolean mo66580a(TransferRequestInfo transferRequestInfo) {
            return false;
        }

        /* renamed from: b */
        public void mo66581b(int i, String str, C52278zk2 zk22) {
            HashMap hashMap = new HashMap();
            String str2 = "[transferRequest-" + this.f150909b + "] errMsg: %s, response: %s";
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = zk22 != null ? Integer.valueOf(zk22.f146051d) : null;
            Log.m105925i("MicroMsg.JsApiTransferRequestBase", str2, objArr);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1454, 184, 1);
            C13849g gVar = this.f150910c.get();
            if (gVar == null) {
                nVar.mo175913w(1454, 185, 1);
                Log.m105920e("MicroMsg.JsApiTransferRequestBase", "jsApiHandler is recycled");
            } else if (zk22 != null) {
                hashMap.put("errCode", Integer.valueOf(zk22.f146051d));
                String str3 = zk22.f146053f;
                if (str3 == null) {
                    str3 = "";
                }
                hashMap.put("result", str3);
                LinkedList<C52109yf2> linkedList = zk22.f146054g;
                C87412m.m108593f(linkedList, "response.header");
                if (!linkedList.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    LinkedList<C52109yf2> linkedList2 = zk22.f146054g;
                    C87412m.m108593f(linkedList2, "response.header");
                    for (C52109yf2 yf22 : linkedList2) {
                        String str4 = yf22.f145258d;
                        if (!(str4 == null || str4.length() == 0)) {
                            jSONObject.put(yf22.f145258d, yf22.f145259e);
                        }
                    }
                    hashMap.put("header", jSONObject);
                }
                if (zk22.f146051d == 0) {
                    gVar.mo10774a(this.f150908a, this.f150909b + ":ok", hashMap);
                    return;
                }
                gVar.mo10774a(this.f150908a, this.f150909b + ":fail " + zk22.f146052e, hashMap);
            } else {
                hashMap.put("errCode", -1);
                gVar.mo10774a(this.f150908a, this.f150909b + ":fail", hashMap);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019b A[Catch:{ Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a0 A[Catch:{ Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a7 A[Catch:{ Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a9 A[Catch:{ Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ac A[Catch:{ Exception -> 0x01de }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r18, t83.C13851h1 r19) {
        /*
            r17 = this;
            r1 = r18
            r2 = r19
            java.lang.String r3 = "MicroMsg.JsApiTransferRequestBase"
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r2, r0)
            r4 = 0
            com.tencent.mm.plugin.webview.core.v$b r0 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a     // Catch:{ Exception -> 0x0038 }
            boolean r0 = r0.mo67810a()     // Catch:{ Exception -> 0x0038 }
            if (r0 == 0) goto L_0x0040
            android.content.Context r0 = r1.f38998a     // Catch:{ Exception -> 0x0038 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0038 }
            r5.<init>()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r6 = r17.mo7288c()     // Catch:{ Exception -> 0x0038 }
            r5.append(r6)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r6 = " called"
            r5.append(r6)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0038 }
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r5, (int) r4)     // Catch:{ Exception -> 0x0038 }
            r0.show()     // Catch:{ Exception -> 0x0038 }
            goto L_0x0040
        L_0x0038:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "showToast exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r6, r5)
        L_0x0040:
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r5 = new com.tencent.mm.plugin.brandservice.api.TransferRequestInfo
            r5.<init>()
            int r0 = r17.mo14703e()
            r5.f109024d = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r6 = "scope"
            java.lang.Object r0 = r0.get(r6)
            boolean r6 = r0 instanceof java.lang.String
            r7 = 0
            if (r6 == 0) goto L_0x005b
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x005c
        L_0x005b:
            r0 = r7
        L_0x005c:
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x0061
            r0 = r6
        L_0x0061:
            r5.f109026f = r0
            e00.t r0 = r18.mo13183c()
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = r0.getCurrentUrl()
            if (r0 != 0) goto L_0x007c
        L_0x006f:
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f39002e
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r0.getUrl()
            goto L_0x0079
        L_0x0078:
            r0 = r7
        L_0x0079:
            if (r0 != 0) goto L_0x007c
            r0 = r6
        L_0x007c:
            ex0.j r8 = ex0.C45707j.f123535a
            int r8 = r0.length()
            r9 = 1
            if (r8 != 0) goto L_0x0087
            r8 = 1
            goto L_0x0088
        L_0x0087:
            r8 = 0
        L_0x0088:
            r10 = 2
            if (r8 == 0) goto L_0x008d
            r0 = r6
            goto L_0x00d4
        L_0x008d:
            java.lang.String r8 = "file"
            boolean r8 = z04.C112551y.m153819s(r0, r8, r4)
            if (r8 != 0) goto L_0x0096
            goto L_0x00d4
        L_0x0096:
            rx3.g r8 = ex0.C45707j.f123536b
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00a8:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00d4
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = z04.C112551y.m153819s(r0, r12, r4)
            if (r12 == 0) goto L_0x00a8
            java.lang.Object r8 = r11.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r4] = r0
            r11[r9] = r8
            java.lang.String r0 = "TransferRequestUrlInterceptor"
            java.lang.String r12 = "transferRequest interceptUrl url: %s, result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r12, r11)
            r0 = r8
        L_0x00d4:
            r5.f109025e = r0
            te3.yk2 r0 = new te3.yk2
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r8 = r2.f38983a
            java.lang.String r11 = "reqUrl"
            java.lang.Object r8 = r8.get(r11)
            boolean r11 = r8 instanceof java.lang.String
            if (r11 == 0) goto L_0x00ea
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00eb
        L_0x00ea:
            r8 = r7
        L_0x00eb:
            if (r8 != 0) goto L_0x00ee
            r8 = r6
        L_0x00ee:
            r0.f145341d = r8
            java.util.Map<java.lang.String, java.lang.Object> r8 = r2.f38983a
            java.lang.String r11 = "reqBody"
            java.lang.Object r8 = r8.get(r11)
            boolean r11 = r8 instanceof java.lang.String
            if (r11 == 0) goto L_0x00ff
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0100
        L_0x00ff:
            r8 = r7
        L_0x0100:
            if (r8 != 0) goto L_0x0103
            r8 = r6
        L_0x0103:
            r0.f145342e = r8
            java.util.Map<java.lang.String, java.lang.Object> r8 = r2.f38983a
            java.lang.String r11 = "cgiCmdId"
            java.lang.Object r8 = r8.get(r11)
            boolean r11 = r8 instanceof java.lang.String
            if (r11 == 0) goto L_0x0114
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0115
        L_0x0114:
            r8 = r7
        L_0x0115:
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r8)
            r0.f145343f = r8
            java.util.Map<java.lang.String, java.lang.Object> r8 = r2.f38983a
            java.lang.String r11 = "method"
            java.lang.Object r8 = r8.get(r11)
            boolean r11 = r8 instanceof java.lang.String
            if (r11 == 0) goto L_0x012a
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x012b
        L_0x012a:
            r8 = r7
        L_0x012b:
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r8)
            r0.f145345h = r8
            r5.f109028h = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r8 = "is_security_check"
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r5.f109029i = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r8 = "debug_env"
            java.lang.Object r0 = r0.get(r8)
            boolean r8 = r0 instanceof java.lang.String
            if (r8 == 0) goto L_0x0152
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0153
        L_0x0152:
            r0 = r7
        L_0x0153:
            if (r0 != 0) goto L_0x0156
            r0 = r6
        L_0x0156:
            boolean r8 = ex0.C45706i.m50950a()
            if (r8 == 0) goto L_0x0189
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_PUSH
            java.lang.String r11 = "PROCESS_PUSH"
            gy3.C87412m.m108593f(r8, r11)
            com.tencent.mm.ipcinvoker.type.IPCString r11 = new com.tencent.mm.ipcinvoker.type.IPCString
            r11.<init>(r0)
            z93.c$a r12 = new z93.c$a
            r12.<init>()
            android.os.Parcelable r8 = com.tencent.p014mm.ipcinvoker.C28947a.m38501b(r8, r11, r12)
            com.tencent.mm.ipcinvoker.type.IPCString r8 = (com.tencent.p014mm.ipcinvoker.type.IPCString) r8
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r4] = r0
            if (r8 == 0) goto L_0x017c
            java.lang.String r0 = r8.f10315d
            goto L_0x017d
        L_0x017c:
            r0 = r7
        L_0x017d:
            r10[r9] = r0
            java.lang.String r0 = "getTransferDebugIPSync key: %s, result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r10)
            if (r8 == 0) goto L_0x0189
            java.lang.String r0 = r8.f10315d
            goto L_0x018a
        L_0x0189:
            r0 = r7
        L_0x018a:
            if (r0 != 0) goto L_0x018d
            r0 = r6
        L_0x018d:
            r5.f109035r = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a     // Catch:{ Exception -> 0x01de }
            java.lang.String r8 = "header"
            java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x01de }
            boolean r8 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x01de }
            if (r8 == 0) goto L_0x019e
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x01de }
        L_0x019e:
            if (r7 != 0) goto L_0x01a1
            r7 = r6
        L_0x01a1:
            int r0 = r7.length()     // Catch:{ Exception -> 0x01de }
            if (r0 <= 0) goto L_0x01a9
            r0 = 1
            goto L_0x01aa
        L_0x01a9:
            r0 = 0
        L_0x01aa:
            if (r0 == 0) goto L_0x01e6
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01de }
            r0.<init>(r7)     // Catch:{ Exception -> 0x01de }
            java.util.Iterator r7 = r0.keys()     // Catch:{ Exception -> 0x01de }
            java.lang.String r8 = "headerJson.keys()"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ Exception -> 0x01de }
        L_0x01ba:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x01de }
            if (r8 == 0) goto L_0x01e6
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x01de }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x01de }
            java.lang.String r10 = r0.optString(r8)     // Catch:{ Exception -> 0x01de }
            if (r10 != 0) goto L_0x01cd
            r10 = r6
        L_0x01cd:
            te3.yk2 r11 = r5.f109028h     // Catch:{ Exception -> 0x01de }
            java.util.LinkedList<te3.yf2> r11 = r11.f145344g     // Catch:{ Exception -> 0x01de }
            te3.yf2 r12 = new te3.yf2     // Catch:{ Exception -> 0x01de }
            r12.<init>()     // Catch:{ Exception -> 0x01de }
            r12.f145258d = r8     // Catch:{ Exception -> 0x01de }
            r12.f145259e = r10     // Catch:{ Exception -> 0x01de }
            r11.push(r12)     // Catch:{ Exception -> 0x01de }
            goto L_0x01ba
        L_0x01de:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r7 = "parseTransferRequestInfo exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r7, r4)
        L_0x01e6:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1454(0x5ae, double:7.184E-321)
            r13 = 183(0xb7, double:9.04E-322)
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            java.lang.Class<ex0.f> r0 = ex0.C45698f.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ex0.f r0 = (ex0.C45698f) r0
            z93.c$b r3 = new z93.c$b
            java.lang.String r2 = r2.f38990c
            if (r2 != 0) goto L_0x0200
            goto L_0x0201
        L_0x0200:
            r6 = r2
        L_0x0201:
            java.lang.String r2 = r17.mo7288c()
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            t83.g r1 = r1.f39001d
            r4.<init>(r1)
            r3.<init>(r6, r2, r4)
            r0.mo71195RT(r5, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z93.C53763c.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: e */
    public abstract int mo14703e();
}
