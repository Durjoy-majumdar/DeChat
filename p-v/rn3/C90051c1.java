package rn3;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.p136ui.transmit.C85970n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import hp3.C87581a;
import java.util.LinkedList;

/* renamed from: rn3.c1 */
public final class C90051c1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C85970n.C85971a f258676a;

    /* renamed from: b */
    public final /* synthetic */ C44561j f258677b;

    /* renamed from: c */
    public final /* synthetic */ WXMediaMessage f258678c;

    /* renamed from: d */
    public final /* synthetic */ WXMiniProgramObject f258679d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<String> f258680e;

    /* renamed from: f */
    public final /* synthetic */ int f258681f;

    /* renamed from: g */
    public final /* synthetic */ boolean f258682g;

    /* renamed from: h */
    public final /* synthetic */ boolean f258683h;

    /* renamed from: i */
    public final /* synthetic */ String f258684i;

    /* renamed from: j */
    public final /* synthetic */ int f258685j;

    /* renamed from: k */
    public final /* synthetic */ C85970n.C85973b f258686k;

    public C90051c1(C85970n.C85971a aVar, C44561j jVar, WXMediaMessage wXMediaMessage, WXMiniProgramObject wXMiniProgramObject, LinkedList<String> linkedList, int i, boolean z, boolean z2, String str, int i2, C85970n.C85973b bVar) {
        this.f258676a = aVar;
        this.f258677b = jVar;
        this.f258678c = wXMediaMessage;
        this.f258679d = wXMiniProgramObject;
        this.f258680e = linkedList;
        this.f258681f = i;
        this.f258682g = z;
        this.f258683h = z2;
        this.f258684i = str;
        this.f258685j = i2;
        this.f258686k = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r31) {
        /*
            r30 = this;
            r1 = r30
            r7 = r31
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r7 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r7
            java.lang.String r2 = "MicroMsg.SendWXMediaMessageHelper"
            r3 = 5
            r15 = 0
            r4 = 2
            if (r7 != 0) goto L_0x001b
            java.lang.String r0 = "get wxaAttributes for appbrand info failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            com.tencent.mm.ui.transmit.n$a r0 = r1.f258676a
            if (r0 == 0) goto L_0x020e
            com.tencent.p014mm.p136ui.transmit.C85970n.C85971a.C85972a.m106303a(r0, r3, r15, r4, r15)
            goto L_0x020e
        L_0x001b:
            com.tencent.mm.ui.transmit.n r0 = com.tencent.p014mm.p136ui.transmit.C85970n.f250401a
            com.tencent.mm.pluginsdk.model.app.j r5 = r1.f258677b
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r1.f258678c
            com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject r13 = r1.f258679d
            java.util.LinkedList<java.lang.String> r6 = r1.f258680e
            int r12 = r1.f258681f
            boolean r11 = r1.f258682g
            boolean r10 = r1.f258683h
            java.lang.String r9 = r1.f258684i
            int r8 = r1.f258685j
            com.tencent.mm.ui.transmit.n$a r15 = r1.f258676a
            com.tencent.mm.ui.transmit.n$b r3 = r1.f258686k
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "1_"
            r4.<init>(r1)
            java.lang.String r1 = r5.field_appId
            r4.append(r1)
            java.lang.String r1 = "_"
            r4.append(r1)
            eb0.c r18 = eb0.C97625j3.m125812b()
            int r18 = r18.mo105881G()
            java.lang.String r18 = p823sg.C77710q.m93738a(r18)
            r19 = r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r18)
            r4.append(r3)
            r4.append(r1)
            r20 = r8
            r18 = r9
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r4.append(r8)
            r4.append(r1)
            java.lang.String r1 = "0"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r3 = "shareActionId.toString()"
            gy3.C87412m.m108593f(r1, r3)
            r3 = 4
            if (r15 == 0) goto L_0x0082
            r4 = r15
            com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$a r4 = (com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.C85960a) r4
            r4.mo119878a(r3, r7)
        L_0x0082:
            boolean r4 = r13.withShareTicket
            java.lang.String r9 = ""
            r21 = 3
            if (r4 == 0) goto L_0x0162
            ob0.c$b r4 = new ob0.c$b
            r4.<init>()
            r0 = 1118(0x45e, float:1.567E-42)
            r4.f127069d = r0
            java.lang.String r0 = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo"
            r4.f127068c = r0
            te3.v45 r3 = new te3.v45
            r3.<init>()
            java.lang.String r0 = r7.field_appId
            r3.f259867d = r0
            r3.f259868e = r6
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ea }
            r0.<init>()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r8 = "_wx_mini_program_key_activity_id"
            java.lang.String r8 = r13.getExtra(r8, r9)     // Catch:{ Exception -> 0x00ea }
            r25 = r12
            java.lang.String r12 = "_wx_mini_program_key_parameter_info_list"
            java.lang.String r9 = r13.getExtra(r12, r9)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r12 = "activity_id"
            r0.put(r12, r8)     // Catch:{ Exception -> 0x00e6 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x00e6 }
            if (r12 != 0) goto L_0x00cb
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ Exception -> 0x00e6 }
            r12.<init>(r9)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r9 = "parameter_list"
            r0.put(r9, r12)     // Catch:{ Exception -> 0x00e6 }
        L_0x00cb:
            java.lang.String r9 = "getAppBrandActivityInfo activityId: %s, json: %s"
            r26 = r15
            r12 = 2
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00e4 }
            r12 = 0
            r15[r12] = r8     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x00e4 }
            r12 = 1
            r15[r12] = r8     // Catch:{ Exception -> 0x00e4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r15)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00f7
        L_0x00e4:
            r0 = move-exception
            goto L_0x00ee
        L_0x00e6:
            r0 = move-exception
        L_0x00e7:
            r26 = r15
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            r25 = r12
            goto L_0x00e7
        L_0x00ee:
            r8 = 0
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r8 = "getAppBrandActivityInfo exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r8, r9)
            r0 = 0
        L_0x00f7:
            r3.f259870g = r0
            boolean r0 = r13.isUpdatableMessage
            r3.f259869f = r0
            boolean r8 = r13.isSecretMessage
            r3.f259873j = r8
            r8 = 1
            r3.f259874n = r8
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r12 = r3.f259867d
            r15 = 0
            r9[r15] = r12
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9[r8] = r0
            java.lang.String r0 = r3.f259870g
            r8 = 2
            r9[r8] = r0
            boolean r0 = r3.f259873j
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9[r21] = r0
            int r0 = r3.f259874n
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = 4
            r9[r8] = r0
            java.lang.String r0 = "sendAppBrandAppMsgImpl appId: %s, isUpdatableMsg: %b, activityInfo: %s, isSecretMsg: %s, sourceType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r9)
            r4.f127066a = r3
            te3.w45 r0 = new te3.w45
            r0.<init>()
            r4.f127067b = r0
            ob0.c r0 = r4.mo72403a()
            rn3.b1 r12 = new rn3.b1
            r2 = r12
            r9 = r19
            r3 = r6
            r4 = r5
            r5 = r11
            r6 = r10
            r15 = r20
            r11 = 0
            r8 = r13
            r13 = r9
            r16 = r18
            r9 = r1
            r10 = r15
            r15 = 0
            r11 = r14
            r14 = r12
            r18 = r25
            r12 = r13
            r13 = r18
            r19 = r1
            r1 = r14
            r14 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            ob0.C89144l0.m111429e(r0, r1, r15)
            goto L_0x0202
        L_0x0162:
            r26 = r15
            r16 = r18
            r15 = r20
            r18 = r12
            r29 = r19
            r19 = r1
            r1 = r29
            java.util.Iterator r2 = r6.iterator()
        L_0x0174:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0202
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.message.l$b r4 = new com.tencent.mm.message.l$b
            r4.<init>()
            java.lang.String r6 = r5.field_appId
            java.lang.String r8 = "app.field_appId"
            gy3.C87412m.m108593f(r6, r8)
            if (r11 != 0) goto L_0x0191
            if (r10 == 0) goto L_0x0191
            r6 = r9
        L_0x0191:
            r4.f195562d = r6
            java.lang.String r6 = r7.field_appId
            r4.f195577g2 = r6
            int r6 = r13.miniprogramType
            r4.f195653z2 = r6
            java.lang.String r6 = r5.field_appName
            r4.f195484F = r6
            r6 = 2
            r4.f195618r = r6
            r12 = r19
            r4.f195589j2 = r12
            boolean r8 = r13.withShareTicket
            if (r8 == 0) goto L_0x01ac
            r8 = 3
            goto L_0x01ad
        L_0x01ac:
            r8 = 2
        L_0x01ad:
            r4.f195581h2 = r8
            java.lang.String r8 = r7.field_username
            r4.f195634v = r8
            java.lang.String r8 = r7.field_nickname
            r4.f195638w = r8
            r4.f195617q2 = r15
            r8 = 0
            r0.mo119882b(r7, r4, r8, r1)
            r0.mo119885f(r4, r14)
            r8 = 1
            if (r15 == 0) goto L_0x01c5
            r4.f195605n2 = r8
        L_0x01c5:
            r17 = 0
            r19 = 0
            r20 = 4
            r22 = 0
            r23 = 1
            r8 = r0
            r24 = r9
            r9 = r11
            r25 = r10
            r10 = r16
            r27 = r11
            r11 = r19
            r6 = r12
            r12 = r1
            r28 = r13
            r13 = r20
            r20 = r14
            r14 = r22
            com.tencent.mm.pluginsdk.model.app.a r13 = com.tencent.p014mm.p136ui.transmit.C85970n.m106294i(r8, r9, r10, r11, r12, r13, r14)
            r8 = r4
            r9 = r20
            r10 = r3
            r11 = r17
            r12 = r18
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85084z(r8, r9, r10, r11, r12, r13)
            r19 = r6
            r14 = r20
            r9 = r24
            r10 = r25
            r11 = r27
            r13 = r28
            goto L_0x0174
        L_0x0202:
            r6 = r19
            if (r26 == 0) goto L_0x020e
            r0 = 6
            r15 = r26
            com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$a r15 = (com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.C85960a) r15
            r15.mo119878a(r0, r6)
        L_0x020e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rn3.C90051c1.call(java.lang.Object):java.lang.Object");
    }
}
