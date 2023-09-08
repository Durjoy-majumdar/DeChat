package ew3;

import cw3.C116546d;
import fw3.C116904a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kw3.C117429c;
import vv3.C118702d;
import yv3.C118997b;
import yv3.C118999c;

/* renamed from: ew3.c */
public class C116793c extends C118997b {

    /* renamed from: g */
    public C117429c f350116g;

    /* renamed from: h */
    public AtomicBoolean f350117h = new AtomicBoolean(false);

    /* renamed from: i */
    public AtomicBoolean f350118i = new AtomicBoolean(true);

    /* renamed from: ew3.c$a */
    public class C116794a extends C118999c {

        /* renamed from: b */
        public final /* synthetic */ C118702d f350119b;

        public C116794a(C118702d dVar) {
            this.f350119b = dVar;
        }
    }

    public C116793c(String str, C118702d dVar) {
        super(str, dVar, new C116794a(dVar));
        C117429c cVar = new C117429c(dVar);
        this.f350116g = cVar;
        cVar.f351471b = this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v75, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: java.util.HashSet} */
    /* JADX WARNING: type inference failed for: r5v2, types: [uv3.h] */
    /* JADX WARNING: type inference failed for: r13v77 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo180766d(android.os.Message r13) {
        /*
            r12 = this;
            uv3.b r0 = uv3.C118612b.GESTURETYPE_SINGLE
            uv3.b r1 = uv3.C118612b.GESTURETYPE_MULTI
            int r2 = r13.what
            java.lang.String r3 = "sensor_MasterEngine"
            r4 = 7
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 1
            switch(r2) {
                case 1: goto L_0x022e;
                case 2: goto L_0x01fa;
                case 3: goto L_0x0128;
                case 4: goto L_0x00b9;
                case 5: goto L_0x008a;
                case 6: goto L_0x003d;
                case 7: goto L_0x0033;
                case 8: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x050f
        L_0x0012:
            java.lang.String r13 = "[method: consumeMessage ] MSG_DESTROY"
            rv3.C118245h.m166799a(r3, r13)
            r12.mo180767g()
            android.os.Handler r13 = r12.f355203b
            if (r13 == 0) goto L_0x0021
            r13.removeCallbacksAndMessages(r5)
        L_0x0021:
            android.os.HandlerThread r13 = r12.f355202a
            if (r13 == 0) goto L_0x050f
            java.lang.String r13 = "sensor_AsyncWorker"
            java.lang.String r0 = "[method: quitHandlerThread ] "
            rv3.C118245h.m166799a(r13, r0)
            android.os.HandlerThread r13 = r12.f355202a
            r13.quit()
            goto L_0x050f
        L_0x0033:
            java.lang.String r13 = "[method: consumeMessage ] MSG_STOP_TASK_IMMEDIATELY"
            rv3.C118245h.m166799a(r3, r13)
            r12.mo180767g()
            goto L_0x050f
        L_0x003d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f350117h
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0046
            return
        L_0x0046:
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f350117h
            r0.set(r7)
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f350118i
            r0.set(r8)
            r12.mo183686f()
            java.lang.String r0 = "[method: consumeMessage ] MSG_STOP_TASK_DELAY : "
            rv3.C118245h.m166799a(r3, r0)
            java.lang.Object r13 = r13.obj
            yv3.b$a r13 = (yv3.C118997b.C118998a) r13
            r0 = 10000(0x2710, double:4.9407E-320)
            android.os.Handler r2 = r12.f355203b
            if (r2 == 0) goto L_0x0075
            if (r2 == 0) goto L_0x0075
            android.os.Message r2 = r2.obtainMessage()
            r2.what = r4
            r2.arg1 = r6
            r2.arg2 = r6
            r2.obj = r5
            android.os.Handler r3 = r12.f355203b
            r3.sendMessageDelayed(r2, r0)
        L_0x0075:
            java.lang.Object[] r13 = r13.f356436a
            int r0 = r13.length
            if (r0 <= 0) goto L_0x007f
            r13 = r13[r7]
            r5 = r13
            uv3.g r5 = (uv3.C118617g) r5
        L_0x007f:
            kw3.c r13 = r12.f350116g
            if (r5 == 0) goto L_0x0085
            boolean r8 = r5.f354961a
        L_0x0085:
            r13.mo182123a(r8)
            goto L_0x050f
        L_0x008a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "[method: consumeMessage ] MSG_PAUSE_TASK : "
            r13.append(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f350118i
            boolean r0 = r0.get()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            rv3.C118245h.m166799a(r3, r13)
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f350118i
            boolean r13 = r13.get()
            if (r13 == 0) goto L_0x00ad
            return
        L_0x00ad:
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f350118i
            r13.set(r8)
            kw3.c r13 = r12.f350116g
            r13.mo182123a(r8)
            goto L_0x050f
        L_0x00b9:
            yv3.c r0 = r12.f356434e
            yv3.c$a r0 = r0.f356437a
            java.util.HashMap<java.lang.Integer, cw3.d> r0 = r0.f356438a
            if (r0 == 0) goto L_0x00e8
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00c8
            goto L_0x00e8
        L_0x00c8:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00d0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e8
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            cw3.d r1 = (cw3.C116546d) r1
            if (r1 == 0) goto L_0x00d0
            r1.mo165737c()
            goto L_0x00d0
        L_0x00e8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[method: consumeMessage ] MSG_NOTIFY_TASK_STOP msg.arg1 : "
            r0.append(r1)
            int r1 = r13.arg1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            rv3.C118245h.m166799a(r3, r0)
            int r0 = r13.arg1
            r1 = 5
            if (r0 == r1) goto L_0x0111
            if (r0 != r4) goto L_0x0106
            goto L_0x0111
        L_0x0106:
            java.lang.Object r13 = r13.obj
            android.os.Handler r1 = r12.f355203b
            if (r1 == 0) goto L_0x050f
            r12.mo183458e(r0, r6, r13)
            goto L_0x050f
        L_0x0111:
            android.os.Handler r13 = r12.f355203b
            if (r13 == 0) goto L_0x050f
            android.os.Message r13 = r13.obtainMessage()
            r13.what = r0
            r13.arg1 = r6
            r13.arg2 = r6
            r13.obj = r5
            android.os.Handler r0 = r12.f355203b
            r0.sendMessageAtFrontOfQueue(r13)
            goto L_0x050f
        L_0x0128:
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f350117h
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0144
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f350118i
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0139
            goto L_0x0144
        L_0x0139:
            kw3.c r0 = r12.f350116g
            int r1 = r13.arg1
            java.lang.Object r13 = r13.obj
            r0.mo182124b(r1, r13)
            goto L_0x050f
        L_0x0144:
            kw3.c r0 = r12.f350116g
            int r2 = r13.arg1
            java.lang.Object r13 = r13.obj
            kw3.a$a r0 = r0.f351472c
            if (r2 != r8) goto L_0x01dd
            r0.getClass()
            if (r13 != 0) goto L_0x0155
            goto L_0x050f
        L_0x0155:
            java.util.List r13 = (java.util.List) r13
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L_0x015f
            goto L_0x050f
        L_0x015f:
            java.lang.Object r3 = r13.get(r7)
            gw3.g r3 = (gw3.C117003g) r3
            if (r3 != 0) goto L_0x0169
            goto L_0x050f
        L_0x0169:
            int r3 = r3.f350635d
            java.lang.String r2 = r0.mo182121a(r2, r3)
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Object>> r3 = r0.f351477d
            java.lang.Object r3 = r3.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto L_0x0183
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Object>> r4 = r0.f351477d
            r4.put(r2, r3)
        L_0x0183:
            r3.addAll(r13)
            kw3.a r13 = kw3.C117426a.this
            uv3.f r0 = r13.f351473d
            r8 = 0
            r10 = 500(0x1f4, double:2.47E-321)
            if (r0 == 0) goto L_0x0196
            uv3.b r0 = r0.f354956d
            if (r0 != r1) goto L_0x0196
            r0 = r8
            goto L_0x0197
        L_0x0196:
            r0 = r10
        L_0x0197:
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x01a0
            r3.clear()
            goto L_0x050f
        L_0x01a0:
            vv3.d r13 = r13.f351470a
            uv3.l r13 = r13.f355206b
            uv3.l$b r13 = r13.f354968a
            if (r13 == 0) goto L_0x01aa
            uv3.h r5 = r13.f354969a
        L_0x01aa:
            r5.getClass()
            r13 = 50
            long r0 = (long) r13
            long r0 = r0 * r10
            float r13 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 * r0
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r13 = r13 / r1
            float r13 = r13 * r0
            double r0 = (double) r13
            double r0 = java.lang.Math.ceil(r0)
            int r13 = (int) r0
            int r0 = r3.size()
            if (r0 > r13) goto L_0x01ca
            goto L_0x050f
        L_0x01ca:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r1 = r1 - r13
            java.util.List r13 = r3.subList(r7, r1)
            r0.<init>(r13)
            r3.removeAll(r0)
            goto L_0x050f
        L_0x01dd:
            java.lang.String r1 = r0.mo182121a(r2, r6)
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Object>> r2 = r0.f351477d
            java.lang.Object r2 = r2.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 != 0) goto L_0x01f5
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Object>> r0 = r0.f351477d
            r0.put(r1, r2)
        L_0x01f5:
            r2.add(r13)
            goto L_0x050f
        L_0x01fa:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "[method: consumeMessage ] MSG_RESUME_TASK : "
            r13.append(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f350118i
            boolean r0 = r0.get()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            rv3.C118245h.m166799a(r3, r13)
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f350118i
            boolean r13 = r13.get()
            if (r13 != 0) goto L_0x0222
            java.lang.String r13 = "[method: consumeMessage ] resumed"
            rv3.C118245h.m166799a(r3, r13)
            return
        L_0x0222:
            kw3.c r13 = r12.f350116g
            r13.mo182125c()
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f350118i
            r13.set(r7)
            goto L_0x050f
        L_0x022e:
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f350117h
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x023c
            java.lang.String r13 = "[method: consumeMessage ] MSG_START_TASK started"
            rv3.C118245h.m166799a(r3, r13)
            return
        L_0x023c:
            java.lang.Object r13 = r13.obj
            uv3.f r13 = (uv3.C118616f) r13
            r12.f356433d = r13
            yv3.c r13 = r12.f356434e
            yv3.c$a r13 = r13.f356437a
            java.util.HashMap<java.lang.Integer, cw3.d> r13 = r13.f356438a
            r2 = 10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Object r13 = r13.get(r6)
            cw3.d r13 = (cw3.C116546d) r13
            boolean r6 = r13 instanceof bw3.C113215b
            if (r6 == 0) goto L_0x0277
            uv3.f r6 = r12.f356433d
            uv3.b r6 = r6.f354956d
            if (r6 != r0) goto L_0x0266
            hw3.g r6 = new hw3.g
            vv3.d r9 = r12.f356432c
            r6.<init>(r9, r12)
            goto L_0x0271
        L_0x0266:
            if (r6 != r1) goto L_0x0270
            hw3.f r6 = new hw3.f
            vv3.d r9 = r12.f356432c
            r6.<init>(r9, r12)
            goto L_0x0271
        L_0x0270:
            r6 = r5
        L_0x0271:
            if (r6 == 0) goto L_0x0277
            bw3.b r13 = (bw3.C113215b) r13
            r13.f338766g = r6
        L_0x0277:
            java.lang.String r13 = "sensor_AbsEngine"
            java.lang.String r6 = "[method: monitorView ] 111"
            rv3.C118245h.m166799a(r13, r6)
            uv3.f r6 = r12.f356433d
            if (r6 != 0) goto L_0x0284
            goto L_0x0477
        L_0x0284:
            yv3.c r6 = r12.f356434e
            yv3.c$a r6 = r6.f356437a
            java.util.HashMap<java.lang.Integer, cw3.d> r6 = r6.f356438a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r6.get(r2)
            cw3.d r2 = (cw3.C116546d) r2
            boolean r6 = r2 instanceof bw3.C113215b
            if (r6 == 0) goto L_0x0477
            bw3.b r2 = (bw3.C113215b) r2
            uv3.f r6 = r12.f356433d
            android.app.Activity r9 = r6.f354958f
            if (r9 == 0) goto L_0x0355
            java.lang.String r6 = "[method: monitorView ] MonitorActivity"
            rv3.C118245h.m166799a(r13, r6)
            iw3.a r13 = iw3.C117281a.m165349b()
            uv3.f r6 = r12.f356433d
            android.app.Activity r6 = r6.f354958f
            yv3.a r7 = new yv3.a
            r7.<init>(r12)
            if (r6 == 0) goto L_0x0477
            if (r2 != 0) goto L_0x02b8
            goto L_0x0477
        L_0x02b8:
            java.lang.Class r9 = r6.getClass()
            java.lang.String r9 = r9.getName()
            java.util.Map<java.lang.String, iw3.c> r10 = r13.f351140a
            if (r10 == 0) goto L_0x02db
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x02db
            java.util.Map<java.lang.String, iw3.c> r10 = r13.f351140a
            java.util.HashMap r10 = (java.util.HashMap) r10
            boolean r10 = r10.containsKey(r9)
            if (r10 != 0) goto L_0x02db
            java.util.Map<java.lang.String, iw3.c> r10 = r13.f351140a
            java.util.HashMap r10 = (java.util.HashMap) r10
            r10.put(r9, r2)
        L_0x02db:
            jw3.a r2 = r13.f351141b
            if (r2 != 0) goto L_0x02e0
            goto L_0x02e9
        L_0x02e0:
            android.app.Application r9 = r6.getApplication()
            if (r9 == 0) goto L_0x02e9
            r9.unregisterActivityLifecycleCallbacks(r2)
        L_0x02e9:
            iw3.b r2 = new iw3.b
            r2.<init>(r13, r6, r7)
            r13.f351141b = r2
            android.app.Application r2 = r6.getApplication()
            if (r2 == 0) goto L_0x02fb
            jw3.a r7 = r13.f351141b
            r2.registerActivityLifecycleCallbacks(r7)
        L_0x02fb:
            java.lang.String r2 = "TuringTouch"
            java.lang.String r7 = "[method: doInitActivity ] "
            rv3.C118245h.m166799a(r2, r7)
            jw3.c r13 = r13.f351142c
            android.view.Window r2 = r6.getWindow()
            android.view.Window$Callback r7 = r2.getCallback()
            java.lang.String r9 = "sensor_WindowCallbackManager"
            if (r7 != 0) goto L_0x0317
            java.lang.String r13 = "not set callback"
            rv3.C118245h.m166799a(r9, r13)
            goto L_0x0477
        L_0x0317:
            boolean r10 = r7 instanceof jw3.C108779d
            if (r10 == 0) goto L_0x0322
            java.lang.String r13 = "[method: monitor ] callback is WindowCallbackWrapper"
            rv3.C118245h.m166799a(r9, r13)
            goto L_0x0477
        L_0x0322:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "set "
            r10.append(r11)
            java.lang.Class r11 = r6.getClass()
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = " WindowCallback"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            rv3.C118245h.m166799a(r9, r10)
            jw3.d r9 = new jw3.d
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r9.<init>(r7, r13, r6)
            r2.setCallback(r9)
            goto L_0x0477
        L_0x0355:
            android.view.View r9 = r6.f354959g
            if (r9 == 0) goto L_0x0434
            java.lang.String r6 = "[method: monitorView ] MonitorView"
            rv3.C118245h.m166799a(r13, r6)
            iw3.a r13 = iw3.C117281a.m165349b()
            uv3.f r6 = r12.f356433d
            android.view.View r6 = r6.f354959g
            if (r6 == 0) goto L_0x0477
            if (r2 != 0) goto L_0x036c
            goto L_0x0477
        L_0x036c:
            int r9 = r6.hashCode()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.util.Map<java.lang.String, iw3.c> r10 = r13.f351140a
            if (r10 == 0) goto L_0x038f
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x038f
            java.util.Map<java.lang.String, iw3.c> r10 = r13.f351140a
            java.util.HashMap r10 = (java.util.HashMap) r10
            boolean r10 = r10.containsKey(r9)
            if (r10 != 0) goto L_0x038f
            java.util.Map<java.lang.String, iw3.c> r10 = r13.f351140a
            java.util.HashMap r10 = (java.util.HashMap) r10
            r10.put(r9, r2)
        L_0x038f:
            rv3.g<qv3.a> r2 = qv3.C118212a.f353358b
            T r9 = r2.f353422a
            if (r9 != 0) goto L_0x03a5
            monitor-enter(r2)
            T r9 = r2.f353422a     // Catch:{ all -> 0x03a2 }
            if (r9 != 0) goto L_0x03a0
            java.lang.Object r9 = r2.mo181965a()     // Catch:{ all -> 0x03a2 }
            r2.f353422a = r9     // Catch:{ all -> 0x03a2 }
        L_0x03a0:
            monitor-exit(r2)     // Catch:{ all -> 0x03a2 }
            goto L_0x03a5
        L_0x03a2:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03a2 }
            throw r13
        L_0x03a5:
            qv3.a r9 = (qv3.C118212a) r9
            qv3.b r13 = r13.f351144e
            java.util.Map<java.lang.Integer, java.util.Set<qv3.b>> r10 = r9.f353359a
            int r11 = r6.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r11)
            if (r10 != 0) goto L_0x03c4
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r10.add(r13)
            goto L_0x03c6
        L_0x03c4:
            java.util.Set r10 = (java.util.Set) r10
        L_0x03c6:
            r10.add(r13)
            java.util.Map<java.lang.Integer, java.util.Set<qv3.b>> r13 = r9.f353359a
            int r9 = r6.hashCode()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.util.HashMap r13 = (java.util.HashMap) r13
            r13.put(r9, r10)
            T r13 = r2.f353422a
            if (r13 != 0) goto L_0x03ec
            monitor-enter(r2)
            T r13 = r2.f353422a     // Catch:{ all -> 0x03e9 }
            if (r13 != 0) goto L_0x03e7
            java.lang.Object r13 = r2.mo181965a()     // Catch:{ all -> 0x03e9 }
            r2.f353422a = r13     // Catch:{ all -> 0x03e9 }
        L_0x03e7:
            monitor-exit(r2)     // Catch:{ all -> 0x03e9 }
            goto L_0x03ec
        L_0x03e9:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03e9 }
            throw r13
        L_0x03ec:
            qv3.a r13 = (qv3.C118212a) r13
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.String r9 = "getListenerInfo"
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ all -> 0x0402 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r9, r10)     // Catch:{ all -> 0x0402 }
            r2.setAccessible(r8)     // Catch:{ all -> 0x0402 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0402 }
            java.lang.Object r2 = r2.invoke(r6, r7)     // Catch:{ all -> 0x0402 }
            goto L_0x0404
        L_0x0402:
            r2 = r5
        L_0x0404:
            if (r2 != 0) goto L_0x0408
            goto L_0x0477
        L_0x0408:
            java.lang.Class r7 = r2.getClass()
            java.lang.String r9 = "mOnTouchListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r9)     // Catch:{ all -> 0x041a }
            r7.setAccessible(r8)     // Catch:{ all -> 0x041a }
            java.lang.Object r2 = r7.get(r2)     // Catch:{ all -> 0x041a }
            goto L_0x041c
        L_0x041a:
            r2 = r5
        L_0x041c:
            if (r2 == 0) goto L_0x0422
            boolean r7 = r2 instanceof qv3.C118212a.C47884b
            if (r7 != 0) goto L_0x0477
        L_0x0422:
            qv3.a$b r7 = new qv3.a$b
            android.view.View$OnTouchListener r2 = (android.view.View.OnTouchListener) r2
            r7.<init>(r2)
            java.lang.String r13 = "sensor_TouchEventWrapperManager"
            java.lang.String r2 = "[method: wrapperViewTouchEvent ] set TouchListenerWrapper"
            rv3.C118245h.m166799a(r13, r2)
            r6.setOnTouchListener(r7)
            goto L_0x0477
        L_0x0434:
            uv3.e r6 = r6.f354960h
            if (r6 == 0) goto L_0x0477
            java.lang.String r6 = "[method: monitorView ] MonitorTouchWrapper"
            rv3.C118245h.m166799a(r13, r6)
            iw3.a r13 = iw3.C117281a.m165349b()
            uv3.f r6 = r12.f356433d
            uv3.e r6 = r6.f354960h
            if (r6 == 0) goto L_0x0477
            if (r2 != 0) goto L_0x044a
            goto L_0x0477
        L_0x044a:
            int r7 = r6.hashCode()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.util.Map<java.lang.String, iw3.c> r9 = r13.f351140a
            if (r9 == 0) goto L_0x046d
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x046d
            java.util.Map<java.lang.String, iw3.c> r9 = r13.f351140a
            java.util.HashMap r9 = (java.util.HashMap) r9
            boolean r9 = r9.containsKey(r7)
            if (r9 != 0) goto L_0x046d
            java.util.Map<java.lang.String, iw3.c> r9 = r13.f351140a
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.put(r7, r2)
        L_0x046d:
            uv3.d r13 = r13.f351143d
            com.tencent.mm.framework.app.a r6 = (com.tencent.p014mm.framework.app.C68051a) r6
            com.tencent.mm.framework.app.UIPageFragmentActivity$c r2 = r6.f195323a
            r2.f195321a = r13
            r2.f195322b = r6
        L_0x0477:
            vv3.d r13 = r12.f356432c
            wv3.a r13 = r13.f355211g
            r13.getClass()
            java.lang.String r13 = "[method: consumeMessage ] MSG_START_TASK"
            boolean r2 = rv3.C118245h.f353423a
            if (r2 == 0) goto L_0x0487
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r13)
        L_0x0487:
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f350117h
            r13.set(r8)
            android.os.Handler r13 = r12.f355203b
            r13.removeMessages(r8)
            r13 = 3
            android.os.Handler r2 = r12.f355203b
            r2.removeMessages(r13)
            android.os.Handler r13 = r12.f355203b
            r13.removeMessages(r4)
            kw3.c r13 = r12.f350116g
            r13.getClass()
            uv3.f r2 = r12.f356433d
            r13.f351473d = r2
            if (r2 != 0) goto L_0x04a8
            goto L_0x04be
        L_0x04a8:
            uv3.b r2 = r2.f354956d
            if (r2 != r0) goto L_0x04b4
            fw3.e r0 = new fw3.e
            vv3.d r1 = r13.f351470a
            r0.<init>(r1, r12)
            goto L_0x04bf
        L_0x04b4:
            if (r2 != r1) goto L_0x04be
            fw3.c r0 = new fw3.c
            vv3.d r1 = r13.f351470a
            r0.<init>(r1, r12)
            goto L_0x04bf
        L_0x04be:
            r0 = r5
        L_0x04bf:
            r13.f351479e = r0
            kw3.a$a r0 = r13.f351472c
            r0.mo182122b()
            r13.mo182125c()
            yv3.c r13 = r12.f356434e
            yv3.c$a r13 = r13.f356437a
            java.util.HashMap<java.lang.Integer, cw3.d> r13 = r13.f356438a
            if (r13 == 0) goto L_0x050f
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x04d8
            goto L_0x050f
        L_0x04d8:
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x04e0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x050f
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            cw3.d r1 = (cw3.C116546d) r1
            if (r1 == 0) goto L_0x04e0
            r1.mo165738d(r12)
            java.lang.Object r0 = r0.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            boolean r0 = r1.mo180526f()
            if (r0 == 0) goto L_0x0507
            goto L_0x04e0
        L_0x0507:
            boolean r0 = r1.mo165739e(r5)
            r1.mo180525a(r0)
            goto L_0x04e0
        L_0x050f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ew3.C116793c.mo180766d(android.os.Message):void");
    }

    /* renamed from: g */
    public final void mo180767g() {
        mo183686f();
        HashMap<Integer, C116546d> hashMap = this.f356434e.f356437a.f356438a;
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<Integer, C116546d> value : hashMap.entrySet()) {
                C116546d dVar = (C116546d) value.getValue();
                if (dVar != null) {
                    dVar.mo180525a(!dVar.stop());
                }
            }
        }
        this.f355203b.removeMessages(3);
        this.f355203b.removeMessages(7);
        C117429c cVar = this.f350116g;
        cVar.f351472c.mo182122b();
        cVar.f351472c.f351477d.clear();
        C116904a aVar = cVar.f351479e;
        if (aVar != null) {
            aVar.mo180867b();
        }
    }
}
