package com.tencent.matrix.resource;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Process;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import p723vf.C118672d;

public abstract class MatrixJobIntentService extends Service {

    /* renamed from: i */
    public static final Object f235511i = new Object();

    /* renamed from: j */
    public static final HashMap<ComponentName, C80522h> f235512j = new HashMap<>();

    /* renamed from: d */
    public C80515b f235513d;

    /* renamed from: e */
    public C80522h f235514e;

    /* renamed from: f */
    public C80514a f235515f;

    /* renamed from: g */
    public boolean f235516g = false;

    /* renamed from: h */
    public final ArrayList<C80517d> f235517h;

    /* renamed from: com.tencent.matrix.resource.MatrixJobIntentService$a */
    public final class C80514a extends AsyncTask<Void, Void, Void> {
        public C80514a() {
        }

        public Object doInBackground(Object[] objArr) {
            C80518e eVar;
            Void[] voidArr = (Void[]) objArr;
            while (true) {
                MatrixJobIntentService matrixJobIntentService = MatrixJobIntentService.this;
                C80515b bVar = matrixJobIntentService.f235513d;
                if (bVar != null) {
                    eVar = ((C80519f) bVar).mo112083a();
                } else {
                    ArrayList<C80517d> arrayList = matrixJobIntentService.f235517h;
                    if (arrayList != null) {
                        synchronized (arrayList) {
                            ArrayList<C80517d> arrayList2 = matrixJobIntentService.f235517h;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                eVar = matrixJobIntentService.f235517h.remove(0);
                            }
                        }
                    }
                    eVar = null;
                }
                if (eVar == null) {
                    return null;
                }
                MatrixJobIntentService.this.mo112066d(eVar.getIntent());
                eVar.mo112081a();
            }
        }

        public void onCancelled(Object obj) {
            Void voidR = (Void) obj;
            MatrixJobIntentService.this.mo112069e();
        }

