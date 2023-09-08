package nu2;

import android.graphics.PointF;
import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsDrawGestureView;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import lo2.C99568r0;
import nq2.C100151a;
import vr2.C102236a0;

/* renamed from: nu2.e */
public class C100203e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f293602d;

    /* renamed from: e */
    public final /* synthetic */ ADXml.C95018g.C95019a f293603e;

    /* renamed from: f */
    public final /* synthetic */ C100151a.C100155d f293604f;

    /* renamed from: g */
    public final /* synthetic */ C100205f f293605g;

    /* renamed from: nu2.e$a */
    public class C100204a implements SnsDrawGestureView.C96301a {
        public C100204a() {
        }

        /* renamed from: a */
        public void mo139508a(List<PointF> list) {
            SnsMethodCalculate.markStartTimeMs("onGestureEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
            C102236a0.m134764q(true);
            C100205f.m131001p(C100203e.this.f293605g).setBackgroundColor(0);
            if (list.size() > 0) {
                try {
                    C100203e eVar = C100203e.this;
                    int i = eVar.f293605g.f293582i == 0 ? 1 : 2;
                    boolean a = C99568r0.m129955a(eVar.f293602d, list, eVar.f293603e, i);
                    Log.m105924i("GestureAdBusiness", "confirmOpenGestureLandingPage=" + a + ", scene=" + i);
                    if (a) {
                        C100203e.this.f293605g.mo139500o((Bundle) null);
                        C102236a0.m134708C0(new long[]{20, 100});
                        C100203e.this.f293605g.mo139494i();
                        C100203e.this.f293605g.mo139493h(25);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("GestureAdBusiness", e, "recog gesture error!", new Object[0]);
                } catch (Throwable th) {
                    C100205f.m131001p(C100203e.this.f293605g).mo134093a();
                    SnsMethodCalculate.markEndTimeMs("onGestureEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
                    throw th;
                }
                C100205f.m131001p(C100203e.this.f293605g).mo134093a();
            }
            SnsMethodCalculate.markEndTimeMs("onGestureEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
        }
    }

    public C100203e(C100205f fVar, SnsInfo snsInfo, ADXml.C95018g.C95019a aVar, C100151a.C100155d dVar) {
        this.f293605g = fVar;
        this.f293602d = snsInfo;
        this.f293603e = aVar;
        this.f293604f = dVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1");
        if (C100205f.m131001p(this.f293605g) == null || this.f293602d == null) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1");
            return;
        }
        C100205f.m131001p(this.f293605g).setVisibility(0);
        C100205f.m131001p(this.f293605g).mo134093a();
        C100205f.m131001p(this.f293605g).setPaintColor(this.f293603e.f275701d);
        C100205f.m131001p(this.f293605g).setOnGestureListener(new C100204a());
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1");
    }
}
