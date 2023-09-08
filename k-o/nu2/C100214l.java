package nu2;

import android.app.Activity;
import android.os.Message;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistCoverView;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import jp2.C98963o;
import no2.C100143a;
import no2.C100149d;
import nq2.C100151a;
import vr2.C102236a0;

/* renamed from: nu2.l */
public class C100214l extends C100198b {

    /* renamed from: k */
    public TwistCoverView f293629k;

    /* renamed from: l */
    public TwistCoverView.C94789d f293630l = new C100215a();

    /* renamed from: nu2.l$a */
    public class C100215a implements TwistCoverView.C94789d {
        public C100215a() {
        }
    }

    /* renamed from: a */
    public void mo139487a(Activity activity, C98963o oVar, TimelineClickListener timelineClickListener, C100151a.C100155d dVar, C100151a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        super.mo139487a(activity, oVar, timelineClickListener, dVar, aVar);
        if (this.f293629k == null) {
            ViewStub viewStub = (ViewStub) dVar.f293379x.findViewById(C0966R.C0970id.jww);
            if (viewStub != null) {
                this.f293629k = (TwistCoverView) viewStub.inflate();
            } else {
                Log.m105920e("TwistAdBusiness", "coverStub==null");
            }
        }
        TwistCoverView twistCoverView = this.f293629k;
        if (twistCoverView != null) {
            twistCoverView.setTwistActionListener(this.f293630l);
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }

    /* renamed from: c */
    public void mo139489c() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        super.mo139489c();
        TwistCoverView twistCoverView = this.f293629k;
        if (twistCoverView != null) {
            twistCoverView.setSensorEnabled(false);
        }
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }

    /* renamed from: d */
    public void mo139490d(int i, SnsInfo snsInfo, ADXml.C95018g gVar, ViewGroup.LayoutParams layoutParams) {
        TwistCoverView twistCoverView;
        SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        super.mo139490d(i, snsInfo, gVar, layoutParams);
        SnsInfo snsInfo2 = this.f293579f;
        if (!(snsInfo2 == null || (twistCoverView = this.f293629k) == null)) {
            boolean z = true;
            int i2 = this.f293576c.f293355K.f293340a == 0 ? 1 : 2;
            ADXml.C95024k kVar = snsInfo2.getAdXml().adTwistInfo;
            twistCoverView.getClass();
            SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            twistCoverView.f274554i = kVar;
            twistCoverView.f274553h = snsInfo2;
            twistCoverView.f274561s = i2;
            if (!(twistCoverView.f274554i == null || snsInfo2 == null)) {
                Log.m105924i("TwistCoverView", "initData, id=" + C102236a0.m134765q0(snsInfo2.field_snsId) + ", twistInfo=" + twistCoverView.f274554i + ", scene=" + i2);
                twistCoverView.getContext();
                SnsMethodCalculate.markStartTimeMs("initSensor", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                if (twistCoverView.f274555j == null) {
                    C100149d dVar = new C100149d();
                    twistCoverView.f274555j = dVar;
                    C100143a.C100144a aVar = twistCoverView.f274547A;
                    SnsMethodCalculate.markStartTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
                    C100143a aVar2 = dVar.f293325a;
                    if (aVar2 != null) {
                        aVar2.mo139430a(aVar);
                    }
                    SnsMethodCalculate.markEndTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
                    C100149d dVar2 = twistCoverView.f274555j;
                    dVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("isSensorSupported", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
                    if (dVar2.f293325a == null) {
                        z = false;
                    }
                    SnsMethodCalculate.markEndTimeMs("isSensorSupported", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
                    twistCoverView.f274566x = z;
                    Log.m105924i("TwistCoverView", "initSensor, isSensorOk=" + twistCoverView.f274566x);
                }
                SnsMethodCalculate.markEndTimeMs("initSensor", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            }
            SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            this.f293576c.f293368m.f280504g.setTimerInterval(300);
        }
        SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }

    /* renamed from: g */
    public void mo139502g(long j, int i) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        if (this.f293575b == null || this.f293579f == null) {
            SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
            return;
        }
        TwistCoverView twistCoverView = this.f293629k;
        if (twistCoverView != null) {
            twistCoverView.getClass();
            SnsMethodCalculate.markStartTimeMs("checkShow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            Log.m105918d("TwistCoverView", "checkShow:" + j);
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.arg1 = (int) j;
            twistCoverView.f274567y.removeMessages(1);
            twistCoverView.f274567y.sendMessageDelayed(obtain, 50);
            SnsMethodCalculate.markEndTimeMs("checkShow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }

    public void onVideoPause() {
        TwistCoverView twistCoverView;
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
        super.onVideoPause();
        if (!(this.f293579f == null || (twistCoverView = this.f293629k) == null)) {
            twistCoverView.getClass();
            SnsMethodCalculate.markStartTimeMs("onPlayerPaused", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            if (twistCoverView.f274554i == null) {
                SnsMethodCalculate.markEndTimeMs("onPlayerPaused", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            } else {
                Log.m105924i("TwistCoverView", "onPlayerPaused");
                twistCoverView.f274559q = true;
                twistCoverView.setSensorEnabled(false);
                twistCoverView.mo130629f();
                twistCoverView.f274567y.removeMessages(1);
                SnsMethodCalculate.markEndTimeMs("onPlayerPaused", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
    }
}
