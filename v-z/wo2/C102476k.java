package wo2;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: wo2.k */
public final class C102476k {

    /* renamed from: a */
    public long f301755a;

    /* renamed from: b */
    public long f301756b;

    /* renamed from: a */
    public final void mo142083a() {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
        if (this.f301756b != 0) {
            this.f301755a += SystemClock.elapsedRealtime() - this.f301756b;
        }
        this.f301756b = 0;
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
    }

    /* renamed from: b */
    public final void mo142084b() {
        SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
        if (this.f301756b == 0) {
            this.f301756b = SystemClock.elapsedRealtime();
        }
        SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
    }
}
