package p375qh;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eu3.C58834h;
import eu3.C97749e;
import f40.C86709a0;
import h81.C32735h;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import kd0.C76551y;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C76861g;

/* renamed from: qh.o */
public class C77347o implements C11385n {

    /* renamed from: t */
    public static boolean f225520t = true;

    /* renamed from: u */
    public static int f225521u;

    /* renamed from: d */
    public HandlerThread f225522d;

    /* renamed from: e */
    public MMHandler f225523e;

    /* renamed from: f */
    public volatile boolean f225524f = false;

    /* renamed from: g */
    public Queue<String> f225525g = new LinkedList();

    /* renamed from: h */
    public Queue<C76551y> f225526h = new LinkedList();

    /* renamed from: i */
    public Map<String, C76861g.C47263a> f225527i = new HashMap();

    /* renamed from: j */
    public boolean f225528j = false;

    /* renamed from: n */
    public boolean f225529n = false;

    /* renamed from: o */
    public boolean f225530o = false;

    /* renamed from: p */
    public int f225531p = 0;

    /* renamed from: q */
    public long f225532q = 0;

    /* renamed from: r */
    public C76861g.C47263a f225533r = new C76861g.C47263a();

    /* renamed from: s */
    public MTimerHandler f225534s = new MTimerHandler(mo107479d().getLooper(), (MTimerHandler.CallBack) new o$$d(this), false);

    public C77347o() {
        Log.m105925i("MicroMsg.SceneVoiceService", "SceneVoiceService %s", Util.getStack().toString());
        C86709a0.m107524d().mo123455a(127, this);
        C86709a0.m107524d().mo123455a(128, this);
    }

