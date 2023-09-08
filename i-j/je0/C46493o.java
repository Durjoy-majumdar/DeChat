package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import he0.C46026p;
import ie0.C46220j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49661h52;

/* renamed from: je0.o */
public final class C46493o extends C117747y implements C1311n {

    /* renamed from: d */
    public C46220j f125257d;

    /* renamed from: e */
    public C49661h52 f125258e;

    /* renamed from: f */
    public C11385n f125259f;

    /* renamed from: g */
    public C47350c f125260g;

    /* renamed from: h */
    public final C46026p f125261h;

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010f, code lost:
        if ((r6 == null || r6.length() == 0) != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (r9 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011f, code lost:
        r3 = r9.field_username;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0121, code lost:
        if (r3 != null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0123, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        r4 = ie0.C46229w.m51531a(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9 A[Catch:{ all -> 0x00d4, all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e8 A[Catch:{ all -> 0x00d4, all -> 0x00f0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46493o(he0.C46026p r14) {
        /*
            r13 = this;
            java.lang.String r0 = "getRequest"
            gy3.C87412m.m108594g(r14, r0)
            r13.<init>()
            r13.f125261h = r14
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            te3.g52 r1 = new te3.g52
            r1.<init>()
            r0.f127066a = r1
            te3.h52 r1 = new te3.h52
            r1.<init>()
            r0.f127067b = r1
            java.lang.String r1 = "/cgi-bin/micromsg-bin/getopenimkefucontact"
            r0.f127068c = r1
            r1 = 4010(0xfaa, float:5.619E-42)
            r0.f127069d = r1
            ob0.c r0 = r0.mo72403a()
            r13.f125260g = r0
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            te3.g52 r0 = (te3.C49517g52) r0
            if (r0 != 0) goto L_0x0034
            goto L_0x0043
        L_0x0034:
            te3.f52 r1 = new te3.f52
            r1.<init>()
            java.lang.String r2 = r14.f124102b
            r1.f133301d = r2
            java.lang.String r2 = r14.f124103c
            r1.f133302e = r2
            r0.f133865d = r1
        L_0x0043:
            byte[] r1 = r14.f124106f
            if (r1 == 0) goto L_0x0053
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0053
            if (r0 != 0) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            pe3.b r1 = pe3.C89349b.m111674a(r1)
            r0.f133868g = r1
        L_0x0053:
            if (r0 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            int r1 = r14.f124101a
            r0.f133866e = r1
        L_0x005a:
            boolean r1 = r14.f124105e
            r2 = 0
            if (r1 == 0) goto L_0x0139
            if (r0 != 0) goto L_0x0063
            goto L_0x0139
        L_0x0063:
            te3.e52 r1 = new te3.e52
            r1.<init>()
            java.lang.String r3 = r14.f124102b
            java.lang.String r4 = "getRequest.url"
            gy3.C87412m.m108593f(r3, r4)
            int r3 = r3.length()
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0079
            r3 = 1
            goto L_0x007a
        L_0x0079:
            r3 = 0
        L_0x007a:
            if (r3 == 0) goto L_0x012a
            java.lang.String r3 = r14.f124102b
            ie0.p r6 = ie0.C46225p.f124603a
            if (r3 == 0) goto L_0x008b
            int r6 = r3.length()
            if (r6 != 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r6 = 0
            goto L_0x008c
        L_0x008b:
            r6 = 1
        L_0x008c:
            if (r6 == 0) goto L_0x0091
            r9 = r2
            goto L_0x00ff
        L_0x0091:
            ie0.p r6 = ie0.C46225p.f124603a
            java.lang.String r7 = r6.mo71635d(r3)
            ie0.k r8 = ie0.C46225p.f124605c
            ie0.j r9 = r8.mo71633a(r7)
            if (r9 == 0) goto L_0x00a0
            goto L_0x00ff
        L_0x00a0:
            java.lang.Class<ge0.b> r9 = ge0.C32415b.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ge0.b r9 = (ge0.C32415b) r9
            ie0.q r9 = r9.yx0()
            if (r9 == 0) goto L_0x00f5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "SELECT *, rowid FROM OpenIMKefuContact WHERE kfUrl = "
            r10.append(r11)
            java.lang.String r11 = zh3.C91753f.m115264e(r7)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r9.f124609d
            r11 = 2
            android.database.Cursor r9 = r9.rawQuery(r10, r2, r11)
            if (r9 == 0) goto L_0x00d6
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x00d4 }
            if (r10 != r5) goto L_0x00d6
            r10 = 1
            goto L_0x00d7
        L_0x00d4:
            r14 = move-exception
            goto L_0x00ef
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            if (r10 == 0) goto L_0x00e8
            ie0.j r10 = new ie0.j     // Catch:{ all -> 0x00d4 }
            r10.<init>()     // Catch:{ all -> 0x00d4 }
            r10.convertFrom(r9)     // Catch:{ all -> 0x00d4 }
            long r11 = r10.systemRowid     // Catch:{ all -> 0x00d4 }
            r10.f124591Z = r11     // Catch:{ all -> 0x00d4 }
            r10.f124590Y = r5     // Catch:{ all -> 0x00d4 }
            goto L_0x00e9
        L_0x00e8:
            r10 = r2
        L_0x00e9:
            rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00d4 }
            cy3.C58003b.m67160a(r9, r2)
            goto L_0x00f6
        L_0x00ef:
            throw r14     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            cy3.C58003b.m67160a(r9, r14)
            throw r0
        L_0x00f5:
            r10 = r2
        L_0x00f6:
            if (r10 == 0) goto L_0x00fb
            r6.mo71636e(r7, r10)
        L_0x00fb:
            ie0.j r9 = r8.mo71633a(r7)
        L_0x00ff:
            if (r9 == 0) goto L_0x0111
            java.lang.String r6 = r9.field_username
            if (r6 == 0) goto L_0x010e
            int r6 = r6.length()
            if (r6 != 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r6 = 0
            goto L_0x010f
        L_0x010e:
            r6 = 1
        L_0x010f:
            if (r6 == 0) goto L_0x011f
        L_0x0111:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r3
            java.lang.String r3 = "MicroMsg.OpenIMKefuConversationLogic"
            java.lang.String r6 = "isKefuConversationExist contact invalid url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r5)
            if (r9 != 0) goto L_0x011f
            goto L_0x0135
        L_0x011f:
            java.lang.String r3 = r9.field_username
            if (r3 != 0) goto L_0x0125
            java.lang.String r3 = ""
        L_0x0125:
            boolean r4 = ie0.C46229w.m51531a(r3)
            goto L_0x0135
        L_0x012a:
            java.lang.String r3 = r14.f124103c
            java.lang.String r4 = "getRequest.kfUsername"
            gy3.C87412m.m108593f(r3, r4)
            boolean r4 = ie0.C46229w.m51531a(r3)
        L_0x0135:
            r1.f132703d = r4
            r0.f133867f = r1
        L_0x0139:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "alvinluo getOpenImKefuContact url: "
            r1.append(r3)
            if (r0 == 0) goto L_0x014c
            te3.f52 r3 = r0.f133865d
            if (r3 == 0) goto L_0x014c
            java.lang.String r3 = r3.f133301d
            goto L_0x014d
        L_0x014c:
            r3 = r2
        L_0x014d:
            r1.append(r3)
            java.lang.String r3 = ", username: "
            r1.append(r3)
            if (r0 == 0) goto L_0x015e
            te3.f52 r3 = r0.f133865d
            if (r3 == 0) goto L_0x015e
            java.lang.String r3 = r3.f133302e
            goto L_0x015f
        L_0x015e:
            r3 = r2
        L_0x015f:
            r1.append(r3)
            java.lang.String r3 = ", getContactScene: "
            r1.append(r3)
            int r3 = r14.f124101a
            r1.append(r3)
            java.lang.String r3 = ", hasChatRecord: "
            r1.append(r3)
            if (r0 == 0) goto L_0x017e
            te3.e52 r0 = r0.f133867f
            if (r0 == 0) goto L_0x017e
            int r0 = r0.f132703d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x017f
        L_0x017e:
            r0 = r2
        L_0x017f:
            r1.append(r0)
            java.lang.String r0 = " spanContext:"
            r1.append(r0)
            byte[] r14 = r14.f124106f
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            java.lang.String r0 = "MicroMsg.NetSceneGetOpenIMKefuContact"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r14)
            r13.f125258e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je0.C46493o.<init>(he0.p):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125259f = nVar;
        return dispatch(gVar, this.f125260g, this);
    }

    public int getType() {
        return 4010;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r22, int r23, int r24, java.lang.String r25, com.tencent.p014mm.network.C114799u r26, byte[] r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r24
            r3 = r25
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_KEFU_ENC_USERNAME_STRING_SYNC
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "alvinluo getOpenImKefuContact onGYNetEnd errType: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ", errCode: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", errMsg: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", type: "
            r5.append(r6)
            r6 = 4010(0xfaa, float:5.619E-42)
            r5.append(r6)
            java.lang.String r6 = ", username: "
            r5.append(r6)
            he0.p r6 = r0.f125261h
            java.lang.String r6 = r6.f124107g
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.NetSceneGetOpenIMKefuContact"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            if (r1 != 0) goto L_0x02ac
            if (r2 == 0) goto L_0x004c
            goto L_0x02ac
        L_0x004c:
            ob0.c r5 = r0.f125260g
            r7 = 0
            if (r5 == 0) goto L_0x0056
            ob0.c$d r5 = r5.f127056b
            pe3.a r5 = r5.f127083a
            goto L_0x0057
        L_0x0056:
            r5 = r7
        L_0x0057:
            te3.h52 r5 = (te3.C49661h52) r5
            r0.f125258e = r5
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            if (r5 == 0) goto L_0x006f
            te3.e73 r5 = r5.f134450d
            if (r5 == 0) goto L_0x006f
            te3.j73 r5 = r5.f132764r
            if (r5 == 0) goto L_0x006f
            long r10 = r5.f135910d
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            goto L_0x0070
        L_0x006f:
            r5 = r7
        L_0x0070:
            r10 = 0
            r9[r10] = r5
            te3.h52 r5 = r0.f125258e
            if (r5 == 0) goto L_0x007e
            int r5 = r5.f134451e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x007f
        L_0x007e:
            r5 = r7
        L_0x007f:
            r11 = 1
            r9[r11] = r5
            java.lang.String r5 = "alvinluo getOpenImKefuContact resp.setting flag: %s, confirmType: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r9)
            te3.h52 r5 = r0.f125258e
            if (r5 == 0) goto L_0x00c4
            te3.h73 r5 = r5.f134453g
            if (r5 == 0) goto L_0x00c4
            java.lang.String r5 = r5.f134476d
            if (r5 == 0) goto L_0x00c4
            int r9 = r5.length()
            if (r9 <= 0) goto L_0x009b
            r9 = 1
            goto L_0x009c
        L_0x009b:
            r9 = 0
        L_0x009c:
            if (r9 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r5 = r7
        L_0x00a0:
            if (r5 == 0) goto L_0x00c4
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            r9.mo119677K(r4, r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "getOpenImKefuContact encUserName = "
            r9.append(r12)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x00c5
        L_0x00c4:
            r5 = r7
        L_0x00c5:
            if (r5 != 0) goto L_0x00d7
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            r5.mo119677K(r4, r7)
            java.lang.String r4 = "getOpenImKefuContact encUserName is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
        L_0x00d7:
            ie0.p r4 = ie0.C46225p.f124603a
            he0.p r5 = r0.f125261h
            java.lang.String r5 = r5.f124102b
            te3.h52 r9 = r0.f125258e
            if (r9 == 0) goto L_0x00e4
            te3.e73 r9 = r9.f134450d
            goto L_0x00e5
        L_0x00e4:
            r9 = r7
        L_0x00e5:
            java.lang.String r12 = ""
            if (r9 != 0) goto L_0x00ec
            r13 = r7
            goto L_0x01aa
        L_0x00ec:
            java.lang.String r13 = r9.f132753d
            ie0.j r13 = ie0.C46225p.m51524b(r13)
            if (r13 != 0) goto L_0x00f9
            ie0.j r13 = new ie0.j
            r13.<init>()
        L_0x00f9:
            java.lang.String r14 = r9.f132753d
            r13.field_username = r14
            java.lang.String r14 = r9.f132754e
            r13.field_nickname = r14
            java.lang.String r14 = r9.f132755f
            r13.field_bigHeadImg = r14
            java.lang.String r14 = r9.f132756g
            r13.field_smallHeadImg = r14
            java.lang.String r14 = r9.f132757h
            r13.field_nicknamePyInit = r14
            java.lang.String r14 = r9.f132758i
            r13.field_nicknamePyQuanPin = r14
            java.lang.String r14 = r9.f132759j
            r13.field_openImAppId = r14
            java.lang.String r14 = r9.f132760n
            r13.field_openImDescWordingId = r14
            int r14 = r9.f132761o
            r13.field_source = r14
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r15 = (int) r14
            r13.field_checkTime = r15
            te3.b73 r14 = r9.f132762p
            if (r14 == 0) goto L_0x012c
            java.lang.String r15 = r14.f130996e
            if (r15 != 0) goto L_0x012d
        L_0x012c:
            r15 = r12
        L_0x012d:
            r13.field_customInfoDetail = r15
            if (r14 == 0) goto L_0x0134
            int r14 = r14.f130995d
            goto L_0x0135
        L_0x0134:
            r14 = 0
        L_0x0135:
            r13.field_customInfoDetailVisible = r14
            java.lang.String r14 = r9.f132763q
            if (r14 != 0) goto L_0x013c
            r14 = r12
        L_0x013c:
            r13.field_ticket = r14
            te3.j73 r14 = r9.f132764r
            if (r14 == 0) goto L_0x0145
            long r14 = r14.f135910d
            goto L_0x0147
        L_0x0145:
            r14 = 0
        L_0x0147:
            r13.field_type = r14
            java.lang.String r14 = r9.f132765s
            if (r14 != 0) goto L_0x014e
            r14 = r12
        L_0x014e:
            r13.field_finderUsername = r14
            java.lang.String r14 = r9.f132753d
            if (r14 == 0) goto L_0x015d
            int r14 = r14.length()
            if (r14 != 0) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            r14 = 0
            goto L_0x015e
        L_0x015d:
            r14 = 1
        L_0x015e:
            r14 = r14 ^ r11
            r13.f124590Y = r14
            te3.j73 r9 = r9.f132764r
            long r14 = r9.f135910d
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            long r18 = r14 & r16
            int r20 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r20 != 0) goto L_0x0172
            r7 = 1
            goto L_0x0173
        L_0x0172:
            r7 = 0
        L_0x0173:
            r13.field_needReport = r7
            r16 = 4294967296(0x100000000, double:2.121995791E-314)
            long r14 = r14 & r16
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x0182
            r7 = 1
            goto L_0x0183
        L_0x0182:
            r7 = 0
        L_0x0183:
            r13.field_hasSetReport = r7
            te3.mr2 r7 = r9.f135911e
            if (r7 == 0) goto L_0x018d
            java.lang.String r7 = r7.f138170e
            if (r7 != 0) goto L_0x0190
        L_0x018d:
            java.lang.String r7 = "wgs84"
        L_0x0190:
            r13.field_locationType = r7
            if (r5 == 0) goto L_0x01a1
            int r7 = r5.length()
            if (r7 <= 0) goto L_0x019c
            r7 = 1
            goto L_0x019d
        L_0x019c:
            r7 = 0
        L_0x019d:
            if (r7 != r11) goto L_0x01a1
            r7 = 1
            goto L_0x01a2
        L_0x01a1:
            r7 = 0
        L_0x01a2:
            if (r7 == 0) goto L_0x01aa
            java.lang.String r4 = r4.mo71635d(r5)
            r13.field_kfUrl = r4
        L_0x01aa:
            r0.f125257d = r13
            r4 = 3
            if (r13 == 0) goto L_0x028a
            if (r13 != 0) goto L_0x01b3
            goto L_0x02a3
        L_0x01b3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "alvinluo processGetContact openImKefuContact "
            r5.append(r6)
            java.lang.String r6 = r13.mo71632l2()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.OpenIMKefuContactLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            ie0.C46225p.m51525c(r13)
            java.lang.String r5 = r13.field_username
            com.tencent.mm.modelavatar.o r7 = com.tencent.p014mm.modelavatar.C68102u.zx0()
            com.tencent.mm.modelavatar.n r7 = r7.mo93607Lo(r5)
            if (r7 == 0) goto L_0x01ef
            java.lang.String r12 = r7.mo93594c()
            java.lang.String r9 = "oldImgFlag.bigUrl"
            gy3.C87412m.m108593f(r12, r9)
            java.lang.String r7 = r7.mo93597f()
            java.lang.String r9 = "oldImgFlag.smallUrl"
            gy3.C87412m.m108593f(r7, r9)
            goto L_0x01f0
        L_0x01ef:
            r7 = r12
        L_0x01f0:
            com.tencent.mm.modelavatar.n r9 = new com.tencent.mm.modelavatar.n
            r9.<init>()
            r14 = -1
            r9.f195736i = r14
            r9.f195728a = r5
            java.lang.String r14 = r13.field_smallHeadImg
            r9.f195731d = r14
            java.lang.String r14 = r13.field_bigHeadImg
            r9.f195732e = r14
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r14 = r9.mo93598g()
            r4[r10] = r14
            java.lang.String r14 = r9.mo93594c()
            r4[r11] = r14
            java.lang.String r14 = r9.mo93597f()
            r4[r8] = r14
            java.lang.String r8 = "dealWithAvatarFromGetContactResp contact %s b[%s] s[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r4)
            java.lang.String r4 = r9.mo93594c()
            boolean r4 = gy3.C87412m.m108589b(r4, r12)
            if (r4 != 0) goto L_0x022e
            com.tencent.mm.modelavatar.AvatarStorage r4 = com.tencent.p014mm.modelavatar.C68102u.wx0()
            r4.mo93566o(r5, r11)
            r4 = 1
            goto L_0x022f
        L_0x022e:
            r4 = 0
        L_0x022f:
            java.lang.String r6 = r9.mo93597f()
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 != 0) goto L_0x0241
            com.tencent.mm.modelavatar.AvatarStorage r4 = com.tencent.p014mm.modelavatar.C68102u.wx0()
            r4.mo93566o(r5, r10)
            r4 = 1
        L_0x0241:
            if (r4 == 0) goto L_0x0251
            com.tencent.mm.modelavatar.o r4 = com.tencent.p014mm.modelavatar.C68102u.zx0()
            r4.mo93608Yt(r9)
            com.tencent.mm.modelavatar.g r4 = com.tencent.p014mm.modelavatar.C68102u.vx0()
            r4.mo93582i(r5)
        L_0x0251:
            java.lang.Class<he0.j> r4 = he0.C76158j.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            he0.j r4 = (he0.C76158j) r4
            java.lang.String r5 = r13.field_openImAppId
            java.lang.String r6 = r13.field_openImDescWordingId
            r4.ym0(r5, r6)
            java.lang.String r4 = r13.field_username
            if (r4 == 0) goto L_0x026a
            int r4 = r4.length()
            if (r4 != 0) goto L_0x026b
        L_0x026a:
            r10 = 1
        L_0x026b:
            if (r10 != 0) goto L_0x02a3
            re0.g r4 = new re0.g
            r4.<init>()
            java.lang.String r5 = r13.field_username
            r4.field_openIMUsername = r5
            java.lang.String r5 = r13.field_finderUsername
            r4.field_finder_username = r5
            java.lang.Class<ge0.b> r5 = ge0.C32415b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ge0.b r5 = (ge0.C32415b) r5
            re0.h r5 = r5.zx0()
            r5.replace(r4)
            goto L_0x02a3
        L_0x028a:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            he0.p r5 = r0.f125261h
            java.lang.String r5 = r5.f124102b
            r4[r10] = r5
            te3.h52 r5 = r0.f125258e
            r4[r11] = r5
            if (r5 == 0) goto L_0x029b
            te3.e73 r7 = r5.f134450d
            goto L_0x029c
        L_0x029b:
            r7 = 0
        L_0x029c:
            r4[r8] = r7
            java.lang.String r5 = "[-] openImKfContact is null. url:%s, getContactResp:%s, getContactResp?.contact:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r5, r4)
        L_0x02a3:
            ob0.n r4 = r0.f125259f
            gy3.C87412m.m108591d(r4)
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x02ac:
            ob0.n r4 = r0.f125259f
            gy3.C87412m.m108591d(r4)
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je0.C46493o.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
