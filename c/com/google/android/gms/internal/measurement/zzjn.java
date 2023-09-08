package com.google.android.gms.internal.measurement;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;
import j20.C117292a;
import k20.C9556a;

public final class zzjn extends zzjq {
    private byte _hellAccFlag_;
    private final zzem zzapy;
    private final AlarmManager zzyi = ((AlarmManager) getContext().getSystemService("alarm"));
    private Integer zzyj;

    public zzjn(zzjr zzjr) {
        super(zzjr);
        this.zzapy = new zzjo(this, zzjr.zzla(), zzjr);
    }

    private final int getJobId() {
        if (this.zzyj == null) {
            String valueOf = String.valueOf(getContext().getPackageName());
            this.zzyj = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.zzyj.intValue();
    }

    private final PendingIntent zzek() {
        Intent className = new Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(getContext(), 0, className, 0);
    }

    private final void zzkl() {
        zzge().zzit().zzg("Cancelling job. JobID", Integer.valueOf(getJobId()));
        ((JobScheduler) getContext().getSystemService("jobscheduler")).cancel(getJobId());
    }

    public final void cancel() {
        zzch();
        AlarmManager alarmManager = this.zzyi;
        PendingIntent zzek = zzek();
        C9556a aVar = new C9556a();
        aVar.mo10233c(zzek);
        C117292a.m165358d(alarmManager, aVar.mo10232b(), "com/google/android/gms/internal/measurement/zzjn", "cancel", "()V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((PendingIntent) aVar.mo10231a(0));
        C117292a.m165359e(alarmManager, "com/google/android/gms/internal/measurement/zzjn", "cancel", "()V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        this.zzapy.cancel();
        if (Build.VERSION.SDK_INT >= 24) {
            zzkl();
        }
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    public final /* bridge */ /* synthetic */ zzdu zzft() {
        return super.zzft();
    }

    public final /* bridge */ /* synthetic */ zzhk zzfu() {
        return super.zzfu();
    }

    public final /* bridge */ /* synthetic */ zzfb zzfv() {
        return super.zzfv();
    }

    public final /* bridge */ /* synthetic */ zzeo zzfw() {
        return super.zzfw();
    }

    public final /* bridge */ /* synthetic */ zzii zzfx() {
        return super.zzfx();
    }

    public final /* bridge */ /* synthetic */ zzif zzfy() {
        return super.zzfy();
    }

    public final /* bridge */ /* synthetic */ zzfc zzfz() {
        return super.zzfz();
    }

    public final /* bridge */ /* synthetic */ zzfe zzga() {
        return super.zzga();
    }

    public final /* bridge */ /* synthetic */ zzka zzgb() {
        return super.zzgb();
    }

    public final /* bridge */ /* synthetic */ zzjh zzgc() {
        return super.zzgc();
    }

    public final /* bridge */ /* synthetic */ zzgg zzgd() {
        return super.zzgd();
    }

    public final /* bridge */ /* synthetic */ zzfg zzge() {
        return super.zzge();
    }

    public final /* bridge */ /* synthetic */ zzfr zzgf() {
        return super.zzgf();
    }

    public final /* bridge */ /* synthetic */ zzef zzgg() {
        return super.zzgg();
    }

    public final void zzh(long j) {
        zzch();
        if (!zzgb.zza(getContext())) {
            zzge().zzis().log("Receiver not registered/enabled");
        }
        if (!zzjc.zza(getContext(), false)) {
            zzge().zzis().log("Service not registered/enabled");
        }
        cancel();
        long elapsedRealtime = zzbt().elapsedRealtime() + j;
        if (j < Math.max(0, zzew.zzahf.get().longValue()) && !this.zzapy.zzef()) {
            zzge().zzit().log("Scheduling upload with DelayedRunnable");
            this.zzapy.zzh(j);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            zzge().zzit().log("Scheduling upload with JobScheduler");
            JobInfo.Builder builder = new JobInfo.Builder(getJobId(), new ComponentName(getContext(), "com.google.android.gms.measurement.AppMeasurementJobService"));
            builder.setMinimumLatency(j);
            builder.setOverrideDeadline(j << 1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            builder.setExtras(persistableBundle);
            JobInfo build = builder.build();
            zzge().zzit().zzg("Scheduling job. JobID", Integer.valueOf(getJobId()));
            ((JobScheduler) getContext().getSystemService("jobscheduler")).schedule(build);
            return;
        }
        zzge().zzit().log("Scheduling upload with AlarmManager");
        this.zzyi.setInexactRepeating(2, elapsedRealtime, Math.max(zzew.zzaha.get().longValue(), j), zzek());
    }

    public final boolean zzhf() {
        AlarmManager alarmManager = this.zzyi;
        PendingIntent zzek = zzek();
        C9556a aVar = new C9556a();
        aVar.mo10233c(zzek);
        C117292a.m165358d(alarmManager, aVar.mo10232b(), "com/google/android/gms/internal/measurement/zzjn", "zzhf", "()Z", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((PendingIntent) aVar.mo10231a(0));
        C117292a.m165359e(alarmManager, "com/google/android/gms/internal/measurement/zzjn", "zzhf", "()Z", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        if (Build.VERSION.SDK_INT >= 24) {
            zzkl();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ zzeb zziw() {
        return super.zziw();
    }

    public final /* bridge */ /* synthetic */ zzei zzix() {
        return super.zzix();
    }
}
