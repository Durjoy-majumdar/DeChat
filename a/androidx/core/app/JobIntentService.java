package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;

@Deprecated
public abstract class JobIntentService extends Service {

    /* renamed from: i */
    public static final HashMap<ComponentName, C79604g> f233427i = new HashMap<>();

    /* renamed from: d */
    public C79598b f233428d;

    /* renamed from: e */
    public C79604g f233429e;

    /* renamed from: f */
    public C79597a f233430f;

    /* renamed from: g */
    public boolean f233431g = false;

    /* renamed from: h */
    public final ArrayList<C79600d> f233432h;

    /* renamed from: androidx.core.app.JobIntentService$a */
    public final class C79597a extends AsyncTask<Void, Void, Void> {
        public C79597a() {
        }

        public Object doInBackground(Object[] objArr) {
            C79601e eVar;
            Void[] voidArr = (Void[]) objArr;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                C79598b bVar = jobIntentService.f233428d;
                if (bVar != null) {
                    eVar = ((C79602f) bVar).mo109739a();
                } else {
                    synchronized (jobIntentService.f233432h) {
                        eVar = jobIntentService.f233432h.size() > 0 ? jobIntentService.f233432h.remove(0) : null;
                    }
                }
                if (eVar == null) {
                    return null;
                }
                JobIntentService.this.mo109725b(eVar.getIntent());
                eVar.mo109737a();
            }
            while (true) {
            }
        }

        public void onCancelled(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.mo109726c();
        }

        public void onPostExecute(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.mo109726c();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    public interface C79598b {
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    public static final class C79599c extends C79604g {

        /* renamed from: a */
        public final Context f233434a;

        /* renamed from: b */
        public final PowerManager.WakeLock f233435b;

        /* renamed from: c */
        public final PowerManager.WakeLock f233436c;

        /* renamed from: d */
        public boolean f233437d;

        public C79599c(Context context, ComponentName componentName) {
            super(componentName);
            this.f233434a = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f233435b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f233436c = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* renamed from: a */
        public void mo109734a() {
            synchronized (this) {
                if (this.f233437d) {
                    this.f233437d = false;
                    PowerManager.WakeLock wakeLock = this.f233436c;
                    C117292a.m165357c(wakeLock, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock.release();
                    C117292a.m165359e(wakeLock, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
            }
        }

        /* renamed from: b */
        public void mo109735b() {
            synchronized (this) {
                if (!this.f233437d) {
                    this.f233437d = true;
                    PowerManager.WakeLock wakeLock = this.f233436c;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(600000L);
                    C117292a.m165358d(wakeLock, aVar.mo10232b(), "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                    C60958c.f173611a.set(aVar);
                    long longValue = ((Long) aVar.mo10231a(0)).longValue();
                    C60958c.m71441a();
                    wakeLock.acquire(longValue);
                    C117292a.m165359e(wakeLock, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                    PowerManager.WakeLock wakeLock2 = this.f233435b;
                    C117292a.m165357c(wakeLock2, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    C117292a.m165359e(wakeLock2, "androidx/core/app/JobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
            }
        }

        /* renamed from: c */
        public void mo109736c() {
            synchronized (this) {
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    public final class C79600d implements C79601e {

        /* renamed from: a */
        public final Intent f233438a;

        /* renamed from: b */
        public final int f233439b;

        public C79600d(Intent intent, int i) {
            this.f233438a = intent;
            this.f233439b = i;
        }

        /* renamed from: a */
        public void mo109737a() {
            JobIntentService.this.stopSelf(this.f233439b);
        }

        public Intent getIntent() {
            return this.f233438a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    public interface C79601e {
        /* renamed from: a */
        void mo109737a();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    public static final class C79602f extends JobServiceEngine implements C79598b {

        /* renamed from: a */
        public final JobIntentService f233441a;

        /* renamed from: b */
        public final Object f233442b = new Object();

        /* renamed from: c */
        public JobParameters f233443c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        public final class C79603a implements C79601e {

            /* renamed from: a */
            public final JobWorkItem f233444a;

            public C79603a(JobWorkItem jobWorkItem) {
                this.f233444a = jobWorkItem;
            }

            /* renamed from: a */
            public void mo109737a() {
                synchronized (C79602f.this.f233442b) {
                    JobParameters jobParameters = C79602f.this.f233443c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f233444a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f233444a.getIntent();
            }
        }

        public C79602f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f233441a = jobIntentService;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f233441a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.C79602f.C79603a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.C79601e mo109739a() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f233442b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f233443c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f233441a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.C79602f.mo109739a():androidx.core.app.JobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f233443c = jobParameters;
            this.f233441a.mo109724a(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            C79597a aVar = this.f233441a.f233430f;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f233442b) {
                this.f233443c = null;
            }
            return true;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    public static abstract class C79604g {
        public C79604g(ComponentName componentName) {
        }

        /* renamed from: a */
        public void mo109734a() {
        }

        /* renamed from: b */
        public void mo109735b() {
        }

        /* renamed from: c */
        public void mo109736c() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f233432h = null;
        } else {
            this.f233432h = new ArrayList<>();
        }
    }

    /* renamed from: a */
    public void mo109724a(boolean z) {
        if (this.f233430f == null) {
            this.f233430f = new C79597a();
            C79604g gVar = this.f233429e;
            if (gVar != null && z) {
                gVar.mo109735b();
            }
            this.f233430f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: b */
    public abstract void mo109725b(Intent intent);

    /* renamed from: c */
    public void mo109726c() {
        ArrayList<C79600d> arrayList = this.f233432h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f233430f = null;
                ArrayList<C79600d> arrayList2 = this.f233432h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo109724a(false);
                } else if (!this.f233431g) {
                    this.f233429e.mo109734a();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C79598b bVar = this.f233428d;
        if (bVar != null) {
            return ((C79602f) bVar).getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f233428d = new C79602f(this);
            this.f233429e = null;
            return;
        }
        this.f233428d = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, C79604g> hashMap = f233427i;
        C79604g gVar = hashMap.get(componentName);
        if (gVar == null) {
            if (i < 26) {
                gVar = new C79599c(this, componentName);
                hashMap.put(componentName, gVar);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
        }
        this.f233429e = gVar;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C79600d> arrayList = this.f233432h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f233431g = true;
                this.f233429e.mo109734a();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f233432h == null) {
            return 2;
        }
        this.f233429e.mo109736c();
        synchronized (this.f233432h) {
            ArrayList<C79600d> arrayList = this.f233432h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C79600d(intent, i2));
            mo109724a(true);
        }
        return 3;
    }
}
