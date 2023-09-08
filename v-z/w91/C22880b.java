package w91;

import com.tencent.p014mm.autogen.events.WeChatFrontBackEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20449a;
import d91.C20450b;
import e91.C116711b;
import gy3.C87412m;
import h81.C20928j;
import h81.C8496k;
import i91.C21062c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import op3.C117877b;
import op3.C117878c;
import op3.C117882j;
import p1054vg.C102190i;
import r91.C22217a;
import t91.C22466j;
import te3.C118467t1;
import te3.C22507la3;
import te3.C22531uq1;
import te3.fh4;
import u91.C22618a;
import v91.C22730d;
import v91.C22731f;
import x91.C118865a;
import x91.C23072e;
import z91.C23462b;

/* renamed from: w91.b */
public final class C22880b {

    /* renamed from: g */
    public static volatile C22880b f65770g;

    /* renamed from: a */
    public final C22879a f65771a = new C22879a();

    /* renamed from: b */
    public C20928j.C20931c f65772b;

    /* renamed from: c */
    public List<C20928j.C20932d> f65773c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public boolean f65774d = false;

    /* renamed from: e */
    public boolean f65775e = false;

    /* renamed from: f */
    public boolean f65776f = true;

    /* renamed from: d */
    public static C22880b m26857d() {
        if (f65770g == null) {
            synchronized (C22880b.class) {
                if (f65770g == null) {
                    f65770g = new C22880b();
                }
            }
        }
        return f65770g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d7, code lost:
        if ("com.tencent.mm.plugin.sns.ui.SnsUploadUI".equals(r1) != false) goto L_0x01d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02a2  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26858f(int r20, java.lang.String r21, int r22, long r23) {
        /*
            r1 = r21
            r2 = r22
            r5 = r23
            boolean r0 = d91.C20449a.m22052d()
            java.lang.String r3 = "HABBYGE-MALI.HellFrontBackMonitor"
            if (r0 == 0) goto L_0x0521
            boolean r0 = d91.C20449a.m22051c()
            if (r0 != 0) goto L_0x0016
            goto L_0x0521
        L_0x0016:
            java.lang.String r0 = "HellFrontBackMonitor monitor start !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            w91.b r4 = m26857d()
            r0 = -1
            switch(r20) {
                case 100: goto L_0x006e;
                case 101: goto L_0x006e;
                case 102: goto L_0x006e;
                case 103: goto L_0x006e;
                case 104: goto L_0x005d;
                case 105: goto L_0x0041;
                case 106: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0520
        L_0x0025:
            java.lang.String r0 = "HellFrontBackMonitor, ACTION_add8Event_logout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            h81.k$a r3 = h81.C8496k.C8497a.MMActivity_Front2Back
            com.tencent.mm.plugin.expt.pageflow.MMPageFlowService r1 = com.tencent.p014mm.plugin.expt.pageflow.MMPageFlowService.wx0()
            r1.getClass()
            int r7 = android.os.Process.myPid()
            r4 = -1
            java.lang.String r2 = "logout"
            r5 = r23
            r1.yx0(r2, r3, r4, r5, r7)
            goto L_0x0520
        L_0x0041:
            java.lang.String r0 = "HellFrontBackMonitor, ACTION_add7Event_login"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            h81.k$a r3 = h81.C8496k.C8497a.MMActivity_Back2Front
            com.tencent.mm.plugin.expt.pageflow.MMPageFlowService r1 = com.tencent.p014mm.plugin.expt.pageflow.MMPageFlowService.wx0()
            r1.getClass()
            int r7 = android.os.Process.myPid()
            r4 = 1
            java.lang.String r2 = "login"
            r5 = r23
            r1.yx0(r2, r3, r4, r5, r7)
            goto L_0x0520
        L_0x005d:
            boolean r0 = e91.C116711b.m164589n()
            if (r0 == 0) goto L_0x0520
            g91.c r0 = g91.C20813c.m22810a()
            r1 = 600(0x258, float:8.41E-43)
            r0.mo32507b(r1)
            goto L_0x0520
        L_0x006e:
            r4.getClass()
            boolean r7 = android.text.TextUtils.isEmpty(r21)
            if (r7 == 0) goto L_0x0079
            goto L_0x0520
        L_0x0079:
            r7 = 2
            r8 = 8
            r9 = 1
            r10 = 0
            switch(r20) {
                case 100: goto L_0x02f3;
                case 101: goto L_0x0183;
                case 102: goto L_0x010f;
                case 103: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x0520
        L_0x0083:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            java.lang.String r7 = "frontBack ACTION_FINISH: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r0)
            i91.c r0 = i91.C21062c.m23249d()
            if (r1 != 0) goto L_0x00bb
            java.lang.String r1 = "judgeFront2BackOnFinish: aName == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)     // Catch:{ Exception -> 0x00f9 }
            op3.b r1 = r0.mo32775f()     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object r2 = r1.mo182596a(r10)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object r1 = r1.mo182596a(r9)     // Catch:{ Exception -> 0x00f9 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x00f9 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r7 = "judgeFront2BackOnFinish activity==null: %s"
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00f9 }
            r11[r10] = r2     // Catch:{ Exception -> 0x00f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r11)     // Catch:{ Exception -> 0x00f9 }
            r7 = 0
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x00c5
        L_0x00bb:
            java.lang.String r7 = "judgeFront2BackOnFinish: %s"
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00f9 }
            r11[r10] = r1     // Catch:{ Exception -> 0x00f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r11)     // Catch:{ Exception -> 0x00f9 }
            r7 = 1
        L_0x00c5:
            if (r7 == 0) goto L_0x0520
            boolean r7 = e91.C116711b.m164587l(r1)     // Catch:{ Exception -> 0x00f9 }
            if (r7 == 0) goto L_0x0520
            java.lang.String r7 = "shutdown && isLauncherUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ Exception -> 0x00f9 }
            op3.b r0 = r0.mo32774e()     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object r0 = r0.mo182596a(r10)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r7 = "_quiteActivity.pause = %s"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00f9 }
            r9[r10] = r0     // Catch:{ Exception -> 0x00f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r9)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r7 = "com.tencent.mm.plugin.setting.ui.setting.SettingsUI"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x00f9 }
            if (r0 == 0) goto L_0x0520
            r4.mo36055g(r8)     // Catch:{ Exception -> 0x00f9 }
            j91.C21199a.m23657b(r8)     // Catch:{ Exception -> 0x00f9 }
            r4.mo36053c(r1, r2, r5)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0520
        L_0x00f9:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = "judgeFront2BackOnFinish"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 932(0x3a4, double:4.605E-321)
            r7 = 40
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            goto L_0x0520
        L_0x010f:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            java.lang.String r11 = "frontBack ACTION_STOP: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = "judgeFront2BackOnStop == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x0520
        L_0x0125:
            boolean r0 = r4.f65776f
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "judgeFront2BackOnStop isFront2Back-1: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x0520
        L_0x0130:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            java.lang.String r11 = "judgeFront2BackOnStop stopActivityName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r0)
            op3.c r0 = r4.mo36054e(r1, r2)     // Catch:{ Exception -> 0x016d }
            if (r0 == 0) goto L_0x0166
            java.lang.Object r7 = r0.mo182596a(r7)     // Catch:{ Exception -> 0x016d }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x016d }
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x016d }
            if (r7 != 0) goto L_0x014c
            goto L_0x0166
        L_0x014c:
            java.lang.Object r0 = r0.mo182596a(r10)     // Catch:{ Exception -> 0x016d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x016d }
            java.lang.String r7 = "judgeFront2BackOnStop, 7-event: %s, TRUE"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x016d }
            r9[r10] = r0     // Catch:{ Exception -> 0x016d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r9)     // Catch:{ Exception -> 0x016d }
            j91.C21199a.m23657b(r8)     // Catch:{ Exception -> 0x016d }
            r4.mo36055g(r8)     // Catch:{ Exception -> 0x016d }
            r4.mo36053c(r1, r2, r5)     // Catch:{ Exception -> 0x016d }
            goto L_0x0520
        L_0x0166:
            java.lang.String r0 = "judgeFront2BackOnStop: false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x016d }
            goto L_0x0520
        L_0x016d:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = "judgeFront2BackOnStop crash"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 932(0x3a4, double:4.605E-321)
            r7 = 42
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            goto L_0x0520
        L_0x0183:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            java.lang.String r12 = "frontBack ACTION_PAUSE: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r11)
            i91.c r11 = i91.C21062c.m23249d()
            te3.t1 r11 = r11.mo32776g()
            if (r11 == 0) goto L_0x01db
            java.lang.Object[] r12 = new java.lang.Object[r7]
            te3.fh4 r13 = r11.f354392d
            java.lang.String r14 = r13.f354001d
            r12[r10] = r14
            int r13 = r13.f354002e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r9] = r13
            java.lang.String r13 = "judgeFront2BackOnPause topActivity: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r12)
            te3.fh4 r12 = r11.f354392d
            java.lang.String r12 = r12.f354001d
            java.lang.String r13 = "com.tencent.mm"
            boolean r12 = r12.startsWith(r13)
            if (r12 != 0) goto L_0x01c5
            java.lang.Object[] r12 = new java.lang.Object[r9]
            te3.fh4 r11 = r11.f354392d
            java.lang.String r11 = r11.f354001d
            r12[r10] = r11
            java.lang.String r11 = "judgeFront2BackOnPause 栈顶非微信页面: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r12)
            goto L_0x01d9
        L_0x01c5:
            te3.fh4 r11 = r11.f354392d
            java.lang.String r11 = r11.f354001d
            java.lang.String r12 = "com.tencent.mm.ui.transmit.SendAppMessageWrapperUI"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x01db
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01db
        L_0x01d9:
            r11 = 1
            goto L_0x01dc
        L_0x01db:
            r11 = 0
        L_0x01dc:
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r11)
            r12[r10] = r13
            java.lang.String r13 = "judgeFront2BackOnPause: is8Event: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r12)
            if (r11 != 0) goto L_0x0276
            k91.c r11 = k91.C21316c.m23893a()
            k91.a r11 = r11.f60219a
            k91.d r11 = (k91.C21317d) r11
            te3.q1 r12 = r11.mo33321a()
            java.lang.String r13 = ""
            if (r12 != 0) goto L_0x01fd
            r14 = 0
            goto L_0x0208
        L_0x01fd:
            boolean r14 = r12.f64465f
            if (r14 == 0) goto L_0x0208
            r12.f64465f = r10
            r12.f64469j = r13
            r11.mo33322b(r12)
        L_0x0208:
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r14)
            r11[r10] = r12
            r11[r9] = r1
            java.lang.String r12 = "judgeFront2BackOnPause.startActivity: %b, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r11)
            if (r14 == 0) goto L_0x021d
            r4.f65776f = r10
            goto L_0x0520
        L_0x021d:
            k91.c r11 = k91.C21316c.m23893a()
            k91.a r11 = r11.f60219a
            k91.d r11 = (k91.C21317d) r11
            te3.q1 r12 = r11.mo33321a()
            if (r12 != 0) goto L_0x022d
            r14 = 0
            goto L_0x0261
        L_0x022d:
            boolean r14 = r12.f64466g
            java.lang.String r15 = r12.f64470n
            java.lang.String r8 = "HABBYGE-MALI.ActivityDao_MMKV"
            if (r14 == 0) goto L_0x0254
            boolean r17 = android.text.TextUtils.isEmpty(r15)
            if (r17 != 0) goto L_0x024d
            boolean r17 = r15.equals(r1)
            if (r17 != 0) goto L_0x024d
            java.lang.Object[] r14 = new java.lang.Object[r7]
            r14[r10] = r15
            r14[r9] = r1
            java.lang.String r15 = "isFinishAction_pause, finishActivityName: %s, pActivityName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r15, r14)
            r14 = 0
        L_0x024d:
            r12.f64466g = r10
            r12.f64470n = r13
            r11.mo33322b(r12)
        L_0x0254:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r14)
            r11[r10] = r12
            java.lang.String r12 = "isFinishAction_pause, isFinishAction: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r11)
        L_0x0261:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r14)
            r8[r10] = r11
            r8[r9] = r1
            java.lang.String r11 = "judgeFront2BackOnPause.finish: %b, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r8)
            if (r14 == 0) goto L_0x0276
            r4.f65776f = r10
            goto L_0x0520
        L_0x0276:
            r8 = 104(0x68, float:1.46E-43)
            java.lang.String r8 = k91.C117394e.m165536b(r8)
            r11 = 105(0x69, float:1.47E-43)
            java.lang.String r11 = k91.C117394e.m165536b(r11)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r10] = r8
            r7[r9] = r11
            java.lang.String r12 = "judgeFrontToBackOnPause: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r7)
            java.lang.String r7 = "com.tencent.mm.ui.contact.SelectContactUI"
            boolean r12 = r7.equals(r8)
            if (r12 == 0) goto L_0x02a2
            boolean r12 = e91.C116711b.m164587l(r11)
            if (r12 == 0) goto L_0x02a2
            java.lang.String r0 = "judgeFrontToBackOnPause, SelectContactUI NOT 8-Event !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x0520
        L_0x02a2:
            java.lang.String r12 = "com.tencent.mm.ui.contact.GroupCardSelectUI"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x02ec
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x02b1
            goto L_0x02ec
        L_0x02b1:
            boolean r7 = e91.C116711b.m164587l(r21)
            if (r7 == 0) goto L_0x02c7
            java.lang.String r7 = "com.tencent.mm.plugin.scanner.ui.BaseScanUI"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02c7
            boolean r7 = e91.C116711b.m164587l(r11)
            if (r7 == 0) goto L_0x02c7
            goto L_0x0520
        L_0x02c7:
            int r7 = y91.C118948a.f356268a
            if (r7 == r0) goto L_0x02d4
            y91.C118948a.f356269b = r9
            java.lang.String r0 = "HellFrontToBackMonitor, judgeFrontToBackOnPause, requestPermission !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x0520
        L_0x02d4:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            java.lang.String r7 = "judgeFront2BackOnPause front2back YES: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r0)
            r0 = 8
            j91.C21199a.m23657b(r0)
            r4.mo36055g(r0)
            r4.f65776f = r9
            r4.mo36053c(r1, r2, r5)
            goto L_0x0520
        L_0x02ec:
            java.lang.String r0 = "judgeFrontToBackOnPause, GroupCardSelectUI NOT 8-Event !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x0520
        L_0x02f3:
            boolean r8 = android.text.TextUtils.isEmpty(r21)
            if (r8 == 0) goto L_0x02fb
            goto L_0x04e4
        L_0x02fb:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r10] = r1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r22)
            r8[r9] = r11
            java.lang.String r11 = "judgeBack2Front: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r8)
            boolean r8 = y91.C118948a.f356269b
            if (r8 == 0) goto L_0x031d
            int r8 = y91.C118948a.f356268a
            if (r8 == r0) goto L_0x031d
            java.lang.String r5 = "HellFrontToBackMonitor, judgeBack2Front, requestPermission !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            y91.C118948a.f356268a = r0
            y91.C118948a.f356269b = r10
            goto L_0x04e4
        L_0x031d:
            i91.c r0 = i91.C21062c.m23249d()
            r8 = 0
            op3.b r0 = r0.mo32774e()     // Catch:{ Exception -> 0x032e }
            java.lang.Object r0 = r0.mo182596a(r10)     // Catch:{ Exception -> 0x032e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x032e }
            r11 = r0
            goto L_0x033c
        L_0x032e:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 932(0x3a4, double:4.605E-321)
            r14 = 45
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            r11 = r8
        L_0x033c:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r10] = r1
            r0[r9] = r11
            java.lang.String r12 = "_launchWx resume/pause: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r0)
            java.lang.String r0 = "com.tencent.mm.plugin.voip.ui.VideoActivity"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0362
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x035b
            boolean r0 = e91.C116711b.m164592q(r11)
            if (r0 == 0) goto L_0x0362
        L_0x035b:
            java.lang.String r0 = "VOIP start MM Process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x0362:
            boolean r0 = e91.C116711b.m164592q(r21)
            if (r0 == 0) goto L_0x0375
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0375
            java.lang.String r0 = "_launchWx 启动微信进程 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x0375:
            boolean r0 = e91.C116711b.m164592q(r21)
            if (r0 == 0) goto L_0x0391
            if (r11 == 0) goto L_0x0387
            java.lang.String r0 = "com.tencent.mm.splash."
            boolean r0 = r11.startsWith(r0)
            if (r0 == 0) goto L_0x0387
            r0 = 1
            goto L_0x0388
        L_0x0387:
            r0 = 0
        L_0x0388:
            if (r0 == 0) goto L_0x0391
            java.lang.String r0 = "_launchWx 启动微信进程 splash hook restart ~"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x0391:
            boolean r0 = e91.C116711b.m164587l(r21)
            if (r0 == 0) goto L_0x03a4
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x03a4
            java.lang.String r0 = "_launchWx 启动微信进程 2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x03a4:
            boolean r0 = e91.C116711b.m164592q(r11)
            java.lang.String r12 = "com.tencent.mm.plugin.base.stub.UIEntryStub"
            if (r0 == 0) goto L_0x03c9
            java.lang.String r0 = "com.tencent.mm.plugin.base.stub.WXEntryActivity"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03c9
            boolean r0 = r12.equals(r1)
            if (r0 != 0) goto L_0x03c9
            java.lang.String r0 = "com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03c9
            java.lang.String r0 = "_launchWx 启动微信进程 3"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x03c9:
            boolean r0 = e91.C116711b.m164592q(r11)
            if (r0 == 0) goto L_0x03de
            boolean r0 = e91.C116711b.m164587l(r21)
            if (r0 == 0) goto L_0x03de
            r4.f65774d = r9
            java.lang.String r0 = "_launchWx 启动微信进程 4"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x03de:
            java.lang.String r0 = "com.tencent.mm.ui.tools.ShareToTimeLineUI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03ef
            if (r11 != 0) goto L_0x03ef
            java.lang.String r0 = "_launchWx: frome outer jump to Timeline"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x03ef:
            java.lang.String r0 = "com.tencent.mm.ui.tools.AddFavoriteUI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0404
            boolean r0 = e91.C116711b.m164592q(r11)
            if (r0 == 0) goto L_0x0404
            java.lang.String r0 = "_launchWx: from outer jump to 收藏"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x0404:
            i91.c r0 = i91.C21062c.m23249d()
            op3.b r0 = r0.mo32774e()     // Catch:{ Exception -> 0x0414 }
            java.lang.Object r0 = r0.mo182596a(r10)     // Catch:{ Exception -> 0x0414 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0414 }
            r8 = r0
            goto L_0x041c
        L_0x0414:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r14 = "isStartWxByLittlePragramShortcut"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r14, r13)
        L_0x041c:
            java.lang.String r0 = "^(com.tencent.mm.plugin.appbrand.ui.AppBrandUI)[0-9]*$"
            boolean r13 = java.util.regex.Pattern.matches(r0, r1)
            if (r13 == 0) goto L_0x042e
            java.lang.String r13 = "com.tencent.mm.plugin.base.stub.WXShortcutEntryActivity"
            boolean r13 = r13.equals(r8)
            if (r13 == 0) goto L_0x042e
            r13 = 1
            goto L_0x042f
        L_0x042e:
            r13 = 0
        L_0x042f:
            if (r13 == 0) goto L_0x0437
            java.lang.String r0 = "isStartWxByLittlePragramShortcut case-1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x044d
        L_0x0437:
            boolean r13 = java.util.regex.Pattern.matches(r0, r1)
            if (r13 == 0) goto L_0x0445
            boolean r13 = android.text.TextUtils.isEmpty(r8)
            if (r13 == 0) goto L_0x0445
            r13 = 1
            goto L_0x0446
        L_0x0445:
            r13 = 0
        L_0x0446:
            if (r13 == 0) goto L_0x044f
            java.lang.String r0 = "isStartWxByLittlePragramShortcut case-2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x044d:
            r0 = 1
            goto L_0x0465
        L_0x044f:
            boolean r0 = java.util.regex.Pattern.matches(r0, r1)
            if (r0 == 0) goto L_0x045d
            boolean r0 = e91.C116711b.m164592q(r8)
            if (r0 == 0) goto L_0x045d
            r0 = 1
            goto L_0x045e
        L_0x045d:
            r0 = 0
        L_0x045e:
            if (r0 == 0) goto L_0x0465
            java.lang.String r8 = "isStartWxByLittlePragramShortcut case-3"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
        L_0x0465:
            if (r0 == 0) goto L_0x046d
            java.lang.String r0 = "_launchWx 启动微信进程 通过小程序桌面快捷方式"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x046d:
            boolean r0 = r12.equals(r1)
            if (r0 == 0) goto L_0x0479
            java.lang.String r0 = "_launchWx 启动微信进程 通过第三方拉起微信(第三方登录、分享好友、朋友圈)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x049a
        L_0x0479:
            java.lang.String r0 = "com.tencent.mm.plugin.account.ui.LoginPasswordUI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x049c
            boolean r0 = e91.C116711b.m164587l(r11)
            if (r0 == 0) goto L_0x049c
            java.lang.String r0 = "_launchWx 启动微信进程 之前登录过，登录页"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            boolean r0 = r4.f65774d
            if (r0 == 0) goto L_0x0493
            r4.f65774d = r10
            goto L_0x049c
        L_0x0493:
            boolean r0 = r4.f65775e
            if (r0 == 0) goto L_0x049a
            r4.f65775e = r10
            goto L_0x049c
        L_0x049a:
            r0 = 1
            goto L_0x049d
        L_0x049c:
            r0 = 0
        L_0x049d:
            r8 = 7
            if (r0 == 0) goto L_0x04af
            java.lang.String r0 = "judgeBack2Front: _launchWx TRUE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            j91.C21199a.m23657b(r8)
            r4.mo36055g(r8)
            r4.mo36052b(r1, r2, r5)
            goto L_0x04e4
        L_0x04af:
            java.lang.String r0 = "judgeBack2Front: _launchWx FALSE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            boolean r0 = r4.mo36051a(r1, r2)     // Catch:{ Exception -> 0x04cf }
            if (r0 == 0) goto L_0x04c9
            java.lang.String r0 = "backToFront: isFrontToBackOfLastAction: YES"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x04cf }
            j91.C21199a.m23657b(r8)     // Catch:{ Exception -> 0x04cf }
            r4.mo36055g(r8)     // Catch:{ Exception -> 0x04cf }
            r4.mo36052b(r1, r2, r5)     // Catch:{ Exception -> 0x04cf }
            goto L_0x04e4
        L_0x04c9:
            java.lang.String r0 = "backToFront: isFrontToBackOfLastAction: FALSE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x04cf }
            goto L_0x04e4
        L_0x04cf:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.String r6 = "backToFront crash"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r6, r5)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 932(0x3a4, double:4.605E-321)
            r14 = 44
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
        L_0x04e4:
            w91.a r0 = r4.f65771a
            te3.uq1 r3 = r0.mo36049a()
            if (r3 != 0) goto L_0x04f1
            te3.uq1 r3 = new te3.uq1
            r3.<init>()
        L_0x04f1:
            boolean r4 = e91.C116711b.m164589n()
            if (r4 == 0) goto L_0x04fd
            int r4 = android.os.Process.myPid()
            r3.f64659f = r4
        L_0x04fd:
            r3.f64660g = r1
            r3.f64661h = r2
            long r1 = java.lang.System.currentTimeMillis()
            r3.f64658e = r1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = r3.f64660g
            r1[r10] = r2
            int r2 = r3.f64662i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r9] = r2
            java.lang.String r2 = "HABBYGE-MALI.FrontBackDao"
            java.lang.String r4 = "setLastMMProcessParamsOnResume: %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r1)
            r0.mo36050b(r3)
        L_0x0520:
            return
        L_0x0521:
            java.lang.String r0 = "HellFrontBackMonitor monitor close !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w91.C22880b.m26858f(int, java.lang.String, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (r18 == r3.intValue()) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36051a(java.lang.String r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            k91.c r2 = k91.C21316c.m23893a()
            k91.a r2 = r2.f60219a
            k91.d r2 = (k91.C21317d) r2
            te3.q1 r3 = r2.mo33321a()
            r4 = 0
            java.lang.String r5 = ""
            if (r3 != 0) goto L_0x0017
            r6 = 0
            goto L_0x0031
        L_0x0017:
            boolean r6 = r3.f64463d
            java.lang.String r7 = r3.f64467h
            if (r6 == 0) goto L_0x0031
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x002a
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x002a
            r6 = 0
        L_0x002a:
            r3.f64463d = r4
            r3.f64467h = r5
            r2.mo33322b(r3)
        L_0x0031:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r3[r4] = r7
            java.lang.String r7 = "HABBYGE-MALI.HellFrontBackMonitor"
            java.lang.String r8 = "_doIsBackToFront isStartActivity: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r3)
            if (r6 == 0) goto L_0x0045
            goto L_0x00c8
        L_0x0045:
            k91.c r3 = k91.C21316c.m23893a()
            k91.a r3 = r3.f60219a
            k91.d r3 = (k91.C21317d) r3
            te3.q1 r6 = r3.mo33321a()
            if (r6 != 0) goto L_0x0055
            r8 = 0
            goto L_0x0060
        L_0x0055:
            boolean r8 = r6.f64464e
            if (r8 == 0) goto L_0x0060
            r6.f64464e = r4
            r6.f64468i = r5
            r3.mo33322b(r6)
        L_0x0060:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            r3[r4] = r5
            java.lang.String r5 = "_doIsBackToFront isFinish: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r3)
            if (r8 == 0) goto L_0x0070
            goto L_0x00c8
        L_0x0070:
            boolean r3 = android.text.TextUtils.isEmpty(r17)
            if (r3 != 0) goto L_0x00bb
            i91.c r3 = i91.C21062c.m23249d()
            op3.b r3 = r3.mo32774e()
            java.lang.Object r5 = r3.mo182596a(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.mo182596a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x008e
            r3 = -1
            goto L_0x0092
        L_0x008e:
            int r3 = r3.intValue()
        L_0x0092:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)
            r6[r2] = r8
            r8 = 2
            r6[r8] = r5
            r8 = 3
            r6[r8] = r3
            java.lang.String r8 = "_doIsBackToFront resume: %s, %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00c8
            int r3 = r3.intValue()
            r5 = r18
            if (r5 == r3) goto L_0x00bb
            goto L_0x00c8
        L_0x00bb:
            java.lang.String r3 = "^(com.tencent.mm.plugin.appbrand.ui.AppBrandUI)[0-9]*$"
            boolean r3 = java.util.regex.Pattern.matches(r3, r1)
            if (r3 == 0) goto L_0x00ca
            java.lang.String r3 = "_doIsBackToFront 7事件，过滤小程序"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)
        L_0x00c8:
            r3 = 0
            goto L_0x00d0
        L_0x00ca:
            java.lang.String r3 = "_doIsBackToFront ret: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            r3 = 1
        L_0x00d0:
            if (r3 == 0) goto L_0x00d3
            return r2
        L_0x00d3:
            w91.a r3 = r0.f65771a
            te3.uq1 r3 = r3.mo36049a()
            if (r3 == 0) goto L_0x00e3
            int r3 = r3.f64657d
            r5 = 8
            if (r3 != r5) goto L_0x00e3
            r3 = 1
            goto L_0x00e4
        L_0x00e3:
            r3 = 0
        L_0x00e4:
            if (r3 == 0) goto L_0x0100
            java.lang.String r3 = "isFrontToBackAction.lastAction: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            java.lang.String r3 = "com.tencent.mm.plugin.base.stub.WXEntryActivity"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00fd
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            java.lang.String r1 = "_isBackToFront 过滤掉第三方App进入微信的场景: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r2)
            return r4
        L_0x00fd:
            r0.f65775e = r2
            return r2
        L_0x0100:
            i91.c r3 = i91.C21062c.m23249d()
            op3.b r3 = r3.mo32774e()
            java.lang.Object r3 = r3.mo182596a(r4)
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = android.text.TextUtils.isEmpty(r17)
            if (r1 != 0) goto L_0x012c
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x012c
            java.lang.String r1 = "HellFrontBackMonitor _isBackToFront: crash路径 !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 932(0x3a4, double:4.605E-321)
            r11 = 98
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            return r2
        L_0x012c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w91.C22880b.mo36051a(java.lang.String, int):boolean");
    }

    /* renamed from: b */
    public final void mo36052b(String str, int i, long j) {
        String str2 = str;
        int i2 = i;
        long j2 = j;
        C20928j.C20931c cVar = this.f65772b;
        if (cVar != null) {
            ((C20450b) cVar).getClass();
            Log.m105925i("HABBYGE-MALI.HellhoundService", "HellhoundService, backToFront: %s", str2);
            C20449a.f57482p = false;
            C22466j.f63630j.getClass();
            Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "on7EventV1: pageName=" + str + ", hashCode=" + i2);
            C22731f.C22732a aVar = C22731f.f65379a;
            C22507la3 e = aVar.mo35820e();
            if (e != null) {
                LinkedList<Long> linkedList = e.f64168p;
                C87412m.m108593f(linkedList, "statistics.stayTimeOnBackground");
                if (!linkedList.isEmpty()) {
                    if (e.f64168p.size() % 2 != 0) {
                        e.f64168p.add(Long.valueOf(j));
                    } else {
                        e.f64168p.removeLast();
                        e.f64168p.add(Long.valueOf(j));
                    }
                }
                aVar.mo35825j(e);
            }
            Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "on7EventV2: pageName=" + str + ", hashCode=" + i2);
            C22507la3 f = aVar.mo35821f();
            if (f != null) {
                if (C116711b.m164587l(str)) {
                    aVar.mo35824i();
                } else if (f.f64167o == 8) {
                    f.f64163h = j2;
                    f.f64164i = 0;
                    f.f64162g = 0;
                    f.f64167o = 1;
                    aVar.mo35826k(f);
                    Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "on7EventV2: " + f.f64160e + ", " + f.f64161f);
                }
            }
            C118753c.m167447a(str, C102190i.m134653a(String.valueOf(i), 0), j2, C8496k.C8497a.MMActivity_Back2Front);
            C23462b.m28021f().mo36919c(str, i, j, 7);
            C22217a.m25719a(str, Integer.valueOf(i), 2);
            WeChatFrontBackEvent weChatFrontBackEvent = new WeChatFrontBackEvent();
            WeChatFrontBackEvent.C28852a aVar2 = weChatFrontBackEvent.f79057d;
            aVar2.f79058a = 7;
            aVar2.f79059b = str2;
            aVar2.f79060c = j2;
            aVar2.f79061d = i2;
            weChatFrontBackEvent.publish();
        }
        Iterator it = ((CopyOnWriteArrayList) this.f65773c).iterator();
        while (it.hasNext()) {
            ((C20928j.C20932d) it.next()).mo32657s(str, i2, j2);
        }
    }

    /* renamed from: c */
    public final void mo36053c(String str, int i, long j) {
        String str2 = str;
        int i2 = i;
        long j2 = j;
        C20928j.C20931c cVar = this.f65772b;
        if (cVar != null) {
            ((C20450b) cVar).getClass();
            Log.m105925i("HABBYGE-MALI.HellhoundService", "HellhoundService, frontToBack: %s", str2);
            C20449a.f57482p = true;
            C22730d dVar = C22466j.f63630j;
            dVar.getClass();
            Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "on8EventV1: pageName=" + str + ", hashCode=" + i2);
            C22731f.C22732a aVar = C22731f.f65379a;
            C22507la3 e = aVar.mo35820e();
            if (e != null) {
                if (e.f64168p.isEmpty()) {
                    e.f64168p.add(Long.valueOf(j));
                } else if (e.f64168p.size() % 2 == 0) {
                    e.f64168p.add(Long.valueOf(j));
                } else {
                    e.f64168p.removeLast();
                    e.f64168p.add(Long.valueOf(j));
                }
                aVar.mo35825j(e);
            }
            Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "on8EventV2: pageName=" + str + ", hashCode=" + i2);
            if (C116711b.m164587l(str)) {
                aVar.mo35824i();
            } else {
                C22507la3 f = aVar.mo35821f();
                if (f != null) {
                    f.f64164i = j2;
                    f.f64162g = j2 - f.f64163h;
                    f.f64165j = C116711b.m164579d();
                    f.f64167o = 1;
                    Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "on8EventV2, statics: " + f.f64160e + ", " + f.f64161f);
                    C22618a.f65058a.mo35741b(dVar.mo35815a(f, 1));
                    f.f64167o = 8;
                    aVar.mo35826k(f);
                }
            }
            C118753c.m167447a(str, C102190i.m134653a(String.valueOf(i), 0), j2, C8496k.C8497a.MMActivity_Front2Back);
            C118865a.f355584a.mo183575c(str, j2, C23072e.MATCH_PAGE_8_EVENT);
            C23462b.m28021f().mo36919c(str, i, j, 8);
            C22217a.m25719a(str, Integer.valueOf(i), 3);
            WeChatFrontBackEvent weChatFrontBackEvent = new WeChatFrontBackEvent();
            WeChatFrontBackEvent.C28852a aVar2 = weChatFrontBackEvent.f79057d;
            aVar2.f79058a = 8;
            aVar2.f79059b = str2;
            aVar2.f79060c = j2;
            aVar2.f79061d = i2;
            weChatFrontBackEvent.publish();
        }
        Iterator it = ((CopyOnWriteArrayList) this.f65773c).iterator();
        while (it.hasNext()) {
            ((C20928j.C20932d) it.next()).mo32651k(str, i2, j2);
        }
    }

    /* renamed from: e */
    public final C117878c<String, Integer, Boolean> mo36054e(String str, int i) {
        C118467t1 g;
        C21062c d = C21062c.m23249d();
        try {
            C117877b<String, Integer> f = d.mo32775f();
            C117877b<String, Integer> e = d.mo32774e();
            if (str != null) {
                String str2 = (String) f.mo182596a(0);
                if ("com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI".equals(str2)) {
                    Log.m105924i("HABBYGE-MALI.HellFrontBackMonitor", "isFakeSwitchAccountUI true");
                    return null;
                }
                Log.m105925i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop: Resume: %s, Pause: %s, Stop: %s", f, e, str);
                Integer num = (Integer) f.mo182596a(1);
                Integer num2 = (Integer) e.mo182596a(1);
                boolean z = (str.equals(str2) && str.equals(e.mo182596a(0))) && (num != null && num2 != null && i == num.intValue() && i == num2.intValue());
                Log.m105925i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop, case-1：%b", Boolean.valueOf(z));
                if (z && !"com.tencent.mm.plugin.voip.ui.VideoActivity".equals(str) && !"com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity".equals(str) && (g = d.mo32776g()) != null) {
                    fh4 fh4 = g.f354392d;
                    Log.m105925i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop isEvent8: %s, %s", fh4.f354001d, Integer.valueOf(fh4.f354002e));
                    if (g.f354392d.f354001d.startsWith("com.tencent.mm")) {
                        fh4 fh42 = g.f354392d;
                        if (fh42.f354002e <= 0 && !fh42.f354001d.equals(str)) {
                            Log.m105924i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop isEvent8-1: false");
                            z = false;
                        }
                    } else {
                        Log.m105924i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop: NOT wx activity");
                    }
                }
                Log.m105925i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop case1 && case2：%b", Boolean.valueOf(z));
                return C117882j.m166285d(str, Integer.valueOf(i), Boolean.valueOf(z));
            }
            Log.m105920e("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop: illeagal Event");
            return null;
        } catch (Exception e2) {
            Log.printErrStackTrace("HABBYGE-MALI.HellFrontBackMonitor", e2, "isFront2BackOnStop", new Object[0]);
            C115669n.INSTANCE.idkeyStat(932, 43, 1, false);
            return null;
        }
    }

    /* renamed from: g */
    public void mo36055g(int i) {
        C22879a aVar = this.f65771a;
        C22531uq1 a = aVar.mo36049a();
        if (a == null) {
            a = new C22531uq1();
        }
        a.f64657d = i;
        aVar.mo36050b(a);
    }

    /* renamed from: h */
    public void mo36056h(boolean z) {
        C22879a aVar = this.f65771a;
        C22531uq1 a = aVar.mo36049a();
        if (a == null) {
            a = new C22531uq1();
        }
        a.f64663j = z;
        Log.m105919d("HABBYGE-MALI.FrontBackDao", "logout8EventFromAdd: %b", Boolean.valueOf(z));
        aVar.mo36050b(a);
    }
}
