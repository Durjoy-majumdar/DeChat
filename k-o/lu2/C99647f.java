package lu2;

import com.tencent.p014mm.plugin.sns.p106ui.item.C95917e;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95923f;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import nq2.C100151a;

/* renamed from: lu2.f */
public class C99647f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ADXml.C95018g f292051d;

    /* renamed from: e */
    public final /* synthetic */ C95917e f292052e;

    public C99647f(C95917e eVar, ADXml.C95018g gVar) {
        this.f292052e = eVar;
        this.f292051d = gVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$5");
        C95917e eVar = this.f292052e;
        ADXml.C95018g gVar = this.f292051d;
        eVar.getClass();
        SnsMethodCalculate.markStartTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        try {
            if (eVar.f280066r.f280077F0.f293369n == null) {
                Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "checkShowEndView, videoEndView==null");
                SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$5");
            }
            if (gVar != null) {
                if (gVar.f275695k != null && eVar.f280067s) {
                    C100151a.C100155d dVar = eVar.f280066r.f280077F0;
                    if (dVar.f293355K.f293342c) {
                        dVar.f293369n.setBlurBkg(dVar.f293376u.getInnerVideoView());
                    } else {
                        dVar.f293369n.setBlurBkg(dVar.f293368m.f280504g.getInnerVideoView());
                    }
                    eVar.f280066r.f280077F0.f293369n.mo134012d();
                    eVar.f280066r.f280077F0.f293369n.mo134013f(true);
                    eVar.f280068t = true;
                    C95917e.C95922e eVar2 = eVar.f280066r;
                    C100151a.C100155d dVar2 = eVar2.f280077F0;
                    if (!dVar2.f293355K.f293342c) {
                        eVar2.f279953e0.f280504g.mo132294l(0, false);
                    } else if (dVar2.f293376u.getInnerVideoView() instanceof ThumbPlayerVideoView) {
                        eVar.f280066r.f280077F0.f293376u.mo132322N(0, false);
                        eVar.f280066r.f280077F0.f293376u.mo132317G();
                    }
                    eVar.f280071w.mo139447h(eVar.f280066r.f280077F0.f293355K.f293342c, true);
                    eVar.mo133428D();
                    eVar.f280065q.postDelayed(new C95923f(eVar), (long) gVar.f275695k.f281634e);
                    SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$5");
                }
            }
            eVar.f280066r.f280077F0.f293369n.mo134011c(false);
            SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$5");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FullCardAdTimeLineItemNew", "handleVideoCompletion, exp" + e.toString());
        }
    }
}
