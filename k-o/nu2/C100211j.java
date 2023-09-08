package nu2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adpag.AdPAGFrameContainer;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adpag.C94734a;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adpag.C94735b;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCoverView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr2.C97952a;
import jp2.C98963o;
import kg3.C76577a;
import nq2.C100151a;
import org.libpag.PAGView;
import vr2.C102260r;

/* renamed from: nu2.j */
public class C100211j extends C100198b {

    /* renamed from: k */
    public ShakeCoverView f293615k;

    /* renamed from: l */
    public int f293616l;

    /* renamed from: m */
    public int f293617m;

    /* renamed from: n */
    public ViewGroup f293618n;

    /* renamed from: o */
    public View f293619o;

    /* renamed from: p */
    public int[] f293620p = new int[2];

    /* renamed from: q */
    public int[] f293621q = new int[2];

    /* renamed from: r */
    public int f293622r;

    /* renamed from: s */
    public AdPAGFrameContainer f293623s;

    /* renamed from: t */
    public SnsInfo f293624t;

    /* renamed from: u */
    public boolean f293625u;

    /* renamed from: v */
    public ShakeCoverView.C94772d f293626v = new C100212a();

    /* renamed from: nu2.j$a */
    public class C100212a implements ShakeCoverView.C94772d {
        public C100212a() {
        }

        /* renamed from: a */
        public void mo130195a() {
            SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$1");
            if (C100211j.this.f293579f == null) {
                Log.m105920e("ShakeAdBusiness", "onShake, mSnsInfo==null");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$1");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("ad_no_click_anim", true);
            C100211j.this.mo139500o(bundle);
            C100211j.this.mo139494i();
            C100211j.this.mo139493h(36);
            SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$1");
        }
    }

