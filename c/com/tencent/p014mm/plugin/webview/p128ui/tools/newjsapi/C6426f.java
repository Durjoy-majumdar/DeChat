package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import te3.C64468jf3;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f */
public final class C6426f extends C15053a {

    /* renamed from: d */
    public static final C6426f f23433d = new C6426f();

    /* renamed from: e */
    public static final String f23434e = "MicroMsg.JsApiChooseChatRoomMember";

    /* renamed from: f */
    public static final int f23435f = 457;

    /* renamed from: g */
    public static final String f23436g = "chooseChatRoomMember";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f$a */
    public static final class C6427a implements MMFragmentActivity$$g {

        /* renamed from: a */
        public final /* synthetic */ HashMap<String, Object> f23437a;

        /* renamed from: b */
        public final /* synthetic */ C13855j f23438b;

        /* renamed from: c */
        public final /* synthetic */ C13851h1 f23439c;

        public C6427a(HashMap<String, Object> hashMap, C13855j jVar, C13851h1 h1Var) {
            this.f23437a = hashMap;
            this.f23438b = jVar;
            this.f23439c = h1Var;
        }

        /* renamed from: a */
        public final void mo5702a(int i, Intent intent) {
            byte[] byteArrayExtra;
            int i2 = -1;
            if (i == -1) {
                i2 = 0;
            }
            this.f23437a.put("errCode", Integer.valueOf(i2));
            this.f23437a.put("action", Integer.valueOf(i2));
            C64468jf3 jf32 = new C64468jf3();
            if (!(intent == null || (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) == null)) {
                try {
                    jf32.parseFrom(byteArrayExtra);
                } catch (Throwable unused) {
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            JSONObject json = jf32.toJSON();
            String str = C6426f.f23434e;
            Log.m105924i(str, "contactListJson: " + json);
            HashMap<String, Object> hashMap = this.f23437a;
            JSONArray optJSONArray = json.optJSONArray("dataList");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            hashMap.put("dataList", optJSONArray);
            if (i2 == 0) {
                C13849g gVar = this.f23438b.f39001d;
                String str2 = this.f23439c.f38990c;
                gVar.mo10774a(str2, this.f23439c.f38996i + ":ok", this.f23437a);
                return;
            }
            C13849g gVar2 = this.f23438b.f39001d;
            String str3 = this.f23439c.f38990c;
            gVar2.mo10774a(str3, this.f23439c.f38996i + ":fail", this.f23437a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003a, code lost:
        r3 = r3.toString();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r18, t83.C13851h1 r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "env"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "msg"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = f23434e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "handleMsg params:"
            r3.append(r4)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f38983a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            android.content.Context r2 = r0.f38998a
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            r4 = 1
            if (r3 == 0) goto L_0x0134
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.f38983a
            java.lang.String r5 = "title"
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r5 = ""
            if (r3 == 0) goto L_0x0043
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r8 = r3
            goto L_0x0044
        L_0x0043:
            r8 = r5
        L_0x0044:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.f38983a
            java.lang.String r6 = "chatRoomUserName"
            java.lang.Object r3 = r3.get(r6)
            if (r3 == 0) goto L_0x0057
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r9 = r3
            goto L_0x0058
        L_0x0057:
            r9 = r5
        L_0x0058:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.f38983a
            java.lang.String r6 = "selectedUserNameList"
            java.lang.Object r3 = r3.get(r6)
            if (r3 == 0) goto L_0x006c
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r10 = r3
            goto L_0x006d
        L_0x006c:
            r10 = r5
        L_0x006d:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.f38983a
            java.lang.String r6 = "allUserNameList"
            java.lang.Object r3 = r3.get(r6)
            if (r3 == 0) goto L_0x007d
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x007e
        L_0x007d:
            r3 = r5
        L_0x007e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r6 = ","
            java.lang.String[] r11 = new java.lang.String[]{r6}
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            java.util.List r10 = z04.C112550d0.m153785U(r10, r11, r12, r13, r14, r15)
            java.util.Iterator r10 = r10.iterator()
        L_0x009a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b1
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = z04.C112551y.m153811k(r11)
            r12 = r12 ^ r4
            if (r12 == 0) goto L_0x009a
            r5.add(r11)
            goto L_0x009a
        L_0x00b1:
            java.lang.String[] r12 = new java.lang.String[]{r6}
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r3
            java.util.List r3 = z04.C112550d0.m153785U(r11, r12, r13, r14, r15, r16)
            java.util.Iterator r3 = r3.iterator()
        L_0x00c3:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00da
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r10 = z04.C112551y.m153811k(r6)
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x00c3
            r7.add(r6)
            goto L_0x00c3
        L_0x00da:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Class<sx.o> r6 = p240sx.C13796o.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            sx.o r6 = (p240sx.C13796o) r6
            r10 = r2
            androidx.appcompat.app.AppCompatActivity r10 = (androidx.appcompat.app.AppCompatActivity) r10
            r11 = r7
            r7 = r10
            r10 = r5
            android.content.Intent r5 = r6.mo13156ZP(r7, r8, r9, r10, r11)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            com.tencent.mm.ui.MMFragmentActivity$$d r2 = r2.startActivityForResult(r5)
            if (r2 == 0) goto L_0x0104
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.f$a r5 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.f$a
            r5.<init>(r3, r0, r1)
            r2.mo7677b(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0105
        L_0x0104:
            r2 = 0
        L_0x0105:
            if (r2 != 0) goto L_0x0134
            r2 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "errCode"
            r3.put(r6, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r5 = "action"
            r3.put(r5, r2)
            t83.g r0 = r0.f39001d
            java.lang.String r2 = r1.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = r1.f38996i
            r5.append(r1)
            java.lang.String r1 = ":fail"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r0.mo10774a(r2, r1, r3)
        L_0x0134:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6426f.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23435f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23436g;
    }
}
