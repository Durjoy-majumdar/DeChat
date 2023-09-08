package com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95087f0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import hv2.C98546b;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout */
public class OverScrollLinearout extends LinearLayout {

    /* renamed from: d */
    public C96308a f281592d;

    /* renamed from: e */
    public boolean f281593e;

    /* renamed from: f */
    public Scroller f281594f;

    /* renamed from: g */
    public int f281595g;

    /* renamed from: h */
    public int f281596h;

    /* renamed from: i */
    public int f281597i;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout$a */
    public interface C96308a {
    }

    public OverScrollLinearout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        this.f281594f = new Scroller(context);
        this.f281595g = ViewConfiguration.get(context).getScaledTouchSlop();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        int action = motionEvent.getAction();
        int y = (int) motionEvent.getY();
        int rawY = (int) motionEvent.getRawY();
        boolean z = false;
        if (action == 0) {
            this.f281593e = false;
            this.f281596h = y;
            this.f281597i = rawY;
            C96308a aVar = this.f281592d;
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                ContentFragment contentFragment = ContentFragment.this;
                int i = ContentFragment.f276480P;
                SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment.f276493M = false;
                SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                SnsMethodCalculate.markEndTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
            }
        } else if (action == 2) {
            C96308a aVar2 = this.f281592d;
            if (aVar2 != null) {
                ContentFragment.C95268b bVar = (ContentFragment.C95268b) aVar2;
                SnsMethodCalculate.markStartTimeMs("canPullOverUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                int Q = ContentFragment.this.mo131806Q();
                ContentFragment contentFragment2 = ContentFragment.this;
                SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                LinearLayoutManager linearLayoutManager = contentFragment2.f276505q;
                SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                int E = linearLayoutManager.mo16959E();
                boolean canScrollVertically = ContentFragment.this.mo131809T().canScrollVertically(1);
                C95295z G4 = ContentFragment.m121304L(ContentFragment.this).mo142109G4();
                ContentFragment contentFragment3 = ContentFragment.this;
                SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                boolean z2 = contentFragment3.f276501j;
                SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (!z2 || canScrollVertically || E != ContentFragment.m121304L(ContentFragment.this).getItemCount() - 1 || (Q <= 0 && !(G4 instanceof C95087f0))) {
                    SnsMethodCalculate.markEndTimeMs("canPullOverUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                } else {
                    SnsMethodCalculate.markEndTimeMs("canPullOverUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                    z = true;
                }
                if (z && this.f281597i - rawY >= this.f281595g) {
                    this.f281593e = true;
                }
            }
        } else if (action == 1 || action == 3) {
            SnsMethodCalculate.markStartTimeMs("smoothScrollBack", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
            this.f281594f.forceFinished(true);
            int scrollY = getScrollY();
            if (scrollY != 0) {
                this.f281594f.startScroll(0, scrollY, 0, -scrollY, 300);
                invalidate();
            }
            SnsMethodCalculate.markEndTimeMs("smoothScrollBack", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        return dispatchTouchEvent;
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        super.onDraw(canvas);
        if (this.f281594f.computeScrollOffset()) {
            scrollTo(0, this.f281594f.getCurrY());
            invalidate();
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        boolean z = this.f281593e;
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        return z;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        super.onScrollChanged(i, i2, i3, i4);
        SnsMethodCalculate.markStartTimeMs("postScrollEventOnAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        postOnAnimation(new C98546b(this, i, i2, i3, i4));
        SnsMethodCalculate.markEndTimeMs("postScrollEventOnAnimation", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        SnsMethodCalculate.markEndTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        int y = (int) motionEvent.getY();
        C96308a aVar = this.f281592d;
        if (aVar != null) {
            ContentFragment.C95268b bVar = (ContentFragment.C95268b) aVar;
            SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
            int i = (int) (((double) ((float) (this.f281596h - y))) * 0.8d);
            if (ContentFragment.m121305M(ContentFragment.this) == null || ContentFragment.m121305M(ContentFragment.this).f276523c == null || ContentFragment.m121305M(ContentFragment.this).f276523c.getScrollY() + i <= 0) {
                SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
            } else {
                int Q = ContentFragment.this.mo131806Q();
                if (Q > 0) {
                    int scrollY = ContentFragment.m121305M(ContentFragment.this).f276523c.getScrollY();
                    if (scrollY < Q) {
                        ContentFragment.m121305M(ContentFragment.this).f276523c.scrollBy(0, Math.min(i, Q - scrollY));
                    }
                    SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                } else {
                    C95295z G4 = ContentFragment.m121304L(ContentFragment.this).mo142109G4();
                    if (!(G4 instanceof C95087f0)) {
                        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                    } else {
                        C95087f0 f0Var = (C95087f0) G4;
                        int scrollY2 = ContentFragment.m121305M(ContentFragment.this).f276523c.getScrollY() + i;
                        f0Var.getClass();
                        SnsMethodCalculate.markStartTimeMs("getMaxScrollUpDis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
                        int i2 = f0Var.f275986w;
                        SnsMethodCalculate.markEndTimeMs("getMaxScrollUpDis", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
                        if (scrollY2 < i2) {
                            ContentFragment.m121305M(ContentFragment.this).f276523c.scrollBy(0, i);
                        } else {
                            ContentFragment contentFragment = ContentFragment.this;
                            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                            boolean z = contentFragment.f276493M;
                            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                            if (!z) {
                                ContentFragment contentFragment2 = ContentFragment.this;
                                SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                                contentFragment2.f276493M = true;
                                SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                                f0Var.mo131594E();
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$11");
                    }
                }
            }
        }
        this.f281596h = y;
        boolean z2 = this.f281593e;
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        return z2;
    }

    public void setOnScrollActionListener(C96308a aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnScrollActionListener", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        this.f281592d = aVar;
        SnsMethodCalculate.markEndTimeMs("setOnScrollActionListener", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }

    public OverScrollLinearout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
        this.f281594f = new Scroller(context);
        this.f281595g = ViewConfiguration.get(context).getScaledTouchSlop();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout");
    }
}
