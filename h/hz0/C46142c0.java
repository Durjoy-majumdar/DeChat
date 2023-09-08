package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49911ix1;
import te3.C50048jx1;
import te3.C50569no;
import te3.C52327zy3;

/* renamed from: hz0.c0 */
public class C46142c0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124345d;

    /* renamed from: e */
    public C11385n f124346e;

    /* renamed from: f */
    public boolean f124347f = false;

    /* renamed from: g */
    public C50569no f124348g;

    /* renamed from: h */
    public C52327zy3 f124349h;

    /* renamed from: i */
    public int f124350i;

    public C46142c0(double d, double d2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49911ix1();
        bVar.f127067b = new C50048jx1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcardslayout";
        bVar.f127069d = 1054;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124345d = a;
        C49911ix1 ix12 = (C49911ix1) a.f127055a.f127080a;
        ix12.f135731d = d;
        ix12.f135732e = d2;
        ix12.f135733f = i;
        ix12.f135734g = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, (Object) null);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124346e = nVar;
        return dispatch(gVar, this.f124345d, this);
    }

    public int getType() {
        return 1054;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x03a4 A[SYNTHETIC, Splitter:B:110:0x03a4] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r23, int r24, int r25, java.lang.String r26, com.tencent.p014mm.network.C114799u r27, byte[] r28) {
        /*
            r22 = this;
            r1 = r22
            r2 = r24
            r3 = r25
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_HAS_LOAD_NEW_ENTRANCE_BOOLEAN_SYNC
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_SECOND_ENTRANCE_STRING_SYNC
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_LIST_STRING_SYNC
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r24)
            r9 = 0
            r0[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r25)
            r10 = 1
            r0[r10] = r8
            java.lang.String r8 = "MicroMsg.NetSceneGetCardsLayout"
            java.lang.String r11 = "onGYNetEnd, errType = %d, errCode = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r0)
            ob0.c r0 = r1.f124345d
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            r11 = r0
            te3.jx1 r11 = (te3.C50048jx1) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "json:"
            r0.append(r12)
            java.lang.String r12 = r11.f136367d
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r8, r0)
            te3.no r0 = r11.f136369f
            r1.f124348g = r0
            if (r2 != 0) goto L_0x0447
            if (r3 != 0) goto L_0x0447
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC
            java.lang.String r13 = r11.f136368e
            r0.mo119677K(r12, r13)
            java.lang.String r0 = r11.f136367d
            long r12 = java.lang.System.currentTimeMillis()
            f40.o r14 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r14 = r14.mo121142i()
            com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARDLAYOUT_TESTDATA_STRING
            r7 = 0
            java.lang.Object r14 = r14.mo119685f(r15, r7)
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r15 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r14 = r0
        L_0x0079:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            java.lang.String r15 = "MicroMsg.CardStickyHelper"
            java.lang.String r7 = "first_list"
            java.lang.String r9 = "nearby_list"
            java.lang.String r10 = "member_card_list"
            java.lang.String r2 = "expiring_list"
            java.lang.String r3 = ""
            r16 = r4
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = "jsonRet null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r0)
            r17 = r5
            r18 = r8
            r19 = r11
            r4 = 0
            goto L_0x0199
        L_0x009b:
            te3.mx1 r4 = new te3.mx1
            r4.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x018f }
            r0.<init>(r14)     // Catch:{ JSONException -> 0x018f }
            r17 = r5
            java.lang.String r5 = "layout_buff"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ JSONException -> 0x0189 }
            r4.f138267e = r5     // Catch:{ JSONException -> 0x0189 }
            java.lang.String r5 = "list"
            org.json.JSONObject r0 = r0.getJSONObject(r5)     // Catch:{ JSONException -> 0x0189 }
            if (r0 == 0) goto L_0x0184
            te3.bq r5 = new te3.bq     // Catch:{ JSONException -> 0x0189 }
            r5.<init>()     // Catch:{ JSONException -> 0x0189 }
            r4.f138266d = r5     // Catch:{ JSONException -> 0x0189 }
            org.json.JSONObject r18 = r0.optJSONObject(r2)     // Catch:{ JSONException -> 0x0189 }
            r19 = r11
            te3.aq r11 = wz0.C53261k.m59696c(r18)     // Catch:{ JSONException -> 0x0180 }
            r5.f131251d = r11     // Catch:{ JSONException -> 0x0180 }
            te3.bq r5 = r4.f138266d     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r11 = r0.optJSONObject(r10)     // Catch:{ JSONException -> 0x0180 }
            te3.aq r11 = wz0.C53261k.m59696c(r11)     // Catch:{ JSONException -> 0x0180 }
            r5.f131252e = r11     // Catch:{ JSONException -> 0x0180 }
            te3.bq r5 = r4.f138266d     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r11 = r0.optJSONObject(r9)     // Catch:{ JSONException -> 0x0180 }
            te3.aq r11 = wz0.C53261k.m59696c(r11)     // Catch:{ JSONException -> 0x0180 }
            r5.f131253f = r11     // Catch:{ JSONException -> 0x0180 }
            te3.bq r5 = r4.f138266d     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r11 = "label_list"
            org.json.JSONObject r11 = r0.optJSONObject(r11)     // Catch:{ JSONException -> 0x0180 }
            te3.aq r11 = wz0.C53261k.m59696c(r11)     // Catch:{ JSONException -> 0x0180 }
            r5.f131254g = r11     // Catch:{ JSONException -> 0x0180 }
            te3.bq r5 = r4.f138266d     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r11 = r0.optJSONObject(r7)     // Catch:{ JSONException -> 0x0180 }
            te3.aq r11 = wz0.C53261k.m59696c(r11)     // Catch:{ JSONException -> 0x0180 }
            r5.f131255h = r11     // Catch:{ JSONException -> 0x0180 }
            te3.bq r5 = r4.f138266d     // Catch:{ JSONException -> 0x0180 }
            te3.aq r5 = r5.f131255h     // Catch:{ JSONException -> 0x0180 }
            if (r5 == 0) goto L_0x0144
            java.util.LinkedList<te3.zp> r5 = r5.f130719d     // Catch:{ JSONException -> 0x0180 }
            if (r5 == 0) goto L_0x0144
            int r5 = r5.size()     // Catch:{ JSONException -> 0x0180 }
            r11 = 1
            int r5 = r5 - r11
        L_0x010c:
            if (r5 < 0) goto L_0x0144
            te3.bq r11 = r4.f138266d     // Catch:{ JSONException -> 0x0180 }
            te3.aq r11 = r11.f131255h     // Catch:{ JSONException -> 0x0180 }
            java.util.LinkedList<te3.zp> r11 = r11.f130719d     // Catch:{ JSONException -> 0x0180 }
            java.lang.Object r11 = r11.get(r5)     // Catch:{ JSONException -> 0x0180 }
            te3.zp r11 = (te3.C52290zp) r11     // Catch:{ JSONException -> 0x0180 }
            r18 = r8
            java.lang.String r8 = r11.f146160d     // Catch:{ JSONException -> 0x017e }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ JSONException -> 0x017e }
            if (r8 != 0) goto L_0x013f
            hz0.c r8 = hz0.C46153l0.Gx0()     // Catch:{ JSONException -> 0x017e }
            java.lang.String r11 = r11.f146160d     // Catch:{ JSONException -> 0x017e }
            com.tencent.mm.plugin.card.model.CardInfo r8 = r8.mo71595Lo(r11)     // Catch:{ JSONException -> 0x017e }
            if (r8 == 0) goto L_0x013f
            boolean r8 = r8.mo23291o()     // Catch:{ JSONException -> 0x017e }
            if (r8 != 0) goto L_0x013f
            te3.bq r8 = r4.f138266d     // Catch:{ JSONException -> 0x017e }
            te3.aq r8 = r8.f131255h     // Catch:{ JSONException -> 0x017e }
            java.util.LinkedList<te3.zp> r8 = r8.f130719d     // Catch:{ JSONException -> 0x017e }
            r8.remove(r5)     // Catch:{ JSONException -> 0x017e }
        L_0x013f:
            int r5 = r5 + -1
            r8 = r18
            goto L_0x010c
        L_0x0144:
            r18 = r8
            java.lang.String r5 = "red_dot_wording"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ JSONException -> 0x017e }
            r4.f138268f = r5     // Catch:{ JSONException -> 0x017e }
            java.lang.String r5 = "show_red_dot"
            r8 = 0
            int r5 = r0.optInt(r5, r8)     // Catch:{ JSONException -> 0x017e }
            r8 = 1
            if (r5 != r8) goto L_0x015c
            r5 = 1
            goto L_0x015d
        L_0x015c:
            r5 = 0
        L_0x015d:
            r4.f138269g = r5     // Catch:{ JSONException -> 0x017e }
            java.lang.String r5 = "title"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ JSONException -> 0x017e }
            if (r5 != 0) goto L_0x0169
            r5 = r3
        L_0x0169:
            gz0.f r8 = hz0.C46153l0.yx0()     // Catch:{ JSONException -> 0x017e }
            java.lang.String r11 = "key_card_entrance_tips"
            r8.mo71383b(r11, r5)     // Catch:{ JSONException -> 0x017e }
            java.lang.String r5 = "top_scene"
            r8 = 100
            int r0 = r0.optInt(r5, r8)     // Catch:{ JSONException -> 0x017e }
            r4.f138270h = r0     // Catch:{ JSONException -> 0x017e }
            goto L_0x0199
        L_0x017e:
            r0 = move-exception
            goto L_0x0193
        L_0x0180:
            r0 = move-exception
            r18 = r8
            goto L_0x0193
        L_0x0184:
            r18 = r8
            r19 = r11
            goto L_0x0199
        L_0x0189:
            r0 = move-exception
        L_0x018a:
            r18 = r8
            r19 = r11
            goto L_0x0193
        L_0x018f:
            r0 = move-exception
            r17 = r5
            goto L_0x018a
        L_0x0193:
            r5 = 0
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r3, r8)
        L_0x0199:
            hz0.c r0 = hz0.C46153l0.Gx0()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f124344d
            java.lang.String r5 = "UserCardInfo"
            java.lang.String r8 = "update UserCardInfo set stickyIndex=0, stickyEndTime=0 , label_wording='' where stickyIndex>0"
            r0.execSQL(r5, r8)
            if (r4 != 0) goto L_0x01b1
            java.lang.String r0 = "[doUpdateStickyInfoLogic] resp null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r0)
            r5 = 0
            goto L_0x039c
        L_0x01b1:
            te3.bq r0 = r4.f138266d
            if (r0 == 0) goto L_0x031a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r0.put(r2, r8)
            r0.put(r10, r8)
            r5 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r0.put(r9, r8)
            r8 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r7, r8)
            int r8 = r4.f138270h
            r11 = 4
            r15 = 100
            if (r8 != r15) goto L_0x01e4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r0.put(r2, r8)
            goto L_0x01fb
        L_0x01e4:
            r15 = 102(0x66, float:1.43E-43)
            if (r8 != r15) goto L_0x01f0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r0.put(r10, r8)
            goto L_0x01fb
        L_0x01f0:
            r15 = 101(0x65, float:1.42E-43)
            if (r8 != r15) goto L_0x01fb
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r0.put(r9, r8)
        L_0x01fb:
            f40.o r8 = f40.C86709a0.m107535s()
            zh3.f r8 = r8.f251811i
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            r20 = r12
            long r11 = r15.getId()
            long r11 = r8.beginTransaction(r11)
            te3.bq r8 = r4.f138266d
            te3.aq r8 = r8.f131251d
            r13 = 100000(0x186a0, float:1.4013E-40)
            if (r8 == 0) goto L_0x0246
            java.util.LinkedList<te3.zp> r8 = r8.f130719d
            if (r8 == 0) goto L_0x0246
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0246
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = r2 * r13
            int r2 = r2 + r5
            te3.bq r5 = r4.f138266d
            te3.aq r5 = r5.f131251d
            java.util.LinkedList<te3.zp> r5 = r5.f130719d
            wz0.C53261k.m59697d(r5, r2)
            te3.bq r2 = r4.f138266d
            te3.aq r2 = r2.f131251d
            java.util.LinkedList<te3.zp> r2 = r2.f130719d
            int r2 = r2.size()
            r5 = 0
            int r2 = r2 + r5
            r5 = 1
            goto L_0x0248
        L_0x0246:
            r2 = 0
            r5 = 0
        L_0x0248:
            te3.bq r8 = r4.f138266d
            te3.aq r8 = r8.f131252e
            if (r8 == 0) goto L_0x027b
            java.util.LinkedList<te3.zp> r8 = r8.f130719d
            if (r8 == 0) goto L_0x027b
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x027b
            java.lang.Object r5 = r0.get(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r5 * r13
            r8 = 2
            int r5 = r5 + r8
            te3.bq r8 = r4.f138266d
            te3.aq r8 = r8.f131252e
            java.util.LinkedList<te3.zp> r8 = r8.f130719d
            wz0.C53261k.m59697d(r8, r5)
            te3.bq r5 = r4.f138266d
            te3.aq r5 = r5.f131252e
            java.util.LinkedList<te3.zp> r5 = r5.f130719d
            int r5 = r5.size()
            int r2 = r2 + r5
            r5 = 1
        L_0x027b:
            te3.bq r8 = r4.f138266d
            te3.aq r8 = r8.f131253f
            if (r8 == 0) goto L_0x02ae
            java.util.LinkedList<te3.zp> r8 = r8.f130719d
            if (r8 == 0) goto L_0x02ae
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x02ae
            java.lang.Object r5 = r0.get(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r5 * r13
            r8 = 1
            int r5 = r5 + r8
            te3.bq r8 = r4.f138266d
            te3.aq r8 = r8.f131253f
            java.util.LinkedList<te3.zp> r8 = r8.f130719d
            wz0.C53261k.m59697d(r8, r5)
            te3.bq r5 = r4.f138266d
            te3.aq r5 = r5.f131253f
            java.util.LinkedList<te3.zp> r5 = r5.f130719d
            int r5 = r5.size()
            int r2 = r2 + r5
            r5 = 1
        L_0x02ae:
            te3.bq r8 = r4.f138266d
            te3.aq r8 = r8.f131254g
            if (r8 == 0) goto L_0x02d4
            java.util.LinkedList<te3.zp> r8 = r8.f130719d
            if (r8 == 0) goto L_0x02d4
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x02d4
            te3.bq r5 = r4.f138266d
            te3.aq r5 = r5.f131254g
            java.util.LinkedList<te3.zp> r5 = r5.f130719d
            int r5 = r5.size()
            int r2 = r2 + r5
            te3.bq r5 = r4.f138266d
            te3.aq r5 = r5.f131254g
            java.util.LinkedList<te3.zp> r5 = r5.f130719d
            r8 = 0
            wz0.C53261k.m59698e(r5, r8)
            r5 = 1
        L_0x02d4:
            te3.bq r8 = r4.f138266d
            te3.aq r8 = r8.f131255h
            if (r8 == 0) goto L_0x0310
            java.util.LinkedList<te3.zp> r8 = r8.f130719d
            if (r8 == 0) goto L_0x0310
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0310
            java.lang.Object r0 = r0.get(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 * r13
            r5 = 4
            int r0 = r0 + r5
            te3.bq r5 = r4.f138266d
            te3.aq r5 = r5.f131255h
            java.util.LinkedList<te3.zp> r5 = r5.f130719d
            wz0.C53261k.m59697d(r5, r0)
            te3.bq r5 = r4.f138266d
            te3.aq r5 = r5.f131255h
            java.util.LinkedList<te3.zp> r5 = r5.f130719d
            wz0.C53261k.m59698e(r5, r0)
            te3.bq r0 = r4.f138266d
            te3.aq r0 = r0.f131255h
            java.util.LinkedList<te3.zp> r0 = r0.f130719d
            int r0 = r0.size()
            int r2 = r2 + r0
            r5 = 1
        L_0x0310:
            f40.o r0 = f40.C86709a0.m107535s()
            zh3.f r0 = r0.f251811i
            r0.endTransaction(r11)
            goto L_0x031e
        L_0x031a:
            r20 = r12
            r2 = 0
            r5 = 0
        L_0x031e:
            gz0.f r0 = hz0.C46153l0.yx0()
            java.lang.String r7 = "key_get_card_layout_resp"
            r0.mo71383b(r7, r4)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_GET_LAYOUT_JSON_STRING_SYNC
            r0.mo119677K(r4, r14)
            if (r2 <= 0) goto L_0x039c
            long r7 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r4.<init>()
            r9 = 281(0x119, float:3.94E-43)
            r4.SetID(r9)
            r10 = 36
            r4.SetKey(r10)
            r10 = 1
            r4.SetValue(r10)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r10.<init>()
            r10.SetID(r9)
            r11 = 37
            r10.SetKey(r11)
            long r7 = r7 - r20
            int r8 = (int) r7
            long r11 = (long) r8
            r10.SetValue(r11)
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey
            r7.<init>()
            r7.SetID(r9)
            r11 = 38
            r7.SetKey(r11)
            long r11 = (long) r2
            r7.SetValue(r11)
            com.tencent.mars.smc.IDKey r11 = new com.tencent.mars.smc.IDKey
            r11.<init>()
            r11.SetID(r9)
            r9 = 40
            r11.SetKey(r9)
            int r8 = r8 / r2
            long r8 = (long) r8
            r11.SetValue(r8)
            r0.add(r4)
            r0.add(r10)
            r0.add(r7)
            r0.add(r11)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1
            r2.mo160124a(r0, r4)
        L_0x039c:
            r1.f124347f = r5
            te3.no r0 = r1.f124348g
            java.lang.String r2 = "ISO-8859-1"
            if (r0 == 0) goto L_0x03ca
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x03c0 }
            f40.o r4 = f40.C86709a0.m107535s()     // Catch:{ IOException -> 0x03c0 }
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()     // Catch:{ IOException -> 0x03c0 }
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x03c0 }
            int r7 = r0.length     // Catch:{ IOException -> 0x03c0 }
            r8 = 0
            r5.<init>(r0, r8, r7, r2)     // Catch:{ IOException -> 0x03c0 }
            r4.mo119677K(r6, r5)     // Catch:{ IOException -> 0x03c0 }
            r7 = r18
            r5 = r19
            r4 = 0
            goto L_0x03da
        L_0x03c0:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r7 = r18
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r3, r5)
            goto L_0x03d8
        L_0x03ca:
            r7 = r18
            r4 = 0
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119677K(r6, r3)
        L_0x03d8:
            r5 = r19
        L_0x03da:
            int r0 = r5.f136370g
            r1.f124350i = r0
            if (r0 >= 0) goto L_0x03e2
            r1.f124350i = r4
        L_0x03e2:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_CARD_NUM_INT_SYNC
            int r6 = r1.f124350i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.mo119677K(r4, r6)
            te3.zy3 r0 = r5.f136371h
            if (r0 == 0) goto L_0x042b
            r1.f124349h = r0
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0414 }
            f40.o r4 = f40.C86709a0.m107535s()     // Catch:{ IOException -> 0x0414 }
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()     // Catch:{ IOException -> 0x0414 }
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x0414 }
            int r6 = r0.length     // Catch:{ IOException -> 0x0414 }
            r8 = 0
            r5.<init>(r0, r8, r6, r2)     // Catch:{ IOException -> 0x0414 }
            r2 = r17
            r4.mo119677K(r2, r5)     // Catch:{ IOException -> 0x0414 }
            goto L_0x041b
        L_0x0414:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r3, r2)
        L_0x041b:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4 = r16
            r0.mo119677K(r4, r2)
            goto L_0x0447
        L_0x042b:
            r4 = r16
            r2 = r17
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119677K(r2, r3)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo119677K(r4, r2)
        L_0x0447:
            ob0.n r0 = r1.f124346e
            r2 = r24
            r3 = r25
            r4 = r26
            r0.onSceneEnd(r2, r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hz0.C46142c0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
