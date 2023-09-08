package p1206p4;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C113038a;
import androidx.work.WorkerParameters;
import androidx.work.impl.C113044a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p1014o4.C117693m;
import p1014o4.C117706v;
import p1169a5.C112757a;
import p1169a5.C112758b;
import p1188d4.C116563c;
import p1188d4.C116569f;
import p1191e4.C116689d;
import p1191e4.C116691f;
import p1209q4.C118168c;
import p1211r4.C118223b;
import p1213s4.C118269b;
import p1221x4.C118850q;
import p1222y4.C118922g;
import p1222y4.C118923h;
import p1222y4.C118925j;
import p1222y4.C118927k;
import p1222y4.C118928l;
import p1223z3.C119028a;
import p1223z3.C119038g;
import p1223z3.C119047j;
import p856m.C61417a;

/* renamed from: p4.k */
public class C117979k extends C117706v {

    /* renamed from: j */
    public static C117979k f352601j = null;

    /* renamed from: k */
    public static C117979k f352602k = null;

    /* renamed from: l */
    public static final Object f352603l = new Object();

    /* renamed from: a */
    public Context f352604a;

    /* renamed from: b */
    public C113038a f352605b;

    /* renamed from: c */
    public WorkDatabase f352606c;

    /* renamed from: d */
    public C112757a f352607d;

    /* renamed from: e */
    public List<C117973e> f352608e;

    /* renamed from: f */
    public C117971d f352609f;

    /* renamed from: g */
    public C118923h f352610g;

    /* renamed from: h */
    public boolean f352611h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f352612i;

    static {
        C117693m.m165967e("WorkManagerImpl");
    }

