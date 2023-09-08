package com.tencent.p014mm.plugin.sns.p106ui.improve.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.QFadeImageView;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC;
import com.tencent.p014mm.plugin.sns.p106ui.improve.cover.SnsImproveCoverLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13598b0;
import ut2.C102106t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveOverScrollView;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function0;", "Lrx3/b0;", "g", "Lfy3/a;", "getRefreshCallback", "()Lfy3/a;", "setRefreshCallback", "(Lfy3/a;)V", "refreshCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView */
public final class ImproveOverScrollView extends RelativeLayout {

    /* renamed from: y */
    public static final /* synthetic */ int f279881y = 0;

    /* renamed from: d */
    public final ArrayList<C95894a> f279882d = new ArrayList<>();

    /* renamed from: e */
    public final int f279883e = C76577a.m92155f(getContext(), C0966R.dimen.f3711c4);

    /* renamed from: f */
    public final int f279884f = C76577a.m92155f(getContext(), C0966R.dimen.f357038a60);

    /* renamed from: g */
    public C32224a<C13598b0> f279885g;

    /* renamed from: h */
    public View f279886h;

    /* renamed from: i */
    public final Rect f279887i = new Rect();

    /* renamed from: j */
    public RecyclerView f279888j;

    /* renamed from: n */
    public View f279889n;

    /* renamed from: o */
    public QFadeImageView f279890o;

    /* renamed from: p */
    public SnsImproveCoverLayout f279891p;

    /* renamed from: q */
    public boolean f279892q;

    /* renamed from: r */
    public float f279893r;

    /* renamed from: s */
    public boolean f279894s;

    /* renamed from: t */
    public ObjectAnimator f279895t;

    /* renamed from: u */
    public ObjectAnimator f279896u;

    /* renamed from: v */
    public boolean f279897v;

    /* renamed from: w */
    public boolean f279898w;