    /* renamed from: a */
    public static void m93241a(C77347o oVar) {
        synchronized (oVar) {
            Log.m105924i("MicroMsg.SceneVoiceService", "realStopThread");
            oVar.f225523e = null;
            HandlerThread handlerThread = oVar.f225522d;
            oVar.f225522d = null;
            if (handlerThread != null) {
                Log.m105924i("MicroMsg.SceneVoiceService", "finishThread " + handlerThread);
                handlerThread.quitSafely();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03bd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m93242b(p375qh.C77347o r30) {
        /*
            r1 = r30
            r30.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r1.f225532q = r2
            boolean r0 = r1.f225528j
            r3 = 0
            java.lang.String r5 = "MicroMsg.SceneVoiceService"
            if (r0 != 0) goto L_0x001c
            java.util.Queue<kd0.y> r0 = r1.f225526h
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r0 == 0) goto L_0x002a
        L_0x001c:
            boolean r0 = r1.f225529n
            if (r0 != 0) goto L_0x03a0
            java.util.Queue<java.lang.String> r0 = r1.f225525g
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x03a0
        L_0x002a:
            java.util.List r0 = kd0.C76552z.m92078p()     // Catch:{ NullPointerException -> 0x002f }
            goto L_0x0039
        L_0x002f:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r8 = "getUnfinishInfo throw npe"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r7, r8, r0)
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x03a0
            int r7 = r0.size()
            if (r7 != 0) goto L_0x0043
            goto L_0x03a0
        L_0x0043:
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0052:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x034f
            java.lang.Object r10 = r0.next()
            kd0.y r10 = (kd0.C76551y) r10
            java.util.Map<java.lang.String, nj.g$a> r11 = r1.f225527i
            java.lang.String r12 = r10.f224051b
            java.util.HashMap r11 = (java.util.HashMap) r11
            boolean r11 = r11.containsKey(r12)
            if (r11 == 0) goto L_0x0081
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "File is Already running:"
            r11.append(r12)
            java.lang.String r10 = r10.f224051b
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r10)
            goto L_0x0052
        L_0x0081:
            long r11 = r10.f224060k
            long r11 = r7 - r11
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Get file:"
            r13.append(r14)
            java.lang.String r14 = r10.f224051b
            r13.append(r14)
            java.lang.String r14 = " status:"
            r13.append(r14)
            int r15 = r10.f224058i
            r13.append(r15)
            java.lang.String r15 = " user"
            r13.append(r15)
            java.lang.String r3 = r10.f224052c
            r13.append(r3)
            java.lang.String r3 = " human:"
            r13.append(r3)
            java.lang.String r2 = r10.f224063n
            r13.append(r2)
            java.lang.String r2 = " create:"
            r13.append(r2)
            r18 = r5
            long r4 = r10.f224059j
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r4)
            r13.append(r4)
            java.lang.String r4 = " last:"
            r13.append(r4)
            r19 = r7
            long r6 = r10.f224060k
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r6)
            r13.append(r6)
            java.lang.String r6 = " now:"
            r13.append(r6)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r19)
            r13.append(r7)
            java.lang.String r7 = " "
            r13.append(r7)
            r21 = r6
            long r5 = r10.f224060k
            long r5 = r19 - r5
            r13.append(r5)
            java.lang.String r6 = " intervalTime:"
            r13.append(r6)
            r13.append(r11)
            java.lang.String r5 = r13.toString()
            r13 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
            int r5 = r10.f224058i
            r8 = 5
            if (r5 == r8) goto L_0x0108
            r8 = 6
            if (r5 != r8) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r5 = 0
            goto L_0x0109
        L_0x0108:
            r5 = 1
        L_0x0109:
            r22 = 43200(0xa8c0, double:2.13436E-319)
            if (r5 == 0) goto L_0x0170
            int r5 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r5 <= 0) goto L_0x0118
            java.lang.String r2 = r10.f224051b
            kd0.C76552z.m92084v(r2)
            goto L_0x0152
        L_0x0118:
            int r5 = r10.f224056g
            int r8 = r10.f224055f
            if (r5 < r8) goto L_0x0158
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file: "
            r2.append(r3)
            java.lang.String r3 = r10.f224051b
            r2.append(r3)
            java.lang.String r3 = " stat:"
            r2.append(r3)
            int r3 = r10.f224058i
            r2.append(r3)
            r8 = r21
            r2.append(r8)
            int r3 = r10.f224056g
            r2.append(r3)
            java.lang.String r3 = " net:"
            r2.append(r3)
            int r3 = r10.f224055f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
        L_0x0152:
            r21 = r0
            r6 = r19
            goto L_0x029d
        L_0x0158:
            r8 = r21
            java.util.Queue<kd0.y> r5 = r1.f225526h
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            r5.offer(r10)
            java.util.Map<java.lang.String, nj.g$a> r5 = r1.f225527i
            r21 = r0
            java.lang.String r0 = r10.f224051b
            java.util.HashMap r5 = (java.util.HashMap) r5
            r24 = r6
            r6 = 0
            r5.put(r0, r6)
            goto L_0x0176
        L_0x0170:
            r24 = r6
            r8 = r21
            r21 = r0
        L_0x0176:
            int r0 = r10.f224058i
            r6 = 3
            r5 = 1
            if (r0 <= r5) goto L_0x017e
            if (r0 <= r6) goto L_0x0182
        L_0x017e:
            r5 = 8
            if (r0 != r5) goto L_0x0184
        L_0x0182:
            r0 = 1
            goto L_0x0185
        L_0x0184:
            r0 = 0
        L_0x0185:
            if (r0 == 0) goto L_0x02b4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "now "
            r0.append(r5)
            r5 = r7
            r6 = r19
            r0.append(r6)
            r19 = r5
            java.lang.String r5 = "info.getLastModifyTime()  "
            r0.append(r5)
            r20 = r2
            r5 = r3
            long r2 = r10.f224060k
            r0.append(r2)
            java.lang.String r2 = "  info.getStatus() "
            r0.append(r2)
            int r2 = r10.f224058i
            r0.append(r2)
            java.lang.String r2 = "  info.getCreateTime() "
            r0.append(r2)
            long r2 = r10.f224059j
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            java.lang.String r0 = r10.f224051b
            boolean r2 = wi3.C78603a.f230232b
            if (r2 == 0) goto L_0x01d1
            java.lang.String r2 = wi3.C78603a.f230231a
            boolean r0 = gy3.C87412m.m108589b(r2, r0)
            if (r0 == 0) goto L_0x01d1
            r0 = 1
            goto L_0x01d2
        L_0x01d1:
            r0 = 0
        L_0x01d2:
            java.lang.String r2 = r10.f224051b
            boolean r3 = wi3.C78603a.f230234d
            if (r3 == 0) goto L_0x01e4
            java.lang.String r3 = wi3.C78603a.f230233c
            boolean r2 = gy3.C87412m.m108589b(r3, r2)
            if (r2 == 0) goto L_0x01e4
            r25 = r5
            r2 = 1
            goto L_0x01e7
        L_0x01e4:
            r25 = r5
            r2 = 0
        L_0x01e7:
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r16 = 0
            r5[r16] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r17 = 1
            r5[r17] = r3
            java.lang.String r3 = "from trans voice scene: %s, isNewTransVoiceScene: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r5)
            if (r0 != 0) goto L_0x027f
            if (r2 != 0) goto L_0x027f
            long r2 = r10.f224060k
            long r2 = r6 - r2
            r26 = 10
            java.lang.String r0 = "time out file: "
            int r5 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r5 <= 0) goto L_0x0244
            int r2 = r10.f224058i
            r3 = 2
            if (r2 == r3) goto L_0x0218
            r3 = 1
            if (r2 != r3) goto L_0x0244
        L_0x0218:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = r10.f224051b
            r2.append(r0)
            r2.append(r4)
            long r3 = r10.f224060k
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r3)
            r2.append(r0)
            r2.append(r8)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            java.lang.String r0 = r10.f224051b
            kd0.C76552z.m92084v(r0)
            goto L_0x029d
        L_0x0244:
            long r2 = r10.f224059j
            long r2 = r6 - r2
            r26 = 600(0x258, double:2.964E-321)
            int r5 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r5 <= 0) goto L_0x027f
            int r2 = r10.f224058i
            r3 = 3
            if (r2 != r3) goto L_0x027f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = r10.f224051b
            r2.append(r0)
            r2.append(r4)
            long r3 = r10.f224060k
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r3)
            r2.append(r0)
            r2.append(r8)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            java.lang.String r0 = r10.f224051b
            kd0.C76552z.m92084v(r0)
            goto L_0x029d
        L_0x027f:
            java.lang.String r0 = r10.f224052c
            int r0 = r0.length()
            if (r0 > 0) goto L_0x02a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Create a new ChatRoom? , set username first :"
            r0.append(r2)
            java.lang.String r2 = r10.f224051b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
        L_0x029d:
            r3 = 0
            goto L_0x0348
        L_0x02a0:
            java.util.Queue<java.lang.String> r0 = r1.f225525g
            java.lang.String r2 = r10.f224051b
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.offer(r2)
            java.util.Map<java.lang.String, nj.g$a> r0 = r1.f225527i
            java.lang.String r2 = r10.f224051b
            java.util.HashMap r0 = (java.util.HashMap) r0
            r3 = 0
            r0.put(r2, r3)
            goto L_0x02bf
        L_0x02b4:
            r25 = r3
            r3 = 0
            r28 = r19
            r20 = r2
            r19 = r7
            r6 = r28
        L_0x02bf:
            int r0 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0348
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_msg_voice_disable_timeout_error
            r5 = 0
            int r0 = r0.mo58779Qe(r2, r5)
            r2 = 1
            if (r0 != r2) goto L_0x02d7
            r0 = 1
            goto L_0x02d8
        L_0x02d7:
            r0 = 0
        L_0x02d8:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0348
            java.lang.String r0 = r10.f224051b
            kd0.C76552z.m92084v(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "set timeout error file:"
            r0.append(r2)
            java.lang.String r2 = r10.f224051b
            r0.append(r2)
            r0.append(r14)
            int r2 = r10.f224058i
            r0.append(r2)
            r0.append(r15)
            java.lang.String r2 = r10.f224052c
            r0.append(r2)
            r2 = r25
            r0.append(r2)
            java.lang.String r2 = r10.f224063n
            r0.append(r2)
            r2 = r20
            r0.append(r2)
            long r14 = r10.f224059j
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r14)
            r0.append(r2)
            r0.append(r4)
            long r4 = r10.f224060k
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r4)
            r0.append(r2)
            r0.append(r8)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r6)
            r0.append(r2)
            r2 = r19
            r0.append(r2)
            long r4 = r10.f224060k
            long r4 = r6 - r4
            r0.append(r4)
            r2 = r24
            r0.append(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
        L_0x0348:
            r7 = r6
            r5 = r13
            r0 = r21
            r3 = 0
            goto L_0x0052
        L_0x034f:
            r13 = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "GetNeedRun procing:"
            r0.append(r2)
            java.util.Map<java.lang.String, nj.g$a> r2 = r1.f225527i
            java.util.HashMap r2 = (java.util.HashMap) r2
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = " [recv:"
            r0.append(r2)
            java.util.Queue<kd0.y> r2 = r1.f225526h
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = ",send:"
            r0.append(r2)
            java.util.Queue<java.lang.String> r2 = r1.f225525g
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            java.util.Queue<kd0.y> r0 = r1.f225526h
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.size()
            java.util.Queue<java.lang.String> r0 = r1.f225525g
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.size()
            goto L_0x03a1
        L_0x03a0:
            r13 = r5
        L_0x03a1:
            boolean r0 = r1.f225528j
            if (r0 != 0) goto L_0x03c7
            java.util.Queue<kd0.y> r0 = r1.f225526h
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x03c7
            boolean r0 = r1.f225529n
            if (r0 != 0) goto L_0x03c7
            java.util.Queue<java.lang.String> r0 = r1.f225525g
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x03c7
            r30.mo107478c()
            java.lang.String r0 = "No Data Any More , Stop Service"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x04cc
        L_0x03c7:
            boolean r0 = r1.f225528j
            if (r0 != 0) goto L_0x045b
            java.util.Queue<kd0.y> r0 = r1.f225526h
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x045b
            java.util.Queue<kd0.y> r0 = r1.f225526h
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.poll()
            kd0.y r0 = (kd0.C76551y) r0
            java.lang.String r2 = r0.f224051b
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            if (r3 == 0) goto L_0x040c
            long r4 = r0.f224054e
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            boolean r3 = r3.py0(r4)
            if (r3 == 0) goto L_0x040c
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            long r5 = r0.f224054e
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "[oneliang] msg svrid:%s,it is in delete msg list,may be revoke msg come first,msg info insert last,so no need to add msg info and delete voice info"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r4)
            r3 = 1
            goto L_0x040d
        L_0x040c:
            r3 = 0
        L_0x040d:
            if (r3 == 0) goto L_0x042d
            java.lang.String r1 = r0.f224051b
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0426
            kd0.g0 r1 = kd0.C76546u.yx0()
            java.lang.String r0 = r0.f224051b
            r1.mo106784c(r0)
            goto L_0x04cc
        L_0x0426:
            java.lang.String r0 = "[oneliang] the length of voice info file name is zero"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x04cc
        L_0x042d:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r30.toString()
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r2
            java.lang.String r5 = "Start Recv[%s] :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r5, r3)
            if (r2 == 0) goto L_0x045b
            java.util.Map<java.lang.String, nj.g$a> r3 = r1.f225527i
            nj.g$a r5 = new nj.g$a
            r5.<init>()
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r2, r5)
            r1.f225528j = r4
            kd0.f r2 = new kd0.f
            r2.<init>(r0)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r2)
        L_0x045b:
            boolean r0 = r1.f225529n
            if (r0 != 0) goto L_0x04cc
            java.util.Queue<java.lang.String> r0 = r1.f225525g
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x04cc
            java.util.Queue<java.lang.String> r0 = r1.f225525g
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.poll()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Start Send :"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            if (r0 == 0) goto L_0x04cc
            java.util.Map<java.lang.String, nj.g$a> r2 = r1.f225527i
            nj.g$a r3 = new nj.g$a
            r3.<init>()
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r0, r3)
            r5 = 1
            r1.f225529n = r5
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "VoiceCdnUploadSwitch"
            r3 = 0
            int r1 = r1.mo107404b(r2, r3)
            if (r1 != r5) goto L_0x04af
            r1 = 1
            goto L_0x04b0
        L_0x04af:
            r1 = 0
        L_0x04b0:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r2[r3] = r4
            java.lang.String r4 = "useCdnUpload %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r4, r2)
            kd0.g r2 = new kd0.g
            r2.<init>(r0, r3)
            r2.f224019o = r1
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r2)
        L_0x04cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p375qh.C77347o.m93242b(qh.o):void");
    }

    /* renamed from: c */
    public final void mo107478c() {
        ((HashMap) this.f225527i).clear();
        ((LinkedList) this.f225525g).clear();
        ((LinkedList) this.f225526h).clear();
        this.f225529n = false;
        this.f225528j = false;
        this.f225530o = false;
        mo107481f(false);
        Log.m105924i("MicroMsg.SceneVoiceService", "Finish service use time(ms):" + this.f225533r.mo72288a() + "[" + toString() + "]");
    }

    /* renamed from: d */
    public final synchronized MMHandler mo107479d() {
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enable_voicd_worker_handler_thread, true)) {
            if (this.f225522d == null || this.f225523e == null) {
                Log.m105924i("MicroMsg.SceneVoiceService", "getWorkerHandler create new handler thread");
                StringBuilder sb = new StringBuilder();
                sb.append("SceneVoiceService-");
                int i = f225521u;
                f225521u = i + 1;
                sb.append(i);
                String sb4 = sb.toString();
                int i2 = C58834h.f168432b;
                HandlerThread a = C97749e.m126093a(sb4, 0);
                this.f225522d = a;
                a.start();
                this.f225523e = new MMHandler(this.f225522d.getLooper());
            }
            this.f225523e.removeCallbacksAndMessages(111);
            return this.f225523e;
        }
        return C86709a0.m107525e().getWorkerHandler();
    }

    /* renamed from: e */
    public void mo107480e() {
        Log.m105925i("MicroMsg.SceneVoiceService", "run() %s", toString());
        mo107479d().postToWorker(new o$$c(this));
    }

    /* renamed from: f */
    public final synchronized void mo107481f(boolean z) {
        Log.m105925i("MicroMsg.SceneVoiceService", "tryFinishThread stopNow: %b", Boolean.valueOf(z));
        MMHandler mMHandler = this.f225523e;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages(111);
            if (z) {
                mMHandler.removeMessages(0);
                mMHandler.post(new o$$a(this));
            } else {
                mMHandler.postAtTime(new o$$a(this), 111, SystemClock.uptimeMillis() + 60000);
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object[] objArr = new Object[5];
        objArr[0] = toString();
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Util.nullAs(str, "");
        objArr[4] = yVar != null ? yVar.toString() : 0;
        Log.m105925i("MicroMsg.SceneVoiceService", "[%s]errType:%s errCode:%s errMsg:%s scene:%s", objArr);
        mo107479d().postToWorker(new o$$b(this, yVar, i, i2));
    }
}
