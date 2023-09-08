package com.tencent.p014mm.plugin.profile;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72979k3;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C116734h6;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fd0.C75743h;
import sf0.C77702q0;

/* renamed from: com.tencent.mm.plugin.profile.g */
public class C70142g {

    /* renamed from: com.tencent.mm.plugin.profile.g$a */
    public class C70143a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f202478d;

        /* renamed from: e */
        public final /* synthetic */ String f202479e;

        public C70143a(String str, String str2) {
            this.f202478d = str;
            this.f202479e = str2;
        }

        public void run() {
            boolean bF = C75743h.vx0().mo101171bF(this.f202478d, 1);
            if (bF) {
                Log.m105918d("MicroMsg.ProfileUtils", "fmsgConversation updateState succ, user = " + this.f202478d);
            } else {
                bF = C75743h.vx0().mo101171bF(this.f202479e, 1);
                Log.m105918d("MicroMsg.ProfileUtils", "fmsgConversation updateState succ, encryptUser = " + this.f202479e);
            }
            Log.m105924i("MicroMsg.ProfileUtils", "processModContact, update state(ADDED) FMessageConversation, ret = " + bF);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.g$b */
    public class C70144b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f202480d;

        /* renamed from: e */
        public final /* synthetic */ int f202481e;

        /* renamed from: f */
        public final /* synthetic */ String f202482f;

        /* renamed from: g */
        public final /* synthetic */ int f202483g;

        public C70144b(String str, int i, String str2, int i2) {
            this.f202480d = str;
            this.f202481e = i;
            this.f202482f = str2;
            this.f202483g = i2;
        }

        public void run() {
            String str;
            String str2;
            C72979k3 qq;
            C72985m3 bD;
            try {
                String str3 = this.f202480d;
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str3);
                if (z1Var.mo62927s3()) {
                    Log.m105925i("MicroMsg.ProfileUtils", "createSendMessage, iscontact, contactTmp.getUsername() = %s, contactTmp.getEncryptUsername() = %s.", z1Var.getUsername(), z1Var.mo73978v2());
                    C70142g.m82635g(z1Var.getUsername(), z1Var.mo73978v2());
                }
                C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(str3);
                String v2 = z1Var2.mo73978v2();
                String str4 = z1Var2.f149527Z0;
                int i = this.f202481e;
                if ((i == 2 || i == 3) && (bD = C75743h.wx0().mo101190bD(str3)) != null) {
                    str2 = bD.field_talker;
                    str = bD.field_encryptTalker;
                } else {
                    str = v2;
                    str2 = str3;
                }
                if (this.f202481e == 1) {
                    if (!C77702q0.m93719b(z1Var2.mo73978v2()) && z1Var2.mo73978v2().equals(str3) && (qq = C75743h.vx0().mo101174qq(z1Var2.mo73978v2())) != null && !C77702q0.m93719b(qq.field_talker) && !qq.field_talker.equals(str3)) {
                        str2 = qq.field_talker;
                    }
                    str = z1Var2.mo73978v2();
                }
                if (C77702q0.m93719b(str4)) {
                    C72985m3 bD2 = C75743h.wx0().mo101190bD(str2);
                    if (bD2 != null && !C77702q0.m93719b(bD2.field_msgContent)) {
                        C72963f4.C72971h ly02 = ((C72972g4) C97625j3.m125812b().mo105911z()).ly0(bD2.field_msgContent);
                        if (!C77702q0.m93719b(ly02.f212756t)) {
                            str4 = ly02.f212756t;
                            Log.m105925i("MicroMsg.ProfileUtils", "lastRecvFMsg, antiSpamTicket = %s.", str4);
                        }
                    }
                } else {
                    Log.m105925i("MicroMsg.ProfileUtils", "contact, antiSpamTicket = %s.", str4);
                }
                String str5 = this.f202482f;
                if (1 == this.f202481e && Util.isNullOrNil(str5)) {
                    str5 = MMApplicationContext.getContext().getString(C0966R.string.hbn);
                    Log.m105924i("MicroMsg.ProfileUtils", "reset verifyContentTmp");
                }
                Log.m105925i("MicroMsg.ProfileUtils", "createSendMessage, before change username talker = %s, talkerAddBySayHi = %s, targetTalker = %s.", str3, this.f202480d, str2);
                C72996z1 z1Var3 = C97625j3.m125812b().mo105907v().get(str3);
                if (z1Var3.mo62927s3()) {
                    str3 = z1Var3.getUsername();
                    str2 = z1Var3.getUsername();
                    Log.m105924i("MicroMsg.ProfileUtils", "createSendMessage, iscontact.");
                    z1Var2 = z1Var3;
                }
                Log.m105925i("MicroMsg.ProfileUtils", "createSendMessage, after change username talker = %s, talkerAddBySayHi = %s, targetTalker = %s.", str3, this.f202480d, str2);
                String format = String.format("<msg fromusername=\"%s\" encryptusername=\"%s\" fromnickname=\"%s\" content=\"%s\" scene=\"%s\" ticket=\"%s\"> </msg>", new Object[]{str2, str, Util.escapeStringForXml(z1Var2.mo62909j3()), Util.escapeStringForXml(str5), Integer.valueOf(this.f202483g), str4});
                Log.m105925i("MicroMsg.ProfileUtils", "createSendMessage, change username talker = %s, talkerAddBySayHi = %s, targetTalker = %s.", str3, this.f202480d, str2);
                C72985m3 m3Var = new C72985m3();
                m3Var.field_createTime = C75604z3.m90841m(str3, C31543z5.m39453c() / 1000);
                m3Var.field_isSend = 1;
                m3Var.field_msgContent = format;
                m3Var.field_talker = str2;
                m3Var.field_encryptTalker = str;
                m3Var.field_type = this.f202481e;
                boolean SE = C75743h.wx0().insert(m3Var);
                C72963f4.C72971h v = C72963f4.C72971h.m85668v(m3Var.field_msgContent);
                Log.m105925i("MicroMsg.ProfileUtils", "FMessageConversationStorage createSendMessage, insert fmsg, ret = %s, lastRecvFmsg  = %s, verify = %s, Content = %s, DisplayName = %s, fMessageMsgInfoType = %s, fmsgInfo.field_createTime = %s, sytime = %s， xmlContent = %s.", Boolean.valueOf(SE), "", v, v.f212742f, v.mo101038e(), Integer.valueOf(this.f202481e), Long.valueOf(m3Var.field_createTime), Long.valueOf(System.currentTimeMillis() / 1000), format);
                C72996z1 z1Var4 = C97625j3.m125812b().mo105907v().get(str3);
                if (z1Var4.mo62927s3()) {
                    Log.m105925i("MicroMsg.ProfileUtils", "createSendMessage, iscontact, contactTmp.getUsername() = %s, contactTmp.getEncryptUsername() = %s.", z1Var4.getUsername(), z1Var.mo73978v2());
                    C70142g.m82635g(z1Var4.getUsername(), z1Var4.mo73978v2());
                    C70142g.m82633e(z1Var4.getUsername(), m3Var);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ProfileUtils", "exception in createSendMessage : " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m82629a(String str, String str2, int i, int i2) {
        C86709a0.m107525e().postToWorker(new C70144b(str, i, str2, i2));
    }

    /* renamed from: b */
    public static String m82630b(Context context, String str) {
        if (C72996z1.m85805J5(str)) {
            return C45628s0.m50756U() ? context.getString(C0966R.string.f7995yp) : context.getString(C0966R.string.f7996yq);
        }
        if (WeChatBrands.AppInfo.current().isMainland()) {
            return context.getString(C0966R.string.f7993yn);
        }
        return TextUtils.isEmpty(str) ? false : str.equals(C75592q0.m90789s()) ? context.getString(C0966R.string.f7993yn) : context.getString(C0966R.string.f7994yo);
    }

    /* renamed from: c */
    public static String m82631c(String str, String str2) {
        return C72996z1.m85805J5(str) ? C45628s0.m50756U() ? "WeChat" : "Weixin" : (!WeChatBrands.AppInfo.current().isMainland() && C72996z1.m85805J5(str)) ? C116734h6.m164662r("OfficialAliasName") : str2;
    }

    /* renamed from: d */
    public static SpannableString m82632d(Context context, String str, SpannableString spannableString) {
        return C72996z1.m85805J5(str) ? C45628s0.m50756U() ? new SpannableString(context.getString(C0966R.string.f7256d)) : new SpannableString(context.getString(C0966R.string.f7257e)) : spannableString;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r8 = r6.f192525b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m82633e(java.lang.String r17, com.tencent.p014mm.storage.C72985m3 r18) {
        /*
            r0 = r17
            r1 = 1
            com.tencent.mm.storage.m3[] r2 = new com.tencent.p014mm.storage.C72985m3[r1]
            r3 = 0
            r2[r3] = r18
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ae3.b[] r4 = ae3.C67030b.m79191f(r4, r2)
            java.lang.String r5 = "MicroMsg.ProfileUtils"
            if (r4 == 0) goto L_0x019b
            int r6 = r4.length
            if (r6 != 0) goto L_0x0019
            goto L_0x019b
        L_0x0019:
            r6 = 0
            int r7 = r4.length
            if (r7 <= 0) goto L_0x001f
            r6 = r4[r3]
        L_0x001f:
            eb0.c r7 = eb0.C97625j3.m125812b()
            g62.l r7 = r7.mo105911z()
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            java.util.List r7 = r7.Hx0(r0, r1, r1)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r8 = r7.size()
            r9 = 2
            r10 = 6
            if (r8 <= 0) goto L_0x00c0
            java.lang.Object r8 = r7.get(r3)
            if (r8 == 0) goto L_0x00c0
            if (r6 == 0) goto L_0x00c0
            java.lang.Object r7 = r7.get(r3)
            com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
            int r8 = r7.mo108769t2()
            if (r8 != r1) goto L_0x006e
            long r11 = eb0.C31543z5.m39454d()
            long r13 = r7.getCreateTime()
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)
            r13 = 3000(0xbb8, double:1.482E-320)
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x006e
            java.lang.String r8 = r6.f192525b
            if (r8 == 0) goto L_0x006e
            java.lang.String r11 = r7.getContent()
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x006e
            r8 = 1
            goto L_0x006f
        L_0x006e:
            r8 = 0
        L_0x006f:
            r11 = 7
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r12 = r7.mo108769t2()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r3] = r12
            long r12 = r7.getCreateTime()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r1] = r12
            long r12 = eb0.C31543z5.m39454d()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r9] = r12
            r12 = 3
            int r13 = r7.getStatus()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11[r12] = r13
            r12 = 4
            long r13 = eb0.C31543z5.m39454d()
            long r15 = r7.getCreateTime()
            long r13 = r13 - r15
            long r13 = java.lang.Math.abs(r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r11[r12] = r13
            r12 = 5
            java.lang.String r6 = r6.f192525b
            r11[r12] = r6
            java.lang.String r6 = r7.getContent()
            r11[r10] = r6
            java.lang.String r6 = "insertMsg, getIsSend = %s, sendMsgInfo.getCreateTime(), = %s, TimeHelper.getSyncServerTimeMs() = %s， sendMsgInfo.getStatus() = %s, Math.abs(TimeHelper.getSyncServerTimeMs() - sendMsgInfo.getCreateTime()) = %s, provider.digest = %s, sendMsgInfo.getContent() = %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r11)
            goto L_0x00c1
        L_0x00c0:
            r8 = 0
        L_0x00c1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "insertMsg insertMsg , hasRepeatMessage = "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            if (r8 == 0) goto L_0x00d8
            return
        L_0x00d8:
            int r6 = r4.length
            r7 = 0
            r8 = 0
        L_0x00db:
            if (r7 >= r6) goto L_0x0146
            r11 = r4[r7]
            com.tencent.mm.storage.f4 r12 = new com.tencent.mm.storage.f4
            r12.<init>()
            java.lang.String r13 = r11.f192525b
            r12.mo108732L2(r13)
            int r13 = eb0.C45628s0.m50810y(r17)
            int r14 = r8 + 1
            r8 = r2[r8]
            r18 = r4
            long r3 = r8.field_createTime
            r12.mo108733M2(r3)
            r12.mo108749c3(r0)
            r12.setType(r13)
            boolean r3 = r11.f192529f
            if (r3 == 0) goto L_0x0109
            r12.mo100991d(r9)
            r12.mo108740T2(r1)
            goto L_0x0110
        L_0x0109:
            r12.mo100991d(r10)
            r3 = 0
            r12.mo108740T2(r3)
        L_0x0110:
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            long r3 = r3.my0(r12)
            r11 = -1
            int r8 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0126
            r8 = 1
            goto L_0x0127
        L_0x0126:
            r8 = 0
        L_0x0127:
            junit.framework.Assert.assertTrue(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "new msg inserted to db , local id = "
            r8.append(r11)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            int r7 = r7 + 1
            r4 = r18
            r8 = r14
            r3 = 0
            goto L_0x00db
        L_0x0146:
            com.tencent.mm.storage.f4 r1 = new com.tencent.mm.storage.f4
            r1.<init>()
            r3 = 0
            r2 = r2[r3]
            long r2 = r2.field_createTime
            r6 = 1
            long r2 = r2 + r6
            r1.mo108733M2(r2)
            r1.mo108749c3(r0)
            java.lang.String r0 = "add say hi text happen third"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131838145(0x7f1144c1, float:1.9309505E38)
            java.lang.String r0 = r0.getString(r2)
            r1.mo108732L2(r0)
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.setType(r0)
            r1.mo100991d(r10)
            r0 = 0
            r1.mo108740T2(r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            long r0 = r0.my0(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "insertMsg ， msgId = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            return
        L_0x019b:
            java.lang.String r0 = "insertMsg, providerList = null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.C70142g.m82633e(java.lang.String, com.tencent.mm.storage.m3):void");
    }

    /* renamed from: f */
    public static boolean m82634f(String str) {
        C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0(str);
        return (Ex0 == null || Ex0.getMsgId() == 0) ? false : true;
    }

    /* renamed from: g */
    public static void m82635g(String str, String str2) {
        C86709a0.m107525e().postToWorker(new C70143a(str, str2));
    }
}
