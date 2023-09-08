package p269xe;

import android.content.ComponentName;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114462g0;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kj2.C117407d;
import p1177ce.C113287a;
import p1177ce.C113291d;
import p1177ce.C113314g;
import p1190de.C116609b;
import p212oe.C117750b;
import p212oe.C117776s;
import p212oe.b$$f;
import p269xe.C91179e;

/* renamed from: xe.d */
public class C118873d extends C113291d.C113292a {

    /* renamed from: g */
    public int f355597g = 0;

    /* renamed from: h */
    public String f355598h;

    /* renamed from: a */
    public void mo165846a() {
        C114490k0 n;
        Log.m105924i("Matrix.battery.listener", "#onTraceBegin");
        if ((WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv()) && (n = this.f338986e.mo173670n(C114572i.class)) != null) {
            ((C114572i) n).mo173741i("Canary Begin: count = " + this.f355597g, 0, Collections.emptyMap());
        }
        super.mo165846a();
    }

    /* renamed from: b */
    public void mo165847b(C114519q0.C114524d.C114526b bVar, long j) {
        C114519q0.C114524d.C114526b bVar2 = bVar;
        Log.m105925i("Matrix.battery.listener", "#onBgWakeLockTimeout tag=%s packageName=%s millis=%s", bVar2.f343280b, bVar2.f343281c, Long.valueOf(j));
        C117407d.INSTANCE.idkeyStat(1540, 50, 1, false);
        if (!TextUtils.isEmpty(bVar2.f343282d)) {
            this.f338986e.mo173671o(C114451e.class, new d$$a(this, bVar.mo173706a(), j, bVar));
        }
        if (bVar.mo173706a() <= 3600000 && b$$f.m166058c()) {
            int c = C118872b.m167606c();
            int e = C118872b.m167608e();
            String a = C91179e.m114432a();
            Log.m105924i("Matrix.battery.BatteryReporter", "#statBgWakeLocks, millis = " + j);
            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
            C91179e.C91181b.m114437a(0, 5, C118872b.m167609f(), bVar2.f343281c + "-" + bVar2.f343280b, c, e, "wakeBgWarning", j, "lockMils", bVar.mo173706a(), "flag", (long) bVar2.f343279a, a, bVar2.f343282d, 0, 0, 0, "");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01f9 A[EDGE_INSN: B:124:0x01f9->B:43:0x01f9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01b7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo165848c(com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114494b.C114502c<? extends com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry> r42) {
        /*
            r41 = this;
            r1 = r41
            r0 = r42
            java.lang.String r2 = "Matrix.battery.listener"
            java.lang.String r3 = "#onWatchingThreads:"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.util.List<ITEM> r2 = r0.f343212a
            java.util.Iterator r2 = r2.iterator()
        L_0x0011:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0036
            java.lang.Object r3 = r2.next()
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r3 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r3
            java.lang.String r4 = "Matrix.battery.listener"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "\tname = "
            r5.append(r6)
            java.lang.String r3 = r3.f343067c
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x0011
        L_0x0036:
            java.util.List<ITEM> r2 = r0.f343212a
            int r2 = r2.size()
            kj2.d r3 = kj2.C117407d.INSTANCE
            long r8 = (long) r2
            r4 = 1540(0x604, double:7.61E-321)
            r6 = 90
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            java.util.List<ITEM> r2 = r0.f343212a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0058
            java.lang.String r0 = "Matrix.battery.listener"
            java.lang.String r2 = "thread list is emptry, skip dumping"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x0374
        L_0x0058:
            ce.d$a$d r2 = new ce.d$a$d
            r2.<init>()
            r2.mo165870i()
            java.lang.String r3 = "| Thread WatchDog"
            java.lang.StringBuilder r4 = r2.f339024a
            r4.append(r3)
            java.lang.String r3 = "\n"
            r2.mo165862a(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "jiffies("
            r3.append(r4)
            java.util.List<ITEM> r4 = r0.f343212a
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.mo165863b(r3)
            java.lang.String r3 = "desc"
            java.lang.String r4 = "(status)name(tid)\ttotal"
            r2.mo165869h(r3, r4)
            java.util.List<ITEM> r3 = r0.f343212a
            java.util.Iterator r3 = r3.iterator()
        L_0x0099:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x010f
            java.lang.Object r4 = r3.next()
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r4 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r4
            DIGIT r5 = r4.f343211a
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.String r7 = "|   -> ("
            java.lang.StringBuilder r8 = r2.f339024a
            r8.append(r7)
            boolean r7 = r4.f343068d
            if (r7 == 0) goto L_0x00bc
            java.lang.String r7 = "+"
            goto L_0x00bf
        L_0x00bc:
            java.lang.String r7 = "~"
        L_0x00bf:
            java.lang.StringBuilder r8 = r2.f339024a
            r8.append(r7)
            java.lang.String r7 = "/"
            java.lang.StringBuilder r8 = r2.f339024a
            r8.append(r7)
            java.lang.String r7 = r4.f343069e
            java.lang.StringBuilder r8 = r2.f339024a
            r8.append(r7)
            java.lang.String r7 = ")"
            java.lang.StringBuilder r8 = r2.f339024a
            r8.append(r7)
            java.lang.String r7 = r4.f343067c
            java.lang.StringBuilder r8 = r2.f339024a
            r8.append(r7)
            java.lang.String r7 = "("
            java.lang.StringBuilder r8 = r2.f339024a
            r8.append(r7)
            int r4 = r4.f343066b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.StringBuilder r7 = r2.f339024a
            r7.append(r4)
            java.lang.String r4 = ")\t"
            java.lang.StringBuilder r7 = r2.f339024a
            r7.append(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            java.lang.StringBuilder r5 = r2.f339024a
            r5.append(r4)
            java.lang.String r4 = "\tjiffies"
            java.lang.StringBuilder r5 = r2.f339024a
            r5.append(r4)
            java.lang.String r4 = "\n"
            r2.mo165862a(r4)
            goto L_0x0099
        L_0x010f:
            java.lang.String r3 = "dump_stacks"
            r2.mo165863b(r3)
            java.util.List<ITEM> r3 = r0.f343212a
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x011d:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x033e
            java.lang.Object r8 = r3.next()
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r8 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r8
            java.lang.String r9 = "|   -> "
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r9)
            java.lang.String r9 = "("
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r9)
            java.lang.String r9 = r8.f343069e
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r9)
            java.lang.String r9 = ")"
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r9)
            java.lang.String r9 = r8.f343067c
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r9)
            java.lang.String r9 = "("
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r9)
            int r9 = r8.f343066b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r9)
            java.lang.String r9 = ")"
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r9)
            java.lang.String r9 = "\n"
            r2.mo165862a(r9)
            ce.g r9 = r1.f338985d
            ce.f r9 = r9.f339057d
            java.util.List<java.lang.String> r9 = r9.f339052w
            java.util.Iterator r9 = r9.iterator()
        L_0x0175:
            boolean r10 = r9.hasNext()
            r11 = 1
            if (r10 == 0) goto L_0x018c
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r12 = r8.f343067c
            boolean r10 = r12.contains(r10)
            if (r10 == 0) goto L_0x0175
            r6 = 1
            goto L_0x018d
        L_0x018c:
            r11 = 0
        L_0x018d:
            java.lang.String r9 = "skip ui thread"
            int r10 = r8.f343066b
            int r12 = android.os.Process.myPid()
            if (r10 == r12) goto L_0x0238
            int r10 = r8.f343066b
            java.lang.String r10 = com.tencent.wxperf.thread.ThreadInspect.jUnwindR(r10)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 == 0) goto L_0x01f8
            if (r7 != 0) goto L_0x01a9
            java.util.Map r7 = java.lang.Thread.getAllStackTraces()
        L_0x01a9:
            java.util.Set r12 = r7.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x01b1:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01f9
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.Thread r14 = (java.lang.Thread) r14
            java.lang.Object r13 = r13.getValue()
            java.lang.StackTraceElement[] r13 = (java.lang.StackTraceElement[]) r13
            java.lang.String r14 = r14.getName()
            java.lang.String r15 = r8.f343067c
            boolean r16 = r15.equalsIgnoreCase(r14)
            if (r16 != 0) goto L_0x01db
            boolean r14 = r14.contains(r15)
            if (r14 == 0) goto L_0x01b1
        L_0x01db:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = "StackTraces"
            r9.<init>(r12)
            int r12 = r13.length
            r14 = 0
        L_0x01e4:
            if (r14 >= r12) goto L_0x01f3
            r15 = r13[r14]
            java.lang.String r4 = "\nat "
            r9.append(r4)
            r9.append(r15)
            int r14 = r14 + 1
            goto L_0x01e4
        L_0x01f3:
            java.lang.String r9 = r9.toString()
            goto L_0x01f9
        L_0x01f8:
            r9 = r10
        L_0x01f9:
            if (r11 == 0) goto L_0x01fd
            r4 = 3
            goto L_0x01fe
        L_0x01fd:
            r4 = 0
        L_0x01fe:
            int r11 = r8.f343066b
            int r12 = android.os.Process.myTid()
            if (r11 != r12) goto L_0x020b
            java.lang.String r11 = com.tencent.wxperf.thread.ThreadInspect.getLocalCurrentThread()
            goto L_0x0211
        L_0x020b:
            int r11 = r8.f343066b
            java.lang.String r11 = com.tencent.wxperf.thread.ThreadInspect.getLocalThread(r11)
        L_0x0211:
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x0236
            if (r4 <= 0) goto L_0x0236
            int r4 = r4 + -1
            r11 = 3000(0xbb8, double:1.482E-320)
            java.lang.Thread.sleep(r11)     // Catch:{ InterruptedException -> 0x0221 }
            goto L_0x0222
        L_0x0221:
        L_0x0222:
            int r11 = r8.f343066b
            int r12 = android.os.Process.myTid()
            if (r11 != r12) goto L_0x022f
            java.lang.String r11 = com.tencent.wxperf.thread.ThreadInspect.getLocalCurrentThread()
            goto L_0x0211
        L_0x022f:
            int r11 = r8.f343066b
            java.lang.String r11 = com.tencent.wxperf.thread.ThreadInspect.getLocalThread(r11)
            goto L_0x0211
        L_0x0236:
            r4 = r11
            goto L_0x023b
        L_0x0238:
            r11 = r9
            r4 = 0
            r10 = 0
        L_0x023b:
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 == 0) goto L_0x0247
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 != 0) goto L_0x025f
        L_0x0247:
            com.tencent.matrix.batterycanary.monitor.feature.i r12 = r1.f338986e
            oe.s r12 = (p212oe.C117776s) r12
            int r13 = r8.f343066b
            boolean r14 = android.text.TextUtils.isEmpty(r10)
            if (r14 == 0) goto L_0x0254
            r10 = r4
        L_0x0254:
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f343161j
            java.lang.String r12 = java.lang.String.valueOf(r13)
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r12, r10)
        L_0x025f:
            java.lang.String r4 = "|      JAVA"
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r4)
            java.lang.String r4 = "\n"
            r2.mo165862a(r4)
            java.lang.String r4 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "\n"
            java.lang.String[] r4 = r4.split(r10)
            int r10 = r4.length
            r12 = 0
        L_0x0278:
            if (r12 >= r10) goto L_0x0291
            r13 = r4[r12]
            java.lang.String r14 = "|      "
            java.lang.StringBuilder r15 = r2.f339024a
            r15.append(r14)
            java.lang.StringBuilder r14 = r2.f339024a
            r14.append(r13)
            java.lang.String r13 = "\n"
            r2.mo165862a(r13)
            int r12 = r12 + 1
            goto L_0x0278
        L_0x0291:
            java.lang.String r4 = "|      NATIVE"
            java.lang.StringBuilder r10 = r2.f339024a
            r10.append(r4)
            java.lang.String r4 = "\n"
            r2.mo165862a(r4)
            java.lang.String r4 = java.lang.String.valueOf(r11)
            java.lang.String r10 = "\n"
            java.lang.String[] r4 = r4.split(r10)
            int r10 = r4.length
            r12 = 0
        L_0x02aa:
            if (r12 >= r10) goto L_0x02c3
            r13 = r4[r12]
            java.lang.String r14 = "|      "
            java.lang.StringBuilder r15 = r2.f339024a
            r15.append(r14)
            java.lang.StringBuilder r14 = r2.f339024a
            r14.append(r13)
            java.lang.String r13 = "\n"
            r2.mo165862a(r13)
            int r12 = r12 + 1
            goto L_0x02aa
        L_0x02c3:
            java.util.List<java.lang.String> r4 = p269xe.C91179e.C91181b.C91182a.f261437a
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 == 0) goto L_0x02d3
            boolean r4 = android.text.TextUtils.isEmpty(r11)
            if (r4 == 0) goto L_0x02d3
            goto L_0x011d
        L_0x02d3:
            java.lang.String r19 = p269xe.C118872b.m167609f()
            java.lang.String r4 = r8.f343067c
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r12 = ""
            if (r10 != 0) goto L_0x02e6
            java.lang.String r10 = p269xe.C91178c.m114430c(r9)
            goto L_0x02e7
        L_0x02e6:
            r10 = r12
        L_0x02e7:
            boolean r13 = android.text.TextUtils.isEmpty(r10)
            if (r13 == 0) goto L_0x02f7
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L_0x02f7
            java.lang.String r10 = p269xe.C91178c.m114431d(r11)
        L_0x02f7:
            r40 = r10
            android.util.SparseArray<java.lang.Integer> r10 = p269xe.C91179e.C91181b.f261436a
            r17 = 1
            r18 = 5
            java.lang.String r20 = p269xe.C91178c.m114428a(r11)
            int r21 = p269xe.C118872b.m167606c()
            int r22 = p269xe.C118872b.m167608e()
            r24 = 0
            int r10 = r8.f343066b
            java.lang.String r26 = p269xe.C118872b.m167612i(r4, r10)
            r27 = 0
            java.lang.String r4 = r8.f343069e
            r30 = 0
            if (r6 == 0) goto L_0x0320
            java.lang.String r10 = "ANR_DUMP"
            r32 = r10
            goto L_0x0322
        L_0x0320:
            r32 = r12
        L_0x0322:
            java.lang.String r33 = p269xe.C91178c.m114428a(r9)
            r34 = 0
            r36 = 0
            boolean r8 = r8.f343068d
            if (r8 == 0) goto L_0x0331
            r8 = 1
            goto L_0x0333
        L_0x0331:
            r8 = 0
        L_0x0333:
            r38 = r8
            java.lang.String r23 = "threadWatchException"
            r29 = r4
            p269xe.C91179e.C91181b.m114437a(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r29, r30, r32, r33, r34, r36, r38, r40)
            goto L_0x011d
        L_0x033e:
            r2.mo165867f()
            r2.mo165865d()
            java.util.List<oe.l$a> r2 = p212oe.C89203l.f257037a
            monitor-enter(r2)
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0375 }
        L_0x034b:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0375 }
            if (r4 == 0) goto L_0x035b
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0375 }
            oe.l$a r4 = (p212oe.C89203l.C89204a) r4     // Catch:{ all -> 0x0375 }
            r4.mo112632a(r0)     // Catch:{ all -> 0x0375 }
            goto L_0x034b
        L_0x035b:
            monitor-exit(r2)     // Catch:{ all -> 0x0375 }
            if (r6 == 0) goto L_0x0374
            kj2.d r7 = kj2.C117407d.INSTANCE
            r8 = 1540(0x604, double:7.61E-321)
            r10 = 92
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            java.lang.String r0 = "Matrix.battery.BatteryCanaryConfigs"
            java.lang.String r2 = "APP_TANR thread"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            com.tencent.matrix.trace.tracer.SignalAnrTracer.m98143l()
        L_0x0374:
            return
        L_0x0375:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0375 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p269xe.C118873d.mo165848c(com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c):void");
    }

    @Deprecated
    /* renamed from: d */
    public void mo165849d(int i, C114519q0.C114524d.C114526b bVar) {
        int i2 = i;
        C114519q0.C114524d.C114526b bVar2 = bVar;
        Log.m105925i("Matrix.battery.listener", "#onWakeLockTimeout tag=%s packageName=%s warningCount=%s", bVar2.f343280b, bVar2.f343281c, Integer.valueOf(i));
        if (i2 <= 1) {
            C117407d.INSTANCE.idkeyStat(1013, 201, 1, false);
        }
        long j = (long) i2;
        if (j == Math.max(C117750b.f352128g, 2) && !TextUtils.isEmpty(bVar2.f343282d)) {
            this.f338986e.mo173671o(C114451e.class, new d$$b(this, bVar.mo173706a(), i, bVar));
        }
        if (i2 <= 100 && bVar.mo173706a() <= 3600000 && b$$f.m166058c()) {
            int c = C118872b.m167606c();
            int e = C118872b.m167608e();
            String a = C91179e.m114432a();
            Log.m105924i("Matrix.battery.BatteryReporter", "#statWakeLocks, count = " + i2);
            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
            C91179e.C91181b.m114437a(0, 5, C118872b.m167609f(), bVar2.f343281c + "-" + bVar2.f343280b, c, e, "wakeWarning", j, "lockMils", bVar.mo173706a(), "flag", (long) bVar2.f343279a, a, bVar2.f343282d, 0, 0, 0, "");
        }
    }

    /* renamed from: e */
    public void mo165850e(boolean z) {
        C114490k0 n;
        Log.m105924i("Matrix.battery.listener", "#onTraceEnd, fg = " + z);
        if ((WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv()) && (n = this.f338986e.mo173670n(C114572i.class)) != null) {
            ((C114572i) n).mo173741i("Canary End: count = " + this.f355597g + ", fg = " + z, 0, Collections.emptyMap());
        }
        super.mo165850e(z);
    }

    /* renamed from: f */
    public void mo165851f(C114490k0.C114491a.C114492a<C114436a.C114440d> aVar) {
        C117776s sVar = new C117776s(this.f338985d, "internal");
        sVar.f343163l = C113287a.m155094b(aVar.f343208d);
        ((HashMap) sVar.f343154c).put(C114462g0.C114465c.class, aVar);
        new d$$j("internal").mo183582a(sVar);
    }

    /* renamed from: g */
    public void mo165852g(boolean z, int i, int i2, ComponentName componentName, long j) {
        boolean z2 = z;
        Log.m105924i("Matrix.battery.listener", "statForegroundServiceLeak");
        if ((z2 || MMApplicationContext.isMainProcess()) && b$$f.m166058c() && componentName != null) {
            String f = C118872b.m167609f();
            String className = componentName.getClassName();
            int c = C118872b.m167606c();
            int e = C118872b.m167608e();
            String a = C91179e.m114432a();
            Log.m105924i("Matrix.battery.BatteryReporter", "#statForegroundServiceLeak, isMyself = " + z2);
            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
            C91179e.C91181b.m114437a(0, 5, f, className, c, e, z2 ? "statMyImportance" : "statOtherImportance", (long) i, "gblIpt", (long) i2, "duringMin", j, a, "", 0, 0, 0, "");
        }
    }

    /* renamed from: h */
    public void mo165853h(C116609b.C116612c cVar) {
        C116609b.C116612c cVar2 = cVar;
        String str = cVar2.f349678a;
        String str2 = cVar2.f349679b;
        String str3 = cVar2.f349680c;
        long j = cVar2.f349681d;
        List<String> list = C91179e.C91181b.C91182a.f261437a;
        C113287a a = C113287a.m155093a();
        if (a.f338975m) {
            int c = a.mo165839c();
            int d = a.mo165840d();
            String f = C118872b.m167609f();
            long max = j > 0 ? Math.max(1, j / 60000) : 0;
            String str4 = TextUtils.isEmpty(str2) ? "empty" : str2;
            Log.m105924i("Matrix.battery.BatteryReporter", "#reportIllegalNotification");
            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
            if (TextUtils.isEmpty(str)) {
                str = "empty";
            }
            C91179e.C91181b.m114437a(1, 5, f, str4, c, d, "illNotify", 0, str, 0, "duringMin", max, a.f338971i, str3, (long) a.f338964b, (long) a.f338967e, (long) a.f338972j, "");
        }
    }

    @Deprecated
    /* renamed from: i */
    public C113291d.C113292a mo165854i(C113314g gVar) {
        this.f338985d = gVar;
        this.f338986e = new d$$h(this, gVar, "canary").f352286a;
        return this;
    }

    /* renamed from: j */
    public void mo165855j(C114467i iVar) {
        C113287a aVar;
        super.mo165855j(iVar);
        if (C117750b.m166052j(iVar.f343167p, iVar) && (aVar = iVar.f343163l) != null) {
            iVar.mo173668l(JiffiesMonitorFeature.JiffiesSnapshot.class, new d$$f(iVar, aVar));
        }
    }

    /* renamed from: k */
    public C113291d.C113292a.C113295c mo165856k() {
        return new d$$i();
    }

    /* renamed from: l */
    public void mo165857l(C114467i iVar) {
        Log.m105924i("Matrix.battery.listener", "onCanaryDump monitors");
        iVar.mo173664h(new d$$c(this));
        super.mo165857l(iVar);
    }

    /* renamed from: m */
    public void mo165858m(C114467i iVar) {
        new d$$j("canary").mo183582a(iVar);
        super.mo165858m(iVar);
    }
}
