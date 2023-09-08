package yt3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import java.nio.charset.Charset;
import lt3.C21460a;
import ot3.C117896h;
import ot3.C21880d;
import ot3.C21881e;
import ot3.C21884f;
import ot3.C21886i;
import pt3.C22005b;
import pt3.C22006c;
import pt3.C22007d;
import tt3.C22552d;
import tt3.C22553e;
import ut3.C22662b;
import xt3.C23111d;
import xt3.C53447b;

/* renamed from: yt3.r */
public class C23353r extends C23317d {

    /* renamed from: h */
    public static final String f67109h = ("soter_triggered_oom_count" + C117896h.m166296a(C21460a.m24268b().getBytes(Charset.forName("UTF-8"))));

    /* renamed from: c */
    public boolean f67110c = false;

    /* renamed from: d */
    public String f67111d = "";

    /* renamed from: e */
    public String f67112e = "";

    /* renamed from: f */
    public int[] f67113f;

    /* renamed from: g */
    public C21886i.C21888b f67114g = new C23354a(this);

    /* renamed from: yt3.r$a */
    public class C23354a implements C21886i.C21888b {
        public C23354a(C23353r rVar) {
        }

        /* renamed from: a */
        public boolean mo34912a() {
            SharedPreferences c = C22662b.m26538b().mo35775c();
            if (c != null) {
                int i = c.getInt(C23353r.f67109h, 0);
                C21881e.m25084c("Soter.TaskInit", "soter: is triggered OOM: %d", Integer.valueOf(i));
                if (i >= 10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo34913b() {
            C21881e.m25087f("Soter.TaskInit", "soter: on trigger OOM, using wrapper implement", new Object[0]);
            SharedPreferences c = C22662b.m26538b().mo35775c();
            if (c != null) {
                SharedPreferences.Editor edit = c.edit();
                String str = C23353r.f67109h;
                edit.putInt(str, c.getInt(str, 0) + 1);
                edit.commit();
            }
        }

        public void reset() {
            C21881e.m25084c("Soter.TaskInit", "soter: SoterDelegate reset", new Object[0]);
            SharedPreferences c = C22662b.m26538b().mo35775c();
            if (c != null) {
                c.edit().putInt(C23353r.f67109h, 0).apply();
            }
        }
    }

    /* renamed from: yt3.r$b */
    public class C23355b implements Runnable {
        public C23355b() {
        }

        public void run() {
            C23353r rVar = C23353r.this;
            rVar.mo36847h(rVar.f67111d, rVar.f67113f);
            C23353r rVar2 = C23353r.this;
            rVar2.getClass();
            SharedPreferences c = C22662b.m26538b().mo35775c();
            int i = c.getInt(C21884f.m25094a().f61885a, -1);
            C21881e.m25082a("Soter.TaskInit", "soter: ask status: %d", Integer.valueOf(i));
            if (!(i != 0) || !C21460a.m24274h()) {
                for (int i2 : rVar2.f67113f) {
                    String str = C22662b.m26538b().mo35774a().get(i2, "");
                    if (!C117896h.m166297b(str)) {
                        int i3 = c.getInt(str, 0);
                        C21881e.m25082a("Soter.TaskInit", "soter: %s status: %d", str, Integer.valueOf(i3));
                        if ((i3 != 0) && C21460a.m24275i(str)) {
                            C21881e.m25084c("Soter.TaskInit", "remove invalid ask: %s", str);
                            C21460a.m24284r(str, false);
                        }
                    }
                }
                return;
            }
            C21881e.m25084c("Soter.TaskInit", "invalid ask, remove all key", new Object[0]);
            C21460a.m24283q();
            for (int i4 : rVar2.f67113f) {
                C21460a.m24284r(C22662b.m26538b().mo35774a().get(i4, ""), false);
            }
        }
    }

    /* renamed from: yt3.r$c */
    public class C23356c implements C53447b<C23111d> {
        public C23356c() {
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: a */
        public void mo36822a(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Class<ut3.b> r0 = ut3.C22662b.class
                xt3.d r7 = (xt3.C23111d) r7
                r1 = 1
                r2 = 0
                if (r7 == 0) goto L_0x0042
                java.lang.String r7 = "Soter.TaskInit"
                java.lang.String r3 = "soter: got support tag from backend: %b"
                java.lang.Object[] r4 = new java.lang.Object[r1]
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                r4[r2] = r5
                ot3.C21881e.m25084c(r7, r3, r4)
                monitor-enter(r0)
                ut3.b r7 = ut3.C22662b.m26538b()     // Catch:{ all -> 0x003f }
                r7.mo35778f(r2)     // Catch:{ all -> 0x003f }
                ut3.b r7 = ut3.C22662b.m26538b()     // Catch:{ all -> 0x003f }
                r7.getClass()     // Catch:{ all -> 0x003f }
                monitor-enter(r0)     // Catch:{ all -> 0x003f }
                r7.f65188a = r1     // Catch:{ all -> 0x003c }
                monitor-exit(r0)     // Catch:{ all -> 0x003c }
                ut3.b r7 = ut3.C22662b.m26538b()     // Catch:{ all -> 0x003f }
                r7.getClass()     // Catch:{ all -> 0x003f }
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                yt3.r r7 = yt3.C23353r.this
                tt3.d r0 = new tt3.d
                r0.<init>(r2)
                r7.mo36804b(r0)
                goto L_0x006c
            L_0x003c:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003c }
                throw r7     // Catch:{ all -> 0x003f }
            L_0x003f:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                throw r7
            L_0x0042:
                java.lang.String r7 = "Soter.TaskInit"
                java.lang.String r3 = "soter: not return data from remote"
                java.lang.Object[] r4 = new java.lang.Object[r2]
                ot3.C21881e.m25087f(r7, r3, r4)
                monitor-enter(r0)
                ut3.b r7 = ut3.C22662b.m26538b()     // Catch:{ all -> 0x0070 }
                r7.mo35778f(r2)     // Catch:{ all -> 0x0070 }
                ut3.b r7 = ut3.C22662b.m26538b()     // Catch:{ all -> 0x0070 }
                r7.getClass()     // Catch:{ all -> 0x0070 }
                monitor-enter(r0)     // Catch:{ all -> 0x0070 }
                r7.f65188a = r1     // Catch:{ all -> 0x006d }
                monitor-exit(r0)     // Catch:{ all -> 0x006d }
                monitor-exit(r0)     // Catch:{ all -> 0x0070 }
                yt3.r r7 = yt3.C23353r.this
                tt3.d r0 = new tt3.d
                r1 = 1002(0x3ea, float:1.404E-42)
                r0.<init>(r1)
                r7.mo36804b(r0)
            L_0x006c:
                return
            L_0x006d:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x006d }
                throw r7     // Catch:{ all -> 0x0070 }
            L_0x0070:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0070 }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yt3.C23353r.C23356c.mo36822a(java.lang.Object):void");
        }
    }

