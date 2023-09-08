package pc0;

import com.tencent.mmkv.MMKV;
import com.tencent.p014mm.autogen.events.BypNewSyncEvent;
import com.tencent.p014mm.autogen.events.FinderSyncEvent;
import com.tencent.p014mm.autogen.events.OpenIMSyncEvent;
import com.tencent.p014mm.autogen.events.SnsSyncEvent;
import com.tencent.p014mm.autogen.events.StorySyncEvent;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.plugin.zero.C72670r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import eb0.C31543z5;
import f40.C86709a0;
import f40.C86718e;
import gy3.C87412m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import jc3.C76400h;
import kj2.C117407d;
import p285zh.C119114c;
import pc0.C118000d0;
import qe3.C101126c1;
import rx3.C13598b0;
import sf0.C48374j0;
import sx3.C110818d0;
import sx3.C64175a0;
import sx3.C64197v;
import te3.C101865x33;
import te3.C50886px;
import te3.C51018qv3;
import te3.C51024qx;
import te3.ee4;
import te3.ie4;
import zt3.C119157j;

/* renamed from: pc0.f0 */
public final class C118005f0 {

    /* renamed from: a */
    public final C118007g f352747a;

    /* renamed from: b */
    public final LinkedList<String> f352748b = new LinkedList<>();

    /* renamed from: c */
    public final HashMap<Integer, C118010i> f352749c = new HashMap<>();

    /* renamed from: d */
    public final Object f352750d = new Object();

    /* renamed from: pc0.f0$a */
    public final class C118006a implements Runnable {
        public C118006a() {
        }

