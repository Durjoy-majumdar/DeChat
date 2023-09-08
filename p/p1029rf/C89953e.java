package p1029rf;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONException;
import org.json.JSONObject;
import p1002lf.C88491b;
import p1008mf.C88729a;
import p1013nf.C88933a;
import p1023pf.C89350a;
import p1035sf.C90179b;
import p1035sf.C90183c;
import p221qf.C89642e;
import p269xe.C91185g;
import p723vf.C118672d;
import p723vf.C90773a;
import p723vf.C90778c;
import p761yd.C91440a;
import p761yd.C91441c;
import p995kf.C88146a;

/* renamed from: rf.e */
public class C89953e extends C89960g implements C89642e {

    /* renamed from: e */
    public Handler f258500e;

    /* renamed from: f */
    public Handler f258501f;

    /* renamed from: g */
    public final C88491b f258502g;

    /* renamed from: h */
    public final C89954a f258503h = new C89954a();

    /* renamed from: i */
    public final C89956b f258504i = new C89956b();

    /* renamed from: j */
    public final boolean f258505j;

    /* renamed from: rf.e$a */
    public class C89954a implements Runnable {

        /* renamed from: d */
        public AppMethodBeat.C80541e f258506d;

        /* renamed from: rf.e$a$a */
        public class C89955a implements C90179b.C90181b {
            public C89955a(C89954a aVar) {
            }

            /* renamed from: a */
            public int mo124261a() {
                return 60;
            }

            /* renamed from: b */
            public boolean mo124262b(long j, int i) {
                return j < ((long) i) * 5;
            }

            /* renamed from: c */
            public void mo124263c(List<C89350a> list, int i) {
                C118672d.m167356f("Matrix.AnrTracer", "[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(i), 30, list);
                ListIterator<C89350a> listIterator = list.listIterator(Math.min(i, 30));
                while (listIterator.hasNext()) {
                    listIterator.next();
                    listIterator.remove();
                }
            }
        }