    static {
        C117896h.m166296a(C21460a.m24268b().getBytes(Charset.forName("UTF-8")));
    }

    public C23353r(Context context, C112486e eVar) {
        boolean z = false;
        C21880d dVar = eVar.f336864c;
        if (dVar != null) {
            C21881e.f61883a = dVar;
        }
        C22662b b = C22662b.m26538b();
        SharedPreferences sharedPreferences = context.getSharedPreferences("soter_status", 0);
        b.getClass();
        synchronized (C22662b.class) {
            b.f65191d = sharedPreferences;
        }
        C21886i.f61888a = this.f67114g;
        if (C21460a.f60758c == null) {
            C21881e.m25084c("Soter.SoterCore", "soter: SoterCore IMPL is null then call getProviderSoterCore to init", new Object[0]);
            C22005b f = C21460a.m24272f();
            C21460a.f60758c = f;
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(f == null);
            C21881e.m25084c("Soter.SoterCore", "soter: SoterCore IMPL is null[%b], after call getProviderSoterCore to init", objArr);
        }
        synchronized (C21460a.class) {
            if (C21460a.f60758c == null) {
                C21881e.m25084c("Soter.SoterCore", "soter: SoterCore IMPL is null then call tryToInitSoterTreble to init", new Object[0]);
                if (!C22007d.f62271n) {
                    C22007d dVar2 = new C22007d();
                    C21460a.f60758c = dVar2;
                    dVar2.mo35114r(C21460a.f60757b);
                    if (!C21460a.f60758c.mo35107j(context)) {
                        C21460a.f60758c = null;
                        C21881e.m25084c("Soter.SoterCore", "soter: SoterCore IMPL is null after call tryToInitSoterTreble to init", new Object[0]);
                    }
                } else {
                    C21881e.m25084c("Soter.SoterCore", "soter: treble is initializing", new Object[0]);
                }
            }
        }
        C22006c.m25378v();
        if (C21460a.m24278l() && (C21460a.m24280n(context) || C21460a.m24279m(context, 2))) {
            z = true;
        }
        this.f67110c = z;
        eVar.getClass();
        this.f67113f = eVar.f336863b;
        this.f67111d = eVar.f336862a;
        this.f67112e = eVar.f336865d;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public void mo36805c() {
        /*
            r6 = this;
            java.lang.Class<ut3.b> r0 = ut3.C22662b.class
            boolean r1 = r6.f67110c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0026
            ut3.b r1 = ut3.C22662b.m26538b()
            r1.mo35778f(r2)
            ut3.b r1 = ut3.C22662b.m26538b()
            r1.getClass()
            monitor-enter(r0)
            r1.f65188a = r2     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            tt3.d r0 = new tt3.d
            r0.<init>(r3)
            r6.mo36804b(r0)
            goto L_0x0063
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        L_0x0026:
            java.lang.String r1 = "Soter.TaskInit"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "soter: TaskInit check isNativeSupport["
            r4.append(r5)
            boolean r5 = r6.f67110c
            r4.append(r5)
            java.lang.String r5 = "]"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            ot3.C21881e.m25087f(r1, r4, r5)
            tt3.d r1 = new tt3.d
            r4 = 2
            r1.<init>(r4)
            r6.mo36804b(r1)
            monitor-enter(r0)
            ut3.b r1 = ut3.C22662b.m26538b()     // Catch:{ all -> 0x0067 }
            r1.mo35778f(r3)     // Catch:{ all -> 0x0067 }
            ut3.b r1 = ut3.C22662b.m26538b()     // Catch:{ all -> 0x0067 }
            r1.getClass()     // Catch:{ all -> 0x0067 }
            monitor-enter(r0)     // Catch:{ all -> 0x0067 }
            r1.f65188a = r2     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
        L_0x0063:
            return
        L_0x0064:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.C23353r.mo36805c():void");
    }

    /* renamed from: d */
    public boolean mo36806d() {
        return true;
    }

    /* renamed from: e */
    public void mo36802e(C22553e eVar) {
    }

    /* renamed from: f */
    public void mo36807f() {
    }

    /* renamed from: g */
    public boolean mo36808g() {
        if (C22662b.m26538b().mo35777e()) {
            C21881e.m25083b("Soter.TaskInit", "soter: duplicate initialize soter", new Object[0]);
            mo36804b(new C22552d(1028, "soter already have initialized"));
            return true;
        }
        int[] iArr = this.f67113f;
        if (iArr == null || iArr.length <= 0) {
            C21881e.m25083b("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24", new Object[0]);
            mo36804b(new C22552d(1024, "no business scene provided"));
            return true;
        }
        String str = this.f67111d;
        if (str == null) {
            str = "";
        }
        if (str.length() > 16) {
            C21881e.m25087f("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24. soter will try to make it compat", new Object[0]);
            String a = C117896h.m166296a(this.f67111d.getBytes(Charset.forName("UTF-8")));
            String substring = (C117896h.m166297b(a) || a.length() < 16) ? null : a.substring(0, 16);
            if (C117896h.m166297b(substring)) {
                C21881e.m25087f("Soter.TaskInit", "soter: saltlen compat failed!!", new Object[0]);
                mo36804b(new C22552d(1025, "the account salt length is too long"));
                return true;
            }
            this.f67111d = substring;
        }
        if (C117896h.m166297b(this.f67112e) || this.f67112e.length() <= 24) {
            C21881e.m25087f("Soter.TaskInit", "soter: it is strongly recommended to check device support from server, so you'd better provider a net wrapper to check it", new Object[0]);
            if (!C117896h.m166297b(this.f67112e)) {
                C21881e.m25084c("Soter.TaskInit", "soter: provided valid ASK name", new Object[0]);
                C21884f.m25094a().f61885a = this.f67112e;
            }
            C23324g.m27822a().mo36819c(new C23355b());
            return false;
        }
        C21881e.m25083b("Soter.TaskInit", "soter: the passed ask name is too long (larger than 24).", new Object[0]);
        mo36804b(new C22552d(1026, "the passed ask name is too long (larger than 24)"));
        return true;
    }

    /* renamed from: h */
    public void mo36847h(String str, int[] iArr) {
        for (int i : iArr) {
            Object[] objArr = new Object[4];
            objArr[0] = "Wechat";
            objArr[1] = Integer.valueOf(Process.myUid());
            objArr[2] = str == null ? "" : str;
            objArr[3] = Integer.valueOf(i);
            C22662b.m26538b().mo35774a().put(i, String.format("%suid%d_%s_scene%d", objArr));
        }
    }
}
