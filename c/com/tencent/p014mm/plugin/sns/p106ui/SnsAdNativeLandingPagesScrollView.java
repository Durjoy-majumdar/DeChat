package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView */
public class SnsAdNativeLandingPagesScrollView extends NestedScrollView {

    /* renamed from: I */
    public int f316318I = 0;

    /* renamed from: J */
    public int f316319J = 0;

    /* renamed from: K */
    public int f316320K = 50;

    /* renamed from: L */
    public Runnable f316321L;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView$a */
    public class C106167a implements Runnable {
        public C106167a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView$1");
            int scrollY = SnsAdNativeLandingPagesScrollView.this.getScrollY();
            Log.m105929w("SnsAdNativeLandingPagesScrollView", "1 middlePos %d, newPos %d", Integer.valueOf(SnsAdNativeLandingPagesScrollView.m142832t(SnsAdNativeLandingPagesScrollView.this)), Integer.valueOf(scrollY));
            if (scrollY != SnsAdNativeLandingPagesScrollView.m142832t(SnsAdNativeLandingPagesScrollView.this)) {
                if (SnsAdNativeLandingPagesScrollView.m142833w(SnsAdNativeLandingPagesScrollView.this) != null) {
                    C106168a3 w = SnsAdNativeLandingPagesScrollView.m142833w(SnsAdNativeLandingPagesScrollView.this);
                    SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView = SnsAdNativeLandingPagesScrollView.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
                    int i = snsAdNativeLandingPagesScrollView.f316318I;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
                    w.mo152007a(snsAdNativeLandingPagesScrollView, 0, scrollY, 0, i);
                }
                SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView2 = SnsAdNativeLandingPagesScrollView.this;
                System.currentTimeMillis();
                SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
                snsAdNativeLandingPagesScrollView2.getClass();
                SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            }
            if (SnsAdNativeLandingPagesScrollView.m142832t(SnsAdNativeLandingPagesScrollView.this) - scrollY == 0) {
                if (SnsAdNativeLandingPagesScrollView.m142833w(SnsAdNativeLandingPagesScrollView.this) != null) {
                    C106168a3 w2 = SnsAdNativeLandingPagesScrollView.m142833w(SnsAdNativeLandingPagesScrollView.this);
                    int t = SnsAdNativeLandingPagesScrollView.m142832t(SnsAdNativeLandingPagesScrollView.this);
                    SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView3 = SnsAdNativeLandingPagesScrollView.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
                    int i2 = snsAdNativeLandingPagesScrollView3.f316318I;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
                    w2.mo152009c(t, i2);
                }
                SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView4 = SnsAdNativeLandingPagesScrollView.this;
                int t2 = SnsAdNativeLandingPagesScrollView.m142832t(snsAdNativeLandingPagesScrollView4);
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
                snsAdNativeLandingPagesScrollView4.f316318I = t2;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            }
            SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView5 = SnsAdNativeLandingPagesScrollView.this;
            int scrollY2 = snsAdNativeLandingPagesScrollView5.getScrollY();
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            snsAdNativeLandingPagesScrollView5.f316319J = scrollY2;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            Log.m105929w("SnsAdNativeLandingPagesScrollView", "2 middlePos %d, newPos %d", Integer.valueOf(SnsAdNativeLandingPagesScrollView.m142832t(SnsAdNativeLandingPagesScrollView.this)), Integer.valueOf(scrollY));
            SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView6 = SnsAdNativeLandingPagesScrollView.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            Runnable runnable = snsAdNativeLandingPagesScrollView6.f316321L;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView7 = SnsAdNativeLandingPagesScrollView.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            int i3 = snsAdNativeLandingPagesScrollView7.f316320K;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            snsAdNativeLandingPagesScrollView6.postDelayed(runnable, (long) i3);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView$1");
        }
    }

    public SnsAdNativeLandingPagesScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        System.currentTimeMillis();
        this.f316321L = new C106167a();
    }

    /* renamed from: t */
    public static /* synthetic */ int m142832t(SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        int i = snsAdNativeLandingPagesScrollView.f316319J;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        return i;
    }

    /* renamed from: w */
    public static /* synthetic */ C106168a3 m142833w(SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        snsAdNativeLandingPagesScrollView.getClass();
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        return null;
    }

    /* renamed from: e */
    public void mo144969e(int i) {
        SnsMethodCalculate.markStartTimeMs("fling", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.mo144969e(i / 3);
        SnsMethodCalculate.markEndTimeMs("fling", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        return onInterceptTouchEvent;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.onScrollChanged(i, i2, i3, i4);
        Log.m105929w("SnsAdNativeLandingPagesScrollView", "onScrollChanged x %d,y %d,oldx %d,oldy %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        SnsMethodCalculate.markEndTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    public void scrollBy(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("scrollBy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.scrollBy(i, i2);
        SnsMethodCalculate.markEndTimeMs("scrollBy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    public void scrollTo(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("scrollTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        super.scrollTo(i, i2);
        SnsMethodCalculate.markEndTimeMs("scrollTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    public void setScrollViewListener(C106168a3 a3Var) {
        SnsMethodCalculate.markStartTimeMs("setScrollViewListener", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        SnsMethodCalculate.markEndTimeMs("setScrollViewListener", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
    }

    public SnsAdNativeLandingPagesScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        System.currentTimeMillis();
        this.f316321L = new C106167a();
    }
}
