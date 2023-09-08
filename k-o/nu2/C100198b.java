package nu2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p104ad.widget.dragad.AdLinearLayout;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import jp2.C98963o;
import nq2.C100151a;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: nu2.b */
public abstract class C100198b implements C100207g {

    /* renamed from: a */
    public Activity f293574a;

    /* renamed from: b */
    public C98963o f293575b;

    /* renamed from: c */
    public C100151a.C100155d f293576c;

    /* renamed from: d */
    public C100151a f293577d;

    /* renamed from: e */
    public TimelineClickListener f293578e;

    /* renamed from: f */
    public SnsInfo f293579f;

    /* renamed from: g */
    public String f293580g;

    /* renamed from: h */
    public ADXml.C95018g f293581h;

    /* renamed from: i */
    public int f293582i;

    /* renamed from: j */
    public FrameLayout f293583j;

    /* renamed from: a */
    public void mo139487a(Activity activity, C98963o oVar, TimelineClickListener timelineClickListener, C100151a.C100155d dVar, C100151a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        this.f293574a = activity;
        this.f293578e = timelineClickListener;
        this.f293575b = oVar;
        this.f293576c = dVar;
        this.f293582i = dVar.f293355K.f293340a;
        this.f293577d = aVar;
        Log.m105918d("BaseFullCardAdBusiness", "onCreate, source=" + this.f293582i);
        if (mo139496k()) {
            C100151a.C100155d dVar2 = this.f293576c;
            SnsMethodCalculate.markStartTimeMs("initBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
            Log.m105924i("BaseFullCardAdBusiness", "initBreakFrameContainer, hash=" + hashCode());
            if (mo139495j()) {
                ViewStub viewStub = (ViewStub) dVar2.f293377v.findViewById(C0966R.C0970id.npr);
                if (viewStub == null || this.f293583j != null) {
                    Log.m105920e("BaseFullCardAdBusiness", "onCreate, no fullFrameContainerStub in timeline");
                } else {
                    FrameLayout frameLayout = (FrameLayout) viewStub.inflate();
                    this.f293583j = frameLayout;
                    frameLayout.setVisibility(0);
                }
            } else {
                View view = dVar2.f293377v;
                if (view instanceof AdLinearLayout) {
                    FrameLayout frameLayout2 = new FrameLayout(this.f293574a);
                    this.f293583j = frameLayout2;
                    ((AdLinearLayout) view).setAdFullFrameContainer(frameLayout2);
                } else {
                    Log.m105920e("BaseFullCardAdBusiness", "onCreate, no AdLinearLayout in detail");
                }
            }
            FrameLayout frameLayout3 = this.f293583j;
            if (frameLayout3 != null) {
                mo139497l(frameLayout3);
            }
            dVar2.f293379x.getViewTreeObserver().addOnPreDrawListener(new C100197a(this, dVar2));
            SnsMethodCalculate.markEndTimeMs("initBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: b */
    public void mo139488b() {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        Log.m105918d("BaseFullCardAdBusiness", "onAdRemoved, snsId=" + this.f293580g);
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: c */
    public void mo139489c() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        Log.m105918d("BaseFullCardAdBusiness", "onUIDestroy, snsId=" + this.f293580g);
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: d */
    public void mo139490d(int i, SnsInfo snsInfo, ADXml.C95018g gVar, ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        this.f293579f = snsInfo;
        this.f293580g = snsInfo != null ? C102236a0.m134765q0(snsInfo.field_snsId) : "";
        this.f293581h = gVar;
        Log.m105918d("BaseFullCardAdBusiness", "onRefresh, snsId=" + this.f293580g);
        SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: e */
    public void mo139491e() {
        SnsMethodCalculate.markStartTimeMs("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        Log.m105918d("BaseFullCardAdBusiness", "onVideoStart, snsId=" + this.f293580g);
        SnsMethodCalculate.markEndTimeMs("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: f */
    public void mo139492f() {
        SnsMethodCalculate.markStartTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        SnsMethodCalculate.markEndTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: h */
    public void mo139493h(int i) {
        SnsInfo snsInfo;
        SnsMethodCalculate.markStartTimeMs("doEggClickReport", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        Log.m105924i("BaseFullCardAdBusiness", "doEggClickReport, clickPos=" + i + ", source=" + this.f293582i);
        if (this.f293575b == null || (snsInfo = this.f293579f) == null) {
            Log.m105920e("BaseFullCardAdBusiness", "doEggClickReport err, param==null");
            SnsMethodCalculate.markEndTimeMs("doEggClickReport", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
            return;
        }
        try {
            int i2 = this.f293582i;
            SnsAdClick snsAdClick = new SnsAdClick(i2, i2 == 0 ? 1 : 2, snsInfo.field_snsId, i, 21);
            C102260r.m134864d(snsAdClick, this.f293575b, this.f293579f, i);
            C102236a0.m134773u0(snsAdClick);
        } catch (Throwable th) {
            Log.m105924i("BaseFullCardAdBusiness", "doEggClickReport, clickPos=" + i + ", source=" + this.f293582i + ", exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doEggClickReport", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: i */
    public void mo139494i() {
        SnsInfo snsInfo;
        SnsMethodCalculate.markStartTimeMs("doOpenNativeEggLandingPage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        Log.m105924i("BaseFullCardAdBusiness", "doOpenNativeEggLandingPage, source=" + this.f293582i);
        Activity activity = this.f293574a;
        if (activity == null || (snsInfo = this.f293579f) == null) {
            Log.m105920e("BaseFullCardAdBusiness", "doOpenNativeEggLandingPage err, param==null");
            SnsMethodCalculate.markEndTimeMs("doOpenNativeEggLandingPage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
            return;
        }
        try {
            int i = this.f293582i;
            int i2 = 2;
            if (i == 2) {
                i2 = 16;
            } else if (i != 1) {
                i2 = 1;
            }
            C102260r.m134850S(activity, this.f293576c.f293379x, snsInfo, i2);
        } catch (Throwable th) {
            Log.m105920e("BaseFullCardAdBusiness", "doOpenNativeEggLandingPage exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doOpenNativeEggLandingPage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: j */
    public boolean mo139495j() {
        SnsMethodCalculate.markStartTimeMs("isFromTimeline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        boolean z = this.f293576c.f293355K.f293340a == 0;
        SnsMethodCalculate.markEndTimeMs("isFromTimeline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        return z;
    }

    /* renamed from: k */
    public boolean mo139496k() {
        SnsMethodCalculate.markStartTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        SnsMethodCalculate.markEndTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        return false;
    }

    /* renamed from: l */
    public void mo139497l(FrameLayout frameLayout) {
        SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: m */
    public void mo139498m(FrameLayout frameLayout, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: n */
    public void mo139499n(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        SnsMethodCalculate.markEndTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    /* renamed from: o */
    public void mo139500o(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        TimelineClickListener timelineClickListener = this.f293578e;
        if (timelineClickListener != null) {
            timelineClickListener.mo133539B(this.f293576c, bundle);
        }
        SnsMethodCalculate.markEndTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void onVideoPause() {
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        Log.m105918d("BaseFullCardAdBusiness", "onVideoPause, snsId=" + this.f293580g);
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }
}
