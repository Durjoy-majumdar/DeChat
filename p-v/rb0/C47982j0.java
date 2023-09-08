package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C50815pe;
import te3.C50948qe;

/* renamed from: rb0.j0 */
public class C47982j0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128693d;

    /* renamed from: e */
    public C47350c f128694e;

    /* renamed from: f */
    public String f128695f;

    /* renamed from: g */
    public C47983a<C47982j0> f128696g;

    /* renamed from: rb0.j0$a */
    public interface C47983a<T extends C117747y> {
    }

    public C47982j0(String str, String str2, C47983a<C47982j0> aVar) {
        this.f128695f = str;
        Log.m105925i("MicroMsg.NetSceneBizAttrSync", "[BizAttr] NetSceneBizAttrSync (%s)", str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1075;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/bizattr/bizattrsync";
        bVar.f127066a = new C50815pe();
        bVar.f127067b = new C50948qe();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128694e = a;
        C50815pe peVar = (C50815pe) a.f127055a.f127080a;
        peVar.f139719d = this.f128695f;
        peVar.f139720e = new C89349b(Util.decodeHexString(Util.nullAsNil(str2)));
        this.f128696g = aVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128693d = nVar;
        return dispatch(gVar, this.f128694e, this);
    }

    public int getType() {
        return 1075;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x062f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r23, int r24, int r25, java.lang.String r26, com.tencent.p014mm.network.C114799u r27, byte[] r28) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            r2 = r25
            r3 = r26
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r23)
            r7 = 0
            r5[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r24)
            r8 = 1
            r5[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            r9 = 2
            r5[r9] = r6
            r6 = 3
            r5[r6] = r3
            java.lang.String r10 = "MicroMsg.NetSceneBizAttrSync"
            java.lang.String r11 = "[BizAttr] onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r5)
            ob0.n r5 = r1.f128693d
            if (r5 == 0) goto L_0x0031
            r5.onSceneEnd(r0, r2, r3, r1)
        L_0x0031:
            rb0.j0$a<rb0.j0> r5 = r1.f128696g
            if (r5 == 0) goto L_0x06ba
            rb0.a$a r5 = (rb0.C47961a.C47962a) r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "onSceneEnd errType = "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = ", errCode = "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = ",errMsg = "
            r10.append(r11)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            java.lang.String r10 = "MicroMsg.BizAttrRenovator"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            rb0.a r3 = rb0.C47961a.this
            java.lang.String r11 = r5.f128668a
            r3.getClass()
            java.lang.String r3 = rb0.C47961a.f128666a
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r11)
            if (r3 == 0) goto L_0x007b
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = rb0.C47961a.f128667b
            long r11 = r11 - r13
            r13 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0085
            java.lang.String r0 = "onNetSceneEndCallback return, username is just delete."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x06ba
        L_0x0085:
            java.lang.ref.WeakReference r3 = r5.f128669b
            r11 = 0
            if (r3 == 0) goto L_0x0091
            java.lang.Object r3 = r3.get()
            rb0.a$b r3 = (rb0.C47961a.C12965b) r3
            goto L_0x0092
        L_0x0091:
            r3 = r11
        L_0x0092:
            if (r0 != 0) goto L_0x06a1
            if (r2 == 0) goto L_0x0098
            goto L_0x06a1
        L_0x0098:
            ob0.c r0 = r1.f128694e
            if (r0 == 0) goto L_0x00a6
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            if (r0 == 0) goto L_0x00a6
            te3.qe r0 = (te3.C50948qe) r0
            r2 = r0
            goto L_0x00a7
        L_0x00a6:
            r2 = r11
        L_0x00a7:
            if (r2 != 0) goto L_0x00b7
            java.lang.String r0 = "resp is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            if (r3 == 0) goto L_0x06ba
            java.lang.String r0 = r5.f128668a
            r3.mo12496a(r7, r0)
            goto L_0x06ba
        L_0x00b7:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r12 = r5.f128668a
            r0[r7] = r12
            pe3.b r12 = r2.f140255d
            if (r12 != 0) goto L_0x00c2
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r11 = new java.lang.String
            byte[] r12 = r12.f257327a
            r11.<init>(r12)
        L_0x00c9:
            r0[r8] = r11
            java.util.LinkedList<te3.re> r11 = r2.f140256e
            if (r11 != 0) goto L_0x00d1
            r11 = 0
            goto L_0x00d5
        L_0x00d1:
            int r11 = r11.size()
        L_0x00d5:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r9] = r11
            java.lang.String r11 = "[BizAttr] biz(%s) Attribute LastAttrVersion = %s, UpdateInfoList.size = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r0)
            java.util.LinkedList<te3.re> r11 = r2.f140256e
            if (r11 != 0) goto L_0x00f2
            java.lang.String r0 = "[BizAttr] resp.UpdateInfoList null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            if (r3 == 0) goto L_0x06ba
            java.lang.String r0 = r5.f128668a
            r3.mo12496a(r7, r0)
            goto L_0x06ba
        L_0x00f2:
            rb0.a r0 = rb0.C47961a.this
            java.lang.String r12 = r5.f128668a
            r0.getClass()
            java.lang.Class<f62.k0> r13 = f62.C75700k0.class
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r14 == 0) goto L_0x0108
            java.lang.String r0 = "updateBizAttributes failed, username is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x011f
        L_0x0108:
            rb0.j r14 = rb0.C48009v0.Fx0()
            ug.c r14 = r14.mo72757SE(r12)
            boolean r0 = r0.mo72735b(r14)
            if (r0 != 0) goto L_0x0128
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r12
            java.lang.String r11 = "Do not need to update bizAttrs now.(username : %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r0)
        L_0x011f:
            r25 = r2
            r26 = r3
            r23 = r5
            r1 = 0
            goto L_0x0619
        L_0x0128:
            k40.a r0 = f40.C86709a0.m107533q(r13)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            com.tencent.mm.storage.z1 r15 = r0.get(r12)
            if (r15 == 0) goto L_0x0607
            r23 = r5
            long r4 = r15.f108320R1
            int r0 = (int) r4
            if (r0 == 0) goto L_0x0602
            boolean r0 = r15.mo62916m3()
            if (r0 != 0) goto L_0x0147
            goto L_0x0602
        L_0x0147:
            java.lang.String r0 = r15.getUsername()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0154
            r15.setUsername(r12)
        L_0x0154:
            java.lang.Class<ln.g> r4 = p196ln.C76706g.class
            int r0 = r11.size()
            if (r0 != 0) goto L_0x0168
            java.lang.String r0 = "updateBizAttributes failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r25 = r2
            r26 = r3
            goto L_0x055e
        L_0x0168:
            java.lang.String r5 = r15.getUsername()
            boolean r0 = r15.mo62916m3()
            if (r0 != 0) goto L_0x0182
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r5
            java.lang.String r4 = "updateBizAttributes failed, contact is not a biz contact.(username : %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r4, r0)
            r25 = r2
            r26 = r3
            goto L_0x05fe
        L_0x0182:
            di3.d r0 = di3.C86312j.m106911c(r4)
            ln.g r0 = (p196ln.C76706g) r0
            ln.n r0 = r0.mo106832eg()
            com.tencent.mm.modelavatar.o r0 = (com.tencent.p014mm.modelavatar.C68098o) r0
            com.tencent.mm.modelavatar.n r12 = r0.mo93607Lo(r5)
            java.lang.String r0 = r14.field_extInfo     // Catch:{ Exception -> 0x01a8 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x01a8 }
            if (r0 == 0) goto L_0x01a0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01a8 }
            r0.<init>()     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01b7
        L_0x01a0:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r6 = r14.field_extInfo     // Catch:{ Exception -> 0x01a8 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01b7
        L_0x01a8:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r6[r7] = r0
            java.lang.String r0 = "create Json object from extInfo error. %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r6)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x01b7:
            r6 = r0
            r16 = -1
            int r0 = r15.getType()
            long r7 = (long) r0
            java.util.Iterator r11 = r11.iterator()
            r20 = r16
            r16 = 0
            r17 = 0
        L_0x01c9:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0551
            java.lang.Object r0 = r11.next()
            r9 = r0
            te3.re r9 = (te3.C51095re) r9
            if (r9 != 0) goto L_0x01e7
            java.lang.String r0 = "keyValue is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            r25 = r2
            r26 = r3
            r24 = r11
            r2 = r20
            goto L_0x0539
        L_0x01e7:
            java.lang.String r1 = r9.f140851d
            r24 = r11
            r11 = 2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r11 = 0
            r0[r11] = r1
            java.lang.String r11 = r9.f140852e
            r19 = 1
            r0[r19] = r11
            java.lang.String r11 = "[BizAttr] UpdateInfoList key = %s, value = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r0)
            java.lang.String r0 = r9.f140852e
            java.lang.String r11 = "UserName"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x0207
            goto L_0x0262
        L_0x0207:
            java.lang.String r11 = "NickName"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x0213
            r15.mo62878U2(r0)
            goto L_0x0262
        L_0x0213:
            java.lang.String r11 = "Alias"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x021f
            r15.mo62857I2(r0)
            goto L_0x0262
        L_0x021f:
            java.lang.String r11 = "PYInitial"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x022b
            r15.mo62882W2(r0)
            goto L_0x0262
        L_0x022b:
            java.lang.String r11 = "QuanPin"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x0237
            r15.mo62884X2(r0)
            goto L_0x0262
        L_0x0237:
            java.lang.String r11 = "VerifyFlag"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x024b
            int r11 = r15.mo73953E2()
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r11)
            r15.mo62894d3(r0)
            goto L_0x0262
        L_0x024b:
            java.lang.String r11 = "VerifyInfo"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x0257
            r15.mo62925q4(r0)
            goto L_0x0262
        L_0x0257:
            java.lang.String r11 = "Signature"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x0264
            r15.mo62902g4(r0)
        L_0x0262:
            r0 = 1
            goto L_0x0265
        L_0x0264:
            r0 = 0
        L_0x0265:
            if (r0 != 0) goto L_0x053c
            java.lang.String r11 = r9.f140852e
            java.lang.String r0 = "IsShowHeadImgInMsg"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0276
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0276:
            java.lang.String r0 = "IsHideInputToolbarInMsg"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0283
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0283:
            java.lang.String r0 = "IsAgreeProtocol"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x028d
            goto L_0x048a
        L_0x028d:
            java.lang.String r0 = "InteractiveMode"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x02a2
            int r0 = r6.optInt(r1)     // Catch:{ JSONException -> 0x0495 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r0)     // Catch:{ JSONException -> 0x0495 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x02a2:
            java.lang.String r0 = "CanReceiveSpeexVoice"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x02af
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x02af:
            java.lang.String r0 = "ConnectorMsgType"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x02c4
            int r0 = r6.optInt(r1)     // Catch:{ JSONException -> 0x0495 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r0)     // Catch:{ JSONException -> 0x0495 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x02c4:
            java.lang.String r0 = "ReportLocationType"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x02d9
            int r0 = r6.optInt(r1)     // Catch:{ JSONException -> 0x0495 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r0)     // Catch:{ JSONException -> 0x0495 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x02d9:
            java.lang.String r0 = "AudioPlayType"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x02ee
            int r0 = r6.optInt(r1)     // Catch:{ JSONException -> 0x0495 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r0)     // Catch:{ JSONException -> 0x0495 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x02ee:
            java.lang.String r0 = "IsShowMember"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x02fb
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x02fb:
            java.lang.String r0 = "ConferenceContactExpireTime"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0308
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0308:
            java.lang.String r0 = "VerifyMsg2Remark"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0312
            goto L_0x048a
        L_0x0312:
            java.lang.String r0 = "VerifyContactPromptTitle"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x031f
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x031f:
            java.lang.String r0 = "IsSubscribeStat"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0329
            goto L_0x048a
        L_0x0329:
            java.lang.String r0 = "ScanQRCodeType"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x033e
            int r0 = r6.optInt(r1)     // Catch:{ JSONException -> 0x0495 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r0)     // Catch:{ JSONException -> 0x0495 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x033e:
            java.lang.String r0 = "ServiceType"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0353
            int r0 = r6.optInt(r1)     // Catch:{ JSONException -> 0x0495 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r0)     // Catch:{ JSONException -> 0x0495 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0353:
            java.lang.String r0 = "NeedShowUserAddrObtaining"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x035d
            goto L_0x048a
        L_0x035d:
            java.lang.String r0 = "SupportEmoticonLinkPrefix"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x036a
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x036a:
            java.lang.String r0 = "FunctionFlag"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x037f
            int r0 = r6.optInt(r1)     // Catch:{ JSONException -> 0x0495 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r0)     // Catch:{ JSONException -> 0x0495 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x037f:
            java.lang.String r0 = "NotifyManage"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x038c
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x038c:
            java.lang.String r0 = "ServicePhone"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0399
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0399:
            java.lang.String r0 = "IsTrademarkProtection"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x03a6
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x03a6:
            java.lang.String r0 = "CanReceiveLongVideo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x03b0
            goto L_0x048a
        L_0x03b0:
            java.lang.String r0 = "TrademarkUrl"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x03bd
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x03bd:
            java.lang.String r0 = "TrademarkName"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x03ca
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x03ca:
            java.lang.String r0 = "MMBizMenu"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x03e7
            java.lang.String r0 = "gh_f0a92aa7146c"
            boolean r0 = r5.equals(r0)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x03e2
            java.lang.String r0 = "username.equals(ContactStorageLogic.SPUSER_WXPAY_COLLECTION),dont update MMBizMenu."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x03e2:
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x03e7:
            java.lang.String r0 = "VerifySource"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x03f4
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x03f4:
            java.lang.String r0 = "PersonVerifyInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0401
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0401:
            java.lang.String r0 = "MMBizTabbar"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x040b
            goto L_0x048a
        L_0x040b:
            java.lang.String r0 = "PayShowInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0418
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0418:
            java.lang.String r0 = "HardwareBizInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0425
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0425:
            java.lang.String r0 = "EnterpriseBizInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0431
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0431:
            java.lang.String r0 = "MainPage"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x043a
            goto L_0x048a
        L_0x043a:
            java.lang.String r0 = "RegisterSource"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0446
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0446:
            java.lang.String r0 = "IBeaconBizInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x044f
            goto L_0x048a
        L_0x044f:
            java.lang.String r0 = "WxaAppInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x045b
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x045b:
            java.lang.String r0 = "WxaAppVersionInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0467
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0467:
            java.lang.String r0 = "WXAppType"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x0473
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x0473:
            java.lang.String r0 = "BindWxaInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x047f
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
            goto L_0x048a
        L_0x047f:
            java.lang.String r0 = "AcctTransferInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0495 }
            if (r0 == 0) goto L_0x048f
            r6.put(r1, r11)     // Catch:{ JSONException -> 0x0495 }
        L_0x048a:
            r25 = r2
            r26 = r3
            goto L_0x04ac
        L_0x048f:
            r25 = r2
            r26 = r3
            r0 = 0
            goto L_0x04ad
        L_0x0495:
            r0 = move-exception
            r25 = r2
            r26 = r3
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r1
            r2 = 1
            r3[r2] = r11
            r2 = 2
            r3[r2] = r0
            java.lang.String r0 = "updateExtInfoAttrs failed, key(%s) value(%s), exception : %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r3)
        L_0x04ac:
            r0 = 1
        L_0x04ad:
            if (r0 != 0) goto L_0x0540
            java.lang.String r0 = r9.f140852e
            java.lang.String r2 = "BrandInfo"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x04bc
            r14.field_brandInfo = r0
            goto L_0x04eb
        L_0x04bc:
            java.lang.String r2 = "BrandIconURL"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x04c7
            r14.field_brandIconURL = r0
            goto L_0x04eb
        L_0x04c7:
            java.lang.String r2 = "BrandFlag"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x04d8
            int r2 = r14.field_brandFlag
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            r14.field_brandFlag = r0
            goto L_0x04eb
        L_0x04d8:
            java.lang.String r2 = "Appid"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x04ed
            java.lang.String r2 = r14.field_appId
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x04e9
            goto L_0x04ed
        L_0x04e9:
            r14.field_appId = r0
        L_0x04eb:
            r0 = 1
            goto L_0x04ee
        L_0x04ed:
            r0 = 0
        L_0x04ee:
            if (r0 == 0) goto L_0x04f1
            goto L_0x0540
        L_0x04f1:
            java.lang.String r0 = r9.f140852e
            java.lang.String r2 = "BigHeadImgUrl"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0500
            if (r12 == 0) goto L_0x050c
            r12.f195732e = r0
            goto L_0x050c
        L_0x0500:
            java.lang.String r2 = "SmallHeadImgUrl"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x050e
            if (r12 == 0) goto L_0x050c
            r12.f195731d = r0
        L_0x050c:
            r0 = 1
            goto L_0x050f
        L_0x050e:
            r0 = 0
        L_0x050f:
            if (r0 == 0) goto L_0x0516
            int r16 = r16 + 1
            r17 = 1
            goto L_0x0546
        L_0x0516:
            java.lang.String r0 = "BitMask"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0527
            java.lang.String r0 = r9.f140852e
            r2 = r20
            long r20 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r2)
            goto L_0x0544
        L_0x0527:
            r2 = r20
            java.lang.String r0 = "BitVal"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0539
            java.lang.String r0 = r9.f140852e
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r7)
            r7 = r0
            goto L_0x0542
        L_0x0539:
            r20 = r2
            goto L_0x0546
        L_0x053c:
            r25 = r2
            r26 = r3
        L_0x0540:
            r2 = r20
        L_0x0542:
            r20 = r2
        L_0x0544:
            int r16 = r16 + 1
        L_0x0546:
            r1 = r22
            r11 = r24
            r2 = r25
            r3 = r26
            r9 = 2
            goto L_0x01c9
        L_0x0551:
            r25 = r2
            r26 = r3
            r2 = r20
            if (r16 != 0) goto L_0x0561
            java.lang.String r0 = "None attribute has been updated."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x055e:
            r7 = 0
            goto L_0x05fe
        L_0x0561:
            java.lang.String r0 = r6.toString()
            r14.field_extInfo = r0
            if (r12 == 0) goto L_0x05bb
            if (r17 == 0) goto L_0x05bb
            di3.d r0 = di3.C86312j.m106911c(r4)
            ln.g r0 = (p196ln.C76706g) r0
            ln.j r0 = r0.mo106847uz()
            com.tencent.mm.modelavatar.g r0 = (com.tencent.p014mm.modelavatar.C68082g) r0
            r0.mo93583j(r5, r12)
            di3.d r0 = di3.C86312j.m106911c(r4)
            ln.g r0 = (p196ln.C76706g) r0
            ln.n r0 = r0.mo106832eg()
            com.tencent.mm.modelavatar.o r0 = (com.tencent.p014mm.modelavatar.C68098o) r0
            r0.mo93608Yt(r12)
            rb0.x$a r0 = rb0.C48009v0.Lx0()
            r0.getClass()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r1 == 0) goto L_0x0597
            goto L_0x05bb
        L_0x0597:
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r1 = 0
            r4[r1] = r5
            java.lang.String r1 = "MicroMsg.BrandLogic"
            java.lang.String r6 = "remove cache by brandKey : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r4)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r0 = r0.f128792c
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.remove(r5)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L_0x05bb
            java.lang.Object r0 = r0.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x05bb
            r0.isRecycled()
        L_0x05bb:
            int r0 = r15.getType()
            long r1 = r2 & r7
            int r2 = (int) r1
            r0 = r0 | r2
            r15.setType(r0)
            k40.a r0 = f40.C86709a0.m107533q(r13)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            int r0 = r0.mo69719p3(r5, r15)
            rb0.j r1 = rb0.C48009v0.Fx0()
            r1.replace(r14)
            r1 = 1
            if (r0 != r1) goto L_0x05f8
            k40.a r0 = f40.C86709a0.m107533q(r13)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            k40.a r1 = f40.C86709a0.m107533q(r13)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            com.tencent.mm.sdk.storage.MStorageEx r1 = (com.tencent.p014mm.sdk.storage.MStorageEx) r1
            r2 = 4
            r0.doNotify(r2, r1, r5)
        L_0x05f8:
            java.lang.String r0 = "Update bizInfo attributes successfully."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r7 = 1
        L_0x05fe:
            r18 = r7
            r1 = 0
            goto L_0x061b
        L_0x0602:
            r25 = r2
            r26 = r3
            goto L_0x060d
        L_0x0607:
            r25 = r2
            r26 = r3
            r23 = r5
        L_0x060d:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r12
            java.lang.String r2 = "updateBizAttributes failed, contact do not exist.(username : %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r2, r0)
        L_0x0619:
            r18 = 0
        L_0x061b:
            if (r18 != 0) goto L_0x062f
            java.lang.String r0 = "notifyDataSetChanged, after updateBizAttributes."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            if (r26 == 0) goto L_0x06ba
            r5 = r23
            java.lang.String r0 = r5.f128668a
            r11 = r26
            r11.mo12496a(r1, r0)
            goto L_0x06ba
        L_0x062f:
            r5 = r23
            r1 = r25
            r11 = r26
            pe3.b r0 = r1.f140255d
            if (r0 == 0) goto L_0x0698
            java.lang.String r1 = r5.f128668a
            byte[] r0 = r0.f257327a
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0687
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x064e
            goto L_0x0687
        L_0x064e:
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "BizInfo"
            r4 = 0
            r2[r4] = r3
            java.lang.String r4 = "attrSyncVersion"
            r6 = 1
            r2[r6] = r4
            r4 = 2
            r2[r4] = r0
            java.lang.String r0 = "incrementUpdateTime"
            r4 = 3
            r2[r4] = r0
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r4 = 4
            r2[r4] = r0
            r0 = 5
            java.lang.String r4 = "username"
            r2[r0] = r4
            r0 = 6
            r2[r0] = r1
            java.lang.String r0 = "update %s set %s='%s', %s=%d where %s='%s'"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            rb0.j r1 = rb0.C48009v0.Fx0()
            boolean r0 = r1.execSQL(r3, r0)
            goto L_0x0688
        L_0x0687:
            r0 = 0
        L_0x0688:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "Update attrSyncVersion of bizInfo succ = %b."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r2)
            goto L_0x0699
        L_0x0698:
            r1 = 1
        L_0x0699:
            if (r11 == 0) goto L_0x06ba
            java.lang.String r0 = r5.f128668a
            r11.mo12496a(r1, r0)
            goto L_0x06ba
        L_0x06a1:
            r11 = r3
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 1075(0x433, float:1.506E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "scene.getType() = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r1, r0)
            if (r11 == 0) goto L_0x06ba
            java.lang.String r0 = r5.f128668a
            r11.mo12496a(r2, r0)
        L_0x06ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb0.C47982j0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
