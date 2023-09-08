package p1029rf;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.p014mm.matrix.C80993l;
import com.tencent.p014mm.plugin.report.service.C71001c;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p1002lf.C88491b;
import p1013nf.C88938b;
import p221qf.C12214b;
import p221qf.C89640c;
import p221qf.C89641d;
import p221qf.C89643f;
import p221qf.C89644g;
import p269xe.C91185g;
import p723vf.C118672d;
import p723vf.C90773a;
import p723vf.C90778c;
import p761yd.C91441c;
import p995kf.C88146a;
import ur3.C90728a;

/* renamed from: rf.c */
public class C89940c extends C89960g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: v */
    public static final int f258447v = Build.VERSION.SDK_INT;

    /* renamed from: w */
    public static float f258448w = 60.0f;

    /* renamed from: e */
    public double f258449e = 0.0d;
    @Deprecated

    /* renamed from: f */
    public final HashSet<C12214b> f258450f = new HashSet<>();
    @Deprecated

    /* renamed from: g */
    public long f258451g;
    @Deprecated

    /* renamed from: h */
    public C89644g f258452h = new C89941a();

    /* renamed from: i */
    public C89640c f258453i;

    /* renamed from: j */
    public int f258454j = 0;

    /* renamed from: n */
    public final C88491b f258455n;

    /* renamed from: o */
    public final HashSet<C89641d> f258456o = new HashSet<>();

    /* renamed from: p */
    public final long f258457p;

    /* renamed from: q */
    public final long f258458q;

    /* renamed from: r */
    public final long f258459r;

    /* renamed from: s */
    public final long f258460s;

    /* renamed from: t */
    public C89947g f258461t;

    /* renamed from: u */
    public final Map<Integer, Window.OnFrameMetricsAvailableListener> f258462u = new ConcurrentHashMap();

    /* renamed from: rf.c$a */
    public class C89941a extends C89644g {
        public C89941a() {
        }

        /* renamed from: c */
        public void mo123328c(String str, long j, long j2, boolean z, long j3, long j4, long j5, long j6) {
            C89940c.this.getClass();
            ProcessUILifecycleOwner.f235399x.getClass();
            if (ProcessUILifecycleOwner.f235396u) {
                long currentTimeMillis = System.currentTimeMillis();
                long j7 = j2 - j3;
                try {
                    C89940c cVar = C89940c.this;
                    long j8 = cVar.f258451g;
                    cVar.f258449e += (double) ((int) (j7 / j8));
                    Math.max(j7, j8);
                    synchronized (C89940c.this.f258450f) {
                        Iterator<C12214b> it = C89940c.this.f258450f.iterator();
                        while (it.hasNext()) {
                            C12214b next = it.next();
                            if (C89940c.this.f258455n.f255604i) {
                                next.f35272a = SystemClock.uptimeMillis();
                            }
                            next.getClass();
                            long j9 = j7 / TimeUtil.SECOND_TO_US;
                            if (C89940c.this.f258455n.f255604i) {
                                long uptimeMillis = SystemClock.uptimeMillis() - next.f35272a;
                                next.f35272a = uptimeMillis;
                                C118672d.m167351a("Matrix.FrameTracer", "[notifyListener] cost:%sms listener:%s", Long.valueOf(uptimeMillis), next);
                            }
                        }
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    C89940c cVar2 = C89940c.this;
                    if (cVar2.f258455n.f255603h && currentTimeMillis2 > cVar2.f258451g) {
                        C118672d.m167356f("Matrix.FrameTracer", "[notifyListener] warm! maybe do heavy work in doFrameSync! size:%s cost:%sms", Integer.valueOf(cVar2.f258450f.size()), Long.valueOf(currentTimeMillis2));
                    }
                } catch (Throwable th) {
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    C89940c cVar3 = C89940c.this;
                    if (cVar3.f258455n.f255603h && currentTimeMillis3 > cVar3.f258451g) {
                        C118672d.m167356f("Matrix.FrameTracer", "[notifyListener] warm! maybe do heavy work in doFrameSync! size:%s cost:%sms", Integer.valueOf(cVar3.f258450f.size()), Long.valueOf(currentTimeMillis3));
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: rf.c$b */
    public class C89942b implements Window.OnFrameMetricsAvailableListener {

        /* renamed from: a */
        public float f258464a;

        /* renamed from: b */
        public float f258465b;

        /* renamed from: c */
        public int f258466c = -1;

        /* renamed from: d */
        public int f258467d = -1;

        /* renamed from: e */
        public WindowManager.LayoutParams f258468e = null;

        public C89942b() {
            float f = C89940c.f258448w;
            this.f258464a = f;
            this.f258465b = (((float) C89940c.this.f258454j) / 60.0f) * f;
        }

        public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            C89940c.this.getClass();
            ProcessUILifecycleOwner.f235399x.getClass();
            if (ProcessUILifecycleOwner.f235396u) {
                int i2 = 0;
                while (i2 <= 8) {
                    long metric = frameMetrics.getMetric(C89945e.f258472e[i2]);
                    if (metric >= 0 && metric < 4611686018427387903L) {
                        i2++;
                    } else {
                        return;
                    }
                }
                FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
                if (this.f258468e == null) {
                    this.f258468e = window.getAttributes();
                }
                int i3 = this.f258468e.preferredDisplayModeId;
                if (!(i3 == this.f258466c && this.f258467d == C89940c.this.f258454j)) {
                    this.f258466c = i3;
                    C89940c cVar = C89940c.this;
                    this.f258467d = cVar.f258454j;
                    float l = cVar.mo124267l(window);
                    this.f258464a = l;
                    this.f258465b = (((float) C89940c.this.f258454j) / 60.0f) * l;
                }
                long metric2 = frameMetrics2.getMetric(8);
                float f = 1.0E9f / this.f258464a;
                float max = Math.max(0.0f, (((float) metric2) - f) / f);
                C89940c cVar2 = C89940c.this;
                cVar2.f258449e += (double) max;
                C89640c cVar3 = cVar2.f258453i;
                if (cVar3 != null && max >= this.f258465b) {
                    ProcessUILifecycleOwner.f235399x.getClass();
                    ((C71001c.C71002a) cVar3).mo97647a(ProcessUILifecycleOwner.f235397v, frameMetrics2, max, this.f258464a);
                }
                synchronized (C89940c.this.f258456o) {
                    Iterator<C89641d> it = C89940c.this.f258456o.iterator();
                    while (it.hasNext()) {
                        ProcessUILifecycleOwner.f235399x.getClass();
                        it.next().mo97647a(ProcessUILifecycleOwner.f235397v, frameMetrics2, max, this.f258464a);
                    }
                }
            }
        }
    }

    /* renamed from: rf.c$c */
    public static class C89943c implements C89643f {
        /* renamed from: a */
        public void mo97648a(String str, long[] jArr, int[] iArr, int[] iArr2, float f, float f2, float f3) {
            C118672d.m167353c("AllSceneFrameListener", "[report] FPS:%s %s", Float.valueOf(f3), toString());
            try {
                C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
                if (aVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    for (C89944d dVar : C89944d.values()) {
                        jSONObject.put(dVar.name(), iArr[dVar.ordinal()]);
                        jSONObject2.put(dVar.name(), iArr2[dVar.ordinal()]);
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    C90773a.m113838d(jSONObject3, aVar.f261037e);
                    String str2 = str;
                    jSONObject3.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
                    jSONObject3.put("dropLevel", jSONObject);
                    jSONObject3.put("dropSum", jSONObject2);
                    jSONObject3.put(V2TXJSAdapterConstants.PUSHER_KEY_FPS, (double) f3);
                    C89945e[] values = C89945e.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        C89945e eVar = values[i];
                        jSONObject3.put(eVar.name(), jArr[eVar.ordinal()]);
                        if (eVar.equals(C89945e.TOTAL_DURATION)) {
                            break;
                        }
                        i++;
                    }
                    if (C89940c.f258447v >= 31) {
                        jSONObject3.put("GPU_DURATION", jArr[9]);
                    }
                    jSONObject3.put("DROP_COUNT", Math.round(f));
                    jSONObject3.put("REFRESH_RATE", (int) f2);
                    C91185g gVar = new C91185g();
                    gVar.f261444b = "Trace_FPS";
                    gVar.f261446d = jSONObject3;
                    aVar.onDetectIssue(gVar);
                }
            } catch (JSONException e) {
                C118672d.m167352b("AllSceneFrameListener", "json error", e);
            }
        }

        /* renamed from: b */
        public boolean mo97649b() {
            return false;
        }

        /* renamed from: c */
        public int mo97650c() {
            return 0;
        }

        /* renamed from: d */
        public int mo97651d() {
            return 10000;
        }

        public String getName() {
            return null;
        }
    }

    /* renamed from: rf.c$d */
    public enum C89944d {
    }

    /* renamed from: rf.c$e */
    public enum C89945e {
        TOTAL_DURATION;
        

        /* renamed from: e */
        public static final int[] f258472e = null;

        /* access modifiers changed from: public */
        static {
            f258472e = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 12};
        }
    }

    /* renamed from: rf.c$f */
    public class C89946f {

        /* renamed from: a */
        public final long[] f258474a = new long[C89945e.values().length];

        /* renamed from: b */
        public final int[] f258475b = new int[C89944d.values().length];

        /* renamed from: c */
        public final int[] f258476c = new int[C89944d.values().length];

        /* renamed from: d */
        public float f258477d;

        /* renamed from: e */
        public float f258478e;

        /* renamed from: f */
        public float f258479f;

        /* renamed from: g */
        public long f258480g;

        /* renamed from: h */
        public String f258481h;

        /* renamed from: i */
        public int f258482i = 0;

        /* renamed from: j */
        public C89643f f258483j;

        public C89946f(C89643f fVar) {
            this.f258483j = fVar;
        }

        /* renamed from: a */
        public void mo124278a(String str, FrameMetrics frameMetrics, float f, float f2) {
            if ((!this.f258483j.mo97649b() || frameMetrics.getMetric(9) != 1) && f >= (f2 / 60.0f) * ((float) this.f258483j.mo97650c())) {
                if (this.f258482i == 0) {
                    this.f258480g = SystemClock.uptimeMillis();
                }
                for (int i = 0; i <= 8; i++) {
                    long[] jArr = this.f258474a;
                    jArr[i] = jArr[i] + frameMetrics.getMetric(C89945e.f258472e[i]);
                }
                if (C89940c.f258447v >= 31) {
                    long[] jArr2 = this.f258474a;
                    jArr2[9] = jArr2[9] + frameMetrics.getMetric(12);
                }
                this.f258477d += f;
                int round = Math.round(f);
                long j = (long) round;
                C89940c cVar = C89940c.this;
                if (j >= cVar.f258457p) {
                    int[] iArr = this.f258475b;
                    iArr[4] = iArr[4] + 1;
                    int[] iArr2 = this.f258476c;
                    iArr2[4] = iArr2[4] + round;
                } else if (j >= cVar.f258458q) {
                    int[] iArr3 = this.f258475b;
                    iArr3[3] = iArr3[3] + 1;
                    int[] iArr4 = this.f258476c;
                    iArr4[3] = iArr4[3] + round;
                } else if (j >= cVar.f258459r) {
                    int[] iArr5 = this.f258475b;
                    iArr5[2] = iArr5[2] + 1;
                    int[] iArr6 = this.f258476c;
                    iArr6[2] = iArr6[2] + round;
                } else if (j >= cVar.f258460s) {
                    int[] iArr7 = this.f258475b;
                    iArr7[1] = iArr7[1] + 1;
                    int[] iArr8 = this.f258476c;
                    iArr8[1] = iArr8[1] + round;
                } else {
                    int[] iArr9 = this.f258475b;
                    iArr9[0] = iArr9[0] + 1;
                    int[] iArr10 = this.f258476c;
                    iArr10[0] = iArr10[0] + Math.max(round, 0);
                }
                this.f258478e += f2;
                this.f258479f += Math.max((float) frameMetrics.getMetric(8), 1.0E9f / f2);
                this.f258482i++;
                this.f258481h = str;
                if (SystemClock.uptimeMillis() - this.f258480g >= ((long) this.f258483j.mo97651d())) {
                    mo124279b();
                }
            }
        }

        /* renamed from: b */
        public void mo124279b() {
            long[] jArr;
            int i = this.f258482i;
            if (i > 20) {
                this.f258477d /= (float) i;
                this.f258478e /= (float) i;
                this.f258479f /= (float) i;
                int i2 = 0;
                while (true) {
                    jArr = this.f258474a;
                    if (i2 >= jArr.length) {
                        break;
                    }
                    jArr[i2] = jArr[i2] / ((long) this.f258482i);
                    i2++;
                }
                this.f258483j.mo97648a(this.f258481h, jArr, this.f258475b, this.f258476c, this.f258477d, this.f258478e, 1.0E9f / this.f258479f);
            }
            this.f258477d = 0.0f;
            this.f258478e = 0.0f;
            this.f258479f = 0.0f;
            this.f258482i = 0;
            Arrays.fill(this.f258474a, 0);
            Arrays.fill(this.f258475b, 0);
            Arrays.fill(this.f258476c, 0);
        }
    }

    /* renamed from: rf.c$g */
    public class C89947g implements C89641d {

        /* renamed from: a */
        public final Handler f258485a = new Handler(C90778c.m113844b().getLooper());

        /* renamed from: b */
        public final HashMap<String, C89946f> f258486b = new HashMap<>();

        /* renamed from: c */
        public final HashMap<C89643f, C89946f> f258487c = new HashMap<>();

        /* renamed from: rf.c$g$a */
        public class C89948a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f258489d;

            /* renamed from: e */
            public final /* synthetic */ FrameMetrics f258490e;

            /* renamed from: f */
            public final /* synthetic */ float f258491f;

            /* renamed from: g */
            public final /* synthetic */ float f258492g;

            public C89948a(String str, FrameMetrics frameMetrics, float f, float f2) {
                this.f258489d = str;
                this.f258490e = frameMetrics;
                this.f258491f = f;
                this.f258492g = f2;
            }

            public void run() {
                String name = this.f258489d.getClass().getName();
                synchronized (C89947g.this) {
                    C89946f fVar = C89947g.this.f258486b.get(name);
                    if (fVar != null) {
                        fVar.mo124278a(this.f258489d, this.f258490e, this.f258491f, this.f258492g);
                    }
                    for (C89946f a : C89947g.this.f258487c.values()) {
                        a.mo124278a(this.f258489d, this.f258490e, this.f258491f, this.f258492g);
                    }
                }
            }
        }

        public C89947g(C89941a aVar) {
        }

        /* renamed from: a */
        public void mo97647a(String str, FrameMetrics frameMetrics, float f, float f2) {
            this.f258485a.post(new C89948a(str, frameMetrics, f, f2));
        }
    }

    public C89940c(C88491b bVar) {
        this.f258455n = bVar;
        this.f258451g = C88938b.f256497y.f256511t;
        C90728a aVar = bVar.f255596a;
        this.f258457p = (long) (aVar != null ? ((C80993l) aVar).mo112814a("clicfg_matrix_fps_dropped_frozen", 42) : 42);
        C90728a aVar2 = bVar.f255596a;
        this.f258458q = (long) (aVar2 != null ? ((C80993l) aVar2).mo112814a("clicfg_matrix_fps_dropped_high", 24) : 24);
        C90728a aVar3 = bVar.f255596a;
        this.f258460s = (long) (aVar3 != null ? ((C80993l) aVar3).mo112814a("clicfg_matrix_fps_dropped_normal", 3) : 3);
        C90728a aVar4 = bVar.f255596a;
        this.f258459r = (long) (aVar4 != null ? ((C80993l) aVar4).mo112814a("clicfg_matrix_fps_dropped_middle", 9) : 9);
        C118672d.m167353c("Matrix.FrameTracer", "[init] frameIntervalMs:%s isFPSEnable:%s", Long.valueOf(this.f258451g), Boolean.valueOf(bVar.f255597b));
    }

    /* renamed from: m */
    public static String m112516m(FrameMetrics frameMetrics) {
        StringBuilder sb = new StringBuilder();
        sb.append("{unknown_delay_duration=");
        sb.append(frameMetrics.getMetric(0));
        sb.append("; input_handling_duration=");
        sb.append(frameMetrics.getMetric(1));
        sb.append("; animation_duration=");
        sb.append(frameMetrics.getMetric(2));
        sb.append("; layout_measure_duration=");
        sb.append(frameMetrics.getMetric(3));
        sb.append("; draw_duration=");
        sb.append(frameMetrics.getMetric(4));
        sb.append("; sync_duration=");
        sb.append(frameMetrics.getMetric(5));
        sb.append("; command_issue_duration=");
        sb.append(frameMetrics.getMetric(6));
        sb.append("; swap_buffers_duration=");
        sb.append(frameMetrics.getMetric(7));
        sb.append("; total_duration=");
        sb.append(frameMetrics.getMetric(8));
        sb.append("; first_draw_frame=");
        sb.append(frameMetrics.getMetric(9));
        if (f258447v >= 31) {
            sb.append("; gpu_duration=");
            sb.append(frameMetrics.getMetric(12));
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: f */
    public void mo112123f() {
        super.mo112123f();
        if (this.f258455n.f255597b) {
            mo124266k();
        }
    }

    /* renamed from: h */
    public void mo112124h() {
        super.mo112124h();
        if (this.f258455n.f255597b) {
            mo124265j();
        }
    }

    /* renamed from: j */
    public void mo124265j() {
        C118672d.m167353c("Matrix.FrameTracer", "forceDisable", new Object[0]);
        this.f258453i = null;
        if (f258447v >= 24) {
            C91441c.m114730d().f262168b.unregisterActivityLifecycleCallbacks(this);
            this.f258456o.clear();
            ((ConcurrentHashMap) this.f258462u).clear();
            return;
        }
        C88938b bVar = C88938b.f256497y;
        C89644g gVar = this.f258452h;
        synchronized (bVar.f256500f) {
            bVar.f256500f.remove(gVar);
            if (bVar.f256500f.isEmpty()) {
                bVar.mo123326g();
            }
        }
        this.f258450f.clear();
    }

    /* renamed from: k */
    public void mo124266k() {
        C118672d.m167353c("Matrix.FrameTracer", "forceEnable", new Object[0]);
        if (f258447v >= 24) {
            C91441c.m114730d().f262168b.registerActivityLifecycleCallbacks(this);
            C89947g gVar = new C89947g((C89941a) null);
            this.f258461t = gVar;
            synchronized (this.f258456o) {
                this.f258456o.add(gVar);
            }
            mo124268n(new C89943c());
            return;
        }
        C88938b.f256497y.mo123321b(this.f258452h);
    }

    /* renamed from: l */
    public final float mo124267l(Window window) {
        return f258447v >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124268n(p221qf.C89643f r8) {
        /*
            r7 = this;
            rf.c$g r0 = r7.f258461t
            if (r0 == 0) goto L_0x0063
            monitor-enter(r0)
            int r1 = r8.mo97651d()     // Catch:{ all -> 0x0060 }
            r2 = 1
            if (r1 < r2) goto L_0x0034
            int r1 = r8.mo97650c()     // Catch:{ all -> 0x0060 }
            if (r1 >= 0) goto L_0x0013
            goto L_0x0034
        L_0x0013:
            java.lang.String r1 = r8.getName()     // Catch:{ all -> 0x0060 }
            rf.c$f r2 = new rf.c$f     // Catch:{ all -> 0x0060 }
            rf.c r3 = p1029rf.C89940c.this     // Catch:{ all -> 0x0060 }
            r2.<init>(r8)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x002d
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0027
            goto L_0x002d
        L_0x0027:
            java.util.HashMap<java.lang.String, rf.c$f> r8 = r0.f258486b     // Catch:{ all -> 0x0060 }
            r8.put(r1, r2)     // Catch:{ all -> 0x0060 }
            goto L_0x0032
        L_0x002d:
            java.util.HashMap<qf.f, rf.c$f> r1 = r0.f258487c     // Catch:{ all -> 0x0060 }
            r1.put(r8, r2)     // Catch:{ all -> 0x0060 }
        L_0x0032:
            monitor-exit(r0)
            goto L_0x0063
        L_0x0034:
            java.lang.String r1 = "Matrix.FrameTracer"
            java.lang.String r3 = "Illegal value, intervalMs=%d, threshold=%d, activity=%s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0060 }
            r5 = 0
            int r6 = r8.mo97651d()     // Catch:{ all -> 0x0060 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0060 }
            r4[r5] = r6     // Catch:{ all -> 0x0060 }
            int r5 = r8.mo97650c()     // Catch:{ all -> 0x0060 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0060 }
            r4[r2] = r5     // Catch:{ all -> 0x0060 }
            r2 = 2
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x0060 }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0060 }
            r4[r2] = r8     // Catch:{ all -> 0x0060 }
            p723vf.C118672d.m167352b(r1, r3, r4)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)
            goto L_0x0063
        L_0x0060:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1029rf.C89940c.mo124268n(qf.f):void");
    }

    /* renamed from: o */
    public void mo124269o(C89643f fVar) {
        C89947g gVar = this.f258461t;
        if (gVar != null) {
            synchronized (gVar) {
                String name = fVar.getName();
                if (name != null) {
                    if (!name.isEmpty()) {
                        C89946f remove = gVar.f258486b.remove(name);
                    }
                }
                C89946f remove2 = gVar.f258487c.remove(fVar);
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        try {
            activity.getWindow().removeOnFrameMetricsAvailableListener((Window.OnFrameMetricsAvailableListener) ((ConcurrentHashMap) this.f258462u).remove(Integer.valueOf(activity.hashCode())));
        } catch (Throwable th) {
            C118672d.m167352b("Matrix.FrameTracer", "removeOnFrameMetricsAvailableListener error : " + th.getMessage(), new Object[0]);
        }
    }

    public void onActivityPaused(Activity activity) {
        C89947g gVar = this.f258461t;
        synchronized (gVar) {
            for (C89946f b : gVar.f258487c.values()) {
                b.mo124279b();
            }
            for (C89946f b2 : gVar.f258486b.values()) {
                b2.mo124279b();
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        if (!((ConcurrentHashMap) this.f258462u).containsKey(Integer.valueOf(activity.hashCode()))) {
            float l = mo124267l(activity.getWindow());
            f258448w = l;
            C118672d.m167353c("Matrix.FrameTracer", "default refresh rate is %dHz", Integer.valueOf((int) l));
            C89942b bVar = new C89942b();
            ((ConcurrentHashMap) this.f258462u).put(Integer.valueOf(activity.hashCode()), bVar);
            activity.getWindow().addOnFrameMetricsAvailableListener(bVar, C90778c.m113843a());
            C118672d.m167353c("Matrix.FrameTracer", "onActivityResumed addOnFrameMetricsAvailableListener", new Object[0]);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
