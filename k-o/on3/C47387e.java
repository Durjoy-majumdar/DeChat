package on3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import sf0.C48374j0;
import te3.C49602gs;
import te3.C49745hs;

/* renamed from: on3.e */
public final class C47387e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f127149d;

    /* renamed from: e */
    public final C47350c f127150e;

    /* renamed from: f */
    public C49602gs f127151f;

    public C47387e(int i, String str, long j, int i2, String str2, String str3, byte[] bArr) {
        C87412m.m108594g(str2, "msgUserName");
        C87412m.m108594g(str3, "msgSummary");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 11965;
        bVar.f127068c = "/cgi-bin/micromsg-bin/chatroomtopmsg";
        bVar.f127066a = new C49602gs();
        bVar.f127067b = new C49745hs();
        C47350c a = bVar.mo72403a();
        this.f127150e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ChatRoomTopMsgRequest");
        C49602gs gsVar = (C49602gs) aVar;
        this.f127151f = gsVar;
        gsVar.f134237d = str;
        gsVar.f134238e = i;
        gsVar.f134239f = j;
        gsVar.f134240g = i2;
        gsVar.f134242i = str2;
        gsVar.f134241h = str3;
        if (bArr != null) {
            gsVar.f134243j = C48374j0.m53712a(bArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("topMsgReq req=");
        C49602gs gsVar2 = this.f127151f;
        C87412m.m108594g(gsVar2, "<this>");
        sb.append("ChatRoomName=" + gsVar2.f134237d + " Op=" + gsVar2.f134238e + " NewMsgId=" + gsVar2.f134239f + " MsgSummary=" + gsVar2.f134241h + " MsgType=" + gsVar2.f134240g + " MsgUserName=" + gsVar2.f134242i);
        Log.m105918d("TopMsg.NetSceneChatRoomTopMsg", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127149d = nVar;
        return dispatch(gVar, this.f127150e, this);
    }

    public int getType() {
        return 11965;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("TopMsg.NetSceneChatRoomTopMsg", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f127150e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ChatRoomTopMsgResponse");
            C49745hs hsVar = (C49745hs) aVar;
        }
        C11385n nVar = this.f127149d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47387e(int r23, com.tencent.p014mm.storage.C72963f4 r24) {
        /*
            r22 = this;
            r1 = r24
            java.lang.String r0 = "msgInfo"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r3 = r24.mo108768t()
            long r4 = r24.mo108774y2()
            int r6 = r24.getType()
            java.lang.String r0 = su0.C13781a.m13082a()
            int r2 = r24.mo108769t2()
            r7 = 32
            java.lang.String r8 = "msg.content"
            java.lang.String r9 = ""
            r10 = -1
            r11 = 0
            r12 = 1
            if (r2 != r12) goto L_0x002c
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r0 = r9
        L_0x0029:
            r10 = r0
            goto L_0x008a
        L_0x002c:
            java.lang.String r2 = r24.getContent()
            int r2 = eb0.C75604z3.m90848t(r2)
            if (r2 == r10) goto L_0x0087
            java.lang.String r13 = r24.getContent()
            gy3.C87412m.m108593f(r13, r8)
            java.lang.String r2 = r13.substring(r11, r2)
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r2, r13)
            int r13 = r2.length()
            int r13 = r13 - r12
            r14 = 0
            r15 = 0
        L_0x004d:
            if (r14 > r13) goto L_0x0072
            if (r15 != 0) goto L_0x0053
            r10 = r14
            goto L_0x0054
        L_0x0053:
            r10 = r13
        L_0x0054:
            char r10 = r2.charAt(r10)
            int r10 = gy3.C87412m.m108596i(r10, r7)
            if (r10 > 0) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r15 != 0) goto L_0x006b
            if (r10 != 0) goto L_0x0068
            r10 = -1
            r15 = 1
            goto L_0x004d
        L_0x0068:
            int r14 = r14 + 1
            goto L_0x0070
        L_0x006b:
            if (r10 != 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            int r13 = r13 + -1
        L_0x0070:
            r10 = -1
            goto L_0x004d
        L_0x0072:
            int r13 = r13 + r12
            java.lang.CharSequence r2 = r2.subSequence(r14, r13)
            java.lang.String r2 = r2.toString()
            int r10 = r2.length()
            if (r10 <= 0) goto L_0x0083
            r10 = 1
            goto L_0x0084
        L_0x0083:
            r10 = 0
        L_0x0084:
            if (r10 == 0) goto L_0x0087
            r0 = r2
        L_0x0087:
            if (r0 != 0) goto L_0x0029
            goto L_0x0028
        L_0x008a:
            com.tencent.mm.pointers.PString r0 = new com.tencent.mm.pointers.PString
            r0.<init>()
            com.tencent.mm.pointers.PString r2 = new com.tencent.mm.pointers.PString
            r2.<init>()
            com.tencent.mm.pointers.PInt r13 = new com.tencent.mm.pointers.PInt
            r13.<init>()
            java.lang.Class<f62.k0> r14 = f62.C75700k0.class
            k40.a r14 = f40.C86709a0.m107533q(r14)
            f62.k0 r14 = (f62.C75700k0) r14
            com.tencent.mm.storage.v3 r14 = r14.mo96094Ku()
            com.tencent.mm.storage.i2 r14 = (com.tencent.p014mm.storage.C44660i2) r14
            com.tencent.mm.storage.v3$b r14 = r14.mo69741L()
            com.tencent.mm.app.o1 r14 = (com.tencent.p014mm.app.C28686o1) r14
            r14.getClass()
            p875ci.C67379u.m79740d(r1, r0, r2, r13, r11)
            java.lang.String r0 = r0.value
            int r2 = r24.mo108769t2()
            java.lang.String r13 = "this as java.lang.String).substring(startIndex)"
            java.lang.String r14 = "digest"
            if (r2 != 0) goto L_0x00fc
            int r2 = eb0.C75604z3.m90848t(r0)     // Catch:{ all -> 0x00da }
            r15 = -1
            if (r2 == r15) goto L_0x00fc
            gy3.C87412m.m108593f(r0, r14)     // Catch:{ all -> 0x00da }
            int r2 = r2 + r12
            java.lang.String r0 = r0.substring(r2)     // Catch:{ all -> 0x00da }
            gy3.C87412m.m108593f(r0, r13)     // Catch:{ all -> 0x00da }
            java.lang.CharSequence r0 = z04.C112550d0.m153799i0(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00da }
            goto L_0x00fc
        L_0x00da:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r15 = "TopMsg.NetSceneChatRoomTopMsg"
            java.lang.String r11 = "getDigest err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r11, r2)
            int r0 = r24.mo108769t2()
            java.lang.String r2 = r24.mo101010p2()
            java.lang.String r11 = r24.getContent()
            int r15 = r24.getType()
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = p875ci.C67379u.m79745j(r0, r2, r11, r15, r12)
        L_0x00fc:
            int r2 = r24.getType()
            r11 = 48
            if (r2 != r11) goto L_0x0134
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            java.lang.String r11 = r24.getContent()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4$e r2 = r2.Tx0(r11)
            java.lang.String r2 = r2.f212708f
            if (r2 != 0) goto L_0x011b
            r2 = r9
        L_0x011b:
            boolean r11 = z04.C112551y.m153811k(r2)
            if (r11 != 0) goto L_0x0191
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r7)
            r11.append(r2)
            java.lang.String r0 = r11.toString()
            goto L_0x0191
        L_0x0134:
            int r2 = r24.getType()
            r7 = 47
            if (r2 == r7) goto L_0x0145
            int r2 = r24.getType()
            r7 = 1048625(0x100031, float:1.469437E-39)
            if (r2 != r7) goto L_0x0191
        L_0x0145:
            gy3.C87412m.m108593f(r0, r14)
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            java.lang.String r17 = ":"
            r16 = r0
            int r2 = z04.C112550d0.m153769E(r16, r17, r18, r19, r20, r21)
            r7 = 1
            int r2 = r2 + r7
            java.lang.String r0 = r0.substring(r2)
            gy3.C87412m.m108593f(r0, r13)
            java.lang.String r0 = com.tencent.p014mm.p136ui.conversation.C74720p.m89462A(r0)
            if (r0 == 0) goto L_0x0170
            boolean r2 = z04.C112551y.m153811k(r0)
            if (r2 == 0) goto L_0x016e
            goto L_0x0170
        L_0x016e:
            r11 = 0
            goto L_0x0171
        L_0x0170:
            r11 = 1
        L_0x0171:
            if (r11 != 0) goto L_0x018a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r7 = 91
            r2.append(r7)
            r2.append(r0)
            r0 = 93
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0191
        L_0x018a:
            r0 = 2131821467(0x7f11039b, float:1.9275678E38)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r0)
        L_0x0191:
            int r2 = r24.getType()
            r7 = 42
            java.lang.String r11 = "getContext()"
            if (r2 == r7) goto L_0x0251
            int r2 = r24.getType()
            r7 = 66
            if (r2 != r7) goto L_0x01a5
            goto L_0x0251
        L_0x01a5:
            int r2 = r24.getType()
            r7 = 939524145(0x38000031, float:3.0517756E-5)
            r12 = 0
            if (r2 != r7) goto L_0x01ea
            gy3.C87412m.m108593f(r0, r14)
            java.lang.String r2 = r24.getContent()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r2)
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r12)
            java.lang.Class<gy1.a> r7 = gy1.C76074a.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r7)
            gy1.a r2 = (gy1.C76074a) r2
            if (r2 == 0) goto L_0x029f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131821549(0x7f1103ed, float:1.9275844E38)
            java.lang.String r7 = r7.getString(r8)
            r0.append(r7)
            java.lang.String r2 = r2.f222932c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x029f
        L_0x01ea:
            int r2 = r24.getType()
            r7 = 771751985(0x2e000031, float:2.9104E-11)
            if (r2 != r7) goto L_0x022d
            gy3.C87412m.m108593f(r0, r14)
            java.lang.String r2 = r24.getContent()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r2)
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r12)
            java.lang.Class<ht1.e> r7 = ht1.C60161e.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r7)
            ht1.e r2 = (ht1.C60161e) r2
            if (r2 == 0) goto L_0x029f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131821535(0x7f1103df, float:1.9275816E38)
            java.lang.String r7 = r7.getString(r8)
            r0.append(r7)
            java.lang.String r2 = r2.f171704e
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x029f
        L_0x022d:
            int r2 = r24.getType()
            r7 = 1124073521(0x43000031, float:128.00075)
            if (r2 != r7) goto L_0x029f
            java.lang.Class<hg.d> r0 = p548hg.C98450d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hg.d r0 = (p548hg.C98450d) r0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r2, r11)
            java.lang.String r7 = r24.getContent()
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r0 = r0.mo137794Ml(r2, r7)
            goto L_0x029f
        L_0x0251:
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            java.lang.String r2 = r24.getContent()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4$b r0 = r0.Rv0(r2)
            java.lang.String r2 = r0.f212675a
            java.lang.String r7 = r0.f212676b
            int r0 = r0.f212691q
            java.util.Set<java.lang.String> r8 = eb0.C45628s0.f123410p
            com.tencent.p014mm.storage.C72996z1.m85810M4(r0)
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            d62.i r0 = (d62.C75339i) r0
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x0281
            goto L_0x0282
        L_0x0281:
            r7 = r0
        L_0x0282:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = r24.getContent()
            java.lang.String r0 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.m89667t8(r0, r2, r8)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "title"
            gy3.C87412m.m108593f(r0, r2)
        L_0x029f:
            if (r0 != 0) goto L_0x02a3
            r8 = r9
            goto L_0x02a4
        L_0x02a3:
            r8 = r0
        L_0x02a4:
            nm2.b r0 = nm2.C76928b.f224816a
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r2, r11)
            java.lang.String r7 = su0.C13781a.m13082a()
            te3.j3 r0 = r0.mo107263a(r2, r1, r7)
            byte[] r9 = r0.toByteArray()
            r1 = r22
            r2 = r23
            r7 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: on3.C47387e.<init>(int, com.tencent.mm.storage.f4):void");
    }
}