    /* renamed from: a */
    public void mo139487a(Activity activity, C98963o oVar, TimelineClickListener timelineClickListener, C100151a.C100155d dVar, C100151a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.mo139487a(activity, oVar, timelineClickListener, dVar, aVar);
        if (this.f293615k == null) {
            ViewStub viewStub = (ViewStub) this.f293576c.f293379x.findViewById(C0966R.C0970id.jvo);
            if (viewStub != null) {
                ShakeCoverView shakeCoverView = (ShakeCoverView) viewStub.inflate();
                this.f293615k = shakeCoverView;
                shakeCoverView.setVisibility(0);
                this.f293615k.setOnShakeListener(this.f293626v);
            } else {
                Log.m105920e("ShakeAdBusiness", "coverStub==null");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    /* renamed from: c */
    public void mo139489c() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.mo139489c();
        ShakeCoverView shakeCoverView = this.f293615k;
        if (shakeCoverView != null) {
            shakeCoverView.mo130581c();
        }
        this.f293624t = null;
        AdPAGFrameContainer adPAGFrameContainer = this.f293623s;
        if (adPAGFrameContainer != null) {
            adPAGFrameContainer.mo130432b();
        }
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    /* renamed from: d */
    public void mo139490d(int i, SnsInfo snsInfo, ADXml.C95018g gVar, ViewGroup.LayoutParams layoutParams) {
        ShakeCoverView shakeCoverView;
        SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.mo139490d(i, snsInfo, gVar, layoutParams);
        SnsInfo snsInfo2 = this.f293579f;
        if (!(snsInfo2 == null || (shakeCoverView = this.f293615k) == null)) {
            int i2 = this.f293582i == 0 ? 1 : 2;
            shakeCoverView.getClass();
            SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            if (snsInfo2 == null) {
                SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            } else {
                shakeCoverView.f274485r = i2;
                shakeCoverView.f274480j = snsInfo2;
                C97952a aVar = snsInfo2.getAdXml().adShakeInfo;
                shakeCoverView.f274481n = aVar;
                if (aVar != null) {
                    shakeCoverView.f274475e.setText(aVar.f287306h);
                    shakeCoverView.f274476f.setText(shakeCoverView.f274481n.f287307i);
                }
                if (layoutParams != null) {
                    ViewGroup.LayoutParams layoutParams2 = shakeCoverView.f274474d.getLayoutParams();
                    int i3 = (int) (((double) layoutParams.height) * 0.32d);
                    if (i3 > 0 && layoutParams2.height != i3) {
                        layoutParams2.height = i3;
                        layoutParams2.width = i3;
                        shakeCoverView.f274474d.setLayoutParams(layoutParams2);
                    }
                }
                shakeCoverView.f274483p = false;
                SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            }
            this.f293576c.f293368m.f280504g.setTimerInterval(300);
        }
        if (!C102260r.m134840I(this.f293624t, snsInfo)) {
            if (this.f293623s != null) {
                SnsMethodCalculate.markStartTimeMs("resizeBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                try {
                    if (this.f293582i == 0) {
                        Log.m105918d("ShakeAdBusiness", "resizeBreakFrameContainer, hasSetListener=" + this.f293625u + ", hash=" + hashCode());
                        if (!this.f293625u) {
                            this.f293576c.f293379x.getViewTreeObserver().addOnPreDrawListener(new C100213k(this));
                            this.f293625u = true;
                        }
                    }
                } catch (Throwable th) {
                    Log.m105920e("ShakeAdBusiness", "resizeBreakFrameContainer, exp is " + th);
                }
                SnsMethodCalculate.markEndTimeMs("resizeBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                this.f293623s.mo130432b();
                this.f293623s.setSnsId(snsInfo.field_snsId);
                this.f293623s.setEventListenerEnabled(true);
            }
            this.f293624t = snsInfo;
        }
        SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    /* renamed from: f */
    public void mo139492f() {
        SnsMethodCalculate.markStartTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.mo139492f();
        ShakeCoverView shakeCoverView = this.f293615k;
        if (shakeCoverView != null) {
            shakeCoverView.mo130580b(0);
        }
        SnsMethodCalculate.markEndTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    /* renamed from: g */
    public void mo139502g(long j, int i) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        if (this.f293575b == null || this.f293579f == null) {
            SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        ShakeCoverView shakeCoverView = this.f293615k;
        if (shakeCoverView != null) {
            shakeCoverView.mo130580b(j);
        }
        mo139514s(true);
        SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    /* renamed from: k */
    public boolean mo139496k() {
        SnsMethodCalculate.markStartTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        SnsMethodCalculate.markEndTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return true;
    }

    /* renamed from: l */
    public void mo139497l(FrameLayout frameLayout) {
        SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.mo139497l(frameLayout);
        try {
            this.f293616l = C76577a.m92151b(this.f293574a, 100);
            this.f293617m = C76577a.m92151b(this.f293574a, 200);
            mo139513r();
        } catch (Throwable th) {
            Log.m105920e("ShakeAdBusiness", "onBreakFrameContainerInflated exp is " + th);
        }
        SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    /* renamed from: m */
    public void mo139498m(FrameLayout frameLayout, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.mo139498m(frameLayout, i, i2);
        if (this.f293622r <= 0) {
            Log.m105920e("ShakeAdBusiness", "onBreakFrameContainerSizeCalcFinish but interactionLabelTitleView height <= 0");
            SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        try {
            int[] q = mo139512q();
            AdPAGFrameContainer adPAGFrameContainer = this.f293623s;
            if (adPAGFrameContainer == null || adPAGFrameContainer.getParent() != null) {
                AdPAGFrameContainer adPAGFrameContainer2 = this.f293623s;
                if (!(adPAGFrameContainer2 == null || adPAGFrameContainer2.getParent() == null)) {
                    ViewGroup.LayoutParams layoutParams = this.f293623s.getLayoutParams();
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.width = this.f293616l;
                        layoutParams2.height = this.f293617m;
                        layoutParams2.leftMargin = q[0];
                        layoutParams2.topMargin = q[1];
                        this.f293623s.setLayoutParams(layoutParams2);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            }
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.f293616l, this.f293617m);
            layoutParams3.leftMargin = q[0];
            layoutParams3.topMargin = q[1];
            frameLayout.addView(this.f293623s, layoutParams3);
            SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        } catch (Throwable th) {
            Log.m105920e("ShakeAdBusiness", "onBreakFrameContainerSizeCalcFinish exp is " + th);
        }
    }

    /* renamed from: n */
    public void mo139499n(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.mo139499n(i, i2);
        try {
            if (this.f293618n == null) {
                this.f293618n = (ViewGroup) this.f293576c.f293377v.findViewById(C0966R.C0970id.jpz);
            }
            if (this.f293618n == null) {
                Log.m105920e("ShakeAdBusiness", "onContentPreDraw but mInteractionLabelViewGroup is null");
                SnsMethodCalculate.markEndTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                return;
            }
            int[] iArr = new int[2];
            this.f293621q = iArr;
            this.f293576c.f293377v.getLocationOnScreen(iArr);
            if (this.f293619o == null) {
                this.f293619o = this.f293618n.findViewById(C0966R.C0970id.knx);
            }
            View view = this.f293619o;
            if (view != null) {
                int[] iArr2 = new int[2];
                this.f293620p = iArr2;
                view.getLocationOnScreen(iArr2);
                this.f293622r = this.f293619o.getHeight();
                Log.m105924i("ShakeAdBusiness", "shake title x is " + this.f293620p[0] + ", y is " + this.f293620p[1] + ", titleView height is " + this.f293622r + ", itemRootView y is " + this.f293621q[1]);
            } else {
                Log.m105920e("ShakeAdBusiness", "onContentPreDraw but mInteractionLabelTitleView is null");
            }
            SnsMethodCalculate.markEndTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        } catch (Throwable th) {
            Log.m105920e("ShakeAdBusiness", "onContentPreDraw exp is " + th);
        }
    }

    public void onVideoPause() {
        ShakeCoverView shakeCoverView;
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.onVideoPause();
        if (!(this.f293579f == null || (shakeCoverView = this.f293615k) == null)) {
            shakeCoverView.mo130582d();
        }
        mo139514s(false);
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    /* renamed from: p */
    public final boolean mo139511p(Activity activity) {
        int i;
        SnsMethodCalculate.markStartTimeMs("checkListScrollState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        boolean z = true;
        if (activity instanceof SnsTimeLineUI) {
            SnsTimeLineUI snsTimeLineUI = (SnsTimeLineUI) this.f293574a;
            snsTimeLineUI.getClass();
            SnsMethodCalculate.markStartTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            i = snsTimeLineUI.f278665X0;
            SnsMethodCalculate.markEndTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else if (activity instanceof SnsCommentDetailUI) {
            SnsCommentDetailUI snsCommentDetailUI = (SnsCommentDetailUI) this.f293574a;
            snsCommentDetailUI.getClass();
            SnsMethodCalculate.markStartTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            i = snsCommentDetailUI.f277880f1;
            SnsMethodCalculate.markEndTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else if (activity instanceof ImproveSnsTimelineUI) {
            ImproveMainUIC improveMainUIC = (ImproveMainUIC) C39818r.f106831a.mo62444c((ImproveSnsTimelineUI) this.f293574a).mo75002a(ImproveMainUIC.class);
            improveMainUIC.getClass();
            SnsMethodCalculate.markStartTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            int i2 = improveMainUIC.f279676g;
            SnsMethodCalculate.markEndTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            if (i2 != 0) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("checkListScrollState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return z;
        } else {
            i = -1;
        }
        if (i != 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("checkListScrollState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return z;
    }

    /* renamed from: q */
    public final int[] mo139512q() {
        SnsMethodCalculate.markStartTimeMs("getPAGViewMargins", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        int[] iArr = this.f293620p;
        int[] iArr2 = {iArr[0] - this.f293616l, ((iArr[1] + this.f293622r) - this.f293621q[1]) - this.f293617m};
        SnsMethodCalculate.markEndTimeMs("getPAGViewMargins", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return iArr2;
    }

    /* renamed from: r */
    public final void mo139513r() {
        SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        AdPAGFrameContainer adPAGFrameContainer = new AdPAGFrameContainer(this.f293574a);
        this.f293623s = adPAGFrameContainer;
        SnsMethodCalculate.markStartTimeMs("initThumbView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            adPAGFrameContainer.f274216e = new ImageView(adPAGFrameContainer.getContext());
            adPAGFrameContainer.addView(adPAGFrameContainer.f274216e, new FrameLayout.LayoutParams(-1, -1));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("initThumbView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        AdPAGFrameContainer adPAGFrameContainer2 = this.f293623s;
        adPAGFrameContainer2.getClass();
        SnsMethodCalculate.markStartTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            adPAGFrameContainer2.f274215d = new PAGView(adPAGFrameContainer2.getContext());
            adPAGFrameContainer2.addView(adPAGFrameContainer2.f274215d, new FrameLayout.LayoutParams(-1, -1));
        } catch (Throwable unused2) {
        }
        SnsMethodCalculate.markEndTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        AdPAGFrameContainer adPAGFrameContainer3 = this.f293623s;
        adPAGFrameContainer3.getClass();
        SnsMethodCalculate.markStartTimeMs("initThumbData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            ImageView imageView = adPAGFrameContainer3.f274216e;
            if (imageView != null) {
                imageView.setImageDrawable(adPAGFrameContainer3.getContext().getResources().getDrawable(C0966R.C0969drawable.cou));
            }
        } catch (Throwable unused3) {
        }
        SnsMethodCalculate.markEndTimeMs("initThumbData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        AdPAGFrameContainer adPAGFrameContainer4 = this.f293623s;
        adPAGFrameContainer4.getClass();
        SnsMethodCalculate.markStartTimeMs("initPAGData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        PAGView pAGView = adPAGFrameContainer4.f274215d;
        if (pAGView != null) {
            pAGView.setPath("assets://sns/sna_ad_shake_attract_anim.pag");
            adPAGFrameContainer4.f274215d.setScaleMode(3);
            adPAGFrameContainer4.f274215d.setRepeatCount(0);
        }
        SnsMethodCalculate.markEndTimeMs("initPAGData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    /* renamed from: s */
    public final void mo139514s(boolean z) {
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        AdPAGFrameContainer adPAGFrameContainer = this.f293623s;
        if (adPAGFrameContainer == null) {
            SnsMethodCalculate.markEndTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        boolean z3 = false;
        if (z) {
            try {
                if (!mo139511p(this.f293574a)) {
                    SnsMethodCalculate.markEndTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                    return;
                } else if (!this.f293623s.isAttachedToWindow()) {
                    Log.m105920e("ShakeAdBusiness", "notifyPAGStatus, isVideoPlaying is true but mAdPAGFrameContainer is onDetachedFromWindow");
                    SnsMethodCalculate.markEndTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                    return;
                } else {
                    AdPAGFrameContainer adPAGFrameContainer2 = this.f293623s;
                    adPAGFrameContainer2.getClass();
                    SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    PAGView pAGView = adPAGFrameContainer2.f274215d;
                    if (pAGView != null) {
                        z2 = pAGView.isPlaying();
                        SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    } else {
                        SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                        z2 = false;
                    }
                    if (!z2) {
                        AdPAGFrameContainer adPAGFrameContainer3 = this.f293623s;
                        adPAGFrameContainer3.getClass();
                        SnsMethodCalculate.markStartTimeMs("isReset", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                        boolean z4 = adPAGFrameContainer3.f274217f;
                        SnsMethodCalculate.markEndTimeMs("isReset", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                        if (z4) {
                            this.f293623s.mo130433c();
                        } else {
                            AdPAGFrameContainer adPAGFrameContainer4 = this.f293623s;
                            adPAGFrameContainer4.getClass();
                            SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                            PAGView pAGView2 = adPAGFrameContainer4.f274215d;
                            if (pAGView2 != null) {
                                pAGView2.setVisibility(0);
                                adPAGFrameContainer4.f274215d.post(new C94734a(adPAGFrameContainer4));
                                adPAGFrameContainer4.f274217f = false;
                                Log.m105924i("AdPAGFrameContainer", "resume");
                            }
                            SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("ShakeAdBusiness", "notifyPAGPlayingStatus exp is " + th);
            }
        } else {
            SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            PAGView pAGView3 = adPAGFrameContainer.f274215d;
            if (pAGView3 != null) {
                z3 = pAGView3.isPlaying();
                SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            } else {
                SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
            if (z3) {
                AdPAGFrameContainer adPAGFrameContainer5 = this.f293623s;
                adPAGFrameContainer5.getClass();
                SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                PAGView pAGView4 = adPAGFrameContainer5.f274215d;
                if (pAGView4 != null) {
                    pAGView4.post(new C94735b(adPAGFrameContainer5));
                    Log.m105924i("AdPAGFrameContainer", "stop");
                }
                SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }
}
