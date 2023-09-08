package nt2;

import android.app.Activity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import nq2.C100151a;

/* renamed from: nt2.i */
public class C100176i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C100173h f293477d;

    public C100176i(C100173h hVar) {
        this.f293477d = hVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
        C100173h hVar = this.f293477d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        Activity activity = hVar.f293464o;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        if (activity instanceof Activity) {
            C100173h hVar2 = this.f293477d;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            Activity activity2 = hVar2.f293464o;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            if (!activity2.isFinishing()) {
                C100173h.m130905h(this.f293477d).f293369n.mo134011c(true);
                C100173h hVar3 = this.f293477d;
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                hVar3.f293467r = false;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                C100173h hVar4 = this.f293477d;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                boolean z = hVar4.f293473x;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                if (!z) {
                    C100173h hVar5 = this.f293477d;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                    C100151a aVar = hVar5.f293469t;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                    aVar.mo139448i(C100173h.m130905h(this.f293477d).f293355K.f293342c);
                } else {
                    Log.m105920e("MicroMsg.FullCardAdDetailItemNew", "activity isPaused");
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
            }
        }
        Log.m105920e("MicroMsg.FullCardAdDetailItemNew", "onCompletion, postDelayed-run activity isFinished");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
    }
}
