package p676rl;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C31931h0;
import gy3.C87412m;
import java.util.ListIterator;
import p248ug.C37453h0;
import p248ug.C37455i0;
import p594lk.C34288b;
import rx3.C13598b0;

/* renamed from: rl.a */
public final class C36332a implements C37455i0, C36338f, C31931h0 {

    /* renamed from: a */
    public static final C36332a f96697a;

    /* renamed from: b */
    public static volatile boolean f96698b = false;

    /* renamed from: c */
    public static boolean f96699c = true;

    /* renamed from: d */
    public static long f96700d;

    /* renamed from: e */
    public static final C36337e f96701e;

    /* renamed from: f */
    public static long f96702f;

    /* renamed from: g */
    public static boolean f96703g;

    /* renamed from: h */
    public static final C37453h0 f96704h = new C34288b();

    static {
        C36332a aVar = new C36332a();
        f96697a = aVar;
        f96701e = new C36337e(aVar);
    }

    /* renamed from: a */
    public void mo60620a(int i, C36336d dVar) {
        C87412m.m108594g(dVar, "task");
        Log.m105924i("FunctionMsg.FunctionMsgEngine", "[onTaskExpired] id:" + dVar.f96713b.field_functionmsgid + " op:" + i + " status:" + dVar.f96713b.field_status);
        dVar.f96714c.mo60978b(f96701e, f96704h, dVar);
    }

