package com.tencent.p014mm.storage;

import android.net.Uri;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.pluginsdk.model.C19448i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.wechat.p326mm.biz.BizCgiCardProto;
import com.tencent.wechat.p326mm.biz.BizProto;
import di3.C86312j;
import fy3.C32224a;
import gw0.C76073b;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.LinkedList;
import java.util.List;
import jw0.C21289b;
import ob0.C47350c;
import ob0.C89144l0;
import p227rn.C22240c0;
import rb0.C22221f;
import rb0.C48009v0;
import rx3.C13601g;
import rx3.C36568h;
import s90.C77627f;
import s90.C77630j;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.C22509lp3;
import te3.C50433mp3;
import te3.C50577np3;
import te3.re4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.c0 */
public final class C19601c0 {

    /* renamed from: a */
    public static final C19601c0 f55446a = new C19601c0();

    /* renamed from: b */
    public static long f55447b = 0;

    /* renamed from: c */
    public static long f55448c = 0;

    /* renamed from: d */
    public static int f55449d = 0;

    /* renamed from: e */
    public static String f55450e = "";

    /* renamed from: f */
    public static String f55451f;

    /* renamed from: g */
    public static C22509lp3 f55452g;

    /* renamed from: h */
    public static LinkedList<C22509lp3> f55453h = new LinkedList<>();

    /* renamed from: i */
    public static volatile boolean f55454i;

    /* renamed from: j */
    public static final MultiProcessMMKV f55455j;

    /* renamed from: k */
    public static long f55456k;

    /* renamed from: l */
    public static boolean f55457l;

    /* renamed from: m */
    public static final C13601g f55458m = C36568h.m40985a(C19605b.f55473d);

    /* renamed from: n */
    public static long f55459n = -1;

    /* renamed from: o */
    public static String f55460o;

    /* renamed from: p */
    public static int f55461p;

    /* renamed from: q */
    public static int f55462q;

    /* renamed from: r */
    public static int f55463r = -1;

    /* renamed from: s */
    public static long f55464s = -1;

    /* renamed from: t */
    public static int f55465t = -1;

    /* renamed from: u */
    public static int f55466u = -1;

    /* renamed from: com.tencent.mm.storage.c0$a */
    public enum C19602a {
        REDDOT_REPORT_ACT_TYPE_EXPOSE_BOX(1),
        REDDOT_REPORT_ACT_TYPE_ENTER_BOX(2);
        

        /* renamed from: d */
        public final int f55470d;

        /* access modifiers changed from: public */
        C19602a(int i) {
            this.f55470d = i;
        }
    }

    /* renamed from: com.tencent.mm.storage.c0$c */
    public static final class C19603c implements Runnable {

        /* renamed from: d */
        public static final C19603c f55471d = new C19603c();

        public final void run() {
            C19601c0.f55446a.mo25724m(C19602a.REDDOT_REPORT_ACT_TYPE_ENTER_BOX);
        }
    }

    /* renamed from: com.tencent.mm.storage.c0$d */
    public static final class C19604d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C19602a f55472d;

        public C19604d(C19602a aVar) {
            this.f55472d = aVar;
        }

        public final void run() {
            C22509lp3 lp32;
            C19601c0 c0Var = C19601c0.f55446a;
            C19602a aVar = this.f55472d;
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar != C19602a.REDDOT_REPORT_ACT_TYPE_EXPOSE_BOX || Math.abs(currentTimeMillis - C19601c0.f55456k) >= 300000) {
                C19601c0.f55456k = currentTimeMillis;
                C19601c0.f55455j.encode("lastBoxExposeReaTimeReportTime", currentTimeMillis);
                if (aVar == C19602a.REDDOT_REPORT_ACT_TYPE_ENTER_BOX && (lp32 = C19601c0.f55452g) != null) {
                    if (C19601c0.f55453h.isEmpty()) {
                        C19601c0.f55453h.add(lp32);
                    }
                    lp32.f64188f = 2;
                }
                if (!C19601c0.f55453h.isEmpty()) {
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    C50433mp3 mp32 = new C50433mp3();
                    mp32.f138146d.addAll(C19601c0.f55453h);
                    bVar.f127066a = mp32;
                    bVar.f127067b = new C50577np3();
                    bVar.f127068c = "/cgi-bin/micromsg-bin/reddot_report";
                    bVar.f127069d = 5171;
                    C47350c a = bVar.mo72403a();
                    Log.m105924i("MicroMsg.BizMainCellExposeHelper", "realtimeReport accType = " + aVar.f55470d + ", size = " + C19601c0.f55453h.size());
                    C19601c0.f55453h.clear();
                    C89144l0.m111429e(a, C6708d0.f24117d, false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.storage.c0$b */
    public static final class C19605b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19605b f55473d = new C19605b();

        public C19605b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_main_cell_hide_report, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
        f55455j = singleMMKV;
        f55456k = singleMMKV.decodeLong("lastBoxExposeReaTimeReportTime", System.currentTimeMillis());
    }

    /* renamed from: a */
    public final String mo25712a(String str) {
        C87412m.m108594g(str, "<this>");
        return "lstExpTime_" + str + '}';
    }

    /* renamed from: b */
    public final String mo25713b(String str) {
        C87412m.m108594g(str, "<this>");
        return "minExpIndex_" + str + '}';
    }

    /* renamed from: c */
    public final String mo25714c(String str) {
        C87412m.m108594g(str, "<this>");
        return "totalExpCount_" + str + '}';
    }

    /* renamed from: d */
    public final String mo25715d(String str) {
        C87412m.m108594g(str, "<this>");
        return "totalExpTime_" + str + '}';
    }

    /* renamed from: e */
    public final int mo25716e() {
        return f55449d;
    }

    /* renamed from: f */
    public final String mo25717f() {
        return f55450e;
    }

    /* renamed from: g */
    public final C19624o4 mo25718g(C19623o0 o0Var) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        long j;
        String str4;
        C22499hb0 hb02;
        C87412m.m108594g(o0Var, "info");
        re4 x2 = o0Var.mo25774x2();
        long j2 = 0;
        String str5 = "";
        int i3 = 0;
        if (x2 != null) {
            int i4 = x2.f64521j;
            String str6 = x2.f64527s;
            if (!C19613h1.m21038k(i4) || (hb02 = x2.f64523o) == null || Util.isNullOrNil((List) hb02.f63905g)) {
                str4 = str5;
            } else {
                C22495eh ehVar = hb02.f63905g.get(0);
                str4 = ehVar.f63794e;
                C22493dh dhVar = ehVar.f63800n.get(0);
                if (dhVar != null) {
                    str5 = dhVar.f63748G;
                    String str7 = dhVar.f63755i;
                    if (!Util.isNullOrNil(str7)) {
                        Uri parse = Uri.parse(str7);
                        j2 = Util.getLong(parse.getQueryParameter("mid"), 0);
                        i3 = Util.getInt(parse.getQueryParameter("idx"), 0);
                    }
                }
            }
            j = j2;
            str3 = str5;
            i2 = i3;
            i = i4;
            str2 = str6;
            str = str4;
        } else {
            j = 0;
            str3 = str5;
            str2 = str3;
            str = str2;
            i2 = 0;
            i = 0;
        }
        return new C19624o4(j, i2, i, str3, str2, str);
    }

    /* renamed from: h */
    public final C19624o4 mo25719h(BizProto.BizMsgInfo bizMsgInfo) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        long j;
        String str4;
        List<BizCgiCardProto.BizRecommendArticleBizAccount> bizAccountList;
        BizCgiCardProto.BizRecommendArticleBizAccount bizRecommendArticleBizAccount;
        BizCgiCardProto.BizRecommendArticleBizAppMsg appMsg;
        C87412m.m108594g(bizMsgInfo, "info");
        long j2 = 0;
        String str5 = "";
        int i3 = 0;
        if (C21289b.m23811e(bizMsgInfo)) {
            BizCgiCardProto.BizRecommendExptMsg a = C21289b.m23807a(bizMsgInfo);
            str2 = a != null ? a.getExtraData() : null;
            j = 0;
            str3 = str5;
            str = str3;
        } else {
            BizCgiCardProto.BizRecommendArticle c = C21289b.m23809c(bizMsgInfo);
            if (c != null) {
                int style = c.getStyle();
                String extraData = c.getExtraData();
                List<BizCgiCardProto.BizRecommendArticleBizAccount> bizAccountList2 = c.getBizAccountList();
                if ((bizAccountList2 == null || bizAccountList2.isEmpty()) || (bizAccountList = c.getBizAccountList()) == null || (bizRecommendArticleBizAccount = bizAccountList.get(0)) == null) {
                    str4 = str5;
                } else {
                    str4 = bizRecommendArticleBizAccount.getUserName();
                    if (bizRecommendArticleBizAccount.getAppMsgCount() > 0 && (appMsg = bizRecommendArticleBizAccount.getAppMsg(0)) != null) {
                        str5 = appMsg.getRecInfo();
                        String contentUrl = appMsg.getContentUrl();
                        if (!Util.isNullOrNil(contentUrl)) {
                            Uri parse = Uri.parse(contentUrl);
                            j2 = Util.getLong(parse.getQueryParameter("mid"), 0);
                            i3 = Util.getInt(parse.getQueryParameter("idx"), 0);
                        }
                    }
                }
                i = style;
                j = j2;
                str3 = str5;
                i2 = i3;
                str2 = extraData;
                str = str4;
                return new C19624o4(j, i2, i, str3, str2, str);
            }
            j = 0;
            str3 = str5;
            str2 = str3;
            str = str2;
        }
        i2 = 0;
        i = 0;
        return new C19624o4(j, i2, i, str3, str2, str);
    }

