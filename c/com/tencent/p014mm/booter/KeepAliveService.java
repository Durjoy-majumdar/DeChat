package com.tencent.p014mm.booter;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.PushKeepAliveEvent;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86718e;
import p206nj.C11171e;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.booter.KeepAliveService */
public class KeepAliveService extends JobService {

    /* renamed from: d */
    public static long f343899d;

    /* renamed from: com.tencent.mm.booter.KeepAliveService$a */
    public class C114707a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JobParameters f343900d;

        public C114707a(JobParameters jobParameters) {
            this.f343900d = jobParameters;
        }

        public void run() {
            Log.m105924i("MicroMsg.KeepAliveService", "onStartJob() delay");
            KeepAliveService.m161346a();
            try {
                KeepAliveService.this.jobFinished(this.f343900d, false);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.KeepAliveService", "onStartJob() jobFinished() Exception=%s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.booter.KeepAliveService$b */
    public class C114708b implements Runnable {
        public C114708b(KeepAliveService keepAliveService) {
        }

        public void run() {
            new PushKeepAliveEvent().asyncPublish(Looper.getMainLooper());
            Log.m105924i("MicroMsg.KeepAliveService", "onReceive() publish PushKeepAliveEvent");
        }
    }

    static {
        if (C11171e.m11046c(23)) {
            f343899d = 590000;
        } else {
            f343899d = 50000;
        }
    }

    /* renamed from: a */
    public static boolean m161346a() {
        if (!C86718e.m107552u().getBoolean("keepaliveserviceswitch", false)) {
            return false;
        }
        Log.m105925i("MicroMsg.KeepAliveService", "scheduleCoreScheduleJob(), time = %d", Long.valueOf(f343899d));
        try {
            JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(MMApplicationContext.getContext(), KeepAliveService.class));
            builder.setMinimumLatency(0);
            builder.setOverrideDeadline(10);
            builder.setRequiredNetworkType(1);
            builder.setRequiresDeviceIdle(false);
            builder.setRequiresCharging(false);
            JobScheduler jobScheduler = (JobScheduler) MMApplicationContext.getContext().getSystemService("jobscheduler");
            if (jobScheduler != null) {
                int schedule = jobScheduler.schedule(builder.build());
                if (schedule == 1) {
                    return true;
                }
                throw new Exception("scheduleCoreScheduleJob fail, result = " + schedule);
            }
            throw new Exception("Can not get JOB_SCHEDULER_SERVICE");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.KeepAliveService", "scheduleKeepAliveJob() Exception:%s" + e.getMessage());
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Log.m105924i("MicroMsg.KeepAliveService", "onStartJob()");
        if (C114781l0.m161554a() == null) {
            Log.m105924i("MicroMsg.KeepAliveService", "onStarJob() MMPushCore.getAutoAuth() == null");
            C80811b.m98664a(MMApplicationContext.getContext(), "jobservice", true);
        }
        new Handler().postDelayed(new C114707a(jobParameters), f343899d);
        Log.m105924i("MicroMsg.KeepAliveService", "onReceive() delay publish PushKeepAliveEvent");
        C119179t tVar = C119157j.f356862d;
        C114708b bVar = new C114708b(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(bVar, 60000, false);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        Log.m105924i("MicroMsg.KeepAliveService", "onStopJob()");
        return false;
    }
}