        public void run() {
            ee4 ee4;
            ie4 ie4;
            C13598b0 b0Var;
            ee4 ee42;
            C118010i remove;
            LinkedList<ie4> linkedList;
            LinkedList<ie4> linkedList2;
            C51024qx qxVar;
            LinkedList<C50886px> linkedList3;
            C51024qx qxVar2;
            LinkedList<C50886px> linkedList4;
            LinkedList<ie4> linkedList5;
            boolean z = false;
            if (!C86709a0.m107522a() || C86718e.m107551r() || C86709a0.m107535s() == null || C86709a0.m107535s().mo121142i() == null) {
                Log.m105921e("MicroMsg.SyncServiceHandler", "processResp accready:%s hold:%s accstg:%s ", Boolean.valueOf(C86709a0.m107522a()), Boolean.valueOf(C86718e.m107551r()), C86709a0.m107535s());
                return;
            }
            int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcReceiveMsgEnable(), C40318k.m43492a().getHcReceiveMsgDelay(), C40318k.m43492a().getHcReceiveMsgCPU(), C40318k.m43492a().getHcReceiveMsgIO(), C40318k.m43492a().getHcReceiveMsgThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcReceiveMsgTimeout(), 201, C40318k.m43492a().getHcReceiveMsgAction(), "MicroMsg.SyncServiceHandler");
            long c = C31543z5.m39453c();
            synchronized (C118005f0.this.f352750d) {
                String i = C86709a0.m107523b().mo121111i();
                C87412m.m108593f(i, "account().uinString");
                if (C118000d0.f352702b == null) {
                    C118000d0.f352702b = MMKV.mmkvWithID("SyncMMKV_" + i, 2);
                }
                MMKV mmkv = C118000d0.f352702b;
                C87412m.m108591d(mmkv);
                byte[] decodeBytes = mmkv.decodeBytes("process_data_list");
                if (decodeBytes != null) {
                    ee4 = new ee4();
                    try {
                        ee4.parseFrom(decodeBytes);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.SyncServiceHandler", e, "process parse data queue 1", new Object[0]);
                    }
                } else {
                    ee4 = null;
                }
                ie4 = (ee4 == null || (linkedList5 = ee4.f182949d) == null) ? null : (ie4) C110818d0.m150916N(linkedList5);
            }
            if (ie4 != null) {
                C118005f0 f0Var = C118005f0.this;
                Log.m105924i("MicroMsg.SyncServiceHandler", "ProcessSyncData syncData");
                C72670r rVar = new C72670r();
                rVar.mo100128b(new C118011j(ie4));
                long nowMilliSecond = Util.nowMilliSecond();
                C101865x33 x332 = ie4.f354045d;
                int size = (x332 == null || (qxVar2 = x332.f299846e) == null || (linkedList4 = qxVar2.f140594e) == null) ? 0 : linkedList4.size();
                C101865x33 x333 = ie4.f354045d;
                if (!(x333 == null || (qxVar = x333.f299846e) == null || (linkedList3 = qxVar.f140594e) == null)) {
                    int i2 = 0;
                    for (T next : linkedList3) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C50886px pxVar = (C50886px) next;
                            C119114c.m167924i("SyncServiceHandler", pxVar);
                            Util.nowMilliSecond();
                            if (!rVar.mo100129c(new C118011j(ie4), i2, size, pxVar, false)) {
                                C117407d.INSTANCE.idkeyStat(99, 46, 1, false);
                            }
                            Log.m105925i("MicroMsg.SyncServiceHandler", "processResp Single Cmd NetSync[%s] time:%s size:%s index:%s", Integer.valueOf(ie4.f354050i), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(size), Integer.valueOf(i2));
                            i2 = i3;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
                rVar.mo100127a(new C118011j(ie4));
                synchronized (f0Var.f352750d) {
                    String i4 = C86709a0.m107523b().mo121111i();
                    C87412m.m108593f(i4, "account().uinString");
                    if (C118000d0.f352702b == null) {
                        C118000d0.f352702b = MMKV.mmkvWithID("SyncMMKV_" + i4, 2);
                    }
                    MMKV mmkv2 = C118000d0.f352702b;
                    C87412m.m108591d(mmkv2);
                    byte[] decodeBytes2 = mmkv2.decodeBytes("process_data_list");
                    if (decodeBytes2 != null) {
                        ee42 = new ee4();
                        try {
                            ee42.parseFrom(decodeBytes2);
                        } catch (Exception e2) {
                            Log.printErrStackTrace("MicroMsg.SyncServiceHandler", e2, "process parse data queue 2", new Object[0]);
                        }
                    } else {
                        ee42 = null;
                    }
                    ie4 ie42 = (ee42 == null || (linkedList2 = ee42.f182949d) == null) ? null : (ie4) C64175a0.m75514v(linkedList2);
                    if (C87412m.m108589b(ie42 != null ? ie42.f354051j : null, ie4.f354051j)) {
                        try {
                            String i5 = C86709a0.m107523b().mo121111i();
                            C87412m.m108593f(i5, "account().uinString");
                            if (C118000d0.f352702b == null) {
                                C118000d0.f352702b = MMKV.mmkvWithID("SyncMMKV_" + i5, 2);
                            }
                            MMKV mmkv3 = C118000d0.f352702b;
                            C87412m.m108591d(mmkv3);
                            z = mmkv3.encode("process_data_list", ee42 != null ? ee42.toByteArray() : null);
                        } catch (Exception e3) {
                            Log.printErrStackTrace("MicroMsg.SyncServiceHandler", e3, "process save data queue", new Object[0]);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("process save data queue saveResult:");
                        sb.append(z);
                        sb.append(" QueueSize: ");
                        sb.append((ee42 == null || (linkedList = ee42.f182949d) == null) ? null : Integer.valueOf(linkedList.size()));
                        Log.m105924i("MicroMsg.SyncServiceHandler", sb.toString());
                    }
                    remove = f0Var.f352749c.remove(Integer.valueOf(ie4.f354050i));
                }
                f0Var.mo182782c(ie4);
                if (ie4.f354052n == 1) {
                    C117407d.INSTANCE.idkeyStat(99, 104, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(99, 105, 1, false);
                }
                ((e0$$d) f0Var.f352747a).mo182775b(ie4, remove);
                int stopPerformance = C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcReceiveMsgEnable(), startPerformance);
                ((C119157j) C119157j.f356862d).mo183876g(new C118006a(), "SyncProcessorThreadTag");
                f0Var.mo182780a(ie4, C117999c.AsyncProcessEnd);
                Log.m105924i("MicroMsg.SyncServiceHandler", "sync data process finish costTime:" + (C31543z5.m39453c() - c) + " startPerformance:" + startPerformance + " stopPerformance:" + stopPerformance);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105924i("MicroMsg.SyncServiceHandler", "no sync data process");
            }
        }
    }

