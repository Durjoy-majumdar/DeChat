package com.tencent.p014mm.plugin.radar.p091ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarSpecialSmoothScrollView */
public class RadarSpecialSmoothScrollView extends ScrollView {

    /* renamed from: d */
    public RadarSpecialTableLayout f20351d;

    /* renamed from: e */
    public float f20352e;

    /* renamed from: f */
    public final Rect f20353f = new Rect();

    /* renamed from: g */
    public TranslateAnimation f20354g;

    /* renamed from: h */
    public final C5031a f20355h = new C5031a();

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarSpecialSmoothScrollView$a */
    public static final class C5031a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * (((((float) 1) + 1.3f) * f2) + 1.3f)) + 1.0f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarSpecialSmoothScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public void onFinishInflate() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            this.f20351d = childAt instanceof RadarSpecialTableLayout ? (RadarSpecialTableLayout) childAt : null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        if (this.f20351d == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20352e = motionEvent.getY();
        } else if (action == 1) {
            this.f20352e = 0.0f;
            if (!this.f20353f.isEmpty()) {
                RadarSpecialTableLayout radarSpecialTableLayout = this.f20351d;
                C87412m.m108591d(radarSpecialTableLayout);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (radarSpecialTableLayout.getTop() - this.f20353f.top), 0.0f);
                this.f20354g = translateAnimation;
                translateAnimation.setInterpolator(this.f20355h);
                TranslateAnimation translateAnimation2 = this.f20354g;
                C87412m.m108591d(translateAnimation2);
                RadarSpecialTableLayout radarSpecialTableLayout2 = this.f20351d;
                C87412m.m108591d(radarSpecialTableLayout2);
                translateAnimation2.setDuration((long) Math.abs(radarSpecialTableLayout2.getTop() - this.f20353f.top));
                RadarSpecialTableLayout radarSpecialTableLayout3 = this.f20351d;
                C87412m.m108591d(radarSpecialTableLayout3);
                radarSpecialTableLayout3.startAnimation(this.f20354g);
                RadarSpecialTableLayout radarSpecialTableLayout4 = this.f20351d;
                C87412m.m108591d(radarSpecialTableLayout4);
                Rect rect = this.f20353f;
                int i = rect.left;
                int i2 = rect.top;
                int i3 = rect.right;
                int i4 = rect.bottom;
                radarSpecialTableLayout4.f20356d = true;
                radarSpecialTableLayout4.layout(i, i2, i3, i4);
                this.f20353f.setEmpty();
            }
        } else if (action == 2) {
            float y = motionEvent.getY();
            if (this.f20352e == 0.0f) {
                this.f20352e = y;
            }
            RadarSpecialTableLayout radarSpecialTableLayout5 = this.f20351d;
            C87412m.m108591d(radarSpecialTableLayout5);
            int measuredHeight = radarSpecialTableLayout5.getMeasuredHeight() - getHeight();
            int scrollY = getScrollY();
            if (scrollY == 0 || scrollY == measuredHeight) {
                int i5 = (int) (this.f20352e - y);
                scrollBy(0, i5);
                if (this.f20353f.isEmpty()) {
                    Rect rect2 = this.f20353f;
                    RadarSpecialTableLayout radarSpecialTableLayout6 = this.f20351d;
                    C87412m.m108591d(radarSpecialTableLayout6);
                    int left = radarSpecialTableLayout6.getLeft();
                    RadarSpecialTableLayout radarSpecialTableLayout7 = this.f20351d;
                    C87412m.m108591d(radarSpecialTableLayout7);
                    int top = radarSpecialTableLayout7.getTop();
                    RadarSpecialTableLayout radarSpecialTableLayout8 = this.f20351d;
                    C87412m.m108591d(radarSpecialTableLayout8);
                    int right = radarSpecialTableLayout8.getRight();
                    RadarSpecialTableLayout radarSpecialTableLayout9 = this.f20351d;
                    C87412m.m108591d(radarSpecialTableLayout9);
                    rect2.set(left, top, right, radarSpecialTableLayout9.getBottom());
                }
                RadarSpecialTableLayout radarSpecialTableLayout10 = this.f20351d;
                C87412m.m108591d(radarSpecialTableLayout10);
                RadarSpecialTableLayout radarSpecialTableLayout11 = this.f20351d;
                C87412m.m108591d(radarSpecialTableLayout11);
                int left2 = radarSpecialTableLayout11.getLeft();
                RadarSpecialTableLayout radarSpecialTableLayout12 = this.f20351d;
                C87412m.m108591d(radarSpecialTableLayout12);
                int i6 = i5 / 2;
                RadarSpecialTableLayout radarSpecialTableLayout13 = this.f20351d;
                C87412m.m108591d(radarSpecialTableLayout13);
                int right2 = radarSpecialTableLayout13.getRight();
                RadarSpecialTableLayout radarSpecialTableLayout14 = this.f20351d;
                C87412m.m108591d(radarSpecialTableLayout14);
                radarSpecialTableLayout10.f20356d = true;
                radarSpecialTableLayout10.layout(left2, radarSpecialTableLayout12.getTop() - i6, right2, radarSpecialTableLayout14.getBottom() - i6);
            } else {
                scrollBy(0, ((int) (this.f20352e - y)) / 2);
            }
            this.f20352e = y;
        }
        return super.onTouchEvent(motionEvent);
    }
}
