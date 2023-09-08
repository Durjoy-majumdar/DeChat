package com.tencent.p014mm.plugin.remittance.model;

import android.text.TextUtils;
import b63.C67175a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.xweb.util.WXWebReporter;
import fr3.C75790l;
import org.json.JSONObject;
import te3.C77965lu;

/* renamed from: com.tencent.mm.plugin.remittance.model.h0 */
public class C70587h0 extends C75790l implements C45119n {

    /* renamed from: A */
    public int f204071A;

    /* renamed from: B */
    public String f204072B = "";

    /* renamed from: C */
    public String f204073C = "";

    /* renamed from: D */
    public String f204074D;

    /* renamed from: E */
    public String f204075E;

    /* renamed from: F */
    public String f204076F;

    /* renamed from: G */
    public int f204077G;

    /* renamed from: H */
    public String f204078H;

    /* renamed from: I */
    public String f204079I;

    /* renamed from: J */
    public int f204080J;

    /* renamed from: K */
    public String f204081K;

    /* renamed from: L */
    public String f204082L;

    /* renamed from: M */
    public String f204083M;

    /* renamed from: N */
    public String f204084N;

    /* renamed from: P */
    public F2fDynamicStartPayEvent f204085P = null;

    /* renamed from: Q */
    public int f204086Q = 0;

    /* renamed from: R */
    public C77965lu f204087R;

    /* renamed from: S */
    public String f204088S = "";

    /* renamed from: T */
    public int f204089T;

    /* renamed from: U */
    public String f204090U;

    /* renamed from: V */
    public long f204091V;

    /* renamed from: W */
    public int f204092W = 0;

    /* renamed from: d */
    public String f204093d = null;

    /* renamed from: e */
    public int f204094e = 0;

    /* renamed from: f */
    public C70589b f204095f;

    /* renamed from: g */
    public C70588a f204096g;

    /* renamed from: h */
    public String f204097h = "";

    /* renamed from: i */
    public String f204098i;

    /* renamed from: j */
    public String f204099j;

    /* renamed from: n */
    public double f204100n;

    /* renamed from: o */
    public String f204101o;

    /* renamed from: p */
    public boolean f204102p;

    /* renamed from: q */
    public double f204103q;

    /* renamed from: r */
    public double f204104r;

    /* renamed from: s */
    public String f204105s;

    /* renamed from: t */
    public String f204106t;

    /* renamed from: u */
    public String f204107u;

    /* renamed from: v */
    public String f204108v;

    /* renamed from: w */
    public String f204109w;

    /* renamed from: x */
    public int f204110x;

    /* renamed from: y */
    public double f204111y = 0.0d;

    /* renamed from: z */
    public C67175a f204112z;

    /* renamed from: com.tencent.mm.plugin.remittance.model.h0$a */
    public static class C70588a {

        /* renamed from: a */
        public String f204113a;

        /* renamed from: b */
        public String f204114b;
    }

    /* renamed from: com.tencent.mm.plugin.remittance.model.h0$b */
    public static class C70589b {

        /* renamed from: a */
        public String f204115a;

        /* renamed from: b */
        public String f204116b;

