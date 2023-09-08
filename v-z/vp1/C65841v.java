package vp1;

import android.os.SystemClock;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import te3.C51697vi1;

/* renamed from: vp1.v */
public final class C65841v implements MMUncaughtExceptionHandler.IOnUncaughtExceptionListener {

    /* renamed from: a */
    public final /* synthetic */ C51697vi1 f189342a;

    public C65841v(C51697vi1 vi12) {
        this.f189342a = vi12;
    }

    public final void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th) {
        Class cls = FinderCommonFeatureService.class;
        C51697vi1 vi12 = this.f189342a;
        if (vi12 == null) {
            vi12 = new C51697vi1();
            vi12.f143491e = 0;
            vi12.f143490d = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("get crash msg ");
        sb.append(str);
        sb.append(", isInFinder ");
        sb.append(((FinderCommonFeatureService) C86312j.m106911c(cls)).f157791S.q90());
        sb.append(" lastEnterTimeMs:");
        C14947w wVar = C14947w.f40984a;
        sb.append(C14947w.f40985b);
        sb.append(" pass: ");
        sb.append(SystemClock.uptimeMillis() - C14947w.f40985b);
        sb.append(" info: ");
        C51697vi1 vi13 = this.f189342a;
        Long l = null;
        sb.append(vi13 != null ? Integer.valueOf(vi13.f143491e) : null);
        sb.append(' ');
        C51697vi1 vi14 = this.f189342a;
        if (vi14 != null) {
            l = Long.valueOf(vi14.f143490d);
        }
        sb.append(l);
        Log.m105924i("Finder.PageRecovery", sb.toString());
        if (((FinderCommonFeatureService) C86312j.m106911c(cls)).f157791S.q90() && SystemClock.uptimeMillis() - C14947w.f40985b <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            if (System.currentTimeMillis() - vi12.f143490d < 300000) {
                vi12.f143491e++;
            } else {
                vi12.f143491e = 1;
            }
            vi12.f143490d = System.currentTimeMillis();
            C86013q1.m106461v(new C86009m1(wVar.mo13998a()).mo119973k());
            C86013q1.m106437S(wVar.mo13998a(), vi12.toByteArray());
            Log.m105924i("Finder.PageRecovery", "[setup] crash happen =" + C86013q1.m106450k(wVar.mo13998a()) + " touchFile=" + wVar.mo13998a() + " info: " + Integer.valueOf(vi12.f143491e) + ' ' + Long.valueOf(vi12.f143490d));
        }
    }
}
