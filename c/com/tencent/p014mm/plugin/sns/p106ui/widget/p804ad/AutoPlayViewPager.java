package com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager */
public class AutoPlayViewPager extends ViewPager {
    private static final String TAG = "AutoPlayViewPager";
    private ValueAnimator animator;
    private boolean autoCarousel;
    public int mLastOffset;
    private ViewPagerControlView pagerControlView;
    public int scrollTime;
    public int scrollTimeInterval;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$a */
    public class C96304a implements ValueAnimator.AnimatorUpdateListener {
        public C96304a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$1");
            if (AutoPlayViewPager.this.isFakeDragging()) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                AutoPlayViewPager autoPlayViewPager = AutoPlayViewPager.this;
                autoPlayViewPager.fakeDragBy((float) (autoPlayViewPager.mLastOffset - intValue));
                AutoPlayViewPager.this.mLastOffset = intValue;
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$b */
    public class C96305b extends AnimatorListenerAdapter {
        public C96305b() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$2");
            super.onAnimationEnd(animator);
            if (AutoPlayViewPager.this.isFakeDragging()) {
                AutoPlayViewPager.this.endFakeDrag();
                AutoPlayViewPager autoPlayViewPager = AutoPlayViewPager.this;
                autoPlayViewPager.mLastOffset = 0;
                autoPlayViewPager.startAutoPlay();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$c */
    public class C96306c implements ValueAnimator.AnimatorUpdateListener {
        public C96306c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$3");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewPagerControlView access$000 = AutoPlayViewPager.access$000(AutoPlayViewPager.this);
            access$000.getClass();
            SnsMethodCalculate.markStartTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            access$000.f281618z = floatValue;
            SnsMethodCalculate.markEndTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            AutoPlayViewPager.access$000(AutoPlayViewPager.this).invalidate();
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$d */
    public class C96307d extends AnimatorListenerAdapter {
        public C96307d() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$4");
            super.onAnimationEnd(animator);
            AutoPlayViewPager.this.scrollToNextPage();
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$4");
        }
    }

    public AutoPlayViewPager(Context context) {
        this(context, (AttributeSet) null);
    }

    public static /* synthetic */ ViewPagerControlView access$000(AutoPlayViewPager autoPlayViewPager) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        ViewPagerControlView viewPagerControlView = autoPlayViewPager.pagerControlView;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        return viewPagerControlView;
    }

    public void bindViewPagerControlView(ViewPagerControlView viewPagerControlView, boolean z) {
        SnsMethodCalculate.markStartTimeMs("bindViewPagerControlView", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.pagerControlView = viewPagerControlView;
        this.autoCarousel = z;
        SnsMethodCalculate.markEndTimeMs("bindViewPagerControlView", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2 != 3) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "onTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r5.getActionMasked()
            if (r2 == 0) goto L_0x001c
            r3 = 1
            if (r2 == r3) goto L_0x0018
            r3 = 2
            if (r2 == r3) goto L_0x001c
            r3 = 3
            if (r2 == r3) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            r4.startAutoPlay()
            goto L_0x001f
        L_0x001c:
            r4.pauseAutoPlay()
        L_0x001f:
            boolean r5 = super.onTouchEvent(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.AutoPlayViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void pauseAutoPlay() {
        SnsMethodCalculate.markStartTimeMs("pauseAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (this.autoCarousel) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.pause();
            } else {
                Log.m105920e(TAG, "animator is null when pauseAutoPlay");
            }
        }
        SnsMethodCalculate.markEndTimeMs("pauseAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public void scrollToNextPage() {
        SnsMethodCalculate.markStartTimeMs("scrollToNextPage", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (isFakeDragging()) {
            SnsMethodCalculate.markEndTimeMs("scrollToNextPage", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
            return;
        }
        beginFakeDrag();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, getWidth()});
        ofInt.setDuration((long) this.scrollTime);
        ofInt.addUpdateListener(new C96304a());
        ofInt.addListener(new C96305b());
        ofInt.start();
        SnsMethodCalculate.markEndTimeMs("scrollToNextPage", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public void setScrollTime(int i) {
        SnsMethodCalculate.markStartTimeMs("setScrollTime", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.scrollTime = i;
        SnsMethodCalculate.markEndTimeMs("setScrollTime", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public void setScrollTimeInterval(int i) {
        SnsMethodCalculate.markStartTimeMs("setScrollTimeInterval", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        this.scrollTimeInterval = i;
        SnsMethodCalculate.markEndTimeMs("setScrollTimeInterval", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public void startAutoPlay() {
        SnsMethodCalculate.markStartTimeMs("startAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
        if (this.autoCarousel) {
            if (this.animator == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                this.animator = ofFloat;
                ofFloat.setDuration((long) this.scrollTimeInterval);
                this.animator.addUpdateListener(new C96306c());
                this.animator.addListener(new C96307d());
            }
            this.animator.start();
        } else {
            ViewPagerControlView viewPagerControlView = this.pagerControlView;
            viewPagerControlView.getClass();
            SnsMethodCalculate.markStartTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            viewPagerControlView.f281618z = 1.0f;
            SnsMethodCalculate.markEndTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            this.pagerControlView.invalidate();
        }
        SnsMethodCalculate.markEndTimeMs("startAutoPlay", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager");
    }

    public AutoPlayViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastOffset = 0;
        this.scrollTime = 1000;
        this.scrollTimeInterval = 4000;
        this.autoCarousel = false;
    }
}
