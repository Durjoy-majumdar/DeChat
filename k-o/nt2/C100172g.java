package nt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdCardVideoEndView;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import nq2.C100151a;
import nu2.C100205f;
import nu2.C100207g;

/* renamed from: nt2.g */
public class C100172g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C100173h f293463d;

    public C100172g(C100173h hVar) {
        this.f293463d = hVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$1");
        C100173h hVar = this.f293463d;
        hVar.getClass();
        SnsMethodCalculate.markStartTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        try {
            C100151a.C100155d dVar = hVar.f293468s;
            SnsAdCardVideoEndView snsAdCardVideoEndView = dVar.f293369n;
            if (snsAdCardVideoEndView == null) {
                Log.m105924i("MicroMsg.FullCardAdDetailItemNew", "checkShowEndView, viewHolder.videoEndView==null");
                SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$1");
            }
            ADXml.C95018g gVar = hVar.f293465p;
            if (gVar == null || gVar.f275695k == null) {
                snsAdCardVideoEndView.mo134011c(false);
                SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$1");
            }
            if (dVar.f293355K.f293342c) {
                snsAdCardVideoEndView.setBlurBkg(dVar.f293376u.getInnerVideoView());
            } else {
                snsAdCardVideoEndView.setBlurBkg(dVar.f293368m.f280504g.getInnerVideoView());
            }
            hVar.f293468s.f293369n.mo134012d();
            hVar.f293468s.f293369n.mo134013f(true);
            hVar.f293467r = true;
            C100151a.C100155d dVar2 = hVar.f293468s;
            if (!dVar2.f293355K.f293342c) {
                dVar2.f293368m.f280504g.mo132294l(0, false);
            } else if (dVar2.f293376u.getInnerVideoView() instanceof ThumbPlayerVideoView) {
                hVar.f293468s.f293376u.mo132322N(0, false);
                hVar.f293468s.f293376u.mo132317G();
            }
            hVar.f293469t.mo139447h(hVar.f293468s.f293355K.f293342c, true);
            SnsMethodCalculate.markStartTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            C100207g gVar2 = hVar.f293470u;
            if (gVar2 instanceof C100205f) {
                ((C100205f) gVar2).mo139509q(hVar.f293468s);
            }
            SnsMethodCalculate.markEndTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            MMHandlerThread.postToMainThreadDelayed(new C100176i(hVar), (long) hVar.f293465p.f275695k.f281634e);
            SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$1");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FullCardAdDetailItemNew", "handleVideoCompletion, exp" + e.toString());
        }
    }
}
