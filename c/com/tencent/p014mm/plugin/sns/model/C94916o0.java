package com.tencent.p014mm.plugin.sns.model;

import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import ds2.C97535h;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import jr2.C99014h;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C35296p0;
import p196ln.C76706g;
import p196ln.C76708i;
import rx3.C13604l;
import sp2.C101690c;
import sp2.C64132a;
import sp2.C64143b;
import te3.t84;
import te3.u84;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.sns.model.o0 */
public class C94916o0 extends C117747y implements C1311n, C99014h {

    /* renamed from: A */
    public static Vector<String> f275055A = new Vector<>();

    /* renamed from: d */
    public C47350c f275056d;

    /* renamed from: e */
    public boolean f275057e;

    /* renamed from: f */
    public long f275058f = 0;

    /* renamed from: g */
    public long f275059g = 0;

    /* renamed from: h */
    public long f275060h = 0;

    /* renamed from: i */
    public long f275061i = 0;

    /* renamed from: j */
    public String f275062j = "";

    /* renamed from: n */
    public final int f275063n;

    /* renamed from: o */
    public boolean f275064o = false;

    /* renamed from: p */
    public boolean f275065p = false;

    /* renamed from: q */
    public int f275066q = 0;

    /* renamed from: r */
    public int f275067r = 0;

    /* renamed from: s */
    public C11385n f275068s;

    /* renamed from: t */
    public int f275069t = 0;

    /* renamed from: u */
    public int f275070u = 0;

    /* renamed from: v */
    public boolean f275071v = false;

    /* renamed from: w */
    public C35296p0 f275072w = null;

    /* renamed from: x */
    public long f275073x = 0;

    /* renamed from: y */
    public String f275074y = "";

    /* renamed from: z */
    public boolean f275075z = false;

    /* renamed from: com.tencent.mm.plugin.sns.model.o0$a */
    public class C71193a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f206044d;

