package p1029rf;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p1008mf.C88729a;
import p1018of.C89206a;
import p1023pf.C89350a;
import p1035sf.C90179b;
import p221qf.C89639a;
import p269xe.C91185g;
import p723vf.C118672d;
import p723vf.C90773a;
import p723vf.C90778c;
import p761yd.C91441c;
import p995kf.C88146a;

/* renamed from: rf.f */
public class C89957f extends C89960g implements C89639a, C89206a.C89208b, Application.ActivityLifecycleCallbacks {

    /* renamed from: e */
    public long f258509e = 0;

    /* renamed from: f */
    public long f258510f = 0;

    /* renamed from: g */
    public int f258511g;

    /* renamed from: h */
    public boolean f258512h;

    /* renamed from: i */
    public boolean f258513i;

    /* renamed from: j */
    public boolean f258514j;

    /* renamed from: n */
    public Set<String> f258515n;

    /* renamed from: o */
    public long f258516o;

    /* renamed from: p */
    public long f258517p;

    /* renamed from: q */
    public boolean f258518q;

    /* renamed from: r */
    public long f258519r = 0;

    /* renamed from: s */
    public HashMap<String, Long> f258520s = new HashMap<>();

    /* renamed from: t */
    public boolean f258521t = true;

    /* renamed from: rf.f$a */
    public class C89958a implements Runnable {

        /* renamed from: d */
        public long[] f258522d;

        /* renamed from: e */
        public long f258523e;

        /* renamed from: f */
        public long f258524f;

        /* renamed from: g */
        public long f258525g;

        /* renamed from: h */
        public boolean f258526h;

        /* renamed from: i */
        public int f258527i;

        /* renamed from: rf.f$a$a */
        public class C89959a implements C90179b.C90181b {
            public C89959a(C89958a aVar) {
            }

            /* renamed from: a */
            public int mo124261a() {
                return 60;
            }

            /* renamed from: b */
            public boolean mo124262b(long j, int i) {
                return j < ((long) (i * 5));
            }

            /* renamed from: c */
            public void mo124263c(List<C89350a> list, int i) {
                C118672d.m167356f("Matrix.StartupTracer", "[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(i), 30, list);
                ListIterator<C89350a> listIterator = list.listIterator(Math.min(i, 30));
                while (listIterator.hasNext()) {
                    listIterator.next();
                    listIterator.remove();
                }
            }
        }

        public C89958a(long[] jArr, long j, long j2, long j3, boolean z, int i) {
            this.f258522d = jArr;
            this.f258527i = i;
            this.f258523e = j;
            this.f258524f = j2;
            this.f258525g = j3;
            this.f258526h = z;
        }

