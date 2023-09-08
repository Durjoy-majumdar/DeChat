package p212oe;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: oe.j$$e$$d */
public final /* synthetic */ class j$$e$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ j$$e f352177d;

    public /* synthetic */ j$$e$$d(j$$e j__e) {
        this.f352177d = j__e;
    }

    public final void run() {
        j$$e j__e = this.f352177d;
        j__e.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            MultiProcessMMKV.getDefault().putLong("batt_last_charged", System.currentTimeMillis()).apply();
            C117762j.f352166d.removeCallbacks(j__e.f352181c);
            C117762j.f352166d.postDelayed(j__e.f352181c, 300000);
        }
    }
}
