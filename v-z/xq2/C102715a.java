package xq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import lo2.C99538g0;
import rq2.C101426m;
import xq2.C102716b;

/* renamed from: xq2.a */
public class C102715a {

    /* renamed from: a */
    public C102718c f303335a;

    public C102715a(C102718c cVar) {
        this.f303335a = cVar;
    }

    /* renamed from: a */
    public void mo142513a(C102719d dVar) {
        long j;
        SnsMethodCalculate.markStartTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
        C102718c cVar = this.f303335a;
        if (cVar == null) {
            SnsMethodCalculate.markEndTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
            return;
        }
        C102719d countDownVM = cVar.getCountDownVM();
        if (!(countDownVM == null || countDownVM == dVar)) {
            mo142514b(countDownVM);
        }
        if (dVar != null) {
            C102718c cVar2 = this.f303335a;
            C102716b bVar = (C102716b) dVar;
            SnsMethodCalculate.markStartTimeMs("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            bVar.f303338c = cVar2;
            SnsMethodCalculate.markEndTimeMs("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            SnsMethodCalculate.markStartTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            Log.m105918d("SnsAd.CountDownViewModel", "startCountDown is called");
            C99538g0 g0Var = bVar.f303336a;
            g0Var.getClass();
            SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            C102716b.C102717a aVar = (C102716b.C102717a) g0Var;
            SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
            boolean c = C101426m.m133105c(aVar.f291784a, aVar.f291785b);
            SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
            if (c) {
                C99538g0.C99540b bVar2 = g0Var.f291787d;
                if (bVar2 != null) {
                    SnsMethodCalculate.markStartTimeMs("isFinished", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
                    boolean z = bVar2.f291790b;
                    SnsMethodCalculate.markEndTimeMs("isFinished", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
                    if (!z) {
                        g0Var.f291787d.cancel();
                        g0Var.f291787d = null;
                    }
                }
                g0Var.f291788e = bVar;
                SnsMethodCalculate.markStartTimeMs("remaining", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
                SnsMethodCalculate.markStartTimeMs("getCurrentTimeMillis", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
                long b = C101426m.m133104b();
                SnsMethodCalculate.markEndTimeMs("getCurrentTimeMillis", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
                if (b >= g0Var.f291784a) {
                    j = g0Var.f291785b - b;
                    SnsMethodCalculate.markEndTimeMs("remaining", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
                } else {
                    j = -1;
                    SnsMethodCalculate.markEndTimeMs("remaining", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
                }
                if (j > 0) {
                    C99538g0.C99540b bVar3 = new C99538g0.C99540b(g0Var, j);
                    g0Var.f291787d = bVar3;
                    bVar3.start();
                }
            }
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            SnsMethodCalculate.markEndTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
        }
        SnsMethodCalculate.markEndTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
    }

    /* renamed from: b */
    public void mo142514b(C102719d dVar) {
        SnsMethodCalculate.markStartTimeMs("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
        if (dVar != null) {
            C102716b bVar = (C102716b) dVar;
            SnsMethodCalculate.markStartTimeMs("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            Log.m105918d("SnsAd.CountDownViewModel", "stopCountDown is called");
            C99538g0 g0Var = bVar.f303336a;
            g0Var.getClass();
            SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            C99538g0.C99540b bVar2 = g0Var.f291787d;
            if (bVar2 != null) {
                bVar2.cancel();
                g0Var.f291787d = null;
            }
            g0Var.f291788e = null;
            SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            SnsMethodCalculate.markEndTimeMs("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            SnsMethodCalculate.markStartTimeMs("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            bVar.f303338c = null;
            SnsMethodCalculate.markEndTimeMs("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
        }
        SnsMethodCalculate.markEndTimeMs("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
    }
}