    /* renamed from: x */
    public float f279899x;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$a */
    public interface C95894a {
        /* renamed from: Z1 */
        boolean mo133284Z1(MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$b */
    public static final class C95895b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveOverScrollView f279900d;

        public C95895b(ImproveOverScrollView improveOverScrollView) {
            this.f279900d = improveOverScrollView;
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$hideTopLoadingView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$hideTopLoadingView$1");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$hideTopLoadingView$1");
            ImproveOverScrollView improveOverScrollView = this.f279900d;
            int i = ImproveOverScrollView.f279881y;
            SnsMethodCalculate.markStartTimeMs("access$setShouldExecHideAnimation$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
            improveOverScrollView.f279897v = false;
            SnsMethodCalculate.markEndTimeMs("access$setShouldExecHideAnimation$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
            ImproveOverScrollView improveOverScrollView2 = this.f279900d;
            SnsMethodCalculate.markStartTimeMs("access$setLastOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
            improveOverScrollView2.f279899x = 0.0f;
            SnsMethodCalculate.markEndTimeMs("access$setLastOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$hideTopLoadingView$1");
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$hideTopLoadingView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$hideTopLoadingView$1");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$hideTopLoadingView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$hideTopLoadingView$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveOverScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo133377a() {
        SnsMethodCalculate.markStartTimeMs("directShowTopLoading", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        QFadeImageView qFadeImageView = this.f279890o;
        if (qFadeImageView != null) {
            qFadeImageView.setTranslationY((float) this.f279883e);
        }
        mo133379c();
        C32224a<C13598b0> aVar = this.f279885g;
        if (aVar != null) {
            aVar.invoke();
        }
        SnsMethodCalculate.markEndTimeMs("directShowTopLoading", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* renamed from: b */
    public final void mo133378b() {
        SnsMethodCalculate.markStartTimeMs("hideTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        Log.m105924i("MicroMsg.Improve.OverScrollView", "hideTopLoadingView: ");
        this.f279897v = true;
        this.f279898w = false;
        ObjectAnimator objectAnimator = this.f279895t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f279895t = null;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f279890o, "translationY", new float[]{(float) this.f279884f});
        this.f279896u = ofFloat;
        if (ofFloat != null) {
            ofFloat.addListener(new C95895b(this));
        }
        ObjectAnimator objectAnimator2 = this.f279896u;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(700);
        }
        ObjectAnimator objectAnimator3 = this.f279896u;
        if (objectAnimator3 != null) {
            objectAnimator3.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator4 = this.f279896u;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
        SnsMethodCalculate.markEndTimeMs("hideTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* renamed from: c */
    public final void mo133379c() {
        SnsMethodCalculate.markStartTimeMs("showTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        if (this.f279895t != null) {
            SnsMethodCalculate.markEndTimeMs("showTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
            return;
        }
        QFadeImageView qFadeImageView = this.f279890o;
        if (qFadeImageView != null) {
            qFadeImageView.setTranslationY((float) this.f279883e);
        }
        QFadeImageView qFadeImageView2 = this.f279890o;
        if (qFadeImageView2 != null) {
            qFadeImageView2.clearAnimation();
        }
        Log.m105924i("MicroMsg.Improve.OverScrollView", "showTopLoadingView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f279890o, "rotation", new float[]{0.0f, 360.0f});
        this.f279895t = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(700);
        }
        ObjectAnimator objectAnimator = this.f279895t;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator2 = this.f279895t;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator3 = this.f279895t;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
        this.f279898w = true;
        SnsMethodCalculate.markEndTimeMs("showTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "dispatchTouchEvent"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 1
            if (r1 != 0) goto L_0x0012
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0012:
            com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout r5 = r0.f279891p
            r6 = 3
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout"
            r8 = 0
            if (r5 == 0) goto L_0x002e
            java.lang.String r9 = "isAnimation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)
            int r5 = r5.f279807e
            if (r5 != r6) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
            if (r5 != r4) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 == 0) goto L_0x0035
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0035:
            int r5 = r18.getAction()
            if (r5 == 0) goto L_0x0299
            r9 = 0
            java.lang.String r10 = "cancelChild"
            if (r5 == r4) goto L_0x01ab
            r11 = 2
            if (r5 == r11) goto L_0x0047
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0047:
            float r5 = r18.getY()
            float r12 = r0.f279893r
            float r5 = r5 - r12
            r12 = 1084227584(0x40a00000, float:5.0)
            java.lang.String r13 = "isExpand"
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x00a8
            java.lang.String r12 = "canPullDown"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r3)
            com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout r14 = r0.f279891p
            if (r14 == 0) goto L_0x0071
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r7)
            int r14 = r14.f279807e
            if (r14 != r11) goto L_0x0069
            r14 = 1
            goto L_0x006a
        L_0x0069:
            r14 = 0
        L_0x006a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r7)
            if (r14 != r4) goto L_0x0071
            r14 = 1
            goto L_0x0072
        L_0x0071:
            r14 = 0
        L_0x0072:
            if (r14 == 0) goto L_0x0078
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r3)
            goto L_0x0091
        L_0x0078:
            androidx.recyclerview.widget.RecyclerView r14 = r0.f279888j
            if (r14 != 0) goto L_0x0080
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r3)
            goto L_0x0091
        L_0x0080:
            android.view.View r15 = r0.f279889n
            if (r15 != 0) goto L_0x0088
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r3)
            goto L_0x0091
        L_0x0088:
            int r16 = r15.getHeight()
            if (r16 > 0) goto L_0x0093
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r3)
        L_0x0091:
            r14 = 0
            goto L_0x00a4
        L_0x0093:
            int r14 = r14.getTop()
            int r15 = r15.getHeight()
            int r14 = r14 - r15
            if (r14 < 0) goto L_0x00a0
            r14 = 1
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r3)
        L_0x00a4:
            if (r14 == 0) goto L_0x00a8
            r12 = 1
            goto L_0x00a9
        L_0x00a8:
            r12 = 0
        L_0x00a9:
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b5
            java.lang.String r14 = "canPullUp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r3)
        L_0x00b5:
            com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout r14 = r0.f279891p
            if (r14 == 0) goto L_0x00ca
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r7)
            int r14 = r14.f279807e
            if (r14 != r11) goto L_0x00c2
            r14 = 1
            goto L_0x00c3
        L_0x00c2:
            r14 = 0
        L_0x00c3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r7)
            if (r14 != r4) goto L_0x00ca
            r13 = 1
            goto L_0x00cb
        L_0x00ca:
            r13 = 0
        L_0x00cb:
            if (r13 == 0) goto L_0x00e7
            if (r9 >= 0) goto L_0x00e7
            com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout r1 = r0.f279891p
            if (r1 == 0) goto L_0x00e3
            java.lang.String r5 = "scrollToFoldCheck"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            int r6 = r1.f279807e
            if (r6 != r11) goto L_0x00e0
            r1.mo133333b()
        L_0x00e0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
        L_0x00e3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x00e7:
            if (r12 != 0) goto L_0x00f9
            float r4 = r18.getY()
            r0.f279893r = r4
            r0.f279892q = r8
            boolean r1 = super.dispatchTouchEvent(r18)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r1
        L_0x00f9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r3)
            r1.setAction(r6)
            super.dispatchTouchEvent(r18)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            float r5 = r5 * r1
            android.view.View r1 = r0.f279886h
            if (r1 == 0) goto L_0x0121
            android.graphics.Rect r6 = r0.f279887i
            int r7 = r6.left
            int r8 = r6.top
            float r8 = (float) r8
            float r8 = r8 + r5
            int r8 = (int) r8
            int r9 = r6.right
            int r6 = r6.bottom
            float r6 = (float) r6
            float r6 = r6 + r5
            int r6 = (int) r6
            r1.layout(r7, r8, r9, r6)
        L_0x0121:
            java.lang.String r1 = "updateTopLoadingImgPosition"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            com.tencent.mm.ui.widget.QFadeImageView r6 = r0.f279890o
            if (r6 == 0) goto L_0x012e
            r6.clearAnimation()
        L_0x012e:
            android.animation.ObjectAnimator r6 = r0.f279896u
            if (r6 == 0) goto L_0x0135
            r6.cancel()
        L_0x0135:
            android.animation.ObjectAnimator r6 = r0.f279895t
            if (r6 == 0) goto L_0x0141
            r6.cancel()
            r6 = 0
            r0.f279895t = r6
            r0.f279898w = r4
        L_0x0141:
            com.tencent.mm.ui.widget.QFadeImageView r6 = r0.f279890o
            if (r6 != 0) goto L_0x0146
            goto L_0x014f
        L_0x0146:
            float r7 = -r5
            r8 = 10
            float r8 = (float) r8
            float r7 = r7 * r8
            r6.setRotation(r7)
        L_0x014f:
            float r6 = r0.f279899x
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0177
            com.tencent.mm.ui.widget.QFadeImageView r6 = r0.f279890o
            gy3.C87412m.m108591d(r6)
            float r6 = r6.getTranslationY()
            int r7 = r0.f279883e
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x01a0
            com.tencent.mm.ui.widget.QFadeImageView r6 = r0.f279890o
            if (r6 != 0) goto L_0x016a
            goto L_0x01a0
        L_0x016a:
            r8 = 1072064102(0x3fe66666, float:1.8)
            float r8 = r8 * r5
            float r7 = java.lang.Math.min(r8, r7)
            r6.setTranslationY(r7)
            goto L_0x01a0
        L_0x0177:
            com.tencent.mm.ui.widget.QFadeImageView r6 = r0.f279890o
            gy3.C87412m.m108591d(r6)
            float r7 = r6.getTranslationY()
            float r8 = r0.f279899x
            float r8 = r5 - r8
            float r7 = r7 + r8
            r6.setTranslationY(r7)
            com.tencent.mm.ui.widget.QFadeImageView r6 = r0.f279890o
            gy3.C87412m.m108591d(r6)
            float r6 = r6.getTranslationY()
            int r7 = r0.f279884f
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x01a0
            com.tencent.mm.ui.widget.QFadeImageView r6 = r0.f279890o
            if (r6 != 0) goto L_0x019d
            goto L_0x01a0
        L_0x019d:
            r6.setTranslationY(r7)
        L_0x01a0:
            r0.f279899x = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            r0.f279892q = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x01ab:
            boolean r5 = r0.f279892q
            if (r5 == 0) goto L_0x0275
            java.lang.String r5 = "recoverLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            android.view.animation.TranslateAnimation r7 = new android.view.animation.TranslateAnimation
            android.view.View r11 = r0.f279886h
            gy3.C87412m.m108591d(r11)
            int r11 = r11.getTop()
            android.graphics.Rect r12 = r0.f279887i
            int r12 = r12.top
            int r11 = r11 - r12
            float r11 = (float) r11
            r7.<init>(r9, r9, r11, r9)
            r11 = 150(0x96, double:7.4E-322)
            r7.setDuration(r11)
            android.view.View r11 = r0.f279886h
            if (r11 == 0) goto L_0x01d5
            r11.startAnimation(r7)
        L_0x01d5:
            android.view.View r7 = r0.f279886h
            if (r7 == 0) goto L_0x01e6
            android.graphics.Rect r11 = r0.f279887i
            int r12 = r11.left
            int r13 = r11.top
            int r14 = r11.right
            int r11 = r11.bottom
            r7.layout(r12, r13, r14, r11)
        L_0x01e6:
            r0.f279892q = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            java.lang.String r5 = "checkTopLoadingImageRotateAnimation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            r0.f279899x = r9
            com.tencent.mm.ui.widget.QFadeImageView r7 = r0.f279890o
            if (r7 == 0) goto L_0x01fa
            float r9 = r7.getTranslationY()
        L_0x01fa:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "checkTopLoadingImageRotateAnimation translateY:"
            r7.append(r11)
            r7.append(r9)
            java.lang.String r11 = " MAX_Y:"
            r7.append(r11)
            int r11 = r0.f279883e
            r7.append(r11)
            java.lang.String r11 = " shouldExecRotateAnimation:"
            r7.append(r11)
            boolean r11 = r0.f279898w
            r7.append(r11)
            java.lang.String r11 = " rotateAnimator:"
            r7.append(r11)
            android.animation.ObjectAnimator r11 = r0.f279895t
            r7.append(r11)
            java.lang.String r11 = " shouldExecHideAnimation:"
            r7.append(r11)
            boolean r11 = r0.f279897v
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            java.lang.String r11 = "MicroMsg.Improve.OverScrollView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            int r7 = r0.f279883e
            float r7 = (float) r7
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x024a
            float r7 = r17.getTranslationY()
            int r9 = r0.f279883e
            float r9 = (float) r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L_0x024e
        L_0x024a:
            boolean r7 = r0.f279897v
            if (r7 == 0) goto L_0x0255
        L_0x024e:
            r17.mo133378b()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L_0x0275
        L_0x0255:
            boolean r7 = r0.f279898w
            if (r7 == 0) goto L_0x0260
            r17.mo133379c()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L_0x0275
        L_0x0260:
            android.animation.ObjectAnimator r7 = r0.f279895t
            if (r7 == 0) goto L_0x0268
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L_0x0275
        L_0x0268:
            r17.mo133379c()
            fy3.a<rx3.b0> r7 = r0.f279885g
            if (r7 == 0) goto L_0x0272
            r7.invoke()
        L_0x0272:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L_0x0275:
            boolean r5 = r0.f279894s
            if (r5 == 0) goto L_0x0285
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r3)
            r1.setAction(r6)
            super.dispatchTouchEvent(r18)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
        L_0x0285:
            boolean r5 = r0.f279892q
            if (r5 != 0) goto L_0x0295
            boolean r5 = r0.f279894s
            if (r5 != 0) goto L_0x0295
            boolean r1 = super.dispatchTouchEvent(r18)
            if (r1 == 0) goto L_0x0294
            goto L_0x0295
        L_0x0294:
            r4 = 0
        L_0x0295:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0299:
            float r4 = r18.getY()
            r0.f279893r = r4
            r0.f279894s = r8
            java.util.ArrayList<com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$a> r4 = r0.f279882d
            java.util.Iterator r4 = r4.iterator()
        L_0x02a7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02bd
            java.lang.Object r5 = r4.next()
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView$a r5 = (com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveOverScrollView.C95894a) r5
            boolean r6 = r0.f279894s
            boolean r5 = r5.mo133284Z1(r1)
            r5 = r5 | r6
            r0.f279894s = r5
            goto L_0x02a7
        L_0x02bd:
            boolean r1 = super.dispatchTouchEvent(r18)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveOverScrollView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final C32224a<C13598b0> getRefreshCallback() {
        SnsMethodCalculate.markStartTimeMs("getRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        C32224a<C13598b0> aVar = this.f279885g;
        SnsMethodCalculate.markEndTimeMs("getRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        return aVar;
    }

    public void onFinishInflate() {
        SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        super.onFinishInflate();
        this.f279886h = getChildAt(0);
        this.f279888j = (RecyclerView) findViewById(C0966R.C0970id.oez);
        this.f279889n = findViewById(C0966R.C0970id.f6071wh);
        this.f279891p = (SnsImproveCoverLayout) findViewById(C0966R.C0970id.oew);
        SnsMethodCalculate.markStartTimeMs("setupTopLoadingImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        QFadeImageView qFadeImageView = (QFadeImageView) findViewById(C0966R.C0970id.jvi);
        this.f279890o = qFadeImageView;
        if (qFadeImageView != null) {
            qFadeImageView.setScaleType(QImageView.C97274a.MATRIX);
        }
        QFadeImageView qFadeImageView2 = this.f279890o;
        if (qFadeImageView2 != null) {
            qFadeImageView2.setImageResource(C0966R.raw.friendactivity_refresh);
        }
        SnsMethodCalculate.markEndTimeMs("setupTopLoadingImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        ArrayList<C95894a> arrayList = this.f279882d;
        C39818r rVar = C39818r.f106831a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        arrayList.add(rVar.mo62443b(context).mo75002a(ImproveInputUIC.class));
        ArrayList<C95894a> arrayList2 = this.f279882d;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        arrayList2.add(rVar.mo62443b(context2).mo75002a(C102106t.class));
        SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f279886h;
        if (view != null) {
            this.f279887i.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public final void setRefreshCallback(C32224a<C13598b0> aVar) {
        SnsMethodCalculate.markStartTimeMs("setRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        this.f279885g = aVar;
        SnsMethodCalculate.markEndTimeMs("setRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveOverScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