    /* JADX INFO: finally extract failed */
    public C117979k(Context context, C113038a aVar, C112757a aVar2) {
        C119038g.C119039a aVar3;
        String str;
        int i;
        char c;
        C117973e eVar;
        boolean z;
        C117973e eVar2;
        Executor executor;
        C113038a aVar4 = aVar;
        boolean z2 = context.getResources().getBoolean(C0966R.bool.f2926h);
        Context applicationContext = context.getApplicationContext();
        C118925j jVar = ((C112758b) aVar2).f337642a;
        int i2 = WorkDatabase.f338356k;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z2) {
            aVar3 = new C119038g.C119039a(applicationContext, cls, (String) null);
            aVar3.f356533h = true;
        } else {
            String str2 = C117978j.f352599a;
            aVar3 = new C119038g.C119039a(applicationContext, cls, "androidx.work.workdb");
            aVar3.f356532g = new C117976h(applicationContext);
        }
        aVar3.f356530e = jVar;
        C117977i iVar = new C117977i();
        if (aVar3.f356529d == null) {
            aVar3.f356529d = new ArrayList<>();
        }
        aVar3.f356529d.add(iVar);
        aVar3.mo183707a(C113044a.f338366a);
        aVar3.mo183707a(new C113044a.C113052h(applicationContext, 2, 3));
        aVar3.mo183707a(C113044a.f338367b);
        aVar3.mo183707a(C113044a.f338368c);
        aVar3.mo183707a(new C113044a.C113052h(applicationContext, 5, 6));
        aVar3.mo183707a(C113044a.f338369d);
        aVar3.mo183707a(C113044a.f338370e);
        aVar3.mo183707a(C113044a.f338371f);
        aVar3.mo183707a(new C113044a.C113053i(applicationContext));
        aVar3.mo183707a(new C113044a.C113052h(applicationContext, 10, 11));
        aVar3.mo183707a(C113044a.f338372g);
        aVar3.f356534i = false;
        aVar3.f356535j = true;
        C119038g.C119041c cVar = C119038g.C119041c.WRITE_AHEAD_LOGGING;
        Context context2 = aVar3.f356528c;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        } else if (aVar3.f356526a != null) {
            Executor executor2 = aVar3.f356530e;
            if (executor2 == null && aVar3.f356531f == null) {
                Executor executor3 = C61417a.f174666d;
                aVar3.f356531f = executor3;
                aVar3.f356530e = executor3;
            } else if (executor2 != null && aVar3.f356531f == null) {
                aVar3.f356531f = executor2;
            } else if (executor2 == null && (executor = aVar3.f356531f) != null) {
                aVar3.f356530e = executor;
            }
            if (aVar3.f356532g == null) {
                aVar3.f356532g = new C116689d();
            }
            String str3 = aVar3.f356527b;
            C116563c.C116566c cVar2 = aVar3.f356532g;
            C119038g.C119042d dVar = aVar3.f356536k;
            ArrayList<C119038g.C119040b> arrayList = aVar3.f356529d;
            boolean z3 = aVar3.f356533h;
            ActivityManager activityManager = (ActivityManager) context2.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C119038g.C119041c cVar3 = (activityManager == null || activityManager.isLowRamDevice()) ? C119038g.C119041c.TRUNCATE : cVar;
            Executor executor4 = aVar3.f356530e;
            boolean z4 = z3;
            C119028a aVar5 = new C119028a(context2, str3, cVar2, dVar, arrayList, z4, cVar3, executor4, aVar3.f356531f, false, aVar3.f356534i, aVar3.f356535j, (Set<Integer>) null, (String) null, (File) null);
            Class<T> cls2 = aVar3.f356526a;
            String name = cls2.getPackage().getName();
            String canonicalName = cls2.getCanonicalName();
            canonicalName = !name.isEmpty() ? canonicalName.substring(name.length() + 1) : canonicalName;
            String str4 = canonicalName.replace('.', '_') + "_Impl";
            try {
                if (name.isEmpty()) {
                    str = str4;
                } else {
                    str = name + "." + str4;
                }
                C119038g gVar = (C119038g) Class.forName(str).newInstance();
                C116563c e = gVar.mo165535e(aVar5);
                gVar.f356519c = e;
                if (e instanceof C119047j) {
                    ((C119047j) e).f356556d = aVar5;
                }
                boolean z5 = cVar3 == cVar;
                e.setWriteAheadLoggingEnabled(z5);
                gVar.f356523g = arrayList;
                gVar.f356518b = executor4;
                new ArrayDeque();
                gVar.f356521e = z4;
                gVar.f356522f = z5;
                WorkDatabase workDatabase = (WorkDatabase) gVar;
                Context applicationContext2 = context.getApplicationContext();
                C117693m.C117694a aVar6 = new C117693m.C117694a(aVar4.f338349f);
                synchronized (C117693m.class) {
                    try {
                        C117693m.f352015a = aVar6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C117973e[] eVarArr = new C117973e[2];
                String str5 = C117974f.f352587a;
                if (Build.VERSION.SDK_INT >= 23) {
                    eVar = new C118269b(applicationContext2, this);
                    C118922g.m167677a(applicationContext2, SystemJobService.class, true);
                    C117693m.m165966c().mo182389a(C117974f.f352587a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                    c = 1;
                    i = 0;
                } else {
                    try {
                        C117973e eVar3 = (C117973e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext2});
                        C117693m.m165966c().mo182389a(C117974f.f352587a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
                        eVar2 = eVar3;
                        z = true;
                        i = 0;
                    } catch (Throwable th4) {
                        z = true;
                        i = 0;
                        C117693m.m165966c().mo182389a(C117974f.f352587a, "Unable to create GCM Scheduler", th4);
                        eVar2 = null;
                    }
                    if (eVar2 == null) {
                        eVar = new C118223b(applicationContext2);
                        C118922g.m167677a(applicationContext2, SystemAlarmService.class, z);
                        C117693m.m165966c().mo182389a(C117974f.f352587a, "Created SystemAlarmScheduler", new Throwable[i]);
                        c = z;
                    } else {
                        eVar = eVar2;
                        c = z;
                    }
                }
                eVarArr[i] = eVar;
                C112757a aVar7 = aVar2;
                eVarArr[c] = new C118168c(applicationContext2, aVar4, aVar7, this);
                List<C117973e> asList = Arrays.asList(eVarArr);
                C117971d dVar2 = new C117971d(context, aVar, aVar2, workDatabase, asList);
                Context applicationContext3 = context.getApplicationContext();
                this.f352604a = applicationContext3;
                this.f352605b = aVar4;
                this.f352607d = aVar7;
                this.f352606c = workDatabase;
                this.f352608e = asList;
                this.f352609f = dVar2;
                this.f352610g = new C118923h(workDatabase);
                this.f352611h = false;
                if (Build.VERSION.SDK_INT < 24 || !applicationContext3.isDeviceProtectedStorage()) {
                    ((C112758b) this.f352607d).mo164514a(new ForceStopRunnable(applicationContext3, this));
                    return;
                }
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("cannot find implementation for " + cls2.getCanonicalName() + ". " + str4 + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor" + cls2.getCanonicalName());
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + cls2.getCanonicalName());
            }
        } else {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public static p1206p4.C117979k m166386b(android.content.Context r2) {
        /*
            java.lang.Object r0 = f352603l
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0035 }
            p4.k r1 = f352601j     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x000d
        L_0x000a:
            p4.k r1 = f352602k     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x000d:
            if (r1 != 0) goto L_0x002e
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0035 }
            boolean r1 = r2 instanceof androidx.work.C113038a.C113040b     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0026
            r1 = r2
            androidx.work.a$b r1 = (androidx.work.C113038a.C113040b) r1     // Catch:{ all -> 0x0035 }
            androidx.work.a r1 = r1.mo165521a()     // Catch:{ all -> 0x0035 }
            m166387c(r2, r1)     // Catch:{ all -> 0x0035 }
            p4.k r1 = m166386b(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x002e
        L_0x0026:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0035 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r1
        L_0x0030:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r2
        L_0x0035:
            r2 = move-exception
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: p1206p4.C117979k.m166386b(android.content.Context):p4.k");
    }

    /* renamed from: c */
    public static void m166387c(Context context, C113038a aVar) {
        synchronized (f352603l) {
            C117979k kVar = f352601j;
            if (kVar != null) {
                if (f352602k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (kVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f352602k == null) {
                    f352602k = new C117979k(applicationContext, aVar, new C112758b(aVar.f338345b));
                }
                f352601j = f352602k;
            }
        }
    }

    /* renamed from: d */
    public void mo182734d() {
        synchronized (f352603l) {
            this.f352611h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f352612i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f352612i = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public void mo182735e() {
        List<JobInfo> f;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f352604a;
            String str = C118269b.f353483h;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (!(jobScheduler == null || (f = C118269b.m166831f(context, jobScheduler)) == null)) {
                ArrayList arrayList = (ArrayList) f;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C118269b.m166829d(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
            }
        }
        C118850q qVar = (C118850q) this.f352606c.mo165532n();
        qVar.f355561a.mo183702b();
        C116569f a = qVar.f355569i.mo183713a();
        qVar.f355561a.mo183703c();
        try {
            C116691f fVar = (C116691f) a;
            fVar.mo180702a();
            qVar.f355561a.mo183706h();
            qVar.f355561a.mo183704f();
            qVar.f355569i.mo183714c(fVar);
            C117974f.m166380a(this.f352605b, this.f352606c, this.f352608e);
        } catch (Throwable th) {
            qVar.f355561a.mo183704f();
            qVar.f355569i.mo183714c(a);
            throw th;
        }
    }

    /* renamed from: f */
    public void mo182736f(String str, WorkerParameters.C113037a aVar) {
        ((C112758b) this.f352607d).mo164514a(new C118927k(this, str, aVar));
    }

    /* renamed from: g */
    public void mo182737g(String str) {
        ((C112758b) this.f352607d).mo164514a(new C118928l(this, str, false));
    }
}
