package ae3;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FMsgGetNameEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72991u4;
import com.tencent.p014mm.storage.C72996z1;
import p749xh.C78823q5;

/* renamed from: ae3.b */
public class C67030b {

    /* renamed from: a */
    public String f192524a;

    /* renamed from: b */
    public String f192525b;

    /* renamed from: c */
    public int f192526c;

    /* renamed from: d */
    public String f192527d;

    /* renamed from: e */
    public long f192528e;

    /* renamed from: f */
    public boolean f192529f;

    /* renamed from: g */
    public String f192530g;

    /* renamed from: a */
    public static C67030b m79186a(Context context, long j, boolean z, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, int i2) {
        Context context2 = context;
        String str8 = str;
        String str9 = str2;
        int i3 = i;
        String str10 = str3;
        String str11 = str4;
        String str12 = str7;
        int i4 = i2;
        C67030b bVar = new C67030b();
        bVar.f192528e = j;
        bVar.f192529f = !z;
        Log.m105919d("MicroMsg.FMessageProvider", "build, fmsgInfo.type:%d, fmsgInfo.talker:%s, scene:%d  ", Integer.valueOf(i), str8, Integer.valueOf(i2));
        if (i3 == 0) {
            if (str9 == null) {
                Log.m105920e("MicroMsg.FMessageProvider", "build fail, fmsgInfo msgContent is null, fmsgInfo.talker = " + str8);
                return null;
            }
            bVar.f192524a = str10;
            bVar.f192527d = str11;
            if (i4 == 4) {
                bVar.f192525b = context2.getString(C0966R.string.b7s);
            } else if (i4 == 10 || i4 == 11) {
                FMsgGetNameEvent fMsgGetNameEvent = new FMsgGetNameEvent();
                FMsgGetNameEvent.C67698a aVar = fMsgGetNameEvent.f193611d;
                aVar.f193613a = str5;
                aVar.f193614b = str6;
                fMsgGetNameEvent.publish();
                bVar.f192525b = context2.getString(C0966R.string.b7x, new Object[]{Util.nullAs(fMsgGetNameEvent.f193612e.f193615a, "")});
            } else if (i4 == 31) {
                bVar.f192525b = context2.getString(C0966R.string.b88);
            } else if (i4 != 32) {
                switch (i4) {
                    case 58:
                    case 59:
                    case 60:
                        C72963f4.C72964b.m85654f(str2);
                        bVar.f192525b = context2.getString(C0966R.string.b7v);
                        break;
                    default:
                        bVar.f192525b = context2.getString(C0966R.string.f360256b81);
                        break;
                }
            } else {
                bVar.f192525b = context2.getString(C0966R.string.f360257b82);
            }
        } else if (z) {
            bVar.f192524a = str10;
            bVar.f192527d = str11;
            if (str12 == null || str7.trim().equals("")) {
                bVar.f192525b = context2.getString(C0966R.string.hbn);
            } else {
                bVar.f192525b = str12;
            }
        } else if (i3 == 1 || i3 == 2 || i3 == 3) {
            boolean isStartXml = XmlParser.isStartXml(str9, "msg", (String) null);
            if (!isStartXml) {
                bVar.f192524a = str8;
                bVar.f192525b = str9;
                Log.m105925i("MicroMsg.FMessageProvider", "fmsgTalker = %s, fmsgType = %s, fmsgContent = %s, isStartMsgXml = %s.", str8, Integer.valueOf(i), str9, Boolean.valueOf(isStartXml));
            } else {
                C72963f4.C72971h v = C72963f4.C72971h.m85668v(str2);
                Log.m105925i("MicroMsg.FMessageProvider", "fmsgTalker = %s, verifygetusernmae = %s, fmsgType = %s, fmsgContent = %s", str8, v.f212737a, Integer.valueOf(i), str9);
                bVar.f192527d = v.f212739c;
                String str13 = v.f212742f;
                if (str13 == null || Util.isNullOrNil(str13.trim())) {
                    bVar.f192525b = "";
                    Log.m105921e("MicroMsg.FMessageProvider", "fmsgContent = %s", str9);
                } else {
                    bVar.f192525b = v.f212742f;
                }
                bVar.f192524a = str8;
            }
        } else {
            bVar.f192524a = str8;
            bVar.f192525b = str9;
        }
        return bVar;
    }

