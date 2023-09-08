package lo2;

import android.os.CountDownTimer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import rq2.C101426m;
import xq2.C102716b;
import xq2.C102718c;

/* renamed from: lo2.g0 */
public class C99538g0 {

    /* renamed from: a */
    public final long f291784a;

    /* renamed from: b */
    public final long f291785b;

    /* renamed from: c */
    public final int f291786c = 1000;

    /* renamed from: d */
    public C99540b f291787d;

    /* renamed from: e */
    public C99539a f291788e;

    /* renamed from: lo2.g0$a */
    public interface C99539a {
    }

    /* renamed from: lo2.g0$b */
    public static class C99540b extends CountDownTimer {

        /* renamed from: a */
        public C99538g0 f291789a;

        /* renamed from: b */
        public boolean f291790b = false;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C99540b(lo2.C99538g0 r4, long r5) {
            /*
                r3 = this;
                java.lang.String r0 = "access$000"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                int r2 = r4.f291786c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                long r0 = (long) r2
                r3.<init>(r5, r0)
                r5 = 0
                r3.f291790b = r5
                r3.f291789a = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lo2.C99538g0.C99540b.<init>(lo2.g0, long):void");
        }

        public void onFinish() {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
            this.f291790b = true;
            C99538g0 g0Var = this.f291789a;
            if (g0Var != null) {
                g0Var.mo138928a(0);
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
        }

        public void onTick(long j) {
            SnsMethodCalculate.markStartTimeMs("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
            C99538g0 g0Var = this.f291789a;
            if (g0Var != null) {
                g0Var.mo138928a(j);
            }
            SnsMethodCalculate.markEndTimeMs("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
        }
    }

    public C99538g0(long j, long j2) {
        this.f291784a = j;
        this.f291785b = j2;
    }

    /* renamed from: a */
    public void mo138928a(long j) {
        SnsMethodCalculate.markStartTimeMs("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
        Log.m105918d("SnsAd.CountDownTimer", "the millisUntilFinished is " + j);
        C99539a aVar = this.f291788e;
        if (aVar != null) {
            C102716b bVar = (C102716b) aVar;
            SnsMethodCalculate.markStartTimeMs("onCountDownTick", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            C101426m.C101427a d = C101426m.m133106d(j, bVar.f303337b);
            C102718c cVar = bVar.f303338c;
            if (cVar != null) {
                cVar.mo130506a(j, d);
            }
            SnsMethodCalculate.markEndTimeMs("onCountDownTick", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
        }
        SnsMethodCalculate.markEndTimeMs("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
    }
}
