package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.voip.widget.BaseSmallView;
import com.tencent.p014mm.plugin.voip.widget.NewVideoTalkingSmallView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voip/ui/VoipViewFragment;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/voip/widget/BaseSmallView;", "getCurrentView", "", "device", "Lrx3/b0;", "setVoicePlayDevice", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.ui.VoipViewFragment */
public final class VoipViewFragment extends FrameLayout {

    /* renamed from: d */
    public BaseSmallView f317950d;

    /* renamed from: e */
    public BaseSmallView f317951e;

    /* renamed from: f */
    public boolean f317952f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoipViewFragment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final BaseSmallView getCurrentView() {
        return this.f317952f ? this.f317951e : this.f317950d;
    }

    /* renamed from: a */
    public final BaseSmallView mo152986a(boolean z, boolean z2) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator alpha3;
        ViewPropertyAnimator duration3;
        if (z2) {
            if (z) {
                this.f317952f = true;
                BaseSmallView baseSmallView = this.f317950d;
                if (baseSmallView != null) {
                    baseSmallView.setVisibility(0);
                }
                BaseSmallView baseSmallView2 = this.f317951e;
                if (baseSmallView2 != null) {
                    baseSmallView2.setVisibility(0);
                }
                BaseSmallView baseSmallView3 = this.f317951e;
                if (baseSmallView3 != null) {
                    baseSmallView3.setAlpha(0.0f);
                }
                BaseSmallView baseSmallView4 = this.f317950d;
                if (!(baseSmallView4 == null || (animate3 = baseSmallView4.animate()) == null || (alpha3 = animate3.alpha(0.0f)) == null || (duration3 = alpha3.setDuration(300)) == null)) {
                    duration3.start();
                }
                BaseSmallView baseSmallView5 = this.f317951e;
                if (!(baseSmallView5 == null || (animate2 = baseSmallView5.animate()) == null || (alpha2 = animate2.alpha(1.0f)) == null || (duration2 = alpha2.setDuration(300)) == null)) {
                    duration2.start();
                }
            } else {
                this.f317952f = false;
                BaseSmallView baseSmallView6 = this.f317951e;
                if (baseSmallView6 != null) {
                    baseSmallView6.setVisibility(8);
                }
                BaseSmallView baseSmallView7 = this.f317951e;
                if (baseSmallView7 != null) {
                    removeView(baseSmallView7);
                }
                BaseSmallView baseSmallView8 = this.f317950d;
                if (baseSmallView8 != null) {
                    baseSmallView8.setVisibility(0);
                }
                BaseSmallView baseSmallView9 = this.f317950d;
                if (baseSmallView9 != null) {
                    baseSmallView9.setAlpha(0.0f);
                }
                BaseSmallView baseSmallView10 = this.f317950d;
                if (!(baseSmallView10 == null || (animate = baseSmallView10.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(300)) == null)) {
                    duration.start();
                }
            }
        }
        this.f317952f = z;
        if (z) {
            BaseSmallView baseSmallView11 = this.f317951e;
            if (baseSmallView11 != null) {
                baseSmallView11.setVisibility(0);
            }
            return this.f317951e;
        }
        BaseSmallView baseSmallView12 = this.f317950d;
        if (baseSmallView12 != null) {
            baseSmallView12.setVisibility(0);
        }
        return this.f317950d;
    }

    /* renamed from: b */
    public final void mo152987b(boolean z) {
        BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.mo153021c(z);
        }
    }

    /* renamed from: c */
    public final boolean mo152988c() {
        BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            return currentView.mo153022d();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo152989d() {
        BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.mo153026h();
        }
    }

    /* renamed from: e */
    public final void mo152990e(String str) {
        BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.mo153027l(str);
        }
    }

    /* renamed from: f */
    public final void mo152991f(String str) {
        BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.mo153028m(str);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void setVoicePlayDevice(int i) {
        BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.setVoicePlayDevice(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoipViewFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f317951e = new NewVideoTalkingSmallView(MMApplicationContext.getContext());
        C106469p0 p0Var = new C106469p0(MMApplicationContext.getContext());
        this.f317950d = p0Var;
        p0Var.setVisibility(8);
        BaseSmallView baseSmallView = this.f317951e;
        if (baseSmallView != null) {
            baseSmallView.setVisibility(8);
        }
        addView(this.f317950d);
        addView(this.f317951e);
    }
}