    /* renamed from: b */
    public static C67030b m79187b(Context context, C72985m3 m3Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j = m3Var.systemRowid;
        boolean l2 = m3Var.mo101179l2();
        String str8 = m3Var.field_talker;
        String str9 = m3Var.field_msgContent;
        int i2 = m3Var.field_type;
        String str10 = null;
        if (i2 == 0) {
            C72963f4.C72964b f = C72963f4.C72964b.m85654f(str9);
            str5 = f.f212675a;
            str4 = f.f212676b;
            str3 = f.f212682h;
            str2 = f.f212683i;
            str = null;
            i = f.f212681g;
        } else {
            if (l2) {
                C72963f4.C72971h v = C72963f4.C72971h.m85668v(str9);
                str5 = v.f212737a;
                str4 = v.f212739c;
                str6 = v.f212742f;
                str7 = v.f212732C == 1 ? v.f212734E : null;
            } else {
                str7 = null;
                str5 = null;
                str4 = null;
                str6 = null;
            }
            str2 = null;
            str = str6;
            i = 0;
            str3 = null;
            str10 = str7;
        }
        C67030b a = m79186a(context, j, l2, str8, str9, i2, str5, str4, str3, str2, str, i);
        a.f192530g = str10;
        return a;
    }

    /* renamed from: c */
    public static C67030b m79188c(Context context, C72991u4 u4Var) {
        Log.m105918d("MicroMsg.FMessageProvider", "build shake, talker = " + u4Var.field_talker + ", scene = " + u4Var.field_scene);
        C67030b bVar = new C67030b();
        bVar.f192528e = u4Var.systemRowid;
        int i = u4Var.field_isSend;
        bVar.f192529f = i == 1;
        bVar.f192524a = u4Var.field_sayhiuser;
        bVar.f192526c = u4Var.field_scene;
        if (i == 1) {
            bVar.f192525b = u4Var.field_content;
        } else {
            C72963f4.C72971h v = C72963f4.C72971h.m85668v(u4Var.field_content);
            String str = v.f212742f;
            if (str == null || str.trim().equals("")) {
                bVar.f192525b = context.getString(C0966R.string.b8_);
            } else {
                bVar.f192525b = v.f212742f;
            }
            bVar.f192527d = v.f212739c;
        }
        return bVar;
    }

    /* renamed from: d */
    public static C67030b m79189d(Context context, C78823q5 q5Var) {
        Log.m105918d("MicroMsg.FMessageProvider", "build lbs, talker = " + q5Var.field_sayhiuser + ", scene = " + q5Var.field_scene);
        C67030b bVar = new C67030b();
        bVar.f192528e = q5Var.systemRowid;
        int i = q5Var.field_isSend;
        bVar.f192529f = i == 1;
        bVar.f192524a = q5Var.field_sayhiuser;
        bVar.f192526c = q5Var.field_scene;
        if (i == 1) {
            bVar.f192525b = q5Var.field_content;
        } else {
            C72963f4.C72971h v = C72963f4.C72971h.m85668v(q5Var.field_content);
            String str = v.f212742f;
            if (str == null || str.trim().equals("")) {
                bVar.f192525b = context.getString(C0966R.string.b8_);
            } else {
                bVar.f192525b = v.f212742f;
            }
            bVar.f192527d = v.f212739c;
        }
        return bVar;
    }

