package be2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: be2.b */
public class C79692b implements Application.ActivityLifecycleCallbacks, C114668z, ICrashReporter.ICrashReportExtraMessageGetter {

    /* renamed from: g */
    public static C79692b f233595g;

    /* renamed from: d */
    public volatile int f233596d = 0;

    /* renamed from: e */
    public MultiProcessMMKV f233597e;

    /* renamed from: f */
    public String f233598f;

    public C79692b(String str) {
        String str2 = "fg_killed_state_" + str;
        this.f233598f = str;
        this.f233597e = MultiProcessMMKV.getSingleMMKV(str2);
        Log.m105919d("MicroMsg.ForegroundKilledDetect", "MMKV stg :%s", str2);
    }

    /* renamed from: a */
    public final void mo109808a() {
        this.f233597e.encode("state", this.f233596d);
    }

    public String getCrashReportExtraMessage() {
        Log.m105919d("MicroMsg.ForegroundKilledDetect", "%s : crash was caught! DO NOT report this case", this.f233598f);
        int i = this.f233596d;
        if (!((this.f233596d & 4) == 4)) {
            this.f233596d |= 4;
            mo109808a();
        }
        Log.m105919d("MicroMsg.ForegroundKilledDetect", "%s: setStateCrashCaught state = %s -> %s", this.f233598f, Integer.toBinaryString(i), Integer.toBinaryString(this.f233596d));
        return "";
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        int i = this.f233596d;
        if ((this.f233596d & 2) == 2) {
            this.f233596d &= -3;
            mo109808a();
        }
        Log.m105919d("MicroMsg.ForegroundKilledDetect", "%s: setStateActivityBackground state = %s -> %s", this.f233598f, Integer.toBinaryString(i), Integer.toBinaryString(this.f233596d));
    }

    public void onActivityResumed(Activity activity) {
        int i = this.f233596d;
        if (!((this.f233596d & 2) == 2)) {
            this.f233596d |= 2;
            mo109808a();
        }
        Log.m105919d("MicroMsg.ForegroundKilledDetect", "%s: setStateActivityForeground state = %s -> %s", this.f233598f, Integer.toBinaryString(i), Integer.toBinaryString(this.f233596d));
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onAppBackground(String str) {
        int i = this.f233596d;
        if ((this.f233596d & 1) == 1) {
            this.f233596d &= -2;
            mo109808a();
        }
        Log.m105919d("MicroMsg.ForegroundKilledDetect", "%s: setStateAppBackground state = %s -> %s", this.f233598f, Integer.toBinaryString(i), Integer.toBinaryString(this.f233596d));
    }

    public void onAppForeground(String str) {
        int i = this.f233596d;
        if (!((this.f233596d & 1) == 1)) {
            this.f233596d |= 1;
            mo109808a();
        }
        Log.m105919d("MicroMsg.ForegroundKilledDetect", "%s: setStateAppForeground state = %s -> %s", this.f233598f, Integer.toBinaryString(i), Integer.toBinaryString(this.f233596d));
    }
}
