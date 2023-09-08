package o83;

import c00.C39881j;
import c00.C39882k;
import c00.C39885s;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.search.data.SimilarEmojiQueryModel;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p008bq.C0363p0;
import p008bq.C67309t0;
import p813fl.C97904g;
import u73.C101968a0;

/* renamed from: o83.d */
public final class C100299d implements C11385n {

    /* renamed from: d */
    public C11385n f293816d;

    /* renamed from: e */
    public SimilarEmojiQueryModel f293817e;

    /* renamed from: f */
    public int f293818f;

    /* renamed from: g */
    public int f293819g;

    /* renamed from: h */
    public String f293820h = "";

    /* renamed from: i */
    public String f293821i = ("Similar" + System.currentTimeMillis());

    /* renamed from: j */
    public boolean f293822j = true;

    /* renamed from: n */
    public LinkedList<C97904g> f293823n = new LinkedList<>();

    /* renamed from: a */
    public final IEmojiInfo mo139553a() {
        SimilarEmojiQueryModel similarEmojiQueryModel = this.f293817e;
        if (similarEmojiQueryModel == null) {
            return null;
        }
        if (mo139555c()) {
            IEmojiInfo Vs = ((C67309t0) C86312j.m106911c(C67309t0.class)).mo91189Vs(similarEmojiQueryModel.f283911e);
            if (Vs == null) {
                return null;
            }
            Vs.mo62656c2(65);
            if (this.f293823n.isEmpty()) {
                this.f293823n.add(new C97904g(Vs, 100, (String) null, 0, 12, (C8480h) null));
            }
            return Vs;
        }
        IEmojiInfo zE = ((C0363p0) C86312j.m106911c(C0363p0.class)).mo404zE();
        if (this.f293823n.isEmpty()) {
            LinkedList<C97904g> linkedList = this.f293823n;
            C87412m.m108593f(zE, "emojiInfo");
            linkedList.add(new C97904g(zE, 107, (String) null, 0, 12, (C8480h) null));
        }
        return zE;
    }