        public void run() {
            LinkedList linkedList = new LinkedList();
            long[] jArr = this.f258522d;
            if (jArr.length > 0) {
                C90179b.m112847d(jArr, linkedList, false, -1);
                C90179b.m112849f(linkedList, 30, new C89959a(this));
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            long max = Math.max(this.f258525g, C90179b.m112846c(linkedList, sb, sb4));
            String b = C90179b.m112845b(linkedList, max);
            long j = this.f258525g;
            C89957f fVar = C89957f.this;
            if ((j > fVar.f258516o && !this.f258526h) || (j > fVar.f258517p && this.f258526h)) {
                C118672d.m167356f("Matrix.StartupTracer", "stackKey:%s \n%s", b, sb4.toString());
            }
            long j2 = this.f258523e;
            long j3 = this.f258524f;
            boolean z = this.f258526h;
            int i = this.f258527i;
            C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
            if (aVar != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    C90773a.m113838d(jSONObject, C91441c.m114730d().f262168b);
                    jSONObject.put("application_create", j2);
                    jSONObject.put("application_create_scene", i);
                    jSONObject.put("first_activity_create", j3);
                    jSONObject.put("startup_duration", max);
                    jSONObject.put("is_warm_start_up", z);
                    C91185g gVar = new C91185g();
                    gVar.f261444b = "Trace_StartUp";
                    gVar.f261446d = jSONObject;
                    aVar.onDetectIssue(gVar);
                } catch (JSONException e) {
                    C118672d.m167352b("Matrix.StartupTracer", "[JSONException for StartUpReportTask error: %s", e);
                }
                C89957f fVar2 = C89957f.this;
                if ((max > fVar2.f258516o && !z) || (max > fVar2.f258517p && z)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        C90773a.m113838d(jSONObject2, C91441c.m114730d().f262168b);
                        jSONObject2.put("detail", C88729a.STARTUP);
                        jSONObject2.put("cost", max);
                        jSONObject2.put("stack", sb.toString());
                        jSONObject2.put("stackKey", b);
                        jSONObject2.put("subType", z ? 2 : 1);
                        C91185g gVar2 = new C91185g();
                        gVar2.f261444b = "Trace_EvilMethod";
                        gVar2.f261446d = jSONObject2;
                        aVar.onDetectIssue(gVar2);
                    } catch (JSONException e2) {
                        C118672d.m167352b("Matrix.StartupTracer", "[JSONException error: %s", e2);
                    }
                }
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
    public C89957f(p1002lf.C88491b r6) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f258509e = r0
            r5.f258510f = r0
            r5.f258519r = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.f258520s = r0
            r0 = 1
            r5.f258521t = r0
            boolean r1 = r6.f255599d
            r5.f258514j = r1
            java.util.Set<java.lang.String> r1 = r6.f255607l
            if (r1 != 0) goto L_0x005a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r6.f255607l = r1
            ur3.a r2 = r6.f255596a
            java.lang.String r3 = ";"
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = r6.f255606k
            if (r2 != 0) goto L_0x002f
            goto L_0x005c
        L_0x002f:
            java.lang.String[] r2 = r2.split(r3)
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.addAll(r2)
            goto L_0x005a
        L_0x003b:
            java.lang.String r1 = r6.f255606k
            com.tencent.mm.matrix.l r2 = (com.tencent.p014mm.matrix.C80993l) r2
            java.lang.String r4 = "clicfg_matrix_trace_care_scene_set"
            java.lang.String r1 = r2.mo112815b(r4, r1)
            if (r1 == 0) goto L_0x0049
            r6.f255606k = r1
        L_0x0049:
            java.lang.String r1 = r6.f255606k
            if (r1 == 0) goto L_0x005a
            java.util.Set<java.lang.String> r2 = r6.f255607l
            java.lang.String[] r1 = r1.split(r3)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.addAll(r1)
        L_0x005a:
            java.util.Set<java.lang.String> r1 = r6.f255607l
        L_0x005c:
            r5.f258515n = r1
            ur3.a r1 = r6.f255596a
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 != 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            com.tencent.mm.matrix.l r1 = (com.tencent.p014mm.matrix.C80993l) r1
            java.lang.String r3 = "clicfg_matrix_trace_app_start_up_threshold"
            int r2 = r1.mo112814a(r3, r2)
        L_0x006d:
            long r1 = (long) r2
            r5.f258516o = r1
            ur3.a r6 = r6.f255596a
            r1 = 4000(0xfa0, float:5.605E-42)
            if (r6 != 0) goto L_0x0077
            goto L_0x007f
        L_0x0077:
            com.tencent.mm.matrix.l r6 = (com.tencent.p014mm.matrix.C80993l) r6
            java.lang.String r2 = "clicfg_matrix_trace_warm_app_start_up_threshold"
            int r1 = r6.mo112814a(r2, r1)
        L_0x007f:
            long r1 = (long) r1
            r5.f258517p = r1
            r5.f258518q = r0
            java.util.HashSet<of.a$b> r6 = p1018of.C89206a.f257049f
            monitor-enter(r6)
            r6.add(r5)     // Catch:{ all -> 0x008c }
            monitor-exit(r6)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1029rf.C89957f.<init>(lf.b):void");
    }