        public C89954a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0164  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0265  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x027a  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x02c0  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x02c8 A[SYNTHETIC, Splitter:B:47:0x02c8] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r26 = this;
                r1 = r26
                java.lang.String r0 = "\n"
                long r2 = android.os.SystemClock.uptimeMillis()
                rf.e r4 = p1029rf.C89953e.this
                r4.getClass()
                com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner r4 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235399x
                r4.getClass()
                boolean r4 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235396u
                int r5 = android.os.Process.myPid()
                int[] r5 = p1035sf.C90183c.m112855c(r5)
                com.tencent.matrix.trace.core.AppMethodBeat r6 = com.tencent.matrix.trace.core.AppMethodBeat.getInstance()
                com.tencent.matrix.trace.core.AppMethodBeat$e r7 = r1.f258506d
                long[] r6 = r6.copyData(r7)
                com.tencent.matrix.trace.core.AppMethodBeat$e r7 = r1.f258506d
                r7.mo112120a()
                yd.a r7 = p761yd.C91440a.INSTANCE
                java.lang.String r7 = r7.mo125374a()
                rf.e r8 = p1029rf.C89953e.this
                r8.getClass()
                r8 = 3
                long[] r9 = new long[r8]
                java.lang.Runtime r10 = java.lang.Runtime.getRuntime()
                long r11 = r10.totalMemory()
                long r13 = r10.freeMemory()
                long r11 = r11 - r13
                r13 = 1024(0x400, double:5.06E-321)
                long r11 = r11 / r13
                r10 = 0
                r9[r10] = r11
                long r11 = android.os.Debug.getNativeHeapAllocatedSize()
                long r11 = r11 / r13
                r13 = 1
                r9[r13] = r11
                java.lang.Object[] r11 = new java.lang.Object[r13]
                int r12 = android.os.Process.myPid()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r11[r10] = r12
                java.lang.String r12 = "/proc/%s/status"
                java.lang.String r11 = java.lang.String.format(r12, r11)
                r12 = 12
                java.lang.String r11 = p723vf.C90773a.m113840f(r11)     // Catch:{ Exception -> 0x00bc }
                java.lang.String r11 = r11.trim()     // Catch:{ Exception -> 0x00bc }
                java.lang.String[] r11 = r11.split(r0)     // Catch:{ Exception -> 0x00bc }
                int r14 = r11.length     // Catch:{ Exception -> 0x00bc }
                r15 = 0
            L_0x0076:
                java.lang.String r16 = "\\d+"
                if (r15 >= r14) goto L_0x00a0
                r10 = r11[r15]     // Catch:{ Exception -> 0x00bc }
                java.lang.String r8 = "VmSize"
                boolean r8 = r10.startsWith(r8)     // Catch:{ Exception -> 0x00bc }
                if (r8 == 0) goto L_0x009b
                java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r16)     // Catch:{ Exception -> 0x00bc }
                java.util.regex.Matcher r8 = r8.matcher(r10)     // Catch:{ Exception -> 0x00bc }
                boolean r10 = r8.find()     // Catch:{ Exception -> 0x00bc }
                if (r10 == 0) goto L_0x009b
                java.lang.String r8 = r8.group()     // Catch:{ Exception -> 0x00bc }
                long r10 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x00bc }
                goto L_0x00be
            L_0x009b:
                int r15 = r15 + 1
                r8 = 3
                r10 = 0
                goto L_0x0076
            L_0x00a0:
                int r8 = r11.length     // Catch:{ Exception -> 0x00bc }
                if (r8 <= r12) goto L_0x00bc
                java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r16)     // Catch:{ Exception -> 0x00bc }
                r10 = r11[r12]     // Catch:{ Exception -> 0x00bc }
                java.util.regex.Matcher r8 = r8.matcher(r10)     // Catch:{ Exception -> 0x00bc }
                boolean r10 = r8.find()     // Catch:{ Exception -> 0x00bc }
                if (r10 == 0) goto L_0x00bc
                java.lang.String r8 = r8.group()     // Catch:{ Exception -> 0x00bc }
                long r10 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x00bc }
                goto L_0x00be
            L_0x00bc:
                r10 = -1
            L_0x00be:
                r8 = 2
                r9[r8] = r10
                android.os.Looper r10 = android.os.Looper.getMainLooper()
                java.lang.Thread r10 = r10.getThread()
                java.lang.Thread$State r10 = r10.getState()
                rf.e r11 = p1029rf.C89953e.this
                lf.b r11 = r11.f258502g
                int r11 = r11.f255605j
                java.lang.String r14 = "|*\t\t"
                if (r11 == r13) goto L_0x00f1
                if (r11 == r8) goto L_0x00ec
                android.os.Looper r11 = android.os.Looper.getMainLooper()
                java.lang.Thread r11 = r11.getThread()
                java.lang.StackTraceElement[] r11 = r11.getStackTrace()
                java.lang.String r11 = p1035sf.C90183c.m112857e(r11, r14, r12)
                goto L_0x015c
            L_0x00ec:
                java.lang.String r11 = p1035sf.C90183c.m112854b()
                goto L_0x015c
            L_0x00f1:
                android.os.Looper r11 = android.os.Looper.getMainLooper()
                java.lang.Thread r11 = r11.getThread()
                java.lang.StackTraceElement[] r11 = r11.getStackTrace()
                if (r11 == 0) goto L_0x0159
                int r12 = r11.length
                r15 = 3
                if (r12 >= r15) goto L_0x0104
                goto L_0x0159
            L_0x0104:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r15 = " \n"
                r12.<init>(r15)
                r15 = 0
            L_0x010c:
                int r8 = r11.length
                if (r15 >= r8) goto L_0x0154
                r12.append(r14)
                java.lang.String r8 = "at "
                r12.append(r8)
                r8 = r11[r15]
                java.lang.String r8 = r8.getClassName()
                r12.append(r8)
                java.lang.String r8 = ":"
                r12.append(r8)
                r8 = r11[r15]
                java.lang.String r8 = r8.getMethodName()
                r12.append(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r13 = "("
                r8.append(r13)
                r13 = r11[r15]
                int r13 = r13.getLineNumber()
                r8.append(r13)
                java.lang.String r13 = ")"
                r8.append(r13)
                java.lang.String r8 = r8.toString()
                r12.append(r8)
                r12.append(r0)
                int r15 = r15 + 1
                r13 = 1
                goto L_0x010c
            L_0x0154:
                java.lang.String r8 = r12.toString()
                goto L_0x015b
            L_0x0159:
                java.lang.String r8 = ""
            L_0x015b:
                r11 = r8
            L_0x015c:
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>()
                int r12 = r6.length
                if (r12 <= 0) goto L_0x0172
                r12 = 1
                p1035sf.C90179b.m112847d(r6, r8, r12, r2)
                r6 = 30
                rf.e$a$a r12 = new rf.e$a$a
                r12.<init>(r1)
                p1035sf.C90179b.m112849f(r8, r6, r12)
            L_0x0172:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r13 = 5000(0x1388, double:2.4703E-320)
                r19 = r2
                long r1 = p1035sf.C90179b.m112846c(r8, r6, r12)
                long r1 = java.lang.Math.max(r13, r1)
                java.lang.String r3 = p1035sf.C90179b.m112845b(r8, r1)
                r13 = 3
                java.lang.Object[] r13 = new java.lang.Object[r13]
                int r8 = r8.size()
                long r14 = (long) r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r18 = r6
                r21 = r13
                r6 = 1
                java.lang.Object[] r13 = new java.lang.Object[r6]
                java.lang.Long r6 = java.lang.Long.valueOf(r1)
                r17 = 0
                r13[r17] = r6
                java.lang.String r6 = "-\n>>>>>>>>>>>>>>>>>>>>>>> maybe happens ANR(%s ms)! <<<<<<<<<<<<<<<<<<<<<<<\n"
                java.lang.String r6 = java.lang.String.format(r6, r13)
                r8.append(r6)
                java.lang.String r6 = "|* [Status]"
                r8.append(r6)
                r8.append(r0)
                java.lang.String r6 = "|*\t\tScene: "
                r8.append(r6)
                r8.append(r7)
                r8.append(r0)
                java.lang.String r6 = "|*\t\tForeground: "
                r8.append(r6)
                r8.append(r4)
                r8.append(r0)
                java.lang.String r6 = "|*\t\tPriority: "
                r8.append(r6)
                r6 = 0
                r13 = r5[r6]
                r8.append(r13)
                java.lang.String r6 = "\tNice: "
                r8.append(r6)
                r6 = 1
                r13 = r5[r6]
                r8.append(r13)
                r8.append(r0)
                java.lang.String r6 = "|*\t\tis64BitRuntime: "
                r8.append(r6)
                boolean r6 = p723vf.C90773a.m113842h()
                r8.append(r6)
                r8.append(r0)
                java.lang.String r6 = "|* [Memory]"
                r8.append(r6)
                r8.append(r0)
                java.lang.String r6 = "|*\t\tDalvikHeap: "
                r8.append(r6)
                r13 = r4
                r22 = r5
                r6 = 0
                r4 = r9[r6]
                r8.append(r4)
                java.lang.String r4 = "kb\n"
                r8.append(r4)
                java.lang.String r5 = "|*\t\tNativeHeap: "
                r8.append(r5)
                r23 = r7
                r5 = 1
                r6 = r9[r5]
                r8.append(r6)
                r8.append(r4)
                java.lang.String r6 = "|*\t\tVmSize: "
                r8.append(r6)
                r24 = r1
                r6 = 2
                r1 = r9[r6]
                r8.append(r1)
                r8.append(r4)
                java.lang.String r1 = "|* [Thread]"
                r8.append(r1)
                r8.append(r0)
                java.lang.Object[] r1 = new java.lang.Object[r5]
                r2 = 0
                r1[r2] = r10
                java.lang.String r2 = "|*\t\tStack(%s): "
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r8.append(r1)
                r8.append(r11)
                java.lang.String r1 = "|* [Trace]"
                r8.append(r1)
                r8.append(r0)
                r1 = 0
                int r4 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r4 <= 0) goto L_0x027a
                java.lang.String r4 = "|*\t\tStackKey: "
                r8.append(r4)
                r8.append(r3)
                r8.append(r0)
                java.lang.String r0 = r12.toString()
                r8.append(r0)
                r6 = 0
                goto L_0x0298
            L_0x027a:
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                com.tencent.matrix.trace.core.AppMethodBeat r4 = com.tencent.matrix.trace.core.AppMethodBeat.getInstance()
                boolean r4 = r4.isAlive()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r6 = 0
                r5[r6] = r4
                java.lang.String r4 = "AppMethodBeat is close[%s]."
                java.lang.String r4 = java.lang.String.format(r4, r5)
                r8.append(r4)
                r8.append(r0)
            L_0x0298:
                java.lang.String r0 = "========================================================================="
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                r21[r6] = r0
                java.lang.Long r0 = java.lang.Long.valueOf(r1)
                r1 = 1
                r21[r1] = r0
                java.lang.Long r0 = java.lang.Long.valueOf(r19)
                r1 = 2
                r21[r1] = r0
                java.lang.String r1 = "Matrix.AnrTracer"
                java.lang.String r0 = "%s \npostTime:%s curTime:%s"
                r2 = r21
                p723vf.C118672d.m167356f(r1, r0, r2)
                r4 = 6000(0x1770, double:2.9644E-320)
                int r0 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
                if (r0 < 0) goto L_0x02c8
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r2 = "The checked anr task was not executed on time. The possible reason is that the current process has a low priority. just pass this report"
                p723vf.C118672d.m167356f(r1, r2, r0)
                return
            L_0x02c8:
                yd.c r0 = p761yd.C91441c.m114730d()     // Catch:{ JSONException -> 0x035e }
                java.lang.Class<kf.a> r2 = p995kf.C88146a.class
                we.b r0 = r0.mo125377a(r2)     // Catch:{ JSONException -> 0x035e }
                kf.a r0 = (p995kf.C88146a) r0     // Catch:{ JSONException -> 0x035e }
                if (r0 != 0) goto L_0x02d7
                return
            L_0x02d7:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x035e }
                r2.<init>()     // Catch:{ JSONException -> 0x035e }
                yd.c r4 = p761yd.C91441c.m114730d()     // Catch:{ JSONException -> 0x035e }
                android.app.Application r4 = r4.f262168b     // Catch:{ JSONException -> 0x035e }
                p723vf.C90773a.m113838d(r2, r4)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r4 = "detail"
                mf.a r5 = p1008mf.C88729a.ANR     // Catch:{ JSONException -> 0x035e }
                r2.put(r4, r5)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r4 = "cost"
                r5 = r24
                r2.put(r4, r5)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r4 = "stackKey"
                r2.put(r4, r3)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r3 = "scene"
                r4 = r23
                r2.put(r3, r4)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r3 = "stack"
                java.lang.String r4 = r18.toString()     // Catch:{ JSONException -> 0x035e }
                r2.put(r3, r4)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r3 = "threadStack"
                r2.put(r3, r11)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r3 = "processPriority"
                r4 = 0
                r5 = r22[r4]     // Catch:{ JSONException -> 0x035e }
                r2.put(r3, r5)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r3 = "processNice"
                r4 = 1
                r5 = r22[r4]     // Catch:{ JSONException -> 0x035e }
                r2.put(r3, r5)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r3 = "isProcessForeground"
                r2.put(r3, r13)     // Catch:{ JSONException -> 0x035e }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x035e }
                r3.<init>()     // Catch:{ JSONException -> 0x035e }
                java.lang.String r4 = "dalvik_heap"
                r5 = 0
                r6 = r9[r5]     // Catch:{ JSONException -> 0x035e }
                r3.put(r4, r6)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r4 = "native_heap"
                r5 = 1
                r6 = r9[r5]     // Catch:{ JSONException -> 0x035e }
                r3.put(r4, r6)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r4 = "vm_size"
                r5 = 2
                r5 = r9[r5]     // Catch:{ JSONException -> 0x035e }
                r3.put(r4, r5)     // Catch:{ JSONException -> 0x035e }
                java.lang.String r4 = "memory"
                r2.put(r4, r3)     // Catch:{ JSONException -> 0x035e }
                xe.g r3 = new xe.g     // Catch:{ JSONException -> 0x035e }
                r3.<init>()     // Catch:{ JSONException -> 0x035e }
                java.lang.String r4 = "0"
                r3.f261445c = r4     // Catch:{ JSONException -> 0x035e }
                java.lang.String r4 = "Trace_EvilMethod"
                r3.f261444b = r4     // Catch:{ JSONException -> 0x035e }
                r3.f261446d = r2     // Catch:{ JSONException -> 0x035e }
                r0.onDetectIssue(r3)     // Catch:{ JSONException -> 0x035e }
                goto L_0x036a
            L_0x035e:
                r0 = move-exception
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r0
                java.lang.String r0 = "[JSONException error: %s"
                p723vf.C118672d.m167352b(r1, r0, r2)
            L_0x036a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1029rf.C89953e.C89954a.run():void");
        }
    }

    /* renamed from: rf.e$b */
    public class C89956b implements Runnable {
        public C89956b() {
        }

        public void run() {
            String a = C91440a.INSTANCE.mo125374a();
            C89953e.this.getClass();
            ProcessUILifecycleOwner.f235399x.getClass();
            boolean z = ProcessUILifecycleOwner.f235396u;
            try {
                C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
                if (aVar != null) {
                    String f = C90183c.m112858f(Looper.getMainLooper().getThread().getStackTrace());
                    JSONObject jSONObject = new JSONObject();
                    C90773a.m113838d(jSONObject, C91441c.m114730d().f262168b);
                    jSONObject.put("detail", C88729a.LAG);
                    jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, a);
                    jSONObject.put("threadStack", f);
                    jSONObject.put("isProcessForeground", z);
                    C91185g gVar = new C91185g();
                    gVar.f261444b = "Trace_EvilMethod";
                    gVar.f261446d = jSONObject;
                    aVar.onDetectIssue(gVar);
                    C118672d.m167352b("Matrix.AnrTracer", "happens lag : %s, scene : %s ", f, a);
                }
            } catch (JSONException e) {
                C118672d.m167352b("Matrix.AnrTracer", "[JSONException error: %s", e);
            }
        }
    }

    public C89953e(C88491b bVar) {
        this.f258502g = bVar;
        this.f258505j = bVar.f255600e;
    }

    /* renamed from: b */
    public void mo112114b(String str) {
        this.f258503h.f258506d = AppMethodBeat.getInstance().maskIndex("AnrTracer#dispatchBegin");
        if (this.f258502g.f255604i) {
            C118672d.m167355e("Matrix.AnrTracer", "* [dispatchBegin] index:%s", Integer.valueOf(this.f258503h.f258506d.f235557a));
        }
        this.f258500e.postDelayed(this.f258503h, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        this.f258501f.postDelayed(this.f258504i, 2000);
    }

    /* renamed from: e */
    public void mo112115e(String str, long j, long j2) {
        if (this.f258502g.f255604i) {
            C118672d.m167355e("Matrix.AnrTracer", "[dispatchEnd] beginNs:%s endNs:%s cost:%sms", Long.valueOf(j), Long.valueOf(j2), Long.valueOf((j2 - j) / TimeUtil.SECOND_TO_US));
        }
        this.f258503h.f258506d.mo112120a();
        this.f258500e.removeCallbacks(this.f258503h);
        this.f258501f.removeCallbacks(this.f258504i);
    }

    /* renamed from: f */
    public void mo112123f() {
        super.mo112123f();
        if (this.f258505j) {
            C88933a aVar = C88933a.f256476q;
            synchronized (aVar.f256483i) {
                ((HashMap) aVar.f256483i).put(this, new C88933a.C88934a(this));
            }
            this.f258500e = new Handler(C90778c.m113843a().getLooper());
            this.f258501f = new Handler(C90778c.m113843a().getLooper());
        }
    }

    /* renamed from: h */
    public void mo112124h() {
        super.mo112124h();
        if (this.f258505j) {
            C88933a.m111028d(this);
            this.f258503h.f258506d.mo112120a();
            this.f258500e.removeCallbacksAndMessages((Object) null);
            this.f258501f.removeCallbacksAndMessages((Object) null);
        }
    }

    public boolean isValid() {
        return true;
    }
}
