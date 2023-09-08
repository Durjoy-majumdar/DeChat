package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p1014o4.C117693m;
import p1206p4.C117969b;
import p1206p4.C117971d;
import p1206p4.C117979k;

public class SystemJobService extends JobService implements C117969b {

    /* renamed from: f */
    public static final String f338419f = C117693m.m165967e("SystemJobService");

    /* renamed from: d */
    public C117979k f338420d;

    /* renamed from: e */
    public final Map<String, JobParameters> f338421e = new HashMap();

    /* renamed from: e */
    public void mo165545e(String str, boolean z) {
        JobParameters jobParameters;
        C117693m.m165966c().mo182389a(f338419f, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f338421e) {
            jobParameters = (JobParameters) ((HashMap) this.f338421e).remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C117979k b = C117979k.m166386b(getApplicationContext());
            this.f338420d = b;
            b.f352609f.mo182722a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C117693m.m165966c().mo182392f(f338419f, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C117979k kVar = this.f338420d;
        if (kVar != null) {
            C117971d dVar = kVar.f352609f;
            synchronized (dVar.f352583q) {
                ((ArrayList) dVar.f352582p).remove(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r2 < 24) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        r3 = new androidx.work.WorkerParameters.C113037a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r10.getTriggeredContentUris() == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        r3.f338343b = java.util.Arrays.asList(r10.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a0, code lost:
        if (r10.getTriggeredContentAuthorities() == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        r3.f338342a = java.util.Arrays.asList(r10.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        if (r2 < 28) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        r10.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        r9.f338420d.mo182736f(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r10) {
        /*
            r9 = this;
            p4.k r0 = r9.f338420d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r3 = f338419f
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.mo182389a(r3, r4, r5)
            r9.jobFinished(r10, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            r3 = 0
            android.os.PersistableBundle r4 = r10.getExtras()     // Catch:{ NullPointerException -> 0x002b }
            if (r4 == 0) goto L_0x002b
            boolean r5 = r4.containsKey(r0)     // Catch:{ NullPointerException -> 0x002b }
            if (r5 == 0) goto L_0x002b
            java.lang.String r0 = r4.getString(r0)     // Catch:{ NullPointerException -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r0 = r3
        L_0x002c:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0040
            o4.m r10 = p1014o4.C117693m.m165966c()
            java.lang.String r0 = f338419f
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r10.mo182390b(r0, r1, r3)
            return r2
        L_0x0040:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r9.f338421e
            monitor-enter(r4)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r5 = r9.f338421e     // Catch:{ all -> 0x00b9 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x00b9 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x00b9 }
            if (r5 == 0) goto L_0x0064
            o4.m r10 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x00b9 }
            java.lang.String r3 = f338419f     // Catch:{ all -> 0x00b9 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b9 }
            r1[r2] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00b9 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00b9 }
            r10.mo182389a(r3, r0, r1)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r4)     // Catch:{ all -> 0x00b9 }
            return r2
        L_0x0064:
            o4.m r5 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = f338419f     // Catch:{ all -> 0x00b9 }
            java.lang.String r7 = "onStartJob for %s"
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b9 }
            r8[r2] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00b9 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00b9 }
            r5.mo182389a(r6, r7, r2)     // Catch:{ all -> 0x00b9 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r9.f338421e     // Catch:{ all -> 0x00b9 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x00b9 }
            r2.put(r0, r10)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r4)     // Catch:{ all -> 0x00b9 }
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto L_0x00b3
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = r10.getTriggeredContentUris()
            if (r4 == 0) goto L_0x009c
            android.net.Uri[] r4 = r10.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f338343b = r4
        L_0x009c:
            java.lang.String[] r4 = r10.getTriggeredContentAuthorities()
            if (r4 == 0) goto L_0x00ac
            java.lang.String[] r4 = r10.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f338342a = r4
        L_0x00ac:
            r4 = 28
            if (r2 < r4) goto L_0x00b3
            r10.getNetwork()
        L_0x00b3:
            p4.k r10 = r9.f338420d
            r10.mo182736f(r0, r3)
            return r1
        L_0x00b9:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b9 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStopJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            p4.k r0 = r6.f338420d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0014
            o4.m r7 = p1014o4.C117693m.m165966c()
            java.lang.String r0 = f338419f
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r7.mo182389a(r0, r3, r2)
            return r1
        L_0x0014:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r7 = r7.getExtras()     // Catch:{ NullPointerException -> 0x0027 }
            if (r7 == 0) goto L_0x0027
            boolean r3 = r7.containsKey(r0)     // Catch:{ NullPointerException -> 0x0027 }
            if (r3 == 0) goto L_0x0027
            java.lang.String r7 = r7.getString(r0)     // Catch:{ NullPointerException -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r7 = 0
        L_0x0028:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x003c
            o4.m r7 = p1014o4.C117693m.m165966c()
            java.lang.String r0 = f338419f
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r7.mo182390b(r0, r1, r3)
            return r2
        L_0x003c:
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r3 = f338419f
            java.lang.String r4 = "onStopJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r7
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.mo182389a(r3, r4, r2)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r0 = r6.f338421e
            monitor-enter(r0)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r6.f338421e     // Catch:{ all -> 0x0076 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x0076 }
            r2.remove(r7)     // Catch:{ all -> 0x0076 }
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            p4.k r0 = r6.f338420d
            r0.mo182737g(r7)
            p4.k r0 = r6.f338420d
            p4.d r0 = r0.f352609f
            java.lang.Object r2 = r0.f352583q
            monitor-enter(r2)
            java.util.Set<java.lang.String> r0 = r0.f352581o     // Catch:{ all -> 0x0073 }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x0073 }
            boolean r7 = r0.contains(r7)     // Catch:{ all -> 0x0073 }
            monitor-exit(r2)     // Catch:{ all -> 0x0073 }
            r7 = r7 ^ r1
            return r7
        L_0x0073:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0073 }
            throw r7
        L_0x0076:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