        /* renamed from: c */
        public String f204117c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x024c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C70587h0(double r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, int r25, java.lang.String r26, int r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, int r44, java.lang.String r45, int r46, java.lang.String r47, java.lang.String r48) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r22
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r31
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r43
            r14 = r44
            r15 = r45
            r7 = r48
            r18.<init>()
            r6 = 0
            r1.f204093d = r6
            r6 = 0
            r1.f204094e = r6
            java.lang.String r6 = ""
            r1.f204097h = r6
            r4 = 0
            r1.f204111y = r4
            r1.f204072B = r6
            r1.f204073C = r6
            r4 = 0
            r1.f204085P = r4
            r4 = 0
            r1.f204086Q = r4
            r1.f204088S = r6
            r1.f204092W = r4
            r5 = 11
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r24)
            r5[r4] = r16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r33)
            r12 = 1
            r5[r12] = r4
            r4 = 2
            r5[r4] = r8
            r16 = 3
            r5[r16] = r9
            r16 = 4
            r5[r16] = r10
            r16 = 5
            r5[r16] = r11
            r16 = 6
            r5[r16] = r13
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            r16 = 7
            r5[r16] = r12
            r12 = 8
            r5[r12] = r15
            java.lang.Integer r12 = java.lang.Integer.valueOf(r46)
            r16 = 9
            r5[r16] = r12
            r12 = 10
            r5[r12] = r7
            java.lang.String r12 = "Micromsg.NetSceneTenpayRemittanceGen"
            java.lang.String r4 = "payScene: %s, channel: %s dynamicCodeUrl: %s mch_name: %s nickname: %s receiver_true_name %s placeorder_reserves: %s unpayType: %s cancel_outtradeno:%s cancel_reason:%s placeorderAttach:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r5)
            r1.f204111y = r2
            r4 = r24
            r1.f204071A = r4
            r1.f204088S = r0
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r6)
            java.lang.String r4 = r8.toString()
            java.lang.String r8 = "scene"
            r5.put(r8, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r8 = r25
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = "transfer_scene"
            r5.put(r8, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r16 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r16
            long r2 = java.lang.Math.round(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "fee"
            r5.put(r3, r2)
            java.lang.String r2 = "fee_type"
            r3 = r21
            r5.put(r2, r3)
            java.lang.String r2 = "receiver_name"
            r5.put(r2, r0)
            java.lang.String r0 = "receiver_openid"
            r2 = r34
            r5.put(r0, r2)
            java.lang.String r0 = "mask_truename"
            r2 = r23
            r5.put(r0, r2)
            java.lang.String r0 = "mch_name"
            r5.put(r0, r9)
            java.lang.String r0 = "nickname"
            r5.put(r0, r10)
            java.lang.String r0 = "receiver_true_name"
            r5.put(r0, r11)
            java.lang.String r0 = "1"
            r2 = r39
            r3 = 1
            if (r2 == 0) goto L_0x0121
            com.tencent.mm.autogen.events.F2fDynamicStartPayEvent$a r4 = r2.f193584d
            int r4 = r4.f193587c
            if (r4 != r3) goto L_0x0121
            r4 = r0
            goto L_0x0123
        L_0x0121:
            java.lang.String r4 = "0"
        L_0x0123:
            java.lang.String r8 = "dynamic_code_source"
            r5.put(r8, r4)
            java.lang.String r4 = "input_name"
            r8 = r40
            r5.put(r4, r8)
            java.lang.String r4 = "checkname_sign"
            r8 = r41
            r5.put(r4, r8)
            java.lang.String r4 = "truename_extend"
            r8 = r42
            r5.put(r4, r8)
            java.lang.String r4 = "placeorder_reserves"
            r5.put(r4, r13)
            java.lang.String r4 = "cancel_outtradeno"
            r5.put(r4, r15)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = "unpay_type"
            r5.put(r8, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r8 = r46
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = "cancel_reason"
            r5.put(r8, r4)
            java.lang.String r4 = "group_username"
            r8 = r47
            r5.put(r4, r8)
            java.lang.String r4 = "placeorder_attach"
            r5.put(r4, r7)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r47)
            if (r4 != 0) goto L_0x0198
            boolean r4 = eb0.C45628s0.m50735A(r47)
            java.lang.String r7 = "group_type"
            if (r4 == 0) goto L_0x0195
            java.lang.String r0 = "2"
            r5.put(r7, r0)
            goto L_0x0198
        L_0x0195:
            r5.put(r7, r0)
        L_0x0198:
            r1.f204085P = r2
            r2 = 32
            r4 = 33
            int r0 = r1.f204071A     // Catch:{ UnsupportedEncodingException -> 0x020a }
            java.lang.String r7 = "desc"
            java.lang.String r8 = "UTF-8"
            if (r0 == r4) goto L_0x01cb
            if (r0 != r2) goto L_0x01a9
            goto L_0x01cb
        L_0x01a9:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r26)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            if (r0 != 0) goto L_0x01b9
            r0 = r26
            java.lang.String r8 = p206nj.C117627q.m165909b(r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            r5.put(r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            goto L_0x01bb
        L_0x01b9:
            r0 = r26
        L_0x01bb:
            java.lang.String r7 = "desc_has_address"
            r8 = r30
            int r0 = r1.mo97248j1(r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            r5.put(r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            goto L_0x0217
        L_0x01cb:
            r0 = r26
            java.lang.String r9 = "f2f desc: %s, recvDesc: %s"
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ UnsupportedEncodingException -> 0x020a }
            r10 = 0
            r11[r10] = r0     // Catch:{ UnsupportedEncodingException -> 0x020a }
            r10 = r31
            r11[r3] = r10     // Catch:{ UnsupportedEncodingException -> 0x020a }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r9, r11)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r26)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            if (r9 != 0) goto L_0x01eb
            java.lang.String r9 = "f2f_payer_desc"
            java.lang.String r0 = p206nj.C117627q.m165909b(r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            r5.put(r9, r0)     // Catch:{ UnsupportedEncodingException -> 0x020a }
        L_0x01eb:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r31)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = p206nj.C117627q.m165909b(r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            r5.put(r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x020a }
        L_0x01f8:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r35)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            if (r0 != 0) goto L_0x0217
            java.lang.String r0 = "dynamic_code_url"
            r7 = r35
            java.lang.String r7 = p206nj.C117627q.m165909b(r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            r5.put(r0, r7)     // Catch:{ UnsupportedEncodingException -> 0x020a }
            goto L_0x0217
        L_0x020a:
            r0 = move-exception
            java.lang.String r7 = r0.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r9 = 0
            r8[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r7, r8)
        L_0x0217:
            java.lang.String r0 = "transfer_qrcode_id"
            r7 = r32
            r5.put(r0, r7)
            r7 = r25
            r8 = 2
            if (r7 == 0) goto L_0x0226
            if (r7 != r8) goto L_0x0278
        L_0x0226:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r7 = 147457(0x24001, float:2.06631E-40)
            r9 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r9)
            java.lang.Object r0 = r0.mo119684e(r7, r11)
            java.lang.Long r0 = (java.lang.Long) r0
            long r13 = r0.longValue()
            r15 = 16
            long r15 = r15 & r13
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x024c
            goto L_0x0256
        L_0x024c:
            r7 = 32
            long r7 = r7 & r13
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0255
            r8 = 1
            goto L_0x0256
        L_0x0255:
            r8 = 0
        L_0x0256:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "delay_confirm_flag"
            r5.put(r7, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r7 = 0
            r0[r7] = r3
            java.lang.String r3 = "delay flag: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r3, r0)
        L_0x0278:
            r1.setRequestData(r5)
            int r0 = r1.f204071A
            if (r0 == r2) goto L_0x0281
            if (r0 != r4) goto L_0x029f
        L_0x0281:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r33
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "channel"
            r0.put(r3, r2)
            r1.setWXRequestData(r0)
        L_0x029f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.model.C70587h0.<init>(double, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    public int getFuncId() {
        int i = this.f204071A;
        if (i == 32 || i == 33) {
            return 1582;
        }
        return WXWebReporter.WXWEB_IDKEY_FR_OFFICE_ID;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        int i = this.f204071A;
        return (i == 32 || i == 33) ? "/cgi-bin/mmpay-bin/f2fplaceorder" : "/cgi-bin/mmpay-bin/transferplaceorder";
    }

    /* renamed from: j1 */
    public final int mo97248j1(String str, String str2) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            for (int i = 0; i < str.length(); i++) {
                for (int i2 = 0; i2 < str2.length(); i2++) {
                    if (str.charAt(i) == str2.charAt(i2)) {
                        Log.m105925i("Micromsg.NetSceneTenpayRemittanceGen", "find equal char: %s, %s, %s", Character.valueOf(str.charAt(i)), Integer.valueOf(i), Integer.valueOf(i2));
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayRemittanceGen", "errCode " + i + " errMsg: " + str);
        if (i == 0 || i == 2) {
            if (jSONObject.has("used_fee")) {
                this.f204104r = jSONObject.optDouble("used_fee");
            } else {
                Log.m105920e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
            }
            if (jSONObject.has("retcode")) {
                this.f204092W = jSONObject.optInt("retcode", 0);
            }
            this.f204093d = jSONObject.optString("req_key");
            this.f204094e = jSONObject.optInt("tansfering_num", 0);
            this.f204098i = jSONObject.optString("transfer_interrupt_desc");
            this.f204099j = jSONObject.optString("appmsgcontent");
            this.f204101o = jSONObject.optString("transfer_interrupt_charge_desc");
            this.f204102p = jSONObject.optInt("is_show_charge") == 1;
            this.f204105s = jSONObject.optString("receiver_true_name");
            this.f204106t = jSONObject.optString("f2f_id", "");
            this.f204107u = jSONObject.optString("trans_id", "");
            this.f204108v = jSONObject.optString("extend_str", "");
            this.f204109w = jSONObject.optString("receiver_open_id", "");
            this.f204110x = jSONObject.optInt("amount", 0);
            this.f204074D = jSONObject.optString("transfer_id", "");
            this.f204075E = jSONObject.optString(FirebaseAnalytics.C113379b.TRANSACTION_ID, "");
            this.f204076F = jSONObject.optString("receiver_openid", "");
            if (Util.isNullOrNil(this.f204105s)) {
                Log.m105920e("Micromsg.NetSceneTenpayRemittanceGen", "receiver_true_name is null");
            }
            if (jSONObject.has("remain_fee")) {
                jSONObject.optDouble("remain_fee");
            } else {
                Log.m105920e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
            }
            if (jSONObject.has("exceed_fee")) {
                this.f204103q = jSONObject.optDouble("exceed_fee");
            } else {
                Log.m105920e("Micromsg.NetSceneTenpayRemittanceGen", "exceed_fee is null");
            }
            if (jSONObject.has("charge_fee")) {
                this.f204100n = jSONObject.optDouble("charge_fee");
            } else {
                Log.m105920e("Micromsg.NetSceneTenpayRemittanceGen", "charge_fee is null");
            }
            if (jSONObject.has("free_limit")) {
                jSONObject.optDouble("free_limit");
            } else {
                Log.m105920e("Micromsg.NetSceneTenpayRemittanceGen", "free_limit is null");
            }
            if (jSONObject.has("showmessage")) {
                Log.m105924i("Micromsg.NetSceneTenpayRemittanceGen", "has alert item");
                C67175a aVar = new C67175a();
                JSONObject optJSONObject = jSONObject.optJSONObject("showmessage");
                aVar.f192845b = optJSONObject.optString("left_button_wording");
                aVar.f192846c = optJSONObject.optString("right_button_wording");
                aVar.f192847d = optJSONObject.optString("right_button_url");
                this.f204112z = aVar;
                aVar.f192844a = str;
            }
            if (jSONObject.has("fee")) {
                this.f204072B = jSONObject.optString("fee");
            }
            if (jSONObject.has("double_check_wording")) {
                Log.m105924i("Micromsg.NetSceneTenpayRemittanceGen", "has fee, show alert");
                this.f204073C = jSONObject.optString("double_check_wording");
            }
            if (jSONObject.has("zaitu_message")) {
                Log.m105924i("Micromsg.NetSceneTenpayRemittanceGen", "has zaitu_message");
                C70589b bVar = new C70589b();
                JSONObject optJSONObject2 = jSONObject.optJSONObject("zaitu_message");
                bVar.f204115a = optJSONObject2.optString("wording");
                bVar.f204116b = optJSONObject2.optString("open_button");
                bVar.f204117c = optJSONObject2.optString("bill_url");
                Log.m105919d("Micromsg.NetSceneTenpayRemittanceGen", "parseZaituMessage() wording:%s open_button:%s bill_url:%s", Util.nullAsNil(bVar.f204115a), Util.nullAsNil(bVar.f204116b), Util.nullAsNil(bVar.f204117c));
                this.f204095f = bVar;
            }
            if (jSONObject.has("amount_reinput_page")) {
                Log.m105924i("Micromsg.NetSceneTenpayRemittanceGen", "has amount_reinput_page");
                C70588a aVar2 = new C70588a();
                JSONObject optJSONObject3 = jSONObject.optJSONObject("amount_reinput_page");
                aVar2.f204113a = optJSONObject3.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                aVar2.f204114b = optJSONObject3.optString("wording");
                this.f204096g = aVar2;
            }
            this.f204097h = jSONObject.optString("placeorder_attach");
            this.f204077G = jSONObject.optInt("scan_scene", 0);
            this.f204078H = jSONObject.optString("placeorder_suc_sign");
            this.f204079I = jSONObject.optString("pay_suc_extend");
            if (TextUtils.isEmpty(this.f204099j)) {
                Log.m105920e("Micromsg.NetSceneTenpayRemittanceGen", "appmsgcontent is null");
            }
            this.f204080J = jSONObject.optInt("get_dynamic_code_flag", 0);
            this.f204081K = jSONObject.optString("get_dynamic_code_sign", "");
            this.f204082L = jSONObject.optString("get_dynamic_code_extend", "");
            this.f204083M = jSONObject.optString("show_paying_wording", "");
            this.f204084N = jSONObject.optString("dynamic_code_spam_wording", "");
            this.f204086Q = jSONObject.optInt("need_checkname", 0);
            int optInt = jSONObject.optInt("return_to_session", 0);
            this.f204089T = optInt;
            Log.m105925i("Micromsg.NetSceneTenpayRemittanceGen", "return_to_session:%s", Integer.valueOf(optInt));
            JSONObject optJSONObject4 = jSONObject.optJSONObject("namemessage");
            if (optJSONObject4 != null) {
                C77965lu luVar = new C77965lu();
                this.f204087R = luVar;
                luVar.f227822d = optJSONObject4.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                this.f204087R.f227825g = optJSONObject4.optString("checkname_sign");
                this.f204087R.f227824f = optJSONObject4.optString("display_name");
                this.f204087R.f227823e = optJSONObject4.optString("wording");
                this.f204087R.f227826h = optJSONObject4.optInt("message_type", 0);
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("msg_check_info");
            if (optJSONObject5 != null) {
                this.f204091V = optJSONObject5.optLong("msg_check_sec", 0);
                this.f204090U = optJSONObject5.optString("msg_check_str", "");
            }
        }
    }

    public boolean shouldResolveJsonWhenError() {
        return true;
    }
}