    /* renamed from: b */
    public final void mo139554b(C11385n nVar) {
        SimilarEmojiQueryModel similarEmojiQueryModel;
        String str;
        Class cls = C39885s.class;
        C87412m.m108594g(nVar, "callback");
        Log.m105924i("MicroMsg.SimilarEmoji", "do net request:[" + this.f293817e + ']');
        this.f293816d = nVar;
        if (!this.f293822j || (similarEmojiQueryModel = this.f293817e) == null) {
            return;
        }
        if (mo139555c()) {
            IEmojiInfo Vs = ((C67309t0) C86312j.m106911c(C67309t0.class)).mo91189Vs(similarEmojiQueryModel.f283911e);
            String str2 = similarEmojiQueryModel.f283911e;
            int i = this.f293818f;
            String str3 = this.f293821i;
            C39882k j402 = ((C39885s) C86312j.m106911c(cls)).j40(str2, i, str3, str3, 0, str3, 59, Vs.mo62686o1(), Vs.getAesKey());
            C89137b0 d = C86709a0.m107524d();
            C87412m.m108592e(j402, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d.mo123460f((C117747y) j402);
            return;
        }
        C101968a0 a0Var = new C101968a0();
        a0Var.f300191f = 78;
        SimilarEmojiQueryModel similarEmojiQueryModel2 = this.f293817e;
        if (similarEmojiQueryModel2 == null || (str = similarEmojiQueryModel2.f283910d) == null) {
            str = "";
        }
        a0Var.f300187b = str;
        a0Var.f300189d = 256;
        a0Var.f300193h = 1;
        a0Var.f300188c = this.f293818f;
        a0Var.f300207v = this.f293820h;
        String str4 = this.f293821i;
        a0Var.f300192g = str4;
        a0Var.f300210y = str4;
        C39881j l102 = ((C39885s) C86312j.m106911c(cls)).l10(a0Var);
        C89137b0 d2 = C86709a0.m107524d();
        C87412m.m108592e(l102, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
        d2.mo123460f((C117747y) l102);
    }

    /* renamed from: c */
    public final boolean mo139555c() {
        SimilarEmojiQueryModel similarEmojiQueryModel = this.f293817e;
        if (similarEmojiQueryModel != null) {
            return similarEmojiQueryModel.mo135501a();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r25, int r26, java.lang.String r27, ob0.C117747y r28) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r28
            java.lang.Class<bq.d1> r0 = p008bq.C67305d1.class
            java.lang.Class<bq.p0> r5 = p008bq.C0363p0.class
            java.lang.Class<c00.s> r6 = c00.C39885s.class
            if (r2 != 0) goto L_0x021a
            if (r3 != 0) goto L_0x021a
            di3.d r7 = di3.C86312j.m106911c(r6)
            c00.s r7 = (c00.C39885s) r7
            boolean r7 = r7.r30(r4)
            java.lang.String r8 = "emojiInfo"
            java.lang.String r9 = "getService(IEmojiInfoSto…s.java).createEmojiInfo()"
            java.lang.String r11 = "items"
            java.lang.String r12 = "searchID"
            java.lang.String r13 = "continueFlag"
            java.lang.String r14 = "totalCount"
            java.lang.String r15 = "offset"
            java.lang.String r10 = ""
            java.lang.String r2 = "MicroMsg.SimilarEmoji"
            r3 = 0
            if (r7 == 0) goto L_0x010b
            di3.d r6 = di3.C86312j.m106911c(r6)
            c00.s r6 = (c00.C39885s) r6
            te3.k54 r6 = r6.mo62260W9(r4)
            java.lang.String r6 = r6.f136568d
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x008b }
            r7.<init>(r6)     // Catch:{ Exception -> 0x008b }
            int r6 = r7.optInt(r15, r3)     // Catch:{ Exception -> 0x008b }
            r1.f293818f = r6     // Catch:{ Exception -> 0x008b }
            r7.optInt(r14, r3)     // Catch:{ Exception -> 0x008b }
            boolean r6 = r7.optBoolean(r13, r3)     // Catch:{ Exception -> 0x008b }
            r1.f293822j = r6     // Catch:{ Exception -> 0x008b }
            java.lang.String r6 = r7.optString(r12)     // Catch:{ Exception -> 0x008b }
            java.lang.String r10 = "responseJson.optString(\"searchID\")"
            gy3.C87412m.m108593f(r6, r10)     // Catch:{ Exception -> 0x008b }
            r1.f293821i = r6     // Catch:{ Exception -> 0x008b }
            org.json.JSONArray r6 = r7.optJSONArray(r11)     // Catch:{ Exception -> 0x008b }
            java.util.LinkedList<fl.g> r7 = r1.f293823n     // Catch:{ Exception -> 0x008b }
            boolean r7 = r7.isEmpty()     // Catch:{ Exception -> 0x008b }
            r10 = 1
            r7 = r7 ^ r10
            if (r7 == 0) goto L_0x008e
            java.util.LinkedList<fl.g> r7 = r1.f293823n     // Catch:{ Exception -> 0x008b }
            java.lang.Object r7 = sx3.C110818d0.m150923U(r7)     // Catch:{ Exception -> 0x008b }
            fl.g r7 = (p813fl.C97904g) r7     // Catch:{ Exception -> 0x008b }
            int r7 = r7.f287201c     // Catch:{ Exception -> 0x008b }
            r10 = 104(0x68, float:1.46E-43)
            if (r7 != r10) goto L_0x008e
            java.util.LinkedList<fl.g> r7 = r1.f293823n     // Catch:{ Exception -> 0x008b }
            java.lang.Object r10 = sx3.C110818d0.m150923U(r7)     // Catch:{ Exception -> 0x008b }
            r7.remove(r10)     // Catch:{ Exception -> 0x008b }
            goto L_0x008e
        L_0x008b:
            goto L_0x021a
        L_0x008e:
            if (r6 != 0) goto L_0x0095
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x008b }
            r6.<init>()     // Catch:{ Exception -> 0x008b }
        L_0x0095:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008b }
            r7.<init>()     // Catch:{ Exception -> 0x008b }
            java.lang.String r10 = "similar get more emoji size:"
            r7.append(r10)     // Catch:{ Exception -> 0x008b }
            int r10 = r6.length()     // Catch:{ Exception -> 0x008b }
            r7.append(r10)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x008b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)     // Catch:{ Exception -> 0x008b }
            int r7 = r6.length()     // Catch:{ Exception -> 0x008b }
        L_0x00b2:
            if (r3 >= r7) goto L_0x00e5
            org.json.JSONObject r10 = r6.getJSONObject(r3)     // Catch:{ Exception -> 0x008b }
            di3.d r11 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x008b }
            bq.p0 r11 = (p008bq.C0363p0) r11     // Catch:{ Exception -> 0x008b }
            com.tencent.mm.api.IEmojiInfo r13 = r11.mo404zE()     // Catch:{ Exception -> 0x008b }
            di3.d r11 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x008b }
            bq.d1 r11 = (p008bq.C67305d1) r11     // Catch:{ Exception -> 0x008b }
            r11.mo91427Nk(r2, r10, r13)     // Catch:{ Exception -> 0x008b }
            java.util.LinkedList<fl.g> r10 = r1.f293823n     // Catch:{ Exception -> 0x008b }
            fl.g r11 = new fl.g     // Catch:{ Exception -> 0x008b }
            gy3.C87412m.m108593f(r13, r8)     // Catch:{ Exception -> 0x008b }
            r14 = 103(0x67, float:1.44E-43)
            r15 = 0
            r16 = 0
            r17 = 12
            r18 = 0
            r12 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x008b }
            r10.add(r11)     // Catch:{ Exception -> 0x008b }
            int r3 = r3 + 1
            goto L_0x00b2
        L_0x00e5:
            boolean r0 = r1.f293822j     // Catch:{ Exception -> 0x008b }
            if (r0 == 0) goto L_0x021a
            java.util.LinkedList<fl.g> r0 = r1.f293823n     // Catch:{ Exception -> 0x008b }
            fl.g r2 = new fl.g     // Catch:{ Exception -> 0x008b }
            di3.d r3 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x008b }
            bq.p0 r3 = (p008bq.C0363p0) r3     // Catch:{ Exception -> 0x008b }
            com.tencent.mm.api.IEmojiInfo r11 = r3.mo404zE()     // Catch:{ Exception -> 0x008b }
            gy3.C87412m.m108593f(r11, r9)     // Catch:{ Exception -> 0x008b }
            r12 = 104(0x68, float:1.46E-43)
            r13 = 0
            r14 = 0
            r15 = 12
            r16 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x008b }
            r0.add(r2)     // Catch:{ Exception -> 0x008b }
            goto L_0x021a
        L_0x010b:
            di3.d r7 = di3.C86312j.m106911c(r6)
            c00.s r7 = (c00.C39885s) r7
            boolean r7 = r7.mo62259VI(r4)
            if (r7 == 0) goto L_0x021a
            int r7 = r1.f293819g
            r17 = 1
            int r7 = r7 + 1
            r1.f293819g = r7
            di3.d r6 = di3.C86312j.m106911c(r6)
            c00.s r6 = (c00.C39885s) r6
            te3.y25 r6 = r6.mo62267yl(r4)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0211 }
            java.lang.String r6 = r6.f145094f     // Catch:{ Exception -> 0x0211 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0211 }
            int r6 = r7.optInt(r15, r3)     // Catch:{ Exception -> 0x0211 }
            r1.f293818f = r6     // Catch:{ Exception -> 0x0211 }
            int r6 = r7.optInt(r13, r3)     // Catch:{ Exception -> 0x0211 }
            r13 = 1
            if (r6 != r13) goto L_0x013f
            r6 = 1
            goto L_0x0140
        L_0x013f:
            r6 = 0
        L_0x0140:
            r1.f293822j = r6     // Catch:{ Exception -> 0x0211 }
            java.lang.String r6 = r7.optString(r12, r10)     // Catch:{ Exception -> 0x0211 }
            java.lang.String r12 = "responseJson.optString(\"searchID\", \"\")"
            gy3.C87412m.m108593f(r6, r12)     // Catch:{ Exception -> 0x0211 }
            r1.f293821i = r6     // Catch:{ Exception -> 0x0211 }
            java.lang.String r6 = "data"
            org.json.JSONArray r6 = r7.optJSONArray(r6)     // Catch:{ Exception -> 0x0211 }
            org.json.JSONObject r6 = r6.optJSONObject(r3)     // Catch:{ Exception -> 0x0211 }
            r6.optInt(r14, r3)     // Catch:{ Exception -> 0x0211 }
            org.json.JSONArray r6 = r6.optJSONArray(r11)     // Catch:{ Exception -> 0x0211 }
            java.util.LinkedList<fl.g> r7 = r1.f293823n     // Catch:{ Exception -> 0x0211 }
            boolean r7 = r7.isEmpty()     // Catch:{ Exception -> 0x0211 }
            r11 = 1
            r7 = r7 ^ r11
            if (r7 == 0) goto L_0x017c
            java.util.LinkedList<fl.g> r7 = r1.f293823n     // Catch:{ Exception -> 0x0211 }
            java.lang.Object r7 = sx3.C110818d0.m150923U(r7)     // Catch:{ Exception -> 0x0211 }
            fl.g r7 = (p813fl.C97904g) r7     // Catch:{ Exception -> 0x0211 }
            int r7 = r7.f287201c     // Catch:{ Exception -> 0x0211 }
            r11 = 104(0x68, float:1.46E-43)
            if (r7 != r11) goto L_0x017c
            java.util.LinkedList<fl.g> r7 = r1.f293823n     // Catch:{ Exception -> 0x0211 }
            r7.removeLast()     // Catch:{ Exception -> 0x0211 }
        L_0x017c:
            if (r6 != 0) goto L_0x0183
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x0211 }
            r6.<init>()     // Catch:{ Exception -> 0x0211 }
        L_0x0183:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0211 }
            r7.<init>()     // Catch:{ Exception -> 0x0211 }
            java.lang.String r11 = "websearch get more emoji size:"
            r7.append(r11)     // Catch:{ Exception -> 0x0211 }
            int r11 = r6.length()     // Catch:{ Exception -> 0x0211 }
            r7.append(r11)     // Catch:{ Exception -> 0x0211 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0211 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)     // Catch:{ Exception -> 0x0211 }
            int r7 = r6.length()     // Catch:{ Exception -> 0x0211 }
            r11 = 0
        L_0x01a1:
            if (r11 >= r7) goto L_0x01e4
            org.json.JSONObject r12 = r6.optJSONObject(r11)     // Catch:{ Exception -> 0x0211 }
            if (r12 == 0) goto L_0x01dc
            di3.d r13 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x0211 }
            bq.p0 r13 = (p008bq.C0363p0) r13     // Catch:{ Exception -> 0x0211 }
            com.tencent.mm.api.IEmojiInfo r13 = r13.mo404zE()     // Catch:{ Exception -> 0x0211 }
            di3.d r14 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0211 }
            bq.d1 r14 = (p008bq.C67305d1) r14     // Catch:{ Exception -> 0x0211 }
            r14.mo91427Nk(r2, r12, r13)     // Catch:{ Exception -> 0x0211 }
            java.util.LinkedList<fl.g> r14 = r1.f293823n     // Catch:{ Exception -> 0x0211 }
            fl.g r15 = new fl.g     // Catch:{ Exception -> 0x0211 }
            gy3.C87412m.m108593f(r13, r8)     // Catch:{ Exception -> 0x0211 }
            java.lang.String r3 = "docID"
            java.lang.String r3 = r12.optString(r3, r10)     // Catch:{ Exception -> 0x020e }
            java.lang.String r12 = "it.optString(\"docID\", \"\")"
            gy3.C87412m.m108593f(r3, r12)     // Catch:{ Exception -> 0x020e }
            int r12 = r1.f293819g     // Catch:{ Exception -> 0x020e }
            r18 = r0
            r0 = 103(0x67, float:1.44E-43)
            r15.<init>(r13, r0, r3, r12)     // Catch:{ Exception -> 0x020e }
            r14.add(r15)     // Catch:{ Exception -> 0x020e }
            goto L_0x01de
        L_0x01dc:
            r18 = r0
        L_0x01de:
            int r11 = r11 + 1
            r0 = r18
            r3 = 0
            goto L_0x01a1
        L_0x01e4:
            boolean r0 = r1.f293822j     // Catch:{ Exception -> 0x020e }
            if (r0 == 0) goto L_0x021a
            java.util.LinkedList<fl.g> r0 = r1.f293823n     // Catch:{ Exception -> 0x020e }
            fl.g r3 = new fl.g     // Catch:{ Exception -> 0x020e }
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x020e }
            bq.p0 r5 = (p008bq.C0363p0) r5     // Catch:{ Exception -> 0x020e }
            com.tencent.mm.api.IEmojiInfo r5 = r5.mo404zE()     // Catch:{ Exception -> 0x020e }
            gy3.C87412m.m108593f(r5, r9)     // Catch:{ Exception -> 0x020e }
            r19 = 104(0x68, float:1.46E-43)
            r20 = 0
            r21 = 0
            r22 = 12
            r23 = 0
            r17 = r3
            r18 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x020e }
            r0.add(r3)     // Catch:{ Exception -> 0x020e }
            goto L_0x021a
        L_0x020e:
            r0 = move-exception
            r3 = 0
            goto L_0x0212
        L_0x0211:
            r0 = move-exception
        L_0x0212:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "resultObj"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r3)
        L_0x021a:
            ob0.n r0 = r1.f293816d
            if (r0 == 0) goto L_0x0227
            r2 = r25
            r3 = r26
            r5 = r27
            r0.onSceneEnd(r2, r3, r5, r4)
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o83.C100299d.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
