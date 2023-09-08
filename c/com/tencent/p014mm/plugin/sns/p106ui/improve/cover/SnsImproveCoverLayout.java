package com.tencent.p014mm.plugin.sns.p106ui.improve.cover;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bu2.C39843b;
import bu2.C92310a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.feature.sns.api.ICoverStatusChanged;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB#\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001b\u0010\f\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/cover/SnsImproveCoverLayout;", "Landroid/widget/FrameLayout;", "", "getStagePercent", "", "height", "Lrx3/b0;", "setHeight", "d", "Lrx3/g;", "getFoldHeight", "()I", "foldHeight", "Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;", "f", "Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;", "getStatusChangedCallback", "()Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;", "setStatusChangedCallback", "(Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;)V", "statusChangedCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout */
public final class SnsImproveCoverLayout extends FrameLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f279805g = 0;

    /* renamed from: d */
    public final C13601g f279806d = C36568h.m40985a(new C39843b(this));

    /* renamed from: e */
    public int f279807e = 1;

    /* renamed from: f */
    public ICoverStatusChanged f279808f;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$a */
    public static final class C95874a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ int f279809d;

        /* renamed from: e */
        public final /* synthetic */ SnsImproveCoverLayout f279810e;

        public C95874a(int i, SnsImproveCoverLayout snsImproveCoverLayout) {
            this.f279809d = i;
            this.f279810e = snsImproveCoverLayout;
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
            Log.m105918d("MicroMsg.Improve.CoverLayout", "onAnimationCancel: newStage:" + this.f279809d);
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
            SnsImproveCoverLayout snsImproveCoverLayout = this.f279810e;
            int i = this.f279809d;
            int i2 = SnsImproveCoverLayout.f279805g;
            SnsMethodCalculate.markStartTimeMs("access$setStage$p", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
            snsImproveCoverLayout.f279807e = i;
            SnsMethodCalculate.markEndTimeMs("access$setStage$p", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
            Log.m105918d("MicroMsg.Improve.CoverLayout", "onAnimationEnd: newStage:" + this.f279809d);
            if (this.f279809d == 2) {
                ICoverStatusChanged statusChangedCallback = this.f279810e.getStatusChangedCallback();
                if (statusChangedCallback != null) {
                    statusChangedCallback.onPostOpen();
                }
            } else {
                ICoverStatusChanged statusChangedCallback2 = this.f279810e.getStatusChangedCallback();
                if (statusChangedCallback2 != null) {
                    statusChangedCallback2.onPostClose();
                }
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
            Log.m105918d("MicroMsg.Improve.CoverLayout", "onAnimationStart: newStage:" + this.f279809d);
            if (this.f279809d == 2) {
                ICoverStatusChanged statusChangedCallback = this.f279810e.getStatusChangedCallback();
                if (statusChangedCallback != null) {
                    statusChangedCallback.onPreOpen();
                }
            } else {
                ICoverStatusChanged statusChangedCallback2 = this.f279810e.getStatusChangedCallback();
                if (statusChangedCallback2 != null) {
                    statusChangedCallback2.onPreClose();
                }
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$updateViewHeight$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsImproveCoverLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setOnClickListener(new C92310a(this));
    }

    private final int getFoldHeight() {
        SnsMethodCalculate.markStartTimeMs("getFoldHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int intValue = ((Number) this.f279806d.getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getFoldHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return intValue;
    }

    /* renamed from: a */
    public final int mo133331a() {
        SnsMethodCalculate.markStartTimeMs("calculateExpandHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int f = C76577a.m92155f(getContext(), C0966R.dimen.f3761db);
        int width = (int) (((float) getWidth()) * 1.7777778f);
        int j = (C76577a.m92159j(getContext()) - C75044y4.m89991c(getContext())) - f;
        if (width > j) {
            width = j;
        }
        int foldHeight = getFoldHeight() + C76577a.m92155f(getContext(), C0966R.dimen.f3722cc);
        if (width < foldHeight) {
            width = foldHeight;
        }
        Log.m105924i("MicroMsg.Improve.CoverLayout", "backViewHeight=" + width + ", maxHeight=" + j + ", viewHeight=" + getHeight());
        SnsMethodCalculate.markEndTimeMs("calculateExpandHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return width;
    }

    public void addView(View view) {
        SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int a = mo133331a();
        Log.m105924i("MicroMsg.Improve.CoverLayout", "addView: height=" + a);
        addView(view, new FrameLayout.LayoutParams(-1, a));
        SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    /* renamed from: b */
    public final synchronized void mo133333b() {
        SnsMethodCalculate.markStartTimeMs("changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int i = this.f279807e;
        if (i == 1) {
            mo133335d(mo133331a(), 2);
            SnsMethodCalculate.markEndTimeMs("changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        } else if (i != 2) {
            SnsMethodCalculate.markEndTimeMs("changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        } else {
            mo133335d(getFoldHeight(), 1);
            SnsMethodCalculate.markEndTimeMs("changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        }
    }

    /* renamed from: c */
    public final void mo133334c() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        Log.m105924i("MicroMsg.Improve.CoverLayout", "reset: ");
        this.f279807e = 1;
        setHeight(getFoldHeight());
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    /* renamed from: d */
    public final void mo133335d(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("updateViewHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        Log.m105924i("MicroMsg.Improve.CoverLayout", "updateViewHeight height:" + i + " newStage:" + i2);
        this.f279807e = 3;
        ObjectAnimator duration = ObjectAnimator.ofInt(this, "height", new int[]{i}).setDuration(250);
        C87412m.m108593f(duration, "ofInt(this, \"height\", he…ation(ANIMATION_DURATION)");
        duration.addListener(new C95874a(i2, this));
        duration.start();
        SnsMethodCalculate.markEndTimeMs("updateViewHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final float getStagePercent() {
        SnsMethodCalculate.markStartTimeMs("getStagePercent", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int a = mo133331a() - getFoldHeight();
        float f = 1.0f;
        if (a == 0) {
            SnsMethodCalculate.markEndTimeMs("getStagePercent", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
            return 1.0f;
        }
        int foldHeight = getLayoutParams().height - getFoldHeight();
        float f2 = (((float) foldHeight) * 1.0f) / ((float) a);
        if (f2 < 1.0f) {
            f = f2 <= 0.0f ? 0.0f : f2;
        }
        Log.m105924i("MicroMsg.Improve.CoverLayout", "getStagePercent: percent=" + f + ", current=" + foldHeight + ", maxDistance=" + a);
        SnsMethodCalculate.markEndTimeMs("getStagePercent", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return f;
    }

    public final ICoverStatusChanged getStatusChangedCallback() {
        SnsMethodCalculate.markStartTimeMs("getStatusChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        ICoverStatusChanged iCoverStatusChanged = this.f279808f;
        SnsMethodCalculate.markEndTimeMs("getStatusChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return iCoverStatusChanged;
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        super.onConfigurationChanged(configuration);
        StringBuilder sb = new StringBuilder();
        sb.append("onConfigurationChanged: orientation=");
        sb.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        Log.m105924i("MicroMsg.Improve.CoverLayout", sb.toString());
        this.f279807e = 1;
        setHeight(getFoldHeight());
        ICoverStatusChanged iCoverStatusChanged = this.f279808f;
        if (iCoverStatusChanged != null) {
            iCoverStatusChanged.onPreClose();
        }
        ICoverStatusChanged iCoverStatusChanged2 = this.f279808f;
        if (iCoverStatusChanged2 != null) {
            iCoverStatusChanged2.onPostClose();
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int a = (mo133331a() - (i4 - i2)) / 2;
            childAt.layout(i, -a, i3, a + i4);
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt != null ? childAt.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = mo133331a();
        }
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setHeight(int i) {
        SnsMethodCalculate.markStartTimeMs("setHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        Log.m105924i("MicroMsg.Improve.CoverLayout", "setHeight: " + i);
        getLayoutParams().height = i;
        requestLayout();
        SnsMethodCalculate.markEndTimeMs("setHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setStatusChangedCallback(ICoverStatusChanged iCoverStatusChanged) {
        SnsMethodCalculate.markStartTimeMs("setStatusChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        this.f279808f = iCoverStatusChanged;
        SnsMethodCalculate.markEndTimeMs("setStatusChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsImproveCoverLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setOnClickListener(new C92310a(this));
    }
}
