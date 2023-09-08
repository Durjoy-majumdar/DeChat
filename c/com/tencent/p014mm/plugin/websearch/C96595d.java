package com.tencent.p014mm.plugin.websearch;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C7575o0;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import te3.s25;
import u73.C101968a0;
import u73.C101979m0;
import u73.C101984s;
import u73.C14129j;
import u73.C22613h1;
import u73.C52463g0;

/* renamed from: com.tencent.mm.plugin.websearch.d */
public final class C96595d implements C11385n, C14129j {

    /* renamed from: com.tencent.mm.plugin.websearch.d$a */
    public static final class C96596a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101968a0 f282783d;

        /* renamed from: e */
        public final /* synthetic */ C96595d f282784e;

        public C96596a(C101968a0 a0Var, C96595d dVar) {
            this.f282783d = a0Var;
            this.f282784e = dVar;
        }

        public final void run() {
            C86709a0.m107524d().mo123460f(new C52463g0(this.f282783d));
            C96595d dVar = this.f282784e;
            String str = this.f282783d.f300183E;
            C87412m.m108593f(str, "model.imageSearchSessionId");
            C101968a0 a0Var = this.f282783d;
            dVar.mo13543a(6, str, a0Var.f300191f, 0, this.f282784e.mo134673c(a0Var.f300181C));
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.d$b */
    public static final class C96597b implements C101984s {

        /* renamed from: a */
        public static final C96597b f282785a = new C96597b();

        /* renamed from: a */
        public final void mo134672a(C101979m0 m0Var) {
            Object obj = m0Var.f300280d;
            if ((obj instanceof C101968a0) && (m0Var.f300281e instanceof String)) {
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.api.NetSceneRequestModel");
                C101968a0 a0Var = (C101968a0) obj;
                int i = a0Var.f300202q;
                Object obj2 = m0Var.f300281e;
                C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((C7575o0) C86312j.m106911c(C7575o0.class)).mo8685ZG(i, (String) obj2, a0Var.f300210y);
            }
        }
    }

    /* renamed from: a */
    public void mo13543a(int i, String str, int i2, int i3, String str2) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "cgiAction");
        ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
        chatImageWebSearchActionStruct.f265369e = i;
        chatImageWebSearchActionStruct.f265371g = i2;
        chatImageWebSearchActionStruct.mo126608t("");
        chatImageWebSearchActionStruct.mo126607s("");
        chatImageWebSearchActionStruct.f265374j = 0;
        chatImageWebSearchActionStruct.mo126611w(str);
        chatImageWebSearchActionStruct.f265377m = System.currentTimeMillis();
        chatImageWebSearchActionStruct.f265378n = i3;
        chatImageWebSearchActionStruct.f265379o = chatImageWebSearchActionStruct.mo86045b("CgiAction", str2, true);
        chatImageWebSearchActionStruct.mo86054n();
        C22613h1.m26490p(chatImageWebSearchActionStruct);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0063, code lost:
        if (r3 == null) goto L_0x0065;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13544b(java.util.Map<java.lang.String, ? extends java.lang.Object> r14) {
        /*
            r13 = this;
            java.lang.Class<com.tencent.mm.plugin.websearch.l> r0 = com.tencent.p014mm.plugin.websearch.C96603l.class
            java.lang.String r1 = "params"
            gy3.C87412m.m108594g(r14, r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r14
            java.lang.String r5 = "MicroMsg.WebSearch.FTSChatSearchLogic"
            java.lang.String r6 = "start getChatSearchData：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            u73.a0 r10 = new u73.a0
            r10.<init>()
            java.lang.String r3 = "scene"
            int r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r14, r3, r4)
            r10.f300191f = r3
            java.lang.String r3 = "requestId"
            java.lang.String r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r14, r3)
            r10.f300210y = r3
            java.lang.String r3 = "type"
            int r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r14, r3, r4)
            r10.f300179A = r3
            java.lang.String r3 = "webview_instance_id"
            r5 = -1
            int r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r14, r3, r5)
            r10.f300202q = r3
            java.lang.String r3 = "url"
            java.lang.String r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r14, r3)
            if (r3 == 0) goto L_0x0052
            int r5 = r3.length()
            if (r5 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r5 = 0
            goto L_0x0053
        L_0x0052:
            r5 = 1
        L_0x0053:
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0058
            goto L_0x0065
        L_0x0058:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = "sessionId"
            java.lang.String r3 = r3.getQueryParameter(r5)     // Catch:{ Exception -> 0x0065 }
            if (r3 != 0) goto L_0x0066
        L_0x0065:
            r3 = r6
        L_0x0066:
            r10.f300183E = r3
            java.lang.String r14 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r14, r1)
            if (r14 == 0) goto L_0x0076
            int r1 = r14.length()
            if (r1 != 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            if (r2 != 0) goto L_0x008e
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r14)
            java.lang.String r14 = "reqKey"
            java.lang.String r14 = r1.optString(r14, r6)
            r10.f300180B = r14
            java.lang.String r14 = "content"
            java.lang.String r14 = r1.optString(r14, r6)
            r10.f300181C = r14
        L_0x008e:
            java.lang.String r14 = r10.f300181C
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x009c
            java.lang.String r14 = r10.f300181C
            java.lang.String r1 = "model.content"
            goto L_0x00a1
        L_0x009c:
            java.lang.String r14 = r10.f300210y
            java.lang.String r1 = "model.requestId"
        L_0x00a1:
            gy3.C87412m.m108593f(r14, r1)
            java.lang.String r1 = r10.f300181C
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00c7
            di3.d r14 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.websearch.l r14 = (com.tencent.p014mm.plugin.websearch.C96603l) r14
            u73.k r14 = r14.mo134690lS()
            com.tencent.mm.plugin.websearch.h r14 = (com.tencent.p014mm.plugin.websearch.C96598h) r14
            u73.o r14 = r14.f282796o
            java.lang.String r1 = r10.f300181C
            com.tencent.mm.plugin.websearch.n r14 = (com.tencent.p014mm.plugin.websearch.C96604n) r14
            java.lang.String r14 = r14.mo134694a(r1)
            java.lang.String r1 = "getService(PluginWebSear…ContentKey(model.content)"
            gy3.C87412m.m108593f(r14, r1)
        L_0x00c7:
            r9 = r14
            di3.d r14 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.websearch.l r14 = (com.tencent.p014mm.plugin.websearch.C96603l) r14
            u73.k r14 = r14.mo134690lS()
            com.tencent.mm.plugin.websearch.h r14 = (com.tencent.p014mm.plugin.websearch.C96598h) r14
            u73.o r14 = r14.f282796o
            r8 = 0
            com.tencent.mm.plugin.websearch.d$a r11 = new com.tencent.mm.plugin.websearch.d$a
            r11.<init>(r10, r13)
            com.tencent.mm.plugin.websearch.d$b r12 = com.tencent.p014mm.plugin.websearch.C96595d.C96597b.f282785a
            r7 = r14
            com.tencent.mm.plugin.websearch.n r7 = (com.tencent.p014mm.plugin.websearch.C96604n) r7
            r7.mo134697d(r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.C96595d.mo13544b(java.util.Map):boolean");
    }

    /* renamed from: c */
    public String mo134673c(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            String optString = new JSONObject(str).optString("action");
            return optString == null ? "" : optString;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    public void mo134674d(String str, String str2) {
        C87412m.m108594g(str, "content");
        C87412m.m108594g(str2, "tag");
        ((C96604n) ((C96598h) ((C96603l) C86312j.m106911c(C96603l.class)).mo134690lS()).f282796o).mo134695b(0, str2, str, C96597b.f282785a);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        String str3;
        if (yVar instanceof C52463g0) {
            C52463g0 g0Var = (C52463g0) yVar;
            if (!TextUtils.isEmpty(g0Var.f146593n.f300181C)) {
                str2 = g0Var.f146593n.f300181C;
                str3 = "scene.model.content";
            } else {
                str2 = g0Var.f146593n.f300210y;
                str3 = "scene.model.requestId";
            }
            C87412m.m108593f(str2, str3);
            if (!TextUtils.isEmpty(g0Var.f146593n.f300181C)) {
                str2 = ((C96604n) ((C96598h) ((C96603l) C86312j.m106911c(C96603l.class)).mo134690lS()).f282796o).mo134694a(g0Var.f146593n.f300181C);
                C87412m.m108593f(str2, "getService(PluginWebSear…tKey(scene.model.content)");
            }
            s25 s25 = g0Var.f146595p;
            C101968a0 a0Var = g0Var.f146593n;
            if (s25 != null && a0Var != null) {
                String str4 = a0Var.f300183E;
                if (!(str4 == null || str4.length() == 0)) {
                    String str5 = a0Var.f300183E;
                    C87412m.m108593f(str5, "model.imageSearchSessionId");
                    mo13543a(7, str5, a0Var.f300191f, i2, mo134673c(a0Var.f300181C));
                }
                if (i == 0 && i2 == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("net scene success requestId:");
                    sb.append(g0Var.f146593n.f300210y);
                    sb.append(" reqKey:");
                    sb.append(g0Var.f146593n.f300180B);
                    sb.append(" jsonStr:");
                    String str6 = s25.f141284d;
                    sb.append(str6 != null ? Integer.valueOf(str6.length()) : null);
                    Log.m105924i("MicroMsg.WebSearch.FTSChatSearchLogic", sb.toString());
                    String str7 = s25.f141284d;
                    C87412m.m108593f(str7, "response.json_str");
                    mo134674d(str7, str2);
                    return;
                }
                Log.m105924i("MicroMsg.WebSearch.FTSChatSearchLogic", "net scene fail requestId:" + g0Var.f146593n.f300210y + " reqKey:" + g0Var.f146593n.f300180B);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ret", -1);
                } catch (Exception unused) {
                }
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "resultObject.toString()");
                mo134674d(jSONObject2, str2);
            }
        }
    }
}