    /* renamed from: a */
    public void mo112097a(boolean z) {
        if (!z) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                Field declaredField2 = cls.getDeclaredField("mH");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(obj);
                Field declaredField3 = obj2.getClass().getSuperclass().getDeclaredField("mCallback");
                declaredField3.setAccessible(true);
                C118672d.m167353c("Matrix.StartupTracer", "callback %s", (Handler.Callback) declaredField3.get(obj2));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo123543c() {
        if (!this.f258518q) {
            long j = C89206a.f257045b - C89206a.f257044a;
            C118672d.m167353c("Matrix.StartupTracer", "onApplicationCreateEnd, applicationCost:%d", Long.valueOf(j));
            mo124287j(j, 0, j, false);
        }
    }

    /* renamed from: d */
    public void mo123972d(Activity activity) {
        if (C89206a.f257048e != Integer.MIN_VALUE) {
            String name = activity.getClass().getName();
            if (this.f258510f == 0) {
                boolean z = C89206a.f257050g;
                Set<String> set = this.f258515n;
                C118672d.m167353c("Matrix.StartupTracer", "#ColdStartup# activity:%s, splashActivities:%s, empty:%b, isCreatedByLaunchActivity:%b, hasShowSplashActivity:%b, firstScreenCost:%d, now:%d, application_create_begin_time:%d, app_cost:%d", name, set, Boolean.valueOf(set.isEmpty()), Boolean.valueOf(z), Boolean.valueOf(this.f258513i), Long.valueOf(this.f258509e), Long.valueOf(SystemClock.uptimeMillis()), Long.valueOf(C89206a.f257044a), Long.valueOf(C89206a.f257045b - C89206a.f257044a));
                String str = name + "@" + activity.hashCode();
                Long l = this.f258520s.get(str);
                if (l == null) {
                    l = 0L;
                }
                this.f258520s.put(str, Long.valueOf(SystemClock.uptimeMillis() - l.longValue()));
                if (this.f258509e == 0) {
                    this.f258509e = SystemClock.uptimeMillis() - C89206a.f257044a;
                }
                if (this.f258513i) {
                    this.f258510f = SystemClock.uptimeMillis() - C89206a.f257044a;
                } else if (this.f258515n.contains(name)) {
                    this.f258513i = true;
                } else if (this.f258515n.isEmpty()) {
                    if (z) {
                        this.f258510f = this.f258509e;
                    } else {
                        this.f258509e = 0;
                        this.f258510f = C89206a.f257045b - C89206a.f257044a;
                    }
                } else if (z) {
                    this.f258510f = this.f258509e;
                } else {
                    this.f258509e = 0;
                    this.f258510f = C89206a.f257045b - C89206a.f257044a;
                }
                if (this.f258510f > 0) {
                    Long l2 = this.f258520s.get(str);
                    if (l2 == null || l2.longValue() < 30000) {
                        mo124287j(C89206a.f257045b - C89206a.f257044a, this.f258509e, this.f258510f, false);
                    } else {
                        C118672d.m167352b("Matrix.StartupTracer", "%s cost too much time[%s] between activity create and onActivityFocused, just throw it.(createTime:%s) ", str, Long.valueOf(SystemClock.uptimeMillis() - l.longValue()), l);
                    }
                }
            } else if (this.f258512h) {
                this.f258512h = false;
                long uptimeMillis = SystemClock.uptimeMillis() - this.f258519r;
                C118672d.m167353c("Matrix.StartupTracer", "#WarmStartup# activity:%s, warmCost:%d, now:%d, lastCreateActivity:%d", name, Long.valueOf(uptimeMillis), Long.valueOf(SystemClock.uptimeMillis()), Long.valueOf(this.f258519r));
                if (uptimeMillis > 0) {
                    mo124287j(0, 0, uptimeMillis, true);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo112123f() {
        super.mo112123f();
        C118672d.m167353c("Matrix.StartupTracer", "[onAlive] isStartupEnable:%s", Boolean.valueOf(this.f258514j));
        if (this.f258514j) {
            AppMethodBeat.getInstance().addListener(this);
            C91441c.m114730d().f262168b.registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: h */
    public void mo112124h() {
        super.mo112124h();
        if (this.f258514j) {
            AppMethodBeat.getInstance().removeListener(this);
            C91441c.m114730d().f262168b.unregisterActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: j */
    public final void mo124287j(long j, long j2, long j3, boolean z) {
        C118672d.m167353c("Matrix.StartupTracer", "[report] applicationCost:%s firstScreenCost:%s allCost:%s isWarmStartUp:%s, createScene:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), Integer.valueOf(C89206a.f257048e));
        long[] jArr = new long[0];
        if (!z && j3 >= this.f258516o) {
            jArr = AppMethodBeat.getInstance().copyData(C89206a.f257047d);
            C89206a.f257047d.mo112120a();
        } else if (z && j3 >= this.f258517p) {
            AppMethodBeat instance = AppMethodBeat.getInstance();
            AppMethodBeat.C80541e eVar = C89206a.f257046c;
            jArr = instance.copyData(eVar);
            eVar.mo112120a();
        }
        C90778c.m113843a().post(new C89958a(jArr, j, j2, j3, z, C89206a.f257048e));
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C118672d.m167353c("Matrix.StartupTracer", "activeActivityCount:%d, coldCost:%d", Integer.valueOf(this.f258511g), Long.valueOf(this.f258510f));
        if (this.f258511g == 0 && this.f258510f > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f258519r = uptimeMillis;
            C118672d.m167353c("Matrix.StartupTracer", "lastCreateActivity:%d, activity:%s", Long.valueOf(uptimeMillis), activity.getClass().getName());
            this.f258512h = true;
        }
        this.f258511g++;
        if (this.f258521t) {
            this.f258520s.put(activity.getClass().getName() + "@" + activity.hashCode(), Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C118672d.m167353c("Matrix.StartupTracer", "activeActivityCount:%d", Integer.valueOf(this.f258511g));
        this.f258511g--;
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
