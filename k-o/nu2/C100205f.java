package nu2;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsDrawGestureView;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import jp2.C98963o;
import nq2.C100151a;

/* renamed from: nu2.f */
public class C100205f extends C100198b {

    /* renamed from: k */
    public SnsDrawGestureView f293607k;

    /* renamed from: nu2.f$a */
    public class C100206a implements Runnable {
        public C100206a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$2");
            if (C100205f.m131001p(C100205f.this) == null) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$2");
                return;
            }
            C100205f.m131001p(C100205f.this).setVisibility(8);
            C100205f.m131001p(C100205f.this).setBackgroundColor(0);
            C100205f.m131001p(C100205f.this).mo134093a();
            C100205f.m131001p(C100205f.this).setOnGestureListener((SnsDrawGestureView.C96301a) null);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$2");
        }
    }

    /* renamed from: p */
    public static /* synthetic */ SnsDrawGestureView m131001p(C100205f fVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        SnsDrawGestureView snsDrawGestureView = fVar.f293607k;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        return snsDrawGestureView;
    }

    /* renamed from: a */
    public void mo139487a(Activity activity, C98963o oVar, TimelineClickListener timelineClickListener, C100151a.C100155d dVar, C100151a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        super.mo139487a(activity, oVar, timelineClickListener, dVar, aVar);
        if (this.f293607k == null) {
            ViewStub viewStub = (ViewStub) dVar.f293379x.findViewById(C0966R.C0970id.jwx);
            if (viewStub != null) {
                this.f293607k = (SnsDrawGestureView) viewStub.inflate();
            } else {
                Log.m105920e("GestureAdBusiness", "coverStub==null");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }

    /* renamed from: d */
    public void mo139490d(int i, SnsInfo snsInfo, ADXml.C95018g gVar, ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        super.mo139490d(i, snsInfo, gVar, layoutParams);
        mo139509q(this.f293576c);
        SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }

    /* renamed from: g */
    public void mo139502g(long j, int i) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        C100151a.C100155d dVar = this.f293576c;
        ADXml.C95018g gVar = this.f293581h;
        SnsInfo snsInfo = this.f293579f;
        int i2 = (int) j;
        SnsMethodCalculate.markStartTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        ADXml.C95018g.C95019a aVar = gVar == null ? null : gVar.f275690f;
        if (aVar != null) {
            long j2 = aVar.f275698a;
            if (j2 >= 0 && aVar.f275699b > j2) {
                Log.m105925i("GestureAdBusiness", "%d-%d,%d", Long.valueOf(j2), Long.valueOf(aVar.f275699b), Integer.valueOf(i2));
                long j3 = (long) i2;
                if (aVar.f275698a > j3 || aVar.f275699b < j3) {
                    mo139509q(dVar);
                } else {
                    SnsDrawGestureView snsDrawGestureView = this.f293607k;
                    if (snsDrawGestureView != null && snsDrawGestureView.getOnGestureListener() == null) {
                        SnsMethodCalculate.markStartTimeMs("enableGestrureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
                        MMHandlerThread.postToMainThread(new C100203e(this, snsInfo, aVar, dVar));
                        SnsMethodCalculate.markEndTimeMs("enableGestrureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }

    /* renamed from: q */
    public void mo139509q(C100151a.C100155d dVar) {
        SnsMethodCalculate.markStartTimeMs("disableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
        MMHandlerThread.postToMainThread(new C100206a());
        SnsMethodCalculate.markEndTimeMs("disableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness");
    }
}