        public C71193a(C94916o0 o0Var, String str) {
            this.f206044d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine$1");
            Log.m105924i("MicroMsg.NetSceneSnsTimeLine", "checkUpdate avatar:" + this.f206044d);
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106823Jc(this.f206044d);
            ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93575b(this.f206044d);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine$1");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0351 A[LOOP:1: B:81:0x034b->B:83:0x0351, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03b4 A[LOOP:2: B:85:0x03ae->B:87:0x03b4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0448  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94916o0(long r20, long r22, int r24) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r4 = r22
            r6 = r24
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            r19.<init>()
            r8 = 0
            r1.f275058f = r8
            r1.f275059g = r8
            r1.f275060h = r8
            r1.f275061i = r8
            java.lang.String r0 = ""
            r1.f275062j = r0
            r10 = 0
            r1.f275064o = r10
            r1.f275065p = r10
            r1.f275066q = r10
            r1.f275067r = r10
            r1.f275069t = r10
            r1.f275070u = r10
            r1.f275071v = r10
            r11 = 0
            r1.f275072w = r11
            r1.f275073x = r8
            r1.f275074y = r0
            r1.f275075z = r10
            java.lang.System.currentTimeMillis()
            ob0.c$b r12 = new ob0.c$b
            r12.<init>()
            te3.t84 r13 = new te3.t84
            r13.<init>()
            r12.f127066a = r13
            te3.u84 r13 = new te3.u84
            r13.<init>()
            r12.f127067b = r13
            java.lang.String r13 = "/cgi-bin/micromsg-bin/mmsnstimeline"
            r12.f127068c = r13
            r13 = 211(0xd3, float:2.96E-43)
            r12.f127069d = r13
            r13 = 98
            r12.f127070e = r13
            r13 = 1000000098(0x3b9aca62, float:0.004723833)
            r12.f127071f = r13
            ob0.c r12 = r12.mo72403a()
            r1.f275056d = r12
            int r12 = vr2.C102236a0.m134711F()
            r1.f275059g = r2
            r13 = 1
            int r14 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0071
            int r14 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0071
            r14 = 1
            goto L_0x0072
        L_0x0071:
            r14 = 0
        L_0x0072:
            r1.f275057e = r14
            r14 = 2
            r1.f275063n = r14
            ob0.c r15 = r1.f275056d
            ob0.c$c r15 = r15.f127055a
            pe3.a r15 = r15.f127080a
            te3.t84 r15 = (te3.t84) r15
            r15.f299498j = r12
            r15.f299493e = r2
            com.tencent.mm.plugin.sns.model.p1$a r16 = com.tencent.p014mm.plugin.sns.model.C94866e1.dy0()
            int r10 = r16.mo6417h()
            os2.e0 r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            boolean r14 = r1.f275057e
            if (r14 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r8 = r2
        L_0x0095:
            long r8 = r11.r50(r8, r10, r13)
            r1.f275060h = r8
            r15.f299494f = r8
            java.lang.String r11 = "@__weixintimtline"
            int r8 = com.tencent.p014mm.plugin.sns.model.C43038l.m46675c(r8, r2, r11)
            r15.f299495g = r8
            r15.f299503r = r4
            java.lang.Class<hy.o0> r8 = p166hy.C98567o0.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            hy.o0 r8 = (p166hy.C98567o0) r8
            boolean r8 = r8.mo137597wZ()
            if (r8 == 0) goto L_0x0145
            java.lang.String r8 = "getInstance"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            java.lang.String r14 = "access$getInstance$cp"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r13)
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r17 = com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.f279760q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            if (r17 == 0) goto L_0x0143
            boolean r4 = r1.f275057e
            if (r4 == 0) goto L_0x013f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r13)
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r4 = com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.f279760q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            r4.getClass()
            java.lang.String r5 = "getUnReadMinId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            zt2.i r8 = r4.f279764g
            boolean r8 = r8.isEmpty()
            r9 = 1
            r8 = r8 ^ r9
            java.lang.String r9 = "MicroMsg.Improve.UnreadUIC"
            if (r8 == 0) goto L_0x0116
            zt2.i r4 = r4.f279764g
            java.lang.Object r4 = r4.firstKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "getUnReadMinId "
            r8.append(r14)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            long r8 = vr2.C102236a0.m134706B0(r4)
            r17 = r8
            goto L_0x0139
        L_0x0116:
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r2 = 0
            r8 = 1
            long r17 = r4.c40(r2, r8, r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getUnReadMinId from db:"
            r2.append(r3)
            java.lang.String r3 = vr2.C102236a0.m134765q0(r17)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
        L_0x0139:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r13)
            r2 = r17
            goto L_0x0141
        L_0x013f:
            r2 = 0
        L_0x0141:
            r15.f299504s = r2
        L_0x0143:
            r2 = 1
            goto L_0x0199
        L_0x0145:
            boolean r2 = r1.f275057e
            if (r2 == 0) goto L_0x0194
            com.tencent.mm.plugin.sns.model.y1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r2.getClass()
            java.lang.String r3 = "getLastFaultMinId"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            long r8 = r2.f275370y
            ms2.m r5 = r2.f275366u
            if (r5 == 0) goto L_0x0190
            java.util.LinkedList<ms2.n> r5 = r5.f292913d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
            if (r5 != 0) goto L_0x0190
            ms2.m r2 = r2.f275366u
            java.util.LinkedList<ms2.n> r2 = r2.f292913d
            java.util.Iterator r2 = r2.iterator()
        L_0x016d:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0190
            java.lang.Object r5 = r2.next()
            ms2.n r5 = (ms2.C99968n) r5
            java.util.LinkedList<java.lang.Long> r13 = r5.f292916d
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r13)
            if (r13 != 0) goto L_0x016d
            java.util.LinkedList<java.lang.Long> r2 = r5.f292916d
            java.lang.Object r2 = r2.peekLast()
            java.lang.Long r2 = (java.lang.Long) r2
            long r8 = r2.longValue()
            r13 = 1
            long r8 = r8 - r13
        L_0x0190:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x0196
        L_0x0194:
            r8 = 0
        L_0x0196:
            r15.f299504s = r8
            goto L_0x0143
        L_0x0199:
            if (r6 != r2) goto L_0x019d
            r2 = 1
            goto L_0x019e
        L_0x019d:
            r2 = 0
        L_0x019e:
            r15.f299502q = r2
            r1.f275070u = r6
            os2.q0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.jy0()
            r2.getClass()
            java.lang.String r3 = "getFirstFinishGroup"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            zh3.f r2 = r2.f94560d
            java.lang.String r5 = "select *,rowid from SnsWsFoldGroup  where SnsWsFoldGroup.state=1 order by SnsWsFoldGroup.top desc limit 1"
            r8 = 0
            r9 = 2
            android.database.Cursor r2 = r2.rawQuery(r5, r8, r9)
            if (r2 == 0) goto L_0x01d1
            boolean r5 = r2.moveToFirst()
            if (r5 == 0) goto L_0x01cc
            os2.p0 r5 = new os2.p0
            r5.<init>()
            r5.convertFrom(r2)
            goto L_0x01cd
        L_0x01cc:
            r5 = r8
        L_0x01cd:
            r2.close()
            goto L_0x01d2
        L_0x01d1:
            r5 = r8
        L_0x01d2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r1.f275072w = r5
            java.lang.String r2 = "MicroMsg.NetSceneSnsTimeLine"
            if (r5 != 0) goto L_0x01e2
            r3 = 0
            r15.f299505t = r3
            r15.f299507v = r3
            goto L_0x0211
        L_0x01e2:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.field_size
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            os2.p0 r4 = r1.f275072w
            long r4 = r4.field_top
            java.lang.String r4 = vr2.C102236a0.m134763p0(r4)
            r5 = 1
            r3[r5] = r4
            os2.p0 r4 = r1.f275072w
            long r4 = r4.field_bottom
            java.lang.String r4 = vr2.C102236a0.m134763p0(r4)
            r5 = 2
            r3[r5] = r4
            java.lang.String r4 = "firstFinishWsGroup.size:%s, firstFinishWsGroup.top:%s, firstFinishWsGroup.bottom:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            os2.p0 r3 = r1.f275072w
            long r3 = r3.field_top
            r15.f299505t = r3
            r15.f299507v = r3
        L_0x0211:
            int r3 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120221i()
            r15.f299506u = r3
            os2.d0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            os2.c0 r3 = r3.mo139782Yt(r11)
            boolean r4 = r1.f275057e
            if (r4 == 0) goto L_0x0257
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r5 = 1
            r8 = 0
            long r8 = r4.r50(r8, r5, r5)
            r1.f275061i = r8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "newerid "
            r4.append(r5)
            long r8 = r1.f275061i
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            long r4 = r1.f275061i
            r15.f299496h = r4
            java.lang.String r4 = r3.field_md5
            r1.f275062j = r4
            if (r4 != 0) goto L_0x0253
            r1.f275062j = r0
        L_0x0253:
            java.lang.String r0 = r1.f275062j
            r15.f299492d = r0
        L_0x0257:
            di3.d r0 = di3.C86312j.m106911c(r7)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_sns_session_size
            r8 = 102400(0x19000, double:5.05923E-319)
            long r4 = r0.mo58777He(r4, r8)
            byte[] r0 = r3.field_adsession
            if (r0 == 0) goto L_0x028a
            int r8 = r0.length
            long r8 = (long) r8
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x0271
            goto L_0x028a
        L_0x0271:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r0
            java.lang.String r0 = "request adsession %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r5)
            te3.qv3 r0 = new te3.qv3
            r0.<init>()
            byte[] r3 = r3.field_adsession
            r0.mo73350k(r3)
            r15.f299497i = r0
            goto L_0x0297
        L_0x028a:
            te3.qv3 r0 = new te3.qv3
            r0.<init>()
            r3 = 0
            byte[] r4 = new byte[r3]
            r0.mo73350k(r4)
            r15.f299497i = r0
        L_0x0297:
            r3 = r20
            r1.f275058f = r3
            sp2.c r0 = sp2.C101690c.f297710a
            java.lang.String r5 = "AdPullRequestHelper"
            java.lang.String r8 = "isAdPullEnable"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            di3.d r0 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x02cb }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x02cb }
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_sns_ad_timeline_pull_switch_android     // Catch:{ all -> 0x02cb }
            r13 = 0
            int r11 = r0.mo58779Qe(r11, r13)     // Catch:{ all -> 0x02cb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c9 }
            r0.<init>()     // Catch:{ all -> 0x02c9 }
            java.lang.String r13 = "getAdPullEnable called "
            r0.append(r13)     // Catch:{ all -> 0x02c9 }
            r0.append(r11)     // Catch:{ all -> 0x02c9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02c9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ all -> 0x02c9 }
            goto L_0x02e1
        L_0x02c9:
            r0 = move-exception
            goto L_0x02cd
        L_0x02cb:
            r0 = move-exception
            r11 = 0
        L_0x02cd:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "getAdPullEnable, exp="
            r13.append(r14)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x02e1:
            if (r11 <= 0) goto L_0x02e5
            r0 = 1
            goto L_0x02e6
        L_0x02e5:
            r0 = 0
        L_0x02e6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            r1.f275075z = r0
            if (r0 == 0) goto L_0x02f7
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.f275074y = r0
        L_0x02f7:
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = r1.f275074y
            r8 = 0
            r0[r8] = r5
            java.lang.String r5 = "NetSceneSnsTimeLine ad UUID= %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r0)
            te3.qv3 r0 = new te3.qv3
            r0.<init>()
            java.lang.String r5 = r1.f275074y
            byte[] r5 = lo2.C99569s.m129960b(r5)
            r0.mo73350k(r5)
            r15.f299508w = r0
            di3.d r0 = di3.C86312j.m106911c(r7)
            h81.h r0 = (h81.C32735h) r0
            h81.h$b r5 = h81.C32735h.C32738b.clicfg_sns_ws_un_fold_total_switch
            r7 = 0
            int r0 = r0.mo58779Qe(r5, r7)
            r15.f299488A = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "SwitchOfWsNotFold = "
            r0.append(r5)
            int r5 = r15.f299488A
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.sns.model.k2 r0 = com.tencent.p014mm.plugin.sns.model.C94891k2.f274975a
            r0.getClass()
            java.lang.String r0 = "getUnFoldWsUserName"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsWsFoldManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r7 = com.tencent.p014mm.plugin.sns.model.C94891k2.f274980f
            java.util.Iterator r7 = r7.iterator()
        L_0x034b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x036f
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "unFoldWsUserName = "
            r9.append(r11)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "MicroMsg.SnsWsFoldManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            goto L_0x034b
        L_0x036f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r7 = com.tencent.p014mm.plugin.sns.model.C94891k2.f274980f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "NetSceneSnsTimeLine wsUnFoldList size = "
            r0.append(r5)
            int r5 = r7.size()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            int r0 = r7.size()
            r15.f299489B = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "WsNotFoldListCount = "
            r0.append(r5)
            int r5 = r15.f299489B
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r5 = 0
        L_0x03ae:
            int r8 = r7.size()
            if (r5 >= r8) goto L_0x03e0
            te3.rv3 r8 = new te3.rv3
            r8.<init>()
            java.lang.Object r9 = r7.get(r5)
            java.lang.String r9 = (java.lang.String) r9
            r8.f141175d = r9
            r9 = 1
            r8.f141176e = r9
            r0.add(r8)
            r8 = 2
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r13 = 0
            r11[r13] = r8
            java.lang.Object r8 = r7.get(r5)
            r11[r9] = r8
            java.lang.String r8 = "wsUnFoldList[%d] = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r11)
            int r5 = r5 + 1
            goto L_0x03ae
        L_0x03e0:
            r13 = 0
            r15.f299490C = r0
            r15.f299491D = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r19.hashCode()
            r0.append(r2)
            java.lang.String r2 = " This req nextCount: "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = " max:"
            r0.append(r2)
            java.lang.String r2 = vr2.C102236a0.m134765q0(r20)
            r0.append(r2)
            java.lang.String r2 = " min:"
            r0.append(r2)
            long r2 = r1.f275060h
            java.lang.String r2 = vr2.C102236a0.m134765q0(r2)
            r0.append(r2)
            java.lang.String r2 = " ReqTime:"
            r0.append(r2)
            int r2 = r15.f299495g
            r0.append(r2)
            java.lang.String r2 = " nettype: "
            r0.append(r2)
            r0.append(r12)
            java.lang.String r2 = " MinIdForCheckUnread:"
            r0.append(r2)
            long r2 = r15.f299504s
            java.lang.String r2 = vr2.C102236a0.m134765q0(r2)
            r0.append(r2)
            java.lang.String r2 = " pullType:"
            r0.append(r2)
            java.lang.String r2 = "getLogType"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            if (r6 != 0) goto L_0x0448
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.String r2 = "pull-down"
            goto L_0x0462
        L_0x0448:
            r4 = 1
            if (r6 != r4) goto L_0x0452
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.String r2 = "pull-up"
            goto L_0x0462
        L_0x0452:
            r4 = 2
            if (r6 != r4) goto L_0x045c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.String r2 = "unread"
            goto L_0x0462
        L_0x045c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.String r2 = "none"
        L_0x0462:
            r0.append(r2)
            java.lang.String r2 = " minIdForPrePage:"
            r0.append(r2)
            r2 = r22
            r0.append(r2)
            java.lang.String r2 = " NearbyFoldId:"
            r0.append(r2)
            long r2 = r15.f299505t
            r0.append(r2)
            java.lang.String r2 = " FoldSectionSize："
            r0.append(r2)
            int r2 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120221i()
            r0.append(r2)
            java.lang.String r2 = " FirstPageMd5："
            r0.append(r2)
            java.lang.String r2 = r15.f299492d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.Improve.DataFlow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            boolean r0 = r1.f275057e
            if (r0 == 0) goto L_0x04a2
            long r2 = java.lang.System.currentTimeMillis()
            r1.f275073x = r2
        L_0x04a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94916o0.<init>(long, long, int):void");
    }

    /* renamed from: j1 */
    public static synchronized boolean m120461j1(String str) {
        synchronized (C94916o0.class) {
            SnsMethodCalculate.markStartTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            if (f275055A.contains(str)) {
                SnsMethodCalculate.markEndTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
                return false;
            }
            f275055A.add(str);
            SnsMethodCalculate.markEndTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            return true;
        }
    }

    /* renamed from: n1 */
    public static synchronized boolean m120462n1(String str) {
        synchronized (C94916o0.class) {
            SnsMethodCalculate.markStartTimeMs("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            f275055A.remove(str);
            SnsMethodCalculate.markEndTimeMs("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        }
        return true;
    }

    /* renamed from: C */
    public String mo131161C() {
        SnsMethodCalculate.markStartTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        SnsMethodCalculate.markEndTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return "";
    }

    /* renamed from: C0 */
    public boolean mo131162C0() {
        SnsMethodCalculate.markStartTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        SnsMethodCalculate.markEndTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return false;
    }

    /* renamed from: D0 */
    public boolean mo131163D0() {
        SnsMethodCalculate.markStartTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        SnsMethodCalculate.markEndTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return false;
    }

    /* renamed from: M0 */
    public int mo131164M0() {
        SnsMethodCalculate.markStartTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        SnsMethodCalculate.markEndTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return -1;
    }

    /* renamed from: Z0 */
    public boolean mo131165Z0() {
        SnsMethodCalculate.markStartTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        boolean z = this.f275057e;
        SnsMethodCalculate.markEndTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return z;
    }

    /* renamed from: a0 */
    public long mo131166a0() {
        SnsMethodCalculate.markStartTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        long j = this.f275060h;
        SnsMethodCalculate.markEndTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return j;
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        this.f275068s = nVar;
        t84 t84 = (t84) this.f275056d.f127055a.f127080a;
        LinkedList<Long> y = SnsReportHelper.f275506m0.mo131392y();
        if (y == null || y.isEmpty()) {
            t84.f299499n = 0;
        } else {
            t84.f299500o = y;
            t84.f299499n = y.size();
            Log.m105919d("MicroMsg.NetSceneSnsTimeLine", "req sns timeline had exposure feed id %s", y);
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_UPDATE_SNS_TIMELINE_SCENE_INT;
        t84.f299501p = i.mo119689j(aVar, 0);
        C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
        Log.m105925i("MicroMsg.NetSceneSnsTimeLine", "req sns timeline read exposure size[%d] update scene[%d]", Integer.valueOf(t84.f299499n), Integer.valueOf(t84.f299501p));
        if (this.f275057e && this.f275075z && !Util.isNullOrNil(this.f275074y)) {
            String str = this.f275074y;
            C101690c cVar = C101690c.f297710a;
            SnsMethodCalculate.markStartTimeMs("requestPullAd", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            Log.m105924i("AdPullRequestHelper", "requestPullAd() called with: uuid = " + str);
            if (str == null) {
                SnsMethodCalculate.markEndTimeMs("requestPullAd", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            } else {
                Boolean bool = Boolean.FALSE;
                C101690c.m133574d(str, new C13604l(bool, null));
                C101690c.m133573c(str, new C13604l(bool, null));
                ((C53884f2) C53895h.m60466d(C53930o0.m60554a(C53872d1.f151119c.plus(C101690c.f297716g)), (C66212f) null, (C53934p0) null, new C64132a(str, t84, (C15601d<? super C64132a>) null), 3, (Object) null)).mo74515E(new C64143b(str));
                SnsMethodCalculate.markEndTimeMs("requestPullAd", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            }
        }
        int dispatch = dispatch(gVar, this.f275056d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return dispatch;
    }

    /* renamed from: g1 */
    public boolean mo131167g1() {
        SnsMethodCalculate.markStartTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        SnsMethodCalculate.markEndTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return false;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return 211;
    }

    public String getUserName() {
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return "@__weixintimtline";
    }

    /* renamed from: k */
    public boolean mo131169k() {
        SnsMethodCalculate.markStartTimeMs("isUpFetchFinish", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        boolean z = this.f275071v;
        SnsMethodCalculate.markEndTimeMs("isUpFetchFinish", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return z;
    }

    /* renamed from: k1 */
    public u84 mo131170k1() {
        SnsMethodCalculate.markStartTimeMs("getResponse", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        u84 u84 = (u84) this.f275056d.f127056b.f127083a;
        SnsMethodCalculate.markEndTimeMs("getResponse", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return u84;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:78|79|(3:80|81|(4:83|(1:88)(1:87)|89|90)(1:92))|98|(2:100|(1:102))|103|104|105|106|107|76) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x03e2 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x038b A[Catch:{ all -> 0x0454 }] */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo131171l1(int r24, int r25, java.lang.String r26, te3.u84 r27) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            java.lang.String r0 = "handleNormalResp"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            te3.j84 r0 = r5.f299596j
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "serverConfig  "
            r6.append(r7)
            te3.j84 r7 = r5.f299596j
            int r7 = r7.f135924e
            r6.append(r7)
            java.lang.String r7 = " "
            r6.append(r7)
            te3.j84 r7 = r5.f299596j
            int r7 = r7.f135923d
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            te3.j84 r0 = r5.f299596j
            int r6 = r0.f135924e
            kr2.C76634a.f224255a = r6
            if (r6 > 0) goto L_0x0049
            r6 = 2147483647(0x7fffffff, float:NaN)
            kr2.C76634a.f224255a = r6
        L_0x0049:
            int r0 = r0.f135923d
            com.tencent.p014mm.storage.C96986x1.f284186a = r0
        L_0x004d:
            int r0 = r5.f299594h
            r1.f275066q = r0
            int r0 = r5.f299595i
            r1.f275067r = r0
            java.lang.String r0 = "MicroMsg.Improve.DataFlow"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "for same md5 count: "
            r6.append(r7)
            int r7 = r5.f299594h
            r6.append(r7)
            java.lang.String r7 = " , objCount: "
            r6.append(r7)
            int r7 = r5.f299591e
            r6.append(r7)
            java.lang.String r7 = ", controlFlag: "
            r6.append(r7)
            int r7 = r5.f299595i
            r6.append(r7)
            java.lang.String r7 = ", FirstPageMd5: "
            r6.append(r7)
            java.lang.String r7 = r5.f299590d
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            int r0 = r5.f299591e
            r1.f275069t = r0
            long r6 = r1.f275059g
            java.lang.String r6 = vr2.C102236a0.m134763p0(r6)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            boolean r0 = r0.isEmpty()
            r7 = 0
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = "MicroMsg.Improve.DataFlow"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "resp size:"
            r8.append(r9)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r5.f299592f
            int r9 = r9.size()
            r8.append(r9)
            java.lang.String r9 = ", resp Max:"
            r8.append(r9)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r5.f299592f
            java.lang.Object r9 = r9.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r9 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r9
            long r9 = r9.f283891Id
            r8.append(r9)
            java.lang.String r9 = " "
            r8.append(r9)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r5.f299592f
            java.lang.Object r9 = r9.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r9 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r9
            long r9 = r9.f283891Id
            java.lang.String r9 = vr2.C102236a0.m134765q0(r9)
            r8.append(r9)
            java.lang.String r9 = ", resp Min:"
            r8.append(r9)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r5.f299592f
            java.lang.Object r9 = r9.getLast()
            com.tencent.mm.protocal.protobuf.SnsObject r9 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r9
            long r9 = r9.f283891Id
            r8.append(r9)
            java.lang.String r9 = " "
            r8.append(r9)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r5.f299592f
            java.lang.Object r9 = r9.getLast()
            com.tencent.mm.protocal.protobuf.SnsObject r9 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r9
            long r9 = r9.f283891Id
            java.lang.String r9 = vr2.C102236a0.m134765q0(r9)
            r8.append(r9)
            java.lang.String r9 = ", adListSize:"
            r8.append(r9)
            java.util.LinkedList<te3.c4> r9 = r5.f299598o
            if (r9 != 0) goto L_0x010f
            r9 = 0
            goto L_0x0113
        L_0x010f:
            int r9 = r9.size()
        L_0x0113:
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            goto L_0x013f
        L_0x011e:
            java.lang.String r0 = "MicroMsg.Improve.DataFlow"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "resp is Empty, adListSize:"
            r8.append(r9)
            java.util.LinkedList<te3.c4> r9 = r5.f299598o
            if (r9 != 0) goto L_0x0131
            r9 = 0
            goto L_0x0135
        L_0x0131:
            int r9 = r9.size()
        L_0x0135:
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
        L_0x013f:
            java.util.LinkedList<te3.f20> r0 = r5.f299603t
            int r8 = r5.f299602s
            lo2.C99570t.m129966a(r0, r8, r7)
            java.lang.String r0 = r1.f275062j
            java.lang.String r8 = r5.f299590d
            boolean r0 = r0.equals(r8)
            r8 = 2
            r11 = 1
            if (r0 == 0) goto L_0x01ea
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            boolean r5 = r1.f275057e
            if (r5 == 0) goto L_0x015d
            r9 = 0
            goto L_0x015f
        L_0x015d:
            long r9 = r1.f275058f
        L_0x015f:
            int r5 = r1.f275066q
            long r5 = r0.r50(r9, r5, r11)
            r1.f275060h = r5
            java.lang.String r0 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.String r9 = "md5 is no change!! the new minid:%s"
            java.lang.Object[] r10 = new java.lang.Object[r11]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r10[r7] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r10)
            java.lang.String r0 = "checkLocalData"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r6.getClass()
            java.lang.String r9 = "getTimeLineCountWithLimit"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            java.lang.String r12 = "getCheckTimeLineDataCountSql"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
            os2.C100400e0.m131327CP()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
            os2.k0 r6 = r6.f294108d
            java.lang.String r12 = "select snsId from SnsInfo  where  (sourceType & 2 != 0 )  limit 10"
            r13 = 0
            android.database.Cursor r6 = r6.rawQuery(r12, r13, r8)
        L_0x01a1:
            boolean r8 = r6.moveToNext()
            if (r8 == 0) goto L_0x01aa
            int r7 = r7 + 1
            goto L_0x01a1
        L_0x01aa:
            r6.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            r6 = 10
            if (r7 >= r6) goto L_0x01b9
            if (r7 <= 0) goto L_0x01b9
            r1.f275065p = r11
            goto L_0x01bd
        L_0x01b9:
            if (r7 != 0) goto L_0x01bd
            r1.f275064o = r11
        L_0x01bd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
            java.lang.String r0 = "@__weixintimtline"
            m120462n1(r0)
            ob0.n r0 = r1.f275068s
            r0.onSceneEnd(r2, r3, r4, r1)
            boolean r0 = r1.f275075z
            if (r0 == 0) goto L_0x01e2
            java.lang.String r0 = r1.f275074y
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01e2
            java.lang.String r0 = r1.f275074y
            rx3.l r2 = new rx3.l
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.<init>(r3, r13)
            sp2.C101690c.m133574d(r0, r2)
        L_0x01e2:
            java.lang.String r0 = "handleNormalResp"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x01ea:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0203
            os2.d0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r12 = "@__weixintimtline"
            java.lang.String r13 = r5.f299590d
            te3.qv3 r14 = r5.f299599p
            byte[] r14 = sf0.C48374j0.m53715d(r14)
            r0.mo139789mL(r12, r13, r14)
        L_0x0203:
            java.lang.String r0 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "resp list size "
            r12.append(r13)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r13 = r5.f299592f
            int r13 = r13.size()
            r12.append(r13)
            java.lang.String r13 = " adsize : "
            r12.append(r13)
            int r13 = r5.f299597n
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            boolean r0 = r1.f275057e
            if (r0 == 0) goto L_0x0237
            long r12 = java.lang.System.currentTimeMillis()
            long r14 = r1.f275073x
            long r12 = r12 - r14
            r15 = r12
            goto L_0x0239
        L_0x0237:
            r15 = 0
        L_0x0239:
            java.util.LinkedList<te3.c4> r0 = r5.f299598o
            if (r0 == 0) goto L_0x045e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x045e
            java.lang.Object r12 = com.tencent.p014mm.plugin.sns.model.C94833a.f274740a
            monitor-enter(r12)
            int r0 = com.tencent.p014mm.plugin.sns.model.C94833a.m120155h()     // Catch:{ all -> 0x0454 }
            if (r0 != r11) goto L_0x024e
            r0 = 1
            goto L_0x024f
        L_0x024e:
            r0 = 0
        L_0x024f:
            java.lang.String r13 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0454 }
            r14.<init>()     // Catch:{ all -> 0x0454 }
            java.lang.String r9 = "adDynamic, graySwitch="
            r14.append(r9)     // Catch:{ all -> 0x0454 }
            r14.append(r0)     // Catch:{ all -> 0x0454 }
            java.lang.String r9 = r14.toString()     // Catch:{ all -> 0x0454 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r9)     // Catch:{ all -> 0x0454 }
            if (r0 == 0) goto L_0x02a8
            java.util.LinkedList<te3.c4> r0 = r5.f299598o     // Catch:{ all -> 0x0454 }
            if (r0 == 0) goto L_0x02a8
            r0 = 0
        L_0x026c:
            java.util.LinkedList<te3.c4> r9 = r5.f299598o     // Catch:{ all -> 0x0454 }
            int r9 = r9.size()     // Catch:{ all -> 0x0454 }
            if (r0 >= r9) goto L_0x02a8
            java.util.LinkedList<te3.c4> r9 = r5.f299598o     // Catch:{ all -> 0x0454 }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ all -> 0x0454 }
            te3.c4 r9 = (te3.C48952c4) r9     // Catch:{ all -> 0x0454 }
            boolean r9 = com.tencent.p014mm.plugin.sns.model.C94833a.m120169v(r9)     // Catch:{ all -> 0x0454 }
            java.lang.String r10 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0454 }
            r13.<init>()     // Catch:{ all -> 0x0454 }
            java.lang.String r14 = "adDynamic, updateSuccess="
            r13.append(r14)     // Catch:{ all -> 0x0454 }
            r13.append(r9)     // Catch:{ all -> 0x0454 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0454 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)     // Catch:{ all -> 0x0454 }
            r10 = 1802(0x70a, float:2.525E-42)
            if (r9 == 0) goto L_0x02a0
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0454 }
            r9.mo175911u(r10, r7)     // Catch:{ all -> 0x0454 }
            goto L_0x02a5
        L_0x02a0:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0454 }
            r9.mo175911u(r10, r11)     // Catch:{ all -> 0x0454 }
        L_0x02a5:
            int r0 = r0 + 1
            goto L_0x026c
        L_0x02a8:
            java.util.LinkedList<te3.c4> r0 = r5.f299598o     // Catch:{ all -> 0x0454 }
            if (r0 == 0) goto L_0x040b
            int r0 = r0.size()     // Catch:{ all -> 0x0454 }
            if (r0 <= 0) goto L_0x040b
            lo2.C99569s.m129959a()     // Catch:{ all -> 0x0454 }
            java.util.LinkedList<te3.c4> r0 = r5.f299598o     // Catch:{ all -> 0x0454 }
            int r9 = r0.size()     // Catch:{ all -> 0x0454 }
            r10 = 0
        L_0x02bc:
            java.util.LinkedList<te3.c4> r0 = r5.f299598o     // Catch:{ all -> 0x0454 }
            int r0 = r0.size()     // Catch:{ all -> 0x0454 }
            if (r10 >= r0) goto L_0x03f0
            java.util.LinkedList<te3.c4> r0 = r5.f299598o     // Catch:{ all -> 0x0454 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0454 }
            r13 = r0
            te3.c4 r13 = (te3.C48952c4) r13     // Catch:{ all -> 0x0454 }
            te3.rv3 r0 = r13.f131490e     // Catch:{ all -> 0x0454 }
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)     // Catch:{ all -> 0x0454 }
            te3.h64 r14 = r13.f131489d     // Catch:{ all -> 0x0454 }
            te3.rv3 r14 = r14.f134465e     // Catch:{ all -> 0x0454 }
            java.lang.String r14 = sf0.C48374j0.m53718g(r14)     // Catch:{ all -> 0x0454 }
            te3.h64 r11 = r13.f131489d     // Catch:{ all -> 0x0454 }
            com.tencent.mm.protocal.protobuf.SnsObject r11 = r11.f134464d     // Catch:{ all -> 0x0454 }
            te3.qv3 r11 = r11.ObjectDesc     // Catch:{ all -> 0x0454 }
            java.lang.String r11 = sf0.C48374j0.m53717f(r11)     // Catch:{ all -> 0x0454 }
            java.lang.String r7 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0454 }
            r8.<init>()     // Catch:{ all -> 0x0454 }
            r20 = r9
            java.lang.String r9 = "skXml "
            r8.append(r9)     // Catch:{ all -> 0x0454 }
            r8.append(r0)     // Catch:{ all -> 0x0454 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0454 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)     // Catch:{ all -> 0x0454 }
            java.lang.String r7 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0454 }
            r8.<init>()     // Catch:{ all -> 0x0454 }
            java.lang.String r9 = "adXml "
            r8.append(r9)     // Catch:{ all -> 0x0454 }
            r8.append(r14)     // Catch:{ all -> 0x0454 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0454 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)     // Catch:{ all -> 0x0454 }
            java.lang.String r7 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0454 }
            r8.<init>()     // Catch:{ all -> 0x0454 }
            java.lang.String r9 = "snsXml "
            r8.append(r9)     // Catch:{ all -> 0x0454 }
            r8.append(r11)     // Catch:{ all -> 0x0454 }
            java.lang.String r9 = "\r\n"
            r8.append(r9)     // Catch:{ all -> 0x0454 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0454 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)     // Catch:{ all -> 0x0454 }
            r7 = 2
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x035d }
            r9 = 0
            r8[r9] = r0     // Catch:{ all -> 0x035d }
            r9 = 1
            r8[r9] = r14     // Catch:{ all -> 0x035d }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r8)     // Catch:{ all -> 0x035d }
            if (r8 != 0) goto L_0x035a
            te3.h64 r8 = r13.f131489d     // Catch:{ all -> 0x035d }
            if (r8 == 0) goto L_0x0352
            com.tencent.mm.protocal.protobuf.SnsObject r8 = r8.f134464d     // Catch:{ all -> 0x035d }
            if (r8 == 0) goto L_0x0352
            long r8 = r8.f283891Id     // Catch:{ all -> 0x035d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x035d }
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r8)     // Catch:{ all -> 0x035d }
            goto L_0x0354
        L_0x0352:
            r8 = 0
        L_0x0354:
            vr2.C102259p.m134830c(r8, r0, r14)     // Catch:{ all -> 0x0358 }
            goto L_0x037f
        L_0x0358:
            r0 = move-exception
            goto L_0x0360
        L_0x035a:
            r8 = 0
            goto L_0x037f
        L_0x035d:
            r0 = move-exception
            r8 = 0
        L_0x0360:
            java.lang.String r11 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0454 }
            r7.<init>()     // Catch:{ all -> 0x0454 }
            r21 = r8
            java.lang.String r8 = "reportAdPullException: "
            r7.append(r8)     // Catch:{ all -> 0x0454 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0454 }
            r7.append(r0)     // Catch:{ all -> 0x0454 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0454 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ all -> 0x0454 }
            r8 = r21
        L_0x037f:
            te3.h64 r0 = r13.f131489d     // Catch:{ all -> 0x0454 }
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r0.f134464d     // Catch:{ all -> 0x0454 }
            java.lang.String r0 = r0.Username     // Catch:{ all -> 0x0454 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x0454 }
            if (r7 != 0) goto L_0x03d2
            boolean r7 = vr2.C102260r.m134841J(r14)     // Catch:{ all -> 0x0454 }
            java.lang.String r11 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0454 }
            r14.<init>()     // Catch:{ all -> 0x0454 }
            java.lang.String r2 = "checkUpdate contact:"
            r14.append(r2)     // Catch:{ all -> 0x0454 }
            r14.append(r0)     // Catch:{ all -> 0x0454 }
            java.lang.String r2 = ", isUsePreferedInfo="
            r14.append(r2)     // Catch:{ all -> 0x0454 }
            r14.append(r7)     // Catch:{ all -> 0x0454 }
            java.lang.String r2 = ", snsId="
            r14.append(r2)     // Catch:{ all -> 0x0454 }
            java.lang.String r2 = vr2.C102236a0.m134763p0(r8)     // Catch:{ all -> 0x0454 }
            r14.append(r2)     // Catch:{ all -> 0x0454 }
            java.lang.String r2 = r14.toString()     // Catch:{ all -> 0x0454 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)     // Catch:{ all -> 0x0454 }
            if (r7 != 0) goto L_0x03d2
            eb0.w2 r2 = eb0.C31519v2.m39436a()     // Catch:{ all -> 0x0454 }
            java.lang.String r7 = ""
            r2.mo55987c(r0, r7)     // Catch:{ all -> 0x0454 }
            zt3.t r2 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0454 }
            com.tencent.mm.plugin.sns.model.o0$a r7 = new com.tencent.mm.plugin.sns.model.o0$a     // Catch:{ all -> 0x0454 }
            r7.<init>(r1, r0)     // Catch:{ all -> 0x0454 }
            r8 = 10000(0x2710, double:4.9407E-320)
            zt3.j r2 = (zt3.C119157j) r2     // Catch:{ all -> 0x0454 }
            r2.mo183878i(r7, r8)     // Catch:{ all -> 0x0454 }
        L_0x03d2:
            r2 = 1
            jq2.C99001u.m128918d(r13, r2)     // Catch:{ all -> 0x0454 }
            java.lang.String r0 = ""
            te3.h64 r2 = r13.f131489d     // Catch:{ Exception -> 0x03e2 }
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r2.f134464d     // Catch:{ Exception -> 0x03e2 }
            long r7 = r2.f283891Id     // Catch:{ Exception -> 0x03e2 }
            java.lang.String r0 = vr2.C102236a0.m134765q0(r7)     // Catch:{ Exception -> 0x03e2 }
        L_0x03e2:
            pq2.C35614a.m40778b(r0)     // Catch:{ all -> 0x0454 }
            int r10 = r10 + 1
            r2 = r24
            r9 = r20
            r7 = 0
            r8 = 2
            r11 = 1
            goto L_0x02bc
        L_0x03f0:
            r20 = r9
            java.util.LinkedList<te3.c4> r0 = r5.f299598o     // Catch:{ all -> 0x0454 }
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r2 = r5.f299592f     // Catch:{ all -> 0x0454 }
            boolean r7 = r1.f275057e     // Catch:{ all -> 0x0454 }
            int r8 = r1.f275070u     // Catch:{ all -> 0x0454 }
            com.tencent.p014mm.plugin.sns.model.C94833a.m120156i(r0, r2, r7, r8)     // Catch:{ all -> 0x0454 }
            java.util.LinkedList<te3.c4> r0 = r5.f299598o     // Catch:{ all -> 0x0454 }
            os2.C100405h.m131357Lo(r0)     // Catch:{ all -> 0x0454 }
            java.util.LinkedList<te3.c4> r0 = r5.f299598o     // Catch:{ all -> 0x0454 }
            r2 = 0
            ps2.C100897v.m132252a(r0, r2)     // Catch:{ all -> 0x0454 }
            r19 = r20
            goto L_0x0414
        L_0x040b:
            java.lang.String r0 = "AdPassThroughInfoHelper"
            java.lang.String r2 = "NetSceneSnsTimeLine, resp AdvertiseList size is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)     // Catch:{ all -> 0x0454 }
            r19 = 0
        L_0x0414:
            monitor-exit(r12)     // Catch:{ all -> 0x0454 }
            boolean r0 = r1.f275057e
            if (r0 == 0) goto L_0x0476
            boolean r0 = r1.f275075z
            if (r0 == 0) goto L_0x0431
            java.lang.String r0 = r1.f275074y
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0431
            java.lang.String r0 = r1.f275074y
            rx3.l r2 = new rx3.l
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r2.<init>(r7, r5)
            sp2.C101690c.m133574d(r0, r2)
        L_0x0431:
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r1.f275073x
            long r17 = r7 - r9
            pq2.a r0 = pq2.C35614a.f95198a
            java.lang.String r0 = "reportTimelineRequestCost"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            zt3.t r7 = zt3.C119157j.f356862d
            pq2.c r8 = new pq2.c
            r14 = r8
            r14.<init>(r15, r17, r19)
            zt3.j r7 = (zt3.C119157j) r7
            r7.mo183875f(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x0476
        L_0x0454:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0454 }
            java.lang.String r2 = "handleNormalResp"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r0
        L_0x045e:
            boolean r0 = r1.f275075z
            if (r0 == 0) goto L_0x0476
            java.lang.String r0 = r1.f275074y
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0476
            java.lang.String r0 = r1.f275074y
            rx3.l r2 = new rx3.l
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r2.<init>(r7, r5)
            sp2.C101690c.m133574d(r0, r2)
        L_0x0476:
            rp2.C101417a.m133069b(r27)
            int r0 = r5.f299597n
            if (r0 != 0) goto L_0x04b6
            java.util.LinkedList<te3.un3> r0 = r5.f299601r
            if (r0 == 0) goto L_0x04b6
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x04b6
            java.lang.Object r2 = com.tencent.p014mm.plugin.sns.model.C94833a.f274740a
            monitor-enter(r2)
            java.lang.String r0 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.String r7 = "recv %d recommend"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x04ac }
            int r8 = r5.f299600q     // Catch:{ all -> 0x04ac }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04ac }
            r10 = 0
            r9[r10] = r8     // Catch:{ all -> 0x04ac }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r9)     // Catch:{ all -> 0x04ac }
            java.util.LinkedList<te3.un3> r0 = r5.f299601r     // Catch:{ all -> 0x04ac }
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r7 = r5.f299592f     // Catch:{ all -> 0x04ac }
            com.tencent.p014mm.plugin.sns.model.C94833a.m120157j(r0, r7)     // Catch:{ all -> 0x04ac }
            java.util.LinkedList<te3.un3> r0 = r5.f299601r     // Catch:{ all -> 0x04ac }
            com.tencent.p014mm.plugin.sns.model.C94833a.m120160m(r0)     // Catch:{ all -> 0x04ac }
            monitor-exit(r2)     // Catch:{ all -> 0x04ac }
            goto L_0x04b6
        L_0x04ac:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04ac }
            java.lang.String r2 = "handleNormalResp"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r0
        L_0x04b6:
            boolean r0 = r1.f275057e
            if (r0 != 0) goto L_0x0505
            java.lang.String r0 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "np resp list size "
            r2.append(r7)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r7 = r5.f299592f
            int r7 = r7.size()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x04ee
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r0.xx0(r6)
            r2 = 1
            r1.f275064o = r2
            long r5 = r1.f275059g
            r1.f275060h = r5
            goto L_0x04f1
        L_0x04ee:
            r1.mo131172m1(r5, r6)
        L_0x04f1:
            java.lang.String r0 = "@__weixintimtline"
            m120462n1(r0)
            ob0.n r0 = r1.f275068s
            r2 = r24
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "handleNormalResp"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0505:
            r2 = r24
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r7 = r5.f299592f
            java.util.Iterator r7 = r7.iterator()
        L_0x0512:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0528
            java.lang.Object r8 = r7.next()
            com.tencent.mm.protocal.protobuf.SnsObject r8 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r8
            long r8 = r8.f283891Id
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0.add(r8)
            goto L_0x0512
        L_0x0528:
            com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent r7 = new com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent
            r7.<init>()
            com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent$a r8 = r7.f265199d
            r8.f265200a = r0
            r7.publish()
            ob0.c r0 = r1.f275056d
            ob0.c$d r0 = r0.f127056b
            int r0 = r0.getRetCode()
            r7 = 207(0xcf, float:2.9E-43)
            if (r0 != r7) goto L_0x059b
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0554
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r0.wx0()
            long r5 = r1.f275059g
            r1.f275060h = r5
            goto L_0x0586
        L_0x0554:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r7 = r5.f299592f
            java.lang.Object r7 = r7.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r7 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r7
            long r7 = r7.f283891Id
            java.lang.String r7 = vr2.C102236a0.m134763p0(r7)
            r0.vx0(r7)
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r7 = r5.f299592f
            java.lang.Object r7 = r7.getLast()
            com.tencent.mm.protocal.protobuf.SnsObject r7 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r7
            long r7 = r7.f283891Id
            java.lang.String r7 = vr2.C102236a0.m134763p0(r7)
            r0.xx0(r7)
            r1.mo131172m1(r5, r6)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            ps2.C100897v.m132254c(r0)
        L_0x0586:
            r5 = 1
            r1.f275064o = r5
            java.lang.String r0 = "@__weixintimtline"
            m120462n1(r0)
            ob0.n r0 = r1.f275068s
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "handleNormalResp"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x059b:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x05b2
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r0.wx0()
            long r5 = r1.f275059g
            r1.f275060h = r5
            r5 = 1
            r1.f275064o = r5
            goto L_0x05ba
        L_0x05b2:
            r1.mo131172m1(r5, r6)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r5.f299592f
            ps2.C100897v.m132254c(r0)
        L_0x05ba:
            java.lang.String r0 = "@__weixintimtline"
            m120462n1(r0)
            ob0.n r0 = r1.f275068s
            r0.onSceneEnd(r2, r3, r4, r1)
            java.lang.String r0 = "handleNormalResp"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94916o0.mo131171l1(int, int, java.lang.String, te3.u84):void");
    }

    /* renamed from: m1 */
    public final void mo131172m1(u84 u84, String str) {
        SnsMethodCalculate.markStartTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        C94897n1.m120370h("@__weixintimtline", this.f275063n, u84.f299592f, str);
        this.f275060h = u84.f299592f.getLast().f283891Id;
        long j = this.f275059g;
        if (j == 0) {
            this.f275059g = u84.f299592f.getFirst().f283891Id;
        } else {
            this.f275059g = C43038l.m46673a(j);
        }
        C43038l.m46676d("@__weixintimtline", this.f275059g, this.f275060h, u84.f299593g);
        try {
            Iterator<SnsObject> it = u84.f299592f.iterator();
            while (it.hasNext()) {
                SnsObject next = it.next();
                if (next.NoChange == 0) {
                    SnsInfo SE = C94866e1.Yx0().mo139806SE(next.f283891Id);
                    if (SE != null) {
                        if (SE.getTimeLine() != null) {
                            C97535h.f286229a.mo136806f(SE);
                            if (SE.getTypeFlag() == 15) {
                                try {
                                    String str2 = SE.getTimeLine().ContentObj.f298427h.get(0).f298692g;
                                    C115669n.INSTANCE.mo160131h(14388, Long.valueOf(next.f283891Id), 4, str2, 0);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        SnsMethodCalculate.markEndTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
    }

    /* renamed from: n0 */
    public boolean mo131173n0() {
        SnsMethodCalculate.markStartTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        boolean z = true;
        if (this.f275070u != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r21, int r22, int r23, java.lang.String r24, com.tencent.p014mm.network.C114799u r25, byte[] r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "onGYNetEnd"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r7 = r20.hashCode()
            r0.append(r7)
            java.lang.String r7 = " netId : "
            r0.append(r7)
            r7 = r21
            r0.append(r7)
            java.lang.String r7 = " errType :"
            r0.append(r7)
            r0.append(r2)
            java.lang.String r7 = " errCode: "
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = " errMsg :"
            r0.append(r7)
            r0.append(r4)
            java.lang.String r7 = " resp retCode:"
            r0.append(r7)
            qe3.w$e r7 = r25.getRespObj()
            int r7 = r7.getRetCode()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "MicroMsg.Improve.DataFlow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r0 = r25
            ob0.c r0 = (ob0.C47350c) r0
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            r8 = r0
            te3.u84 r8 = (te3.u84) r8
            r12 = 0
            r13 = 1
            if (r8 == 0) goto L_0x00b8
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r14 = r8.f299592f
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r14)
            if (r14 != 0) goto L_0x00b8
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r14 = r8.f299592f
            java.util.Iterator r14 = r14.iterator()
        L_0x0074:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00b8
            java.lang.Object r15 = r14.next()
            com.tencent.mm.protocal.protobuf.SnsObject r15 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r15
            if (r15 == 0) goto L_0x0074
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r9 = r15.CreateTime
            long r10 = (long) r9
            java.lang.String r9 = vr2.C102236a0.m134772u(r10)
            r0[r12] = r9
            int r9 = r15.CreateTime
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r13] = r9
            long r9 = r15.f283891Id
            java.lang.String r9 = vr2.C102236a0.m134763p0(r9)
            r10 = 2
            r0[r10] = r9
            long r9 = r15.f283891Id
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 3
            r0[r10] = r9
            java.lang.String r9 = r15.Username
            r10 = 4
            r0[r10] = r9
            java.lang.String r9 = r15.Nickname
            r10 = 5
            r0[r10] = r9
            java.lang.String r9 = "[SnsFeedInfo|s] createTime:%s[%s] snsId:[%s, %s] userName[%s, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r0)
            goto L_0x0074
        L_0x00b8:
            qe3.w$e r0 = r25.getRespObj()
            int r0 = r0.getRetCode()
            r7 = 207(0xcf, float:2.9E-43)
            java.lang.String r9 = "@__weixintimtline"
            if (r0 == r7) goto L_0x00dc
            qe3.w$e r0 = r25.getRespObj()
            int r0 = r0.getRetCode()
            if (r0 == 0) goto L_0x00dc
            m120462n1(r9)
            ob0.n r0 = r1.f275068s
            r0.onSceneEnd(r2, r3, r4, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x00dc:
            java.lang.String r0 = "SnsMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r7 = "SnsMMKVDeleteTable"
            r0.encode((java.lang.String) r7, (boolean) r12)
            boolean r0 = r1.f275057e
            java.lang.String r7 = "MicroMsg.NetSceneSnsTimeLine"
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = "updateUnreadNewId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            if (r8 == 0) goto L_0x0157
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.util.LinkedList<java.lang.Long> r10 = r8.f299605v
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11[r12] = r10
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r10 = r8.f299592f
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11[r13] = r10
            java.lang.String r10 = "updateUnreadNewId IdListForCheckUnread.size:%s ObjectList.size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r11)
            com.tencent.mm.plugin.sns.model.y1 r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            java.util.LinkedList<java.lang.Long> r11 = r8.f299605v
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r14 = r8.f299592f
            java.util.LinkedList<java.lang.Integer> r15 = r8.f299606w
            r10.getClass()
            java.lang.String r13 = "updateUnreadList"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
            java.lang.Class<hy.o0> r18 = p166hy.C98567o0.class
            di3.d r18 = di3.C86312j.m106911c(r18)
            hy.o0 r18 = (p166hy.C98567o0) r18
            boolean r18 = r18.mo137597wZ()
            if (r18 == 0) goto L_0x0145
            java.lang.String r10 = "MicroMsg.SnsUnreadTipManager"
            java.lang.String r11 = "updateUnreadList: use improveUI, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x0157
        L_0x0145:
            r18 = r5
            com.tencent.mm.sdk.platformtools.MMHandler r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
            com.tencent.mm.plugin.sns.model.a2 r2 = new com.tencent.mm.plugin.sns.model.a2
            r2.<init>(r10, r11, r14, r15)
            r5.post(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x0159
        L_0x0157:
            r18 = r5
        L_0x0159:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            com.tencent.mm.plugin.sns.model.t1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
            r0.getClass()
            java.lang.String r2 = "onFp"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            boolean r10 = com.tencent.p014mm.plugin.sns.model.C94950t1.f275246j
            if (r10 != 0) goto L_0x0173
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            goto L_0x01a0
        L_0x0173:
            java.lang.String r10 = "MicroMsg.SnsRetryEditTipManager"
            java.lang.String r11 = "onFp: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            java.lang.Runnable r10 = r0.f275252e
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r10)
            java.lang.String r10 = "removeDraftTmpFile"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r5)
            java.lang.String r11 = r0.f275249b
            com.tencent.mm.sdk.platformtools.MMHandler r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.my0()
            com.tencent.mm.plugin.sns.model.u1 r13 = new com.tencent.mm.plugin.sns.model.u1
            r13.<init>(r0, r11)
            r12.post(r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r5)
            r0.mo131281e()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            goto L_0x01a0
        L_0x019e:
            r18 = r5
        L_0x01a0:
            java.lang.String r2 = "handleWsFoldGroup"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r6)
            if (r8 == 0) goto L_0x0414
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r8.f299592f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 != 0) goto L_0x0206
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r5 = r8.f299592f
            java.util.Iterator r5 = r5.iterator()
        L_0x01ba:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x01ea
            java.lang.Object r10 = r5.next()
            com.tencent.mm.protocal.protobuf.SnsObject r10 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r10
            if (r10 == 0) goto L_0x01ba
            int r11 = r10.ExtFlag
            int r12 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274990d
            java.lang.String r12 = "isWsFold"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            r11 = r11 & 16
            if (r11 <= 0) goto L_0x01da
            r11 = 1
            goto L_0x01db
        L_0x01da:
            r11 = 0
        L_0x01db:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            if (r11 == 0) goto L_0x01ba
            long r10 = r10.f283891Id
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r0.add(r10)
            goto L_0x01ba
        L_0x01ea:
            java.util.Iterator r0 = r0.iterator()
        L_0x01ee:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0206
            java.lang.Object r5 = r0.next()
            java.lang.Long r5 = (java.lang.Long) r5
            os2.o0 r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.iy0()
            long r11 = r5.longValue()
            r10.mo60193qq(r11)
            goto L_0x01ee
        L_0x0206:
            te3.j35 r0 = new te3.j35     // Catch:{ Exception -> 0x0403 }
            r0.<init>()     // Catch:{ Exception -> 0x0403 }
            te3.qv3 r5 = r8.f299607x     // Catch:{ Exception -> 0x0403 }
            byte[] r5 = sf0.C48374j0.m53715d(r5)     // Catch:{ Exception -> 0x0403 }
            r0.parseFrom(r5)     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList<te3.ng4> r5 = r0.f135853e     // Catch:{ Exception -> 0x0403 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)     // Catch:{ Exception -> 0x0403 }
            if (r5 != 0) goto L_0x036a
            java.util.LinkedList<te3.ng4> r5 = r0.f135853e     // Catch:{ Exception -> 0x0403 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0403 }
            int r10 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120221i()     // Catch:{ Exception -> 0x0403 }
            int r5 = r5 / r10
            java.lang.String r10 = "wsInfo.timeline_idx.size:%s, SnsConfig.wsFoldGroupSize:%s, tmp:%s"
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList<te3.ng4> r11 = r0.f135853e     // Catch:{ Exception -> 0x0403 }
            int r11 = r11.size()     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0403 }
            r13 = 0
            r12[r13] = r11     // Catch:{ Exception -> 0x0403 }
            int r11 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120221i()     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0403 }
            r13 = 1
            r12[r13] = r11     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0403 }
            r13 = 2
            r12[r13] = r11     // Catch:{ Exception -> 0x0403 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r12)     // Catch:{ Exception -> 0x0403 }
            if (r5 != 0) goto L_0x02b2
            os2.p0 r5 = new os2.p0     // Catch:{ Exception -> 0x0403 }
            r5.<init>()     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList<te3.ng4> r10 = r0.f135853e     // Catch:{ Exception -> 0x0403 }
            java.lang.Object r10 = r10.getFirst()     // Catch:{ Exception -> 0x0403 }
            te3.ng4 r10 = (te3.ng4) r10     // Catch:{ Exception -> 0x0403 }
            long r10 = r10.f138597d     // Catch:{ Exception -> 0x0403 }
            r5.field_top = r10     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList<te3.ng4> r10 = r0.f135853e     // Catch:{ Exception -> 0x0403 }
            java.lang.Object r10 = r10.getLast()     // Catch:{ Exception -> 0x0403 }
            te3.ng4 r10 = (te3.ng4) r10     // Catch:{ Exception -> 0x0403 }
            long r10 = r10.f138597d     // Catch:{ Exception -> 0x0403 }
            r5.field_bottom = r10     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList<te3.ng4> r10 = r0.f135853e     // Catch:{ Exception -> 0x0403 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0403 }
            r5.field_size = r10     // Catch:{ Exception -> 0x0403 }
            int r11 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120221i()     // Catch:{ Exception -> 0x0403 }
            if (r10 != r11) goto L_0x029f
            java.lang.String r10 = "insert topId:%s, bottomId:%s"
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0403 }
            long r13 = r5.field_top     // Catch:{ Exception -> 0x0403 }
            java.lang.String r11 = vr2.C102236a0.m134763p0(r13)     // Catch:{ Exception -> 0x0403 }
            r13 = 0
            r12[r13] = r11     // Catch:{ Exception -> 0x0403 }
            long r13 = r5.field_bottom     // Catch:{ Exception -> 0x0403 }
            java.lang.String r11 = vr2.C102236a0.m134763p0(r13)     // Catch:{ Exception -> 0x0403 }
            r13 = 1
            r12[r13] = r11     // Catch:{ Exception -> 0x0403 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r12)     // Catch:{ Exception -> 0x0403 }
            os2.q0 r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.jy0()     // Catch:{ Exception -> 0x0403 }
            r10.mo60194jo(r5)     // Catch:{ Exception -> 0x0403 }
            goto L_0x036a
        L_0x029f:
            java.lang.String r10 = "insert skipped, field_size:%s"
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0403 }
            int r5 = r5.field_size     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0403 }
            r11 = 0
            r12[r11] = r5     // Catch:{ Exception -> 0x0403 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r12)     // Catch:{ Exception -> 0x0403 }
            goto L_0x036a
        L_0x02b2:
            if (r5 <= 0) goto L_0x036a
            r10 = 0
        L_0x02b5:
            if (r10 >= r5) goto L_0x036a
            java.util.LinkedList<te3.ng4> r11 = r0.f135853e     // Catch:{ Exception -> 0x0403 }
            int r11 = r11.size()     // Catch:{ Exception -> 0x0403 }
            r12 = 1
            int r11 = r11 - r12
            int r13 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120221i()     // Catch:{ Exception -> 0x0403 }
            int r13 = r13 * r10
            int r11 = r11 - r13
            int r13 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120221i()     // Catch:{ Exception -> 0x0403 }
            int r13 = r11 - r13
            int r13 = r13 + r12
            if (r13 >= 0) goto L_0x02d0
            r13 = 0
        L_0x02d0:
            os2.p0 r12 = new os2.p0     // Catch:{ Exception -> 0x0403 }
            r12.<init>()     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList<te3.ng4> r14 = r0.f135853e     // Catch:{ Exception -> 0x0403 }
            java.lang.Object r14 = r14.get(r13)     // Catch:{ Exception -> 0x0403 }
            te3.ng4 r14 = (te3.ng4) r14     // Catch:{ Exception -> 0x0403 }
            long r14 = r14.f138597d     // Catch:{ Exception -> 0x0403 }
            r12.field_top = r14     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList<te3.ng4> r14 = r0.f135853e     // Catch:{ Exception -> 0x0403 }
            java.lang.Object r14 = r14.get(r11)     // Catch:{ Exception -> 0x0403 }
            te3.ng4 r14 = (te3.ng4) r14     // Catch:{ Exception -> 0x0403 }
            long r14 = r14.f138597d     // Catch:{ Exception -> 0x0403 }
            r12.field_bottom = r14     // Catch:{ Exception -> 0x0403 }
            int r14 = r11 - r13
            r15 = 1
            int r14 = r14 + r15
            r12.field_size = r14     // Catch:{ Exception -> 0x0403 }
            int r15 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120221i()     // Catch:{ Exception -> 0x0403 }
            if (r14 != r15) goto L_0x0336
            java.lang.String r14 = "insert index:%s, topIndex:%s, bottomIndex:%s, topId:%s, bottomId:%s"
            r21 = r5
            r15 = 5
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0403 }
            r17 = 0
            r5[r17] = r19     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0403 }
            r16 = 1
            r5[r16] = r13     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0403 }
            r13 = 2
            r5[r13] = r11     // Catch:{ Exception -> 0x0403 }
            long r3 = r12.field_top     // Catch:{ Exception -> 0x0403 }
            java.lang.String r3 = vr2.C102236a0.m134763p0(r3)     // Catch:{ Exception -> 0x0403 }
            r4 = 3
            r5[r4] = r3     // Catch:{ Exception -> 0x0403 }
            long r3 = r12.field_bottom     // Catch:{ Exception -> 0x0403 }
            java.lang.String r3 = vr2.C102236a0.m134763p0(r3)     // Catch:{ Exception -> 0x0403 }
            r4 = 4
            r5[r4] = r3     // Catch:{ Exception -> 0x0403 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r14, r5)     // Catch:{ Exception -> 0x0403 }
            os2.q0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.jy0()     // Catch:{ Exception -> 0x0403 }
            r3.mo60194jo(r12)     // Catch:{ Exception -> 0x0403 }
            r4 = 4
            r12 = 3
            goto L_0x0360
        L_0x0336:
            r21 = r5
            r15 = 5
            java.lang.String r3 = "insert skipped, index:%s, topIndex:%s, bottomIndex:%s, field_size:%s"
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0403 }
            r17 = 0
            r5[r17] = r14     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0403 }
            r14 = 1
            r5[r14] = r13     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0403 }
            r13 = 2
            r5[r13] = r11     // Catch:{ Exception -> 0x0403 }
            int r11 = r12.field_size     // Catch:{ Exception -> 0x0403 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0403 }
            r12 = 3
            r5[r12] = r11     // Catch:{ Exception -> 0x0403 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r5)     // Catch:{ Exception -> 0x0403 }
        L_0x0360:
            int r10 = r10 + 1
            r5 = r21
            r3 = r23
            r4 = r24
            goto L_0x02b5
        L_0x036a:
            java.util.LinkedList<te3.zx4> r3 = r0.f135852d     // Catch:{ Exception -> 0x0403 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)     // Catch:{ Exception -> 0x0403 }
            if (r3 != 0) goto L_0x0414
            java.util.LinkedList<te3.zx4> r0 = r0.f135852d     // Catch:{ Exception -> 0x0403 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0403 }
        L_0x0378:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x0403 }
            if (r3 == 0) goto L_0x0414
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x0403 }
            te3.zx4 r3 = (te3.zx4) r3     // Catch:{ Exception -> 0x0403 }
            if (r3 == 0) goto L_0x0378
            java.util.LinkedList<java.lang.Long> r4 = r3.f146276g     // Catch:{ Exception -> 0x0403 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)     // Catch:{ Exception -> 0x0403 }
            if (r4 != 0) goto L_0x0378
            com.tencent.mm.protocal.protobuf.SnsObject r4 = r3.f146275f     // Catch:{ Exception -> 0x0403 }
            if (r4 == 0) goto L_0x0378
            long r4 = r3.f146273d     // Catch:{ Exception -> 0x0403 }
            int r10 = r3.f146274e     // Catch:{ Exception -> 0x0403 }
            com.tencent.mm.protocal.protobuf.SnsObject r11 = new com.tencent.mm.protocal.protobuf.SnsObject     // Catch:{ Exception -> 0x0403 }
            r11.<init>()     // Catch:{ Exception -> 0x0403 }
            com.tencent.mm.protocal.protobuf.SnsObject r12 = r3.f146275f     // Catch:{ Exception -> 0x0403 }
            byte[] r12 = r12.toByteArray()     // Catch:{ Exception -> 0x0403 }
            r11.parseFrom(r12)     // Catch:{ Exception -> 0x0403 }
            te3.k94 r11 = new te3.k94     // Catch:{ Exception -> 0x0403 }
            r11.<init>()     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList<java.lang.Long> r12 = r11.f183902d     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList<java.lang.Long> r13 = r3.f146276g     // Catch:{ Exception -> 0x0403 }
            r12.addAll(r13)     // Catch:{ Exception -> 0x0403 }
            java.lang.String r12 = r3.f146278i     // Catch:{ Exception -> 0x0403 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0403 }
            r13.<init>()     // Catch:{ Exception -> 0x0403 }
            java.lang.String r14 = "sns fold group complete_wording = "
            r13.append(r14)     // Catch:{ Exception -> 0x0403 }
            r13.append(r12)     // Catch:{ Exception -> 0x0403 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0403 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)     // Catch:{ Exception -> 0x0403 }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ Exception -> 0x0403 }
            if (r13 == 0) goto L_0x03d2
            java.lang.String r12 = ""
            r11.f183903e = r12     // Catch:{ Exception -> 0x0403 }
            goto L_0x03d4
        L_0x03d2:
            r11.f183903e = r12     // Catch:{ Exception -> 0x0403 }
        L_0x03d4:
            os2.n0 r12 = new os2.n0     // Catch:{ Exception -> 0x0403 }
            r12.<init>()     // Catch:{ Exception -> 0x0403 }
            r12.field_groupId = r4     // Catch:{ Exception -> 0x0403 }
            r12.field_groupTime = r10     // Catch:{ Exception -> 0x0403 }
            byte[] r4 = r11.toByteArray()     // Catch:{ Exception -> 0x0403 }
            r12.field_groupStrcut = r4     // Catch:{ Exception -> 0x0403 }
            os2.o0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.iy0()     // Catch:{ Exception -> 0x0403 }
            r4.mo60191Lo(r12)     // Catch:{ Exception -> 0x0403 }
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch:{ Exception -> 0x0403 }
            r4.<init>()     // Catch:{ Exception -> 0x0403 }
            com.tencent.mm.protocal.protobuf.SnsObject r5 = r3.f146275f     // Catch:{ Exception -> 0x0403 }
            r4.add(r5)     // Catch:{ Exception -> 0x0403 }
            r5 = 128(0x80, float:1.794E-43)
            com.tencent.mm.protocal.protobuf.SnsObject r3 = r3.f146275f     // Catch:{ Exception -> 0x0403 }
            long r10 = r3.f283891Id     // Catch:{ Exception -> 0x0403 }
            java.lang.String r3 = vr2.C102236a0.m134763p0(r10)     // Catch:{ Exception -> 0x0403 }
            com.tencent.p014mm.plugin.sns.model.C94897n1.m120370h(r9, r5, r4, r3)     // Catch:{ Exception -> 0x0403 }
            goto L_0x0378
        L_0x0403:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r4[r3] = r0
            java.lang.String r0 = "parse WSInfo err: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r0, r4)
        L_0x0414:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
            java.lang.String r0 = "handleSnsVideoOptions"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            if (r8 == 0) goto L_0x0448
            te3.j84 r2 = r8.f299596j
            if (r2 == 0) goto L_0x0448
            te3.d94 r2 = r2.f135927h
            if (r2 == 0) goto L_0x0448
            int r2 = r2.f132203d
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "handleSnsVideoOptions >> bitRateMode: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r4)
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_BIT_RATE_MODE_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo119677K(r4, r2)
        L_0x0448:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            int r0 = r1.f275070u
            r2 = 1
            if (r0 != r2) goto L_0x0494
            java.lang.String r0 = "handleUpFetchResp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r3 = r8.f299592f
            int r3 = r3.size()
            if (r3 != 0) goto L_0x046e
            r1.f275071v = r2
            m120462n1(r9)
            ob0.n r2 = r1.f275068s
            r3 = r22
            r4 = r23
            r5 = r24
            r2.onSceneEnd(r3, r4, r5, r1)
            goto L_0x0490
        L_0x046e:
            r3 = r22
            r4 = r23
            r5 = r24
            r2 = 0
            r1.f275071v = r2
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r2 = r8.f299592f
            java.lang.Object r2 = r2.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r2 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r2
            long r10 = r2.f283891Id
            java.lang.String r2 = vr2.C102236a0.m134763p0(r10)
            r1.mo131172m1(r8, r2)
            m120462n1(r9)
            ob0.n r2 = r1.f275068s
            r2.onSceneEnd(r3, r4, r5, r1)
        L_0x0490:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            goto L_0x04f0
        L_0x0494:
            r3 = r22
            r4 = r23
            r5 = r24
            r2 = 2
            if (r0 != r2) goto L_0x04ed
            java.lang.String r0 = "handleUnreadPreloadResp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r2 = r8.f299592f
            int r2 = r2.size()
            if (r2 != 0) goto L_0x04b3
            m120462n1(r9)
            ob0.n r2 = r1.f275068s
            r2.onSceneEnd(r3, r4, r5, r1)
            goto L_0x04e9
        L_0x04b3:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r2 = r8.f299592f
            java.util.Iterator r2 = r2.iterator()
        L_0x04b9:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x04d8
            java.lang.Object r10 = r2.next()
            com.tencent.mm.protocal.protobuf.SnsObject r10 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r10
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            long r13 = r10.f283891Id
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r13 = 0
            r12[r13] = r10
            java.lang.String r10 = "preload unread sns.id:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r12)
            goto L_0x04b9
        L_0x04d8:
            long r10 = r1.f275059g
            java.lang.String r2 = vr2.C102236a0.m134763p0(r10)
            r1.mo131172m1(r8, r2)
            m120462n1(r9)
            ob0.n r2 = r1.f275068s
            r2.onSceneEnd(r3, r4, r5, r1)
        L_0x04e9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            goto L_0x04f0
        L_0x04ed:
            r1.mo131171l1(r3, r4, r5, r8)
        L_0x04f0:
            r2 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94916o0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    /* renamed from: p0 */
    public long mo131174p0() {
        SnsMethodCalculate.markStartTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        SnsMethodCalculate.markEndTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return 0;
    }

    /* renamed from: t0 */
    public boolean mo131175t0() {
        SnsMethodCalculate.markStartTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        boolean z = this.f275064o;
        SnsMethodCalculate.markEndTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return z;
    }

    /* renamed from: w */
    public boolean mo131176w() {
        SnsMethodCalculate.markStartTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        boolean z = this.f275065p;
        SnsMethodCalculate.markEndTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return z;
    }

    /* renamed from: y */
    public int mo131177y() {
        SnsMethodCalculate.markStartTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        int i = this.f275069t;
        SnsMethodCalculate.markEndTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
        return i;
    }
}
