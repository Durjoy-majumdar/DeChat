package p1213s4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.C113038a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p1014o4.C109940q;
import p1014o4.C117693m;
import p1014o4.C117705u;
import p1206p4.C117973e;
import p1206p4.C117979k;
import p1221x4.C118830d;
import p1221x4.C118832f;
import p1221x4.C118834g;
import p1221x4.C118836i;
import p1221x4.C118847o;
import p1221x4.C118850q;
import p1222y4.C118921f;

/* renamed from: s4.b */
public class C118269b implements C117973e {

    /* renamed from: h */
    public static final String f353483h = C117693m.m165967e("SystemJobScheduler");

    /* renamed from: d */
    public final Context f353484d;

    /* renamed from: e */
    public final JobScheduler f353485e;

    /* renamed from: f */
    public final C117979k f353486f;

    /* renamed from: g */
    public final C118268a f353487g;

    public C118269b(Context context, C117979k kVar) {
        C118268a aVar = new C118268a(context);
        this.f353484d = context;
        this.f353486f = kVar;
        this.f353485e = (JobScheduler) context.getSystemService("jobscheduler");
        this.f353487g = aVar;
    }

    /* renamed from: d */
    public static void m166829d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C117693m.m165966c().mo182390b(f353483h, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0014 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Integer> m166830e(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.List r5 = m166831f(r5, r6)
            r6 = 0
            if (r5 != 0) goto L_0x0008
            return r6
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L_0x0033
            boolean r4 = r3.containsKey(r2)     // Catch:{ NullPointerException -> 0x0033 }
            if (r4 == 0) goto L_0x0033
            java.lang.String r2 = r3.getString(r2)     // Catch:{ NullPointerException -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r2 = r6
        L_0x0034:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0014
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1213s4.C118269b.m166830e(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.List");
    }

    /* renamed from: f */
    public static List<JobInfo> m166831f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C117693m.m165966c().mo182390b(f353483h, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo182730a(String str) {
        List<Integer> e = m166830e(this.f353484d, this.f353485e, str);
        if (e != null) {
            ArrayList arrayList = (ArrayList) e;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m166829d(this.f353485e, ((Integer) it.next()).intValue());
                }
                ((C118836i) this.f353486f.f352606c.mo165529k()).mo183541c(str);
            }
        }
    }

    /* renamed from: b */
    public boolean mo182731b() {
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo182732c(C118847o... oVarArr) {
        int i;
        int i2;
        List<Integer> e;
        int i3;
        C118847o[] oVarArr2 = oVarArr;
        Class<C118921f> cls = C118921f.class;
        WorkDatabase workDatabase = this.f353486f.f352606c;
        int length = oVarArr2.length;
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            C118847o oVar = oVarArr2[i5];
            workDatabase.mo183703c();
            try {
                C118847o i6 = ((C118850q) workDatabase.mo165532n()).mo183560i(oVar.f355541a);
                if (i6 == null) {
                    C117693m c = C117693m.m165966c();
                    String str = f353483h;
                    c.mo182392f(str, "Skipping scheduling " + oVar.f355541a + " because it's no longer in the DB", new Throwable[i4]);
                    workDatabase.mo183706h();
                } else if (i6.f355542b != C117705u.ENQUEUED) {
                    C117693m c2 = C117693m.m165966c();
                    String str2 = f353483h;
                    c2.mo182392f(str2, "Skipping scheduling " + oVar.f355541a + " because it is no longer enqueued", new Throwable[i4]);
                    workDatabase.mo183706h();
                } else {
                    C118834g a = ((C118836i) workDatabase.mo165529k()).mo183539a(oVar.f355541a);
                    if (a != null) {
                        i2 = a.f355530b;
                        i = i5;
                    } else {
                        this.f353486f.f352605b.getClass();
                        int i7 = this.f353486f.f352605b.f338350g;
                        synchronized (cls) {
                            workDatabase.mo183703c();
                            try {
                                Long a2 = ((C118832f) workDatabase.mo165528j()).mo183535a("next_job_scheduler_id");
                                int intValue = a2 != null ? a2.intValue() : 0;
                                i = i5;
                                ((C118832f) workDatabase.mo165528j()).mo183536b(new C118830d("next_job_scheduler_id", (long) (intValue == Integer.MAX_VALUE ? 0 : intValue + 1)));
                                workDatabase.mo183706h();
                                if (intValue >= 0) {
                                    if (intValue <= i7) {
                                        i2 = intValue;
                                    }
                                }
                                ((C118832f) workDatabase.mo165528j()).mo183536b(new C118830d("next_job_scheduler_id", (long) 1));
                                i2 = 0;
                            } finally {
                                workDatabase.mo183704f();
                            }
                        }
                    }
                    if (a == null) {
                        ((C118836i) this.f353486f.f352606c.mo165529k()).mo183540b(new C118834g(oVar.f355541a, i2));
                    }
                    mo183053g(oVar, i2);
                    if (Build.VERSION.SDK_INT == 23 && (e = m166830e(this.f353484d, this.f353485e, oVar.f355541a)) != null) {
                        ArrayList arrayList = (ArrayList) e;
                        int indexOf = arrayList.indexOf(Integer.valueOf(i2));
                        if (indexOf >= 0) {
                            arrayList.remove(indexOf);
                        }
                        if (!arrayList.isEmpty()) {
                            i3 = ((Integer) arrayList.get(0)).intValue();
                        } else {
                            this.f353486f.f352605b.getClass();
                            int i8 = this.f353486f.f352605b.f338350g;
                            synchronized (cls) {
                                workDatabase.mo183703c();
                                try {
                                    Long a3 = ((C118832f) workDatabase.mo165528j()).mo183535a("next_job_scheduler_id");
                                    int intValue2 = a3 != null ? a3.intValue() : 0;
                                    ((C118832f) workDatabase.mo165528j()).mo183536b(new C118830d("next_job_scheduler_id", (long) (intValue2 == Integer.MAX_VALUE ? 0 : intValue2 + 1)));
                                    workDatabase.mo183706h();
                                    if (intValue2 >= 0) {
                                        if (intValue2 <= i8) {
                                            i3 = intValue2;
                                        }
                                    }
                                    ((C118832f) workDatabase.mo165528j()).mo183536b(new C118830d("next_job_scheduler_id", (long) 1));
                                    i3 = 0;
                                } finally {
                                    workDatabase.mo183704f();
                                }
                            }
                        }
                        mo183053g(oVar, i3);
                    }
                    workDatabase.mo183706h();
                    workDatabase.mo183704f();
                    i5 = i + 1;
                    i4 = 0;
                }
                i = i5;
                workDatabase.mo183704f();
                i5 = i + 1;
                i4 = 0;
            } catch (Throwable th) {
                workDatabase.mo183704f();
                throw th;
            }
        }
    }

    /* renamed from: g */
    public void mo183053g(C118847o oVar, int i) {
        JobInfo a = this.f353487g.mo183052a(oVar, i);
        C117693m c = C117693m.m165966c();
        String str = f353483h;
        c.mo182389a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{oVar.f355541a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            if (this.f353485e.schedule(a) == 0) {
                C117693m.m165966c().mo182392f(str, String.format("Unable to schedule work ID %s", new Object[]{oVar.f355541a}), new Throwable[0]);
                if (oVar.f355557q && oVar.f355558r == C109940q.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    oVar.f355557q = false;
                    C117693m.m165966c().mo182389a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{oVar.f355541a}), new Throwable[0]);
                    mo183053g(oVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> f = m166831f(this.f353484d, this.f353485e);
            int size = f != null ? ((ArrayList) f).size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(size);
            objArr[1] = Integer.valueOf(((ArrayList) ((C118850q) this.f353486f.f352606c.mo165532n()).mo183556e()).size());
            C113038a aVar = this.f353486f.f352605b;
            objArr[2] = Integer.valueOf(Build.VERSION.SDK_INT == 23 ? aVar.f338351h / 2 : aVar.f338351h);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            C117693m.m165966c().mo182390b(f353483h, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C117693m.m165966c().mo182390b(f353483h, String.format("Unable to schedule %s", new Object[]{oVar}), th);
        }
    }
}