    public C118005f0(C118007g gVar) {
        C87412m.m108594g(gVar, "finishCmdCallback");
        this.f352747a = gVar;
    }

    /* renamed from: a */
    public final void mo182780a(ie4 ie4, C117999c cVar) {
        synchronized (this.f352748b) {
            LinkedList<String> linkedList = this.f352748b;
            String str = ie4.f354051j;
            if (str == null) {
                str = "";
            }
            if (!linkedList.contains(str)) {
                Log.m105924i("MicroMsg.SyncServiceHandler", "onContinueSync dataId:" + ie4.f354051j);
                LinkedList<String> linkedList2 = this.f352748b;
                String str2 = ie4.f354051j;
                if (str2 == null) {
                    str2 = "";
                }
                linkedList2.add(str2);
                ((e0$$d) this.f352747a).mo182774a(ie4, cVar);
            } else {
                Log.m105924i("MicroMsg.SyncServiceHandler", "already sync dataId " + ie4.f354051j);
            }
            if (this.f352748b.size() > 5) {
                Log.m105924i("MicroMsg.SyncServiceHandler", "remove first dataId " + this.f352748b.removeFirst());
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c6, code lost:
        r0 = r0.f140594e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo182781b(te3.ie4 r33, pc0.C118010i r34) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r3 = r34
            java.lang.String r0 = "syncData"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "processor"
            gy3.C87412m.m108594g(r3, r0)
            long r4 = eb0.C31543z5.m39453c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r6 = r34.hashCode()
            r0.append(r6)
            r6 = 95
            r0.append(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.f354051j = r0
            int r0 = r34.hashCode()
            r2.f354050i = r0
            int r0 = r2.f354052n
            r6 = 1
            if (r0 != r6) goto L_0x0047
            kj2.d r7 = kj2.C117407d.INSTANCE
            r8 = 99
            r10 = 100
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            goto L_0x0054
        L_0x0047:
            kj2.d r15 = kj2.C117407d.INSTANCE
            r16 = 99
            r18 = 101(0x65, double:5.0E-322)
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
        L_0x0054:
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 == 0) goto L_0x03b3
            boolean r0 = f40.C86718e.m107551r()
            if (r0 != 0) goto L_0x03b3
            f40.o r0 = f40.C86709a0.m107535s()
            if (r0 == 0) goto L_0x03b3
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            if (r0 != 0) goto L_0x0072
            goto L_0x03b3
        L_0x0072:
            te3.x33 r7 = r2.f354045d
            if (r7 != 0) goto L_0x00c1
            java.lang.String r0 = "MicroMsg.SyncServiceHandler"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error SyncResponse "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = " accHasReady:"
            r4.append(r5)
            boolean r5 = f40.C86709a0.m107522a()
            r4.append(r5)
            java.lang.String r5 = " hold:"
            r4.append(r5)
            boolean r5 = f40.C86718e.m107551r()
            r4.append(r5)
            java.lang.String r5 = " accstg:"
            r4.append(r5)
            f40.o r5 = f40.C86709a0.m107535s()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            pc0.g r0 = r1.f352747a
            pc0.e0$$d r0 = (pc0.e0$$d) r0
            r0.mo182775b(r2, r3)
            pc0.g r0 = r1.f352747a
            pc0.c r3 = pc0.C117999c.DoCmdEmptyResp
            pc0.e0$$d r0 = (pc0.e0$$d) r0
            r0.mo182774a(r2, r3)
            return
        L_0x00c1:
            te3.qx r0 = r7.f299846e
            r8 = 0
            if (r0 == 0) goto L_0x00d0
            java.util.LinkedList<te3.px> r0 = r0.f140594e
            if (r0 == 0) goto L_0x00d0
            int r0 = r0.size()
            r9 = r0
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            r0 = 6
            int[] r10 = new int[r0]
            r10 = {0, 1, 2, 3, 5, 10} // fill-array
            r11 = 7
            java.lang.Integer[] r11 = new java.lang.Integer[r11]
            r12 = 249(0xf9, float:3.49E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r8] = r12
            r12 = 248(0xf8, float:3.48E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r6] = r12
            r12 = 247(0xf7, float:3.46E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 2
            r11[r13] = r12
            r12 = 246(0xf6, float:3.45E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14 = 3
            r11[r14] = r12
            r12 = 245(0xf5, float:3.43E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r15 = 4
            r11[r15] = r12
            r12 = 5
            r16 = 244(0xf4, float:3.42E-43)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r11[r12] = r16
            r12 = 243(0xf3, float:3.4E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r0] = r12
            java.lang.Object r0 = kj2.C117407d.m165560t(r9, r10, r11)
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r0, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r0)
            kj2.d r16 = kj2.C117407d.INSTANCE
            r17 = 99
            long r10 = (long) r0
            r21 = 1
            r23 = 0
            r19 = r10
            r16.idkeyStat(r17, r19, r21, r23)
            java.lang.Class<android.os.PowerManager> r0 = android.os.PowerManager.class
            java.lang.String r10 = "isScreenOn"
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0160 }
            java.lang.reflect.Method r0 = r0.getMethod(r10, r11)     // Catch:{ Exception -> 0x0160 }
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0160 }
            java.lang.String r11 = "power"
            java.lang.Object r10 = r10.getSystemService(r11)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r11 = "null cannot be cast to non-null type android.os.PowerManager"
            gy3.C87412m.m108592e(r10, r11)     // Catch:{ Exception -> 0x0160 }
            android.os.PowerManager r10 = (android.os.PowerManager) r10     // Catch:{ Exception -> 0x0160 }
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0160 }
            java.lang.Object r0 = r0.invoke(r10, r11)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r0, r10)     // Catch:{ Exception -> 0x0160 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0160 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0160 }
            goto L_0x0182
        L_0x0160:
            r0 = move-exception
            kj2.d r16 = kj2.C117407d.INSTANCE
            r17 = 99
            r19 = 45
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            java.lang.Object[] r10 = new java.lang.Object[r13]
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10[r8] = r11
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r10[r6] = r0
            java.lang.String r0 = "MicroMsg.SyncServiceHandler"
            java.lang.String r11 = "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r11, r10)
            r0 = 1
        L_0x0182:
            if (r0 != 0) goto L_0x0199
            kj2.d r16 = kj2.C117407d.INSTANCE
            r17 = 99
            if (r9 <= 0) goto L_0x018d
            r9 = 221(0xdd, double:1.09E-321)
            goto L_0x018f
        L_0x018d:
            r9 = 218(0xda, double:1.077E-321)
        L_0x018f:
            r19 = r9
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x01c6
        L_0x0199:
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            if (r0 != 0) goto L_0x01b2
            kj2.d r16 = kj2.C117407d.INSTANCE
            r17 = 99
            if (r9 <= 0) goto L_0x01a6
            r9 = 220(0xdc, double:1.087E-321)
            goto L_0x01a8
        L_0x01a6:
            r9 = 217(0xd9, double:1.07E-321)
        L_0x01a8:
            r19 = r9
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x01c6
        L_0x01b2:
            kj2.d r24 = kj2.C117407d.INSTANCE
            r25 = 99
            if (r9 <= 0) goto L_0x01bb
            r9 = 219(0xdb, double:1.08E-321)
            goto L_0x01bd
        L_0x01bb:
            r9 = 216(0xd8, double:1.067E-321)
        L_0x01bd:
            r27 = r9
            r29 = 1
            r31 = 0
            r24.idkeyStat(r25, r27, r29, r31)
        L_0x01c6:
            int r0 = r7.f299851j
            long r9 = (long) r0
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            r11 = 10
            r12 = 1000(0x3e8, float:1.401E-42)
            if (r0 != r11) goto L_0x01da
            long r13 = (long) r12
            long r9 = r9 * r13
        L_0x01da:
            long r13 = java.lang.System.currentTimeMillis()
            long r17 = r13 - r9
            long r11 = (long) r12
            long r20 = r17 / r11
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r0[r8] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r9)
            r0[r6] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r17)
            r12 = 2
            r0[r12] = r11
            java.lang.Long r12 = java.lang.Long.valueOf(r20)
            r13 = 3
            r0[r13] = r12
            java.lang.String r12 = "MicroMsg.SyncServiceHandler"
            java.lang.String r13 = "client time is:%s,server time is:%s,diff time is:%s, diff second time is:%s,just save millisecond diff time"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r0)
            eb0.C31543z5.m39456f(r9)
            f40.e r0 = f40.C86709a0.m107523b()
            int r9 = r7.f299849h
            int r10 = r7.f299850i
            r0.mo121105D(r9, r10)
            int r0 = r7.f299849h
            f40.C86718e.m107545A(r0)
            te3.qx r0 = r7.f299846e
            if (r0 == 0) goto L_0x0229
            java.util.LinkedList<te3.px> r0 = r0.f140594e
            if (r0 == 0) goto L_0x0229
            boolean r0 = r0.isEmpty()
            if (r0 != r6) goto L_0x0229
            r0 = 1
            goto L_0x022a
        L_0x0229:
            r0 = 0
        L_0x022a:
            if (r0 == 0) goto L_0x025f
            java.lang.String r0 = "MicroMsg.SyncServiceHandler"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Empty CmdList "
            r4.append(r5)
            org.json.JSONObject r5 = r33.toJSON()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            boolean r0 = r2.f354046e
            r1.mo182783d(r0, r7, r3)
            r32.mo182782c(r33)
            pc0.g r0 = r1.f352747a
            pc0.e0$$d r0 = (pc0.e0$$d) r0
            r0.mo182775b(r2, r3)
            pc0.g r0 = r1.f352747a
            pc0.c r3 = pc0.C117999c.DoCmdEmptyCmdList
            pc0.e0$$d r0 = (pc0.e0$$d) r0
            r0.mo182774a(r2, r3)
            return
        L_0x025f:
            java.lang.Object r9 = r1.f352750d
            monitor-enter(r9)
            java.util.HashMap<java.lang.Integer, pc0.i> r0 = r1.f352749c     // Catch:{ all -> 0x03b0 }
            int r10 = r2.f354050i     // Catch:{ all -> 0x03b0 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03b0 }
            r0.put(r10, r3)     // Catch:{ all -> 0x03b0 }
            f40.e r0 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = r0.mo121111i()     // Catch:{ all -> 0x03b0 }
            java.lang.String r10 = "account().uinString"
            gy3.C87412m.m108593f(r0, r10)     // Catch:{ all -> 0x03b0 }
            com.tencent.mmkv.MMKV r10 = pc0.C118000d0.f352702b     // Catch:{ all -> 0x03b0 }
            if (r10 != 0) goto L_0x0296
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b0 }
            r10.<init>()     // Catch:{ all -> 0x03b0 }
            java.lang.String r12 = "SyncMMKV_"
            r10.append(r12)     // Catch:{ all -> 0x03b0 }
            r10.append(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x03b0 }
            r10 = 2
            com.tencent.mmkv.MMKV r0 = com.tencent.mmkv.MMKV.mmkvWithID((java.lang.String) r0, (int) r10)     // Catch:{ all -> 0x03b0 }
            pc0.C118000d0.f352702b = r0     // Catch:{ all -> 0x03b0 }
        L_0x0296:
            com.tencent.mmkv.MMKV r0 = pc0.C118000d0.f352702b     // Catch:{ all -> 0x03b0 }
            gy3.C87412m.m108591d(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r10 = "process_data_list"
            byte[] r0 = r0.decodeBytes(r10)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x02b8
            te3.ee4 r10 = new te3.ee4     // Catch:{ all -> 0x03b0 }
            r10.<init>()     // Catch:{ all -> 0x03b0 }
            r10.parseFrom(r0)     // Catch:{ Exception -> 0x02ac }
            goto L_0x02bd
        L_0x02ac:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "MicroMsg.SyncServiceHandler"
            java.lang.String r13 = "parse data queue"
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ all -> 0x03b0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r12, r13, r14)     // Catch:{ all -> 0x03b0 }
            goto L_0x02bd
        L_0x02b8:
            te3.ee4 r10 = new te3.ee4     // Catch:{ all -> 0x03b0 }
            r10.<init>()     // Catch:{ all -> 0x03b0 }
        L_0x02bd:
            java.util.LinkedList<te3.ie4> r0 = r10.f182949d     // Catch:{ all -> 0x03b0 }
            int r0 = r0.size()     // Catch:{ all -> 0x03b0 }
            if (r0 >= r15) goto L_0x02c7
            r12 = 1
            goto L_0x02c8
        L_0x02c7:
            r12 = 0
        L_0x02c8:
            java.util.LinkedList<te3.ie4> r0 = r10.f182949d     // Catch:{ all -> 0x03b0 }
            r0.add(r2)     // Catch:{ all -> 0x03b0 }
            java.util.LinkedList<te3.ie4> r0 = r10.f182949d     // Catch:{ all -> 0x03b0 }
            int r13 = r0.size()     // Catch:{ all -> 0x03b0 }
            f40.e r0 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x030c }
            java.lang.String r0 = r0.mo121111i()     // Catch:{ Exception -> 0x030c }
            java.lang.String r14 = "account().uinString"
            gy3.C87412m.m108593f(r0, r14)     // Catch:{ Exception -> 0x030c }
            com.tencent.mmkv.MMKV r14 = pc0.C118000d0.f352702b     // Catch:{ Exception -> 0x030c }
            if (r14 != 0) goto L_0x02fc
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x030c }
            r14.<init>()     // Catch:{ Exception -> 0x030c }
            java.lang.String r15 = "SyncMMKV_"
            r14.append(r15)     // Catch:{ Exception -> 0x030c }
            r14.append(r0)     // Catch:{ Exception -> 0x030c }
            java.lang.String r0 = r14.toString()     // Catch:{ Exception -> 0x030c }
            r11 = 2
            com.tencent.mmkv.MMKV r0 = com.tencent.mmkv.MMKV.mmkvWithID((java.lang.String) r0, (int) r11)     // Catch:{ Exception -> 0x030c }
            pc0.C118000d0.f352702b = r0     // Catch:{ Exception -> 0x030c }
        L_0x02fc:
            com.tencent.mmkv.MMKV r0 = pc0.C118000d0.f352702b     // Catch:{ Exception -> 0x030c }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x030c }
            java.lang.String r11 = "process_data_list"
            byte[] r10 = r10.toByteArray()     // Catch:{ Exception -> 0x030c }
            boolean r8 = r0.encode((java.lang.String) r11, (byte[]) r10)     // Catch:{ Exception -> 0x030c }
            goto L_0x0316
        L_0x030c:
            r0 = move-exception
            java.lang.String r10 = "MicroMsg.SyncServiceHandler"
            java.lang.String r11 = "save data queue"
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ all -> 0x03b0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r11, r14)     // Catch:{ all -> 0x03b0 }
        L_0x0316:
            if (r8 == 0) goto L_0x031e
            boolean r0 = r2.f354046e     // Catch:{ all -> 0x03b0 }
            r1.mo182783d(r0, r7, r3)     // Catch:{ all -> 0x03b0 }
            goto L_0x032b
        L_0x031e:
            kj2.d r14 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x03b0 }
            r15 = 99
            r17 = 53
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)     // Catch:{ all -> 0x03b0 }
        L_0x032b:
            int r0 = r2.f354052n     // Catch:{ all -> 0x03b0 }
            if (r0 != r6) goto L_0x033d
            kj2.d r14 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x03b0 }
            r15 = 99
            r17 = 102(0x66, double:5.04E-322)
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)     // Catch:{ all -> 0x03b0 }
            goto L_0x034a
        L_0x033d:
            kj2.d r22 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x03b0 }
            r23 = 99
            r25 = 103(0x67, double:5.1E-322)
            r27 = 1
            r29 = 0
            r22.idkeyStat(r23, r25, r27, r29)     // Catch:{ all -> 0x03b0 }
        L_0x034a:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03b0 }
            monitor-exit(r9)
            java.lang.String r0 = "MicroMsg.SyncServiceHandler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "doProcessCmd: saveResult:"
            r3.append(r6)
            r3.append(r8)
            java.lang.String r6 = " continueSync:"
            r3.append(r6)
            r3.append(r12)
            java.lang.String r6 = " costTime:"
            r3.append(r6)
            long r6 = eb0.C31543z5.m39451a()
            long r6 = r6 - r4
            r3.append(r6)
            java.lang.String r4 = " queueSize:"
            r3.append(r4)
            r3.append(r13)
            java.lang.String r4 = " netSceneMap:"
            r3.append(r4)
            java.util.HashMap<java.lang.Integer, pc0.i> r4 = r1.f352749c
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r4 = " syncData:"
            r3.append(r4)
            org.json.JSONObject r4 = r33.toJSON()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            zt3.t r0 = zt3.C119157j.f356862d
            pc0.f0$a r3 = new pc0.f0$a
            r3.<init>()
            java.lang.String r4 = "SyncProcessorThreadTag"
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183876g(r3, r4)
            if (r12 == 0) goto L_0x03af
            pc0.c r0 = pc0.C117999c.DoCmdProcessEnd
            r1.mo182780a(r2, r0)
        L_0x03af:
            return
        L_0x03b0:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x03b3:
            java.lang.String r0 = "MicroMsg.SyncServiceHandler"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error CmdProcHandler "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = " accHasReady:"
            r4.append(r5)
            boolean r5 = f40.C86709a0.m107522a()
            r4.append(r5)
            java.lang.String r5 = " hold:"
            r4.append(r5)
            boolean r5 = f40.C86718e.m107551r()
            r4.append(r5)
            java.lang.String r5 = " accstg:"
            r4.append(r5)
            f40.o r5 = f40.C86709a0.m107535s()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            r32.mo182782c(r33)
            pc0.g r0 = r1.f352747a
            pc0.e0$$d r0 = (pc0.e0$$d) r0
            r0.mo182775b(r2, r3)
            pc0.g r0 = r1.f352747a
            pc0.c r3 = pc0.C117999c.DoCmdAccNotReady
            pc0.e0$$d r0 = (pc0.e0$$d) r0
            r0.mo182774a(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc0.C118005f0.mo182781b(te3.ie4, pc0.i):void");
    }

    /* renamed from: c */
    public final void mo182782c(ie4 ie4) {
        C87412m.m108594g(ie4, "syncData");
        C101865x33 x332 = ie4.f354045d;
        if (x332 != null) {
            C86709a0.m107535s().mo121142i().mo119676J(8196, Long.valueOf((long) x332.f299847f));
            boolean z = (x332.f299847f & ie4.f354048g) != 0;
            if (!z) {
                C76400h hVar = C72670r.f211432d != null ? C72670r.f211432d.get() : null;
                C118011j jVar = new C118011j(ie4);
                if (hVar != null) {
                    hVar.mo96080a(jVar);
                }
            }
            if (!z && (x332.f299847f & 256) != 0) {
                SnsSyncEvent snsSyncEvent = new SnsSyncEvent();
                snsSyncEvent.f79001d.f79002a = 3;
                snsSyncEvent.publish();
            }
            if (!z && (x332.f299847f & 2097152) != 0) {
                new OpenIMSyncEvent().publish();
            }
            if (!z && (x332.f299847f & 128) != 0) {
                new StorySyncEvent().publish();
            }
            if (!z && (x332.f299847f & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
                new FinderSyncEvent().publish();
            }
            if (!z && (x332.f299847f & 32) != 0) {
                new BypNewSyncEvent().publish();
            }
        }
    }

    /* renamed from: d */
    public final void mo182783d(boolean z, C101865x33 x332, Object obj) {
        C101865x33 x333 = x332;
        C118000d0.C118001a aVar = C118000d0.f352701a;
        byte[] a = aVar.mo182756a();
        byte[] d = C48374j0.m53715d(x333.f299848g);
        Log.m105925i("MicroMsg.SyncServiceHandler", "mergeSyncBuf processResp %s synckey req:%s  shouldMerge:%s", obj, C101126c1.m132547d(a), Boolean.valueOf(z));
        C51018qv3 qv32 = x333.f299848g;
        if (qv32 != null) {
            if ((qv32 != null ? qv32.f140572d : 0) > 0) {
                if (z) {
                    byte[] c = C101126c1.m132546c(a, d);
                    Log.m105925i("MicroMsg.SyncServiceHandler", "processResp synckey merge:%s", C101126c1.m132547d(c));
                    if (c != null) {
                        if (!(c.length == 0)) {
                            d = c;
                        }
                    }
                    x333.f299848g = C48374j0.m53712a(d);
                }
                byte[] d2 = C48374j0.m53715d(x333.f299848g);
                if (!Arrays.equals(a, d2)) {
                    C87412m.m108593f(d2, "newRespKey");
                    aVar.mo182758c(d2, true);
                    return;
                }
                Log.m105925i("MicroMsg.SyncServiceHandler", "processResp %s  Sync Key Not change, not save", obj);
                return;
            }
        }
        C117407d.INSTANCE.idkeyStat(99, 47, 1, false);
    }
}