    /* renamed from: e */
    public static C72996z1 m79190e(C72985m3 m3Var) {
        C72996z1 z1Var = new C72996z1();
        if (m3Var == null) {
            return z1Var;
        }
        if (m3Var.field_type == 0) {
            C72963f4.C72964b f = C72963f4.C72964b.m85654f(m3Var.field_msgContent);
            C72996z1 z1Var2 = new C72996z1();
            z1Var2.setUsername(f.f212675a);
            z1Var2.mo62857I2(f.f212677c);
            z1Var2.mo62878U2(f.mo101025b());
            z1Var2.mo62882W2(f.f212679e);
            z1Var2.mo62884X2(f.f212678d);
            z1Var2.mo62900f4(f.f212689o);
            z1Var2.mo62892b4(f.mo101027d());
            z1Var2.mo62865M3(f.mo101024a());
            z1Var2.mo62902g4(f.f212690p);
            z1Var2.mo62894d3(f.f212691q);
            z1Var2.mo62925q4(f.f212692r);
            z1Var2.mo62848B3(f.f212698x);
            return z1Var2;
        }
        C72963f4.C72971h v = C72963f4.C72971h.m85668v(m3Var.field_msgContent);
        C72996z1 z1Var3 = new C72996z1();
        z1Var3.setUsername(v.f212737a);
        z1Var3.mo62857I2(v.f212738b);
        z1Var3.mo62878U2(v.f212739c);
        z1Var3.mo62882W2(v.f212741e);
        z1Var3.mo62884X2(v.f212740d);
        z1Var3.mo62900f4(v.f212751o);
        z1Var3.mo62902g4(v.f212752p);
        z1Var3.mo62892b4(v.mo101044k());
        z1Var3.mo62865M3(v.mo101036c());
        return z1Var3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r6[0];
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ae3.C67030b[] m79191f(android.content.Context r5, com.tencent.p014mm.storage.C72985m3[] r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "convert fmsgList, talker = "
            r0.append(r1)
            r1 = 0
            if (r6 == 0) goto L_0x0018
            int r2 = r6.length
            if (r2 == 0) goto L_0x0018
            r2 = r6[r1]
            if (r2 != 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            java.lang.String r2 = r2.field_talker
            goto L_0x001a
        L_0x0018:
            java.lang.String r2 = "null"
        L_0x001a:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.FMessageProvider"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            if (r6 == 0) goto L_0x0041
            int r0 = r6.length
            if (r0 != 0) goto L_0x002c
            goto L_0x0041
        L_0x002c:
            int r0 = r6.length
            ae3.b[] r2 = new ae3.C67030b[r0]
        L_0x002f:
            if (r1 >= r0) goto L_0x0040
            int r3 = r0 - r1
            int r3 = r3 + -1
            r4 = r6[r1]
            ae3.b r4 = m79187b(r5, r4)
            r2[r3] = r4
            int r1 = r1 + 1
            goto L_0x002f
        L_0x0040:
            return r2
        L_0x0041:
            java.lang.String r5 = "convert fmsg fail, fmsgList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.C67030b.m79191f(android.content.Context, com.tencent.mm.storage.m3[]):ae3.b[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r6[0];
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ae3.C67030b[] m79192g(android.content.Context r5, com.tencent.p014mm.storage.C72991u4[] r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "convert shakeList, talker = "
            r0.append(r1)
            r1 = 0
            if (r6 == 0) goto L_0x0018
            int r2 = r6.length
            if (r2 == 0) goto L_0x0018
            r2 = r6[r1]
            if (r2 != 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            java.lang.String r2 = r2.field_sayhiuser
            goto L_0x001a
        L_0x0018:
            java.lang.String r2 = "null"
        L_0x001a:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.FMessageProvider"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            if (r6 == 0) goto L_0x0041
            int r0 = r6.length
            if (r0 != 0) goto L_0x002c
            goto L_0x0041
        L_0x002c:
            int r0 = r6.length
            ae3.b[] r2 = new ae3.C67030b[r0]
        L_0x002f:
            if (r1 >= r0) goto L_0x0040
            int r3 = r0 - r1
            int r3 = r3 + -1
            r4 = r6[r1]
            ae3.b r4 = m79188c(r5, r4)
            r2[r3] = r4
            int r1 = r1 + 1
            goto L_0x002f
        L_0x0040:
            return r2
        L_0x0041:
            java.lang.String r5 = "convert shake fail, shakeList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.C67030b.m79192g(android.content.Context, com.tencent.mm.storage.u4[]):ae3.b[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r6[0];
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ae3.C67030b[] m79193h(android.content.Context r5, p749xh.C78823q5[] r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "convert lbsList, talker = "
            r0.append(r1)
            r1 = 0
            if (r6 == 0) goto L_0x0018
            int r2 = r6.length
            if (r2 == 0) goto L_0x0018
            r2 = r6[r1]
            if (r2 != 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            java.lang.String r2 = r2.field_sayhiuser
            goto L_0x001a
        L_0x0018:
            java.lang.String r2 = "null"
        L_0x001a:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.FMessageProvider"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            if (r6 == 0) goto L_0x0041
            int r0 = r6.length
            if (r0 != 0) goto L_0x002c
            goto L_0x0041
        L_0x002c:
            int r0 = r6.length
            ae3.b[] r2 = new ae3.C67030b[r0]
        L_0x002f:
            if (r1 >= r0) goto L_0x0040
            int r3 = r0 - r1
            int r3 = r3 + -1
            r4 = r6[r1]
            ae3.b r4 = m79189d(r5, r4)
            r2[r3] = r4
            int r1 = r1 + 1
            goto L_0x002f
        L_0x0040:
            return r2
        L_0x0041:
            java.lang.String r5 = "convert lbs fail, lbsList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.C67030b.m79193h(android.content.Context, xh.q5[]):ae3.b[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m79194i(java.lang.String r21, int r22) {
        /*
            r1 = r21
            r0 = r22
            r3 = 3
            java.lang.String r4 = "MicroMsg.FMessageProvider"
            r5 = 26
            if (r0 == r5) goto L_0x004e
            r5 = 27
            if (r0 == r5) goto L_0x004e
            r5 = 28
            if (r0 == r5) goto L_0x004e
            r5 = 29
            if (r0 != r5) goto L_0x0018
            goto L_0x004e
        L_0x0018:
            r5 = 18
            if (r0 != r5) goto L_0x0039
            java.lang.String r0 = "initAddContent, scene is lbs"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            com.tencent.mm.storage.c4 r0 = fd0.C75743h.xx0()
            com.tencent.mm.storage.b4[] r0 = r0.mo100934Yt(r1, r3)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ae3.b[] r5 = m79193h(r5, r0)
            r6 = 0
            r7 = 0
            r20 = r5
            r5 = r0
            r0 = r20
            goto L_0x0067
        L_0x0039:
            com.tencent.mm.storage.n3 r0 = fd0.C75743h.wx0()
            com.tencent.mm.storage.m3[] r0 = r0.mo101193qq(r1, r3)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ae3.b[] r5 = m79191f(r5, r0)
            r6 = r0
            r0 = r5
            r5 = 0
            r7 = 0
            goto L_0x0067
        L_0x004e:
            java.lang.String r0 = "initAddContent, scene is shake"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            com.tencent.mm.storage.v4 r0 = fd0.C75743h.yx0()
            com.tencent.mm.storage.u4[] r0 = r0.mo101223Yt(r1, r3)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ae3.b[] r5 = m79192g(r5, r0)
            r7 = r0
            r0 = r5
            r5 = 0
            r6 = 0
        L_0x0067:
            if (r0 != 0) goto L_0x006a
            return
        L_0x006a:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            int r9 = r0.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r8[r10] = r9
            r9 = 1
            r8[r9] = r1
            com.tencent.mm.sdk.platformtools.MMStack r11 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r12 = 2
            r8[r12] = r11
            java.lang.String r11 = "providerlist size = %s, userName = %s, stack = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r8)
            int r8 = r0.length
            r11 = 0
            r13 = 0
        L_0x0087:
            r15 = 1000(0x3e8, double:4.94E-321)
            if (r11 >= r8) goto L_0x0137
            r2 = r0[r11]
            com.tencent.mm.storage.f4 r3 = new com.tencent.mm.storage.f4
            r3.<init>()
            java.lang.String r10 = r2.f192525b
            r3.mo108732L2(r10)
            java.lang.String r10 = r2.f192524a
            int r10 = eb0.C45628s0.m50810y(r10)
            if (r6 == 0) goto L_0x00ac
            int r15 = r6.length
            int r15 = r15 - r13
            int r15 = r15 - r9
            r15 = r6[r15]
            long r14 = r15.field_createTime
            r3.mo108733M2(r14)
            r19 = r10
            goto L_0x00ce
        L_0x00ac:
            if (r5 == 0) goto L_0x00bd
            int r14 = r6.length
            int r14 = r14 - r13
            int r14 = r14 - r9
            r14 = r5[r14]
            r19 = r10
            long r9 = r14.field_createtime
            long r9 = r9 * r15
            r3.mo108733M2(r9)
            goto L_0x00ce
        L_0x00bd:
            r19 = r10
            if (r7 == 0) goto L_0x00ce
            int r9 = r6.length
            int r9 = r9 - r13
            r10 = 1
            int r9 = r9 - r10
            r9 = r7[r9]
            long r9 = r9.field_createtime
            long r9 = r9 * r15
            r3.mo108733M2(r9)
        L_0x00ce:
            int r13 = r13 + 1
            java.lang.String r9 = r2.f192524a
            r3.mo108749c3(r9)
            r9 = r19
            r3.setType(r9)
            boolean r9 = r2.f192529f
            if (r9 == 0) goto L_0x00e6
            r3.mo100991d(r12)
            r9 = 1
            r3.mo108740T2(r9)
            goto L_0x00ee
        L_0x00e6:
            r9 = 6
            r3.mo100991d(r9)
            r9 = 0
            r3.mo108740T2(r9)
        L_0x00ee:
            eb0.c r9 = eb0.C97625j3.m125812b()
            g62.l r9 = r9.mo105911z()
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            long r9 = r9.my0(r3)
            r14 = -1
            int r3 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0104
            r3 = 1
            goto L_0x0105
        L_0x0104:
            r3 = 0
        L_0x0105:
            junit.framework.Assert.assertTrue(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r14 = "new msg inserted to db , local id = "
            r3.append(r14)
            r3.append(r9)
            java.lang.String r9 = ", provider.digest = "
            r3.append(r9)
            java.lang.String r9 = r2.f192525b
            r3.append(r9)
            java.lang.String r9 = ", provider.username = "
            r3.append(r9)
            java.lang.String r2 = r2.f192524a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            int r11 = r11 + 1
            r3 = 3
            r9 = 1
            r10 = 0
            goto L_0x0087
        L_0x0137:
            int r2 = r0.length     // Catch:{ Exception -> 0x014d }
            if (r2 != 0) goto L_0x0150
            java.lang.String r2 = "checkMsgHasRepeat, providerList = %s, stack = %s"
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x014d }
            r8 = 0
            r3[r8] = r0     // Catch:{ Exception -> 0x014d }
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()     // Catch:{ Exception -> 0x014d }
            r8 = 1
            r3[r8] = r0     // Catch:{ Exception -> 0x014d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r3)     // Catch:{ Exception -> 0x014d }
            goto L_0x022c
        L_0x014d:
            r0 = move-exception
            goto L_0x022e
        L_0x0150:
            int r2 = r0.length     // Catch:{ Exception -> 0x014d }
            if (r2 <= 0) goto L_0x0158
            r2 = 0
            r0 = r0[r2]     // Catch:{ Exception -> 0x014d }
            r2 = r0
            goto L_0x0159
        L_0x0158:
            r2 = 0
        L_0x0159:
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x014d }
            g62.l r0 = r0.mo105911z()     // Catch:{ Exception -> 0x014d }
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ Exception -> 0x014d }
            r3 = 1
            java.util.List r0 = r0.Hx0(r1, r3, r3)     // Catch:{ Exception -> 0x014d }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x014d }
            int r3 = r0.size()     // Catch:{ Exception -> 0x014d }
            if (r3 <= 0) goto L_0x01ff
            r3 = 0
            java.lang.Object r8 = r0.get(r3)     // Catch:{ Exception -> 0x014d }
            if (r8 == 0) goto L_0x01ff
            if (r2 == 0) goto L_0x01ff
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x014d }
            com.tencent.mm.storage.f4 r0 = (com.tencent.p014mm.storage.C72963f4) r0     // Catch:{ Exception -> 0x014d }
            int r3 = r0.mo108769t2()     // Catch:{ Exception -> 0x014d }
            r8 = 1
            if (r3 != r8) goto L_0x01a9
            long r8 = eb0.C31543z5.m39453c()     // Catch:{ Exception -> 0x014d }
            long r10 = r0.getCreateTime()     // Catch:{ Exception -> 0x014d }
            long r8 = r8 - r10
            long r8 = java.lang.Math.abs(r8)     // Catch:{ Exception -> 0x014d }
            r10 = 3000(0xbb8, double:1.482E-320)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a9
            java.lang.String r3 = r2.f192525b     // Catch:{ Exception -> 0x014d }
            if (r3 == 0) goto L_0x01a9
            java.lang.String r8 = r0.getContent()     // Catch:{ Exception -> 0x014d }
            boolean r3 = r3.equals(r8)     // Catch:{ Exception -> 0x014d }
            if (r3 == 0) goto L_0x01a9
            r3 = 1
            goto L_0x01aa
        L_0x01a9:
            r3 = 0
        L_0x01aa:
            java.lang.String r8 = "insertMsg, getIsSend = %s, sendMsgInfo.getCreateTime(), = %s, TimeHelper.getSyncServerTimeMs() = %s， sendMsgInfo.getStatus() = %s, Math.abs(TimeHelper.getSyncServerTimeMs() - sendMsgInfo.getCreateTime()) = %s, provider.digest = %s, sendMsgInfo.getContent() = %s."
            r9 = 7
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x014d }
            int r10 = r0.mo108769t2()     // Catch:{ Exception -> 0x014d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x014d }
            r11 = 0
            r9[r11] = r10     // Catch:{ Exception -> 0x014d }
            long r10 = r0.getCreateTime()     // Catch:{ Exception -> 0x014d }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x014d }
            r11 = 1
            r9[r11] = r10     // Catch:{ Exception -> 0x014d }
            long r10 = eb0.C31543z5.m39453c()     // Catch:{ Exception -> 0x014d }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x014d }
            r9[r12] = r10     // Catch:{ Exception -> 0x014d }
            int r10 = r0.getStatus()     // Catch:{ Exception -> 0x014d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x014d }
            r11 = 3
            r9[r11] = r10     // Catch:{ Exception -> 0x014d }
            r10 = 4
            long r13 = eb0.C31543z5.m39453c()     // Catch:{ Exception -> 0x014d }
            long r17 = r0.getCreateTime()     // Catch:{ Exception -> 0x014d }
            long r13 = r13 - r17
            long r13 = java.lang.Math.abs(r13)     // Catch:{ Exception -> 0x014d }
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x014d }
            r9[r10] = r11     // Catch:{ Exception -> 0x014d }
            r10 = 5
            java.lang.String r2 = r2.f192525b     // Catch:{ Exception -> 0x014d }
            r9[r10] = r2     // Catch:{ Exception -> 0x014d }
            java.lang.String r0 = r0.getContent()     // Catch:{ Exception -> 0x014d }
            r2 = 6
            r9[r2] = r0     // Catch:{ Exception -> 0x014d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r9)     // Catch:{ Exception -> 0x014d }
            goto L_0x0200
        L_0x01ff:
            r3 = 0
        L_0x0200:
            if (r3 == 0) goto L_0x0218
            java.lang.String r0 = "insertMsg insertMsg , hasRepeatMessage = %s, stack = %s."
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x014d }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x014d }
            r8 = 0
            r2[r8] = r3     // Catch:{ Exception -> 0x014d }
            com.tencent.mm.sdk.platformtools.MMStack r3 = com.tencent.p014mm.sdk.platformtools.Util.getStack()     // Catch:{ Exception -> 0x014d }
            r8 = 1
            r2[r8] = r3     // Catch:{ Exception -> 0x014d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)     // Catch:{ Exception -> 0x014d }
            goto L_0x022c
        L_0x0218:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014d }
            r0.<init>()     // Catch:{ Exception -> 0x014d }
            java.lang.String r2 = "insertMsg insertMsg , hasRepeatMessage = "
            r0.append(r2)     // Catch:{ Exception -> 0x014d }
            r0.append(r3)     // Catch:{ Exception -> 0x014d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x014d }
        L_0x022c:
            r3 = 0
            goto L_0x0239
        L_0x022e:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "e = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)
        L_0x0239:
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4
            r0.<init>()
            r8 = 1
            if (r6 == 0) goto L_0x024b
            r2 = r6[r3]
            long r5 = r2.field_createTime
            long r5 = r5 + r8
            r0.mo108733M2(r5)
            goto L_0x0264
        L_0x024b:
            if (r5 == 0) goto L_0x0258
            r2 = r5[r3]
            long r5 = r2.field_createtime
            long r5 = r5 * r15
            long r5 = r5 + r8
            r0.mo108733M2(r5)
            goto L_0x0264
        L_0x0258:
            if (r7 == 0) goto L_0x0264
            r2 = r7[r3]
            long r2 = r2.field_createtime
            long r2 = r2 * r15
            long r2 = r2 + r8
            r0.mo108733M2(r2)
        L_0x0264:
            r0.mo108749c3(r1)
            java.lang.String r1 = "add say hi text happen sceond"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131838145(0x7f1144c1, float:1.9309505E38)
            java.lang.String r1 = r1.getString(r2)
            r0.mo108732L2(r1)
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setType(r1)
            r1 = 6
            r0.mo100991d(r1)
            r1 = 0
            r0.mo108740T2(r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            long r0 = r1.my0(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "new msg inserted to db , end local id = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.C67030b.m79194i(java.lang.String, int):void");
    }
}