        public void onPostExecute(Object obj) {
            Void voidR = (Void) obj;
            MatrixJobIntentService.this.mo112069e();
        }
    }

    /* renamed from: com.tencent.matrix.resource.MatrixJobIntentService$b */
    public interface C80515b {
    }

    /* renamed from: com.tencent.matrix.resource.MatrixJobIntentService$c */
    public static final class C80516c extends C80522h {

        /* renamed from: d */
        public final Context f235519d;

        /* renamed from: e */
        public final PowerManager.WakeLock f235520e;

        /* renamed from: f */
        public final PowerManager.WakeLock f235521f;

        /* renamed from: g */
        public boolean f235522g;

        /* renamed from: h */
        public boolean f235523h;

        public C80516c(Context context, ComponentName componentName) {
            super(componentName);
            Context applicationContext = context.getApplicationContext();
            this.f235519d = applicationContext;
            if (applicationContext.checkPermission("android.permission.WAKE_LOCK", Process.myPid(), Process.myUid()) == 0) {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
                this.f235520e = newWakeLock;
                newWakeLock.setReferenceCounted(false);
                PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
                this.f235521f = newWakeLock2;
                newWakeLock2.setReferenceCounted(false);
                return;
            }
            C118672d.m167356f("Matrix.JobIntentService", "it would be better to grant WAKE_LOCK permission to your app so that tinker can use WakeLock to keep system awake.", new Object[0]);
            this.f235521f = null;
            this.f235520e = null;
        }

        /* renamed from: a */
        public void mo112077a(Intent intent) {
            PowerManager.WakeLock wakeLock;
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f235534a);
            try {
                if (this.f235519d.startService(intent2) != null) {
                    synchronized (this) {
                        if (!this.f235522g) {
                            this.f235522g = true;
                            if (!this.f235523h && (wakeLock = this.f235520e) != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(60000L);
                                C117292a.m165358d(wakeLock, aVar.mo10232b(), "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "enqueueWork", "(Landroid/content/Intent;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                                C60958c.f173611a.set(aVar);
                                long longValue = ((Long) aVar.mo10231a(0)).longValue();
                                C60958c.m71441a();
                                wakeLock.acquire(longValue);
                                C117292a.m165359e(wakeLock, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "enqueueWork", "(Landroid/content/Intent;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.JobIntentService", th, "Exception occurred.", new Object[0]);
            }
        }

        /* renamed from: c */
        public void mo112078c() {
            PowerManager.WakeLock wakeLock;
            synchronized (this) {
                if (this.f235523h) {
                    if (this.f235522g && (wakeLock = this.f235520e) != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(60000L);
                        C117292a.m165358d(wakeLock, aVar.mo10232b(), "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                        C60958c.f173611a.set(aVar);
                        long longValue = ((Long) aVar.mo10231a(0)).longValue();
                        C60958c.m71441a();
                        wakeLock.acquire(longValue);
                        C117292a.m165359e(wakeLock, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                    }
                    this.f235523h = false;
                    PowerManager.WakeLock wakeLock2 = this.f235521f;
                    if (wakeLock2 != null) {
                        C117292a.m165357c(wakeLock2, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                        wakeLock2.release();
                        C117292a.m165359e(wakeLock2, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    }
                }
            }
        }

        /* renamed from: d */
        public void mo112079d() {
            synchronized (this) {
                if (!this.f235523h) {
                    this.f235523h = true;
                    PowerManager.WakeLock wakeLock = this.f235521f;
                    if (wakeLock != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(600000L);
                        C117292a.m165358d(wakeLock, aVar.mo10232b(), "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                        C60958c.f173611a.set(aVar);
                        long longValue = ((Long) aVar.mo10231a(0)).longValue();
                        C60958c.m71441a();
                        wakeLock.acquire(longValue);
                        C117292a.m165359e(wakeLock, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                    }
                    PowerManager.WakeLock wakeLock2 = this.f235520e;
                    if (wakeLock2 != null) {
                        C117292a.m165357c(wakeLock2, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                        wakeLock2.release();
                        C117292a.m165359e(wakeLock2, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo112080e() {
            synchronized (this) {
                this.f235522g = false;
            }
        }
    }

    /* renamed from: com.tencent.matrix.resource.MatrixJobIntentService$d */
    public final class C80517d implements C80518e {

        /* renamed from: a */
        public final Intent f235524a;

        /* renamed from: b */
        public final int f235525b;

        public C80517d(Intent intent, int i) {
            this.f235524a = intent;
            this.f235525b = i;
        }

        /* renamed from: a */
        public void mo112081a() {
            MatrixJobIntentService.this.stopSelf(this.f235525b);
        }

        public Intent getIntent() {
            return this.f235524a;
        }
    }

    /* renamed from: com.tencent.matrix.resource.MatrixJobIntentService$e */
    public interface C80518e {
        /* renamed from: a */
        void mo112081a();

        Intent getIntent();
    }

    /* renamed from: com.tencent.matrix.resource.MatrixJobIntentService$f */
    public static final class C80519f extends JobServiceEngine implements C80515b {

        /* renamed from: a */
        public final MatrixJobIntentService f235527a;

        /* renamed from: b */
        public final Object f235528b = new Object();

        /* renamed from: c */
        public JobParameters f235529c;

        /* renamed from: com.tencent.matrix.resource.MatrixJobIntentService$f$a */
        public final class C80520a implements C80518e {

            /* renamed from: a */
            public final JobWorkItem f235530a;

            public C80520a(JobWorkItem jobWorkItem) {
                this.f235530a = jobWorkItem;
            }

            /* renamed from: a */
            public void mo112081a() {
                synchronized (C80519f.this.f235528b) {
                    JobParameters jobParameters = C80519f.this.f235529c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f235530a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f235530a.getIntent();
            }
        }

        public C80519f(MatrixJobIntentService matrixJobIntentService) {
            super(matrixJobIntentService);
            this.f235527a = matrixJobIntentService;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
            if (r1 == null) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            if (r1.getIntent() == null) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
            r1.getIntent().setExtrasClassLoader(r6.f235527a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            return new com.tencent.matrix.resource.MatrixJobIntentService.C80519f.C80520a(r6, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.matrix.resource.MatrixJobIntentService.C80518e mo112083a() {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f235528b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r6.f235529c     // Catch:{ all -> 0x0038 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                if (r1 == 0) goto L_0x002a
                android.content.Intent r0 = r1.getIntent()
                if (r0 == 0) goto L_0x002a
                android.content.Intent r0 = r1.getIntent()
                com.tencent.matrix.resource.MatrixJobIntentService r2 = r6.f235527a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                com.tencent.matrix.resource.MatrixJobIntentService$f$a r0 = new com.tencent.matrix.resource.MatrixJobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x002a:
                return r2
            L_0x002b:
                r1 = move-exception
                java.lang.String r3 = "JobServiceEngineImpl"
                java.lang.String r4 = "exception occurred."
                r5 = 0
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0038 }
                p723vf.C118672d.m167354d(r3, r1, r4, r5)     // Catch:{ all -> 0x0038 }
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                return r2
            L_0x0038:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.resource.MatrixJobIntentService.C80519f.mo112083a():com.tencent.matrix.resource.MatrixJobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            synchronized (this.f235528b) {
                this.f235529c = jobParameters;
            }
            this.f235527a.mo112068b(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            C80514a aVar = this.f235527a.f235515f;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f235528b) {
                this.f235529c = null;
            }
            return true;
        }
    }

    /* renamed from: com.tencent.matrix.resource.MatrixJobIntentService$g */
    public static final class C80521g extends C80522h {

        /* renamed from: d */
        public final JobInfo f235532d;

        /* renamed from: e */
        public final JobScheduler f235533e;

        public C80521g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo112086b(i);
            this.f235532d = new JobInfo.Builder(i, componentName).setOverrideDeadline(0).build();
            this.f235533e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* renamed from: a */
        public void mo112077a(Intent intent) {
            this.f235533e.enqueue(this.f235532d, new JobWorkItem(intent));
        }
    }

    /* renamed from: com.tencent.matrix.resource.MatrixJobIntentService$h */
    public static abstract class C80522h {

        /* renamed from: a */
        public final ComponentName f235534a;

        /* renamed from: b */
        public boolean f235535b;

        /* renamed from: c */
        public int f235536c;

        public C80522h(ComponentName componentName) {
            this.f235534a = componentName;
        }

        /* renamed from: a */
        public abstract void mo112077a(Intent intent);

        /* renamed from: b */
        public void mo112086b(int i) {
            if (!this.f235535b) {
                this.f235535b = true;
                this.f235536c = i;
            } else if (this.f235536c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f235536c);
            }
        }

        /* renamed from: c */
        public void mo112078c() {
        }

        /* renamed from: d */
        public void mo112079d() {
        }

        /* renamed from: e */
        public void mo112080e() {
        }
    }

    public MatrixJobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f235517h = null;
        } else {
            this.f235517h = new ArrayList<>();
        }
    }

    /* renamed from: a */
    public static void m98098a(Context context, Class cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (f235511i) {
                C80522h c = m98099c(context, componentName, true, i);
                c.mo112086b(i);
                c.mo112077a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: c */
    public static C80522h m98099c(Context context, ComponentName componentName, boolean z, int i) {
        C80522h hVar;
        HashMap<ComponentName, C80522h> hashMap = f235512j;
        C80522h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C80516c(context, componentName);
        } else if (z) {
            hVar = new C80521g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C80522h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* renamed from: b */
    public void mo112068b(boolean z) {
        if (this.f235515f == null) {
            this.f235515f = new C80514a();
            C80522h hVar = this.f235514e;
            if (hVar != null && z) {
                hVar.mo112079d();
            }
            this.f235515f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: d */
    public abstract void mo112066d(Intent intent);

    /* renamed from: e */
    public void mo112069e() {
        ArrayList<C80517d> arrayList = this.f235517h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f235515f = null;
                ArrayList<C80517d> arrayList2 = this.f235517h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    mo112068b(false);
                } else if (!this.f235516g) {
                    this.f235514e.mo112078c();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C80515b bVar = this.f235513d;
        if (bVar != null) {
            return ((C80519f) bVar).getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f235513d = new C80519f(this);
            this.f235514e = null;
            return;
        }
        this.f235513d = null;
        this.f235514e = m98099c(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C80517d> arrayList = this.f235517h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f235516g = true;
                this.f235514e.mo112078c();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f235517h == null) {
            return 2;
        }
        this.f235514e.mo112080e();
        synchronized (this.f235517h) {
            ArrayList<C80517d> arrayList = this.f235517h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C80517d(intent, i2));
            mo112068b(true);
        }
        return 3;
    }
}