    /* renamed from: b */
    public final boolean mo60621b() {
        if (!f96698b) {
            long F = C86709a0.m107535s().mo121142i().mo119672F(8196, 0);
            boolean z = (7 & F) != 0;
            boolean z2 = f96703g || System.currentTimeMillis() - f96702f >= 15000;
            Log.m105924i("FunctionMsg.FunctionMsgEngine", "[isNeedCheckTimer] continueFlag:" + F + ", isContinueSync:" + z + ", isNeedCheck:" + z2 + ", isNeedCheckSoon:" + f96703g);
            long uptimeMillis = z ? SystemClock.uptimeMillis() : 0;
            f96700d = uptimeMillis;
            if (0 != uptimeMillis) {
                long uptimeMillis2 = SystemClock.uptimeMillis() - f96700d;
                if (uptimeMillis2 >= 1800000) {
                    C115669n.INSTANCE.idkeyStat(1021, 0, 1, true);
                } else if (uptimeMillis2 >= 1200000) {
                    C115669n.INSTANCE.idkeyStat(1021, 1, 1, true);
                } else if (uptimeMillis2 >= 600000) {
                    C115669n.INSTANCE.idkeyStat(1021, 2, 1, true);
                }
            }
            if (!z && z2) {
                C36337e eVar = f96701e;
                eVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                C36335c cVar = eVar.f96716b;
                synchronized (cVar.f96711d) {
                    Log.m105924i("FunctionMsg.FunctionMsgQueue", "[loop] size:" + cVar.f96708a.size());
                    ListIterator<C36336d> listIterator = cVar.f96708a.listIterator();
                    C87412m.m108593f(listIterator, "mList.listIterator()");
                    while (listIterator.hasNext()) {
                        C36336d next = listIterator.next();
                        C87412m.m108593f(next, "iterator.next()");
                        C36336d dVar = next;
                        if (dVar.f96713b.field_actionTime <= C31543z5.m39451a() / 1000) {
                            listIterator.remove();
                            cVar.f96709b.remove(dVar.f96713b.field_functionmsgid);
                            C36337e eVar2 = cVar.f96710c;
                            eVar2.getClass();
                            eVar2.f96715a.mo60620a(dVar.f96712a, dVar);
                        }
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                Log.m105925i("FunctionMsg.FunctionMsgTimer", "[check] Cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                f96702f = System.currentTimeMillis();
                f96703g = false;
                Log.m105925i("FunctionMsg.FunctionMsgEngine", "[checkLoop] check time:%s", Long.valueOf(System.currentTimeMillis()));
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0119, code lost:
        r29 = r10;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60622c(te3.C77949j3 r39, java.util.Map<java.lang.String, java.lang.String> r40, java.lang.String r41) {
        /*
            r38 = this;
            r0 = r39
            r1 = r40
            r2 = r41
            java.lang.String r3 = "addMsg"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "values"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "source"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.String r3 = ".sysmsg.functionmsg.op"
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r8 = r0.f227635o
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r5] = r8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 1
            r7[r8] = r4
            java.lang.String r4 = "FunctionMsg.FunctionMsgEngine"
            java.lang.String r9 = "[onReceive], addMsg.createTime: %s op:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r7)
            f96703g = r8
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = ".sysmsg.functionmsg.cgi"
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r11 = ".sysmsg.functionmsg.cmdid"
            java.lang.Object r11 = r1.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r5)
            java.lang.String r12 = ".sysmsg.functionmsg.functionmsgid"
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = ".sysmsg.functionmsg.version"
            java.lang.Object r13 = r1.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            r14 = 0
            r16 = r7
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r13, r14)
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            java.lang.String r13 = ".sysmsg.functionmsg.retryinterval"
            java.lang.Object r13 = r1.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r5)
            java.lang.String r8 = ".sysmsg.functionmsg.reportid"
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r5)
            java.lang.String r14 = ".sysmsg.functionmsg.successkey"
            java.lang.Object r14 = r1.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r5)
            java.lang.String r15 = ".sysmsg.functionmsg.failkey"
            java.lang.Object r15 = r1.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r5)
            java.lang.String r5 = ".sysmsg.functionmsg.finalfailkey"
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r19 = r9
            r9 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r9)
            java.lang.String r9 = ".sysmsg.functionmsg.custombuff"
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = ".sysmsg.functionmsg.businessid"
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r21 = r4
            r22 = r5
            r17 = r9
            r4 = 0
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r10, r4)
            java.lang.String r4 = ".sysmsg.functionmsg.businessbuff"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ".sysmsg.functionmsg.actiontime"
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r18 = r4
            r25 = r9
            r9 = 0
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r9)
            java.lang.String r9 = ".sysmsg.functionmsg.delaytime"
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r27 = r4
            r4 = 0
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r4)
            java.lang.String r9 = ".sysmsg.functionmsg.retrycount"
            java.lang.Object r1 = r1.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            r9 = 3
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r9)
            te3.rv3 r10 = r0.f227631h
            java.lang.String r10 = sf0.C48374j0.m53718g(r10)
            r23 = 9
            if (r10 == 0) goto L_0x0152
            int r24 = r10.length()
            if (r24 <= 0) goto L_0x0152
            r24 = 0
            r35 = 0
            r36 = 6
            r37 = 0
            r31 = 0
            r32 = 0
            r33 = 6
            r34 = 0
            java.lang.String r30 = "<addmsg>"
            r29 = r10
            int r9 = z04.C112550d0.m153769E(r29, r30, r31, r32, r33, r34)
            java.lang.String r30 = "</addmsg>"
            r31 = r24
            r32 = r35
            r33 = r36
            r34 = r37
            int r24 = z04.C112550d0.m153769E(r29, r30, r31, r32, r33, r34)
            int r2 = r24 + 9
            if (r2 <= r9) goto L_0x0152
            r0 = -1
            if (r2 == r0) goto L_0x0152
            if (r9 == r0) goto L_0x0152
            java.lang.String r0 = r10.substring(r9, r2)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r0, r2)
            goto L_0x0154
        L_0x0152:
            java.lang.String r0 = ""
        L_0x0154:
            r2 = 16
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r10 = 0
            r2[r10] = r9
            r9 = 1
            r2[r9] = r16
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r10 = 2
            r2[r10] = r9
            r9 = 3
            r2[r9] = r12
            r9 = 4
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            r2[r9] = r10
            r9 = 5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r2[r9] = r10
            r9 = 6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r2[r9] = r10
            r9 = 7
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            r2[r9] = r10
            r9 = 8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r2[r9] = r10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r22)
            r2[r23] = r9
            r9 = 10
            r2[r9] = r17
            r9 = 11
            java.lang.Long r10 = java.lang.Long.valueOf(r25)
            r2[r9] = r10
            r9 = 12
            r2[r9] = r18
            r9 = 13
            java.lang.Long r10 = java.lang.Long.valueOf(r27)
            r2[r9] = r10
            r9 = 14
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r2[r9] = r10
            r9 = 15
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r2[r9] = r10
            java.lang.String r9 = "parseAddMsg,op:%s cgi: %s, cmdId: %s, functionMsgId: %s, version: %s, retryInterval: %s, reportId: %s, successKey: %s, failKey: %s, finalKey: %s, customBuff: %s businessid:%s businessbuff:%s actiontime:%s delaytime:%s retryCount:%s"
            r10 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r2)
            ug.u r2 = new ug.u
            r2.<init>()
            r2.field_opCode = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)
            if (r3 != 0) goto L_0x01d6
            r3 = r16
            r2.field_cgi = r3
        L_0x01d6:
            r2.field_cmdid = r11
            gy3.C87412m.m108591d(r12)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r3 != 0) goto L_0x01e3
            r2.field_functionmsgid = r12
        L_0x01e3:
            r2.field_version = r6
            r2.field_retryinterval = r13
            r2.field_reportid = r8
            r2.field_successkey = r14
            r2.field_failkey = r15
            r3 = r22
            r2.field_finalfailkey = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            if (r3 != 0) goto L_0x01fb
            r9 = r17
            r2.field_custombuff = r9
        L_0x01fb:
            r3 = -1
            r2.field_status = r3
            r3 = r39
            r2.field_addMsg = r3
            r2.field_defaultContent = r0
            te3.ok r0 = new te3.ok
            r0.<init>()
            r6 = r25
            r0.f139226d = r6
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            if (r6 != 0) goto L_0x0222
            pe3.b r6 = new pe3.b
            r7 = r18
            r8 = 0
            byte[] r7 = android.util.Base64.decode(r7, r8)
            r6.<init>(r7)
            r0.f139227e = r6
            goto L_0x0223
        L_0x0222:
            r8 = 0
        L_0x0223:
            r2.field_businessInfo = r0
            r6 = r27
            r2.field_actionTime = r6
            r2.field_delayTime = r4
            r2.field_retryCount = r8
            r2.field_retryCountLimit = r1
            com.tencent.mm.storage.r3 r0 = com.tencent.p014mm.storage.C30774r3.f82750d
            java.lang.String r1 = r2.field_functionmsgid
            java.lang.String r4 = "item.functionMsgId"
            gy3.C87412m.m108593f(r1, r4)
            ug.u r34 = r0.mo57697jo(r1)
            r1 = 0
            if (r34 == 0) goto L_0x024f
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r8] = r34
            r6 = 1
            r5[r6] = r41
            java.lang.String r7 = "[handleFunctionMsgItem], old functionMsgItem:%s source=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r7, r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0252
        L_0x024f:
            r4 = 2
            r6 = 1
            r5 = r1
        L_0x0252:
            if (r5 != 0) goto L_0x0261
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r7 = r2.field_functionmsgid
            r5[r8] = r7
            r5[r6] = r41
            java.lang.String r7 = "[handleFunctionMsgItem], has not exist! id:%s source=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r7, r5)
        L_0x0261:
            int r5 = r2.field_opCode
            if (r5 == 0) goto L_0x0289
            if (r5 == r6) goto L_0x0283
            if (r5 == r4) goto L_0x027d
            r4 = 3
            if (r5 == r4) goto L_0x0277
            r4 = 101(0x65, float:1.42E-43)
            if (r5 == r4) goto L_0x0271
            goto L_0x028e
        L_0x0271:
            tl.b r1 = new tl.b
            r1.<init>()
            goto L_0x028e
        L_0x0277:
            tl.e r1 = new tl.e
            r1.<init>()
            goto L_0x028e
        L_0x027d:
            tl.d r1 = new tl.d
            r1.<init>()
            goto L_0x028e
        L_0x0283:
            tl.c r1 = new tl.c
            r1.<init>()
            goto L_0x028e
        L_0x0289:
            tl.f r1 = new tl.f
            r1.<init>()
        L_0x028e:
            r29 = r1
            if (r29 == 0) goto L_0x02a2
            rl.e r30 = f96701e
            ug.h0 r31 = f96704h
            int r1 = r3.f227635o
            long r3 = (long) r1
            r32 = r0
            r33 = r2
            r35 = r3
            r29.mo60977a(r30, r31, r32, r33, r34, r35)
        L_0x02a2:
            boolean r0 = r38.mo60621b()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r19
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "[onReceive] cost:%sms checkResult=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p676rl.C36332a.mo60622c(te3.j3, java.util.Map, java.lang.String):void");
    }
}
