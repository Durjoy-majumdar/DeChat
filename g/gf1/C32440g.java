package gf1;

import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C31935j1;
import f62.C75700k0;
import gy3.C8479f0;
import gy3.C87412m;
import ig1.C33320g;
import java.util.Map;
import ob0.C35136m;
import p165hr.C60106t;
import p687sr.C64153e;
import sf0.C48374j0;

/* renamed from: gf1.g */
public final class C32440g implements C31935j1 {

    /* renamed from: d */
    public final String f86020d = "FinderLiveNotifyMsgInterceptor";

    /* renamed from: gf1.g$a */
    public static final class C32441a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map<String, String> f86021d;

        /* renamed from: e */
        public final /* synthetic */ int f86022e;

        /* renamed from: f */
        public final /* synthetic */ String f86023f;

        /* renamed from: g */
        public final /* synthetic */ String f86024g;

        /* renamed from: h */
        public final /* synthetic */ String f86025h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<String> f86026i;

        /* renamed from: j */
        public final /* synthetic */ C32440g f86027j;

        public C32441a(Map<String, String> map, int i, String str, String str2, String str3, C8479f0<String> f0Var, C32440g gVar) {
            this.f86021d = map;
            this.f86022e = i;
            this.f86023f = str;
            this.f86024g = str2;
            this.f86025h = str3;
            this.f86026i = f0Var;
            this.f86027j = gVar;
        }