    /* renamed from: i */
    public final boolean mo25720i(long j, int i) {
        int i2 = i;
        Class cls = C32735h.class;
        boolean z = false;
        if (f55466u == -1) {
            f55466u = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_biz_notify_msg_priority_show_switch, 0);
        }
        if (f55466u == 0) {
            Log.m105924i("MicroMsg.BizMainCellExposeHelper", "isNotifyMsgShowFirst  mBizNotifyMsgPriorityShowSwitch == 0");
            return false;
        }
        String valueOf = String.valueOf(j);
        C22221f fVar = C22221f.f62962a;
        long decodeLong = fVar.decodeLong(mo25715d(valueOf), 0) / ((long) 1000);
        int decodeInt = fVar.decodeInt(mo25714c(valueOf), 0);
        if (f55463r == -1) {
            f55463r = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_biz_notify_msg_priority_show_exposure_count, 0);
        }
        if (f55464s == -1) {
            f55464s = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_biz_notify_msg_priority_show_exposure_time, 0);
        }
        if (f55465t == -1) {
            f55465t = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_biz_notify_msg_priority_show_within_unread_count, 0);
        }
        long f = C19636w0.m21164f();
        if (decodeInt <= f55463r && decodeLong <= f55464s && i2 <= f55465t && j != f) {
            z = true;
        }
        Log.m105924i("MicroMsg.BizMainCellExposeHelper", "isNotifyMsgShowFirst totalExposeTime:" + decodeLong + "   " + f55464s + "   totalExposeCount:" + decodeInt + "  " + f55463r + "   unReadCount:" + i2 + "   " + f55465t + "   msgIdKey:" + valueOf + "  lastClickedNotifyMsgId:" + f + "  result:" + z);
        return z;
    }

    /* renamed from: j */
    public final void mo25721j() {
        ((C119157j) C119157j.f356862d).mo183876g(C19603c.f55471d, "MicroMsg.BizMainCellExposeHelper");
    }

    /* renamed from: k */
    public final void mo25722k(String str, int i, int i2, long j) {
        int i3;
        C19623o0 o0Var;
        String str2;
        long j2;
        int i4;
        int i5;
        String str3;
        int i6;
        int i7;
        String str4 = "MicroMsg.BizMainCellExposeHelper";
        if (f55454i) {
            f55454i = false;
            C19428d.f54856a.mo25166T();
            if (f55457l) {
                mo25726o(str, i, i2);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long decodeLong = j != 0 ? j : f55455j.decodeLong("BizLastMsgId");
            int i8 = (decodeLong > 0 ? 1 : (decodeLong == 0 ? 0 : -1));
            if (i8 != 0) {
                int l = C19615i1.m21065l();
                try {
                    C19623o0 kD = C48009v0.Jx0().mo25806kD(decodeLong);
                    if (kD == null && i8 < 0) {
                        kD = C48009v0.Kx0().mo25733Ow(decodeLong);
                    }
                    if (o0Var != null) {
                        int b = C19613h1.m21029b(o0Var);
                        if (o0Var.mo25754B2()) {
                            C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(o0Var.field_msgId, o0Var.field_content);
                            if (JZ != null && !Util.isNullOrNil((List) JZ.f226295i)) {
                                C77630j jVar = JZ.f226295i.get(0);
                                if (!Util.isNullOrNil(jVar.f226326e)) {
                                    Uri parse = Uri.parse(jVar.f226326e);
                                    j2 = Util.getLong(parse.getQueryParameter("mid"), 0);
                                    i7 = Util.getInt(parse.getQueryParameter("idx"), 0);
                                    o0Var = o0Var;
                                    str3 = o0Var.field_talker;
                                    C87412m.m108593f(str3, "info.field_talker");
                                    i5 = i7;
                                    str2 = "";
                                    i6 = 0;
                                    i4 = 0;
                                }
                            }
                            o0Var = o0Var;
                            i7 = 0;
                            j2 = 0;
                            str3 = o0Var.field_talker;
                            C87412m.m108593f(str3, "info.field_talker");
                            i5 = i7;
                            str2 = "";
                            i6 = 0;
                            i4 = 0;
                        } else {
                            if (o0Var.mo25755C2()) {
                                str3 = C19615i1.m21063j(o0Var);
                                i6 = C19615i1.m21062i(o0Var);
                                str2 = "";
                            } else if (o0Var.mo25758F2()) {
                                C19624o4 g = mo25718g(o0Var);
                                int i9 = g.f55542c;
                                str2 = "";
                                long j3 = g.f55540a;
                                i5 = g.f55541b;
                                String str5 = g.f55545f;
                                if (str5 == null) {
                                    str5 = str2;
                                }
                                j2 = j3;
                                i4 = i9;
                                str3 = str5;
                                i6 = 0;
                            } else {
                                str2 = "";
                                str3 = str2;
                                i6 = 0;
                            }
                            i5 = 0;
                            i4 = 0;
                            j2 = 0;
                        }
                        long decodeLong2 = C22221f.f62962a.decodeLong(mo25712a(String.valueOf(decodeLong)), 0);
                        int i15 = l;
                        long j4 = currentTimeMillis;
                        mo25728q(o0Var.field_msgId, j4);
                        C115669n nVar = C115669n.INSTANCE;
                        Object[] objArr = new Object[22];
                        String str6 = str4;
                        try {
                            objArr[0] = Integer.valueOf((int) (j4 / ((long) 1000)));
                            i3 = 1;
                            try {
                                objArr[1] = str3;
                                Object[] objArr2 = objArr;
                                objArr2[2] = Long.valueOf(j2);
                                objArr2[3] = 0;
                                objArr2[4] = Integer.valueOf(i);
                                objArr2[5] = WebViewUtilities.doUrlEncode(str);
                                objArr2[6] = Integer.valueOf(i2);
                                objArr2[7] = 1;
                                objArr2[8] = Long.valueOf(decodeLong2);
                                objArr2[9] = Long.valueOf(j4);
                                objArr2[10] = 0;
                                objArr2[11] = Integer.valueOf(i6);
                                objArr2[12] = Integer.valueOf(i15);
                                objArr2[13] = str2;
                                objArr2[14] = str2;
                                objArr2[15] = Integer.valueOf(b);
                                objArr2[16] = Integer.valueOf(i4);
                                objArr2[17] = Integer.valueOf(i5);
                                objArr2[18] = str2;
                                objArr2[19] = str2;
                                objArr2[20] = str2;
                                objArr2[21] = str2;
                                nVar.mo160131h(18218, objArr2);
                                str4 = str6;
                                Log.m105919d(str4, "postDoReportMainCellHide username %s, mid %d, lastExposeTime=%s", str3, Long.valueOf(j2), Long.valueOf(decodeLong2));
                            } catch (Throwable th) {
                                th = th;
                                str4 = str6;
                                Object[] objArr3 = new Object[i3];
                                objArr3[0] = th.getMessage();
                                Log.m105929w(str4, "postDoReportMainCellHide exp %s", objArr3);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str4 = str6;
                            i3 = 1;
                            Object[] objArr32 = new Object[i3];
                            objArr32[0] = th.getMessage();
                            Log.m105929w(str4, "postDoReportMainCellHide exp %s", objArr32);
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf A[Catch:{ all -> 0x0220 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25723l(java.lang.String r26, int r27, int r28, long r29) {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r2 = "MicroMsg.BizMainCellExposeHelper"
            boolean r0 = f55454i
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            r3 = 0
            f55454i = r3
            com.tencent.mm.pluginsdk.model.d r0 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            r0.mo25166T()
            boolean r0 = f55457l
            if (r0 == 0) goto L_0x0019
            r25.mo25726o(r26, r27, r28)
            return
        L_0x0019:
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            int r0 = (r29 > r6 ? 1 : (r29 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0026
            r8 = r29
            goto L_0x002e
        L_0x0026:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = f55455j
            java.lang.String r8 = "BizLastMsgId"
            long r8 = r0.decodeLong(r8)
        L_0x002e:
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0033
            return
        L_0x0033:
            int r0 = com.tencent.p014mm.storage.C19615i1.m21065l()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = f55455j     // Catch:{ all -> 0x0220 }
            java.lang.String r12 = "BizLastMsgIsNotifyMsg"
            boolean r11 = r11.decodeBool(r12, r3)     // Catch:{ all -> 0x0220 }
            java.lang.String r12 = "postDoReportMainCellHideForAff unknown type "
            java.lang.String r13 = ""
            if (r11 == 0) goto L_0x0080
            com.tencent.mm.storage.d1 r11 = rb0.C48009v0.Kx0()     // Catch:{ all -> 0x0220 }
            com.tencent.mm.storage.o0 r11 = r11.mo25733Ow(r8)     // Catch:{ all -> 0x0220 }
            if (r11 != 0) goto L_0x0050
            return
        L_0x0050:
            boolean r14 = r11.mo25755C2()     // Catch:{ all -> 0x0220 }
            if (r14 == 0) goto L_0x0065
            java.lang.String r12 = com.tencent.p014mm.storage.C19615i1.m21063j(r11)     // Catch:{ all -> 0x0220 }
            int r11 = com.tencent.p014mm.storage.C19615i1.m21062i(r11)     // Catch:{ all -> 0x0220 }
            r16 = r4
            r4 = r6
            r10 = 0
        L_0x0062:
            r14 = 0
            goto L_0x013e
        L_0x0065:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0220 }
            r14.<init>()     // Catch:{ all -> 0x0220 }
            r14.append(r12)     // Catch:{ all -> 0x0220 }
            int r11 = r11.field_type     // Catch:{ all -> 0x0220 }
            r14.append(r11)     // Catch:{ all -> 0x0220 }
            java.lang.String r11 = r14.toString()     // Catch:{ all -> 0x0220 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r11)     // Catch:{ all -> 0x0220 }
            r16 = r4
            r4 = r6
            r12 = r13
            r10 = 0
            r11 = 0
            goto L_0x0062
        L_0x0080:
            java.lang.Class<rn.c0> r11 = p227rn.C22240c0.class
            di3.d r11 = di3.C86312j.m106911c(r11)     // Catch:{ all -> 0x0220 }
            rn.c0 r11 = (p227rn.C22240c0) r11     // Catch:{ all -> 0x0220 }
            r11.mo35406dK()     // Catch:{ all -> 0x0220 }
            com.tencent.wechat.mm.biz.BizManager r11 = com.tencent.wechat.p326mm.biz.BizManager.getInstance()     // Catch:{ all -> 0x0220 }
            com.tencent.wechat.mm.biz.BizProto$BizMsgInfo r11 = r11.getLastMsgInfo()     // Catch:{ all -> 0x0220 }
            if (r11 == 0) goto L_0x021f
            long r14 = r11.getLocalId()     // Catch:{ all -> 0x0220 }
            int r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r16 == 0) goto L_0x009f
            goto L_0x021f
        L_0x009f:
            int r14 = jw0.C21289b.m23808b(r11)     // Catch:{ all -> 0x0220 }
            boolean r15 = jw0.C21289b.m23812f(r11)     // Catch:{ all -> 0x0220 }
            if (r15 == 0) goto L_0x0103
            com.tencent.wechat.mm.biz.BizProto$BizMsgItemContent r12 = r11.getContent()     // Catch:{ all -> 0x0220 }
            java.util.List r12 = r12.getItemsList()     // Catch:{ all -> 0x0220 }
            if (r12 == 0) goto L_0x00bc
            boolean r15 = r12.isEmpty()     // Catch:{ all -> 0x0220 }
            if (r15 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r15 = 0
            goto L_0x00bd
        L_0x00bc:
            r15 = 1
        L_0x00bd:
            if (r15 != 0) goto L_0x00f1
            java.lang.String r15 = "itemsList"
            gy3.C87412m.m108593f(r12, r15)     // Catch:{ all -> 0x0220 }
            java.lang.Object r12 = sx3.C110818d0.m150914L(r12)     // Catch:{ all -> 0x0220 }
            com.tencent.wechat.mm.biz.BizProto$BizMsgItem r12 = (com.tencent.wechat.p326mm.biz.BizProto.BizMsgItem) r12     // Catch:{ all -> 0x0220 }
            java.lang.String r15 = r12.getUrl()     // Catch:{ all -> 0x0220 }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)     // Catch:{ all -> 0x0220 }
            if (r15 != 0) goto L_0x00f1
            java.lang.String r12 = r12.getUrl()     // Catch:{ all -> 0x0220 }
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ all -> 0x0220 }
            java.lang.String r15 = "mid"
            java.lang.String r15 = r12.getQueryParameter(r15)     // Catch:{ all -> 0x0220 }
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r15, r6)     // Catch:{ all -> 0x0220 }
            java.lang.String r10 = "idx"
            java.lang.String r10 = r12.getQueryParameter(r10)     // Catch:{ all -> 0x0220 }
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r3)     // Catch:{ all -> 0x0220 }
            goto L_0x00f3
        L_0x00f1:
            r15 = r6
            r10 = 0
        L_0x00f3:
            java.lang.String r12 = r11.getUserName()     // Catch:{ all -> 0x0220 }
            java.lang.String r11 = "info.userName"
            gy3.C87412m.m108593f(r12, r11)     // Catch:{ all -> 0x0220 }
            r11 = 0
            r23 = r4
            r4 = r15
            r16 = r23
            goto L_0x013e
        L_0x0103:
            boolean r10 = jw0.C21289b.m23814h(r11)     // Catch:{ all -> 0x0220 }
            if (r10 == 0) goto L_0x0121
            com.tencent.mm.storage.o4 r10 = r1.mo25719h(r11)     // Catch:{ all -> 0x0220 }
            int r11 = r10.f55542c     // Catch:{ all -> 0x0220 }
            r16 = r4
            long r3 = r10.f55540a     // Catch:{ all -> 0x0220 }
            int r5 = r10.f55541b     // Catch:{ all -> 0x0220 }
            java.lang.String r10 = r10.f55545f     // Catch:{ all -> 0x0220 }
            if (r10 != 0) goto L_0x011b
            r12 = r13
            goto L_0x011c
        L_0x011b:
            r12 = r10
        L_0x011c:
            r10 = r5
            r4 = r3
            r3 = r11
        L_0x011f:
            r11 = 0
            goto L_0x013e
        L_0x0121:
            r16 = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0220 }
            r3.<init>()     // Catch:{ all -> 0x0220 }
            r3.append(r12)     // Catch:{ all -> 0x0220 }
            int r4 = r11.getMsgViewType()     // Catch:{ all -> 0x0220 }
            r3.append(r4)     // Catch:{ all -> 0x0220 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0220 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)     // Catch:{ all -> 0x0220 }
            r4 = r6
            r12 = r13
            r3 = 0
            r10 = 0
            goto L_0x011f
        L_0x013e:
            rb0.f r15 = rb0.C22221f.f62962a     // Catch:{ all -> 0x0220 }
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0220 }
            java.lang.String r6 = r1.mo25712a(r6)     // Catch:{ all -> 0x0220 }
            r7 = r2
            r20 = r3
            r2 = 0
            long r2 = r15.decodeLong(r6, r2)     // Catch:{ all -> 0x021c }
            r18 = r7
            r6 = r16
            r1.mo25728q(r8, r6)     // Catch:{ all -> 0x0218 }
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0218 }
            r15 = 22
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x0218 }
            r9 = 1000(0x3e8, float:1.401E-42)
            r17 = r8
            long r8 = (long) r9     // Catch:{ all -> 0x0218 }
            long r8 = r6 / r8
            int r9 = (int) r8     // Catch:{ all -> 0x0218 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0218 }
            r9 = 0
            r15[r9] = r8     // Catch:{ all -> 0x0218 }
            r8 = 1
            r15[r8] = r12     // Catch:{ all -> 0x0218 }
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0218 }
            r19 = 2
            r15[r19] = r8     // Catch:{ all -> 0x0218 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0218 }
            r9 = r15
            r15 = 3
            r9[r15] = r8     // Catch:{ all -> 0x0218 }
            r8 = 4
            java.lang.Integer r21 = java.lang.Integer.valueOf(r27)     // Catch:{ all -> 0x0218 }
            r9[r8] = r21     // Catch:{ all -> 0x0218 }
            r8 = 5
            java.lang.String r21 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r26)     // Catch:{ all -> 0x0218 }
            r9[r8] = r21     // Catch:{ all -> 0x0218 }
            r8 = 6
            java.lang.Integer r21 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0218 }
            r9[r8] = r21     // Catch:{ all -> 0x0218 }
            r8 = 7
            r21 = 1
            java.lang.Integer r22 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x0218 }
            r9[r8] = r22     // Catch:{ all -> 0x0218 }
            r8 = 8
            java.lang.Long r21 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0218 }
            r9[r8] = r21     // Catch:{ all -> 0x0218 }
            r8 = 9
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0218 }
            r9[r8] = r6     // Catch:{ all -> 0x0218 }
            r6 = 10
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0218 }
            r9[r6] = r8     // Catch:{ all -> 0x0218 }
            r6 = 11
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0218 }
            r9[r6] = r8     // Catch:{ all -> 0x0218 }
            r6 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0218 }
            r9[r6] = r0     // Catch:{ all -> 0x0218 }
            r0 = 13
            r9[r0] = r13     // Catch:{ all -> 0x0218 }
            r0 = 14
            r9[r0] = r13     // Catch:{ all -> 0x0218 }
            r0 = 15
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0218 }
            r9[r0] = r6     // Catch:{ all -> 0x0218 }
            r0 = 16
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0218 }
            r9[r0] = r6     // Catch:{ all -> 0x0218 }
            r0 = 17
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0218 }
            r9[r0] = r6     // Catch:{ all -> 0x0218 }
            r0 = 18
            r9[r0] = r13     // Catch:{ all -> 0x0218 }
            r0 = 19
            r9[r0] = r13     // Catch:{ all -> 0x0218 }
            r0 = 20
            r9[r0] = r13     // Catch:{ all -> 0x0218 }
            r0 = 21
            r9[r0] = r13     // Catch:{ all -> 0x0218 }
            r0 = r17
            r6 = 18218(0x472a, float:2.5529E-41)
            r0.mo160131h(r6, r9)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "postDoReportMainCellHideForAff username %s, mid %d, lastExposeTime=%s"
            java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch:{ all -> 0x0218 }
            r7 = 0
            r6[r7] = r12     // Catch:{ all -> 0x0218 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0218 }
            r5 = 1
            r6[r5] = r4     // Catch:{ all -> 0x0218 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0218 }
            r6[r19] = r2     // Catch:{ all -> 0x0218 }
            r2 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r6)     // Catch:{ all -> 0x0220 }
            goto L_0x0230
        L_0x0218:
            r0 = move-exception
            r2 = r18
            goto L_0x0221
        L_0x021c:
            r0 = move-exception
            r2 = r7
            goto L_0x0221
        L_0x021f:
            return
        L_0x0220:
            r0 = move-exception
        L_0x0221:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "postDoReportMainCellHideForAff exp %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r3)
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19601c0.mo25723l(java.lang.String, int, int, long):void");
    }

    /* renamed from: m */
    public final void mo25724m(C19602a aVar) {
        C87412m.m108594g(aVar, "actType");
        if (C19641z0.f55645a.mo25865h()) {
            ((C119157j) C119157j.f356862d).mo183876g(new C19604d(aVar), "MicroMsg.BizMainCellExposeHelper");
        }
    }

    /* renamed from: n */
    public final void mo25725n(String str, int i, C72976h2 h2Var) {
        String i2;
        C72976h2 h2Var2 = h2Var;
        if (h2Var2 != null) {
            if (!f55454i || !C87412m.m108589b(f55460o, h2Var.mo108823q2())) {
                ((C22240c0) C86312j.m106911c(C22240c0.class)).mo35403G8();
                int G2 = h2Var.mo108786G2();
                long currentTimeMillis = System.currentTimeMillis();
                f55460o = h2Var.mo108823q2();
                C19428d dVar = C19428d.f54856a;
                String f = dVar.mo25172f(h2Var.mo108823q2());
                dVar.mo25150C(h2Var.mo108823q2(), f);
                if (C19428d.f54880y == null && (i2 = C19428d.m20723i()) != null) {
                    int decodeInt$default = MMKVSlotManager.decodeInt$default(C19428d.f54858c, dVar.mo25154G(i2), 0, 2, (Object) null);
                    if (decodeInt$default < 10) {
                        decodeInt$default = 10;
                    }
                    long j = ((long) (decodeInt$default * 1000)) / 2;
                    Log.m105918d("MicroMsg.BizFinderLiveLogic", "startCheckMaiCellRedDot interval=" + j);
                    MTimerHandler mTimerHandler = new MTimerHandler("updateMainCellFinderLiveRedDotTimer", (MTimerHandler.CallBack) C19448i.f54938d, true);
                    C19428d.f54880y = mTimerHandler;
                    mTimerHandler.startTimer(500, j);
                }
                String q2 = h2Var.mo108823q2();
                C22221f fVar = C22221f.f62962a;
                C87412m.m108593f(q2, "bizUsername");
                StringBuilder sb = new StringBuilder();
                sb.append("hasExpose_");
                sb.append(q2);
                sb.append('}');
                int i3 = fVar.decodeInt(sb.toString(), 0) == 1 ? 0 : 1;
                MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) fVar.getSlotForWrite();
                multiProcessMMKV.encode("hasExpose_" + q2 + '}', 1);
                multiProcessMMKV.encode(mo25712a(q2), currentTimeMillis);
                f55462q = h2Var2.mo108372k3(256) ? 1 : 0;
                C115669n.INSTANCE.mo160131h(18218, Integer.valueOf((int) (currentTimeMillis / ((long) 1000))), q2, 0, Integer.valueOf(i3), Integer.valueOf(i), WebViewUtilities.doUrlEncode(str), Integer.valueOf(G2), 0, Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis), 0, 7, Integer.valueOf(f55462q), "", "", 0, 0, 0, "", "", "", f);
                f55447b = currentTimeMillis;
                f55449d = 7;
                f55450e = q2;
                f55448c = 0;
                if (f55454i) {
                    long j2 = f55459n;
                    if (j2 != 0) {
                        mo25722k("", 0, 0, j2);
                    }
                }
                f55457l = true;
                f55454i = true;
                f55459n = -1;
                Log.m105918d("MicroMsg.BizMainCellExposeHelper", "reportFinderLiveRedDotExpose bizUsername=" + q2);
            }
        }
    }

    /* renamed from: o */
    public final void mo25726o(String str, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = f55460o;
        if (str2 != null) {
            String f = C19428d.f54856a.mo25172f(str2);
            long decodeLong = C22221f.f62962a.decodeLong(mo25712a(str2), 0);
            C115669n.INSTANCE.mo160131h(18218, Integer.valueOf((int) (currentTimeMillis / ((long) 1000))), str2, 0, 0, Integer.valueOf(i), WebViewUtilities.doUrlEncode(str), Integer.valueOf(i2), 1, Long.valueOf(decodeLong), Long.valueOf(currentTimeMillis), 0, 7, Integer.valueOf(f55462q), "", "", 0, 0, 0, "", "", "", f);
            Log.m105918d("MicroMsg.BizMainCellExposeHelper", "reportFinderLiveRedDotHide bizUsername=" + str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02b3 A[Catch:{ all -> 0x0461 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02da A[Catch:{ all -> 0x0461 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f6 A[Catch:{ all -> 0x0461 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0301 A[Catch:{ all -> 0x0461 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x043a A[Catch:{ all -> 0x0450 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2 A[SYNTHETIC, Splitter:B:27:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0110 A[Catch:{ all -> 0x0461 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0197 A[Catch:{ all -> 0x0461 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0217 A[Catch:{ all -> 0x0461 }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25727p(java.lang.String r29, int r30, com.tencent.p014mm.storage.C72976h2 r31, int r32) {
        /*
            r28 = this;
            r7 = r28
            r0 = r30
            r1 = r31
            java.lang.Class<rn.c0> r8 = p227rn.C22240c0.class
            java.lang.String r9 = "MicroMsg.BizMainCellExposeHelper"
            java.lang.String r2 = "conv"
            gy3.C87412m.m108594g(r1, r2)
            com.tencent.mm.pluginsdk.model.d r2 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            r2.mo25152E()
            r2 = 128(0x80, float:1.794E-43)
            boolean r2 = r1.mo108372k3(r2)
            r10 = 0
            if (r2 == 0) goto L_0x0023
            r28.mo25725n(r29, r30, r31)
            f55452g = r10
            return
        L_0x0023:
            long r11 = java.lang.System.currentTimeMillis()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r13 = f55455j
            java.lang.String r1 = "BizLastMsgId"
            long r14 = r13.decodeLong(r1)
            r5 = 0
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0036
            return
        L_0x0036:
            boolean r1 = f55454i
            if (r1 == 0) goto L_0x0041
            long r1 = f55459n
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0041
            return
        L_0x0041:
            di3.d r1 = di3.C86312j.m106911c(r8)
            rn.c0 r1 = (p227rn.C22240c0) r1
            r1.mo35403G8()
            rb0.f r4 = rb0.C22221f.f62962a
            java.lang.Object r1 = r4.getSlotForWrite()
            r3 = r1
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r3
            boolean r1 = f55454i
            if (r1 == 0) goto L_0x0072
            long r16 = f55459n
            int r1 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0072
            r18 = 0
            r19 = 0
            java.lang.String r2 = ""
            r1 = r28
            r10 = r3
            r3 = r18
            r21 = r4
            r4 = r19
            r5 = r16
            r1.mo25723l(r2, r3, r4, r5)
            goto L_0x0075
        L_0x0072:
            r10 = r3
            r21 = r4
        L_0x0075:
            r1 = 0
            f55457l = r1
            java.lang.String r2 = ""
            f55460o = r2
            f55459n = r14
            r3 = 1
            f55454i = r3
            java.lang.String r4 = java.lang.String.valueOf(r14)
            r5 = r21
            int r6 = r5.decodeInt(r4, r1)
            if (r6 != r3) goto L_0x008f
            r6 = 0
            goto L_0x0090
        L_0x008f:
            r6 = 1
        L_0x0090:
            int r16 = com.tencent.p014mm.storage.C19615i1.m21065l()
            f55462q = r16
            f55461p = r1
            java.lang.String r3 = "BizLastMsgIsNotifyMsg"
            boolean r3 = r13.decodeBool(r3, r1)     // Catch:{ all -> 0x0461 }
            java.lang.String r13 = "reportMainCellExposeForAff unknown type "
            if (r3 == 0) goto L_0x0110
            com.tencent.mm.storage.d1 r3 = rb0.C48009v0.Kx0()     // Catch:{ all -> 0x0461 }
            com.tencent.mm.storage.o0 r3 = r3.mo25733Ow(r14)     // Catch:{ all -> 0x0461 }
            if (r3 != 0) goto L_0x00ad
            return
        L_0x00ad:
            boolean r4 = r3.mo25755C2()     // Catch:{ all -> 0x0461 }
            if (r4 == 0) goto L_0x00e4
            java.lang.String r4 = com.tencent.p014mm.storage.C19615i1.m21063j(r3)     // Catch:{ all -> 0x0461 }
            int r5 = com.tencent.p014mm.storage.C19615i1.m21062i(r3)     // Catch:{ all -> 0x0461 }
            java.lang.String r3 = com.tencent.p014mm.storage.C19615i1.m21057d(r3)     // Catch:{ all -> 0x0461 }
            com.tencent.mm.storage.d1 r8 = rb0.C48009v0.Kx0()     // Catch:{ all -> 0x0461 }
            int r8 = r8.mo25734SE()     // Catch:{ all -> 0x0461 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0461 }
            r10.<init>()     // Catch:{ all -> 0x0461 }
            java.lang.String r13 = "reportMainCellExposeForAff dyeing template bizUsername = "
            r10.append(r13)     // Catch:{ all -> 0x0461 }
            r10.append(r4)     // Catch:{ all -> 0x0461 }
            java.lang.String r13 = ", msgType = "
            r10.append(r13)     // Catch:{ all -> 0x0461 }
            r10.append(r5)     // Catch:{ all -> 0x0461 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0461 }
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r9, r10)     // Catch:{ all -> 0x0461 }
            goto L_0x00fe
        L_0x00e4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0461 }
            r4.<init>()     // Catch:{ all -> 0x0461 }
            r4.append(r13)     // Catch:{ all -> 0x0461 }
            int r3 = r3.field_type     // Catch:{ all -> 0x0461 }
            r4.append(r3)     // Catch:{ all -> 0x0461 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0461 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r3)     // Catch:{ all -> 0x0461 }
            r3 = r29
            r8 = r32
            r4 = r2
            r5 = 0
        L_0x00fe:
            r13 = r2
            r24 = r4
            r10 = r5
            r1 = r6
            r18 = r14
            r5 = 0
            r23 = 0
            r25 = 0
            r4 = r13
            r14 = r4
            r15 = r14
            goto L_0x0323
        L_0x0110:
            di3.d r3 = di3.C86312j.m106911c(r8)     // Catch:{ all -> 0x0461 }
            rn.c0 r3 = (p227rn.C22240c0) r3     // Catch:{ all -> 0x0461 }
            r3.mo35406dK()     // Catch:{ all -> 0x0461 }
            com.tencent.wechat.mm.biz.BizManager r3 = com.tencent.wechat.p326mm.biz.BizManager.getInstance()     // Catch:{ all -> 0x0461 }
            com.tencent.wechat.mm.biz.BizProto$BizMsgInfo r3 = r3.getLastMsgInfo()     // Catch:{ all -> 0x0461 }
            if (r3 == 0) goto L_0x045f
            long r17 = r3.getLocalId()     // Catch:{ all -> 0x0461 }
            int r8 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x012d
            goto L_0x045f
        L_0x012d:
            com.tencent.mm.storage.z0 r8 = com.tencent.p014mm.storage.C19641z0.f55645a     // Catch:{ all -> 0x0461 }
            boolean r8 = r8.mo25865h()     // Catch:{ all -> 0x0461 }
            if (r8 == 0) goto L_0x016b
            te3.lp3 r8 = new te3.lp3     // Catch:{ all -> 0x0461 }
            r8.<init>()     // Catch:{ all -> 0x0461 }
            te3.zi2 r1 = new te3.zi2     // Catch:{ all -> 0x0461 }
            r1.<init>()     // Catch:{ all -> 0x0461 }
            r18 = r14
            java.lang.String r14 = r3.getRankSessionId()     // Catch:{ all -> 0x0461 }
            r1.f64835h = r14     // Catch:{ all -> 0x0461 }
            java.lang.String r14 = r3.getBuffer()     // Catch:{ all -> 0x0461 }
            r1.f64837j = r14     // Catch:{ all -> 0x0461 }
            rx3.b0 r14 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0461 }
            r8.f64187e = r1     // Catch:{ all -> 0x0461 }
            te3.cj r1 = new te3.cj     // Catch:{ all -> 0x0461 }
            r1.<init>()     // Catch:{ all -> 0x0461 }
            r1.f182523d = r11     // Catch:{ all -> 0x0461 }
            r1.f182524e = r0     // Catch:{ all -> 0x0461 }
            int r14 = f55462q     // Catch:{ all -> 0x0461 }
            r15 = 1
            if (r14 != r15) goto L_0x0161
            r14 = 1
            goto L_0x0162
        L_0x0161:
            r14 = 0
        L_0x0162:
            r1.f182525f = r14     // Catch:{ all -> 0x0461 }
            r8.f64186d = r1     // Catch:{ all -> 0x0461 }
            r8.f64188f = r15     // Catch:{ all -> 0x0461 }
            f55452g = r8     // Catch:{ all -> 0x0461 }
            goto L_0x016d
        L_0x016b:
            r18 = r14
        L_0x016d:
            te3.lp3 r1 = f55452g     // Catch:{ all -> 0x0461 }
            if (r1 == 0) goto L_0x0174
            te3.zi2 r1 = r1.f64187e     // Catch:{ all -> 0x0461 }
            goto L_0x0175
        L_0x0174:
            r1 = 0
        L_0x0175:
            int r8 = jw0.C21289b.m23808b(r3)     // Catch:{ all -> 0x0461 }
            f55461p = r8     // Catch:{ all -> 0x0461 }
            boolean r8 = jw0.C21289b.m23812f(r3)     // Catch:{ all -> 0x0461 }
            if (r8 == 0) goto L_0x0229
            com.tencent.wechat.mm.biz.BizProto$BizMsgItemContent r8 = r3.getContent()     // Catch:{ all -> 0x0461 }
            java.util.List r8 = r8.getItemsList()     // Catch:{ all -> 0x0461 }
            if (r8 == 0) goto L_0x0194
            boolean r13 = r8.isEmpty()     // Catch:{ all -> 0x0461 }
            if (r13 == 0) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            r13 = 0
            goto L_0x0195
        L_0x0194:
            r13 = 1
        L_0x0195:
            if (r13 != 0) goto L_0x0217
            java.lang.String r13 = "itemsList"
            gy3.C87412m.m108593f(r8, r13)     // Catch:{ all -> 0x0461 }
            java.lang.Object r8 = sx3.C110818d0.m150914L(r8)     // Catch:{ all -> 0x0461 }
            com.tencent.wechat.mm.biz.BizProto$BizMsgItem r8 = (com.tencent.wechat.p326mm.biz.BizProto.BizMsgItem) r8     // Catch:{ all -> 0x0461 }
            java.lang.String r13 = r8.getUrl()     // Catch:{ all -> 0x0461 }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)     // Catch:{ all -> 0x0461 }
            if (r13 != 0) goto L_0x0205
            java.lang.String r13 = r8.getUrl()     // Catch:{ all -> 0x0461 }
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch:{ all -> 0x0461 }
            java.lang.String r14 = "mid"
            java.lang.String r14 = r13.getQueryParameter(r14)     // Catch:{ all -> 0x0461 }
            r21 = r5
            r22 = r6
            r5 = 0
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r14, r5)     // Catch:{ all -> 0x0461 }
            if (r1 != 0) goto L_0x01c7
            goto L_0x01ca
        L_0x01c7:
            int r5 = (int) r14     // Catch:{ all -> 0x0461 }
            r1.f64832e = r5     // Catch:{ all -> 0x0461 }
        L_0x01ca:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0461 }
            java.lang.String r5 = "idx"
            java.lang.String r5 = r13.getQueryParameter(r5)     // Catch:{ all -> 0x0461 }
            r6 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)     // Catch:{ all -> 0x0461 }
            if (r1 != 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r1.f64833f = r5     // Catch:{ all -> 0x0461 }
        L_0x01dc:
            if (r1 != 0) goto L_0x01e1
            r25 = r5
            goto L_0x0203
        L_0x01e1:
            java.lang.String r6 = "__biz"
            java.lang.String r6 = r13.getQueryParameter(r6)     // Catch:{ all -> 0x0461 }
            r13 = 2
            byte[] r6 = android.util.Base64.decode(r6, r13)     // Catch:{ all -> 0x0461 }
            java.lang.String r13 = "decode(uri.getQueryParam…\"__biz\"), Base64.NO_WRAP)"
            gy3.C87412m.m108593f(r6, r13)     // Catch:{ all -> 0x0461 }
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x0461 }
            r25 = r5
            java.nio.charset.Charset r5 = z04.C119027c.f356488a     // Catch:{ all -> 0x0461 }
            r13.<init>(r6, r5)     // Catch:{ all -> 0x0461 }
            r5 = 0
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r13, r5)     // Catch:{ all -> 0x0461 }
            int r6 = (int) r5     // Catch:{ all -> 0x0461 }
            r1.f64831d = r6     // Catch:{ all -> 0x0461 }
        L_0x0203:
            r5 = r14
            goto L_0x020d
        L_0x0205:
            r21 = r5
            r22 = r6
            r5 = 0
            r25 = 0
        L_0x020d:
            if (r1 != 0) goto L_0x0210
            goto L_0x021f
        L_0x0210:
            java.lang.String r8 = r8.getVid()     // Catch:{ all -> 0x0461 }
            r1.f64834g = r8     // Catch:{ all -> 0x0461 }
            goto L_0x021f
        L_0x0217:
            r21 = r5
            r22 = r6
            r5 = 0
            r25 = 0
        L_0x021f:
            java.lang.String r1 = r3.getUserName()     // Catch:{ all -> 0x0461 }
            java.lang.String r8 = "info.userName"
            gy3.C87412m.m108593f(r1, r8)     // Catch:{ all -> 0x0461 }
            goto L_0x0274
        L_0x0229:
            r21 = r5
            r22 = r6
            r5 = 0
            boolean r8 = jw0.C21289b.m23814h(r3)     // Catch:{ all -> 0x0461 }
            if (r8 == 0) goto L_0x025b
            com.tencent.mm.storage.o4 r5 = r7.mo25719h(r3)     // Catch:{ all -> 0x0461 }
            int r6 = r5.f55542c     // Catch:{ all -> 0x0461 }
            long r13 = r5.f55540a     // Catch:{ all -> 0x0461 }
            int r8 = r5.f55541b     // Catch:{ all -> 0x0461 }
            java.lang.String r15 = r5.f55543d     // Catch:{ all -> 0x0461 }
            r23 = r6
            java.lang.String r6 = r5.f55544e     // Catch:{ all -> 0x0461 }
            if (r6 == 0) goto L_0x024f
            if (r1 != 0) goto L_0x024a
            goto L_0x024c
        L_0x024a:
            r1.f64836i = r6     // Catch:{ all -> 0x0461 }
        L_0x024c:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0461 }
            goto L_0x0250
        L_0x024f:
            r6 = 0
        L_0x0250:
            java.lang.String r1 = r5.f55545f     // Catch:{ all -> 0x0461 }
            if (r1 != 0) goto L_0x0255
            r1 = r2
        L_0x0255:
            r25 = r8
            r8 = r6
            r5 = r13
            r13 = 1
            goto L_0x0279
        L_0x025b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0461 }
            r1.<init>()     // Catch:{ all -> 0x0461 }
            r1.append(r13)     // Catch:{ all -> 0x0461 }
            int r8 = r3.getMsgViewType()     // Catch:{ all -> 0x0461 }
            r1.append(r8)     // Catch:{ all -> 0x0461 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0461 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)     // Catch:{ all -> 0x0461 }
            r1 = r2
            r25 = 0
        L_0x0274:
            r8 = r2
            r15 = r8
            r13 = 1
            r23 = 0
        L_0x0279:
            r10.encode((java.lang.String) r4, (int) r13)     // Catch:{ all -> 0x0461 }
            java.lang.String r13 = r7.mo25712a(r4)     // Catch:{ all -> 0x0461 }
            r10.encode((java.lang.String) r13, (long) r11)     // Catch:{ all -> 0x0461 }
            java.lang.String r13 = r7.mo25714c(r4)     // Catch:{ all -> 0x0461 }
            java.lang.String r14 = r7.mo25714c(r4)     // Catch:{ all -> 0x0461 }
            r24 = r1
            r26 = r5
            r1 = r21
            r5 = 0
            int r6 = r1.decodeInt(r14, r5)     // Catch:{ all -> 0x0461 }
            r5 = 1
            int r6 = r6 + r5
            r10.encode((java.lang.String) r13, (int) r6)     // Catch:{ all -> 0x0461 }
            java.lang.String r5 = r7.mo25713b(r4)     // Catch:{ all -> 0x0461 }
            java.lang.String r4 = r7.mo25713b(r4)     // Catch:{ all -> 0x0461 }
            int r1 = r1.decodeInt(r4, r0)     // Catch:{ all -> 0x0461 }
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0461 }
            r10.encode((java.lang.String) r5, (int) r1)     // Catch:{ all -> 0x0461 }
            r1 = r22
            r4 = 1
            if (r1 != r4) goto L_0x02d4
            wc3.c r5 = wc3.C22881c.f65777a     // Catch:{ all -> 0x0461 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = r5.mo36059d()     // Catch:{ all -> 0x0461 }
            java.lang.String r10 = "biz_time_preload_at_biz_box_expose"
            r13 = 0
            boolean r6 = r6.getBoolean(r10, r13)     // Catch:{ all -> 0x0461 }
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0461 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0461 }
            r10[r13] = r4     // Catch:{ all -> 0x0461 }
            java.lang.String r4 = "MicroMsg.BizImagePreloadStrategy"
            java.lang.String r13 = "ImageStrategy chatListPreloadEnable %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r13, r10)     // Catch:{ all -> 0x0461 }
            if (r6 == 0) goto L_0x02d4
            r5.mo36064i()     // Catch:{ all -> 0x0461 }
        L_0x02d4:
            boolean r4 = jw0.C21289b.m23814h(r3)     // Catch:{ all -> 0x0461 }
            if (r4 == 0) goto L_0x02f0
            com.tencent.wechat.mm.biz.BizManager r4 = com.tencent.wechat.p326mm.biz.BizManager.getInstance()     // Catch:{ all -> 0x0461 }
            java.util.concurrent.atomic.AtomicInteger r5 = jw0.C21291d.f60148a     // Catch:{ all -> 0x0461 }
            java.util.concurrent.atomic.AtomicInteger r5 = jw0.C21291d.f60148a     // Catch:{ all -> 0x0461 }
            int r5 = r5.incrementAndGet()     // Catch:{ all -> 0x0461 }
            long r13 = r3.getLocalId()     // Catch:{ all -> 0x0461 }
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r6 = com.tencent.p014mm.storage.C30753k0.f82699t     // Catch:{ all -> 0x0461 }
            r6 = 1
            r4.onRecCardExposeAsync(r5, r13, r6)     // Catch:{ all -> 0x0461 }
        L_0x02f0:
            boolean r4 = jw0.C21289b.m23813g(r3)     // Catch:{ all -> 0x0461 }
            if (r4 == 0) goto L_0x0301
            com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticle r4 = jw0.C21289b.m23809c(r3)     // Catch:{ all -> 0x0461 }
            if (r4 == 0) goto L_0x0312
            java.lang.String r10 = r4.getCardId()     // Catch:{ all -> 0x0461 }
            goto L_0x0315
        L_0x0301:
            boolean r4 = jw0.C21289b.m23811e(r3)     // Catch:{ all -> 0x0461 }
            if (r4 == 0) goto L_0x0314
            com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendExptMsg r4 = jw0.C21289b.m23807a(r3)     // Catch:{ all -> 0x0461 }
            if (r4 == 0) goto L_0x0312
            java.lang.String r10 = r4.getCardID()     // Catch:{ all -> 0x0461 }
            goto L_0x0315
        L_0x0312:
            r10 = 0
            goto L_0x0315
        L_0x0314:
            r10 = r2
        L_0x0315:
            java.lang.String r3 = r3.getRankSessionId()     // Catch:{ all -> 0x0461 }
            r4 = r3
            r13 = r8
            r14 = r10
            r5 = r26
            r10 = 0
            r3 = r29
            r8 = r32
        L_0x0323:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r3)     // Catch:{ all -> 0x0461 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0461 }
            r7 = 23
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x045a }
            r20 = r9
            r9 = 1000(0x3e8, float:1.401E-42)
            r29 = r13
            r32 = r14
            long r13 = (long) r9
            long r13 = r11 / r13
            int r9 = (int) r13     // Catch:{ all -> 0x0454 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0454 }
            r13 = 0
            r7[r13] = r9     // Catch:{ all -> 0x0454 }
            r9 = 1
            r7[r9] = r24     // Catch:{ all -> 0x0454 }
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0454 }
            r13 = 2
            r7[r13] = r9     // Catch:{ all -> 0x0454 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0454 }
            r13 = 3
            r7[r13] = r9     // Catch:{ all -> 0x0454 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r30)     // Catch:{ all -> 0x0454 }
            r14 = 4
            r7[r14] = r9     // Catch:{ all -> 0x0454 }
            r9 = 5
            r7[r9] = r3     // Catch:{ all -> 0x0454 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0454 }
            r9 = 6
            r7[r9] = r3     // Catch:{ all -> 0x0454 }
            r3 = 7
            r16 = 0
            java.lang.Integer r22 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0454 }
            r7[r3] = r22     // Catch:{ all -> 0x0454 }
            r3 = 8
            java.lang.Long r22 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0454 }
            r7[r3] = r22     // Catch:{ all -> 0x0454 }
            r3 = 9
            java.lang.Long r22 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0454 }
            r7[r3] = r22     // Catch:{ all -> 0x0454 }
            r3 = 10
            r16 = 0
            java.lang.Integer r22 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0454 }
            r7[r3] = r22     // Catch:{ all -> 0x0454 }
            r3 = 11
            java.lang.Integer r22 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0454 }
            r7[r3] = r22     // Catch:{ all -> 0x0454 }
            r3 = 12
            int r22 = f55462q     // Catch:{ all -> 0x0454 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0454 }
            r7[r3] = r22     // Catch:{ all -> 0x0454 }
            r3 = 13
            r7[r3] = r2     // Catch:{ all -> 0x0454 }
            r3 = 14
            r7[r3] = r2     // Catch:{ all -> 0x0454 }
            r3 = 15
            int r22 = f55461p     // Catch:{ all -> 0x0454 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0454 }
            r7[r3] = r22     // Catch:{ all -> 0x0454 }
            r3 = 16
            java.lang.Integer r22 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0454 }
            r7[r3] = r22     // Catch:{ all -> 0x0454 }
            r3 = 17
            java.lang.Integer r22 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0454 }
            r7[r3] = r22     // Catch:{ all -> 0x0454 }
            r3 = 18
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r15)     // Catch:{ all -> 0x0454 }
            r7[r3] = r15     // Catch:{ all -> 0x0454 }
            r3 = 19
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r29)     // Catch:{ all -> 0x0454 }
            r7[r3] = r15     // Catch:{ all -> 0x0454 }
            r3 = 20
            r7[r3] = r32     // Catch:{ all -> 0x0454 }
            r3 = 21
            r7[r3] = r2     // Catch:{ all -> 0x0454 }
            r2 = 22
            r7[r2] = r4     // Catch:{ all -> 0x0454 }
            r2 = 18218(0x472a, float:2.5529E-41)
            r0.mo160131h(r2, r7)     // Catch:{ all -> 0x0454 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0454 }
            r0.<init>()     // Catch:{ all -> 0x0454 }
            java.lang.String r2 = "reportMainCellExposeForAff username %s, mid %d, firstTimeExpose %d, pos %d, unReadCountReport %d, currentTime %d, msgId="
            r0.append(r2)     // Catch:{ all -> 0x0454 }
            r2 = r18
            r0.append(r2)     // Catch:{ all -> 0x0454 }
            java.lang.String r2 = ", lastRecCardId="
            r0.append(r2)     // Catch:{ all -> 0x0454 }
            r2 = r32
            r0.append(r2)     // Catch:{ all -> 0x0454 }
            java.lang.String r2 = ", rankSessionId="
            r0.append(r2)     // Catch:{ all -> 0x0454 }
            r0.append(r4)     // Catch:{ all -> 0x0454 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0454 }
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x0454 }
            r3 = 0
            r2[r3] = r24     // Catch:{ all -> 0x0454 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0454 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x0454 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0454 }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x0454 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)     // Catch:{ all -> 0x0454 }
            r2[r13] = r1     // Catch:{ all -> 0x0454 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0454 }
            r2[r14] = r1     // Catch:{ all -> 0x0454 }
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0454 }
            r3 = 5
            r2[r3] = r1     // Catch:{ all -> 0x0454 }
            r1 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r0, r2)     // Catch:{ all -> 0x0450 }
            f55447b = r11     // Catch:{ all -> 0x0450 }
            f55449d = r10     // Catch:{ all -> 0x0450 }
            f55450e = r24     // Catch:{ all -> 0x0450 }
            f55448c = r5     // Catch:{ all -> 0x0450 }
            com.tencent.mm.storage.z0 r0 = com.tencent.p014mm.storage.C19641z0.f55645a     // Catch:{ all -> 0x0450 }
            boolean r0 = r0.mo25865h()     // Catch:{ all -> 0x0450 }
            if (r0 == 0) goto L_0x044d
            te3.lp3 r0 = f55452g     // Catch:{ all -> 0x0450 }
            if (r0 == 0) goto L_0x0443
            java.util.LinkedList<te3.lp3> r2 = f55453h     // Catch:{ all -> 0x0450 }
            r2.add(r0)     // Catch:{ all -> 0x0450 }
        L_0x0443:
            com.tencent.mm.storage.c0$a r0 = com.tencent.p014mm.storage.C19601c0.C19602a.REDDOT_REPORT_ACT_TYPE_EXPOSE_BOX     // Catch:{ all -> 0x0450 }
            r2 = r28
            r2.mo25724m(r0)     // Catch:{ all -> 0x044b }
            goto L_0x0473
        L_0x044b:
            r0 = move-exception
            goto L_0x0464
        L_0x044d:
            r2 = r28
            goto L_0x0473
        L_0x0450:
            r0 = move-exception
            r2 = r28
            goto L_0x0464
        L_0x0454:
            r0 = move-exception
            r2 = r28
            r1 = r20
            goto L_0x0464
        L_0x045a:
            r0 = move-exception
            r2 = r28
        L_0x045d:
            r1 = r9
            goto L_0x0464
        L_0x045f:
            r2 = r7
            return
        L_0x0461:
            r0 = move-exception
            r2 = r7
            goto L_0x045d
        L_0x0464:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "reportMainCellExposeForAff exp %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r0, r3)
        L_0x0473:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19601c0.mo25727p(java.lang.String, int, com.tencent.mm.storage.h2, int):void");
    }

    /* renamed from: q */
    public final void mo25728q(long j, long j2) {
        String valueOf = String.valueOf(j);
        C22221f fVar = C22221f.f62962a;
        long decodeLong = fVar.decodeLong(mo25712a(valueOf), 0);
        if (decodeLong > 0 && j2 - decodeLong > 0) {
            long decodeLong2 = (fVar.decodeLong(mo25715d(valueOf), 0) + j2) - decodeLong;
            ((MultiProcessMMKV) fVar.getSlotForWrite()).encode(mo25715d(valueOf), decodeLong2);
            Log.m105926v("MicroMsg.BizMainCellExposeHelper", "updateExposeTime totalExposeTime=" + decodeLong2);
        }
    }
}
