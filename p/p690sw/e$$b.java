package p690sw;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.C85678f;
import com.tencent.p014mm.recoveryv2.C85695l;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import wc0.C90943e;
import zt3.C119157j;

/* renamed from: sw.e$$b */
public class e$$b implements MMUncaughtExceptionHandler.IAfterReport {
    public e$$b(C90360e eVar) {
    }

    public void afterReport() {
        int i;
        C85695l a = C85695l.m105842a();
        C85678f fVar = a.f249698b;
        if (fVar == null) {
            Context context = a.f249697a;
            if (context != null) {
                C85672d.C85673a aVar = new C85672d.C85673a(context, "recovery_crash_count");
                aVar.mo119240a();
                Math.max(aVar.getInt("crash_count", 0), 0);
                File file = new File(new File(context.getFilesDir().getParentFile(), "MicroMsg/recovery"), "recovery_crash");
                new Bundle();
                new AtomicBoolean();
                new File(file, "fast_persist_data");
                i = Math.max(aVar.getInt("crash_count", 0), 0);
                Log.m105924i("RecoveryOnSplashService", "#afterReport, handling java crash with recovery, lastCrashCount = " + i);
                Log.m105924i("MicroMsg.recovery.reporter", "do recovery report directly");
                ((C119157j) C119157j.f356862d).mo183875f(new C90943e(i));
                C85672d.C85674b bVar = new C85672d.C85674b(MMApplicationContext.getContext(), "recovery_statistic");
                bVar.mo119256e();
                int i2 = bVar.getInt("crash_count", 0);
                boolean z = bVar.getBoolean("launch_recovery", false);
                boolean z2 = bVar.getBoolean("launch_recovery_real", false);
                boolean z3 = bVar.getBoolean("recover_from_crash", false);
                int i3 = bVar.getInt("recovery_status", -1);
                int i4 = bVar.getInt("recovery_from", 0);
                int i5 = bVar.getInt("recover_internal_status", 0);
                int i6 = bVar.getInt("recover_launch_mode", 0);
                long j = bVar.getLong("recover_running_time", 0);
                boolean z4 = bVar.getBoolean("recover_is_discard", false);
                bVar.getString("recover_app_ver", "");
                bVar.mo119258g("crash_count", (long) i2);
                bVar.putBoolean("launch_recovery", z);
                bVar.putBoolean("launch_recovery_real", z2);
                bVar.putBoolean("recover_from_crash", z3);
                bVar.mo119258g("recovery_status", (long) i3);
                bVar.mo119258g("recovery_from", (long) i4);
                bVar.mo119258g("recover_internal_status", (long) i5);
                bVar.mo119258g("recover_launch_mode", (long) i6);
                bVar.mo119258g("recover_running_time", j);
                bVar.putBoolean("recover_is_discard", z4);
                bVar.putString("recover_app_ver", BuildInfo.CLIENT_VERSION);
                bVar.mo119242c();
                C85695l.m105842a().mo119282c(3);
            }
        } else if (fVar instanceof C85678f.C85679a) {
            i = ((C85678f.C85679a) fVar).mo119266d();
            Log.m105924i("RecoveryOnSplashService", "#afterReport, handling java crash with recovery, lastCrashCount = " + i);
            Log.m105924i("MicroMsg.recovery.reporter", "do recovery report directly");
            ((C119157j) C119157j.f356862d).mo183875f(new C90943e(i));
            C85672d.C85674b bVar2 = new C85672d.C85674b(MMApplicationContext.getContext(), "recovery_statistic");
            bVar2.mo119256e();
            int i25 = bVar2.getInt("crash_count", 0);
            boolean z5 = bVar2.getBoolean("launch_recovery", false);
            boolean z25 = bVar2.getBoolean("launch_recovery_real", false);
            boolean z34 = bVar2.getBoolean("recover_from_crash", false);
            int i35 = bVar2.getInt("recovery_status", -1);
            int i44 = bVar2.getInt("recovery_from", 0);
            int i54 = bVar2.getInt("recover_internal_status", 0);
            int i64 = bVar2.getInt("recover_launch_mode", 0);
            long j2 = bVar2.getLong("recover_running_time", 0);
            boolean z44 = bVar2.getBoolean("recover_is_discard", false);
            bVar2.getString("recover_app_ver", "");
            bVar2.mo119258g("crash_count", (long) i25);
            bVar2.putBoolean("launch_recovery", z5);
            bVar2.putBoolean("launch_recovery_real", z25);
            bVar2.putBoolean("recover_from_crash", z34);
            bVar2.mo119258g("recovery_status", (long) i35);
            bVar2.mo119258g("recovery_from", (long) i44);
            bVar2.mo119258g("recover_internal_status", (long) i54);
            bVar2.mo119258g("recover_launch_mode", (long) i64);
            bVar2.mo119258g("recover_running_time", j2);
            bVar2.putBoolean("recover_is_discard", z44);
            bVar2.putString("recover_app_ver", BuildInfo.CLIENT_VERSION);
            bVar2.mo119242c();
            C85695l.m105842a().mo119282c(3);
        }
        i = -1;
        Log.m105924i("RecoveryOnSplashService", "#afterReport, handling java crash with recovery, lastCrashCount = " + i);
        Log.m105924i("MicroMsg.recovery.reporter", "do recovery report directly");
        ((C119157j) C119157j.f356862d).mo183875f(new C90943e(i));
        C85672d.C85674b bVar22 = new C85672d.C85674b(MMApplicationContext.getContext(), "recovery_statistic");
        bVar22.mo119256e();
        int i252 = bVar22.getInt("crash_count", 0);
        boolean z54 = bVar22.getBoolean("launch_recovery", false);
        boolean z252 = bVar22.getBoolean("launch_recovery_real", false);
        boolean z342 = bVar22.getBoolean("recover_from_crash", false);
        int i352 = bVar22.getInt("recovery_status", -1);
        int i442 = bVar22.getInt("recovery_from", 0);
        int i542 = bVar22.getInt("recover_internal_status", 0);
        int i642 = bVar22.getInt("recover_launch_mode", 0);
        long j25 = bVar22.getLong("recover_running_time", 0);
        boolean z442 = bVar22.getBoolean("recover_is_discard", false);
        bVar22.getString("recover_app_ver", "");
        bVar22.mo119258g("crash_count", (long) i252);
        bVar22.putBoolean("launch_recovery", z54);
        bVar22.putBoolean("launch_recovery_real", z252);
        bVar22.putBoolean("recover_from_crash", z342);
        bVar22.mo119258g("recovery_status", (long) i352);
        bVar22.mo119258g("recovery_from", (long) i442);
        bVar22.mo119258g("recover_internal_status", (long) i542);
        bVar22.mo119258g("recover_launch_mode", (long) i642);
        bVar22.mo119258g("recover_running_time", j25);
        bVar22.putBoolean("recover_is_discard", z442);
        bVar22.putString("recover_app_ver", BuildInfo.CLIENT_VERSION);
        bVar22.mo119242c();
        C85695l.m105842a().mo119282c(3);
    }
}