        public final void run() {
            C32440g gVar;
            Class cls = C64153e.class;
            String str = "userIcon";
            String nullAsNil = Util.nullAsNil(this.f86021d.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.force_push_info"));
            C87412m.m108593f(nullAsNil, LocaleUtil.ITALIAN);
            if ((nullAsNil.length() > 0 ? nullAsNil : null) != null) {
                int i = this.f86022e;
                String str2 = this.f86023f;
                String str3 = this.f86024g;
                String str4 = this.f86025h;
                C8479f0<String> f0Var = this.f86026i;
                C32440g gVar2 = this.f86027j;
                if (i == 1) {
                    try {
                        C32440g gVar3 = str;
                        C104289g gVar4 = new C104289g(nullAsNil);
                        String optString = gVar4.optString("description");
                        gVar4.optString("expiredTime");
                        C104289g gVar5 = new C104289g(gVar4.optString("extinfo"));
                        String optString2 = gVar5.optString("auth_icon_url");
                        String str5 = optString2 == null ? "" : optString2;
                        String optString3 = gVar5.optString("nickname");
                        String str6 = optString3 == null ? "" : optString3;
                        String optString4 = gVar5.optString("notify_wording");
                        if (optString4 == null) {
                            optString4 = "";
                        }
                        String optString5 = gVar5.optString("start_time");
                        String optString6 = gVar4.optString("subject");
                        String str7 = optString6 == null ? "" : optString6;
                        String optString7 = gVar4.optString("forcePushId");
                        String optString8 = gVar4.optString(str);
                        String optString9 = gVar4.optString("userName");
                        C64153e eVar = (C64153e) C86312j.m106911c(cls);
                        C87412m.m108593f(optString7, "forcePushId");
                        C87412m.m108593f(optString8, str);
                        C87412m.m108593f(optString, "dec");
                        C87412m.m108593f(str2, "feedId");
                        C87412m.m108593f(str3, "liveId");
                        C87412m.m108593f(str4, "nonceId");
                        gVar3 = gVar2;
                        try {
                            ((C64153e) C86312j.m106911c(cls)).mo88363mO(eVar.mo88360bj(optString7, optString8, str6, optString, str2, str3, str4, optString4, str5, str7, optString9, (String) f0Var.f27484d));
                        } catch (Exception e) {
                            e = e;
                            gVar = gVar3;
                            String str8 = gVar.f86020d;
                            Log.m105924i(str8, "force notify exception:" + e.getMessage());
                        }
                    } catch (Exception e2) {
                        e = e2;
                        gVar = gVar2;
                        String str82 = gVar.f86020d;
                        Log.m105924i(str82, "force notify exception:" + e.getMessage());
                    }
                } else {
                    Log.m105924i(gVar2.f86020d, "dont show force notify,case live has end.");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e1, code lost:
        if (r0 == null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ef, code lost:
        r0 = r18;
     */
    /* renamed from: i4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58429i4(ob0.C35136m.C35137a r22, com.tencent.p014mm.storage.C72963f4 r23, java.util.Map<java.lang.String, java.lang.String> r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "addMsgInfo"
            gy3.C87412m.m108594g(r0, r3)
            gy3.C87412m.m108591d(r24)
            java.lang.String r3 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r3 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r5 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id"
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            java.lang.String r6 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.revoke_id"
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            java.lang.String r7 = ".msg.appmsg.extinfo.notifymsg.live_widget.status"
            java.lang.Object r7 = r2.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7)
            java.lang.String r8 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id"
            java.lang.Object r8 = r2.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r9 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.delivery_time"
            java.lang.Object r9 = r2.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r9)
            gy3.C87412m.m108591d(r23)
            long r11 = r23.getMsgId()
            java.lang.String r13 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.control_flag"
            java.lang.Object r13 = r2.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r13)
            java.lang.String r14 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.not_filter_by_live_id"
            java.lang.Object r14 = r2.get(r14)
            java.lang.String r15 = "1"
            boolean r14 = gy3.C87412m.m108589b(r14, r15)
            java.lang.Class<tf0.q1> r15 = tf0.C13887q1.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            tf0.q1 r15 = (tf0.C13887q1) r15
            r15.mo13321Mx(r1)
            te3.ll0 r15 = new te3.ll0
            r15.<init>()
            r16 = r5
            java.lang.Object r5 = r0.f94248g
            boolean r1 = r5 instanceof ob0.C35133k.C35134b
            if (r1 == 0) goto L_0x00bb
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.modelbase.IFunctionMessageExtension.FetchAddMsgParams"
            gy3.C87412m.m108592e(r5, r1)
            ob0.k$b r5 = (ob0.C35133k.C35134b) r5
            te3.ok r1 = r5.f94240a
            if (r1 == 0) goto L_0x00bb
            pe3.b r1 = r1.f139227e
            if (r1 == 0) goto L_0x00bb
            byte[] r1 = r1.mo123703f()     // Catch:{ IOException -> 0x00bb }
            r15.parseFrom(r1)     // Catch:{ IOException -> 0x00bb }
        L_0x00bb:
            java.util.LinkedList<te3.yq1> r1 = r15.f137499d
            java.util.Iterator r1 = r1.iterator()
        L_0x00c1:
            boolean r5 = r1.hasNext()
            java.lang.String r15 = ""
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r1.next()
            te3.yq1 r5 = (te3.C52154yq1) r5
            r17 = r14
            r18 = r15
            long r14 = r5.f145461e
            r19 = r1
            te3.j3 r1 = r0.f94242a
            long r0 = r1.f227638r
            int r20 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r20 != 0) goto L_0x00e4
            java.lang.String r0 = r5.f145463g
            if (r0 != 0) goto L_0x00f1
            goto L_0x00ef
        L_0x00e4:
            r0 = r22
            r14 = r17
            r1 = r19
            goto L_0x00c1
        L_0x00eb:
            r17 = r14
            r18 = r15
        L_0x00ef:
            r0 = r18
        L_0x00f1:
            java.lang.String r1 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.force_push_info"
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            gy3.f0 r14 = new gy3.f0
            r14.<init>()
            java.lang.String r5 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_id"
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r14.f27484d = r5
            java.lang.String r5 = "it"
            gy3.C87412m.m108593f(r1, r5)
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x011d
            r5 = 1
            goto L_0x011e
        L_0x011d:
            r5 = 0
        L_0x011e:
            if (r5 == 0) goto L_0x0122
            r5 = r1
            goto L_0x0123
        L_0x0122:
            r5 = 0
        L_0x0123:
            if (r5 == 0) goto L_0x0136
            c30.g r5 = new c30.g
            r5.<init>((java.lang.String) r1)
            java.lang.String r1 = "forcePushId"
            java.lang.String r1 = r5.optString(r1)
            java.lang.String r5 = "jsonObject.optString(\"forcePushId\")"
            gy3.C87412m.m108593f(r1, r5)
            goto L_0x0138
        L_0x0136:
            r1 = r18
        L_0x0138:
            java.lang.String r5 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.ctrlinfo_type"
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            java.lang.String r15 = ".msg.appmsg.extinfo.notifymsg.tipsinfo.by_pass_info"
            java.lang.Object r15 = r2.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)
            ig1.g r2 = new ig1.g
            r2.<init>()
            r20 = r14
            java.lang.String r14 = "revokeId"
            gy3.C87412m.m108593f(r6, r14)
            int r14 = r6.length()
            if (r14 <= 0) goto L_0x0168
            r14 = 1
            goto L_0x0169
        L_0x0168:
            r14 = 0
        L_0x0169:
            if (r14 == 0) goto L_0x016c
            goto L_0x0181
        L_0x016c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r14 = "fakeRevoid_"
            r6.append(r14)
            int r14 = eb0.C31543z5.m39455e()
            r6.append(r14)
            java.lang.String r6 = r6.toString()
        L_0x0181:
            r2.field_revokeId = r6
            r6 = 0
            r2.field_exposureStatus = r6
            r2.field_msgId = r11
            r2.field_liveStatus = r7
            java.nio.charset.Charset r6 = z04.C119027c.f356488a
            byte[] r0 = r0.getBytes(r6)
            java.lang.String r6 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r6)
            r2.field_businessBuf = r0
            r2.field_insertTime = r9
            r2.field_tipsId = r8
            r2.field_liveId = r4
            r2.field_controlFlag = r13
            r2.field_forcePushId = r1
            r2.field_ctrlInfoType = r5
            r2.field_bypInfo = r15
            r2.field_feedId = r3
            r6 = r20
            T r0 = r6.f27484d
            java.lang.String r0 = (java.lang.String) r0
            r2.field_noticeId = r0
            java.lang.Class<hr.t> r0 = p165hr.C60106t.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hr.t r0 = (p165hr.C60106t) r0
            ik1.j r0 = r0.Bx0()
            r5 = 1
            r8 = r17 ^ 1
            r0.getClass()
            if (r8 == 0) goto L_0x0206
            java.lang.String r5 = r2.field_liveId
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r9 == 0) goto L_0x01d2
            ig1.g r5 = new ig1.g
            r5.<init>()
            goto L_0x020c
        L_0x01d2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "select *, rowid from FinderLiveNotifyExposureInfo where liveId = '"
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = "'"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r10 = r0.f90385e
            r11 = 0
            android.database.Cursor r9 = r10.rawQuery(r9, r11)
            ig1.g r10 = new ig1.g
            r10.<init>()
            r10.field_liveId = r5
            if (r9 == 0) goto L_0x0204
            boolean r5 = r9.moveToFirst()
            if (r5 == 0) goto L_0x0201
            r10.convertFrom(r9)
        L_0x0201:
            r9.close()
        L_0x0204:
            r5 = r10
            goto L_0x020c
        L_0x0206:
            java.lang.String r5 = r2.field_revokeId
            ig1.g r5 = r0.mo59079Lo(r5)
        L_0x020c:
            if (r8 != 0) goto L_0x0212
            r8 = 1
            r5.field_exposureStatus = r8
            goto L_0x0213
        L_0x0212:
            r8 = 1
        L_0x0213:
            long r9 = r5.systemRowid
            r11 = -1
            java.lang.String r13 = "MicroMsg.FinderLiveNotifyExposureInfoStorage"
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x0269
            r9 = 0
            boolean r0 = r0.insertNotify(r2, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "onReceiveFinderNotify insert "
            r5.append(r10)
            r5.append(r0)
            java.lang.String r0 = " tipsId "
            r5.append(r0)
            java.lang.String r0 = r2.field_tipsId
            r5.append(r0)
            java.lang.String r0 = " liveID "
            r5.append(r0)
            java.lang.String r0 = r2.field_liveId
            r5.append(r0)
            java.lang.String r0 = " field_tipsId "
            r5.append(r0)
            java.lang.String r0 = r2.field_tipsId
            r5.append(r0)
            java.lang.String r0 = "field_revokeId "
            r5.append(r0)
            java.lang.String r0 = r2.field_revokeId
            r5.append(r0)
            java.lang.String r0 = " msgid "
            r5.append(r0)
            long r10 = r2.field_msgId
            r5.append(r10)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x028a
        L_0x0269:
            r9 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "onReceiveFinderNotify already insert msgId = "
            r0.append(r10)
            long r10 = r2.field_msgId
            r0.append(r10)
            java.lang.String r2 = " info.systemRowid "
            r0.append(r2)
            long r10 = r5.systemRowid
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
        L_0x028a:
            T r0 = r6.f27484d
            java.lang.String r2 = "noticeId"
            gy3.C87412m.m108593f(r0, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x029b
            r15 = 1
            goto L_0x029c
        L_0x029b:
            r15 = 0
        L_0x029c:
            if (r15 == 0) goto L_0x02b6
            java.lang.Class<bd2.d> r0 = bd2.C79690d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            bd2.d r0 = (bd2.C79690d) r0
            eb0.u2 r0 = r0.mo109806kA()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.model.IOnNewMsgNotify"
            gy3.C87412m.m108592e(r0, r2)
            eb0.c3 r0 = (eb0.C75568c3) r0
            r2 = r23
            r0.mo93204a(r2)
        L_0x02b6:
            r8 = r21
            java.lang.String r0 = r8.f86020d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "afterMsgInsert forcePushId:"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = ", noticeId:"
            r2.append(r1)
            T r1 = r6.f27484d
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            zt3.t r9 = zt3.C119157j.f356862d
            gf1.g$a r10 = new gf1.g$a
            r0 = r10
            r1 = r24
            r2 = r7
            r5 = r16
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            zt3.j r9 = (zt3.C119157j) r9
            r9.mo183870a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf1.C32440g.mo58429i4(ob0.m$a, com.tencent.mm.storage.f4, java.util.Map):void");
    }

    /* renamed from: q0 */
    public boolean mo58430q0(C35136m.C35137a aVar, C72963f4 f4Var, Map<String, String> map) {
        C87412m.m108594g(aVar, "addMsgInfo");
        if (f4Var != null) {
            f4Var.mo108749c3("notifymessage");
        }
        boolean z = false;
        if (map == null) {
            return false;
        }
        String nullAsNil = Util.nullAsNil(map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id"));
        String nullAsNil2 = Util.nullAsNil(map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.revoke_id"));
        int safeParseInt = Util.safeParseInt(Util.nullAsNil(map.get(".msg.appmsg.extinfo.notifymsg.live_widget.status")));
        String nullAsNil3 = Util.nullAsNil(map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.force_push_info"));
        C87412m.m108593f(nullAsNil3, LocaleUtil.ITALIAN);
        long optLong = (nullAsNil3.length() > 0 ? nullAsNil3 : null) != null ? new C104289g(nullAsNil3).optLong("expiredTime") : -1;
        if (optLong <= 0 || optLong >= ((long) C31543z5.m39455e())) {
            String str = this.f86020d;
            Log.m105924i(str, "liveStatus = " + safeParseInt + ",expiredTime = " + optLong);
            if (C87412m.m108589b(map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.not_filter_by_live_id"), "1")) {
                C33320g Lo = ((C60106t) C86312j.m106911c(C60106t.class)).Bx0().mo59079Lo(nullAsNil2);
                String str2 = this.f86020d;
                Log.m105924i(str2, "notFilterByLiveId," + nullAsNil + ' ' + nullAsNil2 + ' ' + Lo.systemRowid);
                return Lo.systemRowid == -1;
            }
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(C48374j0.m53718g(aVar.f94242a.f227628e), aVar.f94242a.f227638r);
            String str3 = this.f86020d;
            Log.m105924i(str3, "[FINDER_SERVICE_NOTIFY_FOLLOW_LIVE]  liveId " + nullAsNil + " revokeId " + nullAsNil2 + " info.systemRowid " + h302.systemRowid);
            if (h302.systemRowid == -1) {
                z = true;
            }
            if (!z) {
                Log.m105924i(this.f86020d, "[FINDER_SERVICE_NOTIFY_FOLLOW_LIVE]  this msg has been insert");
            }
            return z;
        }
        String str4 = this.f86020d;
        Log.m105924i(str4, "has expired, expiredTime = " + optLong);
        return false;
    }
}
